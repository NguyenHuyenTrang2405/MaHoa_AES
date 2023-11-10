using System;
using System.Collections.Generic;
using System.Text;
using System.Security.Cryptography;
using System.IO;

namespace Ma_Hoa_AES
{
    class Sec_AES
    {
        public Sec_AES()
        {
        }

        //private string aeskey192 = "Nht2007";
        // Mã hóa một mảng byte thành một mảng byte bằng khóa 
        private byte[] Encrypt(byte[] clearData, byte[] Key, byte[] IV)
        {

            // Tạo MemoryStream sẽ chấp nhận các byte được mã hóa
            MemoryStream ms = new MemoryStream();
            AesManaged aes = new AesManaged();
            aes.Key = Key;

            aes.IV = IV;
            //luồng liên kết các luồng dữ liệu với các phép biến đổi mật mã .
            CryptoStream cs = new CryptoStream(ms, aes.CreateEncryptor(), CryptoStreamMode.Write);

            cs.Write(clearData, 0, clearData.Length);
            cs.Close();
            byte[] encryptedData = ms.ToArray();
            return encryptedData;
        }



        /// <summary>
        /// Trả về một chuỗi được mã hóa bằng Rijndael (128,192,256 Bit).
        /// </summary>
        public string Encrypt(string Data,string Password , int Bits)
        {
            //string Password = aeskey192;

            byte[] clearBytes = System.Text.Encoding.Unicode.GetBytes(Data);


            PasswordDeriveBytes pdb = new PasswordDeriveBytes(Password,


                new byte[] { 0x00, 0x01, 0x02, 0x1C, 0x1D, 0x1E, 0x03, 0x04, 0x05, 0x0F, 0x20, 0x21, 0xAD, 0xAF, 0xA4 });


            if (Bits == 128)
            {
                byte[] encryptedData = Encrypt(clearBytes, pdb.GetBytes(16), pdb.GetBytes(16));
                return Convert.ToBase64String(encryptedData);
            }
            else if (Bits == 192)
            {
                byte[] encryptedData = Encrypt(clearBytes, pdb.GetBytes(24), pdb.GetBytes(16));
                return Convert.ToBase64String(encryptedData);
            }
            else if (Bits == 256)
            {
                byte[] encryptedData = Encrypt(clearBytes, pdb.GetBytes(32), pdb.GetBytes(16));
                return Convert.ToBase64String(encryptedData);
            }
            else
            {
                return string.Concat(Bits);
            }
        }

        // Giải mã một mảng byte thành một mảng byte bằng khóa
        private byte[] Decrypt(byte[] cipherData, byte[] Key, byte[] IV)
        {

            MemoryStream ms = new MemoryStream();
            AesManaged aes = new AesManaged();
            aes.Key = Key;

            aes.IV = IV;
            //luồng liên kết các luồng dữ liệu với các phép biến đổi mật mã .
            CryptoStream cs = new CryptoStream(ms, aes.CreateEncryptor(), CryptoStreamMode.Write);
            cs.Write(cipherData, 0, cipherData.Length);
            cs.Close();
            byte[] decryptedData = ms.ToArray();
            return decryptedData;
        }


        /// <summary>
        /// Trả về một chuỗi được giải mã.
        /// </summary>
        // Giải mã một chuỗi thành một chuỗi bằng mật khẩu
        public string Decrypt(string Data,string Password , int Bits)
        {
            //string Password = aeskey192;

            byte[] cipherBytes = Convert.FromBase64String(Data);

            PasswordDeriveBytes pdb = new PasswordDeriveBytes(Password,

                new byte[] { 0x00, 0x01, 0x02, 0x1C, 0x1D, 0x1E, 0x03, 0x04, 0x05, 0x0F, 0x20, 0x21, 0xAD, 0xAF, 0xA4 });

            if (Bits == 128)
            {
                byte[] decryptedData = Decrypt(cipherBytes, pdb.GetBytes(16), pdb.GetBytes(16));
                return System.Text.Encoding.Unicode.GetString(decryptedData);
            }
            else if (Bits == 192)
            {
                byte[] decryptedData = Decrypt(cipherBytes, pdb.GetBytes(24), pdb.GetBytes(16));
                return System.Text.Encoding.Unicode.GetString(decryptedData);
            }
            else if (Bits == 256)
            {
                byte[] decryptedData = Decrypt(cipherBytes, pdb.GetBytes(32), pdb.GetBytes(16));
                return System.Text.Encoding.Unicode.GetString(decryptedData);
            }
            else
            {
                return string.Concat(Bits);
            }

        }
    }
}

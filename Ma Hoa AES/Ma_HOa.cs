using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Text;
using System.Windows.Forms;

namespace Ma_Hoa_AES
{
    public partial class Ma_HOa : Form
    {
        Sec_AES aes = new Sec_AES();
        public Ma_HOa()
        {
            InitializeComponent();
        }

        private void cmdinfo_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Đây là chương trình mã hóa - ", "Chú Ý", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void cmdreset1_Click(object sender, EventArgs e)
        {
            txtencr.Text = "";
            txtreencr.Text = "";
        }

        private void cmdreset2_Click(object sender, EventArgs e)
        {
            txtdecr.Text = "";
            txtrsdecr.Text = "";
        }

        private void cmdmahoa_Click(object sender, EventArgs e)
        {
            if (txtencr.Text != "" || txtkey1.Text!=null)
            {
                try
                {
                    txtreencr.Text = aes.Encrypt(txtencr.Text,txtkey1.Text , 128);
                    MessageBox.Show("Mã hóa thành công");
                }
                catch
                {
                    MessageBox.Show("Không Mã Hóa được", "Chú Ý", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
            else
            {
                MessageBox.Show("Ô Nội Dung không được rỗng", "Chú Ý", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }

        }

        private void cmddecr_Click(object sender, EventArgs e)
        {
            if (txtdecr.Text  != "")
            {
                try
                {
                    txtrsdecr.Text = aes.Decrypt(txtdecr.Text, txtkey2.Text, 128);
                    MessageBox.Show("Giải mã thành công");
                }
                catch
                {
                    MessageBox.Show("Không Giải Mã được", "Chú Ý", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
            else
            {
                MessageBox.Show("Ô Nội Dung không được rỗng", "Chú Ý", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
        }

        private void Ma_HOa_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            if(ofd.ShowDialog() == DialogResult.OK)
            {
                txtencr.Text=File.ReadAllText(ofd.FileName);
                textDialog1.Text=ofd.FileName;
            }
        }

        private void txtdecr_TextChanged(object sender, EventArgs e)
        {

        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            if (ofd.ShowDialog() == DialogResult.OK)
            {
                txtdecr.Text = File.ReadAllText(ofd.FileName);
                textDialog2.Text = ofd.FileName;
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            saveFileDialog1.Filter = "Text file|*.txt | Word|*.docs | All file|*.*"; 
            if (saveFileDialog1.ShowDialog() == DialogResult.OK)
            {
                File.WriteAllText(saveFileDialog1.FileName, txtreencr.Text);
                MessageBox.Show("Đã lưu thành công");
            }
        }

        private void txtkey1_TextChanged(object sender, EventArgs e)
        {
        }
    }
}
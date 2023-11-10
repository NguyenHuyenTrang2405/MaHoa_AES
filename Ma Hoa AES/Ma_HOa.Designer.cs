namespace Ma_Hoa_AES
{
    partial class Ma_HOa
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Ma_HOa));
            this.label4 = new System.Windows.Forms.Label();
            this.txtrsdecr = new System.Windows.Forms.TextBox();
            this.txtkey1 = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.txtreencr = new System.Windows.Forms.TextBox();
            this.txtencr = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.cmdmahoa = new System.Windows.Forms.Button();
            this.cmdreset1 = new System.Windows.Forms.Button();
            this.cmdreset2 = new System.Windows.Forms.Button();
            this.cmddecr = new System.Windows.Forms.Button();
            this.cmdinfo = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.txtdecr = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.txtkey2 = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.textDialog1 = new System.Windows.Forms.TextBox();
            this.textDialog2 = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.saveFileDialog1 = new System.Windows.Forms.SaveFileDialog();
            this.button3 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(39, 537);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(71, 22);
            this.label4.TabIndex = 7;
            this.label4.Text = "Kết quả";
            // 
            // txtrsdecr
            // 
            this.txtrsdecr.Location = new System.Drawing.Point(127, 534);
            this.txtrsdecr.Multiline = true;
            this.txtrsdecr.Name = "txtrsdecr";
            this.txtrsdecr.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtrsdecr.Size = new System.Drawing.Size(587, 62);
            this.txtrsdecr.TabIndex = 6;
            // 
            // txtkey1
            // 
            this.txtkey1.Location = new System.Drawing.Point(127, 193);
            this.txtkey1.Name = "txtkey1";
            this.txtkey1.Size = new System.Drawing.Size(587, 30);
            this.txtkey1.TabIndex = 2;
            this.txtkey1.TextChanged += new System.EventHandler(this.txtkey1_TextChanged);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(39, 201);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(52, 22);
            this.label6.TabIndex = 4;
            this.label6.Text = "Khóa";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(42, 260);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(71, 22);
            this.label3.TabIndex = 3;
            this.label3.Text = "Kết quả";
            // 
            // txtreencr
            // 
            this.txtreencr.Location = new System.Drawing.Point(127, 238);
            this.txtreencr.Multiline = true;
            this.txtreencr.Name = "txtreencr";
            this.txtreencr.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtreencr.Size = new System.Drawing.Size(587, 62);
            this.txtreencr.TabIndex = 3;
            // 
            // txtencr
            // 
            this.txtencr.Location = new System.Drawing.Point(127, 140);
            this.txtencr.Name = "txtencr";
            this.txtencr.Size = new System.Drawing.Size(587, 30);
            this.txtencr.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(39, 143);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(82, 22);
            this.label2.TabIndex = 0;
            this.label2.Text = "Nội dung";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Times New Roman", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(198, 26);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(410, 38);
            this.label1.TabIndex = 3;
            this.label1.Text = "MÃ HÓA - GIẢI MÃ AES ";
            // 
            // cmdmahoa
            // 
            this.cmdmahoa.Location = new System.Drawing.Point(247, 306);
            this.cmdmahoa.Name = "cmdmahoa";
            this.cmdmahoa.Size = new System.Drawing.Size(99, 50);
            this.cmdmahoa.TabIndex = 4;
            this.cmdmahoa.Text = "Mã Hóa";
            this.cmdmahoa.UseVisualStyleBackColor = true;
            this.cmdmahoa.Click += new System.EventHandler(this.cmdmahoa_Click);
            // 
            // cmdreset1
            // 
            this.cmdreset1.Location = new System.Drawing.Point(399, 306);
            this.cmdreset1.Name = "cmdreset1";
            this.cmdreset1.Size = new System.Drawing.Size(99, 50);
            this.cmdreset1.TabIndex = 5;
            this.cmdreset1.Text = "Làm Lại";
            this.cmdreset1.UseVisualStyleBackColor = true;
            this.cmdreset1.Click += new System.EventHandler(this.cmdreset1_Click);
            // 
            // cmdreset2
            // 
            this.cmdreset2.Location = new System.Drawing.Point(399, 611);
            this.cmdreset2.Name = "cmdreset2";
            this.cmdreset2.Size = new System.Drawing.Size(99, 50);
            this.cmdreset2.TabIndex = 7;
            this.cmdreset2.Text = "Làm Lại";
            this.cmdreset2.UseVisualStyleBackColor = true;
            this.cmdreset2.Click += new System.EventHandler(this.cmdreset2_Click);
            // 
            // cmddecr
            // 
            this.cmddecr.Location = new System.Drawing.Point(247, 611);
            this.cmddecr.Name = "cmddecr";
            this.cmddecr.Size = new System.Drawing.Size(99, 50);
            this.cmddecr.TabIndex = 6;
            this.cmddecr.Text = "Giải Mã";
            this.cmddecr.UseVisualStyleBackColor = true;
            this.cmddecr.Click += new System.EventHandler(this.cmddecr_Click);
            // 
            // cmdinfo
            // 
            this.cmdinfo.Image = global::Ma_Hoa_AES.Properties.Resources._48_x_48_HELO;
            this.cmdinfo.Location = new System.Drawing.Point(647, 611);
            this.cmdinfo.Name = "cmdinfo";
            this.cmdinfo.Size = new System.Drawing.Size(67, 59);
            this.cmdinfo.TabIndex = 8;
            this.cmdinfo.UseVisualStyleBackColor = true;
            this.cmdinfo.Click += new System.EventHandler(this.cmdinfo_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(614, 91);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(100, 30);
            this.button1.TabIndex = 9;
            this.button1.Text = "Chọn File";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(39, 435);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(82, 22);
            this.label5.TabIndex = 4;
            this.label5.Text = "Nội dung";
            // 
            // txtdecr
            // 
            this.txtdecr.Location = new System.Drawing.Point(127, 435);
            this.txtdecr.Name = "txtdecr";
            this.txtdecr.Size = new System.Drawing.Size(587, 30);
            this.txtdecr.TabIndex = 4;
            this.txtdecr.TextChanged += new System.EventHandler(this.txtdecr_TextChanged);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(39, 487);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(52, 22);
            this.label7.TabIndex = 8;
            this.label7.Text = "Khóa";
            // 
            // txtkey2
            // 
            this.txtkey2.Location = new System.Drawing.Point(127, 484);
            this.txtkey2.Name = "txtkey2";
            this.txtkey2.Size = new System.Drawing.Size(587, 30);
            this.txtkey2.TabIndex = 5;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(42, 91);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(69, 22);
            this.label8.TabIndex = 10;
            this.label8.Text = "Mã hóa";
            // 
            // textDialog1
            // 
            this.textDialog1.Location = new System.Drawing.Point(127, 91);
            this.textDialog1.Name = "textDialog1";
            this.textDialog1.Size = new System.Drawing.Size(481, 30);
            this.textDialog1.TabIndex = 11;
            // 
            // textDialog2
            // 
            this.textDialog2.Location = new System.Drawing.Point(127, 387);
            this.textDialog2.Name = "textDialog2";
            this.textDialog2.Size = new System.Drawing.Size(481, 30);
            this.textDialog2.TabIndex = 12;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(43, 387);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(73, 22);
            this.label9.TabIndex = 13;
            this.label9.Text = "Giải mã";
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(614, 386);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(100, 30);
            this.button2.TabIndex = 14;
            this.button2.Text = "Chọn File";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(534, 306);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(105, 50);
            this.button3.TabIndex = 15;
            this.button3.Text = "Lưu FIle";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // Ma_HOa
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(11F, 22F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(762, 699);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.textDialog2);
            this.Controls.Add(this.textDialog1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.txtencr);
            this.Controls.Add(this.txtkey1);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.txtdecr);
            this.Controls.Add(this.txtreencr);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.txtkey2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.cmdinfo);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.cmdreset2);
            this.Controls.Add(this.txtrsdecr);
            this.Controls.Add(this.cmddecr);
            this.Controls.Add(this.cmdreset1);
            this.Controls.Add(this.cmdmahoa);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Times New Roman", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.MaximizeBox = false;
            this.Name = "Ma_HOa";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Mã Hóa - Giải Mã AES";
            this.Load += new System.EventHandler(this.Ma_HOa_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtreencr;
        private System.Windows.Forms.TextBox txtencr;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtrsdecr;
        private System.Windows.Forms.Button cmdmahoa;
        private System.Windows.Forms.Button cmdreset1;
        private System.Windows.Forms.Button cmdreset2;
        private System.Windows.Forms.Button cmddecr;
        private System.Windows.Forms.Button cmdinfo;
        private System.Windows.Forms.TextBox txtkey1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox txtdecr;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox txtkey2;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox textDialog1;
        private System.Windows.Forms.TextBox textDialog2;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.SaveFileDialog saveFileDialog1;
        private System.Windows.Forms.Button button3;
    }
}
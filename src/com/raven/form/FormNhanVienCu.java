package com.raven.form;

import com.componentfolders.Model.NhanVien;
import com.componentfolders.Repo.NhanVienRepo;
import com.componentfolders.Service.ITF.NhanVienService;
import com.componentfolders.Service.Impl.NhanVienServiceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormNhanVienCu extends javax.swing.JPanel {

    private DefaultTableModel md;
    private ArrayList<NhanVien> list = new ArrayList<>();
    private NhanVienService nvSv = new NhanVienServiceImpl();

    public FormNhanVienCu() {
        initComponents();
        setOpaque(false);
        loadData(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pl_nhanvien = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhoatdonglai = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnexportEXCEL = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txttennv = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtque = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txttaikhoan = new javax.swing.JTextField();
        txtmatkhau = new javax.swing.JTextField();
        cbbchucvu = new javax.swing.JComboBox<>();
        rdnam = new javax.swing.JRadioButton();
        rdnu = new javax.swing.JRadioButton();
        jLabel46 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        txttimnv = new javax.swing.JTextField();
        jButton44 = new javax.swing.JButton();
        panel = new javax.swing.JTabbedPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblluutru = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();

        pl_nhanvien.setBackground(new java.awt.Color(255, 255, 255));
        pl_nhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHỨC NĂNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        btnthem.setBackground(new java.awt.Color(0, 0, 102));
        btnthem.setForeground(new java.awt.Color(255, 255, 255));
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(0, 0, 102));
        btnxoa.setForeground(new java.awt.Color(255, 255, 255));
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnhoatdonglai.setBackground(new java.awt.Color(0, 0, 102));
        btnhoatdonglai.setForeground(new java.awt.Color(255, 255, 255));
        btnhoatdonglai.setText("Hoạt động lại");
        btnhoatdonglai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhoatdonglaiActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(0, 0, 102));
        btnsua.setForeground(new java.awt.Color(255, 255, 255));
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnexportEXCEL.setText("Export Excel");
        btnexportEXCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportEXCELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexportEXCEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnthem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnhoatdonglai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnhoatdonglai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnexportEXCEL)
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 102));
        jLabel40.setText("MÃ NHÂN VIÊN");

        txtmanv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtmanv.setForeground(new java.awt.Color(0, 0, 102));
        txtmanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanvActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 102));
        jLabel41.setText("TÊN NHÂN VIÊN");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 102));
        jLabel42.setText("CHỨC VỤ");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 102));
        jLabel43.setText("GIỚI TÍNH");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 102));
        jLabel44.setText("EMAIL");

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtemail.setForeground(new java.awt.Color(0, 0, 102));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 102));
        jLabel45.setText("QUÊ");

        txtque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtque.setForeground(new java.awt.Color(0, 0, 102));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 102));
        jLabel48.setText("TÀI KHOẢN");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 102));
        jLabel49.setText("MẬT KHẨU");

        txttaikhoan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttaikhoan.setForeground(new java.awt.Color(0, 0, 102));

        txtmatkhau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtmatkhau.setForeground(new java.awt.Color(0, 0, 102));

        cbbchucvu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbchucvu.setForeground(new java.awt.Color(0, 0, 102));
        cbbchucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));

        rdnam.setSelected(true);
        rdnam.setText("Nam");

        rdnu.setText("Nữ");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 102));
        jLabel46.setText("NGÀY SINH");

        jDate.setDateFormatString("yyyy-MM-dd");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbchucvu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdnam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdnu))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(txtque, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txtque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel41)
                        .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel46)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(rdnam)
                    .addComponent(rdnu)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(cbbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BẢNG NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        txttimnv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttimnv.setForeground(new java.awt.Color(0, 0, 102));

        jButton44.setBackground(new java.awt.Color(0, 0, 102));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        panel.setForeground(new java.awt.Color(0, 0, 102));
        panel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tblnhanvien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblnhanvien.setForeground(new java.awt.Color(0, 0, 102));
        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã NV", "Tên NV", "Giới tính", "Chức vụ", "Email", "Quê quán", "Ngày sinh", "Tài khoản", "Mật Khẩu", "Trạng Thái"
            }
        ));
        tblnhanvien.setGridColor(new java.awt.Color(0, 0, 102));
        tblnhanvien.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanvienMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblnhanvien);

        panel.addTab("Nhân viên", jScrollPane7);

        tblluutru.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblluutru.setForeground(new java.awt.Color(0, 0, 102));
        tblluutru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã NV", "Tên NV", "Giới tính", "Chức vụ", "Email", "Quê quán", "Ngày sinh", "Tài khoản", "Mật khẩu", "Trạng Thái"
            }
        ));
        tblluutru.setGridColor(new java.awt.Color(0, 0, 102));
        tblluutru.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jScrollPane11.setViewportView(tblluutru);

        panel.addTab("Lưu trữ", jScrollPane11);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(872, Short.MAX_VALUE)
                .addComponent(txttimnv, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addComponent(panel)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttimnv)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pl_nhanvienLayout = new javax.swing.GroupLayout(pl_nhanvien);
        pl_nhanvien.setLayout(pl_nhanvienLayout);
        pl_nhanvienLayout.setHorizontalGroup(
            pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pl_nhanvienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pl_nhanvienLayout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(304, Short.MAX_VALUE))))
        );
        pl_nhanvienLayout.setVerticalGroup(
            pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl_nhanvienLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pl_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pl_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pl_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadData(ArrayList<NhanVien> list) {
        md = (DefaultTableModel) tblnhanvien.getModel();
        md.setRowCount(0);
        for (NhanVien nhanVien : nvSv.getAll()) {
            md.addRow(new Object[]{
                nhanVien.getId(), nhanVien.getMaNV(), nhanVien.getTen(), nhanVien.getGioiTinh(), nhanVien.getChucVu(), nhanVien.geteMail(), nhanVien.getQueQuan(), nhanVien.getNgaySinh(), nhanVien.getTaiKhoan(), nhanVien.getMatKhau(), nhanVien.getTrangThai()
            });

        }
    }
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        String manv = txtmanv.getText();
        //        if (manv.isBlank()) {
        //            JOptionPane.showMessageDialog(this, "Không bỏ trống các trường.");
        //            return;
        //        }
        //       list  = NhanVienService.
        //        for (NhanVien x : list) {
        //            if (x.getMaNV().equalsIgnoreCase(txtmanv.getText())) {
        //                JOptionPane.showMessageDialog(this, "Không được trùng mà");
        //                return;
        //            }
        //        }
        String tennv = txttennv.getText();

        Boolean gioitinh = false;

        String tencv = cbbchucvu.getSelectedItem().toString();
        String email = txtemail.getText();

        String quequan = txtque.getText();

        Date ngaysinh = jDate.getDate();

        String taikhoan = txttaikhoan.getText();

        String matkhau = txtmatkhau.getText();

        NhanVien nv = new NhanVien();
        nv.setMaNV(manv);
        nv.setTen(tennv);
        nv.setGioiTinh(0);
        nv.setChucVu(0);
        nv.setMatKhau(matkhau);
        nv.setTaiKhoan(taikhoan);

        nv.setNgaySinh(ngaysinh);
        nv.setQueQuan(quequan);
        nvSv.add(nv);
        loadData(list);
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
 int row = tblnhanvien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn vào 1 dòng trên table");
            return;
        }
        String maSV = txtmanv.getText();
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá? ");

        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        }
        if (confirm == JOptionPane.YES_OPTION) {
            nvSv.xoa(Integer.parseInt( txtId.getText()));
            JOptionPane.showMessageDialog(this, "Xoá thành công");
            loadData(list);
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }
        
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnhoatdonglaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhoatdonglaiActionPerformed
//        // TODO add your handling code here:
//                int row = tblluutru.getSelectedRow();
//                if (row == -1) {
//                    return;
//                }
//                NhanVienRepo nhanVienRepository = new NhanVienRepo();
//                NhanVien nhanVien = nhanVienRepository.getOne((String) modelnv1.getValueAt(row, 0).toString());
//                nhanVien.setDeleted(Boolean.FALSE);
//                nhanVienRepository.update(nhanVien);
//                modelnv1.removeRow(row);
//                list1 = nhanvienService.getAllTrue();
//                list2 = nhanvienService.getAllFalse();
//                loadnv1(list1);
//                loadnv2(list2);
//                JOptionPane.showMessageDialog(this, "Hoạt động thành công");
//        loadtable();
    }//GEN-LAST:event_btnhoatdonglaiActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        String tk = txttaikhoan.getText();
        NhanVien nv = new NhanVien();
        nv.setTaiKhoan(tk);
        String mk = txtmatkhau.getText();
        nv.setMatKhau(mk);
        String que = txtque.getText();
        nv.setQueQuan(que);
        String email = txtemail.getText();
        nv.seteMail(email);
        String ma = txtmanv.getText();
        nv.setMaNV(ma);
        String ten = txttennv.getText();
        nv.setTen(ten);
        nv.setId(Integer.parseInt(txtId.getText()));
        if (cbbchucvu.getSelectedItem().equals("Nhân viên")) {
            nv.setChucVu(1);
        } else {
            nv.setChucVu(0);
        }
        if (rdnam.isSelected()) {
            nv.setGioiTinh(0);
        } else {
            nv.setGioiTinh(1);
        }
        nv.setNgaySinh(jDate.getDate());
        nvSv.update(nv);
        loadData(list);
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //        // TODO add your handling code here:
        //        File excelFile;
        //        FileInputStream excelFIS = null;
        //        BufferedInputStream excelBIS = null;
        //        XSSFWorkbook excelJTableImport = null;
        //
        //        String defaultCurrentDirectoryPath = "E:\\Excel";
        //        JFileChooser execlFileChooser = new JFileChooser(defaultCurrentDirectoryPath);
        //
        //        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        //        execlFileChooser.setFileFilter(fnef);
        //
        //        execlFileChooser.setDialogTitle("Select Excel File");
        //        int excelChooser = execlFileChooser.showOpenDialog(null);
        //
        //        if (excelChooser == JFileChooser.APPROVE_OPTION) {
        //            try {
        //                excelFile = execlFileChooser.getSelectedFile();
        //                excelFIS = new FileInputStream(excelFile);
        //                excelBIS = new BufferedInputStream(excelFIS);
        //                excelJTableImport = new XSSFWorkbook(excelBIS);
        //                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);
        //
        //                for (int row = 1; row < excelSheet.getLastRowNum() + 1; row++) {
        //                    XSSFRow excelRow = excelSheet.getRow(row);
        //
        //                    XSSFCell MaNV = excelRow.getCell(0);
        //                    XSSFCell HoTen = excelRow.getCell(1);
        //                    XSSFCell GioiTinh = excelRow.getCell(2);
        //                    XSSFCell ChucVu = excelRow.getCell(3);
        //                    XSSFCell Email = excelRow.getCell(4);
        //                    XSSFCell QueQuan = excelRow.getCell(5);
        //                    XSSFCell NgaySinh = excelRow.getCell(6);
        //                    XSSFCell TaiKhoan = excelRow.getCell(7);
        //                    XSSFCell MatKhau = excelRow.getCell(8);
        //                    XSSFCell TrangThai = excelRow.getCell(9);
        //
        //                    //JTable excelJL = new JTable;
        //                    //modelnv2.addRow(new Object[]{excelMaNV, excelHoTen, excelGioiTinh, excelChucVu, excelEmail, excelQueQuan, excelNgaySinh, excelTaiKhoan, excelMatKhau});
        //                    modelnv2.addRow(new Object[]{MaNV, HoTen, GioiTinh, ChucVu, Email, QueQuan, NgaySinh, TaiKhoan, MatKhau,TrangThai});
        //                    //modelnv2.addRow(new Object[row]);
        //                }
        //                JOptionPane.showMessageDialog(null, "Đã thêm thông tin từ Excel");
        //            } catch (FileNotFoundException ex) {
        //                JOptionPane.showMessageDialog(null, ex.getMessage());
        //            } catch (IOException ex) {
        //                JOptionPane.showMessageDialog(null, ex.getMessage());
        //            } finally {
        //
        //                try {
        //                    if (excelFIS != null) {
        //                        excelFIS.close();
        //                    }
        //                    if (excelBIS != null) {
        //                        excelBIS.close();
        //                    }
        //                    if (excelJTableImport != null) {
        //                        excelJTableImport.close();
        //                    }
        //                } catch (IOException iOException) {
        //                    JOptionPane.showMessageDialog(null, iOException.getMessage());
        //                }
        //            }
        //        }
        //
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnexportEXCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportEXCELActionPerformed
        // TODO add your handling code here:
        //        JFileChooser excelFileChooser = new JFileChooser("C:\\Users\\Admin\\Desktop");
        //        excelFileChooser.setDialogTitle("Save as");
        //        FileNameExtensionFilter filefilter = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
        //        excelFileChooser.setFileFilter(filefilter);
        //        int check = excelFileChooser.showSaveDialog(null);
        //
        //        //Check khi ấn nút save
        //        if (check == JFileChooser.APPROVE_OPTION) {
        //            FileOutputStream FOS = null;
        //            BufferedOutputStream BOS = null;
        //            XSSFWorkbook excelJtableExporter = null;
        //            try {
        //                excelJtableExporter = new XSSFWorkbook();
        //                XSSFSheet excelSheet = excelJtableExporter.createSheet("HoaDon");
        //                //Lấy số dòng, cột tblHoaDon
        //                for (int i = 0; i < tblnhanvien.getRowCount(); i++) {
        //                    XSSFRow excelRow = excelSheet.createRow(i);
        //                    for (int j = 0; j < tblnhanvien.getColumnCount(); j++) {
        //                        XSSFCell excelCell = excelRow.createCell(j);
        //
        //                        excelCell.setCellValue(tblnhanvien.getValueAt(i, j).toString());
        //                    }
        //                }
        //
        //                FOS = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
        //                BOS = new BufferedOutputStream(FOS);
        //                excelJtableExporter.write(BOS);
        //                JOptionPane.showMessageDialog(this, "Xuất Thành Công!!!!");
        //            } catch (FileNotFoundException ex) {
        //                ex.printStackTrace();
        //            } catch (IOException ex) {
        //                ex.printStackTrace();
        //            } finally {
        //                try {
        //                    if (BOS != null) {
        //                        BOS.close();
        //                    }
        //
        //                    if (FOS != null) {
        //                        FOS.close();
        //                    }
        //
        //                    if (excelJtableExporter != null) {
        //                        excelJtableExporter.close();
        //                    }
        //
        //                } catch (IOException ex) {
        //                    ex.printStackTrace();
        //                }
        //            }
        //
        //        }
        //
    }//GEN-LAST:event_btnexportEXCELActionPerformed

    private void txtmanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanvActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        //        String timnv = txttimnv.getText().trim();
        //        listNhanVien = new ArrayList<>();
        //        if(!timnv.equalsIgnoreCase("")){
        //            listnhanvien = nhanvienService.timNV(timnv);
        //        }else{
        //            listnhanvien = nhanvienService.getAllNV();
        //        }
        //        for (NhanVien x : listnhanvien) {
        //            listNhanVien.add(new NhanVienResponse(x));
        //        }
        //        //        loadnv1(list1);
        //        //        loadnv2(list2);
        //        loadtable();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked
        int row = tblnhanvien.getSelectedRow();
        if (row <= -1) {
            return;
        }
        txtemail.setText(tblnhanvien.getValueAt(row, 5).toString());
        txtmanv.setText(tblnhanvien.getValueAt(row, 1).toString());
        txtmatkhau.setText(tblnhanvien.getValueAt(row, 9).toString());
        txtque.setText(tblnhanvien.getValueAt(row, 6).toString());
        txttaikhoan.setText(tblnhanvien.getValueAt(row, 8).toString());
        if (tblnhanvien.getValueAt(row, 3).toString().equals("1")) {
            rdnam.setSelected(true);
        } else {
            rdnu.setSelected(true);
        }


    }//GEN-LAST:event_tblnhanvienMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexportEXCEL;
    private javax.swing.JButton btnhoatdonglai;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbchucvu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton44;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JPanel pl_nhanvien;
    private javax.swing.JRadioButton rdnam;
    private javax.swing.JRadioButton rdnu;
    private javax.swing.JTable tblluutru;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtmatkhau;
    private javax.swing.JTextField txtque;
    private javax.swing.JTextField txttaikhoan;
    private javax.swing.JTextField txttennv;
    private javax.swing.JTextField txttimnv;
    // End of variables declaration//GEN-END:variables
}

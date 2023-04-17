package com.raven.form;

import com.componentfolders.Model.NhanVien;
import com.componentfolders.Repo.NhanVienRepo;
import com.componentfolders.Service.ITF.NhanVienService;
import com.componentfolders.Service.Impl.NhanVienServiceImpl;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormNhanVien extends javax.swing.JPanel { 
  private  DefaultTableModel md = new DefaultTableModel();
  private  ArrayList<NhanVien> list = new ArrayList<>();
  private  NhanVienService nvSv = new NhanVienServiceImpl();
  
  
    public FormNhanVien() {
        initComponents();
        setOpaque(false);
//        loadData(list);
//        loadLuuTru(list);
       
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel2)
                .addContainerGap(962, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel2)
                .addContainerGap(546, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

//    private void loadData(ArrayList<NhanVien> list) {
//        md = (DefaultTableModel) panel.getModel();
//        md.setRowCount(0);
//        for (NhanVien nhanVien : nvSv.getAll()) {
//            md.addRow(new Object[]{
//                nhanVien.getId(),nhanVien.getMaNV(),nhanVien.getTen(),nhanVien.getGioiTinh(),nhanVien.getChucVu(),nhanVien.geteMail(),nhanVien.getQueQuan(),nhanVien.getNgaySinh(),nhanVien.getTaiKhoan(),nhanVien.getMatKhau(),nhanVien.getTrangThai()
//            });
//            
//        }
//    }
//
//    private void loadLuuTru(ArrayList<NhanVien> list) {
//md = (DefaultTableModel) tblluutru.getModel();
//        md.setRowCount(0);
//        for (NhanVien nhanVien : nvSv.luuTru()) {
//            md.addRow(new Object[]{
//                nhanVien.getId(),nhanVien.getMaNV(),nhanVien.getTen(),nhanVien.getGioiTinh(),nhanVien.getChucVu(),nhanVien.geteMail(),nhanVien.getQueQuan(),nhanVien.getNgaySinh(),nhanVien.getTaiKhoan(),nhanVien.getMatKhau(),nhanVien.getTrangThai()
//            });
//            
//        }
//        }
}

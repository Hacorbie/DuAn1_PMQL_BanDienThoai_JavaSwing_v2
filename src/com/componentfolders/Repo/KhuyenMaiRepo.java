/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolders.Repo;

import com.componentfolders.Model.KhuyenMai;
import com.componentfolders.Utilities.DBConnections;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HA NGUYEN
 */
public class KhuyenMaiRepo {
      private DBConnections connections;
      
      public ArrayList<KhuyenMai> GetListKM(){
          ArrayList<KhuyenMai> listkm = new ArrayList<>();
          String sql = "Select * from Khuyenmai where trangthai = 1";
          try(Connection con = connections.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                KhuyenMai kh = new KhuyenMai();
                 kh.setID(rs.getInt(1));
                 kh.setMaKM(rs.getString(2));
                 kh.setTen(rs.getString(3));
                 kh.setNgayBatDau(rs.getDate(4));
                 kh.setNgayKetThuc(rs.getDate(5));
                 kh.setLoaiGiamGia(rs.getInt(6));
                 kh.setHinhThucGiamGia(rs.getInt(7));
                 kh.setGiaTriGiam(rs.getInt(8));
                 kh.setTrangthai(rs.getInt(9));
                 listkm.add(kh);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
          return listkm;
      
      }
}

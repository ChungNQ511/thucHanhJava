package Proccess;

import java.sql.*;
import Database.Connect;
import javax.swing.JOptionPane;

public class ShowLoaiSP {

    public Connect cn = new Connect();
    //Truy van lieu trong Table Sanpham theo Maloai

    public ResultSet ShowSPTheoloai(String ml) {
        String sql = "SELECT MaSP,TenSP,Dongia,Tenloai "
                + "FROM Sanpham S, LoaiSP L"
                + " where L.Maloai = S.Maloai and L.Maloai ='" + ml +"'  "; 

        return cn.LoadData(sql);
    }
}

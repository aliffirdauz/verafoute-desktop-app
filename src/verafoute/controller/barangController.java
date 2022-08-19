/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import verafoute.db.ConnectionManager;
import verafoute.entity.barang;

/**
 *
 * @author hp
 */
public class barangController {
    public List<barang> getAllBarang(){
        String query = "SELECT barang.id_b, barang.nama_b, barang.harga_b, barang.stok_b, kategori.id_k, kategori.nama_k FROM barang JOIN kategori ON barang.id_k=kategori.id_k";
//        String query = "select * from barang inner join kategori on kategori.id_k = barang.id_b";
        ConnectionManager conMan = new ConnectionManager();
        List<barang> lsBarang = new ArrayList<barang>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
        while(rs.next()){
            barang b = new barang();
            b.setId_b(rs.getInt("id_b"));
            b.setNama_b(rs.getString("nama_b"));
            b.setHarga_b(rs.getInt("harga_b"));
            b.setStok_b(rs.getInt("stok_b"));
            b.setId_k(rs.getInt("id_k"));
            b.setNama_k(rs.getString("nama_k"));
            lsBarang.add(b);
        }
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsBarang;
    }
    
    public int insertB(barang b){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO barang values('"+b.getId_b()+"', '"+b.getNama_b()+"', '"+b.getHarga_b()+"', '"+b.getStok_b()+"', '"+b.getId_k()+"')";
        try {
           Statement stm = conn.createStatement();
           hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateB(barang b){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "UPDATE barang SET nama_b='"+b.getNama_b()+"', harga_b='"+b.getHarga_b()+"', stok_b='"+b.getStok_b()+"', id_k='"+b.getId_k()+"' WHERE id_b='"+b.getId_b()+"'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateS(barang b){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "UPDATE barang SET stok_b='"+b.getStok_b()+"' WHERE id_b='"+b.getId_b()+"'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int DeleteB(int id_b){
        String query = "DELETE FROM barang WHERE id_b='"+id_b+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}

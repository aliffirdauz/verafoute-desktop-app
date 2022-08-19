/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.controller;

import verafoute.entity.pembeli;
import verafoute.db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import verafoute.db.ConnectionManager;

/**
 *
 * @author hp
 */
public class pembeliController {
    public List<pembeli> getAllPembeli(){
        String query = "SELECT * FROM pembeli";
        ConnectionManager conMan = new ConnectionManager();
        List<pembeli> lsPembeli = new ArrayList<pembeli>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
        while(rs.next()){
            pembeli p = new pembeli();
            p.setId_p(rs.getInt("id_p"));
            p.setNama_p(rs.getString("nama_p"));
            p.setAlamat_p(rs.getString("alamat_p"));
            p.setNotelp_p(rs.getString("notelp_p"));
            p.setUsername_p(rs.getString("username_p"));
            p.setPassword_p(rs.getString("password_p"));
            lsPembeli.add(p);
        }
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsPembeli;
    }
 
    public int insertP(pembeli p){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO Pembeli values('"+p.getId_p()+"', '"+p.getNama_p()+"', '"+p.getAlamat_p()+"', '"+p.getNotelp_p()+"', '"+p.getUsername_p()+"', '"+p.getPassword_p()+"')";
        try {
           Statement stm = conn.createStatement();
           hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int updateP(pembeli p){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "UPDATE pembeli SET nama_p='"+p.getNama_p()+"', alamat_p='"+p.getAlamat_p()+"', notelp_p='"+p.getNotelp_p()+"', username_p='"+p.getUsername_p()+"', password_p='"+p.getPassword_p()+"' WHERE id_p='"+p.getId_p()+"'";
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(pembeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
    
    public int DeleteP(int id_p){
        String query = "DELETE FROM pembeli WHERE id_p='"+id_p+"'";
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

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
import verafoute.entity.transaksi;

/**
 *
 * @author hp
 */
public class transaksiController {
    public List<transaksi> getAllTransaksi(){
        String query = "SELECT transaksi.id_t, transaksi.tgl_t, barang.id_b, barang.nama_b, transaksi.jml_t, transaksi.total_t, pembeli.id_p, pembeli.nama_p FROM transaksi JOIN barang ON transaksi.id_b=barang.id_b JOIN pembeli ON transaksi.id_p=pembeli.id_p";
        String query2 = "SELECT * FROM transaksi";
        ConnectionManager conMan = new ConnectionManager();
        List<transaksi> lsTransaksi = new ArrayList<transaksi>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
        while(rs.next()){
            transaksi t = new transaksi();
            t.setId_t(rs.getInt("id_t"));
            t.setTgl_t(rs.getString("tgl_t"));
            t.setId_b(rs.getInt("id_b"));
            t.setNama_b(rs.getString("nama_b"));
            t.setJml_t(rs.getInt("jml_t"));
            t.setTotal_t(rs.getInt("total_t"));
            t.setId_p(rs.getInt("id_p"));
            t.setNama_p(rs.getString("nama_p"));
            lsTransaksi.add(t);
        }
        } catch (SQLException ex) {
            Logger.getLogger(transaksiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsTransaksi;
    }
    
    public int insertT(transaksi t){
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        String query = "INSERT INTO transaksi values('"+t.getId_t()+"', '"+t.getTgl_t()+"', '"+t.getId_b()+"', '"+t.getJml_t()+"', '"+t.getTotal_t()+"', '"+t.getId_p()+"')";
        try {
           Statement stm = conn.createStatement();
           hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(transaksiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return hasil;
    }
}

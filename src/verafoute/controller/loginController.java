/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import verafoute.db.ConnectionManager;
import verafoute.entity.login;
import verafoute.view.HalamanUser;
import verafoute.view.HalamanLogin;

/**
 *
 * @author hp
 */
public class loginController {
    public void logging(String username_p, String password_p){
        login p = new login(username_p, password_p);
            ConnectionManager conMan = new ConnectionManager();
            Connection conn = conMan.logOn();
            try {
                HalamanLogin hl = new HalamanLogin();
                String query = "SELECT * FROM pembeli WHERE  username_p='"+p.getUsername_p()+"' AND password_p='"+p.getPassword_p()+"'";
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(query);
                if(rs.next()){
                    if(username_p.equals(rs.getString("username_p")) && password_p.equals(rs.getString("password_p"))){
                        p.setId_p(rs.getInt("id_p"));
                        p.setNama_p(rs.getString("nama_p"));
                        JOptionPane.showMessageDialog(null, "Berhasil Masuk");
                        new HalamanUser().setVisible(true);
                        hl.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username atau Password Salah / Tidak terdaftar");
                }            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            conMan.logOff();
    }
}

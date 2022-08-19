/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.entity;

/**
 *
 * @author hp
 */
public class login {
    private static int id_p;
    private static String nama_p;
    private static String alamat_p;
    private static String notelp_p;
    private static String username_p;
    private static String password_p;

    public login() {
    }

    public login(String username_p, String password_p) {
        this.username_p = username_p;
        this.password_p = password_p;
    }

    public login(int id_p) {
        this.id_p = id_p;
    }
    
    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public String getNama_p() {
        return nama_p;
    }

    public void setNama_p(String nama_p) {
        this.nama_p = nama_p;
    }

    public String getAlamat_p() {
        return alamat_p;
    }

    public void setAlamat_p(String alamat_p) {
        this.alamat_p = alamat_p;
    }

    public String getNotelp_p() {
        return notelp_p;
    }

    public void setNotelp_p(String notelp_p) {
        this.notelp_p = notelp_p;
    }

    public String getUsername_p() {
        return username_p;
    }

    public void setUsername_p(String username_p) {
        this.username_p = username_p;
    }

    public String getPassword_p() {
        return password_p;
    }

    public void setPassword_p(String password_p) {
        this.password_p = password_p;
    }

    @Override
    public String toString() {
        return "pembeli{" + "id_p=" + id_p + ", nama_p=" + nama_p + ", alamat_p=" + alamat_p + ", notelp_p=" + notelp_p + ", username_p=" + username_p + ", password_p=" + password_p + '}';
    }

    
    
    
    
}

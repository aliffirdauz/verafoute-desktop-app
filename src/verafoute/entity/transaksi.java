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
public class transaksi {
    private int id_t;
    private String tgl_t;
    private int id_b;
    private String nama_b;
    private int jml_t;
    private int total_t;
    private int id_p;
    private String nama_p;

    public transaksi() {
    }

    public transaksi(int id_t, String tgl_t, int id_b, int jml_t, int total_t, int id_p) {
        this.id_t = id_t;
        this.tgl_t = tgl_t;
        this.id_b = id_b;
        this.jml_t = jml_t;
        this.total_t = total_t;
        this.id_p = id_p;
    }

    public transaksi(String tgl_t, int id_b, int jml_t, int total_t, int id_p) {
        this.tgl_t = tgl_t;
        this.id_b = id_b;
        this.jml_t = jml_t;
        this.total_t = total_t;
        this.id_p = id_p;
    }

    public transaksi(int id_t, String tgl_t, String nama_b, int jml_t, int total_t, String nama_p) {
        this.id_t = id_t;
        this.tgl_t = tgl_t;
        this.nama_b = nama_b;
        this.jml_t = jml_t;
        this.total_t = total_t;
        this.nama_p = nama_p;
    }

    public transaksi(int id_t, String tgl_t, int id_b, String nama_b, int jml_t, int total_t, int id_p, String nama_p) {
        this.id_t = id_t;
        this.tgl_t = tgl_t;
        this.id_b = id_b;
        this.nama_b = nama_b;
        this.jml_t = jml_t;
        this.total_t = total_t;
        this.id_p = id_p;
        this.nama_p = nama_p;
    }

    public String getNama_b() {
        return nama_b;
    }

    public void setNama_b(String nama_b) {
        this.nama_b = nama_b;
    }

    public String getNama_p() {
        return nama_p;
    }

    public void setNama_p(String nama_p) {
        this.nama_p = nama_p;
    }

    public int getId_t() {
        return id_t;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public String getTgl_t() {
        return tgl_t;
    }

    public void setTgl_t(String tgl_t) {
        this.tgl_t = tgl_t;
    }

    public int getId_b() {
        return id_b;
    }

    public void setId_b(int id_b) {
        this.id_b = id_b;
    }

    public int getJml_t() {
        return jml_t;
    }

    public void setJml_t(int jml_t) {
        this.jml_t = jml_t;
    }

    public int getTotal_t() {
        return total_t;
    }

    public void setTotal_t(int total_t) {
        this.total_t = total_t;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    @Override
    public String toString() {
        return "transaksi{" + "id_t=" + id_t + ", tgl_t=" + tgl_t + ", id_b=" + id_b + ", nama_b=" + nama_b + ", jml_t=" + jml_t + ", total_t=" + total_t + ", id_p=" + id_p + ", nama_p=" + nama_p + '}';
    }

    

    
    
    
}

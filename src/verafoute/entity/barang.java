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
public class barang {
    private int id_b;
    private String nama_b;
    private int harga_b;
    private int stok_b;
    private int id_k;
    private String nama_k;

    public barang() {
    }

    public barang(int id_b, String nama_b, int harga_b, int stok_b, int id_k) {
        this.id_b = id_b;
        this.nama_b = nama_b;
        this.harga_b = harga_b;
        this.stok_b = stok_b;
        this.id_k = id_k;
    }

    public barang(String nama_b, int harga_b, int stok_b, int id_k) {
        this.nama_b = nama_b;
        this.harga_b = harga_b;
        this.stok_b = stok_b;
        this.id_k = id_k;
    }

    public barang(int id_b, String nama_b, int harga_b, int stok_b, int id_k, String nama_k) {
        this.id_b = id_b;
        this.nama_b = nama_b;
        this.harga_b = harga_b;
        this.stok_b = stok_b;
        this.id_k = id_k;
        this.nama_k = nama_k;
    }

    public barang(int id_b, int stok_b) {
        this.id_b = id_b;
        this.stok_b = stok_b;
    }

    public int getId_b() {
        return id_b;
    }

    public void setId_b(int id_b) {
        this.id_b = id_b;
    }

    public String getNama_b() {
        return nama_b;
    }

    public void setNama_b(String nama_b) {
        this.nama_b = nama_b;
    }

    public int getHarga_b() {
        return harga_b;
    }

    public void setHarga_b(int harga_b) {
        this.harga_b = harga_b;
    }

    public int getStok_b() {
        return stok_b;
    }

    public void setStok_b(int stok_b) {
        this.stok_b = stok_b;
    }

    public int getId_k() {
        return id_k;
    }

    public void setId_k(int id_k) {
        this.id_k = id_k;
    }

    public String getNama_k() {
        return nama_k;
    }

    public void setNama_k(String nama_k) {
        this.nama_k = nama_k;
    }

    @Override
    public String toString() {
        return "barang{" + "id_b=" + id_b + ", nama_b=" + nama_b + ", harga_b=" + harga_b + ", stok_b=" + stok_b + ", id_k=" + id_k + ", nama_k=" + nama_k + '}';
    }
    
    

    
    
    
}

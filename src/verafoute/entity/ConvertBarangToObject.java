/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.entity;

import java.util.ArrayList;
import java.util.List;
import verafoute.controller.barangController;

/**
 *
 * @author hp
 */
public class ConvertBarangToObject {
    public String[][] getBarang(){
        List<barang> myB = new ArrayList<barang>();
        barangController bc = new barangController();
        myB = bc.getAllBarang();
        String[][] dataBarang = new String[myB.size()][6];
        int i=0;
        for(barang bb : myB){
            dataBarang[i][0] = Integer.toString(bb.getId_b());
            dataBarang[i][1] = bb.getNama_b();
            dataBarang[i][2] = Integer.toString(bb.getHarga_b());
            dataBarang[i][3] = Integer.toString(bb.getStok_b());
            dataBarang[i][4] = Integer.toString(bb.getId_k());
            dataBarang[i][5] = bb.getNama_k();
            i++;
        }
        return dataBarang;
    }
}

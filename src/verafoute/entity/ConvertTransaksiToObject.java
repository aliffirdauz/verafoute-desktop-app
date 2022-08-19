/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.entity;

import java.util.ArrayList;
import java.util.List;
import verafoute.controller.transaksiController;

/**
 *
 * @author hp
 */
public class ConvertTransaksiToObject {
    public String[][] getTransaksi(){
        List<transaksi> myT = new ArrayList<transaksi>();
        transaksiController tc = new transaksiController();
        myT = tc.getAllTransaksi();
        String[][] dataTransaksi = new String[myT.size()][8];
        int i=0;
        for(transaksi tt : myT){
            dataTransaksi[i][0] = Integer.toString(tt.getId_t());
            dataTransaksi[i][1] = tt.getTgl_t().toString();
//            dataTransaksi[i][2] = Integer.toString(tt.getId_b());
            dataTransaksi[i][2] = tt.getNama_b().toString();
            dataTransaksi[i][3] = Integer.toString(tt.getJml_t());
            dataTransaksi[i][4] = Integer.toString(tt.getTotal_t());
//            dataTransaksi[i][6] = Integer.toString(tt.getId_p());
            dataTransaksi[i][5] = tt.getNama_p().toString();
            i++;
        }
        return dataTransaksi;
    }
}

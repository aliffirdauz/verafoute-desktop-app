/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verafoute.entity;

import java.util.ArrayList;
import java.util.List;
import verafoute.controller.pembeliController;

/**
 *
 * @author hp
 */
public class ConvertPembeliToObject {
    public String[][] getPembeli(){
        List<pembeli> myP = new ArrayList<pembeli>();
        pembeliController pc = new pembeliController();
        myP = pc.getAllPembeli();
        String[][] dataPembeli = new String[myP.size()][6];
        int i=0;
        for(pembeli pp : myP){
            dataPembeli[i][0] = Integer.toString(pp.getId_p());
            dataPembeli[i][1] = pp.getNama_p();
            dataPembeli[i][2] = pp.getAlamat_p();
            dataPembeli[i][3] = pp.getNotelp_p();
            dataPembeli[i][4] = pp.getUsername_p();
            dataPembeli[i][5] = pp.getPassword_p();
            i++;
        }
        return dataPembeli;
    }
}

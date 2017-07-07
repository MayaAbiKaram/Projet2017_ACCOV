/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetaccov;

import java.util.ArrayList;

/**
 *
 * @author Maya
 */
public class Radar {
    
    ArrayList<ArrayList<String>> listAvions = new ArrayList<>();
    String[] information = {"id","nom","position_x","position_y","position_z","cap","vitesse_x","vitesse_y","vitesse_z","altitude","remarque"};
    
    void afficher(int id,String nom,double position_x,double position_y,double position_z,double cap,double vitesse_x,double vitesse_y,double vitesse_z,double altitude){
        boolean found =false;
        for (int i=0;i<listAvions.size();i++){
            if(listAvions.get(i).get(0).equals(Integer.toString(id))){
                listAvions.get(i).add(1, nom);
                listAvions.get(i).add(2, Double.toString(position_x));
                listAvions.get(i).add(3, Double.toString(position_y));
                listAvions.get(i).add(4, Double.toString(position_z));
                listAvions.get(i).add(5, Double.toString(cap));
                listAvions.get(i).add(6, Double.toString(vitesse_x));
                listAvions.get(i).add(7, Double.toString(vitesse_y));
                listAvions.get(i).add(8, Double.toString(vitesse_z));
                listAvions.get(i).add(9, Double.toString(altitude));
                if((position_x == 0) && (position_y == 0) && (position_z == 0) ){
                     listAvions.get(i).add(10, "Depart");
                }
                else
                {
                     listAvions.get(i).add(10,"-");
                }
                found=true;
                break;
            }
        }
        if(found ==false){
            ArrayList <String> a = new ArrayList<>();
            a.add(Integer.toString(id));
            a.add(nom);
            a.add(Double.toString(position_x));
            a.add(Double.toString(position_y));
            a.add(Double.toString(position_z));
            a.add(Double.toString(cap));
            a.add(Double.toString(vitesse_x));
            a.add(Double.toString(vitesse_y));
            a.add(Double.toString(vitesse_z));
            a.add(Double.toString(altitude));
            if((position_x == 0) && (position_y == 0) && (position_z == 0) ){
                 a.add("Depart");
            }
            else
            {
                 a.add("-");
            }
            listAvions.add(a);
        }
    }
}

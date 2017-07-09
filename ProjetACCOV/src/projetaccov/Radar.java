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
    
    private static final Object key = new Object();
    ArrayList<ArrayList<String>> listAvions = new ArrayList<>();
    String[] information = {"id","nom","position_x","position_y","position_z","cap","vitesse_x","vitesse_y","vitesse_z","altitude","remarque"};
    
    void afficher(String id,String nom,String position_x,String position_y,String position_z,String vitesse_x,String vitesse_y,String vitesse_z,String cap,String altitude,String remarque){
        synchronized (key) {
            boolean found =false;
            for (int i=0;i<listAvions.size();i++){
                if(listAvions.get(i).get(0).equals(id)){
                    listAvions.get(i).add(1, nom);
                    listAvions.get(i).add(2, position_x);
                    listAvions.get(i).add(3, position_y);
                    listAvions.get(i).add(4, position_z);
                    listAvions.get(i).add(5, cap);
                    listAvions.get(i).add(6, vitesse_x);
                    listAvions.get(i).add(7, vitesse_y);
                    listAvions.get(i).add(8, vitesse_z);
                    listAvions.get(i).add(9, altitude);
                    listAvions.get(i).add(10, remarque);
                    found=true;
                    break;
                }
            }
            if(found ==false){
                ArrayList <String> a = new ArrayList<>();
                a.add(id);
                a.add(nom);
                a.add(position_x);
                a.add(position_y);
                a.add(position_z);
                a.add(cap);
                a.add(vitesse_x);
                a.add(vitesse_y);
                a.add(vitesse_z);
                a.add(altitude);
                a.add(remarque);

                listAvions.add(a);
            }

           for(int i=0;i<listAvions.size();i++){
               for(int j=0;j<information.length;j++){
                   System.out.println(information[j] + " : " + listAvions.get(i).get(j));
               }
               System.out.println("------------------------------------------");
           }
            System.out.println();
            System.out.println();
        }
    }
}

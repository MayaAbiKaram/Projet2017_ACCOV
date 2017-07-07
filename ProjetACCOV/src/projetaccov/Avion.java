/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetaccov;

/**
 *
 * @author Maya
 */
public class Avion {
    static final int INTERVALLE = 3; //secondes
    int id;
    String nom;
    Console c;
    String depart,arrivee;
    double arrivee_x,arrivee_y,arrivee_z;
    double cap,altitude;
    double vitesse_x,vitesse_y,vitesse_z;
    double position_x,position_y,position_z;
    
    Avion(int id,String nom,String depart,String arrivee, double arrivee_x,double arrivee_y,double arrivee_z,Console c){
        this.id =id;
        this.nom = nom;
        this.depart = depart;
        this.arrivee = arrivee;
        this.arrivee_x = arrivee_x;
        this.arrivee_y = arrivee_y;
        this.arrivee_z = arrivee_z;
        this.c = c;
        position_x = 0;
        position_y = 0;
        position_z = 0;
        vitesse_x = 0;
        vitesse_y = 0;
        vitesse_z = 0;
        cap = 0;
        altitude = 0;
    }
    
    void modification(double altitude,double cap,double vitesse_x,double vitesse_y,double vitesse_z){
        this.vitesse_x = vitesse_x;
        this.vitesse_y = vitesse_y;
        this.vitesse_z = vitesse_z;
        this.cap = cap;
        this.altitude = altitude;
        
        position_x = (vitesse_x)/INTERVALLE;
        position_y = (vitesse_y)/INTERVALLE;
        position_z = (vitesse_z)/INTERVALLE;
        
        if((position_x == arrivee_x) && (position_y == arrivee_y) && (position_z == arrivee_z) ){
            //arrivee a destination
            //exit socket
        }
    }
    
    //COMMUNICATION SOCKET AVEC SACA
    
}

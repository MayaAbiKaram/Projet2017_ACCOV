/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesToRun;

import projetaccov.Radar;
import projetaccov.Saca;

/*
 *
 * @author Maya
 */
public class Saca1 {
    public static void main(String[]args)throws Exception{
        Radar r = new Radar();
        Saca c = new Saca(r);
        c.start();
        
    }
    
}

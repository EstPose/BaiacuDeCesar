/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiacuDeCesar.code;

import BaiacuDeCesar.code.Fases.Tutorial;
import BaiacuDeCesar.code.Fases.Fehu.*;
import BaiacuDeCesar.code.Fases.Uruz.*;
import BaiacuDeCesar.code.Fases.Thurisaz.*;
import BaiacuDeCesar.code.Fases.Ansuz.*;

/**
 *
 * @author estpose
 */
public class iniciar {
    public static void iniciar() {
        switch (info.dados.get(info.select).nivel) {
            case 0:
                new Tutorial().setVisible(true);
                break;
            
            case 1:
                new F1().setVisible(true);
                break;
                
            case 2:
                new F2().setVisible(true);
                break;
                
            case 3:
                new F3().setVisible(true);
                break;
                
            case 4:
                new F4().setVisible(true);
                break;
                
            case 5:
                new U1().setVisible(true);
                break;
                
            case 6:
                new U2().setVisible(true);
                break;
                
            case 7:
                new U3().setVisible(true);
                break;
              
            case 8:
                new U4().setVisible(true);
                break;
            
            case 9:
                new T1().setVisible(true);
                break;
                
            case 10:
                new T2().setVisible(true);
                break;
                
            case 11:
                new T3().setVisible(true);
                break;
                
            case 12:
                new T4().setVisible(true);
                break;
                
            case 13:
                new A1().setVisible(true);
                break;
                
            case 14:
                new A2().setVisible(true);
                break;
                
            case 15:
                new A3().setVisible(true);
                break;
                
            case 16:
                new A4().setVisible(true);
                break;
                
            case 17:
                break;
            default:
                throw new AssertionError();
        }
    }
}

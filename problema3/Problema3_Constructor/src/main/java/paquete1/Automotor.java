/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Automotor {
    private String cedulaD;
    private int AnioF;
    private double ValorH;
    private double ValorM;
    private fabricante fabri;
    
    public Automotor (String cD, int aF, double vH, double vM, fabricante fab){
        cedulaD = cD;
        AnioF = aF;
        ValorH = vH;
        ValorM = vM;
        fabri = fab;
    }

}

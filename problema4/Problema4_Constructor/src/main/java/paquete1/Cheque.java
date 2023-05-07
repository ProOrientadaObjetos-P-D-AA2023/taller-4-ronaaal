/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Cheque {
    private Cliente client;
    private Banco baanco;
    private double vCheque;
    private double bComision;
    
    public Cheque (Cliente cliente1, Banco banco1, double vC, double bC){
        client = cliente1;
        baanco = banco1;
        vCheque = vC;
        bComision = bC;
    }

}

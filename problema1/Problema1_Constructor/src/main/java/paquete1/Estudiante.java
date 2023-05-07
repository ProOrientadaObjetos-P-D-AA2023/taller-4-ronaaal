/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquete1;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
    private String nombreE;
    private double cali1;
    private double cali2;
    private double cali3;
    private double promedio;
    private Universidad uni;
    
    public Estudiante(String n, double c1, double c2, double c3, double prom, Universidad univ){
        nombreE = n;
        cali1 = c1;
        cali2 = c2;
        cali3 = c3;
        promedio = prom;
        uni = univ;
    }

    
}

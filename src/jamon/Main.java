/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        JamonSanchezPerezRaul2122 miJamonSanchezPerezRaul2122;
        int stockActual;
        
        miJamonSanchezPerezRaul2122 = new JamonSanchezPerezRaul2122("5Jotas",580,100);
        vendeJamSanchezPerezRaul2122(miJamonSanchezPerezRaul2122);
        
        compraJamSanchezPerezRaul2122(miJamonSanchezPerezRaul2122);
        stockActual = miJamonSanchezPerezRaul2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamSanchezPerezRaul2122(JamonSanchezPerezRaul2122 miJamonSanchezPerezRaul2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonSanchezPerezRaul2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vendeJamSanchezPerezRaul2122(JamonSanchezPerezRaul2122 miJamonSanchezPerezRaul2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonSanchezPerezRaul2122.vender(80, España);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}

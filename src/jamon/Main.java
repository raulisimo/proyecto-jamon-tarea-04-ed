/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;
/** 
 * Clase main del programa, que define un objeto Jamon con unos parámetros 
 * y realiza  acciones de comprar y vender jamones
 *
 * @author portatil_profesorado
 */
public class Main {
    
    /** * Método main.
     * 
     * Este método es el principal de ejecución del programa
     *
     */
    
    public static void main(String[] args) {
        JamonSanchezPerezRaul2122 miJamonSanchezPerezRaul2122;
        int stockActual;
        
        miJamonSanchezPerezRaul2122 = new JamonSanchezPerezRaul2122("5Jotas",580,100);
        vendeJamSanchezPerezRaul2122(miJamonSanchezPerezRaul2122);
        
        compraJamSanchezPerezRaul2122(miJamonSanchezPerezRaul2122);
        stockActual = miJamonSanchezPerezRaul2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
    
 /**
* Método compraJamSanchezPerezRaul2122.
* 
* En este método se va a realizar la acción de comprar jamones
* se hace con la idea de comprobar que no se compran más jamones
 * de los que hay en stock ni que se compre
 *un número negativo de jamones
* 
* @param cantidad número de jamones que se van a comprar
*
* @throws Exception si la cantidad de jamones son negativos
 * o cero, si hay menos jamones en stock de los que se quieren vender
*/
    
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

 /**
* Método vendeJamSanchezPerezRaul2122.
* 
* En este método se va a realizar la acción de vender jamones
* se hace con la idea de comprobar que no se vendan más jamones
 * de los que hay en stock ni que se venda
 *un número negativo de jamones
* 
* @param cantidad número de jamones que se van a vender
*
* @throws Exception si la cantidad de jamones son negativos
 * o cero, si hay menos jamones en stock de los que se quieren vender
*/
    
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gustavo
 */
public class Vehiculo_Aereo extends Vehiculo {
    private String vehiculo;

    public Vehiculo_Aereo(String vehiculo, String color, String tipo, String placa) {
        super(color, tipo, placa);
        this.vehiculo = vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void agregar (){
    System.out.println("vehiculo:" +getVehiculo());
    System.out.println("Color:" +getColor());
    System.out.println("Tipo:" +getTipo()); 
    System.out.println("____________________________________");
    
   }
}

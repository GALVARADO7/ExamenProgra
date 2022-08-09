/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gustavo
 */
abstract class Vehiculo {
    private String color,tipo,placa;
    
    public Vehiculo(){}
    public Vehiculo(String color, String tipo, String placa) {
        this.color = color;
        this.tipo = tipo;
        this.placa = placa;
        
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    protected void agregar(){}
}




package edu.ejercicios.Pizza.Interfaz;

import edu.ejercicios.Pizza.especialidades.PizzaItaliana;

public class PizzaBase implements IPreparable {
    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public void prepare() {
        System.out.println("La pizza esta preparada:"+nombre);
    }
}

package com.mycompany.ofertadecursos;

public class Emisora implements Observador{

    private String nombre;
    private String curso;

    public Emisora(String nombre){
       this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void actualizar() {
        System.out.println("La emisora: " + nombre + " fue notificada. " + curso);
    }

    public String getNombre() {
        return nombre;
    }
    
}

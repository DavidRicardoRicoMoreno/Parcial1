package com.mycompany.ofertadecursos;

public class WebMaster implements Observador{
    
    private String nombre;
    private String curso;
    
    public WebMaster(String nombre){
       this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void actualizar() {
        System.out.println("El WebMaster: " + nombre + " fue notificado. " + curso);
    }

    public String getNombre() {
        return nombre;
    }
    
}

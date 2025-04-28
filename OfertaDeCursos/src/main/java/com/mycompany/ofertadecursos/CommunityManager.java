package com.mycompany.ofertadecursos;

public class CommunityManager implements Observador{
    
    private String nombre;
    private String curso;
    
    public CommunityManager(String nombre){
       this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void actualizar() {
        System.out.println("El community manager: " + nombre + " fue notificado." + curso);
    }

    public String getNombre() {
        return nombre;
    }
    
}

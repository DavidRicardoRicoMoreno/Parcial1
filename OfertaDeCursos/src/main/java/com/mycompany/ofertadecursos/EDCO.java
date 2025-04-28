package com.mycompany.ofertadecursos;

public class EDCO implements Publicador {

    private String nombre;
    private String curso1;
    private String curso2;
    private String curso3;
    
    public EDCO(String curso1, String curso2, String curso3){
   
        this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    @Override
    public void suscribirse() {
        System.out.println("Se ha suscrito a la EDCO " + nombre);
    }

    @Override
    public String actualizar() {
        String actualizar = "Se han añadadido los cursos: " + curso1 + ", " + curso2 + ", " + curso3 + ".";
        return actualizar;
    }

    @Override
    public void remover() {
        System.out.println("Se ha desuscrito de la EDCO " + nombre);
    }
    
}

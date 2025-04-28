package com.mycompany.ofertadecursos;

public class OfertaDeCursos {

    public static void main(String[] args) {
        
        EDCO edco = new EDCO("Inteligencia Artificial","Pedagogia decolonial", "Introducción a ciudades inteligentes");
        String comunicado = edco.actualizar();        
                
        WebMaster webMaster = new WebMaster("David");
        CommunityManager communityManager = new CommunityManager("Ricardo");
        Emisora emisora = new Emisora("RM");
        
        edco.setNombre(webMaster.getNombre());
        edco.suscribirse();
        webMaster.setCurso(comunicado);
        webMaster.actualizar();
        edco.remover();
        
        edco.setNombre(communityManager.getNombre());
        edco.suscribirse();
        communityManager.setCurso(comunicado);
        communityManager.actualizar();
        edco.remover();
        
        edco.setNombre(emisora.getNombre());
        edco.suscribirse();
        emisora.setCurso(comunicado);
        emisora.actualizar();
        edco.remover();
    }
}

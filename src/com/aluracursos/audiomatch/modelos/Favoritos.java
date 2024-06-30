package com.aluracursos.audiomatch.modelos;

public class Favoritos extends Audio {

    public void incluye(Audio audio){

        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento.");
        }else {
            System.out.println(audio.getTitulo() + " no es tan favorito en el momento.");
        }

    }

}

package com.aluracursos.audiomatch.principal;

import com.aluracursos.audiomatch.modelos.Cancion;
import com.aluracursos.audiomatch.modelos.Favoritos;
import com.aluracursos.audiomatch.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Cafe Tech");
        miPodcast.setPresentador("Grabiela Aguilar");

        //Canción:
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        //Podcast:
        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 3000; i++) {
            miPodcast.reproduce();
        }


        System.out.println("Total de reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de likes: " + miCancion.getTotalLikes());

        System.out.println("Total de reproducciones: " + miPodcast.getTotalReproducciones());
        System.out.println("Total de likes: " + miPodcast.getTotalLikes());

        Favoritos favoritos = new Favoritos();
        favoritos.incluye(miPodcast);
        favoritos.incluye(miCancion);

    }
}

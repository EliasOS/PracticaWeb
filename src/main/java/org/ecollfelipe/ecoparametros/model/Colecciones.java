package org.ecollfelipe.ecoparametros.model;

import lombok.*;
import java.util.HashMap;
import java.util.Map;
public class Colecciones {
    @Getter
    private static final Map<String, Genero> listaGeneros = new HashMap<>();
    @Getter
    private static final Map<String, Pais> listaPaises = new HashMap<>();
    @Getter
    private static final Map<String, Aficion> listaAficiones = new HashMap<>();

    static{
    listaGeneros.put("F", new Genero("Femenino");
    listaGeneros.put("M", new Genero("Masculino");
    listaGeneros.put("O", new Genero("Otro");

    listaPaises.put("ES",new Pais("España","Castellano","34",true,"spain.jpg"));
    listaPaises.put("FR",new Pais("Francia","Francés","33",false,"france.jpg"));
    listaPaises.put("AR",new Pais("Argentina","Latinoamericano","39",false,"argentina.jpg"));
    listaPaises.put("EEUU",new Pais("EEUU","Inglés","351",false,"unitedStates.jpg"));
    listaPaises.put("GR",new Pais("Alemania","Alemán","44",true,"germany.jpg"));
    listaPaises.put("BR",new Pais("Brasil","Portugués","57",true,"brazil.jpg"));

    listaAficiones.put("V",new Aficion("Videojuegos");
    listaAficiones.put("E",new Aficion("Estudiar");
    listaAficiones.put("T",new Aficion("Viajar");
    listaAficiones.put("N",new Aficion("Nada");
    }

}
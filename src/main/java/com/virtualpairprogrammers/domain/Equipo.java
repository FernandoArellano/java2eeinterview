package com.virtualpairprogrammers.domain;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String name;
    private int fundation;
    private int championships;
    private List<Jugador> jugadores = new ArrayList<Jugador>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFundation() {
        return fundation;
    }

    public void setFundation(int fundation) {
        this.fundation = fundation;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "name='" + name + '\'' +
                ", fundation=" + fundation +
                ", championships=" + championships +
                '}';
    }
}

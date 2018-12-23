package com.virtualpairprogrammers.data;

import com.virtualpairprogrammers.domain.Jugador;

import java.util.ArrayList;
import java.util.List;

public class TeamDataService {

    List<Jugador> jugadores = new ArrayList<Jugador>();
    public TeamDataService(){
        this.jugadores.add(new Jugador("Oribe",24,"forward",34));
        this.jugadores.add(new Jugador("Henry",21,"forward",28));
        this.jugadores.add(new Jugador("Lainez",20,"Medium",18));
        this.jugadores.add(new Jugador("Guido",26,"Medium",26));
        this.jugadores.add(new Jugador("Uribe",8,"Medium",27));
        this.jugadores.add(new Jugador("Bruno",24,"forward",24));
        this.jugadores.add(new Jugador("Marche",1,"forward",30));
        this.jugadores.add(new Jugador("Paul",22,"forward",31));
    }

    public List<Jugador> getPlayers(){
        return this.jugadores;
    }

    public void addPlayer(Jugador jugador){
        this.jugadores.add(jugador);
    }
}

package com.virtualpairprogrammers.domain;

public class Jugador {
    private String name;
    private int number;
    private String position;
    private int age;

    public Jugador(){}

    public Jugador(String name, int number, String position, int age) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.company;

public class Character {
    public int stamina;
    public int sentiment;
    public int money;
    public int intellect;
    public String name;
    public String job;
    public Character(String name) {
        stamina = 100;
        sentiment = 100;
        money = 1000;
        intellect = 25;
        this.name = name;
        job = "Рядовой сотрудник";
    }

}

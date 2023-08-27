package com.workintech.zoo.entity;

import lombok.Data;

@Data
public class Koala extends Animal{
    private double sleepHour;

    public Koala(int id, String name, int weight, Gender gender, double sleepHour) {
        super(id, name, weight, gender);
        this.sleepHour = sleepHour;
    }
}

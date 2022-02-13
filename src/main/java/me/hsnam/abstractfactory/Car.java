package me.hsnam.abstractfactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

    private String name;

    private String color;

    private String model;

    private Wheel wheel;

    private Engine engine;
}

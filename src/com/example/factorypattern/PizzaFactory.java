package com.example.factorypattern;

public class PizzaFactory extends Factory{
    public Pizza makePizza(String name) {
        switch(name) {
            case "pepperoni": 
                return new Pepperoni();
            case "vegetarian": 
                return new Vegetarian();
            case "marinara":
                return new Marinara();
        }
        return null;
    }

}

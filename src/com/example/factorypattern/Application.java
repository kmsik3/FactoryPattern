package com.example.factorypattern;

public class Application {
    public static void main(String[] args) {
        Factory factory = new PizzaFactory();
        Pizza firstPizza = factory.makePizza("pepperoni");
        Pizza secondPizza = factory.makePizza("vegetarian");
        Pizza thirdPizza = factory.makePizza("marinara");
        
        System.out.println(firstPizza.getPizzaName());
        System.out.println(secondPizza.getPizzaName());
        System.out.println(thirdPizza.getPizzaName());
    }

}

package oopsconcepts.inheritance;


public class InheritanceTest {

    public static void main(String[] args) {
        subClass cat = new subClass(false, "milk", 4, "black");

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
    }

}
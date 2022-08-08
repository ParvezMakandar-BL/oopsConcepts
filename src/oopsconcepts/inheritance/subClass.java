package oopsconcepts.inheritance;

public class subClass extends superClass{

    private String color;

    public subClass(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }

    public subClass(boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
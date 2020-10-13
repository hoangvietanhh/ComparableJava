public class Circle {
    double radius = 1.0;
    String color = "red";
    boolean filled = false;
    //contructor
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }


    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    //getter setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void display(){
        System.out.print("\t" +getColor());
        System.out.print("\t" + getRadius());
        System.out.println("\t" + isFilled());
    }
}


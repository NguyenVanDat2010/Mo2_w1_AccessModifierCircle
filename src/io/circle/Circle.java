package io.circle;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected String getColor() {
        return color;
    }

    protected double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}

//Sử dụng Public, Protected, Default thì ok vì đảm bảo trong cùng 1 package
//Sủ dụng Private thì ko đảm bảo trong 1 lớp nên ko sử dụng đc. /compile time error

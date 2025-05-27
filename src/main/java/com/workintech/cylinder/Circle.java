package com.workintech.cylinder;

public class Circle {
        private double radius;
    public Circle() {
        this.radius = 0;
    }
        public Circle(double radius) {
            if (radius < 0) this.radius = 0;
            else this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea(){
            return  radius * radius * Math.PI;
        }
        //Testlerde Hata;
    // MainTest'te 66.satır  private void assertTrue(boolean contains) {
    //    } ekledikten sonra doğru kabul ediyor.
    }


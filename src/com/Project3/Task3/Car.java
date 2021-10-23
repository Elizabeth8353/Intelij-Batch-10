package com.Project3.Task3;

public class Car {
        double carPrice;
        String color;
        public Car(double carPrice, String color) {
            this.carPrice = carPrice;
            this.color = color;
        }
        double calculateSalePrice(double a,double b){
            return 0;
        }
    }
    class Sedan extends Car {
        int length;
        public Sedan(double carPrice, String color,int length) {
            super(carPrice, color);
            this.length=length;
        }
        double calculateSalePrice(double length){
            if(length>20){
                return carPrice*0.95;
            }else{
                return carPrice*.9;
            }
        }
    }
    class Truck extends Car {
        double weight;
        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }
        double calculateSalePrice(double weight) {
            if (weight > 2000) {
                return carPrice*.9;
            }else{
                return carPrice*.8;
            }

        }
    }

package com.advancejava.claculator;

public class Calculator {
    private double value;
    public Calculator( ){
        this.value=0;

    }
    public void add(double val){
        value=value+val;
    }

    public void subtract(double val){
        value=value-val;
    }

    public void multiply(double val){
        value=value*val;
    }
    public void divide(double val){
        value=value/val;
    }
    public void clear(){
        value=0;

    }
    public double getValue(){
        return value;
    }
}

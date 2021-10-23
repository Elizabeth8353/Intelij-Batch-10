package com.Project3.Task2;

public abstract class Marks {
    int math;
    int gym;
    int astronomy;
    public Marks(int math, int gym, int astronomy) {
        this.math = math;
        this.gym = gym;
        this.astronomy = astronomy;
    }
    abstract double getPercentage();
}
class A extends Marks {
    public A(int math, int gym, int astronomy) {
        super(math, gym, astronomy);
    }
    @Override
    double getPercentage() {
        return ((double)math+gym+astronomy)/3;
    }
}
class B extends Marks {
    int java;
    public B(int math, int gym, int astronomy, int java) {
        super(math, gym, astronomy);
        this.java = java;
    }
    @Override
    double getPercentage() {
        return ((double)math+gym+astronomy+java)/4;
    }
}


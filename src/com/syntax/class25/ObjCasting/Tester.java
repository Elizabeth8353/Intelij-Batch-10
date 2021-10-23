package com.syntax.class25.ObjCasting;

public class Tester {
    public static void main(String[] args) {
        //We are casting our because it allows us to write dynamic code to use father to loop through our objs/child classes
        Father container=new Son("Abdul");//we will loose some of the info since Father is unable to store/hold everything from our obj(son)
        //We are using the Parent to store child class /this is widening
        //because we are using the father type it will only see the fields and methods of the father
        //watever method you are calling depend on the obj(Son) you are storing in the variable(container)
        container.eat();//but will use the overwritten methods from the child
        container.sleep();//since the obj is the Son/child
       ((Son)container).playGames();


       Son abdul=(Son) container;//We are downcasting to the child original type
       abdul.playGames();// now the child can access all its methods and fields
       abdul.eat();//regardless if they are not in parent class
       abdul.sleep();


      container=new Fawad("Fawad");
      container.eat();
      container.sleep();
      ((Fawad)container).cries();





    }
}

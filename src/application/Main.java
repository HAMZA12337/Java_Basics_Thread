package application;

import metier.Talkative;

public class Main {
    public static void main(String[] args) {

        Talkative t1= new Talkative(1);
        Talkative t2= new Talkative(2);
        Talkative t3= new Talkative(3);
        Talkative t4= new Talkative(4);
        Talkative t5= new Talkative(5);
        Talkative t6= new Talkative(6);
        Talkative t7= new Talkative(7);
        Talkative t8= new Talkative(8);
        Talkative t9= new Talkative(9);
        Talkative t10= new Talkative(10);
        //=====================================================
        Thread tr1= new Thread(t1);
        Thread tr2= new Thread(t1);
        Thread tr3= new Thread(t1);
        Thread tr4= new Thread(t1);
        Thread tr5= new Thread(t1);
        Thread tr6= new Thread(t1);
        Thread tr7= new Thread(t1);
        Thread tr8= new Thread(t1);
        Thread tr9= new Thread(t1);
        Thread tr10= new Thread(t1);

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr5.start();
        tr6.start();
        tr7.start();
        tr8.start();
        tr9.start();
        tr10.start();

// Apres l'execution nous constatons que number devient la valeur de 10 eme objet






    }
}
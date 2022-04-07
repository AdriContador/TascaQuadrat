package com.company;
import java.util.Scanner;

public class Main {
    public static final String MSG1 = "Introdueix la mida del costat del quadrat:";


    public static void main(String[] args) {
        float side;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG1);
        side=sc.nextFloat();
        Quadrat quadrat_nou = new Quadrat(side);

        while((quadrat_nou.side<=0)){
            System.out.println(MSG1);
            quadrat_nou.setSide(sc.nextFloat());
        }
        System.out.println("Costat: "+ quadrat_nou.getSide());
        System.out.println("Area: "+ quadrat_nou.getArea());
        System.out.println("Volum: "+ quadrat_nou.getVolum());
    }

}


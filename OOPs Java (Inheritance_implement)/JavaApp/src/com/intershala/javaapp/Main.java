package com.intershala.javaapp;
import java.util.ArrayList;


public class Main{
    public static void main(String args[]){
        ArrayList<Cake> list =new ArrayList<Cake>();
        Cake c=new Cake();
        c.setName("Chocolate Brownie");
        c.setPrice(250.0);
        Cake d=new Cake();
        d.setName("Chocolate Maple");
        d.setPrice(300.0);
        list.add(c);
        list.add(d);

        ArrayList<Pastry> list2 =new ArrayList<Pastry>();
        Pastry p=new Pastry();
        p.setName("Black Forest");
        p.setPrice(35.0);
        Pastry p1=new Pastry();
        p1.setName("Chocolate Maple");
        p1.setPrice(40.0);
        list2.add(p);
        list2.add(p1);
        System.out.println("Today's Special Menu ");
        System.out.println("--------------------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("--------------------------------------------------");
        for(Cake q:list){
            q.display();
        }
        System.out.println("Special Pastries");
        System.out.println("--------------------------------------------------");
        for(Cake q:list2){
            q.display();
        }
    }
}

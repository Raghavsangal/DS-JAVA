package com.intershala.javaapp;
import java.io.*;
import java.util.*;

// INFLIX TO POSTFLIX CONVERSION

public class Main{
    static class Precedence{
        public static int HasHigherPrecedence(char q){
            switch (q)
            {
                case '+':
                case '-':
                    return 1;

                case '*':
                case '/':
                    return 2;

                case '^':
                    return 3;
            }
            return -1;
        }
    }
    static class Convert{
        public static void InflixtoPostflix(String a){
            int len = a.length();
            String b="";
            Stack<Character> S= new Stack<Character>();
            for(int i=0;i<len;i++){
            if(Character.isDigit(a.charAt(i))){
                b=b+a.charAt(i);
            }
            else{
                while(!S.empty() && Precedence.HasHigherPrecedence(a.charAt(i)) <= Precedence.HasHigherPrecedence(S.peek()) ){
                    b=b+S.peek();
                    S.pop();
                }
                S.push(a.charAt(i));
            }
            }
            while(!S.empty()){
                b=b+S.pop();
            }
            System.out.println("POSTFLIX STRING IS: "+b);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the Inflix String");
        String a;
        Scanner sc =new Scanner(System.in);
        a=sc.nextLine();
        Convert.InflixtoPostflix(a);

    }
}

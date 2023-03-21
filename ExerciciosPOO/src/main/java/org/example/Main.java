package org.example;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 20; i = i+1){
            System.out.println(fib1(i));
        }
        for(int i = 0; i < 20; i = i+1){
            System.out.println(fib2(i));
        }
        for(int i = 0; i < 20; i = i+1){
            System.out.println(fib3(i));
        }
    }

    private static int fib3(int x) {
        int cont = 0;
        int anti = 0;
        int penu = 1;
        while(cont < x){
            int aux = anti;
            anti = penu;
            penu = aux + penu;
            cont += 1;


        }
        return anti;
    }

    private static int fib2(int n) {
        int anti = 0;
        int penu = 1;
        for(int i = 0; i<= n-1; i++ ){
            int aux = anti;
            anti = penu;
            penu = aux + penu;


        }
        return anti;
    }

    private static int fib1(int i) {
        if(i == 0){
            return 0;

        }
        if(i == 1){
            return 1;
        }
        return fib1(i -1 ) + fib1(i -2 );
    }
}
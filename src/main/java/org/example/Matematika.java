package org.example;

public class Matematika {

    public static long Faktorijel (int n){  //koristiti neki veći tip
        long   f = 1;
        while(n != 0){

            f = f * n;
            n --;}
        return f;
        }



    public static double Sinus(double x){
        double sine = 0;
        int znak = 1, stepen = 1;
        x = x * Math.PI / 180; //treba pretvoriti u radijane
        for(int i = 0; i < 10; i ++, stepen += 2){
            sine = sine + (Math.pow(x, stepen)/Faktorijel(stepen)) * znak;
            znak = znak * (-1);

        }

        return sine;

    }


}


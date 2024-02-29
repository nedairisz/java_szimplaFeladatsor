package onallofeladatok;

import java.util.Random;
import java.util.Scanner;

public class NedaIrisz_osszefoglalo {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");
            
    public static void main(String[] args) {
        
        System.out.print("Véltlen szám: ");
        int szam = rnd.nextInt(3, 11);
        System.out.println(szam);
        
        System.out.print("Adj meg egy betűt: ");
        String betu =sc.nextLine();
        while(betu.length()!= 1){
            System.out.print("Csak egy betűt adj meg: ");
            betu =sc.nextLine();
        }
        
        for (int i = 0; i < szam-1 ; i++) {
        System.out.print(betu + ", ");
        }
        System.out.println(betu + " ");
        
        
        final int TOMB_MERET = 5;
        double[] tartalmak;
        tartalmak = new double[TOMB_MERET];
        tartalmak[0] = Math.PI;
        tartalmak[1] = Math.E;
        
        for (int i = 0; i < tartalmak.length; i++) {
            System.out.println(tartalmak[i]);
        }
       
        tartalmak[2]= 1.0/3;
        System.out.println("Nullánál nagyobb értékek:");
        for (int i = 0; i < tartalmak.length ; i++) {
            if (tartalmak[i]>0){
                System.out.println(tartalmak[i]);
            }
        }
        
        tartalmak[3]= rnd.nextDouble(10.11, 19.51);
        tartalmak[4]= rnd.nextDouble(10.11, 19.51);
        System.out.println("Teljesen feltöltött tömb:");
        for (int i = 0; i < tartalmak.length; i++) {
            System.out.println(tartalmak[i]);
        }
    }
    
}

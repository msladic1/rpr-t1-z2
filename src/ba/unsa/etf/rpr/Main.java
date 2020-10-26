package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {
    static int sumaCifara(int n) {
        int suma = 0, cifra, pom = n;
        while(pom != 0) {
            cifra = pom%10;
            suma = suma + cifra;
            pom = pom/10;
        }
        return suma;
    }
    public static void main(String[] args) {

    }
}

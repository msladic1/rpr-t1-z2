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
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

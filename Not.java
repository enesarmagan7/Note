package Letcode;

import java.sql.SQLOutput;
import java.util.*;

public class Not{



    public static void main(String[] args) {
         // Değişkenleri oluştur

        int mat,turkce,fizik,kimya,biyoloji;
        //Scannerı tanımladık
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan değerleri al
        System.out.println("Matematik notunuzu giriniz:");
        mat= input.nextInt();
        System.out.println("Türkçe notunu giriniz:");
        turkce=input.nextInt();
        System.out.println("Fizik notunu giriniz:");
        fizik=input.nextInt();
        System.out.println("Kimya notunu giriniz:");
        kimya=input.nextInt();
        System.out.println("Biyoloji notunu giriniz");
        biyoloji=input.nextInt();

         //Not ortalamasını hesapla

        double score=(mat+turkce+fizik+kimya+biyoloji)/5;

        //Not ortalaması 60'dan büyükse sınıfı geçti  değilse sınıfta kaldı yazdır.

        boolean isPassing=score>60;
        String str= isPassing ? "Sınıfı Geçti":" Sınıfta Kaldı";
        System.out.println("Nout ortalamanız: " +score);
        System.out.println(str);
    }
}

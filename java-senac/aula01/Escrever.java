/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */

import java.util.Scanner;

public class Escrever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, res;
        System.out.println("Digite um numero:");
        n1 = sc.nextInt();
        System.out.println("Digite mais um numero:");
        n2 = sc.nextInt();
        res = n1 + n2;
        
        sc.nextLine();
        System.out.println("Qual seu nome?");
        String nome = sc.next();
        System.out.println(String.format("%s o resultado de %d + %d é %d",nome, n1,n2, res));
        sc.close();
    }
}

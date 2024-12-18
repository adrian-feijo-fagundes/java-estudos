/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();
        System.out.println("Qual sua altura?");
        double altura = sc.nextDouble();
        System.out.println(String.format("Prazer em te conhecer %s, pelo que posso notar voce tem %d anos e %.2f metros de altura.", nome, idade, altura));

        sc.close();
    }
}
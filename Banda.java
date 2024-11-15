/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Banda {
    public static void main(String[] args) {
        Instrumentos teclado = new Teclado();
        Instrumentos bateria = new Bateria();
        Instrumentos violao = new Violao();
        Instrumentos baixo = new Baixo();
        
        teclado.afinar();
        teclado.tocar();
        
        bateria.afinar();
        bateria.tocar();
        
        violao.afinar();
        violao.tocar();
        
        baixo.afinar();
        baixo.tocar();
    }
}

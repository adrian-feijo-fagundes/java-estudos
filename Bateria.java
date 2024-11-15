/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Bateria implements Instrumentos {

    @Override
    public void tocar() {
        System.out.println("BOOM BOOM Ts Ts Ts");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando  a bateria");
    }
    
}

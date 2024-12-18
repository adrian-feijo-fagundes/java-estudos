/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Carro {
	private String modelo;
	private int ano;

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void info() {
		System.out.println("modelo: " + modelo + "\n ano: " + ano );
	}
}

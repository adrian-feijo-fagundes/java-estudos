/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Animal {

	private final String nome;
	private int idade;
	private final String tipo;
	private final Sexo sexo;

	public Animal(String nome, int idade, String tipo, Sexo sexo) {
		this.nome = nome;
		this.idade = idade;
		this.tipo = tipo;
		this.sexo = sexo;
	}
	public void info() {
		System.out.println("Nome: " + nome +"\n Idade: "+ idade + "\n Tipo: " + tipo + "\n Sexo: " + sexo);
	}
	public void fazerAniversario() {
		this.idade++;
	}
	public boolean podemReproduzir(Animal animal) {
		return animal.sexo != this.sexo;
	}
	public Animal reproduzir(Animal animal) {
		if (this.podemReproduzir(animal)) {
			Animal prole = new Animal(this.nome, 0, this.tipo, animal.sexo);
			System.out.println("E assim a linhagem continua...");
			return prole;
		}
		return null;
	}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADRIANFEIJOFAGUNDES
 */
public class Pessoa {
    private String nome;
    private int idade;

    //constructor
    public Pessoa(String nome, int idadeDaPessoa) {
        this.nome = nome;
        idade = idadeDaPessoa;
    }
    
    //metodos
    
    public void apresentar() {
        System.out.println("Me chamo " + nome + " e tenho " + idade + " anos." );
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

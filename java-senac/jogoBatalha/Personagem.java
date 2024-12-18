

public class Personagem {
    private String nome;   
    private int vida;  
    private int ataque;


    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
    }

    public void setNome(String nome)            { this.nome = nome; }
    public void setVida(int vida)               { this.vida = vida; }
    public void setAtaque(int ataque)           { this.ataque = ataque; }
    public String getNome()                     { return this.nome; }
    public  int getVida()                       { return this.vida; }
    public  int getAtaque()                     { return this.ataque; }
    public boolean estaVivo()                   { return vida > 0; }

    public void atacar(Personagem oponente) {

    }
}

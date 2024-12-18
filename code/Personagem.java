package Aula04;

public abstract class Personagem {
    private String nome;   
    private final String tipo;
    private int vida;  
    private int ataque;

    public Personagem(String tipo, String nome, int vida, int ataque) {
	this.tipo = tipo;
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
    }

    public void setNome(String nome)			{ this.nome = nome; }
    public void setVida(int vida)				{ this.vida = vida; }
    public void setAtaque(int ataque)			{ this.ataque = ataque; }	
    public String getNome()					{ return this.nome; }
    public String getTipo()					{ return this.tipo; }
    public  int getVida()						{ return this.vida; }
    public  int getAtaque()					{ return this.ataque; }
    public boolean estaVivo()					{ return vida > 0; }

    public String info() {
	return "Tipo: " + this.tipo + ", nome: " + this.nome + ", ataque: "  + this.ataque + ", vida: " + this.vida;
    }
    public void atacar(Personagem oponente) {
	oponente.vida -= this.ataque;
	System.out.println("\n" + this.nome + " atacou " + oponente.getNome());
	System.out.println("A vida do " + oponente.getNome() + " foi reduzida para " + oponente.getVida());
    }
}



public class App {
    public static void main(String[] args) {
        
        
        //boolean verdadeiro = true;
        //char letra = 'a';
        //int[] arr = {1,2,3,4,5}
        //String[] listaDeCompras = {"Arroz", "Feijão", "Carne"};
                
        String nome = "Joao";
        int idade = 25;
        double minhaAltura = 1.80;
        /*
            %s para strings (meuNome)
            %c para caracteres (minhaInicial)
            %d para inteiros (minhaIdade)
            %.2f para números decimais com 2 casas decimais (minhaAltura)
            %b para valores booleanos (souAluno)
        */ 
        String mensagem = String.format(
                "Nome: %s \n Idade: %d \n Altura: %.2f \n"
                , nome, idade, minhaAltura);
        
        System.out.println(mensagem);
    }    
}
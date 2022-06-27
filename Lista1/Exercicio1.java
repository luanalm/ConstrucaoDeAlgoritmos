import java.util.Scanner; // adicionado leitor de texto

public class Exercicio1 { // arquivo a ser executado
  public static void main(String[] args) { 
    String nom; // definindo o nome da var string
    Scanner ler = new Scanner(System.in); // comando para usar o leitor

    System.out.print("Nome Completo: "); // print a ser respondido
    nom = ler.nextLine(); // leitor registra o valor do string nom

    System.out.println("Seu nome é " + nom); // mostrando o valor registrado pelo string nom
    }
}



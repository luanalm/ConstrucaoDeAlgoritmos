import java.util.Scanner; // adicionado leitor de texto

public class Exercicio1 { // arquivo a ser executado
  public static void main(String[] args) { 
    String nom; // definido o nome da var string como nom
    Scanner ler = new Scanner(System.in); // comando para usar o leitor definido como ler

    System.out.print("Nome Completo: "); // print a ser respondido
    nom = ler.nextLine(); // leitor registra o valor da variável nom

    System.out.println("Seu nome é " + nom); // mostrando o valor registrado pelo string nom
    }
}



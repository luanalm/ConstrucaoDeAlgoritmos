import java.util.Scanner; //adicionado leitor de texto

public class Exercicio1 {
  public static void main(String[] args) {
    String nom;
    Scanner ler = new Scanner(System.in);

    System.out.print("Nome Completo: ");
    nom =ler.nextLine();

    System.out.println("Seu nome é " + nom);
    }
}



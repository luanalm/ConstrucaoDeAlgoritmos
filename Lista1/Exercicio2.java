import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    char alf;
    Scanner ler;
    ler = new Scanner(System.in);

    System.out.print("Escolha uma letra do alfabeto: ");
    alf = ler.next().charAt(0);

    System.out.println("Você escolheu a letra: " + alf);
    
    }
}


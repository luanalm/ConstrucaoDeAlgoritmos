import java.util.Scanner; // adicionado leitor de texto

public class Exercicio2 {
  public static void main(String[] args) {
    char alf; // definido a var char como alf
    Scanner ler = new Scanner(System.in); // comando para usar o leitor definido como ler

    System.out.print("Escolha uma letra do alfabeto: "); // print a ser respondido
    alf = ler.next().charAt(0); // leitor registra o valor da variável alf

    System.out.println("Você escolheu a letra: " + alf); // mostra o valor da variável alf
    
    }
}


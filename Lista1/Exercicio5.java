import java.util.Scanner;

class Exercicio5 {
  public static void main(String[] args) {
    int x, ant, suc;
    Scanner ler = new Scanner(System.in);

    System.out.print("Escolha um número inteiro: ");
    x = ler.nextInt();

    ant = x - 1;
    suc = x + 1;

    System.out.println("Seu antecessor é: " + ant);
    System.out.println("Seu sucessor é: "+ suc);
    
    }
}


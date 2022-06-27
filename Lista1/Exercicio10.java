import java.util.Scanner;

class Exercicio10 {
  public static void main(String[] args){

    String n;
    int i;
    float p, a;
    Scanner ler = new Scanner(System.in);

    System.out.print("Seu nome: ");
    n = ler.nextLine();
    System.out.print("Idade: ");
    i = ler.nextInt();
    System.out.print("Peso: ");
    p = ler.nextFloat();
    System.out.print("Altura: ");
    a = ler.nextFloat();

    System.out.println("Ficha Pessoal");
    System.out.println("Nome: " + n);
    System.out.println("Idade: " + i + " anos");
    System.out.println("Peso: " + p + " kg");
    System.out.println("Altura: " + a + " m");
    
    }
}


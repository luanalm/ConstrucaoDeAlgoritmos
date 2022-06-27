import java.util.Scanner;

class Exercicio3 {
  public static void main(String[] args) {
    int num, dob;
    Scanner ler = new Scanner(System.in);

    System.out.print("Escolha um número: ");
    num = ler.nextInt();

    dob = num * 2;
    
    System.out.print("O dobro deste número é: " + dob);
    }
}

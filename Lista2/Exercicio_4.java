import java.util.Scanner;

class Exercicio_4 {
  public static void main(String[] args) {
    
    int n1, n2, n3, n4;
    int med;
    Scanner ler = new Scanner(System.in);

    System.out.println(" ");
    
    System.out.print("Nota 1: ");
    n1 = ler.nextInt();

    System.out.print("Nota 2: ");
    n2 = ler.nextInt();

    System.out.print("Nota 3: ");
    n3 = ler.nextInt();

    System.out.print("Nota 4: ");
    n4 = ler.nextInt();

    med = (n1 + n2 + n3 + n4)/4;

    System.out.println(" ");
    System.out.println("Sua média foi: " + med);

    if (med >= 7){
      System.out.println("Aluno aprovado");
    } else if (med < 7 && med >= 5){
      System.out.println("Aluno ficou de recuperação");
    } else {
      System.out.println("Aluno reprovado");
    }
    
  }
}


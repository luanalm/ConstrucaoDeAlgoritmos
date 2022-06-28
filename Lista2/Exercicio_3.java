import java.util.Scanner;

class Exercicio_3 {
  public static void main(String[] args) {
    int n1, n2, n3;
    int nt, m;
    Scanner ler = new Scanner(System.in);

    System.out.print("Nota 1: ");
    n1 = ler.nextInt();

    System.out.print("Nota 2: ");
    n2 = ler.nextInt();

    System.out.print("Nota 3: ");
    n3 = ler.nextInt();

    nt = n1 + n2 + n3;
    m = nt / 3;

    if(m >= 7){
      System.out.print("Aluno aprovado");
    } else {
      System.out.print("Aluno reprovado");
    }
    
  }
}


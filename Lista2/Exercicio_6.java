import java.util.Scanner;

class Exercicio_6 {
  public static void main(String[] args) {
    int p1, p2, p3, p4;
    float n1, n2, n3, n4;
    double med;
    Scanner ler = new Scanner(System.in);

    System.out.println(" ");

    System.out.print("Nota 1: ");
    n1 = ler.nextFloat();
    System.out.print("Peso 1: ");
    p1 = ler.nextInt();

    if(n1 >= 0 && n1 <= 10){
      System.out.print("Nota 2: ");
      n2 = ler.nextFloat();
      System.out.print("Peso 2: ");
      p2 = ler.nextInt();
      
      if(n2 >= 0 && n2 <= 10){
      System.out.print("Nota 3: ");
      n3 = ler.nextFloat();
      System.out.print("Peso 3: ");
      p3 = ler.nextInt();

        if(n3 >= 0 && n3 <= 10){
        System.out.print("Nota 4: ");
        n4 = ler.nextFloat();
        System.out.print("Peso 4: ");
        p4 = ler.nextInt();

          if(n4 >= 0 && n4 <= 10){
          med = ((n1*p1)+(n2*p2)+(n3*p3)+(n4*p4))/(p1+p2+p3+p4);

          System.out.println(" ");
          System.out.println("Sua média foi: " + med);

            if (med >= 7){
            System.out.println("Aluno aprovado");
            } else if (med < 7 && med >= 5){
            System.out.println("Aluno ficou de recuperação");
            } else {
            System.out.println("Aluno reprovado");
            }

          } else {
          System.out.print("Nota 4 inválida, tente de novo");
          }
        
        } else {
        System.out.print("Nota 3 inválida, tente de novo");
        }
        
      } else {
      System.out.print("Nota 2 inválida, tente de novo");
      }
      
    } else {
    System.out.print("Nota 1 inválida, tente de novo");
    }

  }
}
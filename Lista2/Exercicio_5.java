import java.util.Scanner;

class Exercicio_5 {
  public static void main(String[] args) {
    
    float n1, n2, n3, n4;
    double m;
    Scanner ler = new Scanner(System.in);

    System.out.println(" ");

    System.out.print("Nota 1: ");
    n1 = ler.nextFloat();

    if(n1 >= 0 && n1 <= 10){
      System.out.print("Nota 2: ");
      n2 = ler.nextFloat();
      
      if(n2 >= 0 && n2 <= 10){
      System.out.print("Nota 3: ");
      n3 = ler.nextFloat();

        if(n3 >= 0 && n3 <= 10){
        System.out.print("Nota 4: ");
        n4 = ler.nextFloat();

          if(n4 >= 0 && n4 <= 10){
          m = (n1+n2+n3+n4)/4;

          System.out.println(" ");
          System.out.println("Sua média foi: " + m);

            if (m >= 7){
            System.out.println("Aluno aprovado");
            } else if (m < 7 && m >= 5){
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
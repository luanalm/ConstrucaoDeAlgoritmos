import java.util.Scanner;

class Exercicio8 {
    public static void main(String[] args){

    float n1, n2, n3, n4;
    float s, m;
    Scanner ler = new Scanner(System.in);
  
    System.out.print("Primeiro bimestre: ");
    n1 = ler.nextFloat();
  
    System.out.print("Segundo bimestre: ");
    n2 = ler.nextFloat();
  
    System.out.print("Terceiro bimestre: ");
    n3 = ler.nextFloat();
  
    System.out.print("Quarto bimestre: ");
    n4 = ler.nextFloat();
  
    s = n1 + n2 + n3 + n4;
    m = s / 4;
  
    System.out.println("Sua média foi: " + m);
      
    }
  }


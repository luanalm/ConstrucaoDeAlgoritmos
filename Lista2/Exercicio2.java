import java.util.Scanner;

class Exercicio2 {
  public static void main(String[] args) {
    int num;
    Scanner ler = new Scanner(System.in);

    System.out.print("Escolha um número: ");
    num = ler.nextInt();

    if(num > 25){
      System.out.print("O número escolhido é maior que 25");
    } else if(num < 3){
      System.out.print("O número escolhido é menor que 3");
    } else {
      System.out.print("O número escolhido está entre 3 e 25");
    }
    
  }
}



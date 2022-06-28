import java.util.Scanner;

class Exericio1 {
  public static void main(String[] args) {

    int num;
    Scanner ler = new Scanner(System.in);

    System.out.print("Escolha um número: ");
    num = ler.nextInt();

    if(num <= 200 && num >= 100){
      System.out.print("Voce digitou um numero entre 100 e 200");
    }
    else{
      System.out.print("Você digitou um número fora da faixa entre 100 e 200");
    }
  }
}


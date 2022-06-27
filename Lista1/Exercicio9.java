import java.util.Scanner;

class Exercicio9 {
public static void main(String[] args){
  float p1, p2;
  float val;
  Scanner ler = new Scanner(System.in);

  System.out.print("Valor do primeiro produto: ");
  p1 = ler.nextFloat();

  System.out.print("Valor do segundo produto: ");
  p2 =  ler.nextFloat();

  val = p1 + p2;

  System.out.print("Valor total da compra: " + val);
  
  }
}


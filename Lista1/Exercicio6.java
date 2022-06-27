import java.util.Scanner;

class Exercicio6 {
public static void main(String[] args){
  int v1, v2;
  int so, su, m, d;
  Scanner ler = new Scanner(System.in);
  
  System.out.print("Digite um número: ");
  v1 = ler.nextInt();

  System.out.print("Digite outro número: ");
  v2 = ler.nextInt();

  so = v1 + v2;
  su = v1 - v2;
  m = v1 * v2;
  d = v1 / v2;
  
  System.out.println("A soma é " + so);
  System.out.println("A subtração é " + su);
  System.out.println("A multiplicação é " + m);
  System.out.println("A divisão é " + d);
  
  }
}


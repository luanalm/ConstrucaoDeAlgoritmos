import java.util.Scanner;

class Exercicio7 {
  public static void main(String[] args){
    double cel, fah;
    Scanner ler = new Scanner(System.in);

    System.out.print("Insira a temperatura em graus Celsius: ");
    cel = ler.nextFloat();

    fah = ((cel*1.8)+32);

    System.out.println("A temperatura em Fahrenheit é: " + fah);
    }
}


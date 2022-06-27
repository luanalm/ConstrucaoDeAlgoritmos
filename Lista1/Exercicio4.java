import java.util.Scanner; // adicionado o leitor de texto

class Exercicio4 {
  public static void main(String[] args) {
    int b, h, ar; // definido três variáveis, b para base, h para altura e ar para área
    Scanner ler = new Scanner(System.in); // definido o comando do leitor como ler

    System.out.print("Altura do retângulo: "); // pede o valor de h
    h = ler.nextInt(); // regista o valor da variável h

    System.out.print("Base do retângulo: "); // pede o valor de b
    b = ler.nextInt(); // registra o valor da variável b

    ar = h * b; // cálculo da área, sendo a altura vezes a base

    System.out.println("A área desse retângulo é: " + ar); // mostra o resultado do cálculo da área
    
    }
}


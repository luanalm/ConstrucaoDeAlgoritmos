import java.util.Scanner; // adicionado o leitor de texto

class Exercicio3 {
  public static void main(String[] args) {
    int num, dob; // definido os nomes de duas variáveis int
    Scanner ler = new Scanner(System.in); // definido o comando do leitor como ler

    System.out.print("Escolha um número: "); // print a ser respondido
    num = ler.nextInt(); // leitor regista o valor da variável num

    dob = num * 2; // operação para obter o dobro do número registrado pelo usuário
    
    System.out.print("O dobro deste número é: " + dob); // mostra o dobro da variável num

    }
}

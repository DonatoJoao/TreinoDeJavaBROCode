package NestedLoop;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int linhas;
        int colunas;
        String simbolo = "";

        System.out.println("Digite o número de linhas: ");
        linhas = scanner.nextInt();
        System.out.println("Digite o número de colunas");
        colunas = scanner.nextInt();
        System.out.println("Digite um simbolo para preencher o loop aninhado: ");
        simbolo = scanner.next();

        for (int i = 1; i <= linhas; i++) {
            System.out.println();
            for (int j = 1; j <= colunas; j++) {
                System.out.print(simbolo);
            }
        }
    }
}

package org.example;

import java.util.Scanner;

public class Main {

    public static String verificarLadosNegativos(int lado1, int lado2, int lado3) {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
            return "Erro ao verificar lados negativos";
        }
        return "Passou";
    }

    public static String verificarTipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            return "Valor informado nao forma triangulo";
        }

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilatero"; // Triângulo Equilátero
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isosceles"; // Triângulo Isósceles
        } else {
            return "Escaleno"; // Triângulo Escaleno
        }
    }



        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor dos 3 lados:");
        String entrada = scanner.nextLine();
        String[] valores = entrada.split(" ");

        int lado1 = Integer.parseInt(valores[0]);
        int lado2 = Integer.parseInt(valores[1]);
        int lado3 = Integer.parseInt(valores[2]);

        // Verificando e classificando o tipo do triângulo
        String result = verificarLadosNegativos(lado1, lado2, lado3);


        String resultado = verificarTipoTriangulo(lado1, lado2, lado3);

        System.out.println(resultado);

        scanner.close();
    }

}
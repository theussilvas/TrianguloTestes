package com.org.example.test;

import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class appTest {

    @Test
    public void testTrianguloEquilatero(){
        int lado1 = 3,lado2 = 3,lado3 = 3;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Equilatero", resultado);
    }

    @Test
    public void testTrianguloIsosceles(){
        int lado1 = 5,lado2=5,lado3=3;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Isosceles", resultado);
    }

    @Test
    public void testTrianguloValorNegativo(){
    int lado1 = -8, lado2 = 3, lado3 = 3;
    String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
    assertEquals("O triangulo nao pode ter lados negativos", resultado);
    }

    @Test
    public void testTrianguloValorNegativo2(){
        int lado1 = 8, lado2 = -3, lado3 = 3;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("O triangulo nao pode ter lados negativos", resultado);
    }

    @Test
    public void testTrianguloValorNegativo3(){
        int lado1 = 0, lado2 = 3, lado3 = 3;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Valor informado nao forma triangulo", resultado);
    }

    @Test
    public void testTrianguloValorNegativo4(){
        int lado1 = -3, lado2 = -3, lado3 = -3;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("O triangulo nao pode ter lados negativos", resultado);
    }





    @Test
    public void testTrianguloValoresExtremos(){
        int lado1 = 5, lado2 = 5, lado3 = 250;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Valor informado nao forma triangulo", resultado);
    }

    @Test
    public void testTrianguloTriangulo2(){
        int lado1 = 250, lado2 = 5, lado3 = 1;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Valor informado nao forma triangulo", resultado);
    }

    //Análise de valor limite

    @Test
    public void testTrianguloEquilateroValorMin(){
        int lado1 = 1, lado2 = 1, lado3 = 1;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Equilatero", resultado);
    }

    @Test
    public void testTrianguloEquilateroValorMax(){
        int lado1 = 1000, lado2 = 1000, lado3 = 1000;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Equilatero", resultado);
    }

    @Test
    public void testTrianguloIsoscelesValorMin(){
        int lado1 = 2, lado2 = 2, lado3 = 3;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Isosceles", resultado);
    }

    @Test
    public void testTrianguloIsoscelesValorMax(){
        int lado1 = 1000, lado2 = 1000, lado3 = 1500;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Isosceles", resultado);
    }

    @Test
    public  void testTrianguloEscalenoValorMin(){
        int lado1 = 2, lado2 = 3, lado3 = 4;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Escaleno", resultado);
    }

    @Test
    public  void testTrianguloEscalenoValorMax(){
        int lado1 = 999, lado2 = 1000, lado3 = 1001;
        String resultado = Main.verificarTipoTriangulo(lado1,lado2,lado3);
        assertEquals("Escaleno", resultado);
    }
}



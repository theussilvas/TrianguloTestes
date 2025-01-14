
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


    }
}



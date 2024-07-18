package es.cic.curso.ejercicioreloj;

import es.cic.curso.ejercicioreloj.EjercicioReloj.Calculadora;
import es.cic.curso.ejercicioreloj.EjercicioReloj.Reloj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class RelojTest

{
    private Calculadora dependencia;
    private Reloj cut;

    @BeforeEach
    public void setup() {
        // Construimos el reloj
        cut = new Reloj();
        //objeto interfaz calculadora= 
        dependencia = mock(Calculadora.class);
        cut.setCalculadora(dependencia);
    }

    @Test
    public void testCalcularMinutosDelDia() {

        when(dependencia.multiplicar(5, 60)).thenReturn(300);
        when(dependencia.sumar(15, 300)).thenReturn(315);

        int resultado = cut.CalculoMinutoDelDia(5, 15);
        assertEquals(315, resultado, "El minuto del día no es el correcto");
    
        /*
        mock
        Verificacion:verificamos que sobre el mock se ha incovado al metodo add 
        -Si ha sido invocado ese metodo no hace nada 
        **/

        //-verificame que sobre la dependencia del metodo multiplicar se ha llamado con 5 y 60
        verify(dependencia,times(1)).multiplicar(5, 60);
        //-verificame que sobre la dependencia del metodo suma se ha llamado con 15 y 300
        verify(dependencia).sumar(15, 300);
    
    }

}

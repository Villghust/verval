package teste.exercicios;

import org.junit.Assert;
import org.junit.Test;
import source.exercicio.Exercicio2;

public class TesteExercicio2 {

    @Test
    public void teste() {
        Integer valorInvalido = Exercicio2.pagamento(0.0, "regular");
        Assert.assertEquals(Integer.valueOf(1), valorInvalido);
    }

}

package teste.exercicios;

import org.junit.Assert;
import org.junit.Test;
import source.exercicio.Exercicio1;

public class TesteExercicio1 {

    @Test
    public void exercicio1Red() {
        String vermelho = Exercicio1.selecionaCor(Integer.valueOf(1));
        Assert.assertEquals("RED", vermelho);
    }

    @Test
    public void exercicio1Yellow() {
        String amarelo = Exercicio1.selecionaCor(Integer.valueOf(2));
        Assert.assertEquals("YELLOW", amarelo);
    }

    @Test
    public void exercicio1Blue() {
        String azul = Exercicio1.selecionaCor(Integer.valueOf(3));
        Assert.assertEquals("BLUE", azul);
    }

    @Test
    public void exercicio1Violet() {
        String violeta = Exercicio1.selecionaCor(Integer.valueOf(4));
        Assert.assertEquals("VIOLET", violeta);
    }

    @Test
    public void exercicio1DigitoInvalido() {
        String digitoInvalido = Exercicio1.selecionaCor(Integer.valueOf(11));
        Assert.assertEquals("", digitoInvalido);
    }

    @Test(expected = NumberFormatException.class)
    public void exercicio1Vazio() {
        String vazio = Exercicio1.selecionaCor(Integer.valueOf(null));
    }

}

package source.exercicio;

public class Exercicio1 {

    public static String selecionaCor(int cor) {
        switch (cor) {
            case 1:
                return "RED";
            case 2:
                return "YELLOW";
            case 3:
                return "BLUE";
            case 4:
                return "VIOLET";
            default:
                return "";
        }
    }

}

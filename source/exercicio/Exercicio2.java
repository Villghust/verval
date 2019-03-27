package source.exercicio;

public class Exercicio2 {

    public static Integer pagamento(double valor, String status) {
        try {
            if(!validaValor(valor)) {
                return 1;
            } else if(validaStatus(status)) {
                return 2;
            }
            return 0;
        } catch(Exception e) {
            return 5;
        }
    }

    private static Boolean validaValor(double valor) {
        if(valor < 0.01 || valor > 99999.00) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    private static Boolean validaStatus(String status) {
        if(status.equals("regular")
                || status.equals("estudante")
                || status.equals("aposentado")
                || status.equals("VIP")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}

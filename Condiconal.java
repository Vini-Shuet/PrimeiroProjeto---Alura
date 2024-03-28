public class Condiconal {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Lançado recentemente");
        } else {
            System.out.println("Filme antigo");
        }

        //pelo menos um das duas condicoes precisa ser verdade '||'
        //as duas condicoes devem ser verdadeiras '&&'
        if (tipoPlano.equals("plus") && incluidoPlano == true) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar");
        }

    }
}

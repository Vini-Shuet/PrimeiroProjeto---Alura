public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Scream Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoLancamento);
        boolean incluidoPlano = true;
        double notaFilme = 8.1;

        //Comentario
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura
                Muito bom!
                Ano de Lancamento
                """ + anoLancamento;
        System.out.println(sinopse);

        //Casting, conversao de valores
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}
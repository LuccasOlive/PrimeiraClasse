public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Sreen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
//Media calculadas pelas notas de Luccas, Andrezza, Gorette.
        double media = (9.8 + 7.5 + 6.3) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de aventura com Tom Cruse
                Continuação de filme dos anos 80º
                Venha assistir
                ano de lançamento 
                """ + ano;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}
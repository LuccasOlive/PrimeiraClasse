public class Condicional {
    public static void main(String[] args) {

        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoplano = "plus";

        if (ano >= 2023){
            System.out.println("Filmes mais vistos!");
        } else {
            System.out.println("Filme que ainda vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoplano.equals("plues")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println(" Seu Plano não e aceito para esse filme");
        }

    }
}

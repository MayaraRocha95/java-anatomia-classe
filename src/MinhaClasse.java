public class MinhaClasse {

    public static void main (String [] args){
        String primeiroNome = "Mayara";
        String segundoNome = "Rocha";

        int anoFabricacao = 2023;

        boolean verdadeira = false;

        anoFabricacao = 2022;

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome ){
        return "Resultado do Método igual a " + primeiroNome.concat(" ").concat(segundoNome);
    }
}



package errado;

import certo.PessoaCerta;

public class Main {

    public static void main(String args[]) {

        String errado="Essa String esta errada";
        String errado1= "Essa String esta errada";
        String errado2 ="Essa String esta errada";

        String certo1      =   "certo!!";
        String certo2      =   "Também certo!!";

        String certo3 = "Essa String esta certa!!";

        System.out.println(errado);
        System.out.println(errado1);
        System.out.println(errado2);
        System.out.println(certo1);
        System.out.println(certo2);
        System.out.println(certo3);

        PessoaCerta pessoaCerta = new PessoaCerta("Anna","of Arandelle", 18);

        PessoaErrada pessoaErrada = new PessoaErrada("Elsa","of Arandelle", 21);

    }

    private void justAWrongMethod()
    {

    }

}
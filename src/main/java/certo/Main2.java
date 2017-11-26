package certo;

import errado.PessoaErrada;

/**
 * Classe Main2 certa de acordo com os padrões da Sun. (Checkstyle)
 */
public final class Main2 {

    /**
     * Contrutor privado da classe Main2.
     */
    private Main2() { }

    /**
     * Méetodo main da Classe Main2.
     * @param args Parametros vindos do terminal.
     */
    public static void main(final String[] args) {
        final int annasAge = 18;
        PessoaCerta pessoaCerta = new PessoaCerta("Anna",
                "of Arandelle", annasAge);

        final int elsasAge = 21;
        PessoaErrada pessoaErrada = new PessoaErrada("Elsa",
                "of Arandelle", elsasAge);

    }

}

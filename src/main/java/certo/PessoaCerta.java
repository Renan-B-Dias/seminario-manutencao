package certo;

/**
 * Classe pessoa que segue os padrões da Sun. (Checkstyle)
 */
public final class PessoaCerta {

    /**
     * Nome da pessoa.
     */
    private String name;

    /**
     * Sobre nome da pessoa.
     */
    private String surName;

    /**
     * Idade da pessoa.
     */
    private Integer age;

    /**
     * Construtor padrão.
     */
    public PessoaCerta() {

    }

    /**
     * Construtor que recebe nome da pessoa, sobrenome e idade.
     * @param personName Nome da pessoa.
     * @param personSurname Sobre nome da pessoa.
     * @param personAge Idade da pessoa.
     */
    public PessoaCerta(final String personName,
                       final String personSurname,
                       final Integer personAge) {
        this.name = personName;
        this.surName = personSurname;
        this.age = personAge;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surName + " " + this.age;
    }

    /**
     * Método getter do atributo name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter do atributo name.
     * @param personName Nome da pessoa.
     */
    public void setName(final String personName) {
        this.name = name;
    }

    /**
     * Método getter do atributo surName.
     * @return surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Método setter do atributo surName.
     * @param personSurName Sobre nome da Pessoa.
     */
    public void setSurName(final String personSurName) {
        this.surName = surName;
    }

    /**
     * Método getter do atributo age.
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Método setter do atributo age.
     * @param personAge Idade da pessoa.
     */
    public void setAge(final Integer personAge) {
        this.age = age;
    }

}

package errado;

public class PessoaErrada
{

    public String name;
    public String surName;



    public Integer age;

    public PessoaErrada()
    {

    }

    public PessoaErrada(String name, String surName, Integer age)
    {
        this.name = name;
        this.age = age;
        this.surName = surName;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.surName + " " + this.age;
    }

}

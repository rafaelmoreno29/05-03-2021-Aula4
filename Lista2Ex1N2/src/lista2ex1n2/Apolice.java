/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex1n2;

/**
 *
 * @author Moreno
 */
public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }
    public double calcularValor(){        
        if(getSexo() == 'M' && getIdade() <= 25)
            return getValorAutomovel() * 10/100;
        else if(getSexo() == 'M' && getIdade() > 25)
            return getValorAutomovel() * 5/100;
        else
            return getValorAutomovel() * 2/100;
    }
    public String imprimir(){
        return "Número: " + getNumero() +"\n"
                + "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Valor Auto.: " + getValorAutomovel() + "\n"
                + "Valor Apólice: " + calcularValor();
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the valorAutomovel
     */
    public double getValorAutomovel() {
        return valorAutomovel;
    }

    /**
     * @param valorAutomovel the valorAutomovel to set
     */
    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    
}

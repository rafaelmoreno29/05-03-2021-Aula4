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
        if(sexo == 'M' && idade <= 25)
            return valorAutomovel * 10/100;
        else if(sexo == 'M' && idade > 25)
            return valorAutomovel * 5/100;
        else
            return valorAutomovel * 2/100;
    }
    public String imprimir(){
        return "Número: " + numero +"\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Sexo: " + sexo + "\n"
                + "Valor Auto.: " + valorAutomovel + "\n"
                + "Valor Apólice: " + calcularValor();
    }
}

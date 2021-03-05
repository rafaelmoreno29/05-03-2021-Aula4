/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex1n2;

import javax.swing.JOptionPane;

/**
 *
 * @author Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0;
        int numero, idade;
        String nome;
        char sexo;
        double valorAuto;
        Apolice apolice = null;
        while(opc != 3){
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("1 - Criar Apólice\n2 - Mostrar Apólice\n3 - Sair"));
            switch(opc){
                case 1: 
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
                    nome = JOptionPane.showInputDialog("Nome");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
                    sexo = JOptionPane.showInputDialog("Sexo").toUpperCase().charAt(0);
                    valorAuto = Double.parseDouble(JOptionPane.showInputDialog("Valor automóvel"));
                    apolice = new Apolice(numero, nome, idade, sexo, valorAuto);
                    break;
                case 2: 
                    if(apolice != null)
                        JOptionPane.showMessageDialog(null, apolice.imprimir());
                    else
                        JOptionPane.showMessageDialog(null, "Nenhuma Apólice cadastrada.", "Atenção", 
                                                                            JOptionPane.WARNING_MESSAGE);                    
                    break;
                case 3: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida","Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
}

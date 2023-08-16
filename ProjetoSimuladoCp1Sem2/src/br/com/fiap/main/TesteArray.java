package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;


public class TesteArray {
	//metodo static
			static String texto(String j) {
				return JOptionPane.showInputDialog(j);
			}
			static int inteiro(String j) {
				return Integer.parseInt(JOptionPane.showInputDialog(j));
			}
			static double decimal(String j) {
				return Double.parseDouble(JOptionPane.showInputDialog(j));
			}
			static float racional(String j) {
				return Float.parseFloat(JOptionPane.showInputDialog(j));
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Cadastro> listaCadastro = new ArrayList<Cadastro>();
		 Cadastro objCadastro;
		 
		 do {
			 // entrada
			 objCadastro = new Cadastro();
			 objCadastro.setNome(texto("Digite seu nome: "));
			 objCadastro.setIdade(inteiro("Digite a sua idade: "));
			 objCadastro.setAltura(racional("Digite a sua altura"));
			 objCadastro.setRg(texto("Digite seu RG: "));
			 // Escolha entre adicionar ou encerrar
		 } while (JOptionPane.showConfirmDialog(null, "Realizar um novo Cadastro?", "Informações do novo Usuário",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		 	// Saída
		 for (Cadastro c: listaCadastro) {
			 System.out.println("Nome: " + c.getNome() +
					 "Idade: " + c.getIdade() +
					 "Altura: " + c.getAltura() +
					 "RG: " + c.getRg());
		 }
		 
		 
		 
		 

	}

}

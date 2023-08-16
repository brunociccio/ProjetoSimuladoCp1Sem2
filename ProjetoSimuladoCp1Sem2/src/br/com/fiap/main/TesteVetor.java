package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cadastro;
import br.com.fiap.beans.PessoaJuridica;

public class TesteVetor {
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
		Cadastro[] vetorCadastro = new Cadastro[3];
		
		int indice = 0;
		
		do {
			// instanciar objeto
			vetorCadastro[indice] = new Cadastro();
			vetorCadastro[indice].setNome(texto("Informe o seu nome: "));
			vetorCadastro[indice].setRg(texto("Informe o seu RG: "));
			vetorCadastro[indice].setIdade(inteiro("Informe a sua idade: "));
			vetorCadastro[indice].setAltura(racional("Informe a sua altura: "));

			indice++;

		} while (JOptionPane.showConfirmDialog(null, "Realizar um novo Cadastro?", "Informações do novo Usuário",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		for (int contador = 0; contador < indice; contador++) {
			System.out.println("Nome: " + vetorCadastro[contador].getNome() + 
					"\nRG: " + vetorCadastro[contador].getRg() + 
					"\nIdade: " + vetorCadastro[contador].getIdade() +
					"\nAltura: " + vetorCadastro[contador].getAltura() + "\n");
		}
		
		

	}

}

package view;

import javax.swing.JOptionPane;

import controller.SomaVetor;

public class Principal_vetor {

	public static void main(String[] args) {
		SomaVetor soma = new SomaVetor();
		int tamanho;
		
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
		
		int vetor[] = new int[tamanho];
		
		for(int i=0; i< vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
		}

		for(int i=0; i< vetor.length; i++) {
			System.out.println((i+1) + "º valor: " + vetor[i]);
		}
		
		System.out.println("a soma do vetor é: " + soma.somaVetor(vetor, tamanho));
	}

}

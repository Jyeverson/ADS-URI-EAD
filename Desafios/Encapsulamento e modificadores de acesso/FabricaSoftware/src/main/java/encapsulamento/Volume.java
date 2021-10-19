package encapsulamento;

/* 
Você trabalha como analista/programador em uma fábrica de software e foi
encarregado de criar uma aplicação que calcule o volume de concreto para o
trabalho com vigas em construção civil. Sabe-se que a fórmula para o cálculo
deste volume é (base x altura x comprimento).

O cliente necessita de uma aplicação que solicite, via caixa de diálogo, os
dados referentes à base, altura e comprimento das vigas a serem trabalhadas e
seja informado o resultado através de uma caixa de mensagem.

Sua tarefa é implementar esta aplicação em uma linguagem de programação
orientada a objetos; faça uso das técnicas de encapsulamento.
*/

import javax.swing.JOptionPane;
/**
 *
 * @author jyeverson.madalozo
 */
public class Volume {
    
    private Float base;
    private Float altura;
    private Float comprimento;
    
  public void CalcularVolume(Float base, Float altura, Float comprimento){
      
      base = Float.parseFloat(
              JOptionPane.showInputDialog(
                      "Digite a base das vigas a serem trabalhadas: "
              ));
      altura = Float.parseFloat(
              JOptionPane.showInputDialog(
                      "Digite a altura das vigas a serem trabalhadas: "
              ));
      comprimento = Float.parseFloat(
              JOptionPane.showInputDialog(
                      "Digite o comprimento das vigas a serem trabalhadas: "
              ));
      
      this.base = base;
      this.altura = altura;
      this.comprimento = comprimento;
              
              
   JOptionPane.showMessageDialog(
           null,
           "O volume total de concreto é de: " +
                   this.base * this.altura * this.comprimento
   );
              
    }
    
}

package encapsulamento;

/* 
You work as an analyst / programmer in a software factory and was in charge of
creating an application that calculates the volume of concrete for the work
with beams in civil construction. It is known that the formula for the
calculation of this volume is (base x height x length).

The customer needs an application that requests, via a dialog box, the
data regarding the base, height and length of the beams to be worked and
the result is informed through a message box.

Your task is to implement this application in a programming language
object-oriented; make use of encapsulation techniques.
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

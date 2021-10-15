/*

You work as an analyst/programmer in a software factory and have been tasked with servicing
a customer who has a machine shop. The customer needs to automate the vehicle maintenance
process, that is, control the customers and the vehicles they bring for maintenance.
To do so, it will be necessary to build a customer record that stores the following
information: cpf, name, address, phone and e-mail; you will also need a vehicle registry that
stores the following information: license plate, model, year, manufacturer and color. To do so,
you will need to create two packages, one called model and one called control.

/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/

In the model package, place the model classes, and in the control package, place the class that
will contain the main method. You can put the name of the class as Main, and it will be used to
instantiate the model classes and start the program. Use an object-oriented programming language
to perform the task.

*/

package pacote;

import modelo.Cliente;
import modelo.Veiculo;

/**
 *
 * @author jyeverson.madalozo
 */

public class Principal {
    public static void main(String [] args){
    Cliente cliente = new Cliente();
    Veiculo veiculo = new Veiculo();
    
    cliente.Cliente("0xx-1111-1111", "Jyeverson", "Rua tal", "000000000", "jyeverson@dominio.com");
    veiculo.Veiculo("NULL-0000", "Fuscao", 1934, "Volkswagen", "Azulao", cliente);
   
    System.out.println("Cliente: " + veiculo.toString());
    
     }
}
/*

Working with static methods and attributes can bring us many advantages, such as code savings.
However, it is important to have a good knowledge of the subject to apply in our projects.

You work as an analyst/programmer in a software factory and have been tasked with servicing a
customer from a factory. The customer needs to know if the quantity he produces each month,
added to the initial stock, can meet the monthly demand. However, the application is not running.
With preliminary analysis, you found that ​​the problem is in the “Production” class.

Check the class code and fix the problem.

*/

/**
 *
 * @author jyeverson.madalozo
 */

public class Producao {
    static int previsaoDemanda = 200;
    static int producaoNormal = 250;
    static int estoqueInicial = 50;
    static int estoqueFinal;

    public static void main(String[] args) {
        
        estoqueFinal = (estoqueInicial + producaoNormal) - previsaoDemanda;
        
        System.out.print("O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");
    }

}
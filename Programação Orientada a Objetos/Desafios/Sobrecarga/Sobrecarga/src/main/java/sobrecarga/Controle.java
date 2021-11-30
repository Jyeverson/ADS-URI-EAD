package sobrecarga;
/**
 *
 * @author jyeverson.madalozo
 */
public class Controle extends Area {
        
    public static void main(String [] args){
 
    Area area = new Area();
    int quadrado = area.quadrado(3);
    int retangulo = area.retangulo(5,7);
    int trapezio = area.trapezio(6, 12, 8);
    
    System.out.println("A área do quadrado é: " + quadrado);
    System.out.println("A área do retangulo é: " + retangulo);
    System.out.println("A área do trapezio é: " + trapezio);
    
    }
    
    
}

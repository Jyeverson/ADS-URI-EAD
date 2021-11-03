/*

Você trabalha como analista/programador em uma fábrica de software e foi
encarregado de criar uma aplicação para realizar o cálculo da área de
determinadas figuras geométricas, especificamente retângulo e triângulo
retângulo. Sua tarefa é criar as classes-modelo utilizando técnicas com herança
e sobrescrita de método e uma classe para executar a aplicação. Utilize uma
linguagem de programação orientada a objeto com um IDE para auxiliar na
organização do projeto. (Linguagem recomendada: java com IDE NetBeans.)

*/
package sobrescrita;

/**
 *
 * @author jyeverson.madalozo
 */
public class Calcular {
    public static void main(String[] args){
    Area retangulo = new Retangulo();
    Area trianguloRetangulo = new TrianguloRetangulo();
    retangulo.CalcArea();
    trianguloRetangulo.CalcArea();
    }
}

package sobrecarga;

/**
  Você trabalha como analista/programador em uma fábrica de software e foi
 * encarregado de atender uma empresa de construção civil. O cliente precisa
 * realizar o cálculo para obter a área exata de cômodos do projeto
 * arquitetônico para elaborar o orçamento. Seus projetos são baseados em
 * três figuras geométricas: retângulo, quadrado e trapézio. Sabe que as
 * fórmulas para o cálculo das áreas são as seguintes: quadrado ｛lado * lado,
 * retângulo {base * altura} e trapézio {{ (base maior + base menor)* altura)/2.

 Utilize uma linguagem de programação orientada a objetos para executar a tarefa.
* Crie uma classe chamada "Area" que contenha os métodos, e outra de controle;
* na classe de controle, instanciar a classe "Area". Chame os métodos das
* respectivas figuras através de uma variável de referência e insira alguns
* valores para teste. Após, exporte o projeto em um arquivo zip e envie como
* anexo.
 */

/**
 *
 * @author jyeverson.madalozo
 */
public class Area {
    
    int quadrado(int lado){
    return lado*lado;
    }
    
    int retangulo(int base, int altura){
        return base * altura;
    }
    
    int trapezio (int baseMenor, int baseMaior, int altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }
    
}
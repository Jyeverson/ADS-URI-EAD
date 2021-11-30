package classesaninhadas;
/**
    Você trabalha como analista/programador em uma fábrica de software e foi
 * solicitada a criação de uma calculadora com as quatro operações básicas da
 * matemática (soma, subtração, multiplicação e divisão). Essa calculadora
 * deverá receber apenas dois números de cada vez e a operação desejada.
 * Para construir, você deverá fazer o uso de classes aninhadas não estáticas,
 * e cada classe corresponde a uma operação. Crie uma classe-controle para
 * instanciar as classes das operações. 
 
/**
 *
 * @author jyeverson.madalozo
 */
public class Controle {

    public static void main(String[] args) {
        Subtracao.Interna subtracao = new Subtracao().new Interna();
        Multiplicacao.Interna multiplicacao = new Multiplicacao().new Interna();
        Divisao.Interna divisao = new Divisao().new Interna();
        Soma.Interna soma = new Soma().new Interna();

        subtracao.Subtrair(0, 0);
        multiplicacao.Multiplicar(0, 0);
        divisao.Dividir(0, 0);
        soma.Somar(0, 0);
    }
}

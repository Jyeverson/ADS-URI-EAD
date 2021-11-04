/*

Você trabalha na área de TI de uma escola. A secretaria da instituição solicitou
que você crie uma forma de inserir o conceito obtido pelo aluno, com sua
descrição, de tal maneira que apenas seja necessário informar o número do
conceito obtido.

Você deverá criar uma interface com três constantes, constante "a" = "Parabéns,
você atingiu todos os indicadores de avaliação com excelência"; constante
"b" = "Parabéns, você obteve aproveitamento satisfatório nos indicadores de
avaliação"; constante "c" = "Você não atingiu o mínimo esperado para aprovação".

Crie uma classe para implementar a interface. Nesta classe, crie uma variável
para receber a opção digitada pelo usuário. Utilize o método showInputDialog()
da classe JOptionPane para solicitar as opções. Crie uma estrutura de decisão
para verificar a opção digitada e printar na tela o conceito e sua descrição.

Utilize uma linguagem de programação orientada a objetos. Crie um projeto
chamado ConceitoAluno; dentro dele, crie um pacote chamado interfaces, e,
dentro do pacote, crie a interface e a classe para implementá-la.

*/
package conceito;

/**
 *
 * @author Jyeverson.madalozo
 */
public interface Conceito {
   
    public static final String A = "Parabéns, você atingiu todos os indicadores de avaliação com excelência";
    public static final String B = "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação";
    public static final String C = "Você não atingiu o mínimo esperado para aprovação";
    
}

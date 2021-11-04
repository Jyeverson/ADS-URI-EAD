package cadastro;

/**
 *
 * @author jyeverson.madalozo
 */
public class Fisica extends Pessoa{
    String nome,cpf,rg,idade,titulacao;
    
      public Fisica(String numero,String bairro, String cidade, String uf, String telefone, String email, String disciplina, String logradouro){
    super(numero, bairro, cidade, uf, telefone, email, disciplina, logradouro);
   
    }
    
}

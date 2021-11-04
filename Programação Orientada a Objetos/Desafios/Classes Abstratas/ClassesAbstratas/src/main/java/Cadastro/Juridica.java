package cadastro;

/**
 *
 * @author jyeverson.madalozo
 */
public class Juridica extends Pessoa{
    String razaoSocial, nomeFantasia,inscricaoMunicipal,inscricaoEstadual,cnpj,website;
    String numero, bairro, cidade, uf, telefone, email, disciplina, logradouro;
    
    public Juridica(String numero,String bairro, String cidade, String uf, String telefone, String email, String disciplina, String logradouro){
    super(numero, bairro, cidade, uf, telefone, email, disciplina, logradouro);
   
    }
   
    
}

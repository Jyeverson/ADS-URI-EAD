package construtor;

/**
 *
 * @author jyeverson.madalozo
 */
public class Fornecedor extends Cadastro{
    
    String nomeFantasia, website;
    
    public Fornecedor(String logradouro, String numero, String bairro, String cidade, String UF, String telefone, String email, String disciplinasqueministra) {
        super(logradouro, numero, bairro, cidade, UF, telefone, email, disciplinasqueministra);
    }
    
}

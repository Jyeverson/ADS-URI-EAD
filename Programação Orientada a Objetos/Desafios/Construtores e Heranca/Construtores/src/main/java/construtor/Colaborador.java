package construtor;

/**
 *
 * @author jyeverson.madalozo
 */
public class Colaborador extends Cadastro {
    
    String cargoFuncao;
    
    public Colaborador(String logradouro, String numero, String bairro, String cidade, String UF, String telefone, String email, String disciplinasqueministra) {
        super(logradouro, numero, bairro, cidade, UF, telefone, email, disciplinasqueministra);
    }
    
}

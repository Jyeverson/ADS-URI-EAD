/*
Trabalhar com construtores e herança em orientação a objetos pode nos trazer
muitas vantagens, como diminuir complexidade no desenvolvimento da aplicação.
Entretanto, é importante termos um bom conhecimento sobre o assunto para
aplicarmos da melhor forma em nossos projetos.

Você trabalha como analista/programador em uma fábrica de software e foi
encarregado de criar uma aplicação para cadastrar associados, fornecedores
e colaboradores de determinada associação. Em reunião com os representantes
da associação, ficou definido que, para os cadastros, deverão ser guardadas as
seguintes informações:

- Associados (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone,
CPF/CNPJ, situação e número de associado).

- Colaborador (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone,
CPF/CNPJ, cargo ou função).

- Fornecedores (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone,
CPF/CNPJ, nome fantasia e website).

Assim, você deve criar as classes-modelo, utilizando técnicas com construtores
e herança.

Utilize uma linguagem de programação orientada a objeto com um IDE para
auxiliar na organização do projeto. Recomenda-se utilizar a linguagem Java com
IDE NetBeans, todavia, fique à vontade para usar alguma de sua preferência.
Coloque o nome do projeto de “Associacao” e encaminhe o arquivo zipado.

*/

package construtor;

/**
 *
 * @author jyeverson.madalozo
 */
public abstract class Cadastro {

    String id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpf_cnpj;
    
    public Cadastro (String logradouro, String numero, String bairro, String cidade, String UF, String telefone, String email, String disciplinasqueministra ){
        
    this.logradouro = logradouro;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.uf = uf;
    this.telefone = telefone;
    this.id = id;
    this.nome = nome;
    this.cep = cep;
    this.cpf_cnpj = cpf_cnpj;
    }
}
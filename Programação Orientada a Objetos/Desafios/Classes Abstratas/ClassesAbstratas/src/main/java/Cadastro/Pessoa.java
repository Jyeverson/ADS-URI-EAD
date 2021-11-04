/*

Trabalhar com classe abstrata em orientação a objetos pode nos trazer mais 
consistência ao sistema em algumas situações, entretanto, é importante termos
um bom conhecimento sobre o assunto para aplicarmos da melhor forma em nossos
projetos.

Você trabalha como analista/programador em uma escola de cursos de qualificação
profissional. Nesta escola, seus colaboradores podem ser pessoas físicas com
vínculos trabalhistas e pessoas jurídicas que prestam serviços de treinamentos.
Sua tarefa é criar classes de modelo para auxiliar no cadastro desses
colaboradores. A aplicação deverá cadastrar os colaboradores pessoa física
com os seguintes atributos: nome, CPF, RG, idade, logradouro, número, bairro,
cidade, UF, telefone, e-mail, titulação e disciplinas que ministra. Para pessoa
jurídica, os atributos são: razão social, nome fantasia, inscrição municipal,
inscrição estadual, CNPJ, logradouro, número, bairro, cidade, UF, telefone,
e-mail de contato, website e disciplinas que ministra.

Crie uma estrutura de herança com classe abstrata. Você deverá exportar o
projeto em um arquivo zipado. Utilize uma linguagem de programação orientada
a objetos para executar a tarefa.

*/

package cadastro;

/**
 *
 * @author jyeverson.madalozo
 */
public abstract class Pessoa {
    public String numero,bairro,cidade,uf,telefone,email,disciplina,logradouro;
    public Pessoa( String numero, String bairro, String cidade, String uf, String telefone, String email, String disciplina, String logradouro) {
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.uf = uf;
    this.telefone = telefone;
    this.email = email;
    this.disciplina = disciplina;
    this.logradouro = logradouro;
    }
}

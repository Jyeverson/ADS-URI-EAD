/*

Ao ser realizado o levantamento de requisitos, em conjunto
com os colaboradores da secretária da escola, foi definido
que o cadastro de alunos deveria registrar os seguintes dados:
-> Nome
-> Endereco
-> Telefone
-> E-mail
-> Matricula

/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/

Cabe a você criar a classe de definição com o Nome
de Aluno, logo após a criação da classe Aluno, crie
uma segunda classe com o nome de "Principal"; a partir
da classe Principal, instancie a classe Aluno e coloque
alguns valores nos atributos do objeto criado, crie apenas um.

/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/

Para isso, utilize uma linguagem de programação orientada a objetos.

*/

public class Aluno {
    String nome;
    String endereco;
    Int telefone;
    String email;
    Int matricula;

    public static void Principal(String[] args) {

        Aluno aluno = new Aluno();
        aluno.nome = "Fulano";
        aluno.endereco = "Rua dos bobo Nº 0";
        aluno.telefone = 999999999;
        aluno.email = "FulanoADS@gmail.com";
        aluno.matricula = 999;
        
    }

}
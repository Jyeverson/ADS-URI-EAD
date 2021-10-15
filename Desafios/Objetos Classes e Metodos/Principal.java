class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Fulano";
        aluno.endereco = "Rua dos bobo Nº 0";
        aluno.telefone = 999999999;
        aluno.email = "FulanoADS@gmail.com";
        aluno.matricula = 999;        

        System.out.println("Nome: " + aluno.nome + " Matrícula: " + aluno.matricula+ " Endereço: " +
        aluno.endereco+ " Telefone: " + aluno.telefone+ " E-mail: " + aluno.email);
    }

}
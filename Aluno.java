public class Aluno{
    //atribtutos (dados, caracterizam o objeto)
    String nome;
    double nota1;
    double nota2;

    // construtor - metódo especial, inicializa os atributos do obj
    // nome da classe no construtor
    //this diferencia o atributo do construtor
    //this = atributo, depois do  igual é o construtor
    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    // metódos - uma função
    // metódo em objeto não usa static
    public double calculaMedia(){
        double soma = nota1 + nota2;// notas dentro da estrutura 
        return soma / 2;
    }
}
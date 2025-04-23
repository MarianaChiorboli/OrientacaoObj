// encapsulamento - protege o objeto (podendo ou não expor o atributo)
// reduzir o acoplamento
//atributo esconde (private), expondo apenas o metódo (public)
//modificadores de acesso - consegue restringir o acesso de outras classes 
//4 modificadores - PUBLIC / PRIVATE / DEFAULT / PROTECTED
// + em UML significa public (geral)
//default não define (UML É O ~)
//dentro da classe eu consigo acessar o atributo 
// ATRIBUTOS - PRIVATE / METÓDOS - PUBLIC 
// construtor em casos raros podem ser private, mas só acessam eles na mesma classe 
// PROTECTED (# em UML), da acesso diretamente em outras classes 
//getters - obtem o conteúdo do atributo 
// setter - muda o conteúdo do atributo 






public class Aluno{
    //atribtutos (dados, caracterizam o objeto)
    private String nome;
    private double nota1;
    private double nota2;
    //private - modificadores, encapsulando os atributos e não deixam acessar os mesmos
    //atributos são privados 

    //getters e setters 
    public String getNome(){
        return nome;
    }

    
    public void setNome(String nome){
        this.nome = nome; // this acessa o atributo
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

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
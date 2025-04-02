

public class TestaAluno{
    public static void main(String[] args){

        //tipo do objeto, variável de referência, para construir - new, para chamar o constutor da classe aluno 

        Aluno a1 = new Aluno("Mari"); // obj diferentes, vieram do mesmo modelo
        Aluno a2 = new Aluno("Murilete", 8.0, 9.0); // obj
        
        a1.nota1 = 8.0; // ponto "." você acessa ao objeto
        a1.nota2 = 9.0;

        a2.nota1 = 10.0;
        a2.nota2 = 9.5;


        System.out.println(a1.nome + " " + a1.calculaMedia());
        System.out.println(a2.calculaMedia());

    } 
}
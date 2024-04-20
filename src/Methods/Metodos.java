package Methods;

public class Metodos {

    public static void main(String[] args) {
        metodoSemParametros();
        String pessoa = "João";
        String esporte = "Skate";
        metodoComUmParametro(pessoa);
        metodoComUmParametro(esporte);
        int idade = 40;
        metodoComDoisParametros(pessoa, idade);

        System.out.println(metodoComReturn(5,7));
    }

    static void metodoSemParametros(){
        System.out.println("Olá!");
    }
    static void metodoComUmParametro(String texto){
        System.out.println("Palavra digitada: " + texto);
    }
    static void metodoComDoisParametros(String nome, int idade){
        System.out.println("Olá, " + nome);
        System.out.println("Você tem " + idade + " anos.");
    }

    static int metodoComReturn (int a , int b){
        return a+b;
    }

}

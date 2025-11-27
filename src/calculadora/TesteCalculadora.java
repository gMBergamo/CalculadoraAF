package calculadora;

/**
 * <p><strong>Classe de testes para classe Calculadora.</strong><p>
 * 
 * <p>Esta classe executa de forma organizada os métodos criados na classe Calculadora.</p>
 * 
 * <P>Seu objetivo é garantir que os métodos criados estão retornando resultados coerentes 
 * e caso sejam informados números ou um operador que resulte em uma operação inválida 
 * o usuário seja informado sobre, <strong>sem que o projeto quebre</strong>.</p>
 * 
 * <p>Nesta classe serão testados os seguintes casos:</p>
 * <ul>
 *     <li>Execução dos métodos de: Soma, Subtração, Multiplicação e Divisão.</li>
 *     <li>Informar o usuário em caso de exceção para divisões por zero.</li>
 *     <li>Informar o usuário em caso de exceção por tentativa de calculo com operador inválido.</li>
 * </ul>
 * 
 * * <p>Após a refatoração, os testes realizados nesta classe foram aprimorados e organizados,
 * com isto obtivemos melhor entendimento das operações realizadas e dos resultados esperados.</p>
 * 
 * @author Giovanni Mikhael Gonzalez Bergamo
 * @version 1.0
 */

public class TesteCalculadora {
    public static void main(String[] args){
        
        //Instancia a classe Calculadora para poder acessar seus métodos
        Calculadora calc = new Calculadora();
        
         //Chama o método calcular para testar cada operação disponível na 
         //classe Calculadora e realiza o print do resultado no terminal.
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        //Chama o método calcular passando o operador de divisão e o algarismo 0 como divisor nos parâmetros para forçar o 
        //lançamento da exeção "IllegalArgumentException" e receber a mensagem de retorno sobre o erro ocorrido.
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        //Chama o método calcular passando um valor inconpatível com os operadores disponíveis no método para 
        //forçar o lançamento da IllegalArgumentException e receber a mensagem de retorno sobre o erro ocorrido.
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

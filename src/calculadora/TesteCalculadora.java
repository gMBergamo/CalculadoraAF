package calculadora;

public class TesteCalculadora {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        //Testes rápidos
        calc.calc(2, 3, "+");
        calc.calc(10, 4, "-");
        calc.calc(3, 5, "*");
        calc.calc(8, 2, "/");
        calc.calc(8, 0, "/");
        calc.calc(5, 5, "x");
    }
}

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        #si no pasa los test, genera un AssertionError y no muestra el sout
		assert calc.sumar(2, 3) == 5 : "Error en sumar()";
        assert calc.restar(5, 2) == 3 : "Error en restar()";

        
		System.out.println("Todos los tests pasaron correctamente.");
    }
}
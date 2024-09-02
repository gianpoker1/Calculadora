import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true){
            System.out.println("*********Aplicacion Calculadora*********");
            mostrarMenu();
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //validar que sea opcion correcta
                if(operacion >= 1 && operacion <= 4) {
                    operacion(operacion, consola);
                }else if(operacion == 5){
                    System.out.println("Hasta pronto...");
                    break;
                }else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

        }

    }

    private static void mostrarMenu(){
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Operacion a realizar?: ");
    }

    private static void operacion(int operacion, Scanner consola){
        System.out.print("Proporciona el primer operando: ");
        var num1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el segundo operando: ");
        var num2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion){
            case 1 -> {
                resultado = num1 + num2;
                System.out.println("Resultado Suma: " + resultado);
            }
            case 2 -> {
                resultado = num1 - num2;
                System.out.println("Resultado Resta: " + resultado);
            }
            case 3 -> {
                resultado = num1 * num2;
                System.out.println("Resultado Multiplicacion: " + resultado);
            }
            case 4 -> {
                resultado = num1 / num2;
                System.out.println("Resultado division: " + resultado);
            }
            default ->
                    System.out.println("Opcion erronea: " + operacion);
        }
    }
}

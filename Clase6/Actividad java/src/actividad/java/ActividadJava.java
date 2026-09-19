/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.java;
import java.util.Scanner; //Para pedir datos por consola

public class ActividadJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializamos el Scanner para leer el teclado
        Scanner scanner = new Scanner(System.in);
        
        // -Entrada, salida y operaciones
        System.out.println("Entrada, salida y operaciones");
        // Actividad 8
        System.out.println("\n Actividad 8");
        System.out.print("Ingresar nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresar apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        
        // Actividad 9
        System.out.println("\n Actividad 9");
        System.out.print("Ingresar ano de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        
        int edad = 2026 - anoNacimiento;
        System.out.println("Hola, me llamo " + nombre + " " + apellido + " y este ano cumplo " + edad + " anos.");
        
        // Actividad 10
        System.out.println("\n Actividad 10");
        System.out.print("Ingresar la primera nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ingresar la segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Ingresar la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.printf("El promedio es: %.2f\n", promedio);
        
        // Actividad 11
        System.out.println("\n Actividad 11");
        System.out.print("Ingresar cantidad en metros: ");
        double metros = scanner.nextDouble();
        
        System.out.println(metros + " metros equivalen a:");
        System.out.println((metros * 100) + " centimetros");
        System.out.println((metros * 1000) + " milimetros");
        System.out.println((metros / 1000) + " kilometros");
        
        // Actividad 12
        System.out.println("\n Actividad 12");
        System.out.print("Ingresar el sueldo bruto: $");
        double sueldoBruto = scanner.nextDouble();
        
        double sueldoNeto = sueldoBruto * 0.83; 
        System.out.printf("El sueldo neto descontando impuestos es: $%.2f\n", sueldoNeto);
        
        
        // -Condicionales
        System.out.println("\n Condicionales");
        // Actividad 9
        System.out.println("Actividad 9");
        System.out.print("Ingresar el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresar el segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Ingresar la operacion (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        
        switch (operacion) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir por cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operacion no valida");
        }

        // Actividad 10
        System.out.println("\nActividad 10");
        System.out.print("Ingresar un numero del 1 al 7: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Numero de dia invalido");
        }

        // Actividad 11
        System.out.println("\nActividad 11");
        System.out.print("Ingresar un numero del 1 al 12: ");
        int mes = scanner.nextInt();
        
        switch (mes) {
            case 1: System.out.println("Enero - 31 dias"); break;
            case 2: System.out.println("Febrero - 28 dias (o 29 en ano bisiesto)"); break;
            case 3: System.out.println("Marzo - 31 dias"); break;
            case 4: System.out.println("Abril - 30 dias"); break;
            case 5: System.out.println("Mayo - 31 dias"); break;
            case 6: System.out.println("Junio - 30 dias"); break;
            case 7: System.out.println("Julio - 31 dias"); break;
            case 8: System.out.println("Agosto - 31 dias"); break;
            case 9: System.out.println("Septiembre - 30 dias"); break;
            case 10: System.out.println("Octubre - 31 dias"); break;
            case 11: System.out.println("Noviembre - 30 dias"); break;
            case 12: System.out.println("Diciembre - 31 dias"); break;
            default: System.out.println("Numero de mes invalido");
        }
        
        // -Ciclos
        System.out.println("\n Ciclos");
        // Actividad 6
        System.out.println("Actividad 6 - Fibonacci");
        System.out.print("Ingresar la cantidad de terminos (N): ");
        int n = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        System.out.print("Serie: ");
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a + " ");
            } else if (i == 2) {
                System.out.print(b + " ");
            } else {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        System.out.println();
        
        scanner.nextLine();
        
        // Actividad 11
        System.out.println("\nActividad 11 - Palabra al reves");
        System.out.print("Ingresar una palabra: ");
        String palabra = scanner.nextLine();
        
        System.out.print("Palabra invertida: ");
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
        System.out.println();
        
        // Actividad 12
        System.out.println("\nActividad 12 - Array con for-each");
        int[] numeros = {15, 42, 8, 99, 23};
        
        System.out.print("Elementos del array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        // Actividad 13
        System.out.println("\nActividad 13 - Filtro de nombres que empiezan con A");
        String[] nombres = {"Ana", "Carlos", "Alberto", "Belen", "Andres", "Diego"};
        
        System.out.println("Nombres filtrados:");
        for (String nom : nombres) {
            if (nom.toUpperCase().startsWith("A")) {
                System.out.println(nom);
            }
        }
        
        //Combinados
        System.out.println("\n Combinados");

        // Actividad 1
        System.out.println("\n Actividad 1");
        System.out.print("Ingresar cantidad de filas (N): ");
        int filasPiramide = scanner.nextInt();
        
        for (int i = 1; i <= filasPiramide; i++) {
            for (int j = 1; j <= filasPiramide - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Actividad 2
        System.out.println("\n Actividad 2");
        double sumaNotasCombi = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresar nota " + i + ": ");
            sumaNotasCombi += scanner.nextDouble();
        }
        double promedioCombi = sumaNotasCombi / 5;
        System.out.printf("Promedio: %.2f - ", promedioCombi);
        if (promedioCombi >= 6) {
            System.out.println("Aprobo la cursada");
        } else {
            System.out.println("No aprobo");
        }

        // Actividad 3
        System.out.println("\n Actividad 3");
        int numMayor = Integer.MIN_VALUE;
        int ingreso;
        boolean huboIngresos = false;
        
        do {
            System.out.print("Ingresar numero: ");
            ingreso = scanner.nextInt();
            if (ingreso != -1) {
                huboIngresos = true;
                if (ingreso > numMayor) {
                    numMayor = ingreso;
                }
            }
        } while (ingreso != -1);
        
        if (huboIngresos) {
            System.out.println("El numero mayor ingresado fue: " + numMayor);
        }

        // Actividad 4
        System.out.println("\n Actividad 4");
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        double sumaCero = 0;
        int contadorCero = 0;
        int ingresoCero;
        
        do {
            System.out.print("Ingresar numero: ");
            ingresoCero = scanner.nextInt();
            if (ingresoCero != 0) {
                if (ingresoCero > maximo) maximo = ingresoCero;
                if (ingresoCero < minimo) minimo = ingresoCero;
                sumaCero += ingresoCero;
                contadorCero++;
            }
        } while (ingresoCero != 0);
        
        if (contadorCero > 0) {
            System.out.println("Mayor: " + maximo);
            System.out.println("Menor: " + minimo);
            System.out.printf("Promedio: %.2f\n", (sumaCero / contadorCero));
        }

        // Actividad 5
        System.out.println("\n Actividad 5");
        int[] arregloDiez = {12, 45, 7, 89, 23, 4, 67, 90, 15, 33};
        int sumaArr = 0;
        int maxArr = arregloDiez[0];
        int minArr = arregloDiez[0];
        
        for (int num : arregloDiez) {
            sumaArr += num;
            if (num > maxArr) maxArr = num;
            if (num < minArr) minArr = num;
        }
        System.out.println("Suma: " + sumaArr);
        System.out.println("Promedio: " + ((double) sumaArr / arregloDiez.length));
        System.out.println("Mayor: " + maxArr);
        System.out.println("Menor: " + minArr);

        // Actividad 6
        System.out.println("\n Actividad 6");
        scanner.nextLine();
        System.out.print("Ingresar una frase: ");
        String frase = scanner.nextLine().toLowerCase();
        int vocales = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("La frase tiene " + vocales + " vocales.");

        // Actividad 7 (Desafio)
        System.out.println("\n Actividad 7");
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Actividad 8 (Desafio)
        System.out.println("\n Actividad 8");
        System.out.print("Ingresar cantidad de filas (N): ");
        int filasPascal = scanner.nextInt();
        
        for (int i = 0; i < filasPascal; i++) {
            for (int j = 0; j < filasPascal - i; j++) {
                System.out.print(" ");
            }
            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

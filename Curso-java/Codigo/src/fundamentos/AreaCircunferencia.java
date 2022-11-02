package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        double raio = 3.4;

        /* Quando colocar "final" transforma a variavel 
         * em constatente, não pode modificar. */
        final double pi = 3.14159;

        raio = 10;

        double area = pi * raio * raio;

        System.out.println("Área = " + area + "m2");
    }
}
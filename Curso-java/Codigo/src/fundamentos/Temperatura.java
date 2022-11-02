package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double ajuste = 32;
        final double fator = 5.0 / 9.0;
        double F = 55;
        double C = (F - ajuste) * fator;

        System.out.println("O resultado é " + C + "°C");
    }
}
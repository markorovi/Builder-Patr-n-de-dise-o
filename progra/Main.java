package progra;

public class Main {
    public static void main (final String[] args) {
        Cuenta cuent = new Cuenta(01, "Luis", 1000);

        System.out.printl("\n");

        InterfazCuenta cuenta = new CuentaProxy();
        cuenta.MostrarSaldo(cuent);
        cuent = cuenta.DepositarDinero(cuent, 500);
        cuent = cuenta.RetirarDinero(cuent, 200);
        cuenta.MostrarSaldo(cuent);
    }
}

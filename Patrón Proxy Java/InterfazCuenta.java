package progra;

public interface InterfazCuenta {
    Cuenta RetirarDinero(Cuenta cuenta, double monto);
    Cuenta DepositarDinero(Cuenta cuenta, double monto);
    void MostrarSaldo(Cuenta cuenta);
}

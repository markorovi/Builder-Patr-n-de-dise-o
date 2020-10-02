package progra;

public class CuentaProxy implements InterfazCuenta {

    private CuentaBanco cuentaReal;

    @Override
    public Cuenta RetirarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.RetirarDinero(cuenta, monto);

        } else {
            return cuentaReal.RetirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta DepositarDinero(Cuenta cuenta, double monto) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            return cuentaReal.DepositarDinero(cuenta, monto);

        } else {
            return cuentaReal.DepositarDinero(cuenta, monto);
        }
    }

    @Override
    public void MostrarSaldo(Cuenta cuenta) {
        if (cuentaReal == null) {
            cuentaReal = new CuentaBanco();
            cuentaReal.MostrarSaldo(cuenta);

        } else {
            cuentaReal.MostrarSaldo(cuenta);
        }

    }
    
}

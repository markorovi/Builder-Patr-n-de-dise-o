package progra;

import java.util.logging.Logger;

public class CuentaBanco implements InterfazCuenta {

    Logger logger = Logger.getLogger(CuentaProxy.class.getName());

    @Override
    public Cuenta RetirarDinero(final Cuenta cuenta, final double monto) {
        logger.info("Nuevo acceso al proxy -- Retirar Dinero");
        final double saldo = cuenta.getSaldo() - monto;
        cuenta.setSaldo(saldo);
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "\n");
        return cuenta;
    }

    @Override
    public Cuenta DepositarDinero(final Cuenta cuenta, final double monto) {
        logger.info("Nuevo acceso al proxy -- Depositar Dinero");
        final double saldo = cuenta.getSaldo() + monto;
        cuenta.setSaldo(saldo);
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "\n");
        return cuenta;
    }

    @Override
    public void MostrarSaldo(final Cuenta cuenta) {
        logger.info("Nuevo acceso al proxy -- Mostar Saldo");
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "\n");
    }
}

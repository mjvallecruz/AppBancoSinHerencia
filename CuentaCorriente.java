public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int numeroCuenta,  Cliente titular) {
        super(numeroCuenta, 0, titular);
        
    }

    @Override
    public void verDatos() {
      
        String s = "";
        s += "Nºcuenta: " + numeroCuenta +" - CUENTA CORRIENTE" +"\n";
        s += "Titular: " + "\n\t\t Dni:" +titular.getDni() + "\n\t\t Nombre:"+ titular.nombreCompleto() + "\n\t\t Domicilio:" + titular.direccionCompleta() + "\n";
        s += "Saldo actual: " + saldo + "€\n";
        s += "------------------------  M O V I M I E N T O S  ------------------------\n";
        s += obtenerMovimientos();
        System.out.println(s);
    }

    @Override
    public void retiro(double cantidad) throws RetiroNoValidoException {
        if(cantidad >300) throw new RetiroNoValidoException("no se puede retirar más de 300 €");
        if(cantidad >saldo) throw new RetiroNoValidoException("saldo insuficiente");
        if(cantidad<0) throw new RetiroNoValidoException("retiro negativo");
        this.corfirmarRetiro(cantidad);
    }

    @Override
    public void ingreso(double cantidad) throws IngresoNoValidoException {
        if (cantidad <0) throw new IngresoNoValidoException("el ingreso no puede ser negativo");
        if (cantidad <10) throw new IngresoNoValidoException("se debe ingresar mínimo 10€");
        this.corfirmarIngreso(cantidad);
    }
    
}

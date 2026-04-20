public class FondoInversion extends Cuenta {
    private int interes;
    public FondoInversion(int numeroCuenta,  Cliente titular) {
        super(numeroCuenta, 5000, titular);
        calcularIntereses();
    }
    private void calcularIntereses(){
        if(saldo>=100000) interes = 5;
        else if(saldo>=50000) interes= 4;
        else interes =2;
    }
     @Override
    public void verDatos() {
      
        String s = "";
        s += "Nºcuenta: " + numeroCuenta +" - FONDO INVERSION AL " +interes+"%\n";
        s += "Titular: " + "\n\t\t Dni:" +titular.getDni() + "\n\t\t Nombre:"+ titular.nombreCompleto() + "\n\t\t Domicilio:" + titular.direccionCompleta() + "\n";
        s += "Saldo actual: " + saldo + "€\n";
        s += "------------------------  M O V I M I E N T O S  ------------------------\n";
        s += obtenerMovimientos();
        System.out.println(s);
    }
     @Override
     public void retiro(double cantidad) throws RetiroNoValidoException {
      if(cantidad<500) throw new RetiroNoValidoException("retiro mínimo 500 €");
      if(saldo-cantidad < 3000) throw new RetiroNoValidoException("saldo insuficiente, debe haber siempre una saldo 3000 en el FI, saldo actual:"+ saldo);
      if(cantidad<0) throw new RetiroNoValidoException("la cantidad a retirar no puede ser negativa"); 
      this.corfirmarRetiro(cantidad);
      this.calcularIntereses();
    }
     @Override
     public void ingreso(double cantidad) throws IngresoNoValidoException {
        if (cantidad <0) throw new IngresoNoValidoException("el ingreso no puede ser negativo");
        if (cantidad <500) throw new IngresoNoValidoException("se debe ingresar mínimo 500€");
        this.corfirmarIngreso(cantidad);
        this.calcularIntereses();
    }
    
}

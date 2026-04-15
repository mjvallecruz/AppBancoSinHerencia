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
    
}

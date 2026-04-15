public class CuentaVivienda extends Cuenta {

    public CuentaVivienda(int numeroCuenta, Cliente titular) {
        super(numeroCuenta, 1000, titular);
        
    }
     @Override
    public void verDatos() {
      
        String s = "";
        s += "Nºcuenta: " + numeroCuenta +" - CUENTA VIVIENDA" +"\n";
        s += "Titular: " + "\n\t\t Dni:" +titular.getDni() + "\n\t\t Nombre:"+ titular.nombreCompleto() + "\n\t\t Domicilio:" + titular.direccionCompleta() + "\n";
        s += "Saldo actual: " + saldo + "€\n";
        s += "------------------------  M O V I M I E N T O S  ------------------------\n";
        s += obtenerMovimientos();
        System.out.println(s);
    }
    
}

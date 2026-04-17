public class ClienteExisteException extends Exception {
    Cliente c;

    public ClienteExisteException(Cliente c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "El Cliente [" + c.clienteCompleto() + "] ya existe";
    }
   
    
}

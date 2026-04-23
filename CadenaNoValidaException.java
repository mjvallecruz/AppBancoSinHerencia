public class CadenaNoValidaException extends Exception {

    public CadenaNoValidaException(String message) {
        super(message);
    }
    public String toString(){
        return "ERROR: , "+ getMessage();
    }
    
}

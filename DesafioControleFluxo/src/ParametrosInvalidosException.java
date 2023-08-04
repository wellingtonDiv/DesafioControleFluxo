public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O primeiro parâmetro deve ser maior que o segundo parâmetro");
    }
}

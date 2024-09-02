public class Nota5Handler extends BaseHandler {
    
    @Override
    public void handleRequest(int valor) {
        if (valor >= 5) {
            int numNotas = valor / 5;
            int restante = valor % 5;
            System.out.println("Dispensando " + numNotas + " notas de 5");

            if (restante != 0) {
                passToNext(restante);
            }
        } else {
            passToNext(valor);
        }
    }
}
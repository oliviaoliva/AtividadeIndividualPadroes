public class Nota50Handler extends BaseHandler {
    
    @Override
    public void handleRequest(int valor) {
        if (valor >= 50) {
            int numNotas = valor / 50;
            int restante = valor % 50;
            System.out.println("Dispensando " + numNotas + " notas de 50");

            if (restante != 0) {
                passToNext(restante);
            }
        } else {
            passToNext(valor);
        }
    }
}
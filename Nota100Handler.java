public class Nota100Handler extends BaseHandler {
    
    @Override
    public void handleRequest(int valor) {
        if (valor >= 100) {
            int numNotas = valor / 100;
            int restante = valor % 100;
            System.out.println("Dispensando " + numNotas + " notas de 100");

            if (restante != 0) {
                passToNext(restante);
            }
        } else {
            passToNext(valor);
        }
    }
}
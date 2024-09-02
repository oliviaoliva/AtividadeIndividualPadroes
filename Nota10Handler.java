public class Nota10Handler extends BaseHandler {
   
    @Override
    public void handleRequest(int valor) {
        if (valor >= 10) {
            int numNotas = valor / 10;
            int restante = valor % 10;
            System.out.println("Dispensando " + numNotas + " notas de 10");
            
            if (restante != 0) {
                passToNext(restante);
            }
        } else {
            passToNext(valor);
        }
    }
}
   

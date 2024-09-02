public class Nota20Handler extends BaseHandler{
  
    @Override
    public void handleRequest(int valor) {
        if (valor >= 20) {
            int numNotas = valor / 20;
            int restante = valor % 20;
            System.out.println("Dispensando " + numNotas + " notas de 20");

            if (restante != 0) {
                passToNext(restante);
            }
        } else {
            passToNext(valor);
        }
    }
}

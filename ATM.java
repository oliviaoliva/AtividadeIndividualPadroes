public class ATM {
    private Handler cadeia;

    public ATM() {
        
        Handler nota100 = new Nota100Handler();
        Handler nota50 = new Nota50Handler();
        Handler nota20 = new Nota20Handler();
        Handler nota10 = new Nota10Handler();
        Handler nota5 = new Nota5Handler();

        
        nota100.setNext(nota50);
        nota50.setNext(nota20);
        nota20.setNext(nota10);
        nota10.setNext(nota5);

        this.cadeia = nota100;
    }

    public void withdraw(int valor) {
        if (valor % 5 != 0) {
            System.out.println("Valor inválido, favor inserir um valor múltiplo de 5.");
            return;
        }
        this.cadeia.handleRequest(valor);
    }
}

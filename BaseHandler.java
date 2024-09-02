public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    protected void passToNext(int valor) {
        if (nextHandler != null) {
            nextHandler.handleRequest(valor);
        }
    }

    @Override
    public abstract void handleRequest(int valor);
}

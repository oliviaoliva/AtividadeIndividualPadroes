public interface Handler {
    void setNext(Handler handler);
    void handleRequest(int valor);
}

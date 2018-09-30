package proxy.pattern;

public class Client {

    public static void main(String[] args) {

        Subject proxyToRealSubject = new Proxy(new RealSubject());
        proxyToRealSubject.doService();

    }

}

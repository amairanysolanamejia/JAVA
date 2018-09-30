package adapter.pattern;


public class Client {

    public static void main(String[] args) {
        Target target; //What client expects
        target = new Adapter(new Adaptee("Adaptee One"));
        target.request();
    }
}

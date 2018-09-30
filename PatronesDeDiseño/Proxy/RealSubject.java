package proxy.pattern;

public class RealSubject implements Subject{
    @Override
    public void doService() {
        System.out.println("Real Subject doing service...");
    }
}

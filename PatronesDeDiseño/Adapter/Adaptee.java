package adapter.pattern;

public class Adaptee {

    private String name;

    public Adaptee(String name){
        this.name = name;
    }

    public void specificRequest() {
        System.out.println("Called specific request on Adaptee " + name);
    }
}

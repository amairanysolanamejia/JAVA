package prototype.pattern;

public class PrototypeFactory {

    public Prototype getClone(Prototype proto){
        return proto.clone();
    }

}

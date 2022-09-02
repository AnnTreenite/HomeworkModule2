package Homework1.task1;

public class Zoo <F extends Flyable, B extends Biteble, S extends Swimable> {
    private B biteble;
    private F flyable;
    private S swimable;

    public Zoo(B biteble, F flyable, S swimable) {
        this.biteble = biteble;
        this.flyable = flyable;
        this.swimable = swimable;
    }

    //    private T zoo;
//
//    public T getZoo() {
//        return zoo;
//    }
//
//    public Zoo(Zoo zoo) {
//        this.zoo = (T) zoo;
//    }
//
//    public void setZoo(T zoo) {
//        this.zoo = zoo;
//    }
//
    void feedFlyable() {
        System.out.println("Животное ест");
    }
    void feedSwimable() {
        System.out.println("Животное ест");
    }
    void feedBitable() {
        System.out.println("Животное кусает");
    }
}

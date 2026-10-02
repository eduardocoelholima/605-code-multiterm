package interfaces;

interface Dummyable {
    void doNothing();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Dummyable me = new Dummyable() {
            public void doNothing() {
                System.out.println("doing nothing here");
            }
        };
        me.doNothing();
    }
}

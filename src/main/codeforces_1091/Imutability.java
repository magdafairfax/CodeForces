package codeforces_1091;


class A {

    public void havefun(String funtype) {
        System.out.println("Have " + funtype + " fun");
    }

    private void havemorefun(String funtype) {
        System.out.println("Have " + funtype + " fun");
    }

    public void help() {
        havefun("some");
        havemorefun("more");
    }
}

public class Imutability {

    public static void main(String[] args) {
        A a = new A();
        a.havefun("some");
        
        a.help();
    }
}

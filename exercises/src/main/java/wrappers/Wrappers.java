package wrappers;

//exercises on wrappers

public class Wrappers {

    public static void main(String[] args) {
        int a = 10;
        Integer aWrap = a;
        int b = aWrap;
        Integer cWrap = b;

        char c = 'x';
        Character d = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(aWrap.equals(cWrap));
    }
    }



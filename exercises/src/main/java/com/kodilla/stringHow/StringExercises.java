package com.kodilla.stringHow;

public class StringExercises {

    public static void main(String[] args) {

        String u1 = "abc";
        StringBuffer u2 = new StringBuffer(u1);
        System.out.println(u1.equals(u2)); //equals from StringBuffer is the same as == it is not taken form Object

        String sss1 = new String("pankaj");
        String sss2 = new String("PANKAJ");

        System.out.println(sss1 = sss2);
/*

        String z1 = "abc";
        String z2 = new String("abc");
        System.out.println("z1 == z2 is:" + z1 == z2);

        System.out.print("bez interna" + z1==z2);
        System.out.println("z internetm " + z1==z2.intern());

        String s = "Java String Quiz";
        System.out.println(s.charAt(s.toUpperCase().length()-1)); //beZ -1 iest indexOutOfBound bo zaczyna od zera

        String string = "Java String Quiz";
//        System.out.println(string.substring(5,3));

        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");


        System.out.println("s1==s2 " + (s1==s2)); //ta sama referencja
        System.out.println("s1==s3 " + (s1==s3)); //


        String car = "porsche";
        String carTwo = new String("biologia");

        car.concat("ssa");

        System.out.println(car);

        //Strings are constant; their values cannot be changed after they are created.
        //String objects are immutable they can be shared.

        //using String pool
        String str = "123";
        char data[] = {'a', 'b', 'c'};

        String str2 = new String(data); //making new object

        String z = "1";
        z+="2";
        z+="3";

        System.out.println(z);
        System.out.println(1 + 2 + str);

        System.out.println(str2.equals(str));
        System.out.println(str.substring(0,2));

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);

        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);



        //STRING IMMUTABLE
        //opis i dokladnyOpis tworzy dwa obiekty typu String ale są immutable
        //trzecia linijka tworzy nowy obiekt typu S ale nie przypisze do niego zmiennej

        String opis = "śliczny";//sliczny maly
        String dokladnyOpis = opis.concat("mały"); //sliczny maly

        dokladnyOpis.concat("kotek");//pusty String ""

        System.out.println(dokladnyOpis);

        //SUBSTRING
        String miejsce = "przefantastycznie";
        System.out.println(miejsce.substring(4));//fantastycznie
        System.out.println(miejsce.substring(4, 7));//fan
        System.out.println(miejsce.substring(4, 4));//pusty string

        //PORÓWNANIE STRINGÓW
        //porównujemy tylko equals, bo są to obiekty, == nie działa, bo służy to porównania typów
        String aaa = "abcd";
        String bbb = "ABCD";
        aaa.equals(bbb); //true
        aaa.equalsIgnoreCase(bbb); //false

        String ccc = "abcd";

        String ddd = new String("abcd");

        //ten sam pointer
        if (aaa == ccc){
            System.out.println("tak są pdobnbe");
        }
        //== reference to a object
        //inne pointery bo to są dwa różne obiekty ccc jest new
        //When we use double quotes to create a String, it first looks for String with same value in the String pool,
        // if found it just returns the reference else it creates a new String in the pool and then returns the reference.
        if (aaa == ddd){
            System.out.println(aaa + "sa podobne do " + ddd);
        }


        char inicjal = "  Mateusz   ".trim().toUpperCase().charAt(0);



*/
/*        System.out.println(miejsce.substring(4, 3));//IndexOutOfBoundsException
        System.out.println(miejsce.substring(4, 15));//IndexOutOfBoundsException*//*




*/

    }
}

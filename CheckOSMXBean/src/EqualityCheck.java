public class EqualityCheck {


    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        String c = a.intern();
        String d = b.intern();
        String e = a;
        String f = b;

        if(a==b)
            System.out.println(true);
        else
            System.out.println(false);

        if(a.equals(b))
            System.out.println(true);
        else
            System.out.println(false);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(a==e);
        System.out.println(b==e);
        System.out.println(a==f);
        System.out.println(b==f);

    }

}

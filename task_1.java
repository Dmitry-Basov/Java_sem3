public class task_1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "H"+"e"+"l"+ "l"+"o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l','l', 'o'});

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
    }
}

// .equalsIgnoreCase - игнорирует разницу в регистре
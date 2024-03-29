class tt {
    public String toString() {
        return "hello";
    }
}

class func {
    public static void main(String args[]) {
        int a = 41;
        String s = String.valueOf(a);
        System.out.println(s);

        tt ob = new tt();
        System.out.println(ob);

        char ch = "Aditya".charAt(2);
        System.out.println(ch);

        String s11 = "Adi says Hiiii";
        char cha[] = new char[5];
        s11.getChars(11, 15, cha, 0); // Corrected method name and array index

        for (int i = 0; i < 5; i++)
            System.out.println(cha[i]);

        String s1 = "hello";
        String s2 = "hii";
        String s3 = "HELLO";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        boolean x = "Urban".endsWith("an");
        System.out.println(x);
        boolean x1 = "Metro".startsWith("me");
        System.out.println(x1); // Corrected variable name

        int y = s1.compareTo(s3);
        System.out.println(y);

        char j = 'y';
        String ss = "So pretty you look";
        int y1 = ss.indexOf(j);

        System.out.println(y1);
        int y2 = ss.lastIndexOf(j);
        System.out.println(y2);

        String s4 = s1.concat(s3);
        System.out.println(s4);

        String s12 = s1.replace('h', 'm'); // Corrected method name
        System.out.println(s12);

        String sub = ss.substring(3, 9);
        System.out.println(sub);

        String test = "    Aditya  Jain   ";
        System.out.println(test.trim());

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        String test1 = String.join("-", "Ad", "itya", "JAIN"); // Corrected join arguments
        System.out.println(test1); // Added print statement
    }
}

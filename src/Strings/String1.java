
class String1{
    public static void main(String args[]){
        String str1 = new String("Hello");
        String str2 = "Hello";
        String str3 = str1.intern();
        System.out.println((str1==str2)+" "+(str1==str3)+" "+(str2==str3));
        char[] ch  = {'H','e','l','l','o'};
        String str4 = new String(ch);
        System.out.println(str4+ " "+ (str4==str2)+" "+(str4==str1));

        //string methods
        char c = str1.charAt(2);
        System.out.println(c);
        System.out.println(str1.length());

        String sub = str1.substring(1, 5);
        System.out.println(sub);

        System.out.println(str2.contains("He")+" "+str3.contains("hi"));

        System.out.println(str2.indexOf("ello"));

        String str5 = String.join("-", str1,str2);
        System.out.println(str5);

        System.out.println(str1.equals(str2)+" "+ str3.equals(str2));

        String str6 = "";
        System.out.println(str6.isEmpty());
        String str7 = "  ";
        System.out.println(str7.trim().isEmpty()+" "+ str7.isEmpty());

        String str8 = str3.concat(" World");
        System.out.println(str8);

        String str9 = str8.replace('l', 'd');
        System.out.println(str9);

        String arr[] = str8.split(" ");
        for(String s: arr){
            System.out.println(s);
        }

    }
}
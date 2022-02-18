public class WrapperClass {
    public static void main(String args[]){
        //autoboxing
        int i = 10;
        Integer j = i;
        //or
        Integer k = Integer.valueOf(i);

        //unboxing
        int l = j;
        //or
        int m = k.intValue();
        System.out.println(i+" "+j+" "+k+" "+l+" "+m);

        //autoboxing
        char c = 'c';
        Character cobj = c;

        boolean b = true;
        Boolean bobj = b;

        byte d = 1;
        Byte dobj = d;

        short e = 10;
        Short eobj = e;

        long f = 100000000;
        Long fobj = f;

        float g = 2.3f;
        Float gobj = g;

        double h = 2.345;
        Double hobj = h;

        //printing as data type and objects respectively
        System.out.println(b+" "+bobj);
        System.out.println(c+" "+cobj);
        System.out.println(d+" "+dobj);
        System.out.println(e+" "+eobj);
        System.out.println(f+" "+fobj);
        System.out.println(g+" "+gobj);
        System.out.println(h+" "+hobj);

        //unboxing
        c = cobj.charValue();
        b = bobj;
        d = dobj;
        e = eobj;
        f = fobj;
        g = gobj;
        h = hobj;
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
    
}

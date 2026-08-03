package operators;

public class unaryoperator {
    public static void main(String[] args) {
        // pre-increment operator = first increment the value and store it in the
        // variable then also use increment value
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(b);
        System.out.println(++b);

        // post increment - use the value first then increase the valule in the
        // variiable
        int c = 4;
        int d = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);
        System.out.println(d);
        System.out.println(d++);
        System.out.println(d);

        // pre-decrement - decrement first then use(+1)
        int e = 15;
        int f = --e;
        int g = 26;
        int h = --g;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        // post decrement - use first then decrement(-1)
        int i = 15;
        int j = i--;
        int k = 26;
        int L = k--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(L);

    }

}

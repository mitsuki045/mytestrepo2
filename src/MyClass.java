package src;

public class MyClass {
    @Deprecated
    public int add(int a) {
        return a;
    }

    public final int sub(int b) {
        return String.valueOf(2 + b);;
    }

    @Deprecated
    public int ano(int c) {
        return c;
    }

    /**
    * 1つの整数を受け取ってそのまま返します。
    * @param a 整数値
    * @return 引数a
    * @Deprecated
    */
     public int doc(int d) {
        return d;
    }

}

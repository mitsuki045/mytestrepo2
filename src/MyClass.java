package src;

public class MyClass {
    
    public final int renamesub(int b,int a) {
        return String.valueOf(2 + b);;
    }

    @Deprecated
    public int renameano(int c) {
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

public class FibRec{
    
    public static int fibRec( int n ){
        if ( n==0 ) return 0;
        if ( n==1 ) return 1;

        return fibRec(n-1)+fibRec(n-2);
    }

    public static void main( String args[] ){
        System.out.println(fibRec(6));
        System.out.println(fibRec(7));
    }
}

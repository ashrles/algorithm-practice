public class FibIter{
    public static int fibIter( int n ){
        if ( n==0 ) return 0;

        int a = 0;
        int b = 1;
        int c;
        for ( int i=2; i<n ; i++ ){
            c = a + b;
            a = b;
            b = c;
        }
        return a+b;
    }

    public static void main( String args[] ){
        System.out.println(fibIter(6));
        System.out.println(fibIter(7));
    }
    
}

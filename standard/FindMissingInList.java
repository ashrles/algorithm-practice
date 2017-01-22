public class FindMissingInList{
    public static int findMissingInList( int a[] ){
        // Find the total sum
        int totalSum = (a.length+1)*a.length/2;
        // Find the partial sum
        int partialSum = 0;
        for( int i = 0; i < a.length; i++ ){
            partialSum += a[i];
        }
        return totalSum - partialSum;
    }

    public static void main( String args[] ){
        int testArray1[] = new int[]{0,1,2,3,4,6};
        System.out.println(findMissingInList(testArray1)); // missing is 5
    }
}

    
 

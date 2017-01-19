// Find first lonely character in a string
// Ashley Lesperance

public class FindFirstLonely{
    public static char findFirstLonely(char content[]){
        // Assuming standard ASCII 128
        int characters[] = new int[128];

        for ( int i = 0; i < content.length; i++ ){
            characters[ content[i] - 'a' ]++;
        }
        for ( int j = 0; j < content.length; j++ ){
            if ( characters[ content[j] - 'a' ] == 1 ){
                return content[j];
            }            
        }
        return '1'; // This is hacky FIX!
    }

    public static void main( String args[] ){
        String testString1 = "aabbcddee";
        String testString2 = "aabbccddee";

        char result1 = findFirstLonely(testString1.toCharArray());
        char result2 = findFirstLonely(testString2.toCharArray());

        System.out.println("The answer should be 'c': " + result1); 
        System.out.println("The answer should be '1': " + result2); 
    }

}

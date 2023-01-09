import java.util.Arrays;
public class CyclicallyRotatingArray {
static int arr[] = new int[]{1, 2, 3, 4, 5};
    
    // Method for rotation
    static void rotate()
    {
       int x = arr[arr.length-1], i;
       //int x = arr[arr.length], i;
       for (i = arr.length-1; i > 0; i--)
       //for (i = arr.length; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
    
    /* Driver program */
    public static void main(String[] args) 
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
        
        for(int i=1;i<=3;i++) {
        	rotate();
            
            System.out.println("Rotated Array is");
            System.out.println(Arrays.toString(arr));
        }
    }
}

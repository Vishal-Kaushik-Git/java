import java.util.Random;

public class sort {
 
public static void main(String args[]) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)     
        {
            array[i] = rand.nextInt(100);
        }

        System.out.print("Original Array : ");
        
        for(int i=0; i < array.length; i++){
        System.out.print(array[i]+" ");
        }
        
        
        for(int i=0; i<array.length; i++){
          for(int j=i+1; j<array.length; j++){
          
            if(array[i] > array[j]){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            }
          
          }
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        
        for(int i=0; i < array.length; i++){
        System.out.print(array[i]+" ");
        }
        
}
}
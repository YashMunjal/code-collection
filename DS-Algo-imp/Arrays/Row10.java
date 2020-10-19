import java.util.*;

public class Row10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        int j = 0, temp;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Scannings 
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

            
    if(sc != null) {
        sc.close();
    }
    }

}

import java.util.*;

public class Row9 {
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int size=sc.nextInt();
      int[] arr=new int[size];
      int leftPtr=0,rightPtr=size-1;
      for(int i=0;i<size;i++){
        arr[i]=10;
      }
      for(int i=0;i<size;i++){
         int k= sc.nextInt();
        if(k==0)
          {
            arr[leftPtr]=k;
            leftPtr++;
          }
        else if(k==2){
          arr[rightPtr]=k;
          rightPtr--;
        }
      }
      for(int i=0;i<size;i++){
        if(arr[i]==10){
          arr[i]=1;
        }
        System.out.print(arr[i]+" ");
      }
    }
}
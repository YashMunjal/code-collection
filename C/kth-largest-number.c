/* ====================================================================


    Accepts an integer k and an array arr as its parameters and returns the element such that 
    k elements have greater or equal value. 
 =================================================================*/

int kthLargest(int arr[], int size, int k)
{
  int i,j=0,a=0,x=0;
   for (i = 0; i < size; ++i) 
        {
            for (j = i + 1; j < size; ++j)
            {
                if (arr[i] > arr[j]) 
                {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
   		}		
     x=arr[size-k-1];
     return x;
}
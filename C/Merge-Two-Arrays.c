/* =========================================================================================


Write a function mergeArrays which should merge two sorted arrays to create one single sorted array.


======================================================*/



int *mergeArrays(int a[], int b[], int asize, int bsize)
{
    int arr[100], i, l = (asize + bsize);
    for (i = 0; i < asize; i++)
    {
        arr[i] = a[i];
    }
    int j;
    j = (asize);
    for (i = 0; i < bsize && j < l; i++)
    {
        arr[j] = b[i];
        j++;
    }
    int k;
    for (i = 0; i < l; i++)
        for (k = i + 1; k < l; k++)
        {
            if (arr[i] > arr[k])
            {
                int t;
                t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
            }
        }
    for (i = 0; i < l; i++)
    {
        a[i] = arr[i];
    }
    return a;
}
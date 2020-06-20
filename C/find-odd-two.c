/*
Given an array containing n elements, in which, all the elements are present even number of times except for two elements 

which occurs odd number of times. Find these two strange elements in ascending order in linear time with constant space complexity.

*/

#include <stdio.h>
/* Include other headers as needed */
int main()
{
    int size;
    scanf("%d", &size);
    int arr[size], m = 0, a = 0, b = 0;
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    int n = arr[0];
    for (int i = 1; i < size; i++)
        n = n ^ arr[i];

    m = n & ~(n - 1);

    for (int i = 0; i < size; i++)
    {
        if (arr[i] & m)
            a = a ^ arr[i];
        else
            b = b ^ arr[i];
    }
    if (a < b)
        printf("%d %d", a, b);
    else
        printf("%d %d", b, a);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
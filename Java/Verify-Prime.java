/*============

    function verifyPrime that accepts an integer parameter n 
    and return 
    1 if number is prime 
    0 if number is not prime.
    
=============================*/
static int verifyPrime(int n)
{
  int i=0,key=0;

  for(i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
        key=1;
    }
  }
  if(n==0 || n==1)return 0;
  if(key==1)
  {
      return 0;
  }
  else return 1;
}
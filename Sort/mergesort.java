class mergesort(int left[],int right[],intA[])
{
	int L = leftA.length;
	int R= rightA.length; 
	int i=j=k=0;
	while(i<L && j<R)
	{
		if(L[i]<=R[j])
		{
			A[k]=L[i];
			k= k+1;
			i= i+1;
		}
		else
		{	
			A[k]=R[j];
			j=j+1;
		}
		k=k+1;
	}
	while(i<L)
	{
		A[k]=L[i];
        i=i+1;
        k=k+1;
	}
	while(j<R)
	{
		A[k]=R[j];
        j=j+1;
        k=k+1;
	
    }
}

class MergeSort(int A[])
{
	
	int n=A.length; 
	if(n<2)
		return
	mid=n/2;
	int left[]=new int[mid];
	int rigt[]=new int[n-mid];
	for(i=0;i<=mid-1;i++)
		left[i]=A[i];
	for(i=mid;i<=n-1;i++)
		right[i-mid]=A[i];
	MergeSort(left);
	MergeSort(right);
	Merge(left,right,A);
}
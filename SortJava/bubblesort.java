class bubblesort {
   
    public static int[] sort(int data[]){
        int temp;
        for(int i=0; i<data.length-1; i++){
            for(int j=0; j<data.length-i-1; j++){
                if(data[j]>data[j+1]){
                    temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;      
                }
            }
        }
        return data;
    }

    public static void print(int data[]){
        for(int i=0; i<data.length-1; i++){
            System.out.print(data[i]+" ");
        }
    }
  
    public static void main(String[] args) {
        int data[]={11,32,25,34,5,1,546,43,2,56,43,213,54,0};
        System.out.println("Before Sorting:");
        print(data);
        data = sort(data);
        System.out.println();
        System.out.println("After Sorting:");
        print(data);

    }
}

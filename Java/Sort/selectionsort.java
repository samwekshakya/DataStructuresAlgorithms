 class selectionsort {
    public static void print(int data[]){
        for(int i=0; i<data.length-1; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static int[] ssort(int data[]){
       
        for(int i=0; i<data.length-1; i++){
            int min_indx=i;

            for(int j = i+1; j< data.length; j++){
                if(data[j]< data[min_indx])
                    min_indx=j;
            }

            int temp=data[i];
            data[i]=data[min_indx];
            data[min_indx]=temp;
        }
        return data;
    }
    public static void main(String[] args) {
        int data[]={11,32,25,34,5,1,546,43,2,56,43,213,54,0};
        System.out.println("Before Sorting:");
        print(data);
        data = ssort(data);
        System.out.println();
        System.out.println("After Sorting:");
        print(data);
    
    }
}

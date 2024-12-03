class insertionsort {
    public static void print(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static int[] isort(int data[]) {
        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int j = i;

            while (j > 0 && temp < data[j - 1]) {
                data[j] = data[j - 1];
                j = j - 1;

            }
            data[j] = temp;

        }
        return data;
    }

    public static void main(String[] args) {
        int data[] = { 11, 32, 25, 34, 5, 1, 546, 43, 2, 56, 43, 213, 54, 0 };
        System.out.println("Before Sorting:");
        print(data);
        data = isort(data);
        System.out.println();
        System.out.println("After Sorting:");
        print(data);

    }

}

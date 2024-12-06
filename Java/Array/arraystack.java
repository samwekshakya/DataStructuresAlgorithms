import java.util.Scanner;

class mystack {
    private Integer stackarray[];
    private int tos;

    public mystack(int maxsize) {
        tos -= 1;
        stackarray = new Integer[maxsize];
    }

    public void push(Integer element) {
        if (tos >= stackarray.length - 1) {
            System.out.println("stack overflow");
        } else {
            stackarray[++tos] = element;
        }
    }

    public Integer getTopElement() {
        return stackarray[tos];
    }

    public Integer pop() {
        if (tos < 0)
            return null;
        else
            return stackarray[tos--];
    }

    public static void main(String[] args) {
        mystack s = new mystack(5);
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter a choice to perform following options" + "\n" +
                        "1:Push 2:Pop 3:Exit");
                int data = sc.nextInt();

                switch (data) {
                    case 1: {
                        System.out.println("Enter an element to push into the stack");
                        int ele = sc.nextInt();
                        s.push(ele);
                    }
                        break;

                    case 2: {
                        while (s.tos != -1) {
                            Integer popped = s.pop();
                            if (popped == null)
                                System.out.println("Stack underflow");
                            else
                                System.out.println(popped);
                        }
                    }
                    case 3: {
                        System.exit(0);

                    }
                        break;
                    default: {
                        System.out.println("Invalid Input!!!" + "Please Try Again");
                    }
                        break;
                }

            }
        }
    }
}

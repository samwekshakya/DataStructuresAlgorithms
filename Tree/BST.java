import java.util.Scanner;

class IntBSTNode {
    public int key;
    IntBSTNode left, right;

    public IntBSTNode() {
        left = right = null;
    }

    public IntBSTNode(int el) {
        this(el, null, null);

    }

    public IntBSTNode(int el, IntBSTNode lt, IntBSTNode rt) {
        key = el;
        left = lt;
        right = rt;
    }
}

class IntBST {
    public IntBSTNode root;

    public IntBST() {
        root = null;
    }

    protected void visit(IntBSTNode p) {
        System.out.println(p.key + " ");
    }

    public IntBSTNode search(int el,IntBSTNode p){

        while(p!=null){
            if(p.key==el)
                return p;
            else if(p.key<el) 
                p=p.right;
            else 
                p=p.left;
        }
        return null;
    }

    public void preOrder(IntBSTNode p) {
        if (p != null) {
            visit(p);
            preOrder(p.left);
            preOrder(p.right);

        }
    }
    public void inOrder(IntBSTNode p) {
        if (p != null) {
            inOrder(p.left);
            visit(p);
            inOrder(p.right);

        }
    }
    public void postOrder(IntBSTNode p) {
        if (p != null) {
            postOrder(p.left);
            postOrder(p.right);
            visit(p);

        }
    }

    public void insert(int el) {
        IntBSTNode p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.key < el)
                p = p.right;
            else
                p = p.left;

        }
        if (root == null)
            root = new IntBSTNode(el);
        else if (prev.key < el)
            prev.right = new IntBSTNode(el);
        else
            prev.left = new IntBSTNode(el);
    }

    public static void main(String[] args) {
        IntBST tree = new IntBST();
        
        try (Scanner sc = new Scanner(System.in))
         {
            while (true) {
                System.out.println("Enter the a number to perform the following actions" +"\n"+
                        "1:Insert 2:PreOrder Traversal 3:InOrder Traversal 4:PostOrder Traversal 5:Exit 6:Search");
                int input = sc.nextInt();

                switch (input) {
                    case 1: {
                        System.out.println("Enter a number");
                        tree.insert(sc.nextInt());
                        break;
                    }
                    case 2: {
                        tree.preOrder(tree.root);
                        break;
                    }
                    case 3: {
                        tree.inOrder(tree.root);
                        break;
                    }
                    case 4: {
                        tree.postOrder(tree.root);
                        break;
                    }
                    case 5: {
                        System.exit(0);
                        break;
                    }
                
                    default:
                        System.out.println("Invalid input!!!! Try Againa");
                        break;
                } 
            }
        }
    }
}

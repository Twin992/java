
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
    class BinarySearchTree{
        Node root;
        BinarySearchTree(){
            root=null;
        }
        Node insert(Node node,int data){
            if(node==null){
                node=new Node(data);
                return data;
            }
            if(data<node.data){
                node.left=insert(node.left,data);
            }
            else if(data>node.data){
                node.right=insert(node.right,data);
            }
            return node;
        }
    
    Node insert(Node node,int data){
        if(node==null){
            return new Node(data);
        }

    }
    void inorderTraversal(Node node){
        if(node!=null){
            inorderTraversal(node.left);
            System.out.print(node.data+"");
            inorderTraversal(node.right);
        }
    }
    void preorderTraversal(Node node){
        if(node!=null){
            System.out.print(node.data+"");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
    void postorderTraversal(Node node){
        if(node!=null){
           
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data+"");
        }
    }
    Node search(Node root,int key){
        if(root==null||root.data==key)
           return root;
        if(root.data<key)
           return search(root.right,key);
    }
    public static void main(String[] args)
    {
        tree.insert(tree.root,data:5);
        tree.insert(tree.root,data:3);
        tree.insert(tree.root,data:2);
        tree.insert(tree.root,data:4);
        tree.insert(tree.root,data:1);
        tree.insert(tree.root,data:7);
        tree.insert(tree.root,data:6);
    
         System.out.println(x:"inorder traversal of the tree");
         tree.inorderTraversal(tree.root);
         System.out.println(x:"preorder traversal of the tree");
         tree.preorderTraversal(tree.root);
         System.out.println(x:"postorder traversal of the tree");
         tree.postorderTraversal(tree.root);
         System.out.println(x:"\nSearch for node with value 4:");
         Node result=tree.search(tree.root,key:40);
        if(result!=null)
        {
        System.out.println("Node found:"+result.data);

        }
        else
        {
        System.out.println(x:"Node not found");
        }
    }
    

}
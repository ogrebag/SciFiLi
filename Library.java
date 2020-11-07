public class Library {

    // if something needs to be called from the book class 
    // we can simply to myBTNode.getData().getAuthor();
    private BTNode root;

    /* Constructor */
    public Library()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public void insert(Book data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private BTNode insert(BTNode node, Book data)
    {
        if (node == null)
            node = new BTNode(data);
        else
        {
            if (node.getRight() == null)
                node.right = insert(node.right, data);
            else
                node.left = insert(node.left, data);             
        }
        return node;
    }     
    /* Function to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(BTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /* Function to search for an element */
    public String search(String val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private String search(BTNode r, String val)
    {
        if (r.getData().getTitle().equals(val))
            return r.getData().getTitle();

        if (!(r.getLeft().getData().getTitle().equals(null)))
            if (r.getLeft().getData().getTitle().equals(val))
                return r.getData().getTitle();

        if (!(r.getRight().getData().getTitle().equals(null)))
            if (r.getRight().getData().getTitle().equals(val))
                return r.getData().getTitle();

        return ("Nothing Found");         
    }
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(BTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }  

	// Method for searching by author
    public String searchAuthor(String userAuthor) {
        // traverse the binary tree and return all the books by that author
        return "";
	}

    // Method for searching by title
    public String searchTitle(){
        // call search function ==> search function needs to be able to take in book data type
        return "";
    }

    // Sorting by title
    public void sortTitle(){
        // traverse the binary tree in order
    }

    // Method for changing status
    public void statChange(){
        // only called when the checkBook Method is called
    }
}
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
     private BTNode insert(BTNode current, Book value) {
        if (current == null) {
            current = new BTNode(value);
        }
        if (value.getTitle().compareTo(current.getData().getTitle()) < 0) { // if alphabetically lower
            current.left = insert(current.left, value);
        } else if (value.getTitle().compareTo(current.getData().getTitle()) > 0) {  // if alphabetically higher
            current.right = insert(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
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
            return r.getData().toString();

        if (!(r.getLeft().getData().getTitle().equals(null)))
            if (r.getLeft().getData().getTitle().equals(val))
                return r.getData().toString();

        if (!(r.getRight().getData().getTitle().equals(null)))
            if (r.getRight().getData().getTitle().equals(val))
                return r.getData().toString();

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
            System.out.print(r.getData().getTitle() +" ");
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
            System.out.print(r.getData().getTitle() +" ");
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
            System.out.print(r.getData().getTitle() +" ");
        }
    }  

	// Method for searching by author
    public String searchAuthor(String userAuthor) {
        // traverse the binary tree and return all the books by that author
        // if userauthor.equals(r.getData().getAuthor)
        // then print that out
        // else go to the next node 
        return "";
	}

    // Method for searching by title
    public String searchTitle(String title){
        return search(title);
    }

    // Sorting by title
    public void sortTitle(){
        inorder();
    }

    // Method for changing status
    public void statChange(BTNode r){
        // only called when the checkBook Method is called
        if(r.getData().getStatus() == 1){
            r.getData().setStatus(0);
        } 
        else if(r.getData().getStatus() == 0){
            r.getData().setStatus(1);
        }
    }
}
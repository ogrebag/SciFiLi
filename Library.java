public class Library {
    // necessary variables
    private String title;
    private String author;
    private int status;
    private int priority;
    private Book book;
    // stacks for the check in and checkout methods
    private Stack<Book> checkinStack;
    private Stack<Book> checkoutStack;


    // Default constructor
    public Library(String t, String a, int s, int p){
        title = t;
        author = a;
        status = s;
        priority = p;
        book = new Book(t, a, s, p);
    }

    // Method for searching by author
    public String searchAuthor(String userAuthor) {
		return author;
	}

    // Method for searching by title
    public String searchTitle(String userTitle){
        return title;
    }

    // Checkin method
    public void checkin(String userBook){
        
    }

    // Checkout method
    public void checkout(Book userBook){
        checkoutStack.Push(userBook);   // pushing the book into the stack
        userBook.setStatus(0);  // changing the status
    }

    // Sorting by author
    public void sortAuthor(){

    }

    // Sorting by title
    public void sortTitle(){
        
    }

    // Method for the user wants the list of all the books
    // this needs to be alphabetically sorted by title first 
    public String endDay(){
        String bookTitle = book.getTitle();
        String bookAuthor = book.getAuthor();
        int bookStatus = book.getStatus();
        return(bookTitle + "\t\t" + bookAuthor + "\t\t" + bookStatus + "\n");
    }
}
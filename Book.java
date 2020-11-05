public class Book {
	private String title;
	private String author;
	private int status;
	private int priority;
	
	public Book()
	{
		title = "";
		author = "";
	}
	public Book(String t, String a, int s, int p)
	{
		title = t;
		author = a;
		status = s;
		priority = p;
		
	}
	
	// added this because of data type issues with checkout method
	public Book(String nextLine) {
	}

	public String getTitle()
	{
		return title;
	}
	public void setTitle(String t)
	{
		title  = t;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String a)
	{
		author = a;
	}
	public int getStatus()
	{
		return status;
	}
	public void setStatus(int s)
	{
		status = s;
	}
	public int getPriority()
	{
		return priority;
	}
	public void setPriorirty(int p)
	{
		priority = p;
	}
	
	
	
	
}

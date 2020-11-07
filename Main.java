import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] Args) throws IOException {

        /*Getting the file and going through each line*/
        File libraryFile = new File("log.txt");
        Scanner scanner = new Scanner(libraryFile);

        /*scifili(BT) to hold the required variables*/
        Library scifili = new Library();

        String string; // holds the string you read from the file
        String[] split;  // Holds the string after splitting

        // going through the file and storing the books
        int i = 0;
        while(scanner.hasNext()) {
            string = scanner.nextLine();
            split = string.split(", "); // splitting to seperate the data
            scifili.insert(split[i]); // ==> needs to be a Book object and not object
            i++;
        }

        /*The user menu*/
        boolean isMenuOpen = true;
        while(isMenuOpen) {
            Scanner user = new Scanner(System.in);

            /*Skipping a line and showing the menu and its options*/
            System.out.println();
            System.out.println("What Option would you like?");
            System.out.println("1 - Sort based on author name");
            System.out.println("2 - Sort based on title");
            System.out.println("3 - Oh there is a fire? Lets save the books");
            System.out.println("4 - Searching for an author's books?");
            System.out.println("5 - Searching for a specific book and need details?");
            System.out.println("6 - Are you trying to check in?");
            System.out.println("7 - Are you trying to check out?");
            System.out.println("8 - Are you leaving and need a list of the books?");
            System.out.println("Exit");
            System.out.println();

            String userInput = user.nextLine(); // scanning user input

            // if the user wants to sort by author name
            // NOT WORKING FOR SOME REASON
            if (userInput.equals("1")) {
                
            }

            // if the user wants to sort by the title
            else if (userInput.equals("2")) {

            }

            // if there is a fire
            else if (userInput.equals("3")) {
                System.out.println(scifili.searchTitle());
            }

            // if the user is searching based on author name
            else if (userInput.equals("4")) {
                System.out.println("Who is the author you are looking for?"); 
                Scanner userAuthor = new Scanner(System.in);
            }

            // if the user is searching based on title
            else if (userInput.equals("5")) {
                System.out.println("What book are you looking for?"); 
                Scanner userTitle = new Scanner(System.in);
            }

            // if the user is trying to check in
            else if (userInput.equals("6")) {
                isMenuOpen = false;
            }

            // if the user is trying to check out
            else if (userInput.equals("7")) {
                System.out.println("How many books are you checking out today?"); // asking what book to checkout
                Scanner userPile = new Scanner(System.in);
                int userBooks = Integer.parseInt(userPile.nextLine()); 
                System.out.println("What books are you checking out today?");
                // NEED TO KEEP OPEN TO ASK THE USER FOR MORE BOOKS
                // NEED TO KNOW WHICH BOOK TO CHANGE STATUS FOR - USE SEARCH TITLE METHOD
                for(;userBooks>0;userBooks--){
                    Scanner ub = new Scanner(System.in);
                    //scifili[0].checkout(new Book(ub.nextLine()));
                    System.out.println("checked out");
                }
            }

            // if the user is leaving the library
            else if (userInput.equals("8")) {
                // creating the new file
                try {
                    File myObj = new File("LibraryStatus.txt");
                    if (myObj.createNewFile()) {
                      System.out.println("File created: " + myObj.getName());
                    } else {
                      System.out.println("File already exists.");
                    }
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                // writing to the new file
                try {
                    FileWriter myWriter = new FileWriter("LibraryStatus.txt");
                    myWriter.write("Title\t\tAuthor\t\tStatus\n");
                    // NEED TO GIVE THE STATUSES
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                isMenuOpen = false; // closing the menu
            }

            // if the user wants to exit
            else if (userInput.equals("Exit")) {
                isMenuOpen = false;
            }

            // if the user input is invalid
            else {
                System.out.println("invalid input!");
            }
        }
    } 

    // Method for checking in and checking out
    public void checkBook(){
        // push into the stack till done and no books
        // pop those books out and change their status
    }

    // Method for sorting based on author name
    public String sortAuthor(){
        // copy the binary tree
        // and turn it into a heap 
        // then start removing the author names
        return "";
    }
}

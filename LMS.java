import java.util.Scanner;

public class LMS {
    public static void main(String[] args){
        // All the library operations and records, including the number of books, genres of books, names of books, records of the students who’ve issued/returned books, etc.

        //Number of books stored
        System.out.println("Please enter number of books stored");
        Scanner input = new Scanner(System.in);
        double noOfBooks = input.nextDouble();
        System.out.println("The number of books stored in this library is " + noOfBooks);

        //Genres of books stored
        String [] genreOfBooks = {"Poetry","Fiction","Fantasy","Mystery","Biography","Drama"};
        System.out.println("The genre of books available in this library are: ");
        for(int i =0; i<genreOfBooks.length;i++){
            System.out.println(genreOfBooks[i] + ", ");
        }

        //Names of books
        String [] namesOfBooks = {"Alchemist","Secrets","Home","Bible","Biology Form 4","Mathematics Form 2"};
        

        //Borrow books
        System.out.println("Do you want to borrow a book? Yes or No");
        String ans1 = input.next();
        if(ans1.equals("yes")){
            System.out.println("Here's a catalogue of list of books available, please choose one amongst: " + namesOfBooks[0]+ ", "  + namesOfBooks[1] + ", " + namesOfBooks[2]);
            String ans2 = input.next();

                    while(ans2 != namesOfBooks[0]&& ans2 != namesOfBooks[1] && ans2 != namesOfBooks[2]){
                        System.out.println("Sorry we don't have it, please try agaiin, what would you like between " + namesOfBooks[0]+ ", "  + namesOfBooks[1] + " and " + namesOfBooks[2]);
    
                        ans2 = input.next();
                }
                if(
                    ans2 == namesOfBooks[0] || ans2 == namesOfBooks[1] || ans2 == namesOfBooks[2])
                    {System.out.println("Great, " + ans2 + " is available, it is due in 5 days. Late returns will be fined!");
                }

        } else{
            System.out.println("Okay, have a nice day:)");
        }

    }
}

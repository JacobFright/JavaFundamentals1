public class BookDemo {
    public static void main(String[] args) {

        Book gameOfThrones = new Book("George Matin", "Game of Thrones",
                "Fantasy", 864);

        Book mathsBook = new Book("James Stewart", "Calculus",
                "Maths", 1392);

        Book javaBook = new Book("Joel Murach", "Murach's Java Programming",
                "Programming", 800);

//        printBookDetails(gameOfThrones);
//        printBookDetails(mathsBook);
//        printBookDetails(javaBook);
        gameOfThrones.printBookDetails();
        mathsBook.printBookDetails();
        javaBook.printBookDetails();
    }

//    public static void printBookDetails(Book book){
//        System.out.println(book.getTitle());
//        System.out.println("by " + book.getAuthor());
//        System.out.println("has " + book.getNumPages() + " pages, and its genre is " +
//                book.getGenre());
//
//        System.out.println();
//    }
}

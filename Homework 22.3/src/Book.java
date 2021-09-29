public class Book {
    private final String bookName;
    private final String authorName;
    private final int numberOfPages;
    private final int isbnNumber;

    public Book(String bookName, String authorName, int numberOfPages, int isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.isbnNumber = isbnNumber;
    }
}

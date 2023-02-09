
public class Book {
    private String bookName;
    private int bookPage;
    private String authorName;
    private int publicationDate;

    public Book(String bookName, int bookPage, String authorName, int publicationDate) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}

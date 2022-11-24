public class Book {
    private String name;
    private Author author;
    private int publicationDate;

    public Book(String nameBook, Author author, int publicationDate) {
        this.name = nameBook;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}

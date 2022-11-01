public class Book {
    String title;
    Author authorName;
    int yearPublishing;

    public Book(String title, Author authorName, int yearPublishing) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}

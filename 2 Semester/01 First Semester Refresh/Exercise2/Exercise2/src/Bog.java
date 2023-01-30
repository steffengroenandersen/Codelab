public class Bog {

    // Variables
    private String isbn;
    private String titel;
    private String publishingYear;

    // Constructors

    public Bog(String isbn, String titel, String publishingYear) {
        this.isbn = isbn;
        this.titel = titel;
        this.publishingYear = publishingYear;
    }

    // Methods

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbn='" + isbn + '\'' +
                ", titel='" + titel + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                '}';
    }
}

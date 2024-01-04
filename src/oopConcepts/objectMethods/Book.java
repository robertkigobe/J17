package oopConcepts.objectMethods;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Override the toString method
    @Override public String toString()
    {
        return title + " by " + author + " (" + year + ")";
    }

    // Override the equals method
    @Override public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        Book other = (Book)obj;
        return this.title.equals(other.getTitle())
                && this.author.equals(other.getAuthor())
                && this.year == other.getYear();
    }

    // Override the hashCode method
    @Override public int hashCode()
    {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year;
        return result;
    }

    // Override the clone method
    @Override public Book clone()
    {
        try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Override the finalize method
    @Override protected void finalize() throws Throwable
    {
        System.out.println("Finalizing " + this);
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public int getYear() { return year; }
    public static void main(String[] args)
    {
        // Create a Book object and print its details
        Book book1 = new Book(
                "The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams", 1979);
        System.out.println(book1);

        // Create a clone of the Book object and print its
        // details
        Book book2 = book1.clone();
        System.out.println(book2);

        // Check if the two objects are equal
        System.out.println("book1 equals book2: "
                + book1.equals(book2));

        // Get the hash code of the two objects
        System.out.println("book1 hash code: "
                + book1.hashCode());
        System.out.println("book2 hash code: "
                + book2.hashCode());

        // Set book1 to null to trigger garbage collection
        // and finalize method
        book1 = null;
        System.gc();
    }
}
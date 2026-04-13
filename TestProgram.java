public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Anthon", 101);

        LibraryResource book = new Book();
        LibraryResource journal = new Journal();
        LibraryResource audioBook = new AudioBook();

        student.borrowResource(book, "Design Patterns");
        student.borrowResource(journal, "AI Research Journal");
        student.borrowResource(audioBook, "SOLID Principles Audiobook");
    }
}

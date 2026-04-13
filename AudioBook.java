public class AudioBook implements LibraryResource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing audiobook: " + title);
    }
}

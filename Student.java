public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void borrowResource(LibraryResource resource, String title) {
        resource.borrow(title);
    }
}

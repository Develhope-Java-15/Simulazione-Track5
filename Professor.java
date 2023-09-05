public class Professor {
    private String name;
    private byte identifier;
    private String course;

    public Professor(String name, byte identifier, String course) {
        this.name = name;
        this.identifier = identifier;
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

}

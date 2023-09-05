public class Main {
    static void printCourseLastLetter(Professor[] professors) {
        for(Professor professor : professors) {
            String course = professor.getCourse();
            int lastLetterIndex = course.length() - 1;
            System.out.println(course.charAt(lastLetterIndex));
        }
    } 

    public static void main(String[] args) {
        Professor[] array = new Professor[] {
            new Professor("Gianni", (byte) 0, "Java"),
            new Professor("Gianna", (byte) 5, "C++"),
            new Professor("Johnny", (byte) 15, "Mathematics")
        };

        printCourseLastLetter(array);

        for(Professor professor : array) {
            if(professor.getCourse().length() > 10) {
                System.out.println(professor.getName());
            }
        } 
    }
}

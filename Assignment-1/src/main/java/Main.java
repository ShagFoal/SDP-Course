public class Main {
    public static void main(String[] args) {
        StudyCourse course = new StudyCourseBuilder().description("sdf").build();
        course.toString();
    }
}

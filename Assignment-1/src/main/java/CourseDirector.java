public class CourseDirector {
    public static void constructJavaBasicCourse(StudyCourseBuilder builder) {
        builder.title("Java Basics")
                .description("A self-paced course covering Java fundamentals, OOP and collections")
                .language(CourseLanguage.ENGLISH)
                .level(CourseLevel.BEGINNER)
                .format(StudyFormat.SELF_PACED)
                .addModule("Java Core")
                .addModule("OOP")
                .addModule("Collections")
                .durationWeeks(8)
                .hoursPerWeek(5);
    }

    public static void constructJavaBackendCourse(StudyCourseBuilder builder) {
        builder.title("Java Backend")
                .description("An instructor-led course covering backend development")
                .language(CourseLanguage.ENGLISH)
                .level(CourseLevel.INTERMEDIATE)
                .format(StudyFormat.INSTRUCTOR_LED)
                .addModule("HTTP and REST")
                .addModule("Spring Boot")
                .addModule("SQL and PostgreSQL")
                .addModule("Docker and Deployment")
                .durationWeeks(8)
                .hoursPerWeek(15)
                .finalProject("Build a task management REST API");
    }
}

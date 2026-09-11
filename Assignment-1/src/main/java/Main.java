public class Main {
    public static void main(String[] args) {
        StudyCourseBuilder basicsBuilder = new StudyCourseBuilder();
        CourseDirector.constructJavaBasicCourse(basicsBuilder);
        StudyCourse basicsCourse = basicsBuilder.build();

        System.out.println("Java Basics:");
        System.out.println(basicsCourse);

        StudyCourseBuilder backendBuilder = new StudyCourseBuilder();
        CourseDirector.constructJavaBackendCourse(backendBuilder);
        StudyCourse backendCourse = backendBuilder.build();

        System.out.println("\nJava Backend:");
        System.out.println(backendCourse);

        StudyCourseBuilder customBuilder = new StudyCourseBuilder();
        StudyCourse customCourse = customBuilder
                .title("Python Basics")
                .description("An introductory Python course")
                .language(CourseLanguage.ENGLISH)
                .level(CourseLevel.BEGINNER)
                .format(StudyFormat.SELF_PACED)
                .addModule("Variables and Loops")
                .addModule("Functions")
                .durationWeeks(4)
                .hourPerWeek(5)
                .build();

        System.out.println("\nCustom course:");
        System.out.println(customCourse);

        System.out.println("\nInvalid course:");
        try {
            StudyCourseBuilder invalidBuilder = new StudyCourseBuilder();
            StudyCourse invalidCourse = invalidBuilder
                    .title("Invalid Course")
                    .language(CourseLanguage.ENGLISH)
                    .level(CourseLevel.BEGINNER)
                    .format(StudyFormat.SELF_PACED)
                    .addModule("Java Core")
                    .durationWeeks(0)
                    .hourPerWeek(5)
                    .build();

            System.out.println(invalidCourse);
        } catch (IllegalStateException e) {
            System.out.println("Cannot create course: " + e.getMessage());
        }
    }
}
import java.util.List;

public class StudyCourse {
    private String title;
    private String description;
    private CourseLanguage language;
    private CourseLevel level;
    private StudyFormat format;
    private List<String> modules;
    private int durationWeeks;
    private int hoursPerWeek;
    private String finalProject;

    public StudyCourse(String title, String description, CourseLanguage language, CourseLevel level, StudyFormat format, List<String> modules, int durationWeeks, int hoursPerWeek, String finalProject) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.level = level;
        this.format = format;
        this.modules = List.copyOf(modules);
        this.durationWeeks = durationWeeks;
        this.hoursPerWeek = hoursPerWeek;
        this.finalProject = finalProject;
    }

    public int getTotalStudyHours() {
        return this.hoursPerWeek * this.durationWeeks;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public CourseLanguage getLanguage() {
        return language;
    }

    public CourseLevel getLevel() {
        return level;
    }

    public StudyFormat getFormat() {
        return format;
    }

    public List<String> getModules() {
        return modules;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public String getFinalProject() {
        return finalProject;
    }

    @Override
    public String toString() {
        return "StudyCourse{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                ", level=" + level +
                ", format=" + format +
                ", modules=" + modules +
                ", durationWeeks=" + durationWeeks +
                ", hoursPerWeek=" + hoursPerWeek +
                ", finalProject='" + finalProject + '\'' +
                '}';
    }
}

enum CourseLevel {
    BEGINNER, INTERMEDIATE, ADVANCED
}

enum CourseLanguage {
    ENGLISH, RUSSIAN, KAZAKH
}

enum StudyFormat {
    SELF_PACED,INSTRUCTOR_LED
}

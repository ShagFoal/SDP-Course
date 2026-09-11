import java.util.List;

public class StudyCourse {
    private String title;
    private String description;
    private String language;
    private CourseLevel level;
    private StudyFormat format;
    private List<String> modules;
    private int durationWeeks;
    private int hoursPerWeek;
    private String finalProject;

    public StudyCourse(String title, String description, String language, CourseLevel level, StudyFormat format, List<String> modules, int durationWeeks, int hoursPerWeek, String finalProject) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.level = level;
        this.format = format;
        this.modules = modules;
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

    public String getLanguage() {
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
        return super.toString();
    }
}

enum CourseLevel {
    BEGINNER, INTERMEDIATE, ADVANCED
}

enum StudyFormat {
    SELF_PACED,INSTRUCTOR_LED
}
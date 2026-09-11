import java.util.ArrayList;
import java.util.List;

public class StudyCourseBuilder {
    private String title;
    private String description;
    private String language;
    private CourseLevel level;
    private StudyFormat format;
    private List<String> modules;
    private int durationWeeks;
    private int hoursPerWeek;
    private String finalProject;

    public StudyCourseBuilder () {
        modules = new ArrayList<>();
    }

    public StudyCourseBuilder title(String title) {
        this.title = title;
        return this;
    }

    public StudyCourseBuilder description(String description) {
        this.description = description;
        return this;
    }
    public StudyCourseBuilder language(String language) {
        this.language = language;
        return this;
    }
    public StudyCourseBuilder level(CourseLevel level) {
        this.level = level;
        return this;
    }
    public StudyCourseBuilder format(StudyFormat format) {
        this.format = format;
        return this;
    }
    public StudyCourseBuilder addModule(String module) {
        modules.add(module);
        return this;
    }
    public StudyCourseBuilder durationWeeks(int durationWeeks) {
        this.durationWeeks = durationWeeks;
        return this;
    }
    public StudyCourseBuilder hourPerWeek(int hourPerWeek) {
        this.hoursPerWeek = hourPerWeek;
        return this;
    }

    public StudyCourseBuilder finalProject(String finalProject) {
        this.finalProject = finalProject;
        return this;
    }

    public StudyCourse build() {
        return new StudyCourse(title,description,language,level,format,modules,durationWeeks, hoursPerWeek,finalProject);
    }
}

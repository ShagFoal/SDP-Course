import java.util.ArrayList;
import java.util.List;

public class StudyCourseBuilder {
    private String title;
    private String description;
    private CourseLanguage language;
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
    public StudyCourseBuilder language(CourseLanguage language) {
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

    public StudyCourse build() throws IllegalStateException {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Title of course must be not empty");
        }
        if (language == null) {
            throw new IllegalStateException("Language of course must be not empty");
        }
        if (level == null) {
            throw new IllegalStateException("Level of course must be not null");
        }
        if (format == null) {
            throw new IllegalStateException("Format of course must be not null");
        }
        if (modules.isEmpty()) {
            throw new IllegalStateException("Modules of course must be contain something");
        }
        for (String module : modules) {
            if (module == null || module.isBlank()) {
                throw new IllegalStateException("Module of course must be not empty");
            }
        }
        if (durationWeeks <= 0) {
            throw new IllegalStateException("DurationWeeks must be greater than 0");
        }

        if (hoursPerWeek <= 0) {
            throw new IllegalStateException("Hour per week must be greater than 0");
        }
        return new StudyCourse(title,description,language,level,format,modules,durationWeeks, hoursPerWeek,finalProject);
    }
}

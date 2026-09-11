# Study Course Builder

This project uses the Builder pattern to create study courses.

## Classes

- StudyCourse stores course data.
- StudyCourseBuilder builds and checks a course.
- CourseDirector has two course recipes.
- Main runs the examples.

## How to run

Open the project in IntelliJ IDEA.
Set the project JDK and run Main.java.

The program shows three courses and one error example.

## Clean Code

The "Before" examples show possible bad code, not actual earlier versions.

### 1. Clear names

Before:

```java
private int h;
```

After:

```java
private int hoursPerWeek;
```

The new name tells us what the number means.

### 2. Small methods

Before:

```java
public StudyCourse build() {
    // All checks are here.
    // Then create the course.
}
```

After:

```java
public StudyCourse build() {
    validate();
    return new StudyCourse(
            title, description, language, level, format,
            modules, durationWeeks, hoursPerWeek, finalProject
    );
}
```

Checks are in validate(). The build() method is short and easy to read.

### 3. Each class has one job

Before:

```java
// Main contains all steps for the Java Basics recipe.
basicsBuilder.title("Java Basics")
        .language(CourseLanguage.ENGLISH)
        .level(CourseLevel.BEGINNER);
// More recipe steps...
```

After:

```java
CourseDirector.constructJavaBasicCourse(basicsBuilder);
```

The Director stores the recipe. Main uses it.
We can use the same recipe again without copying its steps.

### 4. Check data before building

```java
if (durationWeeks <= 0) {
    throw new IllegalStateException("DurationWeeks must be greater than 0");
}
```

This check is inside validate().
It stops the Builder from creating a course with zero or negative weeks.
The Builder also checks other required fields.

### 5. No magic strings

```java
enum CourseLanguage {
    ENGLISH, RUSSIAN, KAZAKH
}
```

```java
.language(CourseLanguage.ENGLISH)
```

The code uses named values for languages instead of strings.
This shows the allowed choices and avoids spelling errors.
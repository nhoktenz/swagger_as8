package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Course;
import io.swagger.model.Student;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")


public class InlineResponse200   {
  @JsonProperty("students")
  @Valid
  private List<Student> students = null;

  @JsonProperty("courses")
  @Valid
  private List<Course> courses = null;

  public InlineResponse200 students(List<Student> students) {
    this.students = students;
    return this;
  }

  public InlineResponse200 addStudentsItem(Student studentsItem) {
    if (this.students == null) {
      this.students = new ArrayList<Student>();
    }
    this.students.add(studentsItem);
    return this;
  }

  /**
   * Get students
   * @return students
   **/
  @Schema(description = "")
      @Valid
    public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public InlineResponse200 courses(List<Course> courses) {
    this.courses = courses;
    return this;
  }

  public InlineResponse200 addCoursesItem(Course coursesItem) {
    if (this.courses == null) {
      this.courses = new ArrayList<Course>();
    }
    this.courses.add(coursesItem);
    return this;
  }

  /**
   * Get courses
   * @return courses
   **/
  @Schema(description = "")
      @Valid
    public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.students, inlineResponse200.students) &&
        Objects.equals(this.courses, inlineResponse200.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(students, courses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

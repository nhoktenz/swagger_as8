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
 * CourseWithStudents
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")


public class CourseWithStudents   {
  @JsonProperty("course")
  private Course course = null;

  @JsonProperty("registeredStudents")
  @Valid
  private List<Student> registeredStudents = null;

  public CourseWithStudents course(Course course) {
    this.course = course;
    return this;
  }

  /**
   * Get course
   * @return course
   **/
  @Schema(description = "")
  
    @Valid
    public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public CourseWithStudents registeredStudents(List<Student> registeredStudents) {
    this.registeredStudents = registeredStudents;
    return this;
  }

  public CourseWithStudents addRegisteredStudentsItem(Student registeredStudentsItem) {
    if (this.registeredStudents == null) {
      this.registeredStudents = new ArrayList<Student>();
    }
    this.registeredStudents.add(registeredStudentsItem);
    return this;
  }

  /**
   * Get registeredStudents
   * @return registeredStudents
   **/
  @Schema(description = "")
      @Valid
    public List<Student> getRegisteredStudents() {
    return registeredStudents;
  }

  public void setRegisteredStudents(List<Student> registeredStudents) {
    this.registeredStudents = registeredStudents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourseWithStudents courseWithStudents = (CourseWithStudents) o;
    return Objects.equals(this.course, courseWithStudents.course) &&
        Objects.equals(this.registeredStudents, courseWithStudents.registeredStudents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, registeredStudents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseWithStudents {\n");
    
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    registeredStudents: ").append(toIndentedString(registeredStudents)).append("\n");
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

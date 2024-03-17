package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Course
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")


public class Course   {
  @JsonProperty("courseNumber")
  private Integer courseNumber = null;

  @JsonProperty("courseTitle")
  private String courseTitle = null;

  public Course courseNumber(Integer courseNumber) {
    this.courseNumber = courseNumber;
    return this;
  }

  /**
   * Get courseNumber
   * @return courseNumber
   **/
  @Schema(example = "101", required = true, description = "")
      @NotNull

    public Integer getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(Integer courseNumber) {
    this.courseNumber = courseNumber;
  }

  public Course courseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
    return this;
  }

  /**
   * Get courseTitle
   * @return courseTitle
   **/
  @Schema(example = "Maths", required = true, description = "")
      @NotNull

    public String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.courseNumber, course.courseNumber) &&
        Objects.equals(this.courseTitle, course.courseTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseNumber, courseTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    
    sb.append("    courseNumber: ").append(toIndentedString(courseNumber)).append("\n");
    sb.append("    courseTitle: ").append(toIndentedString(courseTitle)).append("\n");
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

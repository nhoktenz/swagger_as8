package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegisterRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")


public class RegisterRequest   {
  @JsonProperty("courseNumber")
  private Integer courseNumber = null;

  @JsonProperty("studentId")
  private Integer studentId = null;

  public RegisterRequest courseNumber(Integer courseNumber) {
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

  public RegisterRequest studentId(Integer studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * Get studentId
   * @return studentId
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequest registerRequest = (RegisterRequest) o;
    return Objects.equals(this.courseNumber, registerRequest.courseNumber) &&
        Objects.equals(this.studentId, registerRequest.studentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseNumber, studentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequest {\n");
    
    sb.append("    courseNumber: ").append(toIndentedString(courseNumber)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
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

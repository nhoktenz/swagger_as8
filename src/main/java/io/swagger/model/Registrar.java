package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Registrar
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")


public class Registrar   {
  @JsonProperty("courseNumber")
  private Integer courseNumber = null;

  @JsonProperty("studentIds")
  @Valid
  private List<Integer> studentIds = null;

  public Registrar courseNumber(Integer courseNumber) {
    this.courseNumber = courseNumber;
    return this;
  }

  /**
   * Get courseNumber
   * @return courseNumber
   **/
  @Schema(example = "101", description = "")
  
    public Integer getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(Integer courseNumber) {
    this.courseNumber = courseNumber;
  }

  public Registrar studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public Registrar addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

  /**
   * Get studentIds
   * @return studentIds
   **/
  @Schema(example = "[1,2,3]", description = "")
  
  @Size(max=15)   public List<Integer> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registrar registrar = (Registrar) o;
    return Objects.equals(this.courseNumber, registrar.courseNumber) &&
        Objects.equals(this.studentIds, registrar.studentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseNumber, studentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registrar {\n");
    
    sb.append("    courseNumber: ").append(toIndentedString(courseNumber)).append("\n");
    sb.append("    studentIds: ").append(toIndentedString(studentIds)).append("\n");
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

/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.54).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Course;
import io.swagger.model.CourseWithStudents;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.InlineResponse2002;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.InlineResponse400;
import io.swagger.model.InlineResponse4001;
import io.swagger.model.InlineResponse4002;
import io.swagger.model.RegisterRequest;
import io.swagger.model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")
@Validated
public interface SchoolserviceApi {

    @Operation(summary = "Delete a course by Course Number", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Course deleted successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2002.class))) })
    @RequestMapping(value = "/schoolservice/courses/{courseNumber}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<InlineResponse2002> schoolserviceCoursesCourseNumberDelete(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to delete", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
);


    @Operation(summary = "Get a course by Course Number", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful get course by Course Number", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))) })
    @RequestMapping(value = "/schoolservice/courses/{courseNumber}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Course> schoolserviceCoursesCourseNumberGet(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to retrieve", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
);


    @Operation(summary = "Update a course by Course Number", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Course updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))) })
    @RequestMapping(value = "/schoolservice/courses/{courseNumber}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Course> schoolserviceCoursesCourseNumberPut(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to update", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Course body
);


    @Operation(summary = "Get all courses", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Course.class)))) })
    @RequestMapping(value = "/schoolservice/courses",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Course>> schoolserviceCoursesGet();


    @Operation(summary = "Create a new course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Course created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Course.class))) })
    @RequestMapping(value = "/schoolservice/courses",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Course> schoolserviceCoursesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Course body
);


    @Operation(summary = "Get information about students and courses", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))) })
    @RequestMapping(value = "/schoolservice",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> schoolserviceGet();


    @Operation(summary = "Get list of students registered to a course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Student.class)))) })
    @RequestMapping(value = "/schoolservice/registrar/courses/{courseNumber}/students",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> schoolserviceRegistrarCoursesCourseNumberStudentsGet(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to retrieve registered students for", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
);


    @Operation(summary = "Drop a student from a course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student dropped from course successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2004.class))) })
    @RequestMapping(value = "/schoolservice/registrar/courses/{courseNumber}/students/{studentId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<InlineResponse2004> schoolserviceRegistrarCoursesCourseNumberStudentsStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to drop the student from", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
, @Parameter(in = ParameterIn.PATH, description = "ID of the student to drop from the course", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
);


    @Operation(summary = "Get list of students registered to courses", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CourseWithStudents.class)))) })
    @RequestMapping(value = "/schoolservice/registrar",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CourseWithStudents>> schoolserviceRegistrarGet();


    @Operation(summary = "Register a student to a course", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student registered to course successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2003.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request - Student already registered for the course", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse4002.class))) })
    @RequestMapping(value = "/schoolservice/registrar/register",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse2003> schoolserviceRegistrarRegisterPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegisterRequest body
);


    @Operation(summary = "Get all students", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Student.class)))) })
    @RequestMapping(value = "/schoolservice/students",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Student>> schoolserviceStudentsGet();


    @Operation(summary = "Create a new student", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student created successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))) })
    @RequestMapping(value = "/schoolservice/students",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Student> schoolserviceStudentsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Student body
);


    @Operation(summary = "Delete a student by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student deleted successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))) })
    @RequestMapping(value = "/schoolservice/students/{studentId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<InlineResponse2001> schoolserviceStudentsStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the student to delete", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
);


    @Operation(summary = "Get a student by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful get student by id", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse400.class))) })
    @RequestMapping(value = "/schoolservice/students/{studentId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Student> schoolserviceStudentsStudentIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the student to retrieve", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
);


    @Operation(summary = "Update a student by ID", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student updated successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad request - Missing required parameters", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse4001.class))) })
    @RequestMapping(value = "/schoolservice/students/{studentId}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Student> schoolserviceStudentsStudentIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Student body
);

}


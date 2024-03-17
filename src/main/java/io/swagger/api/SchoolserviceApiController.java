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
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")
@RestController
public class SchoolserviceApiController implements SchoolserviceApi {

    private static final Logger log = LoggerFactory.getLogger(SchoolserviceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SchoolserviceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2002> schoolserviceCoursesCourseNumberDelete(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to delete", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2002>(objectMapper.readValue("{\r\n  \"message\" : \"Course deleted successfully\"\r\n}", InlineResponse2002.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2002>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2002>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> schoolserviceCoursesCourseNumberGet(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to retrieve", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\r\n  \"courseTitle\" : \"Maths\",\r\n  \"courseNumber\" : 101\r\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> schoolserviceCoursesCourseNumberPut(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to update", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Course body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\r\n  \"courseTitle\" : \"Maths\",\r\n  \"courseNumber\" : 101\r\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Course>> schoolserviceCoursesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Course>>(objectMapper.readValue("[ {\r\n  \"courseTitle\" : \"Maths\",\r\n  \"courseNumber\" : 101\r\n}, {\r\n  \"courseTitle\" : \"Maths\",\r\n  \"courseNumber\" : 101\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Course>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Course>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Course> schoolserviceCoursesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Course body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Course>(objectMapper.readValue("{\r\n  \"courseTitle\" : \"Maths\",\r\n  \"courseNumber\" : 101\r\n}", Course.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Course>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Course>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> schoolserviceGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\r\n  \"courses\" : [ {\r\n    \"courseTitle\" : \"Maths\",\r\n    \"courseNumber\" : 101\r\n  }, {\r\n    \"courseTitle\" : \"Maths\",\r\n    \"courseNumber\" : 101\r\n  } ],\r\n  \"students\" : [ {\r\n    \"studentId\" : 1,\r\n    \"firstName\" : \"Thuong\",\r\n    \"lastName\" : \"Nguyen\",\r\n    \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n    \"email\" : \"email@example.com\"\r\n  }, {\r\n    \"studentId\" : 1,\r\n    \"firstName\" : \"Thuong\",\r\n    \"lastName\" : \"Nguyen\",\r\n    \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n    \"email\" : \"email@example.com\"\r\n  } ]\r\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Student>> schoolserviceRegistrarCoursesCourseNumberStudentsGet(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to retrieve registered students for", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n}, {\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2004> schoolserviceRegistrarCoursesCourseNumberStudentsStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "Course Number of the course to drop the student from", required=true, schema=@Schema()) @PathVariable("courseNumber") Integer courseNumber
,@Parameter(in = ParameterIn.PATH, description = "ID of the student to drop from the course", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2004>(objectMapper.readValue("{\r\n  \"message\" : \"Student dropped from course successfully\"\r\n}", InlineResponse2004.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2004>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2004>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CourseWithStudents>> schoolserviceRegistrarGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CourseWithStudents>>(objectMapper.readValue("[ {\r\n  \"registeredStudents\" : [ {\r\n    \"studentId\" : 1,\r\n    \"firstName\" : \"Thuong\",\r\n    \"lastName\" : \"Nguyen\",\r\n    \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n    \"email\" : \"email@example.com\"\r\n  }, {\r\n    \"studentId\" : 1,\r\n    \"firstName\" : \"Thuong\",\r\n    \"lastName\" : \"Nguyen\",\r\n    \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n    \"email\" : \"email@example.com\"\r\n  } ],\r\n  \"course\" : {\r\n    \"courseTitle\" : \"Maths\",\r\n    \"courseNumber\" : 101\r\n  }\r\n}, {\r\n  \"registeredStudents\" : [ {\r\n    \"studentId\" : 1,\r\n    \"firstName\" : \"Thuong\",\r\n    \"lastName\" : \"Nguyen\",\r\n    \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n    \"email\" : \"email@example.com\"\r\n  }, {\r\n    \"studentId\" : 1,\r\n    \"firstName\" : \"Thuong\",\r\n    \"lastName\" : \"Nguyen\",\r\n    \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n    \"email\" : \"email@example.com\"\r\n  } ],\r\n  \"course\" : {\r\n    \"courseTitle\" : \"Maths\",\r\n    \"courseNumber\" : 101\r\n  }\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CourseWithStudents>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CourseWithStudents>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2003> schoolserviceRegistrarRegisterPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody RegisterRequest body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2003>(objectMapper.readValue("{\r\n  \"message\" : \"Student registered to course successfully\"\r\n}", InlineResponse2003.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2003>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2003>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Student>> schoolserviceStudentsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n}, {\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> schoolserviceStudentsPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Student body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> schoolserviceStudentsStudentIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID of the student to delete", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\r\n  \"message\" : \"Student deleted successfully\"\r\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> schoolserviceStudentsStudentIdGet(@Parameter(in = ParameterIn.PATH, description = "ID of the student to retrieve", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> schoolserviceStudentsStudentIdPut(@Parameter(in = ParameterIn.PATH, description = "ID of the student to update", required=true, schema=@Schema()) @PathVariable("studentId") Integer studentId
,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Student body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Student>(objectMapper.readValue("{\r\n  \"studentId\" : 1,\r\n  \"firstName\" : \"Thuong\",\r\n  \"lastName\" : \"Nguyen\",\r\n  \"dateOfBirth\" : \"1995-01-01T00:00:00.000+00:00\",\r\n  \"email\" : \"email@example.com\"\r\n}", Student.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

}

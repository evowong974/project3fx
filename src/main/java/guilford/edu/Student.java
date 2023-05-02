package guilford.edu;

public class Student {
// attributes
private String name; 
private String email;
private String studentYear;
private boolean studyAway;
private int graduationYear;
 
// constructor with default data
public Student() {
    this.name = "Evan Wong";
    this.email = "ewong@guilford.edu";
    this.studentYear = "Sophmore";
    this.studyAway = false;
    this.graduationYear = 2025; 
}

// constructor with parameters
public Student(String name, String email, String studentYear, boolean studyAway, int graduationYear) {
    this.name = name;
    this.email = email;
    this.studentYear = studentYear;
    this.studyAway = studyAway;
    this.graduationYear = graduationYear;
}

// getters and setters
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getStudentYear() {
    return studentYear;
}

public void setStudentYear(String studentYear) {
    this.studentYear = studentYear;
}

public boolean isStudyAway() {
    return studyAway;
}

public void setStudyAway(boolean studyAway) {
    this.studyAway = studyAway;
}

public int getGraduationYear() {
    return graduationYear;
}

public void setGraduationYear(int graduationYear) {
    this.graduationYear = graduationYear;
}

// toString method
@Override
public String toString() {
    return "Student [email=" + email + ", graduationYear=" + graduationYear + ", name=" + name + ", studentYear="
            + studentYear + ", studyAway=" + studyAway + "]";
}
}
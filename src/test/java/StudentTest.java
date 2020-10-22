import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    private Student newStudent;

    @Before
    public void setup() {
        newStudent = new Student(1223434, "Thelma");
    }

    @Test
    public void testStudentConstructor() {
        Student steve = new Student(123456, "Steve");
        assertNotNull(newStudent);
        assertNotNull(steve);
    }

    @Test
    public void testStudentParams() {
        assertEquals("Thelma", newStudent.getName());
        assertEquals(1223434, newStudent.getId());
    }

    @Test
    public void testAddGrade() {
        newStudent.addGrade(80);
        int gradeAt0 = newStudent.getGrades().get(0);
        assertEquals(80, (int) newStudent.getGrades().get(0));
    }

    @Test
    public void testAverageOfGrades() {
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        assertEquals(85.0, newStudent.getGradeAverage(), 0);
        newStudent.addGrade(81);
        assertEquals(83.66, newStudent.getGradeAverage(), 0.1);
    }

}

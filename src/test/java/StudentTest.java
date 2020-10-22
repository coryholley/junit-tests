import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student newStudent = new Student(1223434, "Thelma");
        assertNotEquals(newStudent, new Student(1223434, "Thelma"));
    }

    @Test
    public void testGetID() {
        Student student1 = new Student(1223434, "Thelma");
        assertEquals(1223434, student1.getId());
    }

    @Test
    public void testGetName() {
        Student student1 = new Student(1223434, "Thelma");
        assertEquals("Thelma", student1.getName());
    }

    @Test
    public void testAddGrade() {
        Student student1 = new Student(1223434, "Thelma");
        student1.addGrade(80);
        assertSame(80,student1.grades.get(0));
    }
}

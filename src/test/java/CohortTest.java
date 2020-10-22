import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOneStudent;
    Cohort cohortWithManyStudents;

    @Before
    public void setup() {
        emptyCohort = new Cohort();
        cohortWithOneStudent = new Cohort();
        cohortWithManyStudents = new Cohort();

        Student student1 = new Student(1234, "Bart Simpson");
        student1.addGrade(75);

        Student student2 = new Student(5678, "Lisa Simpson");
        student2.addGrade(100);
        student2.addGrade(100);
        student2.addGrade(100);

        cohortWithOneStudent.addStudent(student1);
        cohortWithManyStudents.addStudent(student1);
        cohortWithManyStudents.addStudent(student2);

    }

    @Test
    public void testStudentAdd() {
        cohortWithManyStudents.addStudent(new Student(91011, "Homer Simpson"));
        assertEquals("Homer Simpson", cohortWithManyStudents.getStudents().get(2).getName());
        cohortWithManyStudents.addStudent(new Student(121314, "Marge Simpson"));
        assertEquals(4, cohortWithManyStudents.getStudents().size());
    }

    @Test
    public void testGetStudents() {
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOneStudent.getStudents().size());

        assertEquals(1234, cohortWithManyStudents.getStudents().get(0).getId());
        assertEquals(5678, cohortWithManyStudents.getStudents().get(1).getId());
    }

    @Test
    public void testGetAverage() {
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(75, cohortWithOneStudent.getCohortAverage(), 0);
        assertEquals(87.5, cohortWithManyStudents.getCohortAverage(), 0.1);

    }
}

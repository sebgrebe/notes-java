import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NotesTest {

    Notes notes;
    ArrayList<String> testArrayNotes = new ArrayList<String>();
    ArrayList<String> mockDBList;

    @Before
    public void beforeEachTest(){
        notes = new Notes();
        testArrayNotes.add("I");
        testArrayNotes.add("am");
        testArrayNotes.add("a");
        testArrayNotes.add("test");
    }

    @Test
    public void list(){
        assertNotNull(notes.list);
    }

    @Test
    public void setList() {
        notes.setList(testArrayNotes);
        assertEquals("test", notes.list.get(3));
    }

    @Test
    public void getList() {
        //ToDo: call to test database
        notes.setList(testArrayNotes);
        assertEquals(testArrayNotes.get(0), notes.getList().get(0));
    }
}

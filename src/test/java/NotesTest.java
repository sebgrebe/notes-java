import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class NotesTest {

    Notes notes;

    @Before
    public void beforeEachTest(){
        notes = new Notes();

    }

    @Test
    public void list(){
        assertNotNull(notes.list);
    }

    @Test
    public void setList() {
        ArrayList<String> testArrayNotes = new ArrayList<String>();
        notes.setList(testArrayNotes);
        assertEquals("test", notes.list.get(3));
    }
}

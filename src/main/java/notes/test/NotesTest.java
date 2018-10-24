package notes.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class NotesTest {

    @Test
    public void list(){
        Notes notes = new Notes();
        assertNotNull(notes.list);
    }
}
package notes.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class NoteTest {

    @Test
    public void note(){
        Note note = new Note("hello");
        assertNotNull(note.content);
    }
}
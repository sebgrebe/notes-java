import java.util.ArrayList;

public class Notes {

   public ArrayList<String> list;

   Notes() {
       this.list = new ArrayList<String>();
   }

   public ArrayList getList() {
       return this.list;
   }

    public void setList(ArrayList notesArray) {
       this.list = notesArray;
    }
}

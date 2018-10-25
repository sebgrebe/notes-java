import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotesController {

    @GetMapping("/")
    public String notes(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String title = "Notes App";
        model.addAttribute("title", title);
        return "index";
    }

}
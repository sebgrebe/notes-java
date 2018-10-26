package notes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotesController {

    @RequestMapping(value = "/")
    public String notes(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String title = "Notes App";
        model.addAttribute("title", title);
        return "index";
    }

}
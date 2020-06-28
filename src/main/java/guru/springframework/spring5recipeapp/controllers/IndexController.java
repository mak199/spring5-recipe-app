package guru.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Controller annotation makes it spring bean
// spring does scan of packages, and those below get picked up

@Controller
public class IndexController {
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "index";
    }
}

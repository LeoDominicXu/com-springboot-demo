package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dominic on 2017/2/12.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "welcome.html";
    }
}

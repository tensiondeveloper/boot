package co.kr.replica.controller;


import co.kr.replica.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {


    @Autowired
    private MainService service;

    @RequestMapping("/index")
    public String mainc(Model model){



//        model.addAttribute("result", service.getUserList());
        return "index";
    }


}

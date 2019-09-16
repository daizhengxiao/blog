package com.itdai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: com.itdai
 * @Date: 2019/9/16
 * @Description: com.itdai.controller
 * @Version: 1.0
 */
@Controller
public class FormController {

    @RequestMapping("/ui/{formName}")
    public String show(@PathVariable String formName){

        return formName;
    }

}

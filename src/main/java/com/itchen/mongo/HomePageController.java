/**
 * Copyright © 2018 by ITJackChan. All rights reserved.
 */
package com.itchen.mongo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chen Yibiao
 * @version HomePageController.java, v 0.1 2018年5月3日 下午9:07:04 Written by Chen Yibiao.
 */
@Controller
public class HomePageController {

    @GetMapping("/index")
    public String Index() {
        return "index.html";
    }
    
    @RequestMapping("/index1")
    public String Index1() {
        return "redirect:index";
    }

    @RequestMapping("/index2")
    public String Index2() {
        return "forward:index";
    }
    
}

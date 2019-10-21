package com.wlc.thymeleafday01.web;

import com.wlc.thymeleafday01.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * describe:thymeleaf 控制器
 *
 * @author 王立朝
 * @date 2019/10/18
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        String html = "<p style='color:red'>红色字体</p>";
        Product product = new Product(2, "裙子", 34);
        boolean flag = true;
        boolean flagFalse = false;

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"a",1));
        productList.add(new Product(2,"b",2));
        productList.add(new Product(3,"c",3));
        productList.add(new Product(4,"d",4));
        productList.add(new Product(5,"e",5));
        productList.add(new Product(6,"f",6));

        model.addAttribute("productList", productList);
        model.addAttribute("flag", flag);
        model.addAttribute("flagFalse", flagFalse);
        model.addAttribute("html", html);
        model.addAttribute("product", product);
        model.addAttribute("thymeleaf", "hello thymeleaf wlc !");
        return "hello";
    }
}

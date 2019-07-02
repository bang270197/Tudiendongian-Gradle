package com.codegym.Controller;

import com.codegym.Persistence.ConvertPersistenceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @GetMapping(value = "/dictionary")
    public ModelAndView showProducts(Model model) {

        ModelAndView modelAndView = new ModelAndView("/product/list");
        return modelAndView;
    }

    @GetMapping(value = "/showList")
    public ModelAndView showDictionary(@RequestParam("dictionary") String dictionnary, Model model) {
        ConvertPersistenceImpl convertPersistence = new ConvertPersistenceImpl();
        String result = convertPersistence.find(dictionnary);
        if (result != null) {
            model.addAttribute("results", result);
        }
        ModelAndView modelAndView = new ModelAndView("/product/showList");
        return modelAndView;
    }
}

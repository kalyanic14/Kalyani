package com.example.BooksCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.BooksCrud.domain.Books;
import com.example.BooksCrud.service.BooksService;

@Controller
public class BooksController {
	
	 @Autowired
	    private BooksService service;

	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        List<Books> listbooks = service.listAll();
	        model.addAttribute("listbooks", listbooks);
	        System.out.print("Get / ");	
	        return "index";
	    }

	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("books", new Books());
	        return "new";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String savebooks(@ModelAttribute("books") Books std) {
	        service.save(std);
	        return "redirect:/";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditbooksPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("new");
	        Books std = service.get(id);
	        mav.addObject("books", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deletebooks(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/";
	    }
}

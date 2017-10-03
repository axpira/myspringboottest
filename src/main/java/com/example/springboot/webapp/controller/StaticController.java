package com.example.springboot.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for index page.
 * @author Thiago Ferreira
 */
@Controller
public class StaticController {

  /**
   * Redirect to index page.
   * @return Template to render.
   */
  @GetMapping("/")
  public String index() {
    return "index";
  }

  /**
   * Redirect to about page.
   * @return Template to render.
   */
  @GetMapping("/about")
  public String about() {
    return "about";
  }
}

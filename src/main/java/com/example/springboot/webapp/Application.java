package com.example.springboot.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class.
 * 
 * @author Thiago Ferreira
 */
@SpringBootApplication
public class Application {
  /**
   * Utility classes should not have a public or default constructor.
   */
  protected Application() {
  }
  
  /**
   * @param args
   *          Arguments received by command line.
   */
  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
}

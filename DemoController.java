package com.example.Demo_day2_Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo_day2_DemoModel.Demo;

@RestController
public class DemoController {
  private static Logger logger=LoggerFactory.getLogger(DemoController.class);
  @Autowired
  private Demo demo;
  @GetMapping("/demo");
  private Demo getDemo()
  {
	  logger.info("Demo oject is:{}",demo);
	  return  demo;
  }
  
}

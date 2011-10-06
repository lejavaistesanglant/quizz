package com.lejavaistesanglant.quizz;

import org.springframework.web.servlet.ModelAndView;

import com.lejavaistesanglant.quizz.HomeController;

import junit.framework.TestCase;

public class HomeControllerTest extends TestCase {

    public void testHandleRequestView() throws Exception{		
        HomeController controller = new HomeController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("WEB-INF/home.jsp", modelAndView.getViewName());
    }
}
package com.lejavaistesanglant.quizz;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author ljs
 */
public class SampleController extends AbstractController {

    public SampleController() {
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ModelAndView mav = new ModelAndView("home.html");
        mav.addObject("message", "Bonjour le Monde");
        return mav;
         

    }
}

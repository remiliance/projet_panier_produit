package com.ecommerce.microcommerce.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;


@Controller
public class CustomErrorController implements ErrorController {

      Logger logger = LoggerFactory.getLogger(CustomErrorController.class);

        @Override
        public String getErrorPath() {
            return "/error";
        }

        @GetMapping("/error")
        public ModelAndView handleError(HttpServletRequest request) {
            Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
            logger.error("Error with status code " + status + " happened. Support! Do something about it!");
            return new ModelAndView("error");
        }
    }


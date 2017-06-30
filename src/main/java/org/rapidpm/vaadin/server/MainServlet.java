package org.rapidpm.vaadin.server;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

/**
 *
 */
@WebServlet("/*")
@VaadinServletConfiguration(productionMode = false, ui = MainUI.class)
public class MainServlet extends VaadinServlet {}

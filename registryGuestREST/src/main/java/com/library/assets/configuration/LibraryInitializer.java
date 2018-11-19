package com.library.assets.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LibraryInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	  @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return new Class[] { LibraryConfiguration.class };
	    }
	  
	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return null;
	    }
	  
	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }

}

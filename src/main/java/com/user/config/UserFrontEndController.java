package com.user.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserFrontEndController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	// Provide The Implementation as classes
	// Which are used for configuring the operations of IOC container.
		Class [] configClasses = {UserConfig.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
	// It is used to provide the mappings for the requests.
	// Which is taken by the front end controller.
		String [] mappings = {"/"};
		return mappings;
	}
	
}

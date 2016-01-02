package com.akoscode.lookijb.configuration;

public class WebInitialization {

	/* implements WebApplicationInitializer */
	/* @Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(SpringConfiguration.class);
		appContext.setServletContext(servletContext);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	} */
	
	/* Another way */
	/* extends AbstractAnnotationConfigDispatcherServletInitializer */
	/* @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SpringConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    } */

}

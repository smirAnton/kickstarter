package ua.com.goit.gojava7.kickstarter.profiling;

public class ProfilingController implements ProfilingControllerMBean {
	private boolean enabled;
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}

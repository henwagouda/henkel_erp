package com.henkel.erp.user.model;

public class LandingPageModule {
	
	private String moduleName;
	private String moduleId;
	private String moduleImageId;
	
	
	public LandingPageModule(String moduleName, String moduleId, String moduleImageId) {
		super();
		this.moduleName = moduleName;
		this.moduleId = moduleId;
		this.moduleImageId = moduleImageId;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleImageId() {
		return moduleImageId;
	}
	public void setModuleImageId(String moduleImageId) {
		this.moduleImageId = moduleImageId;
	}

}

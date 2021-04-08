package de.dc.emf.contact;

import com.google.inject.Inject;

import de.dc.emf.fx.workbench.jmetro.core.di.IEmfPluginService;
import de.dc.emf.fx.workbench.jmetro.properties.service.IPropertyService;
import de.dc.emf.fx.workbench.jmetro.ui.EmfApplication;
import de.dc.emf.fx.workbench.jmetro.ui.EmfWorkbench;

public class ContactApplication extends EmfApplication{

	@Inject IPropertyService propertyService;
	@Inject IEmfPluginService pluginService;
	
	@Override
	protected void initWorkbench(EmfWorkbench workbench) {
		propertyService.initializeProperties();
		pluginService.init(workbench);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

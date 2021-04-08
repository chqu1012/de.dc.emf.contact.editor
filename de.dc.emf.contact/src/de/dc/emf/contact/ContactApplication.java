package de.dc.emf.contact;

import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
import de.dc.emf.fx.workbench.jmetro.core.di.IEmfPluginService;
import de.dc.emf.fx.workbench.jmetro.properties.di.PropertiesModule;
import de.dc.emf.fx.workbench.jmetro.properties.service.IPropertyService;
import de.dc.emf.fx.workbench.jmetro.ui.EmfApplication;
import de.dc.emf.fx.workbench.jmetro.ui.EmfWorkbench;
import de.dc.emf.fx.workbench.jmetro.ui.di.EmfUIModule;

public class ContactApplication extends EmfApplication{

	@Override
	protected void initWorkbench(EmfWorkbench workbench) {
		IPropertyService propertyService = EmfFXPlatform.getInstance(IPropertyService.class);
		propertyService.initializeProperties();

		IEmfPluginService pluginService = EmfFXPlatform.getInstance(IEmfPluginService.class);
		pluginService.init();
		pluginService.getEmfPlugins().forEach(e->{
			try {
				workbench.registrateEditor(e.editor());
				workbench.registratePerspective(e.perspective().newInstance());
			} catch (InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
		});
	}
	
	public static void main(String[] args) {
		EmfFXPlatform.add(new PropertiesModule());
		EmfFXPlatform.add(new EmfUIModule());
		EmfFXPlatform.init();
		launch(args);
	}
}

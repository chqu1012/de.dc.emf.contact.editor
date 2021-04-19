package de.dc.emf.contact;

import de.dc.emf.fx.workbench.jmetro.core.di.EmfFXPlatform;
import de.dc.emf.fx.workbench.jmetro.core.service.ISelectionService;
import de.dc.emf.fx.workbench.jmetro.ui.EmfApplication;
import de.dc.emf.fx.workbench.jmetro.ui.EmfWorkbench;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ContactApplication extends EmfApplication implements ChangeListener{

	@Override
	protected void initWorkbench(EmfWorkbench workbench) {
		EmfFXPlatform.getInstance(ISelectionService.class).addListener(this);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void changed(ObservableValue arg0, Object arg1, Object arg2) {
	}
}

package de.dc.emf.contact;

import de.dc.emf.fx.workbench.jmetro.core.IEmfEditor;
import de.dc.emf.fx.workbench.jmetro.ui.EmfPerspective;

public class ContactPerspective extends EmfPerspective{

	public ContactPerspective() {
		ContactDiagram diagram = new ContactDiagram();
		openViewAtRight(diagram);
		rightArea.getSelectionModel().select(diagram);
	}
	
	@Override
	public Class<? extends IEmfEditor<?>> getDefaultEditor() {
		return ContactEditor.class;
	}

	@Override
	public String getName() {
		return "Contact Perspective";
	}

}
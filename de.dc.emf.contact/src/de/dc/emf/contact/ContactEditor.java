package de.dc.emf.contact;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.dc.emf.contact.provider.ContactItemProviderAdapterFactory;
import de.dc.emf.fx.workbench.jmetro.ui.SimpleEmfEditor;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class ContactEditor extends SimpleEmfEditor<ContactManager>{

	public ContactEditor() {
		Menu menu = new Menu("Generation");
		MenuItem menuItem = new MenuItem();
		menuItem.setText("Hello World1");
		menu.getItems().add(menuItem);
		menuItem = new MenuItem();
		menuItem.setText("Hello World1");
		menu.getItems().add(menuItem);
		createMenuItem(menu);
	}
	
	@Override
	protected EObject createRootModel() {
		return ContactFactory.eINSTANCE.createContactManager();
	}

	@Override
	protected EFactory getEFactory() {
		return ContactFactory.eINSTANCE;
	}

	@Override
	protected String getEFilextension() {
		return ContactPackage.eNS_PREFIX;
	}

	@Override
	protected EPackage getEPackage() {
		return ContactPackage.eINSTANCE;
	}

	@Override
	protected AdapterFactory getModelItemProviderAdapterFactory() {
		return new ContactItemProviderAdapterFactory();
	}

}

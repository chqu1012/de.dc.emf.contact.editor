package de.dc.emf.contact;

import de.dc.emf.fx.workbench.jmetro.ui.EmfTableView;

public class ContactTableView extends EmfTableView<Contact>{

	public ContactTableView() {
		super("Contact View");
		
		createColumn("Firstname", "firstname");
		createColumn("Lastname", "lastname");
		createColumn("Email", "email");
		
		addContact("Peter", "Jackson");
		addContact("John", "Carter");
		addContact("Luther", "West");
		addContact("Tony", "Stark");
	}
	
	@Override
	protected boolean filterData(Contact p, String newValue) {
		boolean containsFirstname = p.getFirstname().toLowerCase().contains(newValue);
		boolean containsLastname = p.getLastname().toLowerCase().contains(newValue);
		return containsFirstname || containsLastname;
	}

	private void addContact(String firstname, String lastname) {
		Contact contact = ContactFactory.eINSTANCE.createContact();
		contact.setFirstname(firstname);
		contact.setLastname(lastname);
		contact.setEmail(firstname.concat(lastname).concat("@mail.com"));
		getMasterData().add(contact);
	}
}

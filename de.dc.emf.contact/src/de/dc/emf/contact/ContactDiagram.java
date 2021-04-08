package de.dc.emf.contact;

import de.dc.emf.fx.workbench.jmetro.ui.EmfDiagramView;
import de.dc.emf.fx.workbench.jmetro.ui.util.DraggableNode;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ContactDiagram extends EmfDiagramView {

	public ContactDiagram() {
		setText("Contact Diagram");
	}
	
	@Override
	protected Node renderSelection(Object arg0) {
		Button button = new Button(arg0.toString());
		new DraggableNode(button);
		return button;
	}

	@Override
	protected void onEditorAreaMouseMoved(MouseEvent event) {
		binding.setLabelX(String.valueOf(event.getX()));
		binding.setLabelY(String.valueOf(event.getY()));
	}

	@Override
	protected void onListViewDragDetected(MouseEvent event) {
	}
}

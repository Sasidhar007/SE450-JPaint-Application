package model;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import model.interfaces.IShape;
import view.gui.PaintCanvas;

public class UndoRedo {
	static ArrayList<IShape> bufferShapes = new ArrayList<IShape>();
	PaintCanvas pc = PaintCanvas.getInstance();
	public void undoAction(){
		ArrayList<IShape> shapes = pc.getShapes();
		if(!shapes.isEmpty()){
			bufferShapes.add(shapes.get(shapes.size() - 1));
			shapes.remove(shapes.size() - 1);
			pc.setShapes(shapes);
			pc.setDragged(false);
			pc.repaint();
		}
	}
	
	public void redoAction() {
		ArrayList<IShape> shapes = pc.getShapes();
		if(!bufferShapes.isEmpty())
		{
			shapes.add(bufferShapes.get(bufferShapes.size() - 1));
			bufferShapes.remove(bufferShapes.size() - 1);
			pc.setShapes(shapes);
			pc.repaint();
		}
	}

}

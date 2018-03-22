package view.gui;

import java.awt.Graphics;

import model.interfaces.IShape;

public class Context {
	private IShape ishape;
	public Context(IShape ishape){
		this.ishape = ishape;
	}
	
	public void executeStrategy(Graphics g){
		ishape.draw(g);
	}
}

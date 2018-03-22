package factory;

import java.awt.Color;
import java.awt.Graphics;

import model.ShapeShadingType;
import model.interfaces.IShape;
import view.gui.Ellipse;
import view.gui.Polygon;
import view.gui.Rectangle;

public class ShapeFactory {
	
	   public IShape getShape(String shapeType, Graphics g, int x, int y, int x2, int y2, ShapeShadingType shapeShadingType, 
			   Color contextColor, Color secColor){
		   
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("ELLIPSE")){
	         return new Ellipse(g, x, y, x2, y2, shapeShadingType, contextColor, secColor);
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle(g ,x, y, x2, y2, shapeShadingType, contextColor, secColor);
	         
	      } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
	         return new Polygon(g, x, y, x2, y2, shapeShadingType, contextColor, secColor);
	      }
	      
	      
	      return null;
	   }
	}
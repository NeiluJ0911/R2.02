package unilim.info.ihm.tp6.exo1.controller;

import javafx.event.EventHandler;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class DndTextController {
	public static void manageSourceDragAndDrop(Text source) {
		source.setOnDragDetected(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent event) {
		        /* drag was detected, start a drag-and-drop gesture*/
		        /* allow any transfer mode */
		        Dragboard db = source.startDragAndDrop(TransferMode.ANY);
		        
		        /* Put a string on a dragboard */
		        ClipboardContent content = new ClipboardContent();
		        content.putString(source.getText());
		        db.setContent(content);
		        
		        event.consume();
		    }
		});
	}
	
	public static void manageTargetDragAndDrop(Text source) {
		source.setOnDragOver(new EventHandler<DragEvent>() {
		    public void handle(DragEvent event) {
		        /* data is dragged over the target */
		        /* accept it only if it is not dragged from the same node 
		         * and if it has a string data */
		        if (event.getGestureSource() != source &&
		                event.getDragboard().hasString()) {
		            /* allow for both copying and moving, whatever user chooses */
		            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
		        }
		        
		        event.consume();
		    }
	});
		source.setOnDragEntered(new EventHandler<DragEvent>() {
		        public void handle(DragEvent event) {
		        /* the drag-and-drop gesture entered the target */
		        /* show to the user that it is an actual gesture target */
		             if (event.getGestureSource() != source &&
		                     event.getDragboard().hasString()) {
		            	 source.setFill(Color.GREEN);
		             }
		                    
		             event.consume();
		        }
		});
		
		source.setOnDragExited(new EventHandler<DragEvent>() {
		    public void handle(DragEvent event) {
		        /* mouse moved away, remove the graphical cues */
		    	source.setFill(Color.BLACK);

		        event.consume();
		    }
		});
		
	}
}

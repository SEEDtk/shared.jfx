/**
 *
 */
package org.theseed.jfx;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * This is a base class for a resizable window for which only the size is saved.
 *
 * @author Bruce Parrello
 *
 */
public abstract class SemiResizableController extends BaseController {

    // FIELDS
    /** starting top */
    private double top;
    /** starting left */
    private double left;
    /** default width */
    private double width;
    /** default height */
    private double height;

    /**
     * Construct a resizable stage.
     *
     * @param top		default top position
     * @param left		default left position
     * @param width		default width
     * @param height	default height
     */
    public SemiResizableController(double top, double left, double width, double height) {
        super();
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    @Override
    public void setup(Stage stage) {
        this.internalSetup(stage);
        stage.setX(this.left);
        stage.setY(this.top);
        this.setSize(this.width, this.height);
        stage.setOnCloseRequest((final WindowEvent event) ->
        { this.saveSize(); });
    }

}

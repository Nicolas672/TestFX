package org.testfx.api;


import org.testfx.service.finder.WindowFinder;
import org.testfx.service.support.CaptureSupport;

public class FxRobotAllInterface {

    protected final FxBounds bounds;
    protected final FxCapture capture;
    protected final FxWindow window;
    protected final FxNodeQuery nodeQuery;
    protected final FxPointQuery pointQuery;
    protected final FxInteraction interaction;
    protected final FxWrite write;
    protected final FxScroll scroll;
    protected final FxDragAndDrop dragAndDrop;
    protected final FxClick click;

    public FxRobotAllInterface(FxRobot fxRobot, FxRobotContext context) {
        bounds = new FxBounds();
        capture = new FxCapture(context.getCaptureSupport());
        window = new FxWindow(fxRobot, context);
        nodeQuery = new FxNodeQuery(context);
        pointQuery = new FxPointQuery(fxRobot, context);
        interaction = new FxInteraction(fxRobot, context);
        write = new FxWrite(fxRobot, context);
        scroll = new FxScroll(fxRobot, context);
        dragAndDrop = new FxDragAndDrop(fxRobot, context);
        click = new FxClick(fxRobot, context);
    }

    public FxBounds getBounds() {
        return bounds;
    }

    public FxCapture getCapture() {
        return capture;
    }

    public FxWindow getWindow() {
        return window;
    }

    public FxNodeQuery getNodeQuery(){
        return nodeQuery;
    }

    public FxPointQuery getPointQuery(){
        return pointQuery;
    }

    public FxInteraction getInteraction() {
        return interaction;
    }

    public FxWrite getWrite(){
        return write;
    }

    public FxScroll getScroll() {
        return scroll;
    }

    public FxDragAndDrop getDragAndDrop(){
        return dragAndDrop;
    }

    public FxClick getClick(){
        return click;
    }
}

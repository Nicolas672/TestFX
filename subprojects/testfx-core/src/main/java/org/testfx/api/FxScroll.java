package org.testfx.api;

import javafx.geometry.HorizontalDirection;
import javafx.geometry.VerticalDirection;
import org.testfx.api.Iterface.FxScrollInterface;

public class FxScroll implements FxScrollInterface {

    protected final FxRobot fxRobot;
    protected final FxRobotContext context;

    public FxScroll(FxRobot robot, FxRobotContext fxRobotContext){
        fxRobot = robot;
        context = fxRobotContext;
    }
    @Override
    public FxRobot scroll(int amount) {
        context.getScrollRobot().scroll(amount);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(int amount, VerticalDirection direction) {
        context.getScrollRobot().scroll(amount, direction);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(VerticalDirection direction) {
        scroll(1, direction);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(int amount, HorizontalDirection direction) {
        context.getScrollRobot().scroll(amount, direction);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(HorizontalDirection direction) {
        scroll(1, direction);
        return fxRobot;
    }

}

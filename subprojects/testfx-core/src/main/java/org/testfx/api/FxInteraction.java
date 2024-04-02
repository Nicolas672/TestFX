package org.testfx.api;

import org.testfx.api.Iterface.FxInteractionInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import static org.testfx.util.WaitForAsyncUtils.*;
import static org.testfx.util.WaitForAsyncUtils.waitForFxEvents;

public class FxInteraction implements FxInteractionInterface {

    protected final FxRobot fxRobot;
    protected final FxRobotContext context;
    public FxInteraction(FxRobot robot, FxRobotContext fxRobotContext){
        fxRobot = robot;
        context = fxRobotContext;
    }


    public FxRobot interact(Runnable runnable) {
        waitFor(asyncFx(runnable));
        waitForFxEvents();
        return fxRobot;
    }

    @Override
    public <T> FxRobot interact(Callable<T> callable) {
        waitFor(asyncFx(callable));
        waitForFxEvents();
        return fxRobot;
    }

    @Override
    public FxRobot interactNoWait(Runnable runnable) {
        waitFor(asyncFx(runnable));
        return fxRobot;
    }
    @Override
    public <T> FxRobot interactNoWait(Callable<T> callable) {
        waitFor(asyncFx(callable));
        return fxRobot;
    }

    @Override
    public FxRobot interrupt() {
        waitForFxEvents();
        return fxRobot;
    }

    @Override
    public FxRobot interrupt(int attemptsCount) {
        waitForFxEvents(attemptsCount);
        return fxRobot;
    }

    @Override
    public FxRobot sleep(long milliseconds) {
        context.getSleepRobot().sleep(milliseconds);
        return fxRobot;
    }

    @Override
    public FxRobot sleep(long duration, TimeUnit timeUnit) {
        context.getSleepRobot().sleep(duration, timeUnit);
        return fxRobot;
    }

}

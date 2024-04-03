/*
 * Copyright 2013-2014 SmartBear Software
 * Copyright 2014-2024 The TestFX Contributors
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the
 * European Commission - subsequent versions of the EUPL (the "Licence"); You may
 * not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 * http://ec.europa.eu/idabc/eupl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the Licence for the
 * specific language governing permissions and limitations under the Licence.
 */
package org.testfx.api;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import org.testfx.api.iterface.FxInteractionInterface;

import static org.testfx.util.WaitForAsyncUtils.asyncFx;
import static org.testfx.util.WaitForAsyncUtils.waitFor;
import static org.testfx.util.WaitForAsyncUtils.waitForFxEvents;
public class FxInteraction implements FxInteractionInterface {

    protected final FxRobot fxRobot;
    protected final FxRobotContext context;
    public FxInteraction(FxRobot robot, FxRobotContext fxRobotContext) {
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

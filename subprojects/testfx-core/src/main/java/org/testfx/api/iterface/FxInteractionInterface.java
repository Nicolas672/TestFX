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
package org.testfx.api.iterface;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import org.testfx.util.WaitForAsyncUtils;

public interface FxInteractionInterface {

    /**
     * Calls a runnable on the FX application thread and waits for it and
     * consecutive events to execute. So changes to the gui triggered by the
     * runnable will be performed when returned from this method.
     *
     * @param runnable the runnable
     * @return this robot
     */
    FxInteractionInterface interact(Runnable runnable);

    /**
     * Calls a callable on the FX application thread and waits for it and
     * consecutive events to execute. So changes to the gui triggered by the
     * callable will be performed when returned from this method.
     *
     * @param callable the callable
     * @return this robot
     */
    <T> FxInteractionInterface interact(Callable<T> callable);

    /**
     * Calls a runnable on the FX application thread and waits for it to
     * execute. It does not wait for other events on the fx application thread.
     * So changes to the gui triggered by the runnable may not be performed when
     * returned from this method.
     *
     * @param runnable the runnable
     * @return this robot
     */
    FxInteractionInterface interactNoWait(Runnable runnable);

    /**
     * Calls a callable on the FX application thread and waits for it to
     * execute. It does not wait for other events on the fx application thread.
     * So changes to the gui triggered by the callable may not be performed when
     * returned from this method.
     *
     * @param callable the callable
     * @return this robot
     */
    <T> FxInteractionInterface interactNoWait(Callable<T> callable);

    /**
     * Calls {@link WaitForAsyncUtils#waitForFxEvents()} and returns itself for method chaining.
     */
    FxInteractionInterface interrupt();

    /**
     * Calls {@link WaitForAsyncUtils#waitForFxEvents(int)} and returns itself for method chaining.
     */
    FxInteractionInterface interrupt(int attemptsCount);

    /**
     * Calls {@link org.testfx.robot.SleepRobot#sleep(long)} and returns itself for more method chaining.
     */
    FxInteractionInterface sleep(long milliseconds);

    /**
     * Calls {@link org.testfx.robot.SleepRobot#sleep(long, TimeUnit)} and returns itself for more method chaining.
     */
    FxInteractionInterface sleep(long duration, TimeUnit timeUnit);

}

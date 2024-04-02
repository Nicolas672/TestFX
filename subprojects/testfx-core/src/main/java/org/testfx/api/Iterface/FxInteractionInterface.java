package org.testfx.api.Iterface;

import org.testfx.util.WaitForAsyncUtils;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

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

package org.testfx.api.Iterface;

import javafx.geometry.HorizontalDirection;
import javafx.geometry.VerticalDirection;

public interface FxScrollInterface {

    /**
     * Calls {@link org.testfx.robot.ScrollRobot#scroll(int)} and returns itself for more method chaining.
     */
    FxScrollInterface scroll(int amount);

    /**
     * Calls {@link org.testfx.robot.ScrollRobot#scroll(int, VerticalDirection)} and returns itself for more method
     * chaining.
     */
    FxScrollInterface scroll(int amount, VerticalDirection direction);

    // Convenience methods:
    /**
     * Calls {@link org.testfx.robot.ScrollRobot#scroll(int, VerticalDirection)} with arguments {@code 1} and
     * {@code direction} and returns itself for more method chaining.
     */
    FxScrollInterface scroll(VerticalDirection direction);

    /**
     * Calls {@link org.testfx.robot.ScrollRobot#scroll(int, HorizontalDirection)} and returns itself for more method
     * chaining.
     */
    FxScrollInterface scroll(int amount, HorizontalDirection direction);

    /**
     * Calls {@link org.testfx.robot.ScrollRobot#scroll(int, VerticalDirection)} with arguments {@code 1} and
     * {@code direction} and returns itself for more method chaining.
     */
    FxScrollInterface scroll(HorizontalDirection direction);

}

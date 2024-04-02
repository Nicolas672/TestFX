package org.testfx.api.Iterface;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;

public interface FxWriteInterface {

    /**
     * Calls {@link org.testfx.robot.TypeRobot#push(KeyCode...)} and returns itself for more method chaining.
     */
    FxWriteInterface push(KeyCode... combination);

    /**
     * Calls {@link org.testfx.robot.TypeRobot#push(KeyCodeCombination)} and returns itself for more method chaining.
     */
    FxWriteInterface push(KeyCodeCombination combination);

    /**
     * Calls {@link org.testfx.robot.TypeRobot#type(KeyCode...)} and returns itself for more method chaining.
     */
    FxWriteInterface type(KeyCode... keys);

    /**
     * Calls {@link org.testfx.robot.TypeRobot#type(KeyCode, int)} and returns itself for more method chaining.
     */
    FxWriteInterface type(KeyCode key, int times);

    /**
     * Convenience method: Calls {@link org.testfx.robot.TypeRobot#type(KeyCode, int)} with {@link KeyCode#BACK_SPACE}
     * and returns itself for more method chaining.
     */
    FxWriteInterface eraseText(int characters);

    /**
     * Calls {@link org.testfx.robot.WriteRobot#write(char)} and returns itself for more method chaining.
     */
    FxWriteInterface write(char character);

    /**
     * Calls {@link org.testfx.robot.WriteRobot#write(String)} and returns itself for more method chaining.
     */
    FxWriteInterface write(String text);

    /**
     * Calls {@link org.testfx.robot.WriteRobot#write(String, int)} and returns itself for more method chaining.
     */
    FxWriteInterface write(String text, int sleepMillis);

}

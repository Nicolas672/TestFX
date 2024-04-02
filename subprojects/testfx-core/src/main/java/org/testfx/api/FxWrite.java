package org.testfx.api;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import org.testfx.api.Iterface.FxWriteInterface;

public class FxWrite implements FxWriteInterface {

    protected final FxRobot fxRobot;
    protected final FxRobotContext context;

    public FxWrite(FxRobot robot, FxRobotContext fxRobotContext){
        context = fxRobotContext;
        fxRobot = robot;
    }
    @Override
    public FxRobot push(KeyCode... combination) {
        context.getTypeRobot().push(combination);
        return fxRobot;
    }

    @Override
    public FxRobot push(KeyCodeCombination combination) {
        context.getTypeRobot().push(combination);
        return fxRobot;
    }

    @Override
    public FxRobot type(KeyCode... keyCodes) {
        context.getTypeRobot().type(keyCodes);
        return fxRobot;
    }

    @Override
    public FxRobot type(KeyCode keyCode, int times) {
        context.getTypeRobot().type(keyCode, times);
        return fxRobot;
    }

    @Override
    public FxRobot eraseText(int amount) {
        return type(KeyCode.BACK_SPACE, amount);
    }

    /**
     * @deprecated The implementation of this method simply pushes the keys ALT+F4 which
     * does not close the current window on all platforms.
     */
    @Deprecated
    public FxRobot closeCurrentWindow() {
        return push(KeyCode.ALT, KeyCode.F4).sleep(100);
    }

    @Override
    public FxRobot write(char character) {
        context.getWriteRobot().write(character);
        return fxRobot;
    }

    @Override
    public FxRobot write(String text) {
        context.getWriteRobot().write(text);
        return fxRobot;
    }

    @Override
    public FxRobot write(String text, int sleepMillis) {
        context.getWriteRobot().write(text, sleepMillis);
        return fxRobot;
    }

}

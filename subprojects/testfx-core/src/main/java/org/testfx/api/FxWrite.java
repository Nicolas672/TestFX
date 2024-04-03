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

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;

import org.testfx.api.iterface.FxWriteInterface;

public class FxWrite implements FxWriteInterface {

    protected final FxRobot fxRobot;
    protected final FxRobotContext context;

    public FxWrite(FxRobot robot, FxRobotContext fxRobotContext) {
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

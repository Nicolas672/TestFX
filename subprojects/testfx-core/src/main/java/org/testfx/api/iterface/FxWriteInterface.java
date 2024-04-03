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

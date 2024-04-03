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

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

import javafx.geometry.HorizontalDirection;
import javafx.geometry.VerticalDirection;

import org.testfx.api.iterface.FxScrollInterface;

public class FxScroll implements FxScrollInterface {

    protected final FxRobot fxRobot;
    protected final FxRobotContext context;

    public FxScroll(FxRobot robot, FxRobotContext fxRobotContext) {
        fxRobot = robot;
        context = fxRobotContext;
    }
    @Override
    public FxRobot scroll(int amount) {
        context.getScrollRobot().scroll(amount);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(int amount, VerticalDirection direction) {
        context.getScrollRobot().scroll(amount, direction);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(VerticalDirection direction) {
        scroll(1, direction);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(int amount, HorizontalDirection direction) {
        context.getScrollRobot().scroll(amount, direction);
        return fxRobot;
    }

    @Override
    public FxRobot scroll(HorizontalDirection direction) {
        scroll(1, direction);
        return fxRobot;
    }

}

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


public class FxRobotAllInterface {

    protected final FxBounds bounds;
    protected final FxCapture capture;
    protected final FxWindow window;
    protected final FxNodeQuery nodeQuery;
    protected final FxPointQuery pointQuery;
    protected final FxInteraction interaction;
    protected final FxWrite write;
    protected final FxScroll scroll;
    protected final FxDragAndDrop dragAndDrop;
    protected final FxClick click;

    public FxRobotAllInterface(FxRobot fxRobot, FxRobotContext context) {
        bounds = new FxBounds();
        capture = new FxCapture(context.getCaptureSupport());
        window = new FxWindow(fxRobot, context);
        nodeQuery = new FxNodeQuery(context);
        pointQuery = new FxPointQuery(fxRobot, context);
        interaction = new FxInteraction(fxRobot, context);
        write = new FxWrite(fxRobot, context);
        scroll = new FxScroll(fxRobot, context);
        dragAndDrop = new FxDragAndDrop(fxRobot, context);
        click = new FxClick(fxRobot, context);
    }

    public FxBounds getBounds() {
        return bounds;
    }

    public FxCapture getCapture() {
        return capture;
    }

    public FxWindow getWindow() {
        return window;
    }

    public FxNodeQuery getNodeQuery() {
        return nodeQuery;
    }

    public FxPointQuery getPointQuery() {
        return pointQuery;
    }

    public FxInteraction getInteraction() {
        return interaction;
    }

    public FxWrite getWrite() {
        return write;
    }

    public FxScroll getScroll() {
        return scroll;
    }

    public FxDragAndDrop getDragAndDrop() {
        return dragAndDrop;
    }

    public FxClick getClick() {
        return click;
    }
}

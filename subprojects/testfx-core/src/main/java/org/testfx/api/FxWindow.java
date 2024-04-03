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

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;

import org.testfx.api.iterface.FxWindowInterface;


public class FxWindow implements FxWindowInterface {

    protected final FxRobotContext context;
    protected final FxRobot fxRobot;

    public FxWindow(FxRobot robot, FxRobotContext fxRobotContext) {
        context = fxRobotContext;
        fxRobot = robot;
    }


    @Override
    public Window targetWindow() {
        return context.getWindowFinder().targetWindow();
    }

    @Override
    public FxRobot targetWindow(Window window) {
        context.getWindowFinder().targetWindow(window);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Predicate<Window> predicate) {
        context.getWindowFinder().targetWindow(predicate);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(int windowNumber) {
        context.getWindowFinder().targetWindow(windowNumber);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(String stageTitleRegex) {
        context.getWindowFinder().targetWindow(stageTitleRegex);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Pattern stageTitlePattern) {
        context.getWindowFinder().targetWindow(stageTitlePattern);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Scene scene) {
        context.getWindowFinder().targetWindow(scene);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Node node) {
        context.getWindowFinder().targetWindow(node);
        return fxRobot;
    }

    @Override
    public List<Window> listWindows() {
        return context.getWindowFinder().listWindows();
    }

    @Override
    public List<Window> listTargetWindows() {
        return context.getWindowFinder().listTargetWindows();
    }

    @Override
    public Window window(Predicate<Window> predicate) {
        return context.getWindowFinder().window(predicate);
    }

    @Override
    public Window window(int windowIndex) {
        return context.getWindowFinder().window(windowIndex);
    }

    @Override
    public Window window(String stageTitleRegex) {
        return context.getWindowFinder().window(stageTitleRegex);
    }

    @Override
    public Window window(Pattern stageTitlePattern) {
        return context.getWindowFinder().window(stageTitlePattern);
    }

    @Override
    public Window window(Scene scene) {
        return context.getWindowFinder().window(scene);
    }

    @Override
    public Window window(Node node) {
        return context.getWindowFinder().window(node);
    }

}

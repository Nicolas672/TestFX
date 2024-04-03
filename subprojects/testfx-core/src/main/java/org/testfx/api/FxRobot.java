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

import java.net.URL;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javafx.geometry.Bounds;
import javafx.geometry.HorizontalDirection;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.geometry.VerticalDirection;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.MouseButton;
import javafx.stage.Window;

import org.hamcrest.Matcher;
import org.testfx.api.iterface.FxBoundsInterface;
import org.testfx.api.iterface.FxCaptureInterface;
import org.testfx.api.iterface.FxClickInterface;
import org.testfx.api.iterface.FxDragAndDropInterface;
import org.testfx.api.iterface.FxInteractionInterface;
import org.testfx.api.iterface.FxNodeQueryInterface;
import org.testfx.api.iterface.FxPointQueryInterface;
import org.testfx.api.iterface.FxScrollInterface;
import org.testfx.api.iterface.FxWindowInterface;
import org.testfx.api.iterface.FxWriteInterface;
import org.testfx.robot.Motion;
import org.testfx.service.query.BoundsQuery;
import org.testfx.service.query.NodeQuery;
import org.testfx.service.query.PointQuery;
import org.testfx.service.support.Capture;

public class FxRobot implements FxWindowInterface, FxNodeQueryInterface, FxBoundsInterface,
        FxPointQueryInterface, FxCaptureInterface, FxInteractionInterface, FxClickInterface,
        FxDragAndDropInterface, FxScrollInterface, FxWriteInterface {

    private final FxRobotContext context;
    private final FxRobotAllInterface allInterface;

    /**
     * Constructs all robot-related implementations and sets {@link #targetPos(Pos)} to {@link Pos#CENTER}.
     */
    public FxRobot() {
        context = new FxRobotContext();
        allInterface = new FxRobotAllInterface(this, context);
    }

    /**
     * Returns the internal context.
     */
    public FxRobotContext robotContext() {
        return context;
    }


    public Window targetWindow() {
        return allInterface.getWindow().targetWindow();
    }


    public FxRobot targetWindow(Window window) {
        return allInterface.getWindow().targetWindow(window);
    }

    @Override
    public FxRobot targetWindow(Predicate<Window> predicate) {
        return allInterface.getWindow().targetWindow(predicate);
    }

    @Override
    public FxRobot targetWindow(int windowNumber) {
        return allInterface.getWindow().targetWindow(windowNumber);
    }

    @Override
    public FxRobot targetWindow(String stageTitleRegex) {
        return allInterface.getWindow().targetWindow(stageTitleRegex);
    }

    @Override
    public FxRobot targetWindow(Pattern stageTitlePattern) {
        return allInterface.getWindow().targetWindow(stageTitlePattern);
    }

    @Override
    public FxRobot targetWindow(Scene scene) {
        return allInterface.getWindow().targetWindow(scene);
    }

    @Override
    public FxRobot targetWindow(Node node) {
        return allInterface.getWindow().targetWindow(node);
    }

    @Override
    public List<Window> listWindows() {
        return allInterface.getWindow().listWindows();
    }

    @Override
    public List<Window> listTargetWindows() {
        return allInterface.getWindow().listTargetWindows();
    }

    @Override
    public Window window(Predicate<Window> predicate) {
        return allInterface.getWindow().window(predicate);
    }

    @Override
    public Window window(int windowIndex) {
        return allInterface.getWindow().window(windowIndex);
    }

    @Override
    public Window window(String stageTitleRegex) {
        return allInterface.getWindow().window(stageTitleRegex);
    }

    @Override
    public Window window(Pattern stageTitlePattern) {
        return allInterface.getWindow().window(stageTitlePattern);
    }

    @Override
    public Window window(Scene scene) {
        return allInterface.getWindow().window(scene);
    }

    @Override
    public Window window(Node node) {
        return allInterface.getWindow().window(node);
    }

    @Override
    public NodeQuery fromAll() {
        return allInterface.getNodeQuery().fromAll();
    }

    @Override
    public NodeQuery from(Node... parentNodes) {
        return allInterface.getNodeQuery().from(parentNodes);
    }

    @Override
    public NodeQuery from(Collection<Node> parentNodes) {
        return allInterface.getNodeQuery().from(parentNodes);
    }

    @Override
    public NodeQuery from(NodeQuery nodeQuery) {
        return allInterface.getNodeQuery().from(nodeQuery);
    }

    @Override
    public NodeQuery lookup(String query) {
        return allInterface.getNodeQuery().lookup(query);
    }

    @Override
    public <T extends Node> NodeQuery lookup(Matcher<T> matcher) {
        return allInterface.getNodeQuery().lookup(matcher);
    }

    @Override
    public <T extends Node> NodeQuery lookup(Predicate<T> predicate) {
        return allInterface.getNodeQuery().lookup(predicate);
    }

    @Override
    public Node rootNode(Window window) {
        return allInterface.getNodeQuery().rootNode(window);
    }

    @Override
    public Node rootNode(Scene scene) {
        return allInterface.getNodeQuery().rootNode(scene);
    }

    @Override
    public Node rootNode(Node node) {
        return allInterface.getNodeQuery().rootNode(node);
    }


    public BoundsQuery bounds(double minX, double minY, double width, double height) {
        return allInterface.getBounds().bounds(minX, minY, width, height);
    }

    public BoundsQuery bounds(Point2D point) {
        return allInterface.getBounds().bounds(point);
    }


    public BoundsQuery bounds(Bounds bounds) {
        return allInterface.getBounds().bounds(bounds);
    }

    public BoundsQuery bounds(Node node) {
        return allInterface.getBounds().bounds(node);
    }

    public BoundsQuery bounds(Scene scene) {
        return allInterface.getBounds().bounds(scene);
    }

    public BoundsQuery bounds(Window window) {
        return allInterface.getBounds().bounds(window);
    }

    public BoundsQuery bounds(String query) {
        return allInterface.getBounds().bounds(query);
    }

    public <T extends Node> BoundsQuery bounds(Matcher<T> matcher) {
        return allInterface.getBounds().bounds(matcher);
    }

    public <T extends Node> BoundsQuery bounds(Predicate<T> predicate) {
        return allInterface.getBounds().bounds(predicate);
    }

    @Override
    public FxRobot targetPos(Pos pointPosition) {
        return allInterface.getPointQuery().targetPos(pointPosition);
    }

    @Override
    public PointQuery point(double x, double y) {
        return allInterface.getPointQuery().point(x, y);
    }

    @Override
    public PointQuery point(Point2D point) {
        return allInterface.getPointQuery().point(point);
    }

    @Override
    public PointQuery point(Bounds bounds) {
        return allInterface.getPointQuery().point(bounds);
    }

    @Override
    public PointQuery point(Node node) {
        return allInterface.getPointQuery().point(node);
    }

    @Override
    public PointQuery point(Scene scene) {
        return allInterface.getPointQuery().point(scene);
    }

    @Override
    public PointQuery point(Window window) {
        return allInterface.getPointQuery().point(window);
    }

    @Override
    public PointQuery point(String query) {
        return allInterface.getPointQuery().point(query);
    }

    @Override
    public <T extends Node> PointQuery point(Matcher<T> matcher) {
        return allInterface.getPointQuery().point(matcher);
    }

    @Override
    public <T extends Node> PointQuery point(Predicate<T> predicate) {
        return allInterface.getPointQuery().point(predicate);
    }

    @Override
    public PointQuery offset(Point2D point, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(point, offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Bounds bounds, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(bounds, offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Node node, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(node, offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Node node, Pos offsetReferencePos, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(node, offsetReferencePos, offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Scene scene, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(scene, offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Window window, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(window, offsetX, offsetY);
    }

    @Override
    public PointQuery offset(String query, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(query, offsetX, offsetY);
    }

    @Override
    public <T extends Node> PointQuery offset(Matcher<T> matcher, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(matcher, offsetX, offsetY);
    }

    @Override
    public <T extends Node> PointQuery offset(Predicate<T> predicate, double offsetX, double offsetY) {
        return allInterface.getPointQuery().offset(predicate, offsetX, offsetY);
    }

    public Capture capture(Rectangle2D screenRegion) {
        return allInterface.getCapture().capture(screenRegion);
    }

    public Capture capture(Bounds bounds) {
        return allInterface.getCapture().capture(bounds);
    }

    public Capture capture(Node node) {
        return allInterface.getCapture().capture(node);
    }

    public Capture capture(Image image) {
        return allInterface.getCapture().capture(image);
    }

    public Capture capture(Path path) {
        return allInterface.getCapture().capture(path);
    }

    public Capture capture(URL url) {
        return allInterface.getCapture().capture(url);
    }

    public FxRobot interact(Runnable runnable) {
        return allInterface.getInteraction().interact(runnable);
    }

    @Override
    public <T> FxRobot interact(Callable<T> callable) {
        return allInterface.getInteraction().interact(callable);
    }

    @Override
    public FxRobot interactNoWait(Runnable runnable) {
        return allInterface.getInteraction().interactNoWait(runnable);
    }
    @Override
    public <T> FxRobot interactNoWait(Callable<T> callable) {
        return allInterface.getInteraction().interactNoWait(callable);
    }

    @Override
    public FxRobot interrupt() {
        return allInterface.getInteraction().interrupt();
    }

    @Override
    public FxRobot interrupt(int attemptsCount) {
        return allInterface.getInteraction().interrupt(attemptsCount);
    }

    @Override
    public FxRobot push(KeyCode... combination) {
        return allInterface.getWrite().push(combination);
    }

    @Override
    public FxRobot push(KeyCodeCombination combination) {
        return allInterface.getWrite().push(combination);
    }

    @Override
    public FxRobot type(KeyCode... keyCodes) {
        return allInterface.getWrite().type(keyCodes);
    }

    @Override
    public FxRobot type(KeyCode keyCode, int times) {
        return allInterface.getWrite().type(keyCode, times);
    }

    @Override
    public FxRobot eraseText(int amount) {
        return allInterface.getWrite().eraseText(amount);
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
        return allInterface.getWrite().write(character);
    }

    @Override
    public FxRobot write(String text) {
        return allInterface.getWrite().write(text);
    }

    @Override
    public FxRobot write(String text, int sleepMillis) {
        return allInterface.getWrite().write(text, sleepMillis);
    }

    @Override
    public FxRobot sleep(long milliseconds) {
        return allInterface.getInteraction().sleep(milliseconds);
    }

    @Override
    public FxRobot sleep(long duration, TimeUnit timeUnit) {
        return allInterface.getInteraction().sleep(duration, timeUnit);
    }

    @Override
    @Deprecated
    public FxRobot scroll(int amount) {
        return allInterface.getScroll().scroll(amount);
    }

    @Override
    public FxRobot scroll(int amount, VerticalDirection direction) {
        return allInterface.getScroll().scroll(amount, direction);
    }

    @Override
    public FxRobot scroll(VerticalDirection direction) {
        return allInterface.getScroll().scroll(direction);
    }

    @Override
    public FxRobot scroll(int amount, HorizontalDirection direction) {
        return allInterface.getScroll().scroll(amount, direction);
    }

    @Override
    public FxRobot scroll(HorizontalDirection direction) {
        return allInterface.getScroll().scroll(direction);
    }

    @Override
    public FxRobot press(KeyCode... keys) {
        return allInterface.getDragAndDrop().press(keys);
    }

    @Override
    public FxRobot release(KeyCode... keys) {
        return allInterface.getDragAndDrop().release(keys);
    }

    @Override
    public FxRobot press(MouseButton... buttons) {
        return allInterface.getDragAndDrop().press(buttons);
    }

    @Override
    public FxRobot release(MouseButton... buttons) {
        return allInterface.getDragAndDrop().release(buttons);
    }

    @Override
    public FxRobot clickOn(MouseButton... buttons) {
        return allInterface.getClick().clickOn(buttons);
    }

    @Override
    public FxRobot clickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(pointQuery, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(buttons);
    }

    @Override
    public FxRobot doubleClickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(pointQuery, motion, buttons);
    }

    @Override
    public FxRobot clickOn(double x, double y, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(x, y, motion, buttons);
    }

    @Override
    public FxRobot clickOn(Point2D point, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(point, motion, buttons);
    }

    @Override
    public FxRobot clickOn(Bounds bounds, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(bounds, motion, buttons);
    }

    @Override
    public FxRobot clickOn(Node node, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(node, motion, buttons);
    }

    @Override
    public FxRobot clickOn(Scene scene, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(scene, motion, buttons);
    }

    @Override
    public FxRobot clickOn(Window window, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(window, motion, buttons);
    }

    @Override
    public FxRobot clickOn(String query, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(query, motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot clickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(matcher, motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot clickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().clickOn(predicate, motion, buttons);
    }

    @Override
    public FxRobot rightClickOn() {
        return allInterface.getClick().rightClickOn();
    }

    @Override
    public FxRobot rightClickOn(PointQuery pointQuery, Motion motion) {
        return allInterface.getClick().rightClickOn(pointQuery, motion);
    }

    @Override
    public FxRobot rightClickOn(double x, double y, Motion motion) {
        return allInterface.getClick().rightClickOn(x, y, motion);
    }

    @Override
    public FxRobot rightClickOn(Point2D point, Motion motion) {
        return allInterface.getClick().rightClickOn(point, motion);
    }

    @Override
    public FxRobot rightClickOn(Bounds bounds, Motion motion) {
        return allInterface.getClick().rightClickOn(bounds, motion);
    }

    @Override
    public FxRobot rightClickOn(Node node, Motion motion) {
        return allInterface.getClick().rightClickOn(node, motion);
    }

    @Override
    public FxRobot rightClickOn(Scene scene, Motion motion) {
        return allInterface.getClick().rightClickOn(scene, motion);
    }

    @Override
    public FxRobot rightClickOn(Window window, Motion motion) {
        return allInterface.getClick().rightClickOn(window, motion);
    }

    @Override
    public FxRobot rightClickOn(String query, Motion motion) {
        return allInterface.getClick().rightClickOn(query, motion);
    }

    @Override
    public <T extends Node> FxRobot rightClickOn(Matcher<T> matcher, Motion motion) {
        return allInterface.getClick().rightClickOn(matcher, motion);
    }

    @Override
    public <T extends Node> FxRobot rightClickOn(Predicate<T> predicate, Motion motion) {
        return allInterface.getClick().rightClickOn(predicate, motion);
    }

    @Override
    public FxRobot doubleClickOn(double x, double y, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(x, y, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Point2D point, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(point, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Bounds bounds, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(bounds, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Node node, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(node, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Scene scene, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(scene, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Window window, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(window, motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(String query, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(query, motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot doubleClickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(matcher, motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot doubleClickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons) {
        return allInterface.getClick().doubleClickOn(predicate, motion, buttons);
    }

    @Override
    public FxRobot drag(MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(buttons);
    }

    @Override
    public FxRobot drag(PointQuery pointQuery, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(pointQuery, buttons);
    }

    @Override
    public FxRobot drop() {
        return allInterface.getDragAndDrop().drop();
    }

    @Override
    public FxRobot dropTo(PointQuery pointQuery) {
        return allInterface.getDragAndDrop().dropTo(pointQuery);
    }

    @Override
    public FxRobot dropBy(double x, double y) {
        return allInterface.getDragAndDrop().dropBy(x, y);
    }

    @Override
    public FxRobot drag(double x, double y, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(x, y, buttons);
    }

    @Override
    public FxRobot drag(Point2D point, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(point, buttons);
    }

    @Override
    public FxRobot drag(Bounds bounds, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(bounds, buttons);
    }

    @Override
    public FxRobot drag(Node node, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(node, buttons);
    }

    @Override
    public FxRobot drag(Scene scene, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(scene, buttons);
    }

    @Override
    public FxRobot drag(Window window, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(window, buttons);
    }

    @Override
    public FxRobot drag(String query, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(query, buttons);
    }

    @Override
    public <T extends Node> FxRobot drag(Matcher<T> matcher, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(matcher, buttons);
    }

    @Override
    public <T extends Node> FxRobot drag(Predicate<T> predicate, MouseButton... buttons) {
        return allInterface.getDragAndDrop().drag(predicate, buttons);
    }

    @Override
    public FxRobot dropTo(double x, double y) {
        return allInterface.getDragAndDrop().dropTo(x, y);
    }

    @Override
    public FxRobot dropTo(Point2D point) {
        return allInterface.getDragAndDrop().dropTo(point);
    }

    @Override
    public FxRobot dropTo(Bounds bounds) {
        return allInterface.getDragAndDrop().dropTo(bounds);
    }

    @Override
    public FxRobot dropTo(Node node) {
        return allInterface.getDragAndDrop().dropTo(node);
    }

    @Override
    public FxRobot dropTo(Scene scene) {
        return allInterface.getDragAndDrop().dropTo(scene);
    }

    @Override
    public FxRobot dropTo(Window window) {
        return allInterface.getDragAndDrop().dropTo(window);
    }

    @Override
    public FxRobot dropTo(String query) {
        return allInterface.getDragAndDrop().dropTo(query);
    }

    @Override
    public <T extends Node> FxRobot dropTo(Matcher<T> matcher) {
        return allInterface.getDragAndDrop().dropTo(matcher);
    }

    @Override
    public <T extends Node> FxRobot dropTo(Predicate<T> predicate) {
        return allInterface.getDragAndDrop().dropTo(predicate);
    }

    @Override
    public FxRobot moveTo(PointQuery pointQuery, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(pointQuery, motion);
    }

    @Override
    public FxRobot moveBy(double x, double y, Motion motion) {
        return allInterface.getDragAndDrop().moveBy(x, y, motion);
    }

    @Override
    public FxRobot moveTo(double x, double y, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(x, y, motion);
    }

    @Override
    public FxRobot moveTo(Point2D point, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(point, motion);
    }

    @Override
    public FxRobot moveTo(Bounds bounds, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(bounds, motion);
    }

    @Override
    public FxRobot moveTo(Node node, Pos offsetReferencePos, Point2D offset, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(node, offsetReferencePos, offset, motion);
    }

    @Override
    public FxRobot moveTo(Scene scene, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(scene, motion);
    }

    @Override
    public FxRobot moveTo(Window window, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(window, motion);
    }

    @Override
    public FxRobot moveTo(String query, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(query, motion);
    }

    @Override
    public <T extends Node> FxRobot moveTo(Matcher<T> matcher, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(matcher, motion);
    }

    @Override
    public <T extends Node> FxRobot moveTo(Predicate<T> predicate, Motion motion) {
        return allInterface.getDragAndDrop().moveTo(predicate, motion);
    }
}

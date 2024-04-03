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

import java.util.function.Predicate;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.stage.Window;

import org.hamcrest.Matcher;
import org.testfx.api.FxPointQuery;
import org.testfx.api.FxRobot;
import org.testfx.robot.Motion;
import org.testfx.service.query.PointQuery;


public interface FxClickInterface {

    /**
     * Calls {@link org.testfx.robot.ClickRobot#clickOn(MouseButton...)} and returns itself for more method chaining.
     */
    FxRobot clickOn(MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.ClickRobot#clickOn(PointQuery, Motion, MouseButton...)} and returns itself for
     * more method chaining.
     */
    default FxRobot clickOn(PointQuery pointQuery, MouseButton... buttons) {
        return clickOn(pointQuery, Motion.DEFAULT, buttons);
    }

    /**
     * Calls {@link org.testfx.robot.ClickRobot#clickOn(PointQuery, MouseButton...)} and returns itself for more method
     * chaining.
     */
    FxRobot clickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.ClickRobot#doubleClickOn(MouseButton...)} and returns itself for more method
     * chaining.
     */
    FxRobot doubleClickOn(MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.ClickRobot#doubleClickOn(PointQuery, Motion, MouseButton...)} and returns itself
     * for method chaining.
     */
    default FxRobot doubleClickOn(PointQuery pointQuery, MouseButton... buttons) {
        return doubleClickOn(pointQuery, Motion.DEFAULT, buttons);
    }

    /**
     * Calls {@link org.testfx.robot.ClickRobot#doubleClickOn(PointQuery, Motion, MouseButton...)} and returns itself
     * for method chaining.
     */
    FxRobot doubleClickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the given coordinates, clicks the given buttons, and returns itself
     * for method chaining.
     */
    default FxRobot clickOn(double x, double y, MouseButton... buttons) {
        return clickOn(x, y, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the given coordinates,
     * clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(double x, double y, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the given point, clicks the given buttons, and returns itself for
     * method chaining.
     */
    default FxRobot clickOn(Point2D point, MouseButton... buttons) {
        return clickOn(point, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the given point, clicks
     * the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(Point2D point, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Bounds)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot clickOn(Bounds bounds, MouseButton... buttons) {
        return clickOn(bounds, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned
     * from {@link FxPointQuery#point(Bounds)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(Bounds bounds, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Node)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot clickOn(Node node, MouseButton... buttons) {
        return clickOn(node, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Node)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(Node node, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Scene)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot clickOn(Scene scene, MouseButton... buttons) {
        return clickOn(scene, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Scene)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(Scene scene, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Window)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot clickOn(Window window, MouseButton... buttons) {
        return clickOn(window, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Window)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(Window window, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(String)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot clickOn(String query, MouseButton... buttons) {
        return clickOn(query, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(String)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot clickOn(String query, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Matcher)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxRobot clickOn(Matcher<T> matcher, MouseButton... buttons) {
        return clickOn(matcher, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Matcher)}, clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxRobot clickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Predicate)},
     * clicks the given buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxRobot clickOn(Predicate<T> predicate, MouseButton... buttons) {
        return clickOn(predicate, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Predicate)}, clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxRobot clickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Clicks the {@link MouseButton#SECONDARY} button and returns itself for method chaining.
     */
    FxRobot rightClickOn();

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link PointQuery#query()}, clicks
     * the {@link MouseButton#SECONDARY} button and returns itself for method chaining.
     */
    default FxRobot rightClickOn(PointQuery pointQuery) {
        return rightClickOn(pointQuery, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link PointQuery#query()}, clicks the {@link MouseButton#SECONDARY} button and returns itself for method
     * chaining.
     */
    FxRobot rightClickOn(PointQuery pointQuery, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the given coordinates, clicks the {@link MouseButton#SECONDARY}
     * button, and returns itself for method chaining.
     */
    default FxRobot rightClickOn(double x, double y) {
        return rightClickOn(x, y, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the given coordinates,
     * clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxRobot rightClickOn(double x, double y, Motion motion);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Point2D)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxRobot rightClickOn(Point2D point) {
        return rightClickOn(point, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Point2D)}, clicks the {@link MouseButton#SECONDARY} button,
     * and returns itself for method chaining.
     */
    FxRobot rightClickOn(Point2D point, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Bounds)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxRobot rightClickOn(Bounds bounds) {
        return rightClickOn(bounds, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Bounds)}, clicks the {@link MouseButton#SECONDARY} button,
     * and returns itself for method chaining.
     */
    FxRobot rightClickOn(Bounds bounds, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Node)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxRobot rightClickOn(Node node) {
        return rightClickOn(node, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion}
     * (see: {@link Motion} to the point returned from {@link FxPointQuery#point(Node)},
     * clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxRobot rightClickOn(Node node, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Scene)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxRobot rightClickOn(Scene scene) {
        return rightClickOn(scene, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Scene)}, clicks the {@link MouseButton#SECONDARY} button,
     * and returns itself for method chaining.
     */
    FxRobot rightClickOn(Scene scene, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Window)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxRobot rightClickOn(Window window) {
        return rightClickOn(window, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Window)}, clicks the {@link MouseButton#SECONDARY} button,
     * and returns itself for method chaining.
     */
    FxRobot rightClickOn(Window window, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(String)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(String query) {
        return rightClickOn(query, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(String)}, clicks the {@link MouseButton#SECONDARY} button,
     * and returns itself for method chaining.
     */
    FxRobot rightClickOn(String query, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Matcher)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default <T extends Node> FxRobot rightClickOn(Matcher<T> matcher) {
        return rightClickOn(matcher, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion}
     * (see: {@link Motion} to the point returned from {@link FxPointQuery#point(Matcher)},
     * clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    <T extends Node> FxRobot rightClickOn(Matcher<T> matcher, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Predicate)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default <T extends Node> FxRobot rightClickOn(Predicate<T> predicate) {
        return rightClickOn(predicate, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Predicate)}, clicks the {@link MouseButton#SECONDARY} button,
     * and returns itself for method chaining.
     */
    <T extends Node> FxRobot rightClickOn(Predicate<T> predicate, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(double, double)},
     * double clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(double x, double y, MouseButton... buttons) {
        return doubleClickOn(x, y, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(double, double)}, double clicks the given buttons,
     * and returns itself for method chaining.
     */
    FxRobot doubleClickOn(double x, double y, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Point2D)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(Point2D point, MouseButton... buttons) {
        return doubleClickOn(point, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Point2D)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot doubleClickOn(Point2D point, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Bounds)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(Bounds bounds, MouseButton... buttons) {
        return doubleClickOn(bounds, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Bounds)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot doubleClickOn(Bounds bounds, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Node)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(Node node, MouseButton... buttons) {
        return doubleClickOn(node, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Node)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot doubleClickOn(Node node, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Scene)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(Scene scene, MouseButton... buttons) {
        return doubleClickOn(scene, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Scene)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot doubleClickOn(Scene scene, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Window)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(Window window, MouseButton... buttons) {
        return doubleClickOn(window, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Window)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot doubleClickOn(Window window, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(String)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxRobot doubleClickOn(String query, MouseButton... buttons) {
        return doubleClickOn(query, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(String)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxRobot doubleClickOn(String query, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Matcher)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxRobot doubleClickOn(Matcher<T> matcher, MouseButton... buttons) {
        return doubleClickOn(matcher, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Matcher)}, double clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxRobot doubleClickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Predicate)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxRobot doubleClickOn(Predicate<T> predicate, MouseButton... buttons) {
        return doubleClickOn(predicate, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Predicate)}, double clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxRobot doubleClickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons);

}

package org.testfx.api.Iterface;

import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.robot.Motion;
import org.testfx.service.query.PointQuery;

import java.util.function.Predicate;

public interface FxClickInterface {

    /**
     * Calls {@link org.testfx.robot.ClickRobot#clickOn(MouseButton...)} and returns itself for more method chaining.
     */
    FxClickInterface clickOn(MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.ClickRobot#clickOn(PointQuery, Motion, MouseButton...)} and returns itself for
     * more method chaining.
     */
    default FxClickInterface clickOn(PointQuery pointQuery, MouseButton... buttons) {
        return clickOn(pointQuery, Motion.DEFAULT, buttons);
    }

    /**
     * Calls {@link org.testfx.robot.ClickRobot#clickOn(PointQuery, MouseButton...)} and returns itself for more method
     * chaining.
     */
    FxClickInterface clickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.ClickRobot#doubleClickOn(MouseButton...)} and returns itself for more method
     * chaining.
     */
    FxClickInterface doubleClickOn(MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.ClickRobot#doubleClickOn(PointQuery, Motion, MouseButton...)} and returns itself
     * for method chaining.
     */
    default FxClickInterface doubleClickOn(PointQuery pointQuery, MouseButton... buttons) {
        return doubleClickOn(pointQuery, Motion.DEFAULT, buttons);
    }

    /**
     * Calls {@link org.testfx.robot.ClickRobot#doubleClickOn(PointQuery, Motion, MouseButton...)} and returns itself
     * for method chaining.
     */
    FxClickInterface doubleClickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the given coordinates, clicks the given buttons, and returns itself
     * for method chaining.
     */
    default FxClickInterface clickOn(double x, double y, MouseButton... buttons) {
        return clickOn(x, y, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the given coordinates,
     * clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(double x, double y, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the given point, clicks the given buttons, and returns itself for
     * method chaining.
     */
    default FxClickInterface clickOn(Point2D point, MouseButton... buttons) {
        return clickOn(point, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the given point, clicks
     * the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(Point2D point, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Bounds)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default FxClickInterface clickOn(Bounds bounds, MouseButton... buttons) {
        return clickOn(bounds, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned
     * from {@link #point(Bounds)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(Bounds bounds, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Node)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default FxClickInterface clickOn(Node node, MouseButton... buttons) {
        return clickOn(node, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Node)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(Node node, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Scene)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default FxClickInterface clickOn(Scene scene, MouseButton... buttons) {
        return clickOn(scene, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Scene)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(Scene scene, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Window)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default FxClickInterface clickOn(Window window, MouseButton... buttons) {
        return clickOn(window, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Window)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(Window window, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(String)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default FxClickInterface clickOn(String query, MouseButton... buttons) {
        return clickOn(query, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(String)}, clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface clickOn(String query, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Matcher)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxClickInterface clickOn(Matcher<T> matcher, MouseButton... buttons) {
        return clickOn(matcher, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Matcher)}, clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxClickInterface clickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Predicate)}, clicks the given
     * buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxClickInterface clickOn(Predicate<T> predicate, MouseButton... buttons) {
        return clickOn(predicate, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Predicate)}, clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxClickInterface clickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Clicks the {@link MouseButton#SECONDARY} button and returns itself for method chaining.
     */
    FxClickInterface rightClickOn();

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link PointQuery#query()}, clicks
     * the {@link MouseButton#SECONDARY} button and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(PointQuery pointQuery) {
        return rightClickOn(pointQuery, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link PointQuery#query()}, clicks the {@link MouseButton#SECONDARY} button and returns itself for method
     * chaining.
     */
    FxClickInterface rightClickOn(PointQuery pointQuery, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the given coordinates, clicks the {@link MouseButton#SECONDARY}
     * button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(double x, double y) {
        return rightClickOn(x, y, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the given coordinates,
     * clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxClickInterface rightClickOn(double x, double y, Motion motion);

    /**
     * Convenience method: Moves mouse to the point returned from {@link #point(Point2D)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(Point2D point) {
        return rightClickOn(point, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Point2D)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method
     * chaining.
     */
    FxClickInterface rightClickOn(Point2D point, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Bounds)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(Bounds bounds) {
        return rightClickOn(bounds, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Bounds)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxClickInterface rightClickOn(Bounds bounds, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Node)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(Node node) {
        return rightClickOn(node, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Node)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxClickInterface rightClickOn(Node node, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Scene)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(Scene scene) {
        return rightClickOn(scene, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Scene)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxClickInterface rightClickOn(Scene scene, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Window)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(Window window) {
        return rightClickOn(window, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Window)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxClickInterface rightClickOn(Window window, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(String)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default FxClickInterface rightClickOn(String query) {
        return rightClickOn(query, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(String)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    FxClickInterface rightClickOn(String query, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Matcher)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default <T extends Node> FxClickInterface rightClickOn(Matcher<T> matcher) {
        return rightClickOn(matcher, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Matcher)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method
     * chaining.
     */
    <T extends Node> FxClickInterface rightClickOn(Matcher<T> matcher, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Predicate)}, clicks
     * the {@link MouseButton#SECONDARY} button, and returns itself for method chaining.
     */
    default <T extends Node> FxClickInterface rightClickOn(Predicate<T> predicate) {
        return rightClickOn(predicate, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Predicate)}, clicks the {@link MouseButton#SECONDARY} button, and returns itself for method
     * chaining.
     */
    <T extends Node> FxClickInterface rightClickOn(Predicate<T> predicate, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(double, double)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(double x, double y, MouseButton... buttons) {
        return doubleClickOn(x, y, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(double, double)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(double x, double y, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Point2D)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(Point2D point, MouseButton... buttons) {
        return doubleClickOn(point, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Point2D)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(Point2D point, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Bounds)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(Bounds bounds, MouseButton... buttons) {
        return doubleClickOn(bounds, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Bounds)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(Bounds bounds, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Node)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(Node node, MouseButton... buttons) {
        return doubleClickOn(node, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Node)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(Node node, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Scene)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(Scene scene, MouseButton... buttons) {
        return doubleClickOn(scene, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Scene)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(Scene scene, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Window)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(Window window, MouseButton... buttons) {
        return doubleClickOn(window, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Window)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(Window window, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(String)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default FxClickInterface doubleClickOn(String query, MouseButton... buttons) {
        return doubleClickOn(query, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(String)}, double clicks the given buttons, and returns itself for method chaining.
     */
    FxClickInterface doubleClickOn(String query, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Matcher)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxClickInterface doubleClickOn(Matcher<T> matcher, MouseButton... buttons) {
        return doubleClickOn(matcher, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Matcher)}, double clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxClickInterface doubleClickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link #point(Predicate)}, double
     * clicks the given buttons, and returns itself for method chaining.
     */
    default <T extends Node> FxClickInterface doubleClickOn(Predicate<T> predicate, MouseButton... buttons) {
        return doubleClickOn(predicate, Motion.DEFAULT, buttons);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link #point(Predicate)}, double clicks the given buttons, and returns itself for method chaining.
     */
    <T extends Node> FxClickInterface doubleClickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons);

}

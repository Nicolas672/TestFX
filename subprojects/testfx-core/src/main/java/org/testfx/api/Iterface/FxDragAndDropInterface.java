package org.testfx.api.Iterface;

import java.util.function.Predicate;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Window;

import org.hamcrest.Matcher;
import org.testfx.api.FxPointQuery;
import org.testfx.robot.Motion;
import org.testfx.service.finder.WindowFinder;
import org.testfx.service.query.PointQuery;

import java.util.function.Predicate;

public interface FxDragAndDropInterface {

    /**
     * Calls {@link org.testfx.robot.DragRobot#drag(MouseButton...)} and returns itself for more method chaining.
     */
    FxDragAndDropInterface drag(MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.DragRobot#drag(PointQuery, MouseButton...)} and returns itself for more method
     * chaining.
     */
    FxDragAndDropInterface drag(PointQuery pointQuery, MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.DragRobot#drop()} and returns itself for more method chaining.
     */
    FxDragAndDropInterface drop();

    /**
     * Calls {@link org.testfx.robot.DragRobot#dropTo(PointQuery)} and returns itself for more method chaining.
     */
    FxDragAndDropInterface dropTo(PointQuery pointQuery);

    /**
     * Calls {@link org.testfx.robot.DragRobot#dropBy(double, double)} and returns itself for more method chaining.
     */
    FxDragAndDropInterface dropBy(double x, double y);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(double, double)}, presses the given
     * buttons, and returns itself for method chaining. 
     */
    FxDragAndDropInterface drag(double x, double y, MouseButton... buttons);
    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Point2D)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    FxDragAndDropInterface drag(Point2D point, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Bounds)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    FxDragAndDropInterface drag(Bounds bounds, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Node)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    FxDragAndDropInterface drag(Node node, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Scene)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    FxDragAndDropInterface drag(Scene scene, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Window)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    FxDragAndDropInterface drag(Window window, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(String)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    FxDragAndDropInterface drag(String query, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Matcher)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    <T extends Node> FxDragAndDropInterface drag(Matcher<T> matcher, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Predicate)}, presses the given
     * buttons, and returns itself for method chaining.
     */
    <T extends Node> FxDragAndDropInterface drag(Predicate<T> predicate, MouseButton... buttons);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(double, double)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(double x, double y);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Point2D)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(Point2D point);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Bounds)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(Bounds bounds);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Node)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(Node node);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Scene)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(Scene scene);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Window)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(Window window);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(String)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    FxDragAndDropInterface dropTo(String query);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Matcher)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    <T extends Node> FxDragAndDropInterface dropTo(Matcher<T> matcher);

    /**
     * Convenience method: Moves mouse to the point returned from {@link FxPointQuery#point(Predicate)}, releases the buttons
     * that were pressed in {@link #drag(MouseButton...)}- or {@link #press(MouseButton...)}-related methods,
     * and returns itself for method chaining.
     */
    <T extends Node> FxDragAndDropInterface dropTo(Predicate<T> predicate);

    /**
     * Calls {@link org.testfx.robot.KeyboardRobot#press(KeyCode...)} and returns itself for method chaining.
     */
    FxDragAndDropInterface press(KeyCode... keys);

    /**
     * Calls {@link org.testfx.robot.KeyboardRobot#press(KeyCode...)} and returns itself for method chaining.
     */
    FxDragAndDropInterface release(KeyCode... keys);

    /**
     * Presses and holds mouse buttons.
     *
     * @param buttons mouse buttons to press, defaults to primary mouse button.
     */
    FxDragAndDropInterface press(MouseButton... buttons);

    /**
     * Releases pressed mouse buttons.
     *
     * @param buttons mouse buttons to release, defaults to all pressed mouse buttons.
     */
    FxDragAndDropInterface release(MouseButton... buttons);

    /**
     * Calls {@link org.testfx.robot.MoveRobot#moveTo(PointQuery)} and returns itself for more method chaining.
     */
    default FxDragAndDropInterface moveTo(PointQuery pointQuery) {
        return moveTo(pointQuery, Motion.DEFAULT);
    }

    /**
     * Calls {@link org.testfx.robot.MoveRobot#moveTo(PointQuery, Motion)} and returns itself for more method chaining.
     */
    FxDragAndDropInterface moveTo(PointQuery pointQuery, Motion motion);

    /**
     * Calls {@link org.testfx.robot.MoveRobot#moveBy(double, double)} and returns itself for more method chaining.
     */
    default FxDragAndDropInterface moveBy(double x, double y) {
        return moveBy(x, y, Motion.DEFAULT);
    }

    /**
     * Calls {@link org.testfx.robot.MoveRobot#moveBy(double, double, Motion)} and returns itself for more method
     * chaining.
     */
    FxDragAndDropInterface moveBy(double x, double y, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(double, double)} and returns
     * itself for method chaining.
     */
    default FxDragAndDropInterface moveTo(double x, double y) {
        return moveTo(x, y, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(double, double)} and returns itself for method chaining.
     */
    FxDragAndDropInterface moveTo(double x, double y, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Point2D)} and returns itself
     * for method chaining.
     */
    default FxDragAndDropInterface moveTo(Point2D point) {
        return moveTo(point, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Point2D)} and returns itself for method chaining.
     */
    FxDragAndDropInterface moveTo(Point2D point, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the center of the given {@code Bounds} and returns itself for
     * method chaining.
     */
    default FxDragAndDropInterface moveTo(Bounds bounds) {
        return moveTo(bounds, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Bounds)} and returns itself for method chaining.
     */
    FxDragAndDropInterface moveTo(Bounds bounds, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the center of the given {@code Node} and returns itself
     * for method chaining.
     */
    default FxDragAndDropInterface moveTo(Node node) {
        return moveTo(node, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the center of the
     * given {@code Node} and returns itself for method chaining.
     */
    default FxDragAndDropInterface moveTo(Node node, Motion motion) {
        return moveTo(node, Pos.CENTER, Point2D.ZERO, motion);
    }

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Node)},
     * with the given offset from the center of the given {@code Node}, and returns itself for method chaining.
     */
    default FxDragAndDropInterface moveTo(Node node, Point2D offset) {
        return moveTo(node, Pos.CENTER, offset, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Node)}, with the given offset (from the {@code offsetReferencePos}, and returns itself for
     * method chaining.
     */
    FxDragAndDropInterface moveTo(Node node, Pos offsetReferencePos, Point2D offset, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the center of the given {@code Scene} and returns itself
     * for method chaining.
     */
    default FxDragAndDropInterface moveTo(Scene scene) {
        return moveTo(scene, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Scene)} and returns itself for method chaining.
     */
    FxDragAndDropInterface moveTo(Scene scene, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the center of the given {@code Window} and returns itself
     * for method chaining.
     */
    default FxDragAndDropInterface moveTo(Window window) {
        return moveTo(window, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Window)} and returns itself for method chaining.
     */
    FxDragAndDropInterface moveTo(Window window, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(String)} and returns itself
     * for method chaining.
     */
    default FxDragAndDropInterface moveTo(String query) {
        return moveTo(query, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(String)} and returns itself for method chaining.
     */
    FxDragAndDropInterface moveTo(String query, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Matcher)} and returns itself
     * for method chaining.
     */
    default <T extends Node> FxDragAndDropInterface moveTo(Matcher<T> matcher) {
        return moveTo(matcher, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Matcher)} and returns itself for method chaining.
     */
    <T extends Node> FxDragAndDropInterface moveTo(Matcher<T> matcher, Motion motion);

    /**
     * Convenience method: Moves mouse directly to the point returned from {@link FxPointQuery#point(Predicate)} and returns itself
     * for method chaining.
     */
    default <T extends Node> FxDragAndDropInterface moveTo(Predicate<T> predicate) {
        return moveTo(predicate, Motion.DEFAULT);
    }

    /**
     * Convenience method: Moves mouse using the given {@code motion} (see: {@link Motion} to the point returned from
     * {@link FxPointQuery#point(Predicate)} and returns itself for method chaining.
     */
    <T extends Node> FxDragAndDropInterface moveTo(Predicate<T> predicate, Motion motion);
}

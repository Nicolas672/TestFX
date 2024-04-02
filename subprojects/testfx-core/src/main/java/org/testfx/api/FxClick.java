package org.testfx.api;

import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.api.Iterface.FxClickInterface;
import org.testfx.robot.Motion;
import org.testfx.service.query.PointQuery;

import java.util.function.Predicate;


public class FxClick extends FxPointQuery implements FxClickInterface {

    public FxClick(FxRobot robot, FxRobotContext fxRobotContext) {
        super(robot, fxRobotContext);
    }

    @Override
    public FxRobot clickOn(MouseButton... buttons) {
        context.getClickRobot().clickOn(buttons);
        return fxRobot;
    }

    @Override
    public FxRobot clickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons) {
        context.getClickRobot().clickOn(pointQuery, motion, buttons);
        return fxRobot;
    }

    @Override
    public FxRobot doubleClickOn(MouseButton... buttons) {
        context.getClickRobot().doubleClickOn(buttons);
        return fxRobot;
    }

    @Override
    public FxRobot doubleClickOn(PointQuery pointQuery, Motion motion, MouseButton... buttons) {
        context.getClickRobot().doubleClickOn(pointQuery, motion, buttons);
        return fxRobot;
    }

    @Override
    public FxRobot clickOn(double x, double y, Motion motion, MouseButton... buttons) {
        return clickOn(point(x, y), motion, buttons);
    }

    @Override
    public FxRobot clickOn(Point2D point, Motion motion, MouseButton... buttons) {
        return clickOn(point(point), motion, buttons);
    }

    @Override
    public FxRobot clickOn(Bounds bounds, Motion motion, MouseButton... buttons) {
        return clickOn(point(bounds), motion, buttons);
    }

    @Override
    public FxRobot clickOn(Node node, Motion motion, MouseButton... buttons) {
        return clickOn(point(node), motion, buttons);
    }

    @Override
    public FxRobot clickOn(Scene scene, Motion motion, MouseButton... buttons) {
        return clickOn(point(scene), motion, buttons);
    }

    @Override
    public FxRobot clickOn(Window window, Motion motion, MouseButton... buttons) {
        return clickOn(point(window), motion, buttons);
    }

    @Override
    public FxRobot clickOn(String query, Motion motion, MouseButton... buttons) {
        return clickOn(pointOfVisibleNode(query), motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot clickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons) {
        return clickOn(pointOfVisibleNode(matcher), motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot clickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons) {
        return clickOn(pointOfVisibleNode(predicate), motion, buttons);
    }

    @Override
    public FxRobot rightClickOn() {
        return clickOn(MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(PointQuery pointQuery, Motion motion) {
        return clickOn(pointQuery, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(double x, double y, Motion motion) {
        return clickOn(x, y, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(Point2D point, Motion motion) {
        return clickOn(point, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(Bounds bounds, Motion motion) {
        return clickOn(bounds, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(Node node, Motion motion) {
        return clickOn(node, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(Scene scene, Motion motion) {
        return clickOn(scene, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(Window window, Motion motion) {
        return clickOn(window, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot rightClickOn(String query, Motion motion) {
        return clickOn(query, motion, MouseButton.SECONDARY);
    }

    @Override
    public <T extends Node> FxRobot rightClickOn(Matcher<T> matcher, Motion motion) {
        return clickOn(matcher, motion, MouseButton.SECONDARY);
    }

    @Override
    public <T extends Node> FxRobot rightClickOn(Predicate<T> predicate, Motion motion) {
        return clickOn(predicate, motion, MouseButton.SECONDARY);
    }

    @Override
    public FxRobot doubleClickOn(double x, double y, Motion motion, MouseButton... buttons) {
        return doubleClickOn(point(x, y), motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Point2D point, Motion motion, MouseButton... buttons) {
        return doubleClickOn(point(point), motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Bounds bounds, Motion motion, MouseButton... buttons) {
        return doubleClickOn(point(bounds), motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Node node, Motion motion, MouseButton... buttons) {
        return doubleClickOn(point(node), motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Scene scene, Motion motion, MouseButton... buttons) {
        return doubleClickOn(point(scene), motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(Window window, Motion motion, MouseButton... buttons) {
        return doubleClickOn(point(window), motion, buttons);
    }

    @Override
    public FxRobot doubleClickOn(String query, Motion motion, MouseButton... buttons) {
        return doubleClickOn(pointOfVisibleNode(query), motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot doubleClickOn(Matcher<T> matcher, Motion motion, MouseButton... buttons) {
        return doubleClickOn(pointOfVisibleNode(matcher), motion, buttons);
    }

    @Override
    public <T extends Node> FxRobot doubleClickOn(Predicate<T> predicate, Motion motion, MouseButton... buttons) {
        return doubleClickOn(pointOfVisibleNode(predicate), motion, buttons);
    }
}

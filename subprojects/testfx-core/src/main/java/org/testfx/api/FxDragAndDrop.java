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
import org.testfx.api.iterface.FxDragAndDropInterface;
import org.testfx.robot.Motion;
import org.testfx.service.query.PointQuery;


public class FxDragAndDrop extends FxPointQuery implements FxDragAndDropInterface {


    public FxDragAndDrop(FxRobot robot, FxRobotContext fxRobotContext) {
        super(robot, fxRobotContext);
    }

    @Override
    public FxRobot press(KeyCode... keys) {
        context.getKeyboardRobot().press(keys);
        return fxRobot;
    }

    @Override
    public FxRobot release(KeyCode... keys) {
        context.getKeyboardRobot().release(keys);
        return fxRobot;
    }

    @Override
    public FxRobot press(MouseButton... buttons) {
        context.getMouseRobot().press(buttons);
        return fxRobot;
    }

    @Override
    public FxRobot release(MouseButton... buttons) {
        context.getMouseRobot().release(buttons);
        return fxRobot;
    }

    @Override
    public FxRobot drag(MouseButton... buttons) {
        context.getDragRobot().drag(buttons);
        return fxRobot;
    }

    @Override
    public FxRobot drag(PointQuery pointQuery, MouseButton... buttons) {
        context.getDragRobot().drag(pointQuery, buttons);
        return fxRobot;
    }

    @Override
    public FxRobot drop() {
        context.getDragRobot().drop();
        return fxRobot;
    }

    @Override
    public FxRobot dropTo(PointQuery pointQuery) {
        context.getDragRobot().dropTo(pointQuery);
        return fxRobot;
    }

    @Override
    public FxRobot dropBy(double x, double y) {
        context.getDragRobot().dropBy(x, y);
        return fxRobot;
    }

    @Override
    public FxRobot drag(double x, double y, MouseButton... buttons) {
        return drag(point(x, y), buttons);
    }

    @Override
    public FxRobot drag(Point2D point, MouseButton... buttons) {
        return drag(point(point), buttons);
    }

    @Override
    public FxRobot drag(Bounds bounds, MouseButton... buttons) {
        return drag(point(bounds), buttons);
    }

    @Override
    public FxRobot drag(Node node, MouseButton... buttons) {
        return drag(point(node), buttons);
    }

    @Override
    public FxRobot drag(Scene scene, MouseButton... buttons) {
        return drag(point(scene), buttons);
    }

    @Override
    public FxRobot drag(Window window, MouseButton... buttons) {
        return drag(point(window), buttons);
    }

    @Override
    public FxRobot drag(String query, MouseButton... buttons) {
        return drag(pointOfVisibleNode(query), buttons);
    }

    @Override
    public <T extends Node> FxRobot drag(Matcher<T> matcher, MouseButton... buttons) {
        return drag(pointOfVisibleNode(matcher), buttons);
    }

    @Override
    public <T extends Node> FxRobot drag(Predicate<T> predicate, MouseButton... buttons) {
        return drag(pointOfVisibleNode(predicate), buttons);
    }

    @Override
    public FxRobot dropTo(double x, double y) {
        return dropTo(point(x, y));
    }

    @Override
    public FxRobot dropTo(Point2D point) {
        return dropTo(point(point));
    }

    @Override
    public FxRobot dropTo(Bounds bounds) {
        return dropTo(point(bounds));
    }

    @Override
    public FxRobot dropTo(Node node) {
        return dropTo(point(node));
    }

    @Override
    public FxRobot dropTo(Scene scene) {
        return dropTo(point(scene));
    }

    @Override
    public FxRobot dropTo(Window window) {
        return dropTo(point(window));
    }

    @Override
    public FxRobot dropTo(String query) {
        return dropTo(pointOfVisibleNode(query));
    }

    @Override
    public <T extends Node> FxRobot dropTo(Matcher<T> matcher) {
        return dropTo(pointOfVisibleNode(matcher));
    }

    @Override
    public <T extends Node> FxRobot dropTo(Predicate<T> predicate) {
        return dropTo(pointOfVisibleNode(predicate));
    }

    @Override
    public FxRobot moveTo(PointQuery pointQuery, Motion motion) {
        context.getMoveRobot().moveTo(pointQuery, motion);
        return fxRobot;
    }

    @Override
    public FxRobot moveBy(double x, double y, Motion motion) {
        context.getMoveRobot().moveBy(x, y, motion);
        return fxRobot;
    }

    @Override
    public FxRobot moveTo(double x, double y, Motion motion) {
        return moveTo(point(new Point2D(x, y)), motion);
    }

    @Override
    public FxRobot moveTo(Point2D point, Motion motion) {
        return moveTo(point(point), motion);
    }

    @Override
    public FxRobot moveTo(Bounds bounds, Motion motion) {
        return moveTo(point(bounds), motion);
    }

    @Override
    public FxRobot moveTo(Node node, Pos offsetReferencePos, Point2D offset, Motion motion) {
        return moveTo(point(node).atPosition(offsetReferencePos).atOffset(offset), motion);
    }

    @Override
    public FxRobot moveTo(Scene scene, Motion motion) {
        return moveTo(point(scene), motion);
    }

    @Override
    public FxRobot moveTo(Window window, Motion motion) {
        return moveTo(point(window), motion);
    }

    @Override
    public FxRobot moveTo(String query, Motion motion) {
        return moveTo(pointOfVisibleNode(query), motion);
    }

    @Override
    public <T extends Node> FxRobot moveTo(Matcher<T> matcher, Motion motion) {
        return moveTo(pointOfVisibleNode(matcher), motion);
    }

    @Override
    public <T extends Node> FxRobot moveTo(Predicate<T> predicate, Motion motion) {
        return moveTo(pointOfVisibleNode(predicate), motion);
    }

}

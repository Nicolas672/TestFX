package org.testfx.api;

import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.api.Iterface.FxPointQueryInterface;
import org.testfx.service.locator.PointLocator;
import org.testfx.service.query.NodeQuery;
import org.testfx.service.query.PointQuery;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import static org.testfx.util.NodeQueryUtils.isVisible;

public class FxPointQuery extends FxWindow implements FxPointQueryInterface {

    protected final FxNodeQuery fxNodeQuery;

    public FxPointQuery(FxRobot robot, FxRobotContext fxRobotContext) {
        super(robot, fxRobotContext);
        fxNodeQuery = new FxNodeQuery(fxRobotContext);
    }

    private Node queryNode(NodeQuery nodeQuery, String queryDescription) {
        Optional<Node> resultNode = nodeQuery.tryQuery();
        if (!resultNode.isPresent()) {
            throw new FxRobotException(queryDescription + " returned no nodes.");
        }
        return resultNode.get();
    }

    protected Node queryVisibleNode(NodeQuery nodeQuery, String queryDescription) {
        Set<Node> resultNodes = nodeQuery.queryAll();
        if (resultNodes.isEmpty()) {
            throw new FxRobotException(queryDescription + " returned no nodes.");
        }
        Optional<Node> resultNode = fxNodeQuery.from(resultNodes).match(isVisible()).tryQuery();
        if (!resultNode.isPresent()) {
            throw new FxRobotException(queryDescription + " returned " + resultNodes.size() + " nodes" +
                    ", but no nodes were visible.");
        }
        return resultNode.get();
    }

    protected PointQuery pointOfVisibleNode(String query) {
        NodeQuery nodeQuery = fxNodeQuery.lookup(query);
        Node node = queryVisibleNode(nodeQuery, "the query \"" + query + "\"");
        return point(node);
    }

    protected <T extends Node> PointQuery pointOfVisibleNode(Matcher<T> matcher) {
        NodeQuery nodeQuery = fxNodeQuery.lookup(matcher);
        Node node = queryVisibleNode(nodeQuery, "the matcher \"" + matcher.toString() + "\"");
        return point(node);
    }

    protected  <T extends Node> PointQuery pointOfVisibleNode(Predicate<T> predicate) {
        NodeQuery nodeQuery = fxNodeQuery.lookup(predicate);
        Node node = queryVisibleNode(nodeQuery, "the predicate");
        return point(node);
    }

    @Override
    public FxRobot targetPos(Pos pointPosition) {
        context.setPointPosition(pointPosition);
        return fxRobot;
    }

    @Override
    public PointQuery point(double x, double y) {
        PointLocator pointLocator = context.getPointLocator();
        Pos pointPosition = context.getPointPosition();
        return pointLocator.point(new Point2D(x, y)).atPosition(pointPosition);
    }

    @Override
    public PointQuery point(Point2D point) {
        PointLocator pointLocator = context.getPointLocator();
        Pos pointPosition = context.getPointPosition();
        return pointLocator.point(point).atPosition(pointPosition);
    }

    @Override
    public PointQuery point(Bounds bounds) {
        PointLocator pointLocator = context.getPointLocator();
        Pos pointPosition = context.getPointPosition();
        return pointLocator.point(bounds).atPosition(pointPosition);
    }

    @Override
    public PointQuery point(Node node) {
        PointLocator pointLocator = context.getPointLocator();
        Pos pointPosition = context.getPointPosition();
        targetWindow(node.getScene().getWindow());
        return pointLocator.point(node).onNode(node).atPosition(pointPosition);
    }

    @Override
    public PointQuery point(Scene scene) {
        PointLocator pointLocator = context.getPointLocator();
        Pos pointPosition = context.getPointPosition();
        targetWindow(scene.getWindow());
        return pointLocator.point(scene).atPosition(pointPosition);
    }

    @Override
    public PointQuery point(Window window) {
        PointLocator pointLocator = context.getPointLocator();
        Pos pointPosition = context.getPointPosition();
        targetWindow(window);
        return pointLocator.point(window).atPosition(pointPosition);
    }

    @Override
    public PointQuery point(String query) {
        NodeQuery nodeQuery = fxNodeQuery.lookup(query);
        Node node = queryNode(nodeQuery, "the query \"" + query + "\"");
        return point(node).atPosition(context.getPointPosition());
    }

    @Override
    public <T extends Node> PointQuery point(Matcher<T> matcher) {
        NodeQuery nodeQuery = fxNodeQuery.lookup(matcher);
        Node node = queryNode(nodeQuery, "the matcher \"" + matcher.toString() + "\"");
        return point(node).atPosition(context.getPointPosition());
    }

    @Override
    public <T extends Node> PointQuery point(Predicate<T> predicate) {
        NodeQuery nodeQuery = fxNodeQuery.lookup(predicate);
        Node node = queryNode(nodeQuery, "the predicate");
        return point(node).atPosition(context.getPointPosition());
    }

    @Override
    public PointQuery offset(Point2D point, double offsetX, double offsetY) {
        return point(point).atOffset(offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Bounds bounds, double offsetX, double offsetY) {
        return point(bounds).atOffset(offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Node node, double offsetX, double offsetY) {
        return point(node).atOffset(offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Node node, Pos offsetReferencePos, double offsetX, double offsetY) {
        return point(node).atPosition(offsetReferencePos).atOffset(offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Scene scene, double offsetX, double offsetY) {
        return point(scene).atOffset(offsetX, offsetY);
    }

    @Override
    public PointQuery offset(Window window, double offsetX, double offsetY) {
        return point(window).atOffset(offsetX, offsetY);
    }

    @Override
    public PointQuery offset(String query, double offsetX, double offsetY) {
        return point(query).atOffset(offsetX, offsetY);
    }

    @Override
    public <T extends Node> PointQuery offset(Matcher<T> matcher, double offsetX, double offsetY) {
        return point(matcher).atOffset(offsetX, offsetY);
    }

    @Override
    public <T extends Node> PointQuery offset(Predicate<T> predicate, double offsetX, double offsetY) {
        return point(predicate).atOffset(offsetX, offsetY);
    }

}

package org.testfx.api;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.api.Iterface.FxNodeQueryInterface;
import org.testfx.service.query.NodeQuery;

import java.util.Collection;
import java.util.function.Predicate;

public class FxNodeQuery implements FxNodeQueryInterface {

    protected final FxRobotContext context;

    public FxNodeQuery(FxRobotContext fxRobotContext){
        context = fxRobotContext;
    }

    @Override
    public NodeQuery fromAll() {
        return context.getNodeFinder().fromAll();
    }

    @Override
    public NodeQuery from(Node... parentNodes) {
        return context.getNodeFinder().from(parentNodes);
    }

    @Override
    public NodeQuery from(Collection<Node> parentNodes) {
        return context.getNodeFinder().from(parentNodes);
    }

    @Override
    public NodeQuery from(NodeQuery nodeQuery) {
        return context.getNodeFinder().from(nodeQuery);
    }

    @Override
    public NodeQuery lookup(String query) {
        return context.getNodeFinder().lookup(query);
    }

    @Override
    public <T extends Node> NodeQuery lookup(Matcher<T> matcher) {
        return context.getNodeFinder().lookup(matcher);
    }

    @Override
    public <T extends Node> NodeQuery lookup(Predicate<T> predicate) {
        return context.getNodeFinder().lookup(predicate);
    }

    @Override
    public Node rootNode(Window window) {
        return context.getNodeFinder().rootNode(window);
    }

    @Override
    public Node rootNode(Scene scene) {
        return context.getNodeFinder().rootNode(scene);
    }

    @Override
    public Node rootNode(Node node) {
        return context.getNodeFinder().rootNode(node);
    }

}

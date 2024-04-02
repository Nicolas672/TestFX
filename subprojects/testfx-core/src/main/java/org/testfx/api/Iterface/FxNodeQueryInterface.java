package org.testfx.api.Iterface;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.service.finder.NodeFinder;
import org.testfx.service.query.NodeQuery;

import java.util.Collection;
import java.util.function.Predicate;

public interface FxNodeQueryInterface {

    /**
     * Calls {@link NodeFinder#fromAll()} and returns itself for method chaining.
     */
    NodeQuery fromAll();

    /**
     * Calls {@link NodeFinder#from(Node...)} and returns itself for method chaining.
     */
    NodeQuery from(Node... parentNodes);

    /**
     * Calls {@link NodeFinder#from(Collection)} and returns itself for method chaining.
     */
    NodeQuery from(Collection<Node> parentNodes);

    /**
     * Calls {@link NodeFinder#rootNode(Window)} and returns itself for method chaining.
     */
    Node rootNode(Window window);

    /**
     * Calls {@link NodeFinder#rootNode(Scene)} and returns itself for method chaining.
     */
    Node rootNode(Scene scene);

    /**
     * Calls {@link NodeFinder#rootNode(Node)} and returns itself for method chaining.
     */
    Node rootNode(Node node);

    // Convenience methods:
    /**
     * Convenience method: Calls {@link NodeFinder#lookup(String)} and returns itself for method chaining.
     */
    NodeQuery lookup(String query);

    /**
     * Convenience method: Calls {@link NodeFinder#lookup(Matcher)} and returns itself for method chaining.
     */
    <T extends Node> NodeQuery lookup(Matcher<T> matcher);

    /**
     * Convenience method: Calls {@link NodeFinder#lookup(Predicate)} and returns itself for method chaining.
     */
    <T extends Node> NodeQuery lookup(Predicate<T> predicate);

    /**
     * Convenience method: Calls {@link NodeFinder#from(NodeQuery)} and returns itself for method chaining.
     */
    NodeQuery from(NodeQuery nodeQuery);

}

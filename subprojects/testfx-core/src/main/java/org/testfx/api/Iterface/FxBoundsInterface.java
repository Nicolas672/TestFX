package org.testfx.api.Iterface;

import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.service.query.BoundsQuery;

import java.util.function.Predicate;

public interface FxBoundsInterface {

    /**
     * Calls {@link org.testfx.util.BoundsQueryUtils#bounds(double, double, double, double)}
     */
    BoundsQuery bounds(double minX, double minY, double width, double height);

    /**
     * Calls {@link org.testfx.util.BoundsQueryUtils#bounds(Point2D)}
     */
    BoundsQuery bounds(Point2D point);

    /**
     * Creates a {@code BoundsQuery} that returns the given bounds
     */
    BoundsQuery bounds(Bounds bounds);

    /**
     * Calls {@link org.testfx.util.BoundsQueryUtils#boundsOnScreen(Node)}
     */
    BoundsQuery bounds(Node node);

    /**
     * Calls {@link org.testfx.util.BoundsQueryUtils#boundsOnScreen(Bounds, Scene)} with given scene's bounds
     */
    BoundsQuery bounds(Scene scene);

    /**
     * Calls {@link org.testfx.util.BoundsQueryUtils#boundsOnScreen(Bounds, Window)} with the given window's bounds
     */
    BoundsQuery bounds(Window window);

    /**
     * NOT YET IMPLEMENTED
     */
    BoundsQuery bounds(String query);

    /**
     * NOT YET IMPLEMENTED
     */
    <T extends Node> BoundsQuery bounds(Matcher<T> matcher);

    /**
     * NOT YET IMPLEMENTED
     */
    <T extends Node> BoundsQuery bounds(Predicate<T> predicate);

}

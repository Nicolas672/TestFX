package org.testfx.api;

import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.hamcrest.Matcher;
import org.testfx.api.Iterface.FxBoundsInterface;
import org.testfx.service.query.BoundsQuery;
import org.testfx.util.BoundsQueryUtils;

import java.util.function.Predicate;

public class FxBounds implements FxBoundsInterface {

    @Override
    public BoundsQuery bounds(double minX, double minY, double width, double height) {
        return () -> BoundsQueryUtils.bounds(minX, minY, width, height);
    }

    @Override
    public BoundsQuery bounds(Point2D point) {
        return () -> BoundsQueryUtils.bounds(point);
    }

    @Override
    public BoundsQuery bounds(Bounds bounds) {
        return () -> bounds;
    }

    @Override
    public BoundsQuery bounds(Node node) {
        return () -> BoundsQueryUtils.boundsOnScreen(node);
    }

    @Override
    public BoundsQuery bounds(Scene scene) {
        return () -> BoundsQueryUtils.boundsOnScreen(BoundsQueryUtils.bounds(scene), scene);
    }

    @Override
    public BoundsQuery bounds(Window window) {
        return () -> BoundsQueryUtils.boundsOnScreen(BoundsQueryUtils.bounds(window), window);
    }

    @Override
    public BoundsQuery bounds(String query) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends Node> BoundsQuery bounds(Matcher<T> matcher) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T extends Node> BoundsQuery bounds(Predicate<T> predicate) {
        throw new UnsupportedOperationException();
    }

}

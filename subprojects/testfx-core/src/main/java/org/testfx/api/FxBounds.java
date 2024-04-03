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
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;

import org.hamcrest.Matcher;
import org.testfx.api.iterface.FxBoundsInterface;
import org.testfx.service.query.BoundsQuery;
import org.testfx.util.BoundsQueryUtils;


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

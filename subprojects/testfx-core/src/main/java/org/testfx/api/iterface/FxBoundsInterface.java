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
package org.testfx.api.iterface;

import java.util.function.Predicate;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;

import org.hamcrest.Matcher;
import org.testfx.service.query.BoundsQuery;


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

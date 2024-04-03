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

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;

import org.testfx.service.finder.WindowFinder;


public interface FxWindowInterface {

    /**
     * Calls {@link WindowFinder#targetWindow()} and returns itself for method chaining.
     */
    Window targetWindow();

    /**
     * Calls {@link WindowFinder#targetWindow(Window)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(Window window);

    /**
     * Calls {@link WindowFinder#targetWindow(Predicate)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(Predicate<Window> predicate);

    // Convenience methods:
    /**
     * Convenience method: Calls {@link WindowFinder#targetWindow(int)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(int windowIndex);

    /**
     * Convenience method: Calls {@link WindowFinder#targetWindow(String)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(String stageTitleRegex);

    /**
     * Convenience method: Calls {@link WindowFinder#targetWindow(Pattern)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(Pattern stageTitlePattern);

    /**
     * Convenience method: Calls {@link WindowFinder#targetWindow(Scene)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(Scene scene);

    /**
     * Convenience method: Calls {@link WindowFinder#targetWindow(Node)} and returns itself for method chaining.
     */
    FxWindowInterface targetWindow(Node node);

    /**
     * Calls {@link WindowFinder#listWindows()} ()} and returns itself for method chaining.
     */
    List<Window> listWindows();

    /**
     * Calls {@link WindowFinder#listTargetWindows()} and returns itself for method chaining.
     */
    List<Window> listTargetWindows();

    /**
     * Calls {@link WindowFinder#window(Predicate)} and returns itself for method chaining.
     */
    Window window(Predicate<Window> predicate);

    // Convenience methods:
    /**
     * Convenience method: Calls {@link WindowFinder#window(int)} and returns itself for method chaining.
     */
    Window window(int windowIndex);

    /**
     * Convenience method: Calls {@link WindowFinder#window(String)} and returns itself for method chaining.
     */
    Window window(String stageTitleRegex);

    /**
     * Convenience method: Calls {@link WindowFinder#window(Pattern)} and returns itself for method chaining.
     */
    Window window(Pattern stageTitlePattern);

    /**
     * Convenience method: Calls {@link WindowFinder#window(Scene)} and returns itself for method chaining.
     */
    Window window(Scene scene);

    /**
     * Convenience method: Calls {@link WindowFinder#window(Node)} and returns itself for method chaining.
     */
    Window window(Node node);

}

package org.testfx.api.Iterface;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.testfx.service.finder.WindowFinder;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

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

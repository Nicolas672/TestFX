package org.testfx.api;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;
import org.testfx.api.Iterface.FxClickInterface;
import org.testfx.api.Iterface.FxWindowInterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class FxWindow implements FxWindowInterface {

    protected final FxRobotContext context;
    protected final FxRobot fxRobot;

    public FxWindow(FxRobot robot, FxRobotContext fxRobotContext){
        context = fxRobotContext;
        fxRobot = robot;
    }


    @Override
    public Window targetWindow() {
        return context.getWindowFinder().targetWindow();
    }

    @Override
    public FxRobot targetWindow(Window window) {
        context.getWindowFinder().targetWindow(window);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Predicate<Window> predicate) {
        context.getWindowFinder().targetWindow(predicate);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(int windowNumber) {
        context.getWindowFinder().targetWindow(windowNumber);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(String stageTitleRegex) {
        context.getWindowFinder().targetWindow(stageTitleRegex);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Pattern stageTitlePattern) {
        context.getWindowFinder().targetWindow(stageTitlePattern);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Scene scene) {
        context.getWindowFinder().targetWindow(scene);
        return fxRobot;
    }

    @Override
    public FxRobot targetWindow(Node node) {
        context.getWindowFinder().targetWindow(node);
        return fxRobot;
    }

    @Override
    public List<Window> listWindows() {
        return context.getWindowFinder().listWindows();
    }

    @Override
    public List<Window> listTargetWindows() {
        return context.getWindowFinder().listTargetWindows();
    }

    @Override
    public Window window(Predicate<Window> predicate) {
        return context.getWindowFinder().window(predicate);
    }

    @Override
    public Window window(int windowIndex) {
        return context.getWindowFinder().window(windowIndex);
    }

    @Override
    public Window window(String stageTitleRegex) {
        return context.getWindowFinder().window(stageTitleRegex);
    }

    @Override
    public Window window(Pattern stageTitlePattern) {
        return context.getWindowFinder().window(stageTitlePattern);
    }

    @Override
    public Window window(Scene scene) {
        return context.getWindowFinder().window(scene);
    }

    @Override
    public Window window(Node node) {
        return context.getWindowFinder().window(node);
    }

}

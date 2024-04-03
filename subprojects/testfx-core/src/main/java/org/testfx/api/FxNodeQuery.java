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

import java.util.Collection;
import java.util.function.Predicate;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Window;

import org.hamcrest.Matcher;
import org.testfx.api.iterface.FxNodeQueryInterface;
import org.testfx.service.query.NodeQuery;


public class FxNodeQuery implements FxNodeQueryInterface {

    protected final FxRobotContext context;

    public FxNodeQuery(FxRobotContext fxRobotContext) {
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

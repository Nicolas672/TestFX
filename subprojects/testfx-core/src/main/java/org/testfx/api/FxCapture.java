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

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;

import org.testfx.api.iterface.FxCaptureInterface;
import org.testfx.service.support.Capture;
import org.testfx.service.support.CaptureSupport;


public class FxCapture implements FxCaptureInterface {

    protected CaptureSupport captureSupport;

    public FxCapture(CaptureSupport support) {
        captureSupport = support;
    }

    @Override
    public Capture capture(Rectangle2D screenRegion) {
        return () -> captureSupport.captureRegion(screenRegion);
    }

    @Override
    public Capture capture(Bounds bounds) {
        Rectangle2D region = new Rectangle2D(bounds.getMinX(), bounds.getMinY(),
                bounds.getWidth(), bounds.getHeight());
        return () -> captureSupport.captureRegion(region);
    }

    @Override
    public Capture capture(Node node) {
        return () -> captureSupport.captureNode(node);
    }

    @Override
    public Capture capture(Image image) {
        return () -> image;
    }

    @Override
    public Capture capture(Path path) {
        return () -> captureSupport.loadImage(path);
    }

    @Override
    public Capture capture(URL url) {
        try {
            Path path = Paths.get(url.toURI());
            return () -> captureSupport.loadImage(path);
        }
        catch (URISyntaxException exception) {
            throw new RuntimeException(exception);
        }
    }

}

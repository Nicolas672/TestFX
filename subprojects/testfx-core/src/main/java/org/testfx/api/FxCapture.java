package org.testfx.api;

import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import org.testfx.api.Iterface.FxCaptureInterface;
import org.testfx.service.support.Capture;
import org.testfx.service.support.CaptureSupport;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

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

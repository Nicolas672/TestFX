package org.testfx.api.Iterface;

import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;
import org.testfx.service.support.Capture;

import java.net.URL;
import java.nio.file.Path;

public interface FxCaptureInterface {

    /**
     * Returns a {@link Capture} that supplies a screenshot using the given rectangle's bounds.
     */
    Capture capture(Rectangle2D screenRegion);

    /**
     * Returns a {@link Capture} that supplies a screenshot using the given bounds.
     */
    Capture capture(Bounds bounds);

    /**
     * Returns a {@link Capture} that supplies a screenshot using the given node's bounds.
     */
    Capture capture(Node node);

    // Convenience methods:
    /**
     * Convenience method: Returns a {@link Capture} that supplies the given {@link Image}.
     */
    Capture capture(Image image);

    /**
     * Convenience method: Returns a {@link Capture} that supplies the {@link Image} from the image file of the
     * given {@link Path}.
     */
    Capture capture(Path path);

    /**
     * Convenience method: Returns a {@link Capture} that supplies the {@link Image} from the image file of the
     * given {@link URL}.
     */
    Capture capture(URL url);

}

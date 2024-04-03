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

import java.net.URL;
import java.nio.file.Path;
import javafx.geometry.Bounds;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.image.Image;

import org.testfx.service.support.Capture;


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

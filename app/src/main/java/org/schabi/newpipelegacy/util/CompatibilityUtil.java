package org.schabi.newpipelegacy.util;

import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.exceptions.ExtractionException;

public class CompatibilityUtil {

    public static String getNameOfService(final int id) {
        try {
            return NewPipe.getService(id).getServiceInfo().getName();
        } catch (ExtractionException e) {
            return "<unknown>";
        }
    }
}

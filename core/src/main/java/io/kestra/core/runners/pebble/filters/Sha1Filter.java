package io.kestra.core.runners.pebble.filters;


import io.pebbletemplates.pebble.error.PebbleException;
import io.pebbletemplates.pebble.extension.Filter;
import io.pebbletemplates.pebble.template.EvaluationContext;
import io.pebbletemplates.pebble.template.PebbleTemplate;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;

/**
 * This class implements the 'sha256' filter.
 *
 * @author Silviu Vergoti
 */
public class Sha1Filter extends ShaBaseFilter {

    public Sha1Filter() {
        super("SHA-1");
    }
}

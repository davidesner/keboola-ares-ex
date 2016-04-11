/*
 */
package keboola.ares.ex.config.tableconfig;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author David Esner <esnerda at gmail.com>
 * @created 2016
 */
public class ManifestParser {

    public static ManifestFile parseFile(File file) throws IOException {
        final ObjectMapper mapper = new ObjectMapper(new JsonFactory());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(Include.NON_NULL);
        return mapper.readValue(file, ManifestFile.class);
    }
}

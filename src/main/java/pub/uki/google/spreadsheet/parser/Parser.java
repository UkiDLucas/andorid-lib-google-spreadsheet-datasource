package pub.uki.google.spreadsheet.parser;

import java.io.InputStream;

/**
 * @author Andrii Kovalov
 */
public interface Parser {
    void parse(InputStream in);
}

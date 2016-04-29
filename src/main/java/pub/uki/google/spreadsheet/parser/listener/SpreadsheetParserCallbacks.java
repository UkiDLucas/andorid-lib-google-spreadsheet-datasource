package pub.uki.google.spreadsheet.parser.listener;

import pub.uki.google.spreadsheet.model.SpreadsheetInfo;
import pub.uki.google.spreadsheet.model.Worksheet;

/**
 * @author Andrii Kovalov
 */
public interface SpreadsheetParserCallbacks {

    void onSpreadsheet(SpreadsheetInfo spreadsheetInfo);

    void onWorksheet(Worksheet worksheet);
}

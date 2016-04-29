package pub.uki.google.spreadsheet.parser.listener;

import pub.uki.google.spreadsheet.model.Worksheet;
import pub.uki.google.spreadsheet.model.WorksheetRow;

/**
 * @author Andrii Kovalov
 */
public interface WorksheetParserCallbacks {

    void onWorksheet(Worksheet worksheet);

    void onWorksheetRow(WorksheetRow worksheetRow);

}

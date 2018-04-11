package me.cwuyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {

        String spreadsheetId = "1X1ptb1B57wsL42fv45mme22YAAZy-8z5G9yopzSoS1M";
        String range = "sheet1!A3:D4";

        List<String> list1 = Arrays.asList("3A", "3B", "3C", "3D");
        List<String> list2 = Arrays.asList("4A", "4B", "4", "4");
        List<List<Object>> list = new ArrayList<>();
        list.add(new ArrayList<Object>(list1));
        list.add(new ArrayList<Object>(list2));

        GoogleSheetsUtil.insert(spreadsheetId, range, list);

    }
}

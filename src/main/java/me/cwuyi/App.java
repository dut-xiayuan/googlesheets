package me.cwuyi;

import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main( String[] args ) throws Exception {

        String spreadsheetId = "1X1ptb1B57wsL42fv45mme22YAAZy-8z5G9yopzSoS1M";

        List<String> list1 = Arrays.asList("3A", "3B", "3C", "3D");
        List<String> list2 = Arrays.asList("4A", "4B", "4", "4");
        List<List<Object>> list = new ArrayList<>();
        list.add(new ArrayList<Object>(list1));
        list.add(new ArrayList<Object>(list2));

        String insertRange = "sheet1!A3:D4";
        UpdateValuesResponse insertResponse = GoogleSheetsUtil.insert(spreadsheetId, insertRange, list);
        System.out.println("在" + insertRange + "插入了" + insertResponse.getUpdatedCells() + " 个cells");
        System.out.println();


        /**
         * append的时候只需要指出在那个sheet页进行append，不需要具体指出后面的范围
         */
        String appendRange = "sheet1";
        AppendValuesResponse appendResponse = GoogleSheetsUtil.append(spreadsheetId, "sheet1", list);
        System.out.println("在" + appendRange + "页的末尾添加了" + insertResponse.getUpdatedCells() + " 个cells");

    }
}

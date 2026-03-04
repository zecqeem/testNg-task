package calculatortest;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.*;

public class CsvDataProviderUtil {
    @DataProvider(name = "dataFromCsv")
    public static Iterator<Object[]> provideData(Method method){
        String methodName = method.getName();
        List<Object[]> dataList = new ArrayList<>();
        String csv;
        if (methodName.contains("twoLong")){
            csv = "twoValueLong";
        } else if (methodName.contains("twoDouble")){
            csv = "twoValueDouble";
        }else if (methodName.contains("onePositive")){
            csv = "oneValuePositiveLong";
        }else if (methodName.contains("oneNegative")){
            csv = "oneValueNegativeLong";
        } else{csv = "oneValueDouble";}
        String csvFilePath = "src/test/resources/"+csv+".csv";
        try(BufferedReader br = new BufferedReader(new FileReader(csvFilePath))){
            String line;
            while ((line = br.readLine()) != null){
                String[] arr = line.split(",");
                Object[] rowData = new Object[arr.length];

                for (int i = 0; i < arr.length; i++) {
                    String value = arr[i].trim();

                    if (value.contains(".")) {
                        rowData[i] = Double.parseDouble(value);
                    } else {
                        rowData[i] = Long.parseLong(value);
                    }
                }
                dataList.add(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList.iterator();
    }
}

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * @className Read3 
 * @description  
 * @author c.w
 * @date 2024/06/25
**/
public class Read3 extends ExcelReader2<ExcelDataVO>{
    @Override
    protected ExcelDataVO convertRowToData(Row row) {
        ExcelDataVO resultData = new ExcelDataVO();
        Cell cell;
        int cellNum = 0;
        // 获取姓名
        cell = row.getCell(cellNum++);
        String name = convertCellValueToString(cell);
        resultData.setId(name);
        // 获取年龄
        cell = row.getCell(cellNum++);
        String ageStr = convertCellValueToString(cell);

        resultData.setType(ageStr);
        // 获取居住地
        cell = row.getCell(cellNum++);
        String location = convertCellValueToString(cell);
        resultData.setTitle(location);
        if (location == null || location.isEmpty()) {
            return null;
        }
        // 获取职业
        cell = row.getCell(cellNum++);
        String job = convertCellValueToString(cell);
        resultData.setCreateTime(job);

        cell = row.getCell(cellNum++);
        String status = convertCellValueToString(cell);
        resultData.setStatus(status);

        cell = row.getCell(cellNum++);
        String origin = convertCellValueToString(cell);
        resultData.setOrigin(origin);
        //System.out.println(resultData);
        return resultData;
    }
}



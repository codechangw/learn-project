import java.util.List;

/**
 * Author: Dreamer-1
 * Date: 2019-03-01
 * Time: 10:13
 * Description: 示例程序入口类
 */
public class ReadXlsx {

    public static void main(String[] args) {
        // 设定Excel文件所在路径
        String excelFileName = "E:\\workspace\\BJCC-APP-Manager\\WebRoot\\WEB-INF\\jsp\\app\\mkoa\\upload\\敏感人物-刘贵明.xlsx";
        // 读取Excel文件内容
        Read3 r3 = new Read3();
        List<ExcelDataVO> readResult = r3.readExcel(excelFileName);
        for (int i = 0; i < readResult.size(); i++) {
            System.out.println(readResult.get(i));
        }
    }

}

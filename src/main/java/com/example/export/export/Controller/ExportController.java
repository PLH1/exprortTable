package com.example.export.export.Controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.export.export.daomain.Export;
import com.example.export.export.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-04-04 17:40
 */
@RestController
public class ExportController {
    @Autowired
    ExportService exportService;

    @GetMapping("export")
    public List<Export> exports() throws FileNotFoundException {
        File file = new File("D:\\mhealth\\file\\Table Structure.xlsx");
        try {
            if (!file.exists()) {
                File file1 = file.getParentFile();
                file1.mkdirs();
                if (!file.isDirectory()) {
                    file.createNewFile();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream out = new FileOutputStream(file);
        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            /**
             * 得到数据库全面的表
             */
            List<String> tables=exportService.getAllTables();
            for (int i = 0; i < tables.size(); i++) {
                List<Export> test = exportService.getTest(tables.get(i));
                //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
                Sheet sheet1 = new Sheet(i + 1, 0, Export.class);
                sheet1.setSheetName(tables.get(i));
                writer.write(test, sheet1);
            }
            writer.finish();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

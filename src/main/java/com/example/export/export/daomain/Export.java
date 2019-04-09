package com.example.export.export.daomain;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-04-04 17:54
 */
public class Export extends BaseRowModel {
    @ExcelProperty(value = "Column Names", index = 0)
    private String t1;
    @ExcelProperty(value = "Data Type", index = 1)
    private String t2;
    @ExcelProperty(value = "Field Type", index = 2)
    private String t3;
    @ExcelProperty(value = "Length", index = 3)
    private String t4;
    @ExcelProperty(value = "Is it Empty?", index = 4)
    private String t5;
    @ExcelProperty(value = "Default Value", index = 5)
    private String t6;
    @ExcelProperty(value = "Remarks", index = 6)
    private String t7;


    @Override
    public String toString() {
        return "Export{" +
                "t1='" + t1 + '\'' +
                ", t2='" + t2 + '\'' +
                ", t3='" + t3 + '\'' +
                ", t4='" + t4 + '\'' +
                ", t5='" + t5 + '\'' +
                ", t6='" + t6 + '\'' +
                ", t7='" + t7 + '\'' +
                '}';
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getT4() {
        return t4;
    }

    public void setT4(String t4) {
        this.t4 = t4;
    }

    public String getT5() {
        return t5;
    }

    public void setT5(String t5) {
        this.t5 = t5;
    }

    public String getT6() {
        return t6;
    }

    public void setT6(String t6) {
        this.t6 = t6;
    }

    public String getT7() {
        return t7;
    }

    public void setT7(String t7) {
        this.t7 = t7;
    }
}

package com.example.export.export.dao;

import com.example.export.export.daomain.Export;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-04-04 17:35
 */
@Mapper
public interface ExportDao {

    @Select("SELECT title FROM api WHERE id = #{id}")
    List<String> testMybatis(@Param("id") Long id);

    List<String> getAllTab();


    @Select("SELECT\n" +
            "  COLUMN_NAME t1,\n" +
            "  COLUMN_TYPE t2,\n" +
            "  DATA_TYPE t3,\n" +
            "  CHARACTER_MAXIMUM_LENGTH t4,\n" +
            "  IS_NULLABLE t5,\n" +
            "  COLUMN_DEFAULT t6,\n" +
            "  COLUMN_COMMENT t7\n" +
            "FROM\n" +
            " INFORMATION_SCHEMA.COLUMNS\n" +
            "where\n" +
            "table_schema ='crm_dev'\n" +
            "AND\n" +
            "table_name  = #{tables}")
    List<Export> getAllTables(@Param("tables") String tables);


}

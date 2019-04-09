package com.example.export.export.service;

import com.example.export.export.dao.ExportDao;
import com.example.export.export.daomain.Export;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @describe:
 * @outhor 潘立欢
 * @create 2019-04-04 17:38
 */
@Service
public class ExportService {
    @Autowired
    ExportDao exportDao;

    public List<Export> getTest(String tables){
        return exportDao.getAllTables(tables);
    }

    public List<String> getAllTables(){
        return exportDao.getAllTab();
    }


}

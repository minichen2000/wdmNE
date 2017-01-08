package com.nsb.test.wdmne.converter.ctp;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * Client ODUj CTP Converter
 * adpCTP: 转换后填写的CTP
 * adpPort: 它所属的Port
 * entity: 原始的entity
 */
public class BasicClientODUjCTPConverter{
    private static BasicClientODUjCTPConverter instance = new BasicClientODUjCTPConverter();
    public static BasicClientODUjCTPConverter getInstance() {
        return instance;
    }
    private BasicClientODUjCTPConverter() {
    }

    public void convert(int j, AdpTp adpCTP, AdpTp adpPort, SnmpPortEntity entity) {
        //TODO: "/odu<j>=1"
        //...
    }
}

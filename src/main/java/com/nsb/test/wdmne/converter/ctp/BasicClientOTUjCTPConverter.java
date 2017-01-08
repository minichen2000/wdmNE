package com.nsb.test.wdmne.converter.ctp;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * Client OTUj CTP Converter
 * adpCTP: 转换后填写的CTP
 * adpPort: 它所属的Port
 * entity: 原始的entity
 */
public class BasicClientOTUjCTPConverter{
    private static BasicClientOTUjCTPConverter instance = new BasicClientOTUjCTPConverter();
    public static BasicClientOTUjCTPConverter getInstance() {
        return instance;
    }
    private BasicClientOTUjCTPConverter() {
    }

    public void convert(int j, AdpTp adpCTP, AdpTp adpPort, SnmpPortEntity entity) {
        //TODO: "/otu<j>=1"
        //...
    }
}

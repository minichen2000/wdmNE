package com.nsb.test.wdmne.converter.ctp;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * Line OTUk CTP Converter
 * adpCTP: 转换后填写的CTP
 * adpPort: 它所属的Port
 * entity: 原始的entity
 */
public class BasicLineOTUkCTPConverter{
    private static BasicLineOTUkCTPConverter instance = new BasicLineOTUkCTPConverter();
    public static BasicLineOTUkCTPConverter getInstance() {
        return instance;
    }
    private BasicLineOTUkCTPConverter() {
    }
    public void convert(int k, AdpTp adpCTP, AdpTp adpPort, SnmpPortEntity entity) {
        //TODO: "/otu<k>=1"
        //...
    }
}

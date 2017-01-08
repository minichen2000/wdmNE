package com.nsb.test.wdmne.converter.ctp;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * Line OCH CTP Converter
 * adpCTP: 转换后填写的CTP
 * adpPort: 它所属的Port
 * entity: 原始的entity
 */
public class BasicLineOCHCTPConverter{
    private static BasicLineOCHCTPConverter instance = new BasicLineOCHCTPConverter();
    public static BasicLineOCHCTPConverter getInstance() {
        return instance;
    }
    private BasicLineOCHCTPConverter() {
    }
    public void convert(AdpTp adpCTP, AdpTp adpPort, SnmpPortEntity entity) {
        //TODO: "/frequency= /tunable-number=1"
        //...
    }
}

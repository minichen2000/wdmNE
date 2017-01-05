package com.nsb.test.wdmne.converter;

import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般OT盘Line侧Port的Converter
 */
public class BasicOTLinePortConverter implements PortConverter {
    static private PortConverter basicPortConverter=new BasicPortConverter();
    public void convert(AdpTp adpPort, SnmpPortEntity entity) {
        basicPortConverter.convert(adpPort, entity);

        //TODO:一般OT盘Line侧Port特有属性的转换过程
        //...
    }
}

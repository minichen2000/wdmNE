package com.nsb.test.wdmne.converter.port;

import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般OT盘Line侧Port的Converter
 */
public class BasicOTLinePortConverter implements PortConverter {
    private static BasicOTLinePortConverter instance = new BasicOTLinePortConverter();
    public static BasicOTLinePortConverter getInstance() {
        return instance;
    }
    private BasicOTLinePortConverter() {
    }

    public boolean convert(AdpTp adpPort, SnmpPortEntity entity) {
        BasicPortConverter.getInstance().convert(adpPort, entity);

        //TODO:一般OT盘Line侧Port特有属性的转换过程
        //...
        return true;
    }
}

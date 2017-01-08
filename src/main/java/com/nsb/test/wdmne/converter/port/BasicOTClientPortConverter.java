package com.nsb.test.wdmne.converter.port;

import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般OT盘Client侧Port的Converter
 */
public class BasicOTClientPortConverter implements PortConverter {
    private static BasicOTClientPortConverter instance = new BasicOTClientPortConverter();
    public static BasicOTClientPortConverter getInstance() {
        return instance;
    }
    private BasicOTClientPortConverter() {
    }
    public boolean convert(AdpTp adpPort, SnmpPortEntity entity) {
        BasicPortConverter.getInstance().convert(adpPort, entity);

        //TODO:一般OT盘Client侧Port特有属性的转换过程
        //...
        return true;
    }
}

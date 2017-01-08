package com.nsb.test.wdmne.converter.port;

import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 对于所有Port都适用的公共属性的Converter
 * 即：从snmp port entity 中转换文档中提到的common port属性和 common port params属性到adpPort中
 * 可以预见，该Converter会承担所有Port的大部分Convert工作
 */
public class BasicPortConverter implements PortConverter{
    private static BasicPortConverter instance = new BasicPortConverter();
    public static BasicPortConverter getInstance() {
        return instance;
    }
    private BasicPortConverter() {
    }
    public boolean convert(AdpTp adpPort, SnmpPortEntity entity) {
        //TODO:
        //...
        return true;
    }
}

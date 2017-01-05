package com.nsb.test.wdmne.com.nsb.test.wdmne.converter;

import com.nsb.test.wdmne.com.nsb.test.wdmne.util.PortConverterUtil;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般OT盘所有Port的Converter
 */
public class BasicOTBoardPortConverter implements PortConverter {
    static private PortConverter basicOTClientPortConverter=new BasicOTClientPortConverter();
    static private PortConverter basicOTLinePortConverter=new BasicOTLinePortConverter();
    public void convert(AdpTp adpPort, SnmpPortEntity entity) {
        //区分Client侧Port和Line侧Port，分别转换
        if(PortConverterUtil.isOTClientPort(entity)){
            basicOTClientPortConverter.convert(adpPort, entity);
        }else if(PortConverterUtil.isOTLinePort(entity)){
            basicOTLinePortConverter.convert(adpPort, entity);
        }
    }
}

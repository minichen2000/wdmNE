package com.nsb.test.wdmne.converter;

import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 260SCX2这种OT盘所有Port的Converter
 */
public class OTBoardPortConverter_260SCX2 implements PortConverter {
    static private PortConverter basicOTBoardPortConverter=new BasicOTBoardPortConverter();
    public void convert(AdpTp adpPort, SnmpPortEntity entity) {
        basicOTBoardPortConverter.convert(adpPort, entity);
        //TODO: 针对260SCX2加入其特殊的转换
        //..
    }
}

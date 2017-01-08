package com.nsb.test.wdmne.converter.port;

import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 260SCX2这种OT盘所有Port的Converter
 */
public class OTBoardPortConverter_260SCX2 implements PortConverter {
    private static OTBoardPortConverter_260SCX2 instance = new OTBoardPortConverter_260SCX2();
    public static OTBoardPortConverter_260SCX2 getInstance() {
        return instance;
    }
    private OTBoardPortConverter_260SCX2() {
    }
    public boolean convert(AdpTp adpPort, SnmpPortEntity entity) {
        BasicOTBoardPortConverter.getInstance().convert(adpPort, entity);
        //TODO: 针对260SCX2加入其特殊的转换
        //..
        return true;
    }
}

package com.nsb.test.wdmne.converter.port;

import com.nsb.test.wdmne.util.PortConverterUtil;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般OT盘所有Port的Converter
 */
public class BasicOTBoardPortConverter implements PortConverter {
    private static BasicOTBoardPortConverter instance = new BasicOTBoardPortConverter();
    public static BasicOTBoardPortConverter getInstance() {
        return instance;
    }
    private BasicOTBoardPortConverter() {
    }

    public boolean convert(AdpTp adpPort, SnmpPortEntity entity) {
        //区分Client侧Port和Line侧Port，分别转换
        if(PortConverterUtil.isOTClientPort(entity)){
            BasicOTClientPortConverter.getInstance().convert(adpPort, entity);
        }else if(PortConverterUtil.isOTLinePort(entity)){
            BasicOTLinePortConverter.getInstance().convert(adpPort, entity);
        }
        return true;
    }
}

package com.nsb.test.wdmne.converter.port;

import com.nsb.test.wdmne.util.PortConverterUtil;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般SFD盘所有Port的Converter
 */
public class BasicSFDBoardPortConverter implements PortConverter {
    private static BasicSFDBoardPortConverter instance = new BasicSFDBoardPortConverter();
    public static BasicSFDBoardPortConverter getInstance() {
        return instance;
    }
    private BasicSFDBoardPortConverter() {
    }

    public boolean convert(AdpTp adpPort, SnmpPortEntity entity) {
        BasicPortConverter.getInstance().convert(adpPort, entity);
        //TODO: 看文档一般合分波盘(SFD盘)是否需要按不同类型port特殊转换，如果没有，可以不用下面的。
        if(PortConverterUtil.isSFDChannelPort(entity)){
            //TODO:
        }else if(PortConverterUtil.isSFDOMDPort(entity)){
            //TODO:
        }
        return true;
    }
}

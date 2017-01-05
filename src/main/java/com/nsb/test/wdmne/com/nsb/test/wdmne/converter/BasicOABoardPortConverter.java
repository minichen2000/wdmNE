package com.nsb.test.wdmne.com.nsb.test.wdmne.converter;

import com.nsb.test.wdmne.com.nsb.test.wdmne.util.PortConverterUtil;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * 一般OA盘所有Port的Converter
 */
public class BasicOABoardPortConverter implements PortConverter {
    static private PortConverter basicPortConverter=new BasicPortConverter();
    public void convert(AdpTp adpPort, SnmpPortEntity entity) {
        basicPortConverter.convert(adpPort, entity);
        //TODO: 看文档对于一般OA盘是否需要按不同类型port特殊转换，如果没有，可以不用下面的。
        if(PortConverterUtil.isOASIGPort(entity)){
            //TODO:
        }else if(PortConverterUtil.isOALINEPort(entity)){
            //TODO:
        }else if(PortConverterUtil.isOADCMPort(entity)){
            //TODO:
        }else if(PortConverterUtil.isOAOSCPort(entity)){
            //TODO:
        }
    }
}

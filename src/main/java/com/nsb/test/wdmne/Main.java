package com.nsb.test.wdmne;

import com.nsb.test.wdmne.com.nsb.test.wdmne.util.PortConverterMgr;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minichen on 2017/1/5.
 */
public class Main {
    public static void main(String[] argv){
        //TODO:假设我们已经从下层snmp得到了所有Port的SnmpPortEntity列表
        //...
        List<SnmpPortEntity> entities=new ArrayList<SnmpPortEntity>();
        convertAllPorts(entities);
    }
    private static void convertAllPorts(List<SnmpPortEntity> entities){
        AdpTp tp;
        PortConverter c;
        for(SnmpPortEntity entity : entities){
            c= PortConverterMgr.getInstance().getConverter(entity.getBoardType());
            if(null!=c){
                tp=new AdpTp();
                c.convert(tp, entity);
                //TODO:写入DB
            }else{
                //TODO:记录日志：找不到converter!
            }
        }
    }
}

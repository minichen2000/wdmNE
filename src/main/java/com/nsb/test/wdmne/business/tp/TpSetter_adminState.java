package com.nsb.test.wdmne.business.tp;

import com.nsb.test.wdmne.model.AdpNe;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.neResourceSetter.AbstractNeResourceSetter;

import java.util.Map;

/**
 * Created by minichen on 2017/1/12.
 */
public class TpSetter_adminState extends AbstractNeResourceSetter<AdpTp> {
    static private String _NAME_adminState="params.adminState";
    public TpSetter_adminState() {
        attrNameSet.add(_NAME_adminState);
    }

    public boolean canProcess(AdpNe ne, AdpTp resource) {
        /*
        如果哪些特殊Ne,或板卡，或Port上的adminState不能用该setter处理，在此处返回false
         */
        return true;
    }

    public AdpTp set(AdpNe ne, AdpTp resource, Map<String, Object> attrs) {
        String adminState=(String)attrs.get(_NAME_adminState);
        //TODO:此处解析出 adminState，并向下设置。
        return null;
    }
}

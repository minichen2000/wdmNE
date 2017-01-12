package com.nsb.test.wdmne.business.tp;

import com.nsb.test.wdmne.model.AdpNe;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.neResourceSetter.AbstractNeResourceSetter;

import java.util.Map;

/**
 * Created by minichen on 2017/1/12.
 */
public class TpSetter_connectedToFromInt extends AbstractNeResourceSetter<AdpTp> {
    static private String _NAME_connectedTo="params.connectedTo";
    static private String _NAME_connectedFrom="params.connectedFrom";
    public TpSetter_connectedToFromInt() {
        attrNameSet.add(_NAME_connectedTo);
        attrNameSet.add(_NAME_connectedFrom);
    }

    public boolean canProcess(AdpNe ne, AdpTp resource) {
        /*
        如果哪些特殊Ne,或板卡，或Port不能用该setter处理，在此处返回false
         */
        return true;
    }

    public AdpTp set(AdpNe ne, AdpTp resource, Map<String, Object> attrs) {
        String connectedTo=(String)attrs.get(_NAME_connectedTo);
        String connectedFrom=(String)attrs.get(_NAME_connectedFrom);
        //TODO:此处解析出 以上值，并一次性向下设置。
        return null;
    }
}

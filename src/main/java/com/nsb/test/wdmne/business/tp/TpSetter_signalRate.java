package com.nsb.test.wdmne.business.tp;

import com.nsb.test.wdmne.model.AdpNe;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.neResourceSetter.AbstractNeResourceSetter;

import java.util.Map;

/**
 * Created by minichen on 2017/1/12.
 */
public class TpSetter_signalRate extends AbstractNeResourceSetter<AdpTp> {
    static private String _NAME_signalRate="params.signalRate";
    public TpSetter_signalRate() {
        attrNameSet.add(_NAME_signalRate);
    }

    public boolean canProcess(AdpNe ne, AdpTp resource) {
        /*
        如果哪些特殊Ne,或板卡，或Port上的signalRate与该setter的实现过程很不一样，不能用该setter处理，在此处返回false,
        设计另一个TpSetter_signalRate_XXX来专门处理那种情况。
         */
        return true;
    }

    public AdpTp set(AdpNe ne, AdpTp resource, Map<String, Object> attrs) {
        String signalRate=(String)attrs.get(_NAME_signalRate);
        //TODO:此处解析出 signalRate，并向下设置。
        return null;
    }
}

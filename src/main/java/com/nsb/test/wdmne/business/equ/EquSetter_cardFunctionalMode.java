package com.nsb.test.wdmne.business.equ;

import com.nsb.test.wdmne.model.AdpEquipment;
import com.nsb.test.wdmne.model.AdpNe;
import com.nsb.test.wdmne.neResourceSetter.AbstractNeResourceSetter;

import java.util.Map;

/**
 * Created by minichen on 2017/1/12.
 */
public class EquSetter_cardFunctionalMode extends AbstractNeResourceSetter<AdpEquipment> {
    static private String _NAME_cardFunctionalMode="params.cardFunctionalMode";
    public EquSetter_cardFunctionalMode() {
        attrNameSet.add(_NAME_cardFunctionalMode);
    }

    public boolean canProcess(AdpNe ne, AdpEquipment resource) {
        /*
        如果哪些特殊Ne,或板卡不能用该setter处理，在此处返回false
         */
        return true;
    }

    public AdpEquipment set(AdpNe ne, AdpEquipment resource, Map<String, Object> attrs) {
        String cardFunctionalMode=(String)attrs.get(_NAME_cardFunctionalMode);
        //TODO:此处解析出 cardFunctionalMode，并向下设置。
        return null;
    }
}

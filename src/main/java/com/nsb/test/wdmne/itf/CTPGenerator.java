package com.nsb.test.wdmne.itf;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

import java.util.List;

/**
 * Created by minichen on 2017/1/5.
 */
public interface CTPGenerator {
    public List<AdpTp> generate(AdpTp adpPort, SnmpPortEntity entity);
}

package com.nsb.test.wdmne.itf;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 */
public interface PortConverter {
    public void convert(AdpTp adpPort, SnmpPortEntity entity);
}

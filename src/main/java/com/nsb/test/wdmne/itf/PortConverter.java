package com.nsb.test.wdmne.itf;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 * adpPort: 转换后填写的Port
 * entity: 原始的entity
 */
public interface PortConverter {
    public boolean convert(AdpTp adpPort, SnmpPortEntity entity);
}

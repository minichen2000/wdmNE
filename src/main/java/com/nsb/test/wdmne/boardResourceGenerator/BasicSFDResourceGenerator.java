package com.nsb.test.wdmne.boardResourceGenerator;

import com.nsb.test.wdmne.converter.port.BasicSFDBoardPortConverter;
import com.nsb.test.wdmne.itf.BoardResourceGenerator;
import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.itf.XCGenerator;

/**
 * Created by minichen on 2017/1/9.
 */
public class BasicSFDResourceGenerator implements BoardResourceGenerator {
    public PortConverter getPortConverter() {
        return BasicSFDBoardPortConverter.getInstance();
    }

    public CTPGenerator getCTPGenerator() {
        return null;
    }

    public XCGenerator getXCGenerator() {
        return null;
    }
}

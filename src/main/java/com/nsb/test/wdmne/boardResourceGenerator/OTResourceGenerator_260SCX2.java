package com.nsb.test.wdmne.boardResourceGenerator;

import com.nsb.test.wdmne.converter.port.BasicOTBoardPortConverter;
import com.nsb.test.wdmne.converter.port.OTBoardPortConverter_260SCX2;
import com.nsb.test.wdmne.generator.ctp.BasicOTBoardCTPGenerator;
import com.nsb.test.wdmne.generator.ctp.OTBoardCTPGenerator_260SCX2;
import com.nsb.test.wdmne.itf.BoardResourceGenerator;
import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.itf.XCGenerator;

/**
 * Created by minichen on 2017/1/9.
 */
public class OTResourceGenerator_260SCX2 implements BoardResourceGenerator{
    public PortConverter getPortConverter() {
        return OTBoardPortConverter_260SCX2.getInstance();
    }

    public CTPGenerator getCTPGenerator() {
        return OTBoardCTPGenerator_260SCX2.getInstance();
    }

    public XCGenerator getXCGenerator() {
        return null;
    }
}

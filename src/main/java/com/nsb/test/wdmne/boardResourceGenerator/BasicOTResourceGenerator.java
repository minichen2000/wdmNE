package com.nsb.test.wdmne.boardResourceGenerator;

import com.nsb.test.wdmne.converter.port.BasicOTBoardPortConverter;
import com.nsb.test.wdmne.generator.ctp.BasicOTBoardCTPGenerator;
import com.nsb.test.wdmne.generator.xc.BasicOTBoardXCGenerator;
import com.nsb.test.wdmne.itf.BoardResourceGenerator;
import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.itf.XCGenerator;

/**
 * Created by minichen on 2017/1/9.
 */
public class BasicOTResourceGenerator implements BoardResourceGenerator {
    protected int clientODUjRate = 2;
    protected int lineODUkRate = 4;
    protected int lineODUjNumber = 10;

    private CTPGenerator ctpGenerator=null;

    public BasicOTResourceGenerator(int clientODUjRate, int lineODUkRate, int lineODUjNumber) {
        this.clientODUjRate = clientODUjRate;
        this.lineODUkRate = lineODUkRate;
        this.lineODUjNumber = lineODUjNumber;
    }

    public PortConverter getPortConverter() {
        return BasicOTBoardPortConverter.getInstance();
    }

    public CTPGenerator getCTPGenerator() {
        ctpGenerator= (null==ctpGenerator) ? new BasicOTBoardCTPGenerator(clientODUjRate, lineODUkRate, lineODUjNumber) : ctpGenerator;
        return ctpGenerator;
    }

    public XCGenerator getXCGenerator() {
        return new BasicOTBoardXCGenerator(clientODUjRate, lineODUkRate, lineODUjNumber);
    }
}

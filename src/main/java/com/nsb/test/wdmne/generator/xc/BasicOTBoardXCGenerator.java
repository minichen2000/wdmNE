package com.nsb.test.wdmne.generator.xc;

import com.nsb.test.wdmne.generator.ctp.BasicOTBoardClientCTPGenerator;
import com.nsb.test.wdmne.generator.ctp.BasicOTBoardLineCTPGenerator;
import com.nsb.test.wdmne.itf.AdpEquipment;
import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.itf.XCGenerator;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.AdpXC;
import com.nsb.test.wdmne.model.SnmpPortEntity;
import com.nsb.test.wdmne.util.PortConverterUtil;

import java.util.List;

/**
 * Created by minichen on 2017/1/8.
 */
public class BasicOTBoardXCGenerator implements XCGenerator {
    private int clientODUjRate = 2;
    private int lineODUkRate = 4;
    private int lineODUjNumber = 10;

    public BasicOTBoardXCGenerator(int clientODUjRate, int lineODUkRate, int lineODUjNumber) {
        this.clientODUjRate = clientODUjRate;
        this.lineODUkRate = lineODUkRate;
        this.lineODUjNumber = lineODUjNumber;
    }


    public List<AdpXC> generate(List<AdpTp> boardTPs) {
        //TODO: 为某个OT盘的所有TP生成lineODUjNumber个XC
        return null;
    }
}

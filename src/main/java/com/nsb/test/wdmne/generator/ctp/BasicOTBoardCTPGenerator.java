package com.nsb.test.wdmne.generator.ctp;

import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;
import com.nsb.test.wdmne.util.PortConverterUtil;

import java.util.List;

/**
 * Created by minichen on 2017/1/8.
 */
public class BasicOTBoardCTPGenerator implements CTPGenerator {
    private int clientODUjRate = 2;
    private int lineODUkRate = 4;
    private int lineODUjNumber = 10;

    public BasicOTBoardCTPGenerator(int clientODUjRate, int lineODUkRate, int lineODUjNumber) {
        this.clientODUjRate = clientODUjRate;
        this.lineODUkRate = lineODUkRate;
        this.lineODUjNumber = lineODUjNumber;
    }

    public List<AdpTp> generate(AdpTp adpPort, SnmpPortEntity entity) {
        //区分Client侧Port和Line侧Port，分别转换
        if (PortConverterUtil.isOTClientPort(entity)) {
            return BasicOTBoardClientCTPGenerator.getInstance().generate(clientODUjRate, adpPort, entity);
        } else if (PortConverterUtil.isOTLinePort(entity)) {
            return BasicOTBoardLineCTPGenerator.getInstance().generate(clientODUjRate, lineODUkRate, lineODUjNumber, adpPort, entity);
        } else {
            return null;
        }
    }
}

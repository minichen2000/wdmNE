package com.nsb.test.wdmne.generator.ctp;

import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;
import com.nsb.test.wdmne.util.PortConverterUtil;

import java.util.List;

/**
 * Created by minichen on 2017/1/8.
 */
public class OTBoardCTPGenerator_260SCX2 implements CTPGenerator {
    private static OTBoardCTPGenerator_260SCX2 instance = new OTBoardCTPGenerator_260SCX2();
    public static OTBoardCTPGenerator_260SCX2 getInstance() {
        return instance;
    }
    private OTBoardCTPGenerator_260SCX2() {
    }

    public List<AdpTp> generate(AdpTp adpPort, SnmpPortEntity entity) {
        //区分Client侧Port和Line侧Port，分别转换
        if (PortConverterUtil.isOTClientPort(entity)) {
            return BasicOTBoardClientCTPGenerator.getInstance().generate(4, adpPort, entity);
        } else if (PortConverterUtil.isOTLinePort(entity)) {
            return OTBoardLineCTPGenerator_260SCX2.getInstance().generate(adpPort, entity);
        } else {
            return null;
        }
    }
}

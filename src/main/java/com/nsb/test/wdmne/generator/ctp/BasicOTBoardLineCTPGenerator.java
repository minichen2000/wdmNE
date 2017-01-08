package com.nsb.test.wdmne.generator.ctp;

import com.nsb.test.wdmne.converter.ctp.*;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minichen on 2017/1/8.
 */
public class BasicOTBoardLineCTPGenerator {
    private static BasicOTBoardLineCTPGenerator instance = new BasicOTBoardLineCTPGenerator();
    public static BasicOTBoardLineCTPGenerator getInstance() {
        return instance;
    }
    private BasicOTBoardLineCTPGenerator() {
    }
    public List<AdpTp> generate(int clientODUjRate, int lineODUkRate, int lineODUjNumber, AdpTp adpPort, SnmpPortEntity entity) {
        List<AdpTp> rlt=new ArrayList<AdpTp>();
        AdpTp ctp=new AdpTp();
        BasicLineOCHCTPConverter.getInstance().convert(ctp, adpPort, entity);
        rlt.add(ctp);

        ctp=new AdpTp();
        BasicLineOTUkCTPConverter.getInstance().convert(lineODUkRate, ctp, adpPort,entity);
        rlt.add(ctp);

        ctp=new AdpTp();
        BasicLineODUkCTPConverter.getInstance().convert(lineODUkRate, ctp, adpPort,entity);
        rlt.add(ctp);

        for(int i=1;i<=lineODUjNumber;i++){
            ctp=new AdpTp();
            BasicLineODUjCTPConverter.getInstance().convert(lineODUkRate, clientODUjRate, i, ctp, adpPort,entity);
            rlt.add(ctp);
        }
        return rlt;

    }
}

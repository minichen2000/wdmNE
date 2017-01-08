package com.nsb.test.wdmne.generator.ctp;

import com.nsb.test.wdmne.converter.ctp.BasicLineOCHCTPConverter;
import com.nsb.test.wdmne.converter.ctp.BasicLineODUjCTPConverter;
import com.nsb.test.wdmne.converter.ctp.BasicLineODUkCTPConverter;
import com.nsb.test.wdmne.converter.ctp.BasicLineOTUkCTPConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minichen on 2017/1/8.
 */
public class OTBoardLineCTPGenerator_260SCX2 {
    private static OTBoardLineCTPGenerator_260SCX2 instance = new OTBoardLineCTPGenerator_260SCX2();
    public static OTBoardLineCTPGenerator_260SCX2 getInstance() {
        return instance;
    }
    private OTBoardLineCTPGenerator_260SCX2() {
    }
    public List<AdpTp> generate(AdpTp adpPort, SnmpPortEntity entity) {
        List<AdpTp> rlt=new ArrayList<AdpTp>();
        AdpTp ctp=new AdpTp();
        BasicLineOCHCTPConverter.getInstance().convert(ctp, adpPort, entity);
        rlt.add(ctp);

        //生成"/otu4=1"
        ctp=new AdpTp();
        //TODO: ...
        rlt.add(ctp);

        //生成"/otu4=2"
        ctp=new AdpTp();
        //TODO: ...
        rlt.add(ctp);

        //生成"/otu4=1/odu4=1"
        ctp=new AdpTp();
        //TODO: ...
        rlt.add(ctp);

        //生成"/otu4=2/odu4=1"
        ctp=new AdpTp();
        //TODO: ...
        rlt.add(ctp);

        return rlt;

    }
}

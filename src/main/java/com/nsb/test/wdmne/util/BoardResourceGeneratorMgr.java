package com.nsb.test.wdmne.util;

import com.nsb.test.wdmne.boardResourceGenerator.BasicOAResourceGenerator;
import com.nsb.test.wdmne.boardResourceGenerator.BasicOTResourceGenerator;
import com.nsb.test.wdmne.boardResourceGenerator.BasicSFDResourceGenerator;
import com.nsb.test.wdmne.boardResourceGenerator.OTResourceGenerator_260SCX2;
import com.nsb.test.wdmne.converter.port.BasicOABoardPortConverter;
import com.nsb.test.wdmne.converter.port.BasicOTBoardPortConverter;
import com.nsb.test.wdmne.converter.port.BasicSFDBoardPortConverter;
import com.nsb.test.wdmne.converter.port.OTBoardPortConverter_260SCX2;
import com.nsb.test.wdmne.itf.BoardResourceGenerator;
import com.nsb.test.wdmne.itf.PortConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minichen on 2017/1/5.
 */
public class BoardResourceGeneratorMgr {
    private static BoardResourceGeneratorMgr instance = new BoardResourceGeneratorMgr();

    public static BoardResourceGeneratorMgr getInstance() {
        return instance;
    }

    private Map<String, BoardResourceGenerator> generator=new HashMap<String, BoardResourceGenerator>();
    private BoardResourceGeneratorMgr() {
    }
    private void init(){

        BoardResourceGenerator ot_Client10Line1_100G=new BasicOTResourceGenerator(2,4,10);
        BoardResourceGenerator ot_260SCX2= new OTResourceGenerator_260SCX2();
        BoardResourceGenerator basicOAResourceGenerator=new BasicOAResourceGenerator();
        BoardResourceGenerator basicSFDResourceGenerator=new BasicSFDResourceGenerator();

        //TODO: 根据需要对不同盘放入相应的BoardResourceGenerator
        generator.put("130SNX10", ot_Client10Line1_100G);
        generator.put("130SCX10", ot_Client10Line1_100G);
        generator.put("260SCX2", ot_260SCX2);
        generator.put("SFD44", basicSFDResourceGenerator);
        generator.put("SFD44B", basicSFDResourceGenerator);
        generator.put("SFD40", basicSFDResourceGenerator);
        generator.put("SFD40B", basicSFDResourceGenerator);
        generator.put("AHPHG", basicOAResourceGenerator);

        //...
    }

    public BoardResourceGenerator getGenerator(String boardType){
        return generator.get(boardType);
    }
}

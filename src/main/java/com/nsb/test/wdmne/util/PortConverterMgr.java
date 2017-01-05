package com.nsb.test.wdmne.util;

import com.nsb.test.wdmne.converter.BasicOABoardPortConverter;
import com.nsb.test.wdmne.converter.BasicOTBoardPortConverter;
import com.nsb.test.wdmne.converter.BasicSFDBoardPortConverter;
import com.nsb.test.wdmne.converter.OTBoardPortConverter_260SCX2;
import com.nsb.test.wdmne.itf.PortConverter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minichen on 2017/1/5.
 */
public class PortConverterMgr {
    private static PortConverterMgr ourInstance = new PortConverterMgr();

    public static PortConverterMgr getInstance() {
        return ourInstance;
    }

    private Map<String, PortConverter> converters=new HashMap<String, PortConverter>();
    private PortConverterMgr() {
    }
    private void init(){

        PortConverter basicOTBoardPortConverter=new BasicOTBoardPortConverter();
        PortConverter oTBoardPortConverter_260SCX2=new OTBoardPortConverter_260SCX2();
        PortConverter basicOABoardPortConverter=new BasicOABoardPortConverter();
        PortConverter basicSFDBoardPortConverter=new BasicSFDBoardPortConverter();

        //TODO: 根据需要对不同盘放入相应的BoardPortConverter
        converters.put("130SNX10", basicOTBoardPortConverter);
        converters.put("130SCX10", basicOTBoardPortConverter);
        converters.put("260SCX2", oTBoardPortConverter_260SCX2);
        converters.put("SFD44", basicSFDBoardPortConverter);
        converters.put("SFD44B", basicSFDBoardPortConverter);
        converters.put("SFD40", basicSFDBoardPortConverter);
        converters.put("SFD40B", basicSFDBoardPortConverter);
        converters.put("AHPHG", basicOABoardPortConverter);

        //...
    }

    public PortConverter getConverter(String boardType){
        return converters.get(boardType);
    }
}

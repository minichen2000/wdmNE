package com.nsb.test.wdmne.com.nsb.test.wdmne.util;

import com.nsb.test.wdmne.model.SnmpPortEntity;

/**
 * Created by minichen on 2017/1/5.
 */
public class PortConverterUtil {
    static public boolean isOTClientPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-C[x]");
        return true;
    }
    static public boolean isOTLinePort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-L[x]");
        return true;
    }
    static public boolean isSFDChannelPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-<numbers>");
        return true;
    }
    static public boolean isSFDOMDPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-OMD");
        return true;
    }
    static public boolean isOASIGPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-SIG");
        return true;
    }
    static public boolean isOALINEPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-LINE");
        return true;
    }
    static public boolean isOADCMPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-DCM");
        return true;
    }
    static public boolean isOAOSCPort(SnmpPortEntity entity){
        //TODO: entity.nativeName.match("...-OSC");
        return true;
    }
}

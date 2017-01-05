package com.nsb.test.wdmne.model;

/**
 * Created by minichen on 2017/1/5.
 * 这个类是我们通过snmp从NE上取到的所有Port的第一手信息，是所有Port的原始信息全集。
 * 在该类中只用固定转换出ifIndex, boardType, nativeName等最基本的几个固定信息以备后用，
 * 其它的所有属性都可按snmp表中属性名称命名，值在这里不用转换，具体的转换放到各种Converter中做。
 */
public class SnmpPortEntity {
    private String ifIndex;
    private String boardType; //如："260SCX2"
    private String nativeName; //如："260SCX2-1-2-C1"
    //TODO:其它所有原始属性，按snmp表中属性命名即可
    //...
    //...


    public String getIfIndex() {
        return ifIndex;
    }

    public String getBoardType() {
        return boardType;
    }

    public String getNativeName() {
        return nativeName;
    }
}

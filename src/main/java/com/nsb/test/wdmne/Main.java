package com.nsb.test.wdmne;

import com.nsb.test.wdmne.itf.BoardResourceGenerator;
import com.nsb.test.wdmne.itf.CTPGenerator;
import com.nsb.test.wdmne.itf.XCGenerator;
import com.nsb.test.wdmne.util.BoardResourceGeneratorMgr;
import com.nsb.test.wdmne.itf.PortConverter;
import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.SnmpPortEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minichen on 2017/1/5.
 */
public class Main {
    public static void main(String[] argv){

        //TODO:假设我们已经从下层snmp得到了所有Port的SnmpPortEntity列表
        //...
        List<SnmpPortEntity> entities=new ArrayList<SnmpPortEntity>();
        generateAllPortsAndCTPs(entities);
        generateAllXCs();


    }
    private static void generateAllPortsAndCTPs(List<SnmpPortEntity> entities){
        AdpTp port;
        BoardResourceGenerator g;
        PortConverter portConverter;
        CTPGenerator ctpGenerator;
        XCGenerator xcGenerator;
        for(SnmpPortEntity entity : entities){
            g= BoardResourceGeneratorMgr.getInstance().getGenerator(entity.getBoardType());
            if(null!=g){
                port=new AdpTp();
                boolean rlt=g.getPortConverter().convert(port, entity);
                if(rlt) {
                    //TODO: port写入DB
                    ctpGenerator=g.getCTPGenerator();
                    if(null!=ctpGenerator){
                        List<AdpTp> ctps=ctpGenerator.generate(port, entity);
                        //TODO: ctps写入DB
                    }
                }else{
                    //TODO:记录日志
                }
            }else{
                //TODO:记录日志
            }
        }
    }
    private static void generateAllXCs(){
        //TODO: 为所有盘按盘生成xc
        //0. 从DB取出所有盘
            //1. 从DB取出该盘的所有TP
            //2. BoardResourceGeneratorMgr.getInstance().getGenerator(entity.getBoardType()).getXCGenerator().generate();
    }
}

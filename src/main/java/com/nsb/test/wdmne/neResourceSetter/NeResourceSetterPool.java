package com.nsb.test.wdmne.neResourceSetter;

import com.nsb.test.wdmne.business.equ.EquSetter_cardFunctionalMode;
import com.nsb.test.wdmne.business.tp.TpSetter_adminState;
import com.nsb.test.wdmne.business.tp.TpSetter_connectedToFromExt;
import com.nsb.test.wdmne.business.tp.TpSetter_connectedToFromInt;
import com.nsb.test.wdmne.business.tp.TpSetter_signalRate;
import com.nsb.test.wdmne.itf.NeResourceSetter.NeResourceSetterMgr;
import com.nsb.test.wdmne.model.AdpEquipment;
import com.nsb.test.wdmne.model.AdpTp;

/**
 * Created by minichen on 2017/1/12.
 */
public class NeResourceSetterPool {

    private static NeResourceSetterPool instance = new NeResourceSetterPool();

    private NeResourceSetterMgr<AdpEquipment> equSetterMgr=new DefaultNeResourceSetterMgr<AdpEquipment>();
    private NeResourceSetterMgr<AdpTp> tpSetterMgr=new DefaultNeResourceSetterMgr<AdpTp>();

    public static NeResourceSetterPool getInstance() {
        return instance;
    }

    private NeResourceSetterPool() {
        init();
    }
    public NeResourceSetterMgr<AdpEquipment> getEquSetterMgr() {
        return equSetterMgr;
    }

    public NeResourceSetterMgr<AdpTp> getTpSetterMgr() {
        return tpSetterMgr;
    }

    private void init(){
        //TODO: init equSetterMgr:
        equSetterMgr.registerSetter(new EquSetter_cardFunctionalMode());
        //...


        //TODO: init equSetterMgr:
        tpSetterMgr.registerSetter(new TpSetter_adminState());
        tpSetterMgr.registerSetter(new TpSetter_connectedToFromExt());
        tpSetterMgr.registerSetter(new TpSetter_connectedToFromInt());
        tpSetterMgr.registerSetter(new TpSetter_signalRate());


    }
}

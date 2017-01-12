package com.nsb.test.wdmne.neResourceSetter;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.util.AdpKVPairList;
import com.nsb.test.wdmne.util.Utils;

/**
 * Created by minichen on 2017/1/12.
 */
public class Main {
    public static void main(String[] argv) {

    }

    public void updateTp(String neid, String tpid, AdpKVPairList attrs) {
        AdpTp rlt = NeResourceSetterPool.getInstance().getTpSetterMgr().set(neid, tpid, Utils.kvPairList2Map(attrs));
    }
}

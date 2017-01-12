package com.nsb.test.wdmne.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minichen on 2017/1/12.
 */
public class Utils {
    static public Map<String, Object> kvPairList2Map(AdpKVPairList list){
        Map<String, Object> rlt=new HashMap<String, Object>();
        for(AdpKVPair<String, String> p : list.getData()){
            rlt.put(p.key, p.value);
        }
        return rlt;
    }
}

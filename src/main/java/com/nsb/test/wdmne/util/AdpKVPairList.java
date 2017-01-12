package com.nsb.test.wdmne.util;

import java.util.List;

/**
 * Created by minichen on 2017/1/12.
 */
public class AdpKVPairList {
    private List<AdpKVPair<String, String>> data;

    public AdpKVPairList(List<AdpKVPair<String, String>> data) {
        this.data = data;
    }

    public List<AdpKVPair<String, String>> getData() {
        return data;
    }
}

package com.nsb.test.wdmne.itf;

import com.nsb.test.wdmne.model.AdpTp;
import com.nsb.test.wdmne.model.AdpXC;

import java.util.List;

/**
 * Created by minichen on 2017/1/9.
 */
public interface XCGenerator {
    public List<AdpXC> generate(List<AdpTp> boardTPs);
}

package com.nsb.test.wdmne.neResourceSetter;

import com.nsb.test.wdmne.itf.NeResourceSetter.NeResourceSetter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by minichen on 2017/1/12.
 */
public abstract class AbstractNeResourceSetter<T> implements NeResourceSetter<T> {
    protected Set<String> attrNameSet =new HashSet<String>();
    public Set<String> getAttrNameSet() {
        return attrNameSet;
    }
}

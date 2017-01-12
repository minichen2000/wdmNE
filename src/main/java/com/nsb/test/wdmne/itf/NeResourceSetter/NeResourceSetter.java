package com.nsb.test.wdmne.itf.NeResourceSetter;

import com.nsb.test.wdmne.model.AdpNe;

import java.util.Map;
import java.util.Set;

/**
 * Created by minichen on 2017/1/12.
 */
public interface NeResourceSetter<T> {
    /*
    返回该setter能处理的属性名称列表
     */
    public Set<String> getAttrNameSet();

    /*
    返回该setter是否能处理这个资源。常用在有些setter专门为某个型号网元，或某类型号板卡，甚至某类TP所设计的情况。
     */
    public boolean canProcess(AdpNe ne, T resource);

    /*
    设置
     */
    public T set(AdpNe ne, T resource, Map<String, Object> attrs);
}

package com.nsb.test.wdmne.itf.NeResourceSetter;

import com.nsb.test.wdmne.model.AdpNe;

import java.util.Map;
import java.util.Set;

/**
 * Created by minichen on 2017/1/12.
 */
public interface NeResourceSetterMgr<T> {

    public void registerSetter(NeResourceSetter<T> setter);
    public boolean matchAttrNameSet(Set<String> attrNames, Map<String, Object> attrs);
    public AdpNe findNe(String neId);
    public T findResource(String neId, String resrouceId);
    public T set(String neId, String resourceId, Map<String, Object> attrs);

}

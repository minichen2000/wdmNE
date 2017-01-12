package com.nsb.test.wdmne.neResourceSetter;

import com.nsb.test.wdmne.itf.NeResourceSetter.NeResourceSetter;
import com.nsb.test.wdmne.itf.NeResourceSetter.NeResourceSetterMgr;
import com.nsb.test.wdmne.model.AdpNe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by minichen on 2017/1/12.
 */
public class DefaultNeResourceSetterMgr<T> implements NeResourceSetterMgr<T> {
    protected List<NeResourceSetter<T>> setters=new ArrayList<NeResourceSetter<T>>();

    public void registerSetter(NeResourceSetter<T> setter) {
        setters.add(setter);
    }

    public boolean matchAttrNameSet(Set<String> attrNames, Map<String, Object> attrs) {
        return attrNames.size()==attrs.size() && attrs.keySet()==attrNames;
    }
    public AdpNe findNe(String neId) {
        return null;
    }

    public T findResource(String neId, String resrouceId) {
        return null;
    }
    public T set(String neId, String resourceId, Map<String, Object> attrs) {
        for(NeResourceSetter<T> s : setters){
            if(matchAttrNameSet(s.getAttrNameSet(), attrs)){
                AdpNe ne=findNe(neId);
                T resource=findResource(neId, resourceId);
                if(null==ne || null==resource){
                    return null;
                }else if(s.canProcess(ne, resource)){
                    return s.set(ne, resource, attrs);
                }
            }
        }
        return null;
    }


}

package com.peony.demo.config.core.field.impl;

import com.peony.demo.config.core.field.MapField;
import com.peony.demo.config.core.SplitUtil;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class IntStrMapField extends MapField<Map<Integer,String>> {

    public IntStrMapField() {
        super("map<int,string>", "ImmutableMap<Integer,String>", "ImmutableMap.copyOf(new LinkedHashMap<>())");
    }

    @Override
    public Map<Integer,String> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return ImmutableMap.copyOf(SplitUtil.convertContentToMap(rawVal.trim(), Integer.class, String.class));
    }
}

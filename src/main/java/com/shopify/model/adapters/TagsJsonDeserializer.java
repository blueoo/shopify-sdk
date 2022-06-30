package com.shopify.model.adapters;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @CLassname TagsJsonAdapter
 * @Description TODO
 * @Author blueo
 * @Date 2022/6/30 9:56
 */
public class TagsJsonDeserializer extends StdConverter<String, Set<String>> {
    @Override
    public Set<String> convert(String s) {
        String[] tagsArr = s.split(", ");
        return new HashSet<>(Arrays.asList(tagsArr));
    }
}

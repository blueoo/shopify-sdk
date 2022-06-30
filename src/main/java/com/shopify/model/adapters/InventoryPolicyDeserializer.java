package com.shopify.model.adapters;

import com.fasterxml.jackson.databind.util.StdConverter;
import com.shopify.model.InventoryPolicy;

/**
 * @CLassname InventoryPolicyDeserializer
 * @Description TODO
 * @Author blueo
 * @Date 2022/6/30 11:03
 */
public class InventoryPolicyDeserializer extends StdConverter<String, InventoryPolicy> {
    @Override
    public InventoryPolicy convert(String inventoryPolicy) {
        return InventoryPolicy.toEnum(inventoryPolicy);
    }
}

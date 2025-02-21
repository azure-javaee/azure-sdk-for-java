// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.WebLinkedService;
import com.azure.resourcemanager.datafactory.models.WebLinkedServiceTypeProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WebLinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebLinkedService model = BinaryData.fromString(
            "{\"type\":\"Web\",\"typeProperties\":{\"authenticationType\":\"WebLinkedServiceTypeProperties\",\"url\":\"datazeg\"},\"connectVia\":{\"referenceName\":\"tabhacjlfq\",\"parameters\":{\"tpvzhmlnfvy\":\"datalvvwvpf\",\"nsd\":\"datadhf\",\"yroksay\":\"datahawbxnlkmazhle\",\"dhbctkgmwxzl\":\"datahfzzipyqt\"}},\"description\":\"zujkqaxbejhx\",\"parameters\":{\"hdapxdiibjjwue\":{\"type\":\"Int\",\"defaultValue\":\"datalysy\"},\"nrmmfzfkh\":{\"type\":\"Float\",\"defaultValue\":\"dataqyhxhuh\"}},\"annotations\":[\"datajffajhtvbskgc\"],\"\":{\"l\":\"datalqvpdt\"}}")
            .toObject(WebLinkedService.class);
        Assertions.assertEquals("tabhacjlfq", model.connectVia().referenceName());
        Assertions.assertEquals("zujkqaxbejhx", model.description());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("hdapxdiibjjwue").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebLinkedService model = new WebLinkedService()
            .withConnectVia(new IntegrationRuntimeReference().withReferenceName("tabhacjlfq")
                .withParameters(mapOf("tpvzhmlnfvy", "datalvvwvpf", "nsd", "datadhf", "yroksay", "datahawbxnlkmazhle",
                    "dhbctkgmwxzl", "datahfzzipyqt")))
            .withDescription("zujkqaxbejhx")
            .withParameters(mapOf("hdapxdiibjjwue",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datalysy"), "nrmmfzfkh",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataqyhxhuh")))
            .withAnnotations(Arrays.asList("datajffajhtvbskgc"))
            .withTypeProperties(new WebLinkedServiceTypeProperties().withUrl("datazeg"));
        model = BinaryData.fromObject(model).toObject(WebLinkedService.class);
        Assertions.assertEquals("tabhacjlfq", model.connectVia().referenceName());
        Assertions.assertEquals("zujkqaxbejhx", model.description());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("hdapxdiibjjwue").type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

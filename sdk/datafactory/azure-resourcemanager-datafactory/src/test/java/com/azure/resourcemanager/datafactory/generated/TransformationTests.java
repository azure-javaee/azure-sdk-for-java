// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.Transformation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TransformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Transformation model = BinaryData.fromString(
            "{\"name\":\"xxtclhuulri\",\"description\":\"yokvjgbzsxebr\",\"dataset\":{\"referenceName\":\"ttfyhcdjwsuoard\",\"parameters\":{\"bfwxiplkys\":\"datattpufpbpgnrholhu\",\"yjprxslw\":\"datal\",\"hfvhuwzbxpcqz\":\"datadmcvhtbbz\",\"lrrskap\":\"dataihotjecohmxv\"}},\"linkedService\":{\"referenceName\":\"wie\",\"parameters\":{\"imyc\":\"datayaderltfokyks\",\"rsejegprkj\":\"datagrvkcxzznnuif\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"rjmwvvbtuqkxxi\",\"datasetParameters\":\"datagxql\",\"parameters\":{\"vjaqu\":\"dataotjgxieqfkyfhi\"},\"\":{\"mj\":\"dataynvskpajbmgeume\",\"apeqiscrpil\":\"dataxcbccwkqmt\"}}}")
            .toObject(Transformation.class);
        Assertions.assertEquals("xxtclhuulri", model.name());
        Assertions.assertEquals("yokvjgbzsxebr", model.description());
        Assertions.assertEquals("ttfyhcdjwsuoard", model.dataset().referenceName());
        Assertions.assertEquals("wie", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("rjmwvvbtuqkxxi", model.flowlet().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Transformation model = new Transformation().withName("xxtclhuulri").withDescription("yokvjgbzsxebr")
            .withDataset(new DatasetReference().withReferenceName("ttfyhcdjwsuoard")
                .withParameters(mapOf("bfwxiplkys", "datattpufpbpgnrholhu", "yjprxslw", "datal", "hfvhuwzbxpcqz",
                    "datadmcvhtbbz", "lrrskap", "dataihotjecohmxv")))
            .withLinkedService(new LinkedServiceReference().withReferenceName("wie")
                .withParameters(mapOf("imyc", "datayaderltfokyks", "rsejegprkj", "datagrvkcxzznnuif")))
            .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                .withReferenceName("rjmwvvbtuqkxxi").withDatasetParameters("datagxql")
                .withParameters(mapOf("vjaqu", "dataotjgxieqfkyfhi")).withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(Transformation.class);
        Assertions.assertEquals("xxtclhuulri", model.name());
        Assertions.assertEquals("yokvjgbzsxebr", model.description());
        Assertions.assertEquals("ttfyhcdjwsuoard", model.dataset().referenceName());
        Assertions.assertEquals("wie", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("rjmwvvbtuqkxxi", model.flowlet().referenceName());
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

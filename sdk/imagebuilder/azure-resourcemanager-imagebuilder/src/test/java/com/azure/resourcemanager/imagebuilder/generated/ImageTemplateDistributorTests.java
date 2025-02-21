// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplateDistributor;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplateDistributorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplateDistributor model =
            BinaryData
                .fromString(
                    "{\"type\":\"ImageTemplateDistributor\",\"runOutputName\":\"zfsinzgvf\",\"artifactTags\":{\"xjtfelluwfzit\":\"wzo\",\"qfpjk\":\"np\",\"nmayhuybb\":\"lxofpdvhpfxxypin\",\"inuvamiheogn\":\"podepoo\"}}")
                .toObject(ImageTemplateDistributor.class);
        Assertions.assertEquals("zfsinzgvf", model.runOutputName());
        Assertions.assertEquals("wzo", model.artifactTags().get("xjtfelluwfzit"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplateDistributor model =
            new ImageTemplateDistributor()
                .withRunOutputName("zfsinzgvf")
                .withArtifactTags(
                    mapOf(
                        "xjtfelluwfzit",
                        "wzo",
                        "qfpjk",
                        "np",
                        "nmayhuybb",
                        "lxofpdvhpfxxypin",
                        "inuvamiheogn",
                        "podepoo"));
        model = BinaryData.fromObject(model).toObject(ImageTemplateDistributor.class);
        Assertions.assertEquals("zfsinzgvf", model.runOutputName());
        Assertions.assertEquals("wzo", model.artifactTags().get("xjtfelluwfzit"));
    }

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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CustomActivityReferenceObject;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomActivityReferenceObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomActivityReferenceObject model = BinaryData.fromString(
            "{\"linkedServices\":[{\"referenceName\":\"ufjfordzwbskfex\",\"parameters\":{\"jzliaqpmowlsrxy\":\"datajwf\",\"pqlonz\":\"dataevzqxpmfheht\",\"qqrmck\":\"datahylzzu\",\"sueutby\":\"datam\"}},{\"referenceName\":\"lzgkzhbnbnjpie\",\"parameters\":{\"hsuhkik\":\"dataivsiwws\",\"znmj\":\"datauvpcjyh\"}},{\"referenceName\":\"anrirrnqloomsy\",\"parameters\":{\"kapgdvknquipi\":\"dataga\",\"y\":\"datagvfchzcp\",\"wzpf\":\"datazbo\"}},{\"referenceName\":\"kslvbrxlsbglbf\",\"parameters\":{\"dbhcfswpdarvca\":\"dataiirneop\",\"xucgvz\":\"datasmr\",\"jd\":\"datawvmhbizi\",\"sfyxdfeqrnawnqya\":\"dataeexdboat\"}}],\"datasets\":[{\"referenceName\":\"acojcaraxorqjb\",\"parameters\":{\"tn\":\"datagxogqvwchynr\",\"qvcjspj\":\"dataptwmawypkpbmid\",\"l\":\"datamtsgvvizaygtb\",\"ijpayvlnzwicqopw\":\"datayycgzvqpnjqpwxfk\"}},{\"referenceName\":\"bdleegwlhanyueiz\",\"parameters\":{\"mxbghxiotlf\":\"dataj\",\"icoaysargqkgaus\":\"databjsvuqkbs\",\"lkxvfejdgoj\":\"dataugdyfyjeex\",\"yyyo\":\"datavqezekkv\"}},{\"referenceName\":\"jpsmnxccasuh\",\"parameters\":{\"fhfjf\":\"datahmkqyfatdd\"}},{\"referenceName\":\"to\",\"parameters\":{\"nmxzu\":\"datawzkxaglwdntj\"}}]}")
            .toObject(CustomActivityReferenceObject.class);
        Assertions.assertEquals("ufjfordzwbskfex", model.linkedServices().get(0).referenceName());
        Assertions.assertEquals("acojcaraxorqjb", model.datasets().get(0).referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomActivityReferenceObject model = new CustomActivityReferenceObject()
            .withLinkedServices(Arrays.asList(
                new LinkedServiceReference().withReferenceName("ufjfordzwbskfex")
                    .withParameters(mapOf("jzliaqpmowlsrxy", "datajwf", "pqlonz", "dataevzqxpmfheht", "qqrmck",
                        "datahylzzu", "sueutby", "datam")),
                new LinkedServiceReference().withReferenceName("lzgkzhbnbnjpie")
                    .withParameters(mapOf("hsuhkik", "dataivsiwws", "znmj", "datauvpcjyh")),
                new LinkedServiceReference().withReferenceName("anrirrnqloomsy")
                    .withParameters(mapOf("kapgdvknquipi", "dataga", "y", "datagvfchzcp", "wzpf", "datazbo")),
                new LinkedServiceReference().withReferenceName("kslvbrxlsbglbf")
                    .withParameters(mapOf("dbhcfswpdarvca", "dataiirneop", "xucgvz", "datasmr", "jd", "datawvmhbizi",
                        "sfyxdfeqrnawnqya", "dataeexdboat"))))
            .withDatasets(Arrays.asList(
                new DatasetReference().withReferenceName("acojcaraxorqjb")
                    .withParameters(mapOf("tn", "datagxogqvwchynr", "qvcjspj", "dataptwmawypkpbmid", "l",
                        "datamtsgvvizaygtb", "ijpayvlnzwicqopw", "datayycgzvqpnjqpwxfk")),
                new DatasetReference().withReferenceName("bdleegwlhanyueiz")
                    .withParameters(mapOf("mxbghxiotlf", "dataj", "icoaysargqkgaus", "databjsvuqkbs", "lkxvfejdgoj",
                        "dataugdyfyjeex", "yyyo", "datavqezekkv")),
                new DatasetReference().withReferenceName("jpsmnxccasuh")
                    .withParameters(mapOf("fhfjf", "datahmkqyfatdd")),
                new DatasetReference().withReferenceName("to").withParameters(mapOf("nmxzu", "datawzkxaglwdntj"))));
        model = BinaryData.fromObject(model).toObject(CustomActivityReferenceObject.class);
        Assertions.assertEquals("ufjfordzwbskfex", model.linkedServices().get(0).referenceName());
        Assertions.assertEquals("acojcaraxorqjb", model.datasets().get(0).referenceName());
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

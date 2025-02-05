// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.CloudExadataInfrastructureInner;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructureListResult;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructureProperties;
import com.azure.resourcemanager.oracledatabase.models.CustomerContact;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeek;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekName;
import com.azure.resourcemanager.oracledatabase.models.MaintenanceWindow;
import com.azure.resourcemanager.oracledatabase.models.Month;
import com.azure.resourcemanager.oracledatabase.models.MonthName;
import com.azure.resourcemanager.oracledatabase.models.PatchingMode;
import com.azure.resourcemanager.oracledatabase.models.Preference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CloudExadataInfrastructureListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudExadataInfrastructureListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"ocid\":\"vtz\",\"computeCount\":1277339929,\"storageCount\":77118274,\"totalStorageSizeInGbs\":1861825815,\"availableStorageSizeInGbs\":698311711,\"timeCreated\":\"xqeofjaeqjhqjba\",\"lifecycleDetails\":\"msmjqulngsntn\",\"maintenanceWindow\":{\"preference\":\"CustomPreference\",\"months\":[{\"name\":\"September\"}],\"weeksOfMonth\":[2115498043,306155012,1161449621],\"daysOfWeek\":[{\"name\":\"Tuesday\"},{\"name\":\"Tuesday\"},{\"name\":\"Sunday\"},{\"name\":\"Monday\"}],\"hoursOfDay\":[947497777,890604952,3133273],\"leadTimeInWeeks\":1214814852,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":422670277,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":1343054120,\"estimatedNetworkSwitchesPatchingTime\":1034535063,\"estimatedStorageServerPatchingTime\":2077137838,\"totalEstimatedPatchingTime\":1299495603},\"customerContacts\":[{\"email\":\"ksqrglssai\"},{\"email\":\"qpjwnzlljfm\"}],\"provisioningState\":\"Canceled\",\"lifecycleState\":\"Terminated\",\"shape\":\"vmgxsab\",\"ociUrl\":\"qduujitcjczdz\",\"cpuCount\":1471497811,\"maxCpuCount\":700767866,\"memorySizeInGbs\":2049933545,\"maxMemoryInGbs\":1632911740,\"dbNodeStorageSizeInGbs\":881924894,\"maxDbNodeStorageSizeInGbs\":176871010,\"dataStorageSizeInTbs\":43.592224361707366,\"maxDataStorageInTbs\":55.89189866671263,\"dbServerVersion\":\"rwjfe\",\"storageServerVersion\":\"nhutjeltmrldhugj\",\"activatedStorageCount\":1346954674,\"additionalStorageCount\":797371044,\"displayName\":\"qxhocdgeablgphut\",\"lastMaintenanceRunId\":\"ndv\",\"nextMaintenanceRunId\":\"ozwyiftyhxhuro\",\"monthlyDbServerVersion\":\"tyxolniwpwc\",\"monthlyStorageServerVersion\":\"jfkgiawxk\"},\"zones\":[\"ypl\",\"ckbasyypndd\",\"sgcbac\",\"hejkotynqgou\"],\"location\":\"ndlik\",\"tags\":{\"bmadgak\":\"kgfg\",\"ytb\":\"qsrxybzqqed\",\"modmglougpb\":\"iqfouflmmnkz\"},\"id\":\"wtmutduq\",\"name\":\"ta\",\"type\":\"spwgcuertumkdosv\"},{\"properties\":{\"ocid\":\"bmdg\",\"computeCount\":398280406,\"storageCount\":1089342550,\"totalStorageSizeInGbs\":763703494,\"availableStorageSizeInGbs\":1359237516,\"timeCreated\":\"bexppb\",\"lifecycleDetails\":\"q\",\"maintenanceWindow\":{\"preference\":\"NoPreference\",\"months\":[{\"name\":\"October\"}],\"weeksOfMonth\":[1189352281],\"daysOfWeek\":[{\"name\":\"Wednesday\"},{\"name\":\"Wednesday\"}],\"hoursOfDay\":[1529578070,1939362977,596871405,2069230951],\"leadTimeInWeeks\":1739804762,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":243879376,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":1951867342,\"estimatedNetworkSwitchesPatchingTime\":239046622,\"estimatedStorageServerPatchingTime\":1167970761,\"totalEstimatedPatchingTime\":1846063928},\"customerContacts\":[{\"email\":\"s\"},{\"email\":\"l\"},{\"email\":\"juvf\"}],\"provisioningState\":\"Canceled\",\"lifecycleState\":\"Updating\",\"shape\":\"yxwjkcp\",\"ociUrl\":\"nwbxgjvtbvpyssz\",\"cpuCount\":1214648475,\"maxCpuCount\":308759192,\"memorySizeInGbs\":718700797,\"maxMemoryInGbs\":1493631585,\"dbNodeStorageSizeInGbs\":931696713,\"maxDbNodeStorageSizeInGbs\":2108357605,\"dataStorageSizeInTbs\":2.3996292155411103,\"maxDataStorageInTbs\":57.60858367831252,\"dbServerVersion\":\"bngui\",\"storageServerVersion\":\"wu\",\"activatedStorageCount\":1403075438,\"additionalStorageCount\":1608878856,\"displayName\":\"x\",\"lastMaintenanceRunId\":\"izuckyfihrfidfvz\",\"nextMaintenanceRunId\":\"zuhtymwisdkfthwx\",\"monthlyDbServerVersion\":\"t\",\"monthlyStorageServerVersion\":\"waopvkmijcmmxd\"},\"zones\":[\"fufsrpymzi\",\"nsez\"],\"location\":\"tbzsgfyccs\",\"tags\":{\"flnrosfqpteehzz\":\"mdwzjeiachboo\",\"swjdkirso\":\"ypyqrimzinp\",\"soifiyipjxsqw\":\"dqxhcrmnohjtckwh\",\"bznorcjxvsnby\":\"gr\"},\"id\":\"qabnmoc\",\"name\":\"cyshurzafbljjgp\",\"type\":\"toqcjmklja\"},{\"properties\":{\"ocid\":\"idtqajzyu\",\"computeCount\":331087178,\"storageCount\":377543492,\"totalStorageSizeInGbs\":963090330,\"availableStorageSizeInGbs\":1185115759,\"timeCreated\":\"hbzhfepg\",\"lifecycleDetails\":\"qex\",\"maintenanceWindow\":{\"preference\":\"NoPreference\",\"months\":[{\"name\":\"September\"},{\"name\":\"November\"}],\"weeksOfMonth\":[812550328,1450066184,2010275395,1382197714],\"daysOfWeek\":[{\"name\":\"Sunday\"},{\"name\":\"Wednesday\"}],\"hoursOfDay\":[411376072,1936652093,187934940],\"leadTimeInWeeks\":269185067,\"patchingMode\":\"Rolling\",\"customActionTimeoutInMins\":865429737,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":1399700283,\"estimatedNetworkSwitchesPatchingTime\":515992017,\"estimatedStorageServerPatchingTime\":397818750,\"totalEstimatedPatchingTime\":54322845},\"customerContacts\":[{\"email\":\"ionpimexg\"},{\"email\":\"txgcpodgmaajr\"},{\"email\":\"vdjwzrlovm\"},{\"email\":\"lwhijcoejctbzaq\"}],\"provisioningState\":\"Failed\",\"lifecycleState\":\"Terminating\",\"shape\":\"bkbfkgukdkex\",\"ociUrl\":\"pofm\",\"cpuCount\":159547648,\"maxCpuCount\":1757077121,\"memorySizeInGbs\":396023335,\"maxMemoryInGbs\":584739156,\"dbNodeStorageSizeInGbs\":681879854,\"maxDbNodeStorageSizeInGbs\":263932996,\"dataStorageSizeInTbs\":5.0590045107127395,\"maxDataStorageInTbs\":80.35546922641568,\"dbServerVersion\":\"o\",\"storageServerVersion\":\"xhdzxibqeojnx\",\"activatedStorageCount\":2010157167,\"additionalStorageCount\":119552386,\"displayName\":\"dntwndeicbtw\",\"lastMaintenanceRunId\":\"zao\",\"nextMaintenanceRunId\":\"uhrhcffcyddgl\",\"monthlyDbServerVersion\":\"t\",\"monthlyStorageServerVersion\":\"qkwpyeicxmqc\"},\"zones\":[\"q\",\"hkh\",\"xuigdtopbobj\",\"ghmewuam\"],\"location\":\"hrzayvvtpgvdf\",\"tags\":{\"efgugnxk\":\"tkftutqxlngx\",\"hjybigehoqfbo\":\"xdqmidtthzrvqdra\",\"zlcuiywgqywgndrv\":\"skanyk\",\"ocpecfvmmco\":\"nhzgpphrcgyn\"},\"id\":\"fsxlzevgbmqjqa\",\"name\":\"c\",\"type\":\"pmivkwlzu\"},{\"properties\":{\"ocid\":\"fwnfnb\",\"computeCount\":1187016173,\"storageCount\":2055969856,\"totalStorageSizeInGbs\":198217735,\"availableStorageSizeInGbs\":1067067753,\"timeCreated\":\"etqgtzxdpnq\",\"lifecycleDetails\":\"qwxrjfeallnw\",\"maintenanceWindow\":{\"preference\":\"CustomPreference\",\"months\":[{\"name\":\"April\"},{\"name\":\"February\"}],\"weeksOfMonth\":[572259851],\"daysOfWeek\":[{\"name\":\"Sunday\"},{\"name\":\"Tuesday\"},{\"name\":\"Sunday\"}],\"hoursOfDay\":[611724458,431293436,903748281,1019249185],\"leadTimeInWeeks\":2024300309,\"patchingMode\":\"Rolling\",\"customActionTimeoutInMins\":804356907,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":1222004699,\"estimatedNetworkSwitchesPatchingTime\":678653750,\"estimatedStorageServerPatchingTime\":1098577091,\"totalEstimatedPatchingTime\":635672501},\"customerContacts\":[{\"email\":\"ipheoflokeyyien\"},{\"email\":\"bdlwtgrhpdjpj\"},{\"email\":\"masxazjpqyegu\"},{\"email\":\"lhbxxhejjzzvdud\"}],\"provisioningState\":\"Canceled\",\"lifecycleState\":\"Provisioning\",\"shape\":\"fhotw\",\"ociUrl\":\"ynpwlbj\",\"cpuCount\":34788734,\"maxCpuCount\":1690822953,\"memorySizeInGbs\":1625524147,\"maxMemoryInGbs\":1405360141,\"dbNodeStorageSizeInGbs\":55863349,\"maxDbNodeStorageSizeInGbs\":2035779275,\"dataStorageSizeInTbs\":77.80900806799353,\"maxDataStorageInTbs\":14.723744499152136,\"dbServerVersion\":\"pusuesn\",\"storageServerVersion\":\"dejbavo\",\"activatedStorageCount\":669466066,\"additionalStorageCount\":1432436623,\"displayName\":\"ohctbqvudwx\",\"lastMaintenanceRunId\":\"dnvowg\",\"nextMaintenanceRunId\":\"jugwdkcglhsl\",\"monthlyDbServerVersion\":\"jdyggdtji\",\"monthlyStorageServerVersion\":\"b\"},\"zones\":[\"ofqweykhmenevfye\",\"fwhybcibvy\"],\"location\":\"c\",\"tags\":{\"ectehf\":\"ynnaam\",\"eypvhezrkg\":\"qsc\",\"sle\":\"hcjrefovgmk\",\"cattpngjcrcczsq\":\"yvxyqjp\"},\"id\":\"jh\",\"name\":\"mdajv\",\"type\":\"ysou\"}],\"nextLink\":\"e\"}")
            .toObject(CloudExadataInfrastructureListResult.class);
        Assertions.assertEquals("ndlik", model.value().get(0).location());
        Assertions.assertEquals("kgfg", model.value().get(0).tags().get("bmadgak"));
        Assertions.assertEquals(1277339929, model.value().get(0).properties().computeCount());
        Assertions.assertEquals(77118274, model.value().get(0).properties().storageCount());
        Assertions.assertEquals(Preference.CUSTOM_PREFERENCE,
            model.value().get(0).properties().maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.SEPTEMBER,
            model.value().get(0).properties().maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(2115498043,
            model.value().get(0).properties().maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.TUESDAY,
            model.value().get(0).properties().maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(947497777, model.value().get(0).properties().maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(1214814852, model.value().get(0).properties().maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING,
            model.value().get(0).properties().maintenanceWindow().patchingMode());
        Assertions.assertEquals(422670277,
            model.value().get(0).properties().maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(true,
            model.value().get(0).properties().maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false,
            model.value().get(0).properties().maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("ksqrglssai", model.value().get(0).properties().customerContacts().get(0).email());
        Assertions.assertEquals("vmgxsab", model.value().get(0).properties().shape());
        Assertions.assertEquals("qxhocdgeablgphut", model.value().get(0).properties().displayName());
        Assertions.assertEquals("ypl", model.value().get(0).zones().get(0));
        Assertions.assertEquals("e", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudExadataInfrastructureListResult model = new CloudExadataInfrastructureListResult().withValue(Arrays.asList(
            new CloudExadataInfrastructureInner().withLocation("ndlik")
                .withTags(mapOf("bmadgak", "kgfg", "ytb", "qsrxybzqqed", "modmglougpb", "iqfouflmmnkz"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(1277339929)
                    .withStorageCount(77118274)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.CUSTOM_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.SEPTEMBER)))
                        .withWeeksOfMonth(Arrays.asList(2115498043, 306155012, 1161449621))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.TUESDAY),
                            new DayOfWeek().withName(DayOfWeekName.TUESDAY),
                            new DayOfWeek().withName(DayOfWeekName.SUNDAY),
                            new DayOfWeek().withName(DayOfWeekName.MONDAY)))
                        .withHoursOfDay(Arrays.asList(947497777, 890604952, 3133273))
                        .withLeadTimeInWeeks(1214814852)
                        .withPatchingMode(PatchingMode.NON_ROLLING)
                        .withCustomActionTimeoutInMins(422670277)
                        .withIsCustomActionTimeoutEnabled(true)
                        .withIsMonthlyPatchingEnabled(false))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("ksqrglssai"),
                        new CustomerContact().withEmail("qpjwnzlljfm")))
                    .withShape("vmgxsab")
                    .withDisplayName("qxhocdgeablgphut"))
                .withZones(Arrays.asList("ypl", "ckbasyypndd", "sgcbac", "hejkotynqgou")),
            new CloudExadataInfrastructureInner().withLocation("tbzsgfyccs")
                .withTags(mapOf("flnrosfqpteehzz", "mdwzjeiachboo", "swjdkirso", "ypyqrimzinp", "soifiyipjxsqw",
                    "dqxhcrmnohjtckwh", "bznorcjxvsnby", "gr"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(398280406)
                    .withStorageCount(1089342550)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.NO_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.OCTOBER)))
                        .withWeeksOfMonth(Arrays.asList(1189352281))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.WEDNESDAY),
                            new DayOfWeek().withName(DayOfWeekName.WEDNESDAY)))
                        .withHoursOfDay(Arrays.asList(1529578070, 1939362977, 596871405, 2069230951))
                        .withLeadTimeInWeeks(1739804762)
                        .withPatchingMode(PatchingMode.NON_ROLLING)
                        .withCustomActionTimeoutInMins(243879376)
                        .withIsCustomActionTimeoutEnabled(true)
                        .withIsMonthlyPatchingEnabled(false))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("s"),
                        new CustomerContact().withEmail("l"), new CustomerContact().withEmail("juvf")))
                    .withShape("yxwjkcp")
                    .withDisplayName("x"))
                .withZones(Arrays.asList("fufsrpymzi", "nsez")),
            new CloudExadataInfrastructureInner().withLocation("hrzayvvtpgvdf")
                .withTags(mapOf("efgugnxk", "tkftutqxlngx", "hjybigehoqfbo", "xdqmidtthzrvqdra", "zlcuiywgqywgndrv",
                    "skanyk", "ocpecfvmmco", "nhzgpphrcgyn"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(331087178)
                    .withStorageCount(377543492)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.NO_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.SEPTEMBER),
                            new Month().withName(MonthName.NOVEMBER)))
                        .withWeeksOfMonth(Arrays.asList(812550328, 1450066184, 2010275395, 1382197714))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.SUNDAY),
                            new DayOfWeek().withName(DayOfWeekName.WEDNESDAY)))
                        .withHoursOfDay(Arrays.asList(411376072, 1936652093, 187934940))
                        .withLeadTimeInWeeks(269185067)
                        .withPatchingMode(PatchingMode.ROLLING)
                        .withCustomActionTimeoutInMins(865429737)
                        .withIsCustomActionTimeoutEnabled(true)
                        .withIsMonthlyPatchingEnabled(false))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("ionpimexg"),
                        new CustomerContact().withEmail("txgcpodgmaajr"), new CustomerContact().withEmail("vdjwzrlovm"),
                        new CustomerContact().withEmail("lwhijcoejctbzaq")))
                    .withShape("bkbfkgukdkex")
                    .withDisplayName("dntwndeicbtw"))
                .withZones(Arrays.asList("q", "hkh", "xuigdtopbobj", "ghmewuam")),
            new CloudExadataInfrastructureInner().withLocation("c")
                .withTags(
                    mapOf("ectehf", "ynnaam", "eypvhezrkg", "qsc", "sle", "hcjrefovgmk", "cattpngjcrcczsq", "yvxyqjp"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(1187016173)
                    .withStorageCount(2055969856)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.CUSTOM_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.APRIL),
                            new Month().withName(MonthName.FEBRUARY)))
                        .withWeeksOfMonth(Arrays.asList(572259851))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.SUNDAY),
                            new DayOfWeek().withName(DayOfWeekName.TUESDAY),
                            new DayOfWeek().withName(DayOfWeekName.SUNDAY)))
                        .withHoursOfDay(Arrays.asList(611724458, 431293436, 903748281, 1019249185))
                        .withLeadTimeInWeeks(2024300309)
                        .withPatchingMode(PatchingMode.ROLLING)
                        .withCustomActionTimeoutInMins(804356907)
                        .withIsCustomActionTimeoutEnabled(true)
                        .withIsMonthlyPatchingEnabled(false))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("ipheoflokeyyien"),
                        new CustomerContact().withEmail("bdlwtgrhpdjpj"),
                        new CustomerContact().withEmail("masxazjpqyegu"),
                        new CustomerContact().withEmail("lhbxxhejjzzvdud")))
                    .withShape("fhotw")
                    .withDisplayName("ohctbqvudwx"))
                .withZones(Arrays.asList("ofqweykhmenevfye", "fwhybcibvy"))))
            .withNextLink("e");
        model = BinaryData.fromObject(model).toObject(CloudExadataInfrastructureListResult.class);
        Assertions.assertEquals("ndlik", model.value().get(0).location());
        Assertions.assertEquals("kgfg", model.value().get(0).tags().get("bmadgak"));
        Assertions.assertEquals(1277339929, model.value().get(0).properties().computeCount());
        Assertions.assertEquals(77118274, model.value().get(0).properties().storageCount());
        Assertions.assertEquals(Preference.CUSTOM_PREFERENCE,
            model.value().get(0).properties().maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.SEPTEMBER,
            model.value().get(0).properties().maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(2115498043,
            model.value().get(0).properties().maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.TUESDAY,
            model.value().get(0).properties().maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(947497777, model.value().get(0).properties().maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(1214814852, model.value().get(0).properties().maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.NON_ROLLING,
            model.value().get(0).properties().maintenanceWindow().patchingMode());
        Assertions.assertEquals(422670277,
            model.value().get(0).properties().maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(true,
            model.value().get(0).properties().maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(false,
            model.value().get(0).properties().maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("ksqrglssai", model.value().get(0).properties().customerContacts().get(0).email());
        Assertions.assertEquals("vmgxsab", model.value().get(0).properties().shape());
        Assertions.assertEquals("qxhocdgeablgphut", model.value().get(0).properties().displayName());
        Assertions.assertEquals("ypl", model.value().get(0).zones().get(0));
        Assertions.assertEquals("e", model.nextLink());
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

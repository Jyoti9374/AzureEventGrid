// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.AutonomousDatabaseBackupInner;
import com.azure.resourcemanager.oracledatabase.models.AutonomousDatabaseBackupProperties;
import org.junit.jupiter.api.Assertions;

public final class AutonomousDatabaseBackupInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutonomousDatabaseBackupInner model = BinaryData.fromString(
            "{\"properties\":{\"autonomousDatabaseOcid\":\"eddgssofw\",\"databaseSizeInTbs\":76.85749408196457,\"dbVersion\":\"lkrm\",\"displayName\":\"i\",\"ocid\":\"xacqqudfnbyx\",\"isAutomatic\":true,\"isRestorable\":false,\"lifecycleDetails\":\"yvayffimrzr\",\"lifecycleState\":\"Updating\",\"retentionPeriodInDays\":769547097,\"sizeInTbs\":56.44663146282171,\"timeAvailableTil\":\"2021-06-21T02:54:13Z\",\"timeStarted\":\"vfdnwnwmewzsyyce\",\"timeEnded\":\"soibjudpfrx\",\"backupType\":\"Incremental\",\"provisioningState\":\"Canceled\"},\"id\":\"aytdwkqbrq\",\"name\":\"bpaxhexiilivpdt\",\"type\":\"irqtdqoa\"}")
            .toObject(AutonomousDatabaseBackupInner.class);
        Assertions.assertEquals("i", model.properties().displayName());
        Assertions.assertEquals(769547097, model.properties().retentionPeriodInDays());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutonomousDatabaseBackupInner model = new AutonomousDatabaseBackupInner().withProperties(
            new AutonomousDatabaseBackupProperties().withDisplayName("i").withRetentionPeriodInDays(769547097));
        model = BinaryData.fromObject(model).toObject(AutonomousDatabaseBackupInner.class);
        Assertions.assertEquals("i", model.properties().displayName());
        Assertions.assertEquals(769547097, model.properties().retentionPeriodInDays());
    }
}

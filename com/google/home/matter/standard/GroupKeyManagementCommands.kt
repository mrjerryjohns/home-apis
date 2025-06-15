// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GroupKeyManagementCommands {
    public abstract suspend fun keySetWrite(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): kotlin.Unit

    public abstract suspend fun keySetRead(groupKeySetId: kotlin.UShort): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response

    public abstract suspend fun keySetRemove(groupKeySetId: kotlin.UShort): kotlin.Unit

    public abstract suspend fun keySetReadAllIndices(): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response

    public abstract fun keySetWriteBatchable(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun keySetReadBatchable(groupKeySetId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response>

    public abstract fun keySetRemoveBatchable(groupKeySetId: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun keySetReadAllIndicesBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response>
}

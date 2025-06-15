// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GroupKeyManagementCommandsDefaultImpl : com.google.home.matter.standard.GroupKeyManagementCommands {
    public open suspend fun keySetWrite(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): kotlin.Unit { /* compiled code */ }

    public open suspend fun keySetRead(groupKeySetId: kotlin.UShort): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response { /* compiled code */ }

    public open suspend fun keySetRemove(groupKeySetId: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun keySetReadAllIndices(): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response { /* compiled code */ }

    public open fun keySetWriteBatchable(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun keySetReadBatchable(groupKeySetId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response> { /* compiled code */ }

    public open fun keySetRemoveBatchable(groupKeySetId: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun keySetReadAllIndicesBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response> { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class GroupKeyManagementImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.GroupKeyManagementTrait.Attributes) : com.google.home.matter.standard.GroupKeyManagement, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.GroupKeyManagementTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.GroupKeyManagement, com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.GroupKeyManagementTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.GroupKeyManagementTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>? /* compiled code */

    public open val groupTable: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct>? /* compiled code */

    public open val maxGroupKeysPerFabric: kotlin.UShort? /* compiled code */

    public open val maxGroupsPerFabric: kotlin.UShort? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.GroupKeyManagement.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.GroupKeyManagement.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun keySetWrite(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): kotlin.Unit { /* compiled code */ }

    public open suspend fun keySetRead(groupKeySetId: kotlin.UShort): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response { /* compiled code */ }

    public open suspend fun keySetRemove(groupKeySetId: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun keySetReadAllIndices(): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.GroupKeyManagement) -> kotlin.Unit, init: com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.GroupKeyManagement { /* compiled code */ }

    public open fun keySetWriteBatchable(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun keySetReadBatchable(groupKeySetId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response> { /* compiled code */ }

    public open fun keySetRemoveBatchable(groupKeySetId: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun keySetReadAllIndicesBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class InterconnectImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.InterconnectTrait.Attributes) : com.google.home.google.Interconnect, com.google.home.matter.MatterTraitImpl, com.google.home.google.InterconnectTrait.Attributes, com.google.home.Updatable<com.google.home.google.Interconnect, com.google.home.google.InterconnectTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.InterconnectTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val credentialStatus: com.google.home.google.InterconnectTrait.CredentialStatus? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val threadUuid: kotlin.String? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Interconnect.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Interconnect.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setInterconnectCredentials(threadPanId: kotlin.Long, networkKey: kotlin.String, networkChannel: kotlin.Long): kotlin.Unit { /* compiled code */ }

    public open suspend fun clearInterconnectCredentials(): kotlin.Unit { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.google.Interconnect) -> kotlin.Unit, init: com.google.home.google.InterconnectTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.Interconnect { /* compiled code */ }

    public open fun setInterconnectCredentialsBatchable(threadPanId: kotlin.Long, networkKey: kotlin.String, networkChannel: kotlin.Long): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun clearInterconnectCredentialsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

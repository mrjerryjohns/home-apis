// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ExtendedChannelImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ExtendedChannelTrait.Attributes) : com.google.home.google.ExtendedChannel, com.google.home.matter.MatterTraitImpl, com.google.home.google.ExtendedChannelTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ExtendedChannelTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val channelCatalog: kotlin.String? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val extendedChannelList: kotlin.collections.List<com.google.home.google.ExtendedChannelTrait.ExtendedMediaChannel>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.ExtendedChannel.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.ExtendedChannel.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun returnChannel(): kotlin.Unit { /* compiled code */ }

    public open fun returnChannelBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

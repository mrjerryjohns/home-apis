// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class CameraActivationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.CameraActivationTrait.Attributes) : com.google.home.google.CameraActivation, com.google.home.matter.MatterTraitImpl, com.google.home.google.CameraActivationTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.CameraActivationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.CameraActivation.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.CameraActivation.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun process(request: kotlin.ByteArray): com.google.home.google.CameraActivationTrait.ProcessCommand.Response { /* compiled code */ }

    public open suspend fun convertMatterTlvToX509(matterTlvBytes: kotlin.ByteArray): com.google.home.google.CameraActivationTrait.ConvertMatterTlvToX509Command.Response { /* compiled code */ }

    public open fun processBatchable(request: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.google.CameraActivationTrait.ProcessCommand.Response> { /* compiled code */ }

    public open fun convertMatterTlvToX509Batchable(matterTlvBytes: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.google.CameraActivationTrait.ConvertMatterTlvToX509Command.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

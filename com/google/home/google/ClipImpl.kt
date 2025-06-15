// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class ClipImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.ClipTrait.Attributes) : com.google.home.google.Clip, com.google.home.matter.MatterTraitImpl, com.google.home.google.ClipTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.ClipTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val canSaveVideoClip: kotlin.Boolean? /* compiled code */

    public open val canTakeScreenshot: kotlin.Boolean? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val maxClipLengthSeconds: kotlin.ULong? /* compiled code */

    public open val supportUserDefinedClipLength: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Clip.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Clip.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun saveScreenshot(): com.google.home.google.ClipTrait.SaveScreenshotCommand.Response { /* compiled code */ }

    public open suspend fun saveVideoClip(durationSeconds: kotlin.ULong): com.google.home.google.ClipTrait.SaveVideoClipCommand.Response { /* compiled code */ }

    public open fun saveScreenshotBatchable(): com.google.home.BatchableCommand<com.google.home.google.ClipTrait.SaveScreenshotCommand.Response> { /* compiled code */ }

    public open fun saveVideoClipBatchable(durationSeconds: kotlin.ULong): com.google.home.BatchableCommand<com.google.home.google.ClipTrait.SaveVideoClipCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

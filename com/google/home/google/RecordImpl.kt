// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class RecordImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.RecordTrait.Attributes) : com.google.home.google.Record, com.google.home.matter.MatterTraitImpl, com.google.home.google.RecordTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.RecordTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val isCurrentlyRecording: kotlin.Boolean? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Record.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.Record.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun startRecording(): kotlin.Unit { /* compiled code */ }

    public open suspend fun stopRecording(): kotlin.Unit { /* compiled code */ }

    public open suspend fun record(reason: com.google.home.google.RecordTrait.RecordingReason, durationSeconds: kotlin.UInt): com.google.home.google.RecordTrait.RecordCommand.Response { /* compiled code */ }

    public open fun startRecordingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stopRecordingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun recordBatchable(reason: com.google.home.google.RecordTrait.RecordingReason, durationSeconds: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.google.RecordTrait.RecordCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

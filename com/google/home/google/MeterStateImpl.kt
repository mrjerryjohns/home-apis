// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class MeterStateImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.MeterStateTrait.Attributes) : com.google.home.google.MeterState, com.google.home.matter.MatterTraitImpl, com.google.home.google.MeterStateTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.MeterStateTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentMeterStateData: kotlin.collections.List<com.google.home.google.MeterStateTrait.CurrentMeterStateData>? /* compiled code */

    public open val featureMap: com.google.home.google.MeterStateTrait.MeterStateFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val supportedMeterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.SupportedMeterState>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.MeterState.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.MeterState.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun fetchMeterStateHistory(startTimeUnixTimestampSeconds: kotlin.Long, endTimeUnixTimestampSeconds: kotlin.Long, meterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.MeterStates>): kotlin.Unit { /* compiled code */ }

    public open fun fetchMeterStateHistoryBatchable(startTimeUnixTimestampSeconds: kotlin.Long, endTimeUnixTimestampSeconds: kotlin.Long, meterStates: kotlin.collections.List<com.google.home.google.MeterStateTrait.MeterStates>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


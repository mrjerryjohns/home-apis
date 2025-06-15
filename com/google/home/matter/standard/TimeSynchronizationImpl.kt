// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class TimeSynchronizationImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.TimeSynchronizationTrait.Attributes) : com.google.home.matter.standard.TimeSynchronization, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.TimeSynchronizationTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.TimeSynchronizationTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val defaultNtp: kotlin.String? /* compiled code */

    public open val dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>? /* compiled code */

    public open val dstOffsetListMaxSize: kotlin.UByte? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.TimeSynchronizationTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum? /* compiled code */

    public open val localTime: kotlin.ULong? /* compiled code */

    public open val ntpServerAvailable: kotlin.Boolean? /* compiled code */

    public open val supportsDnsResolve: kotlin.Boolean? /* compiled code */

    public open val timeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TimeSourceEnum? /* compiled code */

    public open val timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>? /* compiled code */

    public open val timeZoneDatabase: com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneDatabaseEnum? /* compiled code */

    public open val timeZoneListMaxSize: kotlin.UByte? /* compiled code */

    public open val trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.TrustedTimeSourceStruct? /* compiled code */

    public open val utcTime: kotlin.ULong? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.TimeSynchronization.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.TimeSynchronization.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setUtcTime(utcTime: kotlin.ULong, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum, optionalArgs: com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun setTrustedTimeSource(trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct?): kotlin.Unit { /* compiled code */ }

    public open suspend fun setTimeZone(timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>): com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response { /* compiled code */ }

    public open suspend fun setDstOffset(dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>): kotlin.Unit { /* compiled code */ }

    public open suspend fun setDefaultNtp(defaultNtp: kotlin.String?): kotlin.Unit { /* compiled code */ }

    public open fun setUtcTimeBatchable(utcTime: kotlin.ULong, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum, optionalArgs: com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setTrustedTimeSourceBatchable(trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct?): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setTimeZoneBatchable(timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>): com.google.home.BatchableCommand<com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response> { /* compiled code */ }

    public open fun setDstOffsetBatchable(dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun setDefaultNtpBatchable(defaultNtp: kotlin.String?): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TimeSynchronizationCommandsDefaultImpl : com.google.home.matter.standard.TimeSynchronizationCommands {
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
}


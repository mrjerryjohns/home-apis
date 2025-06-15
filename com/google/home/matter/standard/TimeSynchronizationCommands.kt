// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface TimeSynchronizationCommands {
    public abstract suspend fun setUtcTime(utcTime: kotlin.ULong, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum, optionalArgs: com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun setTrustedTimeSource(trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct?): kotlin.Unit

    public abstract suspend fun setTimeZone(timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>): com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response

    public abstract suspend fun setDstOffset(dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>): kotlin.Unit

    public abstract suspend fun setDefaultNtp(defaultNtp: kotlin.String?): kotlin.Unit

    public abstract fun setUtcTimeBatchable(utcTime: kotlin.ULong, granularity: com.google.home.matter.standard.TimeSynchronizationTrait.GranularityEnum, optionalArgs: com.google.home.matter.standard.TimeSynchronizationTrait.SetUtcTimeCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setTrustedTimeSourceBatchable(trustedTimeSource: com.google.home.matter.standard.TimeSynchronizationTrait.FabricScopedTrustedTimeSourceStruct?): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setTimeZoneBatchable(timeZone: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.TimeZoneStruct>): com.google.home.BatchableCommand<com.google.home.matter.standard.TimeSynchronizationTrait.SetTimeZoneCommand.Response>

    public abstract fun setDstOffsetBatchable(dstOffset: kotlin.collections.List<com.google.home.matter.standard.TimeSynchronizationTrait.DstOffsetStruct>): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun setDefaultNtpBatchable(defaultNtp: kotlin.String?): com.google.home.BatchableCommand<kotlin.Unit>
}

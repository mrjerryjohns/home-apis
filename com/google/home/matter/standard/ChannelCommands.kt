// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ChannelCommands {
    public abstract suspend fun changeChannel(match: kotlin.String): com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response

    public abstract suspend fun changeChannelByNumber(majorNumber: kotlin.UShort, minorNumber: kotlin.UShort): kotlin.Unit

    public abstract suspend fun skipChannel(count: kotlin.Short): kotlin.Unit

    public abstract suspend fun getProgramGuide(optionalArgs: com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response

    public abstract suspend fun recordProgram(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): kotlin.Unit

    public abstract suspend fun cancelRecordProgram(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): kotlin.Unit

    public abstract fun changeChannelBatchable(match: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response>

    public abstract fun changeChannelByNumberBatchable(majorNumber: kotlin.UShort, minorNumber: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun skipChannelBatchable(count: kotlin.Short): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun getProgramGuideBatchable(optionalArgs: com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response>

    public abstract fun recordProgramBatchable(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun cancelRecordProgramBatchable(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit>
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ChannelCommandsDefaultImpl : com.google.home.matter.standard.ChannelCommands {
    public open suspend fun changeChannel(match: kotlin.String): com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response { /* compiled code */ }

    public open suspend fun changeChannelByNumber(majorNumber: kotlin.UShort, minorNumber: kotlin.UShort): kotlin.Unit { /* compiled code */ }

    public open suspend fun skipChannel(count: kotlin.Short): kotlin.Unit { /* compiled code */ }

    public open suspend fun getProgramGuide(optionalArgs: com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response { /* compiled code */ }

    public open suspend fun recordProgram(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open suspend fun cancelRecordProgram(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open fun changeChannelBatchable(match: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.ChannelTrait.ChangeChannelCommand.Response> { /* compiled code */ }

    public open fun changeChannelByNumberBatchable(majorNumber: kotlin.UShort, minorNumber: kotlin.UShort): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun skipChannelBatchable(count: kotlin.Short): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun getProgramGuideBatchable(optionalArgs: com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.ChannelTrait.GetProgramGuideCommand.Response> { /* compiled code */ }

    public open fun recordProgramBatchable(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun cancelRecordProgramBatchable(programIdentifier: kotlin.String, shouldRecordSeries: kotlin.Boolean, externalIdList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.AdditionalInfoStruct>, data: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

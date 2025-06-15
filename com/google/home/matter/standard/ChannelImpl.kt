// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class ChannelImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.ChannelTrait.Attributes) : com.google.home.matter.standard.Channel, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.ChannelTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.ChannelTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val channelList: kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentChannel: com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.ChannelTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val lineup: com.google.home.matter.standard.ChannelTrait.LineupInfoStruct? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.Channel.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.Channel.Command): kotlin.Boolean { /* compiled code */ }

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

    public open fun toString(): kotlin.String { /* compiled code */ }
}


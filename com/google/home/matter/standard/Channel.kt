// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface Channel : com.google.home.matter.standard.ChannelTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.ChannelCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.Channel> {
        public final val channelList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>?> /* compiled code */
            public final get

        public final val lineup: com.google.home.automation.Attribute<com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?> /* compiled code */
            public final get

        public final val currentChannel: com.google.home.automation.Attribute<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.ChannelTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.channelList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.lineup: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ChannelTrait.LineupInfoStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.currentChannel: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ChannelTrait.ChannelInfoStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ChannelTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Channel?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun changeChannel(match: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun changeChannelByNumber(majorNumber: kotlin.UShort, minorNumber: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun skipChannel(count: kotlin.Short): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.Channel> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.Channel.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.Channel.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Channel.Attribute> {
        @androidx.annotation.NonNull channelList,

        @androidx.annotation.NonNull lineup,

        @androidx.annotation.NonNull currentChannel,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.Channel.Command> {
        @androidx.annotation.NonNull ChangeChannel,

        @androidx.annotation.NonNull ChangeChannelByNumber,

        @androidx.annotation.NonNull SkipChannel,

        @androidx.annotation.NonNull GetProgramGuide,

        @androidx.annotation.NonNull RecordProgram,

        @androidx.annotation.NonNull CancelRecordProgram;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


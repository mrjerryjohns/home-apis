// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OnOff : com.google.home.matter.standard.OnOffTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.OnOff, com.google.home.matter.standard.OnOffTrait.MutableAttributes>, com.google.home.matter.standard.OnOffCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.OnOff> {
        public final val onOff: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val globalSceneControl: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val onTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val offWaitTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val startUpOnOff: com.google.home.automation.Attribute<com.google.home.matter.standard.OnOffTrait.StartUpOnOffEnum?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.OnOffTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.onOff: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.globalSceneControl: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.onTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.offWaitTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.startUpOnOff: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OnOffTrait.StartUpOnOffEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.OnOffTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OnOff?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OnOff>.setOnTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OnOff>.setOffWaitTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.OnOff>.setStartUpOnOff(value: com.google.home.matter.standard.OnOffTrait.StartUpOnOffEnum): kotlin.Unit { /* compiled code */ }

        public final fun off(): com.google.home.automation.Command { /* compiled code */ }

        public final fun on(): com.google.home.automation.Command { /* compiled code */ }

        public final fun toggle(): com.google.home.automation.Command { /* compiled code */ }

        public final fun offWithEffect(effectIdentifier: com.google.home.matter.standard.OnOffTrait.EffectIdentifierEnum, effectVariant: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun onWithRecallGlobalScene(): com.google.home.automation.Command { /* compiled code */ }

        public final fun onWithTimedOff(onOffControl: com.google.home.matter.standard.OnOffTrait.OnOffControlBitmap, onTime: kotlin.UShort, offWaitTime: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.OnOff> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.OnOff.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.OnOff.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OnOff.Attribute> {
        @androidx.annotation.NonNull onOff,

        @androidx.annotation.NonNull globalSceneControl,

        @androidx.annotation.NonNull onTime,

        @androidx.annotation.NonNull offWaitTime,

        @androidx.annotation.NonNull startUpOnOff,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.OnOff.Command> {
        @androidx.annotation.NonNull Off,

        @androidx.annotation.NonNull On,

        @androidx.annotation.NonNull Toggle,

        @androidx.annotation.NonNull OffWithEffect,

        @androidx.annotation.NonNull OnWithRecallGlobalScene,

        @androidx.annotation.NonNull OnWithTimedOff;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


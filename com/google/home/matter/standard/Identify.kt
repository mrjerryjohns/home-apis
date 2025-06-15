// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface Identify : com.google.home.matter.standard.IdentifyTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.Identify, com.google.home.matter.standard.IdentifyTrait.MutableAttributes>, com.google.home.matter.standard.IdentifyCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.Identify> {
        public final val identifyTime: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val identifyType: com.google.home.automation.Attribute<com.google.home.matter.standard.IdentifyTrait.IdentifyTypeEnum?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.identifyTime: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.identifyType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.IdentifyTrait.IdentifyTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Identify?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.Identify>.setIdentifyTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun identify(identifyTime: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun triggerEffect(effectIdentifier: com.google.home.matter.standard.IdentifyTrait.EffectIdentifierEnum, effectVariant: com.google.home.matter.standard.IdentifyTrait.EffectVariantEnum): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.Identify> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.Identify.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.Identify.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Identify.Attribute> {
        @androidx.annotation.NonNull identifyTime,

        @androidx.annotation.NonNull identifyType,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.Identify.Command> {
        @androidx.annotation.NonNull Identify,

        @androidx.annotation.NonNull TriggerEffect;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface LightEffects : com.google.home.google.LightEffectsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.LightEffectsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.LightEffects> {
        public final val defaultSleepDurationSeconds: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val defaultWakeDurationSeconds: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val effectEndTimestampSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val pulseEffectSet: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val sleepEffectSet: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val wakeEffectSet: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.google.LightEffectsTrait.LightEffectsFeature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.defaultSleepDurationSeconds: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.defaultWakeDurationSeconds: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.effectEndTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.pulseEffectSet: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.sleepEffectSet: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.wakeEffectSet: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.google.LightEffectsTrait.LightEffectsFeature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.LightEffects?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun sleepEffectSet(durationSeconds: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        public final fun wakeEffectSet(durationSeconds: kotlin.UInt): com.google.home.automation.Command { /* compiled code */ }

        public final fun stopEffect(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.LightEffects> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.LightEffects.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.LightEffects.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.LightEffects.Attribute> {
        @androidx.annotation.NonNull defaultSleepDurationSeconds,

        @androidx.annotation.NonNull defaultWakeDurationSeconds,

        @androidx.annotation.NonNull effectEndTimestampSeconds,

        @androidx.annotation.NonNull pulseEffectSet,

        @androidx.annotation.NonNull sleepEffectSet,

        @androidx.annotation.NonNull wakeEffectSet,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.LightEffects.Command> {
        @androidx.annotation.NonNull PulseEffectSet,

        @androidx.annotation.NonNull SleepEffectSet,

        @androidx.annotation.NonNull WakeEffectSet,

        @androidx.annotation.NonNull StopEffect;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


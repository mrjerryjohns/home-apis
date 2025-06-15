// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object SmokeCoAlarmSettingsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class PathlightSensitivity private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull On,

        @androidx.annotation.NonNull Off,

        @androidx.annotation.NonNull AlwaysOn,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes { /* compiled code */ }
        }

        public abstract val pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity?

        public abstract val enableNightlyPromise: kotlin.Boolean?

        public abstract val enableSteamCheck: kotlin.Boolean?

        public abstract val enableHeadsUpAlert: kotlin.Boolean?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity? = COMPILED_CODE, enableNightlyPromise: kotlin.Boolean? = COMPILED_CODE, enableSteamCheck: kotlin.Boolean? = COMPILED_CODE, enableHeadsUpAlert: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes,
        com.google.home.matter.serialization.CanMutate<com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes, com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes) { /* compiled code */ }

        public open val pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity? /* compiled code */

        public open val enableNightlyPromise: kotlin.Boolean? /* compiled code */

        public open val enableSteamCheck: kotlin.Boolean? /* compiled code */

        public open val enableHeadsUpAlert: kotlin.Boolean? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity? = COMPILED_CODE, enableNightlyPromise: kotlin.Boolean? = COMPILED_CODE, enableSteamCheck: kotlin.Boolean? = COMPILED_CODE, enableHeadsUpAlert: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.SmokeCoAlarmSettingsTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.SmokeCoAlarmSettingsTrait.Attributes) : com.google.home.google.SmokeCoAlarmSettingsTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SmokeCoAlarmSettingsTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity? /* compiled code */

        public open val pathlightSensitivity: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity? /* compiled code */
            public open get

        internal final var _enableNightlyPromise: kotlin.Boolean? /* compiled code */

        public open val enableNightlyPromise: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _enableSteamCheck: kotlin.Boolean? /* compiled code */

        public open val enableSteamCheck: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _enableHeadsUpAlert: kotlin.Boolean? /* compiled code */

        public open val enableHeadsUpAlert: kotlin.Boolean? /* compiled code */
            public open get

        public final fun setPathlightSensitivity(value: com.google.home.google.SmokeCoAlarmSettingsTrait.PathlightSensitivity): kotlin.Unit { /* compiled code */ }

        public final fun setEnableNightlyPromise(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setEnableSteamCheck(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setEnableHeadsUpAlert(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object RecordingTriggerSettingsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class Setting private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.RecordingTriggerSettingsTrait.Setting> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Unset,

        @androidx.annotation.NonNull On,

        @androidx.annotation.NonNull Off,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.RecordingTriggerSettingsTrait.Setting> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.RecordingTriggerSettingsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.RecordingTriggerSettingsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.RecordingTriggerSettingsTrait.Attributes { /* compiled code */ }
        }

        public abstract val safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting?

        public abstract val defaultSafetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? = COMPILED_CODE, defaultSafetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.RecordingTriggerSettingsTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.google.RecordingTriggerSettingsTrait.Attributes,
        com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.google.RecordingTriggerSettingsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.RecordingTriggerSettingsTrait.Attributes) { /* compiled code */ }

        public open val safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? /* compiled code */

        public open val defaultSafetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.RecordingTriggerSettingsTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? = COMPILED_CODE, defaultSafetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.RecordingTriggerSettingsTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.RecordingTriggerSettingsTrait.Attributes) : com.google.home.google.RecordingTriggerSettingsTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.RecordingTriggerSettingsTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? /* compiled code */

        public open val safetyTriggerSetting: com.google.home.google.RecordingTriggerSettingsTrait.Setting? /* compiled code */
            public open get

        public final fun setSafetyTriggerSetting(value: com.google.home.google.RecordingTriggerSettingsTrait.Setting): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

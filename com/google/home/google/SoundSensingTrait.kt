// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object SoundSensingTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class SoundType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.SoundSensingTrait.SoundType> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull SmokeAlarm,

        @androidx.annotation.NonNull CoAlarm,

        @androidx.annotation.NonNull GlassBreak,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.SoundSensingTrait.SoundType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class ClipData public constructor(soundTrackId: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SoundSensingTrait.ClipData>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SoundSensingTrait.ClipData?>.soundTrackId: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SoundSensingTrait.ClipData): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SoundSensingTrait.ClipData { /* compiled code */ }
        }

        public final val soundTrackId: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.SoundSensingTrait.ClipData.StructFields> {
            @androidx.annotation.NonNull soundTrackId;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class SoundActivity public constructor(id: kotlin.UInt = COMPILED_CODE, startTimeSec: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, endTimeSec: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, soundClipData: com.google.home.google.SoundSensingTrait.ClipData = COMPILED_CODE, soundType: com.google.home.google.SoundSensingTrait.SoundType = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SoundSensingTrait.SoundActivity>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SoundSensingTrait.SoundActivity?>.id: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SoundSensingTrait.SoundActivity?>.startTimeSec: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SoundSensingTrait.SoundActivity?>.endTimeSec: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SoundSensingTrait.SoundActivity?>.soundClipData: com.google.home.automation.TypedExpression<com.google.home.google.SoundSensingTrait.ClipData> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.SoundSensingTrait.SoundActivity?>.soundType: com.google.home.automation.TypedExpression<com.google.home.google.SoundSensingTrait.SoundType> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SoundSensingTrait.SoundActivity): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SoundSensingTrait.SoundActivity { /* compiled code */ }
        }

        public final val id: kotlin.UInt /* compiled code */

        public final val startTimeSec: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val endTimeSec: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val soundClipData: com.google.home.google.SoundSensingTrait.ClipData /* compiled code */

        public final val soundType: com.google.home.google.SoundSensingTrait.SoundType /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.SoundSensingTrait.SoundActivity.StructFields> {
            @androidx.annotation.NonNull id,

            @androidx.annotation.NonNull startTimeSec,

            @androidx.annotation.NonNull endTimeSec,

            @androidx.annotation.NonNull soundClipData,

            @androidx.annotation.NonNull soundType;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.SoundSensingTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.SoundSensingTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.SoundSensingTrait.Attributes { /* compiled code */ }
        }

        public abstract val currentSoundActivity: kotlin.collections.List<com.google.home.google.SoundSensingTrait.SoundActivity>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(currentSoundActivity: kotlin.collections.List<com.google.home.google.SoundSensingTrait.SoundActivity>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.SoundSensingTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.SoundSensingTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.SoundSensingTrait.Attributes) { /* compiled code */ }

        public open val currentSoundActivity: kotlin.collections.List<com.google.home.google.SoundSensingTrait.SoundActivity>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(currentSoundActivity: kotlin.collections.List<com.google.home.google.SoundSensingTrait.SoundActivity>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.SoundSensingTrait.AttributesImpl { /* compiled code */ }
    }
}


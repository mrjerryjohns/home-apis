// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object EnergyEvseModeTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ModeTag private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTag> {
        @androidx.annotation.NonNull Auto,

        @androidx.annotation.NonNull Quick,

        @androidx.annotation.NonNull Quiet,

        @androidx.annotation.NonNull LowNoise,

        @androidx.annotation.NonNull LowEnergy,

        @androidx.annotation.NonNull Vacation,

        @androidx.annotation.NonNull Min,

        @androidx.annotation.NonNull Max,

        @androidx.annotation.NonNull Night,

        @androidx.annotation.NonNull Day,

        @androidx.annotation.NonNull Manual,

        @androidx.annotation.NonNull TimeOfUse,

        @androidx.annotation.NonNull SolarCharging,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTag> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(onOff: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.Feature> {
            private const final val ON_OFF_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.EnergyEvseModeTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.EnergyEvseModeTrait.Feature { /* compiled code */ }
        }

        public final val onOff: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(onOff: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.EnergyEvseModeTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ModeTagStruct public constructor(mfgCode: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, value: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct?>.mfgCode: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct?>.value: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct { /* compiled code */ }
        }

        public final val mfgCode: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val value: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct.StructFields> {
            @androidx.annotation.NonNull mfgCode,

            @androidx.annotation.NonNull value;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ModeOptionStruct public constructor(label: kotlin.String = COMPILED_CODE, mode: kotlin.UByte = COMPILED_CODE, modeTags: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct?>.label: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct?>.mode: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct?>.modeTags: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct { /* compiled code */ }
        }

        public final val label: kotlin.String /* compiled code */

        public final val mode: kotlin.UByte /* compiled code */

        public final val modeTags: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeTagStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct.StructFields> {
            @androidx.annotation.NonNull label,

            @androidx.annotation.NonNull mode,

            @androidx.annotation.NonNull modeTags;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseModeTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseModeTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedModes: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct>?

        public abstract val currentMode: kotlin.UByte?

        public abstract val startUpMode: kotlin.UByte?

        public abstract val onMode: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.EnergyEvseModeTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedModes: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct>? = COMPILED_CODE, currentMode: kotlin.UByte? = COMPILED_CODE, startUpMode: kotlin.UByte? = COMPILED_CODE, onMode: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.EnergyEvseModeTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.EnergyEvseModeTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.EnergyEvseModeTrait.Attributes, com.google.home.matter.standard.EnergyEvseModeTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.EnergyEvseModeTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.EnergyEvseModeTrait.Attributes) { /* compiled code */ }

        public open val supportedModes: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct>? /* compiled code */

        public open val currentMode: kotlin.UByte? /* compiled code */

        public open val startUpMode: kotlin.UByte? /* compiled code */

        public open val onMode: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.EnergyEvseModeTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.EnergyEvseModeTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.EnergyEvseModeTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedModes: kotlin.collections.List<com.google.home.matter.standard.EnergyEvseModeTrait.ModeOptionStruct>? = COMPILED_CODE, currentMode: kotlin.UByte? = COMPILED_CODE, startUpMode: kotlin.UByte? = COMPILED_CODE, onMode: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.EnergyEvseModeTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.EnergyEvseModeTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.EnergyEvseModeTrait.Attributes) : com.google.home.matter.standard.EnergyEvseModeTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseModeTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseModeTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _startUpMode: kotlin.UByte? /* compiled code */

        internal final var _isStartUpModeSet: kotlin.Boolean /* compiled code */

        public open val startUpMode: kotlin.UByte? /* compiled code */
            public open get

        internal final var _onMode: kotlin.UByte? /* compiled code */

        internal final var _isOnModeSet: kotlin.Boolean /* compiled code */

        public open val onMode: kotlin.UByte? /* compiled code */
            public open get

        public final fun setStartUpMode(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setOnMode(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object ChangeToModeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(newMode: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Request { /* compiled code */ }
            }

            public final val newMode: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Request.CommandFields> {
                @androidx.annotation.NonNull newMode;

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
        }

        public final class Response public constructor(status: kotlin.UByte = COMPILED_CODE, statusText: kotlin.String? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Response { /* compiled code */ }
            }

            public final val status: kotlin.UByte /* compiled code */

            public final val statusText: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.EnergyEvseModeTrait.ChangeToModeCommand.Response.CommandFields> {
                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull statusText;

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
        }
    }
}


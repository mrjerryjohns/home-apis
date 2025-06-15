// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ModeSelectTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(onOff: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ModeSelectTrait.Feature> {
            private const final val ON_OFF_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ModeSelectTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ModeSelectTrait.Feature { /* compiled code */ }
        }

        public final val onOff: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(onOff: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ModeSelectTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class SemanticTagStruct public constructor(mfgCode: kotlin.UShort = COMPILED_CODE, value: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct?>.mfgCode: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct?>.value: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct { /* compiled code */ }
        }

        public final val mfgCode: kotlin.UShort /* compiled code */

        public final val value: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct.StructFields> {
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

    public final class ModeOptionStruct public constructor(label: kotlin.String = COMPILED_CODE, mode: kotlin.UByte = COMPILED_CODE, semanticTags: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct?>.label: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct?>.mode: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct?>.semanticTags: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct { /* compiled code */ }
        }

        public final val label: kotlin.String /* compiled code */

        public final val mode: kotlin.UByte /* compiled code */

        public final val semanticTags: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.SemanticTagStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct.StructFields> {
            @androidx.annotation.NonNull label,

            @androidx.annotation.NonNull mode,

            @androidx.annotation.NonNull semanticTags;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ModeSelectTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ModeSelectTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ModeSelectTrait.Attributes { /* compiled code */ }
        }

        public abstract val description: kotlin.String?

        public abstract val standardNamespace: kotlin.UShort?

        public abstract val supportedModes: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct>?

        public abstract val currentMode: kotlin.UByte?

        public abstract val startUpMode: kotlin.UByte?

        public abstract val onMode: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ModeSelectTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(description: kotlin.String? = COMPILED_CODE, standardNamespace: kotlin.UShort? = COMPILED_CODE, supportedModes: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct>? = COMPILED_CODE, currentMode: kotlin.UByte? = COMPILED_CODE, startUpMode: kotlin.UByte? = COMPILED_CODE, onMode: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ModeSelectTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ModeSelectTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.ModeSelectTrait.Attributes, com.google.home.matter.standard.ModeSelectTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ModeSelectTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ModeSelectTrait.Attributes) { /* compiled code */ }

        public open val description: kotlin.String? /* compiled code */

        public open val standardNamespace: kotlin.UShort? /* compiled code */

        public open val supportedModes: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct>? /* compiled code */

        public open val currentMode: kotlin.UByte? /* compiled code */

        public open val startUpMode: kotlin.UByte? /* compiled code */

        public open val onMode: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ModeSelectTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.ModeSelectTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ModeSelectTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(description: kotlin.String? = COMPILED_CODE, standardNamespace: kotlin.UShort? = COMPILED_CODE, supportedModes: kotlin.collections.List<com.google.home.matter.standard.ModeSelectTrait.ModeOptionStruct>? = COMPILED_CODE, currentMode: kotlin.UByte? = COMPILED_CODE, startUpMode: kotlin.UByte? = COMPILED_CODE, onMode: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ModeSelectTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ModeSelectTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.ModeSelectTrait.Attributes) : com.google.home.matter.standard.ModeSelectTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ModeSelectTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ModeSelectTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ModeSelectTrait.MutableAttributes { /* compiled code */ }
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

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(newMode: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ModeSelectTrait.ChangeToModeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ModeSelectTrait.ChangeToModeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ModeSelectTrait.ChangeToModeCommand.Request { /* compiled code */ }
            }

            public final val newMode: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ModeSelectTrait.ChangeToModeCommand.Request.CommandFields> {
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
    }
}


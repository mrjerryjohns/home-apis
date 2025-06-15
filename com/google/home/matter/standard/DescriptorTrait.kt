// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object DescriptorTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(tagList: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DescriptorTrait.Feature> {
            private const final val TAG_LIST_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DescriptorTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DescriptorTrait.Feature { /* compiled code */ }
        }

        public final val tagList: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(tagList: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DescriptorTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class DeviceTypeStruct public constructor(deviceType: kotlin.UInt = COMPILED_CODE, revision: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct?>.deviceType: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct?>.revision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct { /* compiled code */ }
        }

        public final val deviceType: kotlin.UInt /* compiled code */

        public final val revision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct.StructFields> {
            @androidx.annotation.NonNull deviceType,

            @androidx.annotation.NonNull revision;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class SemanticTagStruct public constructor(mfgCode: kotlin.UShort? = COMPILED_CODE, namespaceId: kotlin.UByte = COMPILED_CODE, tag: kotlin.UByte = COMPILED_CODE, label: com.google.home.matter.serialization.OptionalValue<kotlin.String?> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct?>.mfgCode: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct?>.namespaceId: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct?>.tag: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct?>.label: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String?>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct { /* compiled code */ }
        }

        public final val mfgCode: kotlin.UShort? /* compiled code */

        public final val namespaceId: kotlin.UByte /* compiled code */

        public final val tag: kotlin.UByte /* compiled code */

        public final val label: com.google.home.matter.serialization.OptionalValue<kotlin.String?> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct.StructFields> {
            @androidx.annotation.NonNull mfgCode,

            @androidx.annotation.NonNull namespaceId,

            @androidx.annotation.NonNull Tag,

            @androidx.annotation.NonNull label;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DescriptorTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DescriptorTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DescriptorTrait.Attributes { /* compiled code */ }
        }

        public abstract val deviceTypeList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>?

        public abstract val serverList: kotlin.collections.List<kotlin.UInt>?

        public abstract val clientList: kotlin.collections.List<kotlin.UInt>?

        public abstract val partsList: kotlin.collections.List<kotlin.UShort>?

        public abstract val tagList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.DescriptorTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(deviceTypeList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>? = COMPILED_CODE, serverList: kotlin.collections.List<kotlin.UInt>? = COMPILED_CODE, clientList: kotlin.collections.List<kotlin.UInt>? = COMPILED_CODE, partsList: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, tagList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.DescriptorTrait.Feature =
        COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.DescriptorTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.DescriptorTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.DescriptorTrait.Attributes) { /* compiled code */ }

        public open val deviceTypeList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>? /* compiled code */

        public open val serverList: kotlin.collections.List<kotlin.UInt>? /* compiled code */

        public open val clientList: kotlin.collections.List<kotlin.UInt>? /* compiled code */

        public open val partsList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

        public open val tagList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.DescriptorTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(deviceTypeList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>? = COMPILED_CODE, serverList: kotlin.collections.List<kotlin.UInt>? = COMPILED_CODE, clientList: kotlin.collections.List<kotlin.UInt>? = COMPILED_CODE, partsList: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, tagList: kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.DescriptorTrait.Feature = COMPILED_CODE,
            clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.DescriptorTrait.AttributesImpl { /* compiled code */ }
    }
}

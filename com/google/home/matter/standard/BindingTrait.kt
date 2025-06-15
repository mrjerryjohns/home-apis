// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object BindingTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final class TargetStruct public constructor(node: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> = COMPILED_CODE, group: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, endpoint: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, cluster: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BindingTrait.TargetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BindingTrait.TargetStruct?>.node: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.ULong>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BindingTrait.TargetStruct?>.group: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BindingTrait.TargetStruct?>.endpoint: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BindingTrait.TargetStruct?>.cluster: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BindingTrait.TargetStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BindingTrait.TargetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BindingTrait.TargetStruct { /* compiled code */ }
        }

        public final val node: com.google.home.matter.serialization.OptionalValue<kotlin.ULong> /* compiled code */

        public final val group: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val endpoint: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val cluster: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BindingTrait.TargetStruct.StructFields> {
            @androidx.annotation.NonNull node,

            @androidx.annotation.NonNull group,

            @androidx.annotation.NonNull endpoint,

            @androidx.annotation.NonNull cluster,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BindingTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BindingTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BindingTrait.Attributes { /* compiled code */ }
        }

        public abstract val binding: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(binding: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.BindingTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.BindingTrait.Attributes, com.google.home.matter.standard.BindingTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.BindingTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.BindingTrait.Attributes) { /* compiled code */ }

        public open val binding: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.BindingTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.BindingTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(binding: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.BindingTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.BindingTrait.Attributes) : com.google.home.matter.standard.BindingTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BindingTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BindingTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BindingTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _binding: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>? /* compiled code */

        public open val binding: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>? /* compiled code */
            public open get

        public final fun setBinding(value: kotlin.collections.List<com.google.home.matter.standard.BindingTrait.TargetStruct>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

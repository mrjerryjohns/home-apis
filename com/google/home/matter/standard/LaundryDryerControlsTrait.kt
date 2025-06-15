// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object LaundryDryerControlsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class DrynessLevelEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum> {
        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Extra,

        @androidx.annotation.NonNull Max,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedDrynessLevels: kotlin.collections.List<com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum>?

        public abstract val selectedDrynessLevel: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(supportedDrynessLevels: kotlin.collections.List<com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum>? = COMPILED_CODE, selectedDrynessLevel: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes,
        com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes, com.google.home.matter.standard.LaundryDryerControlsTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes) { /* compiled code */ }

        public open val supportedDrynessLevels: kotlin.collections.List<com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum>? /* compiled code */

        public open val selectedDrynessLevel: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.LaundryDryerControlsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedDrynessLevels: kotlin.collections.List<com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum>? = COMPILED_CODE, selectedDrynessLevel: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.LaundryDryerControlsTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.LaundryDryerControlsTrait.Attributes) : com.google.home.matter.standard.LaundryDryerControlsTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LaundryDryerControlsTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LaundryDryerControlsTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LaundryDryerControlsTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _selectedDrynessLevel: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum? /* compiled code */

        internal final var _isSelectedDrynessLevelSet: kotlin.Boolean /* compiled code */

        public open val selectedDrynessLevel: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum? /* compiled code */
            public open get

        public final fun setSelectedDrynessLevel(value: com.google.home.matter.standard.LaundryDryerControlsTrait.DrynessLevelEnum?): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

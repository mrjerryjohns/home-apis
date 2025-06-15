// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object LaundryWasherControlsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class NumberOfRinsesEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum> {
        @androidx.annotation.NonNull None,

        @androidx.annotation.NonNull Normal,

        @androidx.annotation.NonNull Extra,

        @androidx.annotation.NonNull Max,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(spin: kotlin.Boolean = COMPILED_CODE, rinse: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.LaundryWasherControlsTrait.Feature> {
            private const final val SPIN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RINSE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.LaundryWasherControlsTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.LaundryWasherControlsTrait.Feature { /* compiled code */ }
        }

        public final val spin: kotlin.Boolean /* compiled code */

        public final val rinse: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(spin: kotlin.Boolean = COMPILED_CODE, rinse: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.LaundryWasherControlsTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes { /* compiled code */ }
        }

        public abstract val spinSpeeds: kotlin.collections.List<kotlin.String>?

        public abstract val spinSpeedCurrent: kotlin.UByte?

        public abstract val numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum?

        public abstract val supportedRinses: kotlin.collections.List<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.LaundryWasherControlsTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(spinSpeeds: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, spinSpeedCurrent: kotlin.UByte? = COMPILED_CODE, numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum? = COMPILED_CODE, supportedRinses: kotlin.collections.List<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.LaundryWasherControlsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes, com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes) { /* compiled code */ }

        public open val spinSpeeds: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val spinSpeedCurrent: kotlin.UByte? /* compiled code */

        public open val numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum? /* compiled code */

        public open val supportedRinses: kotlin.collections.List<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.LaundryWasherControlsTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(spinSpeeds: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, spinSpeedCurrent: kotlin.UByte? = COMPILED_CODE, numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum? = COMPILED_CODE, supportedRinses: kotlin.collections.List<com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.LaundryWasherControlsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.LaundryWasherControlsTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.LaundryWasherControlsTrait.Attributes) : com.google.home.matter.standard.LaundryWasherControlsTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LaundryWasherControlsTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _spinSpeedCurrent: kotlin.UByte? /* compiled code */

        internal final var _isSpinSpeedCurrentSet: kotlin.Boolean /* compiled code */

        public open val spinSpeedCurrent: kotlin.UByte? /* compiled code */
            public open get

        internal final var _numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum? /* compiled code */

        public open val numberOfRinses: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum? /* compiled code */
            public open get

        public final fun setSpinSpeedCurrent(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setNumberOfRinses(value: com.google.home.matter.standard.LaundryWasherControlsTrait.NumberOfRinsesEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}


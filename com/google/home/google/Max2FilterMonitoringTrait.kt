// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object Max2FilterMonitoringTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ChangeIndication private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.Max2FilterMonitoringTrait.ChangeIndication> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Ok,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.Max2FilterMonitoringTrait.ChangeIndication> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class FilterMonitoringFeature public constructor(warning: kotlin.Boolean = COMPILED_CODE, condition: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.Max2FilterMonitoringTrait.FilterMonitoringFeature> {
            private const final val WARNING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CONDITION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.Max2FilterMonitoringTrait.FilterMonitoringFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.Max2FilterMonitoringTrait.FilterMonitoringFeature { /* compiled code */ }
        }

        public final val warning: kotlin.Boolean /* compiled code */

        public final val condition: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(warning: kotlin.Boolean = COMPILED_CODE, condition: kotlin.Boolean = COMPILED_CODE): com.google.home.google.Max2FilterMonitoringTrait.FilterMonitoringFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.Max2FilterMonitoringTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.Max2FilterMonitoringTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.Max2FilterMonitoringTrait.Attributes { /* compiled code */ }
        }

        public abstract val condition: kotlin.UInt?

        public abstract val changeIndication: com.google.home.google.Max2FilterMonitoringTrait.ChangeIndication?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(condition: kotlin.UInt? = COMPILED_CODE, changeIndication: com.google.home.google.Max2FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.Max2FilterMonitoringTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.Max2FilterMonitoringTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.Max2FilterMonitoringTrait.Attributes) { /* compiled code */ }

        public open val condition: kotlin.UInt? /* compiled code */

        public open val changeIndication: com.google.home.google.Max2FilterMonitoringTrait.ChangeIndication? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(condition: kotlin.UInt? = COMPILED_CODE, changeIndication: com.google.home.google.Max2FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.Max2FilterMonitoringTrait.AttributesImpl { /* compiled code */ }
    }
}

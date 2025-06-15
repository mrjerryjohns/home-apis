// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object FilterMonitoringTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ChangeIndication private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.FilterMonitoringTrait.ChangeIndication> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Ok,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.FilterMonitoringTrait.ChangeIndication> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class FilterMonitoringFeature public constructor(warning: kotlin.Boolean = COMPILED_CODE, condition: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature> {
            private const final val WARNING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CONDITION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature { /* compiled code */ }
        }

        public final val warning: kotlin.Boolean /* compiled code */

        public final val condition: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(warning: kotlin.Boolean = COMPILED_CODE, condition: kotlin.Boolean = COMPILED_CODE): com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface FilterChangeIndicationCleanliness {
        public abstract val priority: kotlin.Int?

        public abstract val changeIndication: com.google.home.google.FilterMonitoringTrait.ChangeIndication?
    }

    public final class FilterChangeIndicationCleanlinessImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, changeIndication: com.google.home.google.FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE) : com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationCleanliness {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationCleanliness> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationCleanliness): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationCleanliness { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val changeIndication: com.google.home.google.FilterMonitoringTrait.ChangeIndication? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface FilterChangeIndicationLifetime {
        public abstract val priority: kotlin.Int?

        public abstract val changeIndication: com.google.home.google.FilterMonitoringTrait.ChangeIndication?
    }

    public final class FilterChangeIndicationLifetimeImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, changeIndication: com.google.home.google.FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE) : com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationLifetime {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationLifetime> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationLifetime): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.FilterMonitoringTrait.FilterChangeIndicationLifetime { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val changeIndication: com.google.home.google.FilterMonitoringTrait.ChangeIndication? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface FilterMonitoringSensorError {
        public abstract val priority: kotlin.Int?

        public abstract val errorCode: kotlin.String?
    }

    public final class FilterMonitoringSensorErrorImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.FilterMonitoringTrait.FilterMonitoringSensorError {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.FilterMonitoringTrait.FilterMonitoringSensorError> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.FilterMonitoringTrait.FilterMonitoringSensorError): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.FilterMonitoringTrait.FilterMonitoringSensorError { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.FilterMonitoringTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.FilterMonitoringTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.FilterMonitoringTrait.Attributes { /* compiled code */ }
        }

        public abstract val condition: kotlin.UInt?

        public abstract val changeIndicationCleanliness: com.google.home.google.FilterMonitoringTrait.ChangeIndication?

        public abstract val changeIndicationLifetime: com.google.home.google.FilterMonitoringTrait.ChangeIndication?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(condition: kotlin.UInt? = COMPILED_CODE, changeIndicationCleanliness: com.google.home.google.FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE, changeIndicationLifetime: com.google.home.google.FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.FilterMonitoringTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.FilterMonitoringTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.FilterMonitoringTrait.Attributes) { /* compiled code */ }

        public open val condition: kotlin.UInt? /* compiled code */

        public open val changeIndicationCleanliness: com.google.home.google.FilterMonitoringTrait.ChangeIndication? /* compiled code */

        public open val changeIndicationLifetime: com.google.home.google.FilterMonitoringTrait.ChangeIndication? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(condition: kotlin.UInt? = COMPILED_CODE, changeIndicationCleanliness: com.google.home.google.FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE, changeIndicationLifetime: com.google.home.google.FilterMonitoringTrait.ChangeIndication? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.FilterMonitoringTrait.FilterMonitoringFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.FilterMonitoringTrait.AttributesImpl { /* compiled code */ }
    }
}

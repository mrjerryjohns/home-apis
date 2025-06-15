// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object SoftwareDiagnosticsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(watermarks: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature> {
            private const final val WATERMARKS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature { /* compiled code */ }
        }

        public final val watermarks: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(watermarks: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SoftwareFault {
        public abstract val id: kotlin.ULong?

        public abstract val name: kotlin.String?

        public abstract val faultRecording: kotlin.ByteArray?
    }

    public final class SoftwareFaultImpl public constructor(id: kotlin.ULong? = COMPILED_CODE, name: kotlin.String? = COMPILED_CODE, faultRecording: kotlin.ByteArray? = COMPILED_CODE) : com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault { /* compiled code */ }
        }

        public open val id: kotlin.ULong? /* compiled code */

        public open val name: kotlin.String? /* compiled code */

        public open val faultRecording: kotlin.ByteArray? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ThreadMetricsStruct public constructor(id: kotlin.ULong = COMPILED_CODE, name: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, stackFreeCurrent: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, stackFreeMinimum: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, stackSize: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct?>.id: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct?>.name: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct?>.stackFreeCurrent: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct?>.stackFreeMinimum: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct?>.stackSize: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UInt>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct { /* compiled code */ }
        }

        public final val id: kotlin.ULong /* compiled code */

        public final val name: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val stackFreeCurrent: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val stackFreeMinimum: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public final val stackSize: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct.StructFields> {
            @androidx.annotation.NonNull id,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull stackFreeCurrent,

            @androidx.annotation.NonNull stackFreeMinimum,

            @androidx.annotation.NonNull stackSize;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes { /* compiled code */ }
        }

        public abstract val threadMetrics: kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>?

        public abstract val currentHeapFree: kotlin.ULong?

        public abstract val currentHeapUsed: kotlin.ULong?

        public abstract val currentHeapHighWatermark: kotlin.ULong?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(threadMetrics: kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>? = COMPILED_CODE, currentHeapFree: kotlin.ULong? = COMPILED_CODE, currentHeapUsed: kotlin.ULong? = COMPILED_CODE, currentHeapHighWatermark: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes) { /* compiled code */ }

        public open val threadMetrics: kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>? /* compiled code */

        public open val currentHeapFree: kotlin.ULong? /* compiled code */

        public open val currentHeapUsed: kotlin.ULong? /* compiled code */

        public open val currentHeapHighWatermark: kotlin.ULong? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(threadMetrics: kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>? = COMPILED_CODE, currentHeapFree: kotlin.ULong? = COMPILED_CODE, currentHeapUsed: kotlin.ULong? = COMPILED_CODE, currentHeapHighWatermark: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.SoftwareDiagnosticsTrait.AttributesImpl { /* compiled code */ }
    }

    public object ResetWatermarksCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ResetWatermarksCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.SoftwareDiagnosticsTrait.ResetWatermarksCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.SoftwareDiagnosticsTrait.ResetWatermarksCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ResetWatermarksCommand.Request.CommandFields> {
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


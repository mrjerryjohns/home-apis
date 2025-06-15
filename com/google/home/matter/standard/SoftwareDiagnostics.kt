// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface SoftwareDiagnostics : com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.SoftwareDiagnosticsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.SoftwareDiagnostics> {
        public final val threadMetrics: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>?> /* compiled code */
            public final get

        public final val currentHeapFree: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val currentHeapUsed: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val currentHeapHighWatermark: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.threadMetrics: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.currentHeapFree: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.currentHeapUsed: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.currentHeapHighWatermark: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun resetWatermarks(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.SoftwareDiagnostics> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.SoftwareDiagnostics.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.SoftwareDiagnostics.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SoftwareDiagnostics.Attribute> {
        @androidx.annotation.NonNull threadMetrics,

        @androidx.annotation.NonNull currentHeapFree,

        @androidx.annotation.NonNull currentHeapUsed,

        @androidx.annotation.NonNull currentHeapHighWatermark,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.SoftwareDiagnostics.Command> {
        @androidx.annotation.NonNull ResetWatermarks;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class SoftwareFaultEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault) : com.google.home.Event, com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.SoftwareDiagnostics.SoftwareFaultEvent> {
            public final val id: com.google.home.automation.EventField<kotlin.ULong?> /* compiled code */
                public final get

            public final val name: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val faultRecording: com.google.home.automation.EventField<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics.SoftwareFaultEvent?>.id: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics.SoftwareFaultEvent?>.name: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.SoftwareDiagnostics.SoftwareFaultEvent?>.faultRecording: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.SoftwareDiagnosticsTrait.SoftwareFault /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val faultRecording: kotlin.ByteArray? /* compiled code */

        public open val id: kotlin.ULong? /* compiled code */

        public open val name: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.SoftwareDiagnostics.SoftwareFaultEvent.EventFields> {
            @androidx.annotation.NonNull id,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull faultRecording;

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


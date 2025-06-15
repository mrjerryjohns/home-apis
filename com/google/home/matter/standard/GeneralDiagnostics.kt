// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GeneralDiagnostics : com.google.home.matter.standard.GeneralDiagnosticsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.GeneralDiagnosticsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.GeneralDiagnostics> {
        public final val networkInterfaces: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>?> /* compiled code */
            public final get

        public final val rebootCount: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val upTime: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val totalOperationalHours: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val bootReason: com.google.home.automation.Attribute<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum?> /* compiled code */
            public final get

        public final val activeHardwareFaults: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?> /* compiled code */
            public final get

        public final val activeRadioFaults: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?> /* compiled code */
            public final get

        public final val activeNetworkFaults: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
            public final get

        public final val testEventTriggersEnabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.networkInterfaces: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkInterface>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.rebootCount: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.upTime: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.totalOperationalHours: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.bootReason: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.activeHardwareFaults: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.activeRadioFaults: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.activeNetworkFaults: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.testEventTriggersEnabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralDiagnosticsTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun testEventTrigger(enableKey: kotlin.ByteArray, eventTrigger: kotlin.ULong): com.google.home.automation.Command { /* compiled code */ }

        public final fun timeSnapshot(): com.google.home.automation.Command { /* compiled code */ }

        public final fun payloadTestRequest(enableKey: kotlin.ByteArray, value: kotlin.UByte, count: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.GeneralDiagnostics> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.GeneralDiagnostics.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.GeneralDiagnostics.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnostics.Attribute> {
        @androidx.annotation.NonNull networkInterfaces,

        @androidx.annotation.NonNull rebootCount,

        @androidx.annotation.NonNull upTime,

        @androidx.annotation.NonNull totalOperationalHours,

        @androidx.annotation.NonNull bootReason,

        @androidx.annotation.NonNull activeHardwareFaults,

        @androidx.annotation.NonNull activeRadioFaults,

        @androidx.annotation.NonNull activeNetworkFaults,

        @androidx.annotation.NonNull testEventTriggersEnabled,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.GeneralDiagnostics.Command> {
        @androidx.annotation.NonNull TestEventTrigger,

        @androidx.annotation.NonNull TimeSnapshot,

        @androidx.annotation.NonNull PayloadTestRequest;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class HardwareFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange) : com.google.home.Event, com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.GeneralDiagnostics.HardwareFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.HardwareFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.HardwareFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.HardwareFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnostics.HardwareFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

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

    public final class RadioFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange) : com.google.home.Event, com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.GeneralDiagnostics.RadioFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.RadioFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.RadioFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.RadioFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnostics.RadioFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

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

    public final class NetworkFaultChangeEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange) : com.google.home.Event, com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.GeneralDiagnostics.NetworkFaultChangeEvent> {
            public final val current: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public final val previous: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.NetworkFaultChangeEvent?>.current: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.NetworkFaultChangeEvent?>.previous: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultChange /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open val previous: kotlin.collections.List<com.google.home.matter.standard.GeneralDiagnosticsTrait.NetworkFaultEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnostics.NetworkFaultChangeEvent.EventFields> {
            @androidx.annotation.NonNull current,

            @androidx.annotation.NonNull previous;

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

    public final class BootReasonEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason) : com.google.home.Event, com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.GeneralDiagnostics.BootReasonEvent> {
            public final val bootReason: com.google.home.automation.EventField<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralDiagnostics.BootReasonEvent?>.bootReason: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReason /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val bootReason: com.google.home.matter.standard.GeneralDiagnosticsTrait.BootReasonEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralDiagnostics.BootReasonEvent.EventFields> {
            @androidx.annotation.NonNull bootReason;

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


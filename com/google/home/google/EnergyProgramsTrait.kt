// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object EnergyProgramsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class EventType private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.EventType> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull TemperatureSetpointOffset,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.EnergyProgramsTrait.EventType> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class EventStatus private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.EventStatus> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Scheduled,

        @androidx.annotation.NonNull Running,

        @androidx.annotation.NonNull OptOutDirect,

        @androidx.annotation.NonNull OptOutIndirect,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.EnergyProgramsTrait.EventStatus> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class ProgramNameSynonym public constructor(synonyms: kotlin.collections.List<kotlin.String> = COMPILED_CODE, lang: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym?>.synonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym?>.lang: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym { /* compiled code */ }
        }

        public final val synonyms: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val lang: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym.StructFields> {
            @androidx.annotation.NonNull synonyms,

            @androidx.annotation.NonNull lang;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class EnergyProgram public constructor(programName: kotlin.String = COMPILED_CODE, programNameSynonyms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.EnergyProgram>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgram?>.programName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgram?>.programNameSynonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.EnergyProgram): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.EnergyProgram { /* compiled code */ }
        }

        public final val programName: kotlin.String /* compiled code */

        public final val programNameSynonyms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.ProgramNameSynonym> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.EnergyProgram.StructFields> {
            @androidx.annotation.NonNull programName,

            @androidx.annotation.NonNull programNameSynonyms;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Value public constructor(floatValue: kotlin.Double = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.Value>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.Value?>.floatValue: com.google.home.automation.TypedExpression<kotlin.Double> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.Value): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.Value { /* compiled code */ }
        }

        public final val floatValue: kotlin.Double /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.Value.StructFields> {
            @androidx.annotation.NonNull floatValue;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Segment public constructor(startTimeUnixTimestampSeconds: kotlin.Long = COMPILED_CODE, endTimeUnixTimestampSeconds: kotlin.Long = COMPILED_CODE, value: com.google.home.google.EnergyProgramsTrait.Value = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.Segment>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.Segment?>.startTimeUnixTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.Segment?>.endTimeUnixTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.Segment?>.value: com.google.home.automation.TypedExpression<com.google.home.google.EnergyProgramsTrait.Value> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.Segment): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.Segment { /* compiled code */ }
        }

        public final val startTimeUnixTimestampSeconds: kotlin.Long /* compiled code */

        public final val endTimeUnixTimestampSeconds: kotlin.Long /* compiled code */

        public final val value: com.google.home.google.EnergyProgramsTrait.Value /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.Segment.StructFields> {
            @androidx.annotation.NonNull startTimeUnixTimestampSeconds,

            @androidx.annotation.NonNull endTimeUnixTimestampSeconds,

            @androidx.annotation.NonNull value;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class EnergyProgramEvent public constructor(eventId: kotlin.String = COMPILED_CODE, eventType: com.google.home.google.EnergyProgramsTrait.EventType = COMPILED_CODE, eventStatus: com.google.home.google.EnergyProgramsTrait.EventStatus = COMPILED_CODE, programName: kotlin.String = COMPILED_CODE, segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent?>.eventId: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent?>.eventType: com.google.home.automation.TypedExpression<com.google.home.google.EnergyProgramsTrait.EventType> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent?>.eventStatus: com.google.home.automation.TypedExpression<com.google.home.google.EnergyProgramsTrait.EventStatus> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent?>.programName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent?>.segments: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent { /* compiled code */ }
        }

        public final val eventId: kotlin.String /* compiled code */

        public final val eventType: com.google.home.google.EnergyProgramsTrait.EventType /* compiled code */

        public final val eventStatus: com.google.home.google.EnergyProgramsTrait.EventStatus /* compiled code */

        public final val programName: kotlin.String /* compiled code */

        public final val segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent.StructFields> {
            @androidx.annotation.NonNull eventId,

            @androidx.annotation.NonNull eventType,

            @androidx.annotation.NonNull eventStatus,

            @androidx.annotation.NonNull programName,

            @androidx.annotation.NonNull segments;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.Attributes { /* compiled code */ }
        }

        public abstract val enrolledEnergyPrograms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>?

        public abstract val activeEnergyPrograms: kotlin.collections.List<kotlin.String>?

        public abstract val scheduledEnergyProgramEvents: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(enrolledEnergyPrograms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>? = COMPILED_CODE, activeEnergyPrograms: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, scheduledEnergyProgramEvents: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.EnergyProgramsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.EnergyProgramsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.EnergyProgramsTrait.Attributes) { /* compiled code */ }

        public open val enrolledEnergyPrograms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>? /* compiled code */

        public open val activeEnergyPrograms: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val scheduledEnergyProgramEvents: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(enrolledEnergyPrograms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>? = COMPILED_CODE, activeEnergyPrograms: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, scheduledEnergyProgramEvents: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.EnergyProgramsTrait.AttributesImpl { /* compiled code */ }
    }

    public object ScheduleEnergyProgramEventCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(eventId: kotlin.String = COMPILED_CODE, eventType: com.google.home.google.EnergyProgramsTrait.EventType = COMPILED_CODE, programName: kotlin.String = COMPILED_CODE, segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.ScheduleEnergyProgramEventCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.ScheduleEnergyProgramEventCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.ScheduleEnergyProgramEventCommand.Request { /* compiled code */ }
            }

            public final val eventId: kotlin.String /* compiled code */

            public final val eventType: com.google.home.google.EnergyProgramsTrait.EventType /* compiled code */

            public final val programName: kotlin.String /* compiled code */

            public final val segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.ScheduleEnergyProgramEventCommand.Request.CommandFields> {
                @androidx.annotation.NonNull eventId,

                @androidx.annotation.NonNull eventType,

                @androidx.annotation.NonNull programName,

                @androidx.annotation.NonNull segments;

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

    public object CancelEnergyProgramEventCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(eventId: kotlin.String = COMPILED_CODE, programName: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.EnergyProgramsTrait.CancelEnergyProgramEventCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.EnergyProgramsTrait.CancelEnergyProgramEventCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.EnergyProgramsTrait.CancelEnergyProgramEventCommand.Request { /* compiled code */ }
            }

            public final val eventId: kotlin.String /* compiled code */

            public final val programName: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.EnergyProgramsTrait.CancelEnergyProgramEventCommand.Request.CommandFields> {
                @androidx.annotation.NonNull eventId,

                @androidx.annotation.NonNull programName;

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

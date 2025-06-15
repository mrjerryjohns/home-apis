// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object RvcOperationalStateTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ErrorStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateEnum> {
        @androidx.annotation.NonNull NoError,

        @androidx.annotation.NonNull UnableToStartOrResume,

        @androidx.annotation.NonNull UnableToCompleteOperation,

        @androidx.annotation.NonNull CommandInvalidInState,

        @androidx.annotation.NonNull FailedToFindChargingDock,

        @androidx.annotation.NonNull Stuck,

        @androidx.annotation.NonNull DustBinMissing,

        @androidx.annotation.NonNull DustBinFull,

        @androidx.annotation.NonNull WaterTankEmpty,

        @androidx.annotation.NonNull WaterTankMissing,

        @androidx.annotation.NonNull WaterTankLidOpen,

        @androidx.annotation.NonNull MopCleaningPadMissing,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class OperationalStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateEnum> {
        @androidx.annotation.NonNull Stopped,

        @androidx.annotation.NonNull Running,

        @androidx.annotation.NonNull Paused,

        @androidx.annotation.NonNull Error,

        @androidx.annotation.NonNull SeekingCharger,

        @androidx.annotation.NonNull Charging,

        @androidx.annotation.NonNull Docked,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface OperationalError {
        public abstract val errorState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?
    }

    public final class OperationalErrorImpl public constructor(errorState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct? = COMPILED_CODE) : com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.OperationalError { /* compiled code */ }
        }

        public open val errorState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface OperationCompletion {
        public abstract val completionErrorCode: kotlin.UByte?

        public abstract val totalOperationalTime: kotlin.UInt?

        public abstract val pausedTime: kotlin.UInt?
    }

    public final class OperationCompletionImpl public constructor(completionErrorCode: kotlin.UByte? = COMPILED_CODE, totalOperationalTime: kotlin.UInt? = COMPILED_CODE, pausedTime: kotlin.UInt? = COMPILED_CODE) : com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.OperationCompletion { /* compiled code */ }
        }

        public open val completionErrorCode: kotlin.UByte? /* compiled code */

        public open val totalOperationalTime: kotlin.UInt? /* compiled code */

        public open val pausedTime: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ErrorStateStruct public constructor(errorStateId: kotlin.UByte = COMPILED_CODE, errorStateLabel: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, errorStateDetails: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?>.errorStateId: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?>.errorStateLabel: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?>.errorStateDetails: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct { /* compiled code */ }
        }

        public final val errorStateId: kotlin.UByte /* compiled code */

        public final val errorStateLabel: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val errorStateDetails: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct.StructFields> {
            @androidx.annotation.NonNull errorStateId,

            @androidx.annotation.NonNull errorStateLabel,

            @androidx.annotation.NonNull errorStateDetails;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class OperationalStateStruct public constructor(operationalStateId: kotlin.UByte = COMPILED_CODE, operationalStateLabel: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct?>.operationalStateId: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct?>.operationalStateLabel: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct { /* compiled code */ }
        }

        public final val operationalStateId: kotlin.UByte /* compiled code */

        public final val operationalStateLabel: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct.StructFields> {
            @androidx.annotation.NonNull operationalStateId,

            @androidx.annotation.NonNull operationalStateLabel;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.Attributes { /* compiled code */ }
        }

        public abstract val phaseList: kotlin.collections.List<kotlin.String>?

        public abstract val currentPhase: kotlin.UByte?

        public abstract val countdownTime: kotlin.UInt?

        public abstract val operationalStateList: kotlin.collections.List<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>?

        public abstract val operationalState: kotlin.UByte?

        public abstract val operationalError: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(phaseList: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, currentPhase: kotlin.UByte? = COMPILED_CODE, countdownTime: kotlin.UInt? = COMPILED_CODE, operationalStateList: kotlin.collections.List<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>? = COMPILED_CODE, operationalState: kotlin.UByte? = COMPILED_CODE, operationalError: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.RvcOperationalStateTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.RvcOperationalStateTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.RvcOperationalStateTrait.Attributes) { /* compiled code */ }

        public open val phaseList: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val currentPhase: kotlin.UByte? /* compiled code */

        public open val countdownTime: kotlin.UInt? /* compiled code */

        public open val operationalStateList: kotlin.collections.List<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>? /* compiled code */

        public open val operationalState: kotlin.UByte? /* compiled code */

        public open val operationalError: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(phaseList: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, currentPhase: kotlin.UByte? = COMPILED_CODE, countdownTime: kotlin.UInt? = COMPILED_CODE, operationalStateList: kotlin.collections.List<com.google.home.matter.standard.RvcOperationalStateTrait.OperationalStateStruct>? = COMPILED_CODE, operationalState: kotlin.UByte? = COMPILED_CODE, operationalError: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.RvcOperationalStateTrait.AttributesImpl { /* compiled code */ }
    }

    public object PauseCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Request.CommandFields> {
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

        public final class Response public constructor(commandResponseState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response { /* compiled code */ }
            }

            public final val commandResponseState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response.CommandFields> {
                @androidx.annotation.NonNull commandResponseState;

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

    public object ResumeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Request.CommandFields> {
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

        public final class Response public constructor(commandResponseState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response { /* compiled code */ }
            }

            public final val commandResponseState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response.CommandFields> {
                @androidx.annotation.NonNull commandResponseState;

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

    public object GoHomeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Request.CommandFields> {
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

        public final class Response public constructor(commandResponseState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response { /* compiled code */ }
            }

            public final val commandResponseState: com.google.home.matter.standard.RvcOperationalStateTrait.ErrorStateStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response.CommandFields> {
                @androidx.annotation.NonNull commandResponseState;

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


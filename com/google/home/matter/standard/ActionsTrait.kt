// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ActionsTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ActionErrorEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.ActionErrorEnum> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Interrupted,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ActionsTrait.ActionErrorEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ActionStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.ActionStateEnum> {
        @androidx.annotation.NonNull Inactive,

        @androidx.annotation.NonNull Active,

        @androidx.annotation.NonNull Paused,

        @androidx.annotation.NonNull Disabled,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ActionsTrait.ActionStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ActionTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.ActionTypeEnum> {
        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull Scene,

        @androidx.annotation.NonNull Sequence,

        @androidx.annotation.NonNull Automation,

        @androidx.annotation.NonNull Exception,

        @androidx.annotation.NonNull Notification,

        @androidx.annotation.NonNull Alarm,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ActionsTrait.ActionTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class EndpointListTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.EndpointListTypeEnum> {
        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull Room,

        @androidx.annotation.NonNull Zone,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ActionsTrait.EndpointListTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class CommandBits public constructor(instantAction: kotlin.Boolean = COMPILED_CODE, instantActionWithTransition: kotlin.Boolean = COMPILED_CODE, startAction: kotlin.Boolean = COMPILED_CODE, startActionWithDuration: kotlin.Boolean = COMPILED_CODE, stopAction: kotlin.Boolean = COMPILED_CODE, pauseAction: kotlin.Boolean = COMPILED_CODE, pauseActionWithDuration: kotlin.Boolean = COMPILED_CODE, resumeAction: kotlin.Boolean = COMPILED_CODE, enableAction: kotlin.Boolean = COMPILED_CODE, enableActionWithDuration: kotlin.Boolean = COMPILED_CODE, disableAction: kotlin.Boolean = COMPILED_CODE, disableActionWithDuration: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ActionsTrait.CommandBits> {
            private const final val INSTANT_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val INSTANT_ACTION_WITH_TRANSITION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val START_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val START_ACTION_WITH_DURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val STOP_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PAUSE_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val PAUSE_ACTION_WITH_DURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val RESUME_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ENABLE_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ENABLE_ACTION_WITH_DURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DISABLE_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DISABLE_ACTION_WITH_DURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ActionsTrait.CommandBits): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ActionsTrait.CommandBits { /* compiled code */ }
        }

        public final val instantAction: kotlin.Boolean /* compiled code */

        public final val instantActionWithTransition: kotlin.Boolean /* compiled code */

        public final val startAction: kotlin.Boolean /* compiled code */

        public final val startActionWithDuration: kotlin.Boolean /* compiled code */

        public final val stopAction: kotlin.Boolean /* compiled code */

        public final val pauseAction: kotlin.Boolean /* compiled code */

        public final val pauseActionWithDuration: kotlin.Boolean /* compiled code */

        public final val resumeAction: kotlin.Boolean /* compiled code */

        public final val enableAction: kotlin.Boolean /* compiled code */

        public final val enableActionWithDuration: kotlin.Boolean /* compiled code */

        public final val disableAction: kotlin.Boolean /* compiled code */

        public final val disableActionWithDuration: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component7(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component8(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component9(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component10(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component11(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component12(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(instantAction: kotlin.Boolean = COMPILED_CODE, instantActionWithTransition: kotlin.Boolean = COMPILED_CODE, startAction: kotlin.Boolean = COMPILED_CODE, startActionWithDuration: kotlin.Boolean = COMPILED_CODE, stopAction: kotlin.Boolean = COMPILED_CODE, pauseAction: kotlin.Boolean = COMPILED_CODE, pauseActionWithDuration: kotlin.Boolean = COMPILED_CODE, resumeAction: kotlin.Boolean = COMPILED_CODE, enableAction: kotlin.Boolean = COMPILED_CODE, enableActionWithDuration: kotlin.Boolean = COMPILED_CODE, disableAction: kotlin.Boolean = COMPILED_CODE, disableActionWithDuration: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ActionsTrait.CommandBits { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface StateChanged {
        public abstract val actionId: kotlin.UShort?

        public abstract val invokeId: kotlin.UInt?

        public abstract val newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum?
    }

    public final class StateChangedImpl public constructor(actionId: kotlin.UShort? = COMPILED_CODE, invokeId: kotlin.UInt? = COMPILED_CODE, newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum? = COMPILED_CODE) : com.google.home.matter.standard.ActionsTrait.StateChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.StateChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.StateChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.StateChanged { /* compiled code */ }
        }

        public open val actionId: kotlin.UShort? /* compiled code */

        public open val invokeId: kotlin.UInt? /* compiled code */

        public open val newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ActionFailed {
        public abstract val actionId: kotlin.UShort?

        public abstract val invokeId: kotlin.UInt?

        public abstract val newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum?

        public abstract val error: com.google.home.matter.standard.ActionsTrait.ActionErrorEnum?
    }

    public final class ActionFailedImpl public constructor(actionId: kotlin.UShort? = COMPILED_CODE, invokeId: kotlin.UInt? = COMPILED_CODE, newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum? = COMPILED_CODE, error: com.google.home.matter.standard.ActionsTrait.ActionErrorEnum? = COMPILED_CODE) : com.google.home.matter.standard.ActionsTrait.ActionFailed {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.ActionFailed> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.ActionFailed): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.ActionFailed { /* compiled code */ }
        }

        public open val actionId: kotlin.UShort? /* compiled code */

        public open val invokeId: kotlin.UInt? /* compiled code */

        public open val newState: com.google.home.matter.standard.ActionsTrait.ActionStateEnum? /* compiled code */

        public open val error: com.google.home.matter.standard.ActionsTrait.ActionErrorEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ActionStruct public constructor(actionId: kotlin.UShort = COMPILED_CODE, name: kotlin.String = COMPILED_CODE, type: com.google.home.matter.standard.ActionsTrait.ActionTypeEnum = COMPILED_CODE, endpointListId: kotlin.UShort = COMPILED_CODE, supportedCommands: com.google.home.matter.standard.ActionsTrait.CommandBits = COMPILED_CODE, state: com.google.home.matter.standard.ActionsTrait.ActionStateEnum = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.ActionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.ActionStruct?>.actionId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.ActionStruct?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.ActionStruct?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.ActionTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.ActionStruct?>.endpointListId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.ActionStruct?>.supportedCommands: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.CommandBits> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.ActionStruct?>.state: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.ActionStateEnum> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.ActionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.ActionStruct { /* compiled code */ }
        }

        public final val actionId: kotlin.UShort /* compiled code */

        public final val name: kotlin.String /* compiled code */

        public final val type: com.google.home.matter.standard.ActionsTrait.ActionTypeEnum /* compiled code */

        public final val endpointListId: kotlin.UShort /* compiled code */

        public final val supportedCommands: com.google.home.matter.standard.ActionsTrait.CommandBits /* compiled code */

        public final val state: com.google.home.matter.standard.ActionsTrait.ActionStateEnum /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.ActionStruct.StructFields> {
            @androidx.annotation.NonNull actionId,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull type,

            @androidx.annotation.NonNull endpointListId,

            @androidx.annotation.NonNull supportedCommands,

            @androidx.annotation.NonNull state;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class EndpointListStruct public constructor(endpointListId: kotlin.UShort = COMPILED_CODE, name: kotlin.String = COMPILED_CODE, type: com.google.home.matter.standard.ActionsTrait.EndpointListTypeEnum = COMPILED_CODE, endpoints: kotlin.collections.List<kotlin.UShort> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.EndpointListStruct?>.endpointListId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.EndpointListStruct?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.EndpointListStruct?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.standard.ActionsTrait.EndpointListTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ActionsTrait.EndpointListStruct?>.endpoints: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UShort>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.EndpointListStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.EndpointListStruct { /* compiled code */ }
        }

        public final val endpointListId: kotlin.UShort /* compiled code */

        public final val name: kotlin.String /* compiled code */

        public final val type: com.google.home.matter.standard.ActionsTrait.EndpointListTypeEnum /* compiled code */

        public final val endpoints: kotlin.collections.List<kotlin.UShort> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.EndpointListStruct.StructFields> {
            @androidx.annotation.NonNull endpointListId,

            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull type,

            @androidx.annotation.NonNull endpoints;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.Attributes { /* compiled code */ }
        }

        public abstract val actionList: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.ActionStruct>?

        public abstract val endpointLists: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>?

        public abstract val setupUrl: kotlin.String?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(actionList: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.ActionStruct>? = COMPILED_CODE, endpointLists: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>? = COMPILED_CODE, setupUrl: kotlin.String? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ActionsTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ActionsTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ActionsTrait.Attributes) { /* compiled code */ }

        public open val actionList: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.ActionStruct>? /* compiled code */

        public open val endpointLists: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>? /* compiled code */

        public open val setupUrl: kotlin.String? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(actionList: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.ActionStruct>? = COMPILED_CODE, endpointLists: kotlin.collections.List<com.google.home.matter.standard.ActionsTrait.EndpointListStruct>? = COMPILED_CODE, setupUrl: kotlin.String? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ActionsTrait.AttributesImpl { /* compiled code */ }
    }

    public object InstantActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.InstantActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.InstantActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.InstantActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.InstantActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object InstantActionWithTransitionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.InstantActionWithTransitionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId,

                @androidx.annotation.NonNull transitionTime;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object StartActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.StartActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.StartActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.StartActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.StartActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object StartActionWithDurationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, duration: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val duration: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.StartActionWithDurationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId,

                @androidx.annotation.NonNull duration;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object StopActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.StopActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.StopActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.StopActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.StopActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object PauseActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.PauseActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.PauseActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.PauseActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.PauseActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object PauseActionWithDurationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, duration: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val duration: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.PauseActionWithDurationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId,

                @androidx.annotation.NonNull duration;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object ResumeActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.ResumeActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object EnableActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.EnableActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.EnableActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.EnableActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.EnableActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object EnableActionWithDurationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, duration: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val duration: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.EnableActionWithDurationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId,

                @androidx.annotation.NonNull duration;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object DisableActionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.DisableActionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.DisableActionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.DisableActionCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.DisableActionCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }

    public object DisableActionWithDurationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(actionId: kotlin.UShort = COMPILED_CODE, invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, duration: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.Request { /* compiled code */ }
            }

            public final val actionId: kotlin.UShort /* compiled code */

            public final val invokeId: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val duration: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ActionsTrait.DisableActionWithDurationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull actionId,

                @androidx.annotation.NonNull invokeId,

                @androidx.annotation.NonNull duration;

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

        public interface OptionalArgs {
            public abstract var invokeId: kotlin.UInt
        }
    }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ValveConfigurationAndControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class StatusCodeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControlTrait.StatusCodeEnum> {
        @androidx.annotation.NonNull FailureDueToFault,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.StatusCodeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ValveStateEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum> {
        @androidx.annotation.NonNull Closed,

        @androidx.annotation.NonNull Open,

        @androidx.annotation.NonNull Transitioning,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(timeSync: kotlin.Boolean = COMPILED_CODE, level: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature> {
            private const final val TIME_SYNC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature { /* compiled code */ }
        }

        public final val timeSync: kotlin.Boolean /* compiled code */

        public final val level: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(timeSync: kotlin.Boolean = COMPILED_CODE, level: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class ValveFaultBitmap public constructor(generalFault: kotlin.Boolean = COMPILED_CODE, blocked: kotlin.Boolean = COMPILED_CODE, leaking: kotlin.Boolean = COMPILED_CODE, notConnected: kotlin.Boolean = COMPILED_CODE, shortCircuit: kotlin.Boolean = COMPILED_CODE, currentExceeded: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap> {
            private const final val GENERAL_FAULT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val BLOCKED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LEAKING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NOT_CONNECTED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SHORT_CIRCUIT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val CURRENT_EXCEEDED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap { /* compiled code */ }
        }

        public final val generalFault: kotlin.Boolean /* compiled code */

        public final val blocked: kotlin.Boolean /* compiled code */

        public final val leaking: kotlin.Boolean /* compiled code */

        public final val notConnected: kotlin.Boolean /* compiled code */

        public final val shortCircuit: kotlin.Boolean /* compiled code */

        public final val currentExceeded: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(generalFault: kotlin.Boolean = COMPILED_CODE, blocked: kotlin.Boolean = COMPILED_CODE, leaking: kotlin.Boolean = COMPILED_CODE, notConnected: kotlin.Boolean = COMPILED_CODE, shortCircuit: kotlin.Boolean = COMPILED_CODE, currentExceeded: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ValveStateChanged {
        public abstract val valveState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?

        public abstract val valveLevel: kotlin.UByte?
    }

    public final class ValveStateChangedImpl public constructor(valveState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? = COMPILED_CODE, valveLevel: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateChanged { /* compiled code */ }
        }

        public open val valveState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? /* compiled code */

        public open val valveLevel: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ValveFault {
        public abstract val valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap?
    }

    public final class ValveFaultImpl public constructor(valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? = COMPILED_CODE) : com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFault { /* compiled code */ }
        }

        public open val valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val openDuration: kotlin.UInt?

        public abstract val defaultOpenDuration: kotlin.UInt?

        public abstract val autoCloseTime: kotlin.ULong?

        public abstract val remainingDuration: kotlin.UInt?

        public abstract val currentState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?

        public abstract val targetState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum?

        public abstract val currentLevel: kotlin.UByte?

        public abstract val targetLevel: kotlin.UByte?

        public abstract val defaultOpenLevel: kotlin.UByte?

        public abstract val valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap?

        public abstract val levelStep: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(openDuration: kotlin.UInt? = COMPILED_CODE, defaultOpenDuration: kotlin.UInt? = COMPILED_CODE, autoCloseTime: kotlin.ULong? = COMPILED_CODE, remainingDuration: kotlin.UInt? = COMPILED_CODE, currentState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? = COMPILED_CODE, targetState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? = COMPILED_CODE, currentLevel: kotlin.UByte? = COMPILED_CODE, targetLevel: kotlin.UByte? = COMPILED_CODE, defaultOpenLevel: kotlin.UByte? = COMPILED_CODE, valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? = COMPILED_CODE, levelStep: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes, com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes) { /* compiled code */ }

        public open val openDuration: kotlin.UInt? /* compiled code */

        public open val defaultOpenDuration: kotlin.UInt? /* compiled code */

        public open val autoCloseTime: kotlin.ULong? /* compiled code */

        public open val remainingDuration: kotlin.UInt? /* compiled code */

        public open val currentState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? /* compiled code */

        public open val targetState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? /* compiled code */

        public open val currentLevel: kotlin.UByte? /* compiled code */

        public open val targetLevel: kotlin.UByte? /* compiled code */

        public open val defaultOpenLevel: kotlin.UByte? /* compiled code */

        public open val valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? /* compiled code */

        public open val levelStep: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(openDuration: kotlin.UInt? = COMPILED_CODE, defaultOpenDuration: kotlin.UInt? = COMPILED_CODE, autoCloseTime: kotlin.ULong? = COMPILED_CODE, remainingDuration: kotlin.UInt? = COMPILED_CODE, currentState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? = COMPILED_CODE, targetState: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveStateEnum? = COMPILED_CODE, currentLevel: kotlin.UByte? = COMPILED_CODE, targetLevel: kotlin.UByte? = COMPILED_CODE, defaultOpenLevel: kotlin.UByte? = COMPILED_CODE, valveFault: com.google.home.matter.standard.ValveConfigurationAndControlTrait.ValveFaultBitmap? = COMPILED_CODE, levelStep: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ValveConfigurationAndControlTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.ValveConfigurationAndControlTrait.Attributes) : com.google.home.matter.standard.ValveConfigurationAndControlTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ValveConfigurationAndControlTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _defaultOpenDuration: kotlin.UInt? /* compiled code */

        internal final var _isDefaultOpenDurationSet: kotlin.Boolean /* compiled code */

        public open val defaultOpenDuration: kotlin.UInt? /* compiled code */
            public open get

        internal final var _defaultOpenLevel: kotlin.UByte? /* compiled code */

        public open val defaultOpenLevel: kotlin.UByte? /* compiled code */
            public open get

        public final fun setDefaultOpenDuration(value: kotlin.UInt?): kotlin.Unit { /* compiled code */ }

        public final fun setDefaultOpenLevel(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object OpenCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(openDuration: com.google.home.matter.serialization.OptionalValue<kotlin.UInt?> = COMPILED_CODE, targetLevel: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.Request { /* compiled code */ }
            }

            public final val openDuration: com.google.home.matter.serialization.OptionalValue<kotlin.UInt?> /* compiled code */

            public final val targetLevel: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.Request.CommandFields> {
                @androidx.annotation.NonNull openDuration,

                @androidx.annotation.NonNull targetLevel;

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
            public abstract var openDuration: kotlin.UInt?

            public abstract var targetLevel: kotlin.UByte
        }
    }

    public object CloseCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ValveConfigurationAndControlTrait.CloseCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ValveConfigurationAndControlTrait.CloseCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ValveConfigurationAndControlTrait.CloseCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ValveConfigurationAndControlTrait.CloseCommand.Request.CommandFields> {
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


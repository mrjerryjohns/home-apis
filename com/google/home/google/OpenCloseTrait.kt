// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object OpenCloseTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class Direction private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.OpenCloseTrait.Direction> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull Left,

        @androidx.annotation.NonNull Right,

        @androidx.annotation.NonNull In,

        @androidx.annotation.NonNull Out,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.OpenCloseTrait.Direction> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.OpenCloseTrait.StatusEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.OpenCloseTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class OpenCloseFeature public constructor(supportsDiscreteOnlyOpenClose: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.google.OpenCloseTrait.OpenCloseFeature> {
            private const final val SUPPORTS_DISCRETE_ONLY_OPEN_CLOSE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.google.OpenCloseTrait.OpenCloseFeature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.google.OpenCloseTrait.OpenCloseFeature { /* compiled code */ }
        }

        public final val supportsDiscreteOnlyOpenClose: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(supportsDiscreteOnlyOpenClose: kotlin.Boolean = COMPILED_CODE): com.google.home.google.OpenCloseTrait.OpenCloseFeature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface OpenFollowUp {
    }

    public final class OpenFollowUpImpl public constructor() : com.google.home.google.OpenCloseTrait.OpenFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.OpenFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.OpenFollowUpImpl { /* compiled code */ }
        }
    }

    public interface CloseFollowUp {
    }

    public final class CloseFollowUpImpl public constructor() : com.google.home.google.OpenCloseTrait.CloseFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.CloseFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.CloseFollowUpImpl { /* compiled code */ }
        }
    }

    public interface GoToOpenPercentageFollowUp {
        public abstract val openPercent: kotlin.Double?
    }

    public final class GoToOpenPercentageFollowUpImpl public constructor(openPercent: kotlin.Double? = COMPILED_CODE) : com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.GoToOpenPercentageFollowUp { /* compiled code */ }
        }

        public open val openPercent: kotlin.Double? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface OpenCloseErrorFollowUp {
        public abstract val errorCode: kotlin.String?
    }

    public final class OpenCloseErrorFollowUpImpl public constructor(errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.OpenCloseErrorFollowUp { /* compiled code */ }
        }

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class DirectionOpenState public constructor(openPercent: kotlin.Double = COMPILED_CODE, openDirection: com.google.home.google.OpenCloseTrait.Direction = COMPILED_CODE, targetOpenPercent: kotlin.Double = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.DirectionOpenState>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenCloseTrait.DirectionOpenState?>.openPercent: com.google.home.automation.TypedExpression<kotlin.Double> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenCloseTrait.DirectionOpenState?>.openDirection: com.google.home.automation.TypedExpression<com.google.home.google.OpenCloseTrait.Direction> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.OpenCloseTrait.DirectionOpenState?>.targetOpenPercent: com.google.home.automation.TypedExpression<kotlin.Double> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.DirectionOpenState): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.DirectionOpenState { /* compiled code */ }
        }

        public final val openPercent: kotlin.Double /* compiled code */

        public final val openDirection: com.google.home.google.OpenCloseTrait.Direction /* compiled code */

        public final val targetOpenPercent: kotlin.Double /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenCloseTrait.DirectionOpenState.StructFields> {
            @androidx.annotation.NonNull openPercent,

            @androidx.annotation.NonNull openDirection,

            @androidx.annotation.NonNull targetOpenPercent;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedDirections: kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>?

        public abstract val openPercent: kotlin.Double?

        public abstract val targetOpenPercent: kotlin.Double?

        public abstract val openState: kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.google.OpenCloseTrait.OpenCloseFeature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedDirections: kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>? = COMPILED_CODE, openPercent: kotlin.Double? = COMPILED_CODE, targetOpenPercent: kotlin.Double? = COMPILED_CODE, openState: kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.OpenCloseTrait.OpenCloseFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.OpenCloseTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.OpenCloseTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.OpenCloseTrait.Attributes) { /* compiled code */ }

        public open val supportedDirections: kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>? /* compiled code */

        public open val openPercent: kotlin.Double? /* compiled code */

        public open val targetOpenPercent: kotlin.Double? /* compiled code */

        public open val openState: kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.google.OpenCloseTrait.OpenCloseFeature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedDirections: kotlin.collections.List<com.google.home.google.OpenCloseTrait.Direction>? = COMPILED_CODE, openPercent: kotlin.Double? = COMPILED_CODE, targetOpenPercent: kotlin.Double? = COMPILED_CODE, openState: kotlin.collections.List<com.google.home.google.OpenCloseTrait.DirectionOpenState>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.google.OpenCloseTrait.OpenCloseFeature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.OpenCloseTrait.AttributesImpl { /* compiled code */ }
    }

    public object OpenCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(openDirection: com.google.home.google.OpenCloseTrait.Direction = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.OpenCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.OpenCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.OpenCommand.Request { /* compiled code */ }
            }

            public final val openDirection: com.google.home.google.OpenCloseTrait.Direction /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenCloseTrait.OpenCommand.Request.CommandFields> {
                @androidx.annotation.NonNull openDirection;

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

    public object CloseCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.CloseCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.CloseCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.CloseCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenCloseTrait.CloseCommand.Request.CommandFields> {
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

    public object GoToOpenPercentageCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(openPercent: kotlin.Double = COMPILED_CODE, openDirection: com.google.home.google.OpenCloseTrait.Direction = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.GoToOpenPercentageCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.GoToOpenPercentageCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.GoToOpenPercentageCommand.Request { /* compiled code */ }
            }

            public final val openPercent: kotlin.Double /* compiled code */

            public final val openDirection: com.google.home.google.OpenCloseTrait.Direction /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenCloseTrait.GoToOpenPercentageCommand.Request.CommandFields> {
                @androidx.annotation.NonNull openPercent,

                @androidx.annotation.NonNull openDirection;

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

    public object StepCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(openRelativePercent: kotlin.Double = COMPILED_CODE, openDirection: com.google.home.google.OpenCloseTrait.Direction = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.OpenCloseTrait.StepCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.OpenCloseTrait.StepCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.OpenCloseTrait.StepCommand.Request { /* compiled code */ }
            }

            public final val openRelativePercent: kotlin.Double /* compiled code */

            public final val openDirection: com.google.home.google.OpenCloseTrait.Direction /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.OpenCloseTrait.StepCommand.Request.CommandFields> {
                @androidx.annotation.NonNull openRelativePercent,

                @androidx.annotation.NonNull openDirection;

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

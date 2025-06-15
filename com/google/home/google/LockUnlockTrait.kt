// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object LockUnlockTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class LockState private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.LockUnlockTrait.LockState> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Locked,

        @androidx.annotation.NonNull Unlocked,

        @androidx.annotation.NonNull Jammed,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.LockUnlockTrait.LockState> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.LockUnlockTrait.StatusEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Success,

        @androidx.annotation.NonNull Failure,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.LockUnlockTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface LockFollowUp {
    }

    public final class LockFollowUpImpl public constructor() : com.google.home.google.LockUnlockTrait.LockFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.LockUnlockTrait.LockFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.LockUnlockTrait.LockFollowUpImpl { /* compiled code */ }
        }
    }

    public interface UnlockFollowUp {
    }

    public final class UnlockFollowUpImpl public constructor() : com.google.home.google.LockUnlockTrait.UnlockFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.LockUnlockTrait.UnlockFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.LockUnlockTrait.UnlockFollowUpImpl { /* compiled code */ }
        }
    }

    public interface LockUnlockErrorFollowUp {
        public abstract val errorCode: kotlin.String?
    }

    public final class LockUnlockErrorFollowUpImpl public constructor(errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.LockUnlockTrait.LockUnlockErrorFollowUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.LockUnlockTrait.LockUnlockErrorFollowUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.LockUnlockTrait.LockUnlockErrorFollowUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.LockUnlockTrait.LockUnlockErrorFollowUp { /* compiled code */ }
        }

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.LockUnlockTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.LockUnlockTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.LockUnlockTrait.Attributes { /* compiled code */ }
        }

        public abstract val lockState: com.google.home.google.LockUnlockTrait.LockState?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(lockState: com.google.home.google.LockUnlockTrait.LockState? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.LockUnlockTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.LockUnlockTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.LockUnlockTrait.Attributes) { /* compiled code */ }

        public open val lockState: com.google.home.google.LockUnlockTrait.LockState? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(lockState: com.google.home.google.LockUnlockTrait.LockState? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.LockUnlockTrait.AttributesImpl { /* compiled code */ }
    }

    public object LockCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(followUpToken: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.LockUnlockTrait.LockCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.LockUnlockTrait.LockCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.LockUnlockTrait.LockCommand.Request { /* compiled code */ }
            }

            public final val followUpToken: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.LockUnlockTrait.LockCommand.Request.CommandFields> {
                @androidx.annotation.NonNull followUpToken;

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

    public object UnlockCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(followUpToken: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.LockUnlockTrait.UnlockCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.LockUnlockTrait.UnlockCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.LockUnlockTrait.UnlockCommand.Request { /* compiled code */ }
            }

            public final val followUpToken: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.LockUnlockTrait.UnlockCommand.Request.CommandFields> {
                @androidx.annotation.NonNull followUpToken;

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


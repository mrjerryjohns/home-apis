// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object DeviceLocationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class Location private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.DeviceLocationTrait.Location> {
        @androidx.annotation.NonNull Unknown,

        @androidx.annotation.NonNull Attic,

        @androidx.annotation.NonNull Basement,

        @androidx.annotation.NonNull Bathroom,

        @androidx.annotation.NonNull Bedroom,

        @androidx.annotation.NonNull Den,

        @androidx.annotation.NonNull DiningRoom,

        @androidx.annotation.NonNull Downstairs,

        @androidx.annotation.NonNull Entrance,

        @androidx.annotation.NonNull FamilyRoom,

        @androidx.annotation.NonNull Garage,

        @androidx.annotation.NonNull Hallway,

        @androidx.annotation.NonNull KidsRoom,

        @androidx.annotation.NonNull Kitchen,

        @androidx.annotation.NonNull LivingRoom,

        @androidx.annotation.NonNull MasterBedroom,

        @androidx.annotation.NonNull Office,

        @androidx.annotation.NonNull Upstairs,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.DeviceLocationTrait.Location> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DeviceLocationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DeviceLocationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DeviceLocationTrait.Attributes { /* compiled code */ }
        }

        public abstract val spokenLocation: com.google.home.google.DeviceLocationTrait.Location?

        public abstract val presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(spokenLocation: com.google.home.google.DeviceLocationTrait.Location? = COMPILED_CODE, presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.DeviceLocationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.google.DeviceLocationTrait.Attributes, com.google.home.google.DeviceLocationTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.google.DeviceLocationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.DeviceLocationTrait.Attributes) { /* compiled code */ }

        public open val spokenLocation: com.google.home.google.DeviceLocationTrait.Location? /* compiled code */

        public open val presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.google.DeviceLocationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.google.DeviceLocationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(spokenLocation: com.google.home.google.DeviceLocationTrait.Location? = COMPILED_CODE, presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.DeviceLocationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.DeviceLocationTrait.Attributes) : com.google.home.google.DeviceLocationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DeviceLocationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DeviceLocationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DeviceLocationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _spokenLocation: com.google.home.google.DeviceLocationTrait.Location? /* compiled code */

        public open val spokenLocation: com.google.home.google.DeviceLocationTrait.Location? /* compiled code */
            public open get

        internal final var _presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val presenceEnabledStructureIdList: kotlin.collections.List<kotlin.String>? /* compiled code */
            public open get

        public final fun setSpokenLocation(value: com.google.home.google.DeviceLocationTrait.Location): kotlin.Unit { /* compiled code */ }

        public final fun setPresenceEnabledStructureIdList(value: kotlin.collections.List<kotlin.String>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object SetSpokenLocationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(spokenLocation: com.google.home.google.DeviceLocationTrait.Location = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DeviceLocationTrait.SetSpokenLocationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DeviceLocationTrait.SetSpokenLocationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DeviceLocationTrait.SetSpokenLocationCommand.Request { /* compiled code */ }
            }

            public final val spokenLocation: com.google.home.google.DeviceLocationTrait.Location /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DeviceLocationTrait.SetSpokenLocationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull spokenLocation;

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

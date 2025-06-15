// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object GroupKeyManagementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class GroupKeySecurityPolicyEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySecurityPolicyEnum> {
        @androidx.annotation.NonNull TrustFirst,

        @androidx.annotation.NonNull CacheAndSync,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySecurityPolicyEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(cacheAndSync: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.Feature> {
            private const final val CACHE_AND_SYNC_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.GroupKeyManagementTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.GroupKeyManagementTrait.Feature { /* compiled code */ }
        }

        public final val cacheAndSync: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(cacheAndSync: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.GroupKeyManagementTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class GroupInfoMapStruct public constructor(groupId: kotlin.UShort = COMPILED_CODE, endpoints: kotlin.collections.List<kotlin.UShort> = COMPILED_CODE, groupName: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct?>.groupId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct?>.endpoints: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct?>.groupName: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct { /* compiled code */ }
        }

        public final val groupId: kotlin.UShort /* compiled code */

        public final val endpoints: kotlin.collections.List<kotlin.UShort> /* compiled code */

        public final val groupName: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct.StructFields> {
            @androidx.annotation.NonNull groupId,

            @androidx.annotation.NonNull endpoints,

            @androidx.annotation.NonNull groupName,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class GroupKeyMapStruct public constructor(groupId: kotlin.UShort = COMPILED_CODE, groupKeySetId: kotlin.UShort = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct?>.groupId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct?>.groupKeySetId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct { /* compiled code */ }
        }

        public final val groupId: kotlin.UShort /* compiled code */

        public final val groupKeySetId: kotlin.UShort /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct.StructFields> {
            @androidx.annotation.NonNull groupId,

            @androidx.annotation.NonNull groupKeySetId,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class GroupKeySetStruct public constructor(groupKeySetId: kotlin.UShort = COMPILED_CODE, groupKeySecurityPolicy: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySecurityPolicyEnum = COMPILED_CODE, epochKey0: kotlin.ByteArray? = COMPILED_CODE, epochStartTime0: kotlin.ULong? = COMPILED_CODE, epochKey1: kotlin.ByteArray? = COMPILED_CODE, epochStartTime1: kotlin.ULong? = COMPILED_CODE, epochKey2: kotlin.ByteArray? = COMPILED_CODE, epochStartTime2: kotlin.ULong? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.groupKeySetId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.groupKeySecurityPolicy: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySecurityPolicyEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.epochKey0: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.epochStartTime0: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.epochKey1: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.epochStartTime1: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.epochKey2: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct?>.epochStartTime2: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct { /* compiled code */ }
        }

        public final val groupKeySetId: kotlin.UShort /* compiled code */

        public final val groupKeySecurityPolicy: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySecurityPolicyEnum /* compiled code */

        public final val epochKey0: kotlin.ByteArray? /* compiled code */

        public final val epochStartTime0: kotlin.ULong? /* compiled code */

        public final val epochKey1: kotlin.ByteArray? /* compiled code */

        public final val epochStartTime1: kotlin.ULong? /* compiled code */

        public final val epochKey2: kotlin.ByteArray? /* compiled code */

        public final val epochStartTime2: kotlin.ULong? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct.StructFields> {
            @androidx.annotation.NonNull groupKeySetId,

            @androidx.annotation.NonNull groupKeySecurityPolicy,

            @androidx.annotation.NonNull epochKey0,

            @androidx.annotation.NonNull epochStartTime0,

            @androidx.annotation.NonNull epochKey1,

            @androidx.annotation.NonNull epochStartTime1,

            @androidx.annotation.NonNull epochKey2,

            @androidx.annotation.NonNull epochStartTime2;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.Attributes { /* compiled code */ }
        }

        public abstract val groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>?

        public abstract val groupTable: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct>?

        public abstract val maxGroupsPerFabric: kotlin.UShort?

        public abstract val maxGroupKeysPerFabric: kotlin.UShort?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.GroupKeyManagementTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>? = COMPILED_CODE, groupTable: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct>? = COMPILED_CODE, maxGroupsPerFabric: kotlin.UShort? = COMPILED_CODE, maxGroupKeysPerFabric: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.GroupKeyManagementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) :
        com.google.home.matter.standard.GroupKeyManagementTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.GroupKeyManagementTrait.Attributes, com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.GroupKeyManagementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.GroupKeyManagementTrait.Attributes) { /* compiled code */ }

        public open val groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>? /* compiled code */

        public open val groupTable: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct>? /* compiled code */

        public open val maxGroupsPerFabric: kotlin.UShort? /* compiled code */

        public open val maxGroupKeysPerFabric: kotlin.UShort? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.GroupKeyManagementTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.GroupKeyManagementTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>? = COMPILED_CODE, groupTable: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupInfoMapStruct>? = COMPILED_CODE, maxGroupsPerFabric: kotlin.UShort? = COMPILED_CODE, maxGroupKeysPerFabric: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.GroupKeyManagementTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE):
            com.google.home.matter.standard.GroupKeyManagementTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.GroupKeyManagementTrait.Attributes) : com.google.home.matter.standard.GroupKeyManagementTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>? /* compiled code */

        public open val groupKeyMap: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>? /* compiled code */
            public open get

        public final fun setGroupKeyMap(value: kotlin.collections.List<com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeyMapStruct>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object KeySetWriteCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetWriteCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.KeySetWriteCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetWriteCommand.Request { /* compiled code */ }
            }

            public final val groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetWriteCommand.Request.CommandFields> {
                @androidx.annotation.NonNull groupKeySet;

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

    public object KeySetReadCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(groupKeySetId: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Request { /* compiled code */ }
            }

            public final val groupKeySetId: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Request.CommandFields> {
                @androidx.annotation.NonNull groupKeySetId;

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

        public final class Response public constructor(groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response { /* compiled code */ }
            }

            public final val groupKeySet: com.google.home.matter.standard.GroupKeyManagementTrait.GroupKeySetStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadCommand.Response.CommandFields> {
                @androidx.annotation.NonNull groupKeySet;

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

    public object KeySetRemoveCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(groupKeySetId: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetRemoveCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.KeySetRemoveCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetRemoveCommand.Request { /* compiled code */ }
            }

            public final val groupKeySetId: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetRemoveCommand.Request.CommandFields> {
                @androidx.annotation.NonNull groupKeySetId;

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

    public object KeySetReadAllIndicesCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Request.CommandFields> {
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

        public final class Response public constructor(groupKeySetIds: kotlin.collections.List<kotlin.UShort> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response { /* compiled code */ }
            }

            public final val groupKeySetIds: kotlin.collections.List<kotlin.UShort> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GroupKeyManagementTrait.KeySetReadAllIndicesCommand.Response.CommandFields> {
                @androidx.annotation.NonNull groupKeySetIds;

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

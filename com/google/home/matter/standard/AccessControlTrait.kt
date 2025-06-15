// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object AccessControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AccessControlEntryAuthModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryAuthModeEnum> {
        @androidx.annotation.NonNull PASE,

        @androidx.annotation.NonNull CASE,

        @androidx.annotation.NonNull Group,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryAuthModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AccessControlEntryPrivilegeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryPrivilegeEnum> {
        @androidx.annotation.NonNull View,

        @androidx.annotation.NonNull ProxyView,

        @androidx.annotation.NonNull Operate,

        @androidx.annotation.NonNull Manage,

        @androidx.annotation.NonNull Administer,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryPrivilegeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class AccessRestrictionTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionTypeEnum> {
        @androidx.annotation.NonNull AttributeAccessForbidden,

        @androidx.annotation.NonNull AttributeWriteForbidden,

        @androidx.annotation.NonNull CommandForbidden,

        @androidx.annotation.NonNull EventForbidden,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ChangeTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum> {
        @androidx.annotation.NonNull Changed,

        @androidx.annotation.NonNull Added,

        @androidx.annotation.NonNull Removed,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(extension: kotlin.Boolean = COMPILED_CODE, managedDevice: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.AccessControlTrait.Feature> {
            private const final val EXTENSION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MANAGED_DEVICE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.AccessControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.AccessControlTrait.Feature { /* compiled code */ }
        }

        public final val extension: kotlin.Boolean /* compiled code */

        public final val managedDevice: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(extension: kotlin.Boolean = COMPILED_CODE, managedDevice: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.AccessControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AccessControlEntryChanged {
        public abstract val adminNodeId: kotlin.ULong?

        public abstract val adminPasscodeId: kotlin.UShort?

        public abstract val changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum?

        public abstract val latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct?

        public abstract val fabricIndex: kotlin.UByte?
    }

    public final class AccessControlEntryChangedImpl public constructor(adminNodeId: kotlin.ULong? = COMPILED_CODE, adminPasscodeId: kotlin.UShort? = COMPILED_CODE, changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum? = COMPILED_CODE, latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessControlEntryChanged { /* compiled code */ }
        }

        public open val adminNodeId: kotlin.ULong? /* compiled code */

        public open val adminPasscodeId: kotlin.UShort? /* compiled code */

        public open val changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum? /* compiled code */

        public open val latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AccessControlExtensionChanged {
        public abstract val adminNodeId: kotlin.ULong?

        public abstract val adminPasscodeId: kotlin.UShort?

        public abstract val changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum?

        public abstract val latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct?

        public abstract val fabricIndex: kotlin.UByte?
    }

    public final class AccessControlExtensionChangedImpl public constructor(adminNodeId: kotlin.ULong? = COMPILED_CODE, adminPasscodeId: kotlin.UShort? = COMPILED_CODE, changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum? = COMPILED_CODE, latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionChanged { /* compiled code */ }
        }

        public open val adminNodeId: kotlin.ULong? /* compiled code */

        public open val adminPasscodeId: kotlin.UShort? /* compiled code */

        public open val changeType: com.google.home.matter.standard.AccessControlTrait.ChangeTypeEnum? /* compiled code */

        public open val latestValue: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface FabricRestrictionReviewUpdate {
        public abstract val token: kotlin.ULong?

        public abstract val instruction: kotlin.String?

        public abstract val arlRequestFlowUrl: kotlin.String?

        public abstract val fabricIndex: kotlin.UByte?
    }

    public final class FabricRestrictionReviewUpdateImpl public constructor(token: kotlin.ULong? = COMPILED_CODE, instruction: kotlin.String? = COMPILED_CODE, arlRequestFlowUrl: kotlin.String? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.FabricRestrictionReviewUpdate { /* compiled code */ }
        }

        public open val token: kotlin.ULong? /* compiled code */

        public open val instruction: kotlin.String? /* compiled code */

        public open val arlRequestFlowUrl: kotlin.String? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class AccessRestrictionStruct public constructor(type: com.google.home.matter.standard.AccessControlTrait.AccessRestrictionTypeEnum = COMPILED_CODE, id: kotlin.UInt? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct?>.type: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct?>.id: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct { /* compiled code */ }
        }

        public final val type: com.google.home.matter.standard.AccessControlTrait.AccessRestrictionTypeEnum /* compiled code */

        public final val id: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct.StructFields> {
            @androidx.annotation.NonNull type,

            @androidx.annotation.NonNull id;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class CommissioningAccessRestrictionEntryStruct public constructor(endpoint: kotlin.UShort = COMPILED_CODE, cluster: kotlin.UInt = COMPILED_CODE, restrictions: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct?>.endpoint: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct?>.cluster: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct?>.restrictions: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct { /* compiled code */ }
        }

        public final val endpoint: kotlin.UShort /* compiled code */

        public final val cluster: kotlin.UInt /* compiled code */

        public final val restrictions: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct.StructFields> {
            @androidx.annotation.NonNull endpoint,

            @androidx.annotation.NonNull cluster,

            @androidx.annotation.NonNull restrictions;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AccessRestrictionEntryStruct public constructor(endpoint: kotlin.UShort = COMPILED_CODE, cluster: kotlin.UInt = COMPILED_CODE, restrictions: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct> = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct?>.endpoint: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct?>.cluster: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct?>.restrictions: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct { /* compiled code */ }
        }

        public final val endpoint: kotlin.UShort /* compiled code */

        public final val cluster: kotlin.UInt /* compiled code */

        public final val restrictions: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionStruct> /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct.StructFields> {
            @androidx.annotation.NonNull endpoint,

            @androidx.annotation.NonNull cluster,

            @androidx.annotation.NonNull restrictions,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AccessControlTargetStruct public constructor(cluster: kotlin.UInt? = COMPILED_CODE, endpoint: kotlin.UShort? = COMPILED_CODE, deviceType: kotlin.UInt? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct?>.cluster: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct?>.endpoint: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct?>.deviceType: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct { /* compiled code */ }
        }

        public final val cluster: kotlin.UInt? /* compiled code */

        public final val endpoint: kotlin.UShort? /* compiled code */

        public final val deviceType: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct.StructFields> {
            @androidx.annotation.NonNull cluster,

            @androidx.annotation.NonNull endpoint,

            @androidx.annotation.NonNull deviceType;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AccessControlEntryStruct public constructor(privilege: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryPrivilegeEnum = COMPILED_CODE, authMode: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryAuthModeEnum = COMPILED_CODE, subjects: kotlin.collections.List<kotlin.ULong>? = COMPILED_CODE, targets: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct>? = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct?>.privilege: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryPrivilegeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct?>.authMode: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryAuthModeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct?>.subjects: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ULong>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct?>.targets: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct { /* compiled code */ }
        }

        public final val privilege: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryPrivilegeEnum /* compiled code */

        public final val authMode: com.google.home.matter.standard.AccessControlTrait.AccessControlEntryAuthModeEnum /* compiled code */

        public final val subjects: kotlin.collections.List<kotlin.ULong>? /* compiled code */

        public final val targets: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlTargetStruct>? /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct.StructFields> {
            @androidx.annotation.NonNull privilege,

            @androidx.annotation.NonNull authMode,

            @androidx.annotation.NonNull subjects,

            @androidx.annotation.NonNull targets,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class AccessControlExtensionStruct public constructor(data: kotlin.ByteArray = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct?>.data: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct { /* compiled code */ }
        }

        public final val data: kotlin.ByteArray /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct.StructFields> {
            @androidx.annotation.NonNull data,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>?

        public abstract val extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>?

        public abstract val subjectsPerAccessControlEntry: kotlin.UShort?

        public abstract val targetsPerAccessControlEntry: kotlin.UShort?

        public abstract val accessControlEntriesPerFabric: kotlin.UShort?

        public abstract val commissioningArl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>?

        public abstract val arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.AccessControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>? = COMPILED_CODE, extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>? = COMPILED_CODE, subjectsPerAccessControlEntry: kotlin.UShort? = COMPILED_CODE, targetsPerAccessControlEntry: kotlin.UShort? = COMPILED_CODE, accessControlEntriesPerFabric: kotlin.UShort? = COMPILED_CODE, commissioningArl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>? = COMPILED_CODE, arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>? = COMPILED_CODE,
        generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.AccessControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.AccessControlTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.AccessControlTrait.Attributes, com.google.home.matter.standard.AccessControlTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.AccessControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.AccessControlTrait.Attributes) { /* compiled code */ }

        public open val acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>? /* compiled code */

        public open val extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>? /* compiled code */

        public open val subjectsPerAccessControlEntry: kotlin.UShort? /* compiled code */

        public open val targetsPerAccessControlEntry: kotlin.UShort? /* compiled code */

        public open val accessControlEntriesPerFabric: kotlin.UShort? /* compiled code */

        public open val commissioningArl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>? /* compiled code */

        public open val arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.AccessControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.AccessControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.AccessControlTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>? = COMPILED_CODE, extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>? = COMPILED_CODE, subjectsPerAccessControlEntry: kotlin.UShort? = COMPILED_CODE, targetsPerAccessControlEntry: kotlin.UShort? = COMPILED_CODE, accessControlEntriesPerFabric: kotlin.UShort? = COMPILED_CODE, commissioningArl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct>? = COMPILED_CODE, arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessRestrictionEntryStruct>? = COMPILED_CODE, generatedCommandList:
            kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.AccessControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.AccessControlTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.AccessControlTrait.Attributes) : com.google.home.matter.standard.AccessControlTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>? /* compiled code */

        public open val acl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>? /* compiled code */
            public open get

        internal final var _extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>? /* compiled code */

        public open val extension: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>? /* compiled code */
            public open get

        public final fun setAcl(value: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlEntryStruct>): kotlin.Unit { /* compiled code */ }

        public final fun setExtension(value: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.AccessControlExtensionStruct>): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object ReviewFabricRestrictionsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Request { /* compiled code */ }
            }

            public final val arl: kotlin.collections.List<com.google.home.matter.standard.AccessControlTrait.CommissioningAccessRestrictionEntryStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arl;

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

        public final class Response public constructor(token: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response { /* compiled code */ }
            }

            public final val token: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AccessControlTrait.ReviewFabricRestrictionsCommand.Response.CommandFields> {
                @androidx.annotation.NonNull token;

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

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object CommissionerControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class SupportedDeviceCategoryBitmap public constructor(fabricSynchronization: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap> {
            private const final val FABRIC_SYNCHRONIZATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap { /* compiled code */ }
        }

        public final val fabricSynchronization: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(fabricSynchronization: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface CommissioningRequestResult {
        public abstract val requestId: kotlin.ULong?

        public abstract val clientNodeId: kotlin.ULong?

        public abstract val statusCode: kotlin.UByte?

        public abstract val fabricIndex: kotlin.UByte?
    }

    public final class CommissioningRequestResultImpl public constructor(requestId: kotlin.ULong? = COMPILED_CODE, clientNodeId: kotlin.ULong? = COMPILED_CODE, statusCode: kotlin.UByte? = COMPILED_CODE, fabricIndex: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.CommissionerControlTrait.CommissioningRequestResult { /* compiled code */ }
        }

        public open val requestId: kotlin.ULong? /* compiled code */

        public open val clientNodeId: kotlin.ULong? /* compiled code */

        public open val statusCode: kotlin.UByte? /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.CommissionerControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.CommissionerControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.CommissionerControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedDeviceCategories: com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedDeviceCategories: com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.CommissionerControlTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.CommissionerControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.CommissionerControlTrait.Attributes) { /* compiled code */ }

        public open val supportedDeviceCategories: com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedDeviceCategories: com.google.home.matter.standard.CommissionerControlTrait.SupportedDeviceCategoryBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.CommissionerControlTrait.AttributesImpl { /* compiled code */ }
    }

    public object RequestCommissioningApprovalCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(requestId: kotlin.ULong = COMPILED_CODE, vendorId: kotlin.UShort = COMPILED_CODE, productId: kotlin.UShort = COMPILED_CODE, label: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.Request { /* compiled code */ }
            }

            public final val requestId: kotlin.ULong /* compiled code */

            public final val vendorId: kotlin.UShort /* compiled code */

            public final val productId: kotlin.UShort /* compiled code */

            public final val label: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.CommissionerControlTrait.RequestCommissioningApprovalCommand.Request.CommandFields> {
                @androidx.annotation.NonNull requestId,

                @androidx.annotation.NonNull vendorId,

                @androidx.annotation.NonNull productId,

                @androidx.annotation.NonNull label;

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
            public abstract var label: kotlin.String
        }
    }

    public object CommissionNodeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(requestId: kotlin.ULong = COMPILED_CODE, responseTimeoutSeconds: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Request { /* compiled code */ }
            }

            public final val requestId: kotlin.ULong /* compiled code */

            public final val responseTimeoutSeconds: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Request.CommandFields> {
                @androidx.annotation.NonNull requestId,

                @androidx.annotation.NonNull responseTimeoutSeconds;

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

        public final class Response public constructor(commissioningTimeout: kotlin.UShort = COMPILED_CODE, pakePasscodeVerifier: kotlin.ByteArray = COMPILED_CODE, discriminator: kotlin.UShort = COMPILED_CODE, iterations: kotlin.UInt = COMPILED_CODE, salt: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response { /* compiled code */ }
            }

            public final val commissioningTimeout: kotlin.UShort /* compiled code */

            public final val pakePasscodeVerifier: kotlin.ByteArray /* compiled code */

            public final val discriminator: kotlin.UShort /* compiled code */

            public final val iterations: kotlin.UInt /* compiled code */

            public final val salt: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.CommissionerControlTrait.CommissionNodeCommand.Response.CommandFields> {
                @androidx.annotation.NonNull commissioningTimeout,

                @androidx.annotation.NonNull pakePasscodeVerifier,

                @androidx.annotation.NonNull discriminator,

                @androidx.annotation.NonNull iterations,

                @androidx.annotation.NonNull salt;

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


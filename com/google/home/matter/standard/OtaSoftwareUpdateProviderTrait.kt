// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object OtaSoftwareUpdateProviderTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ApplyUpdateActionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateActionEnum> {
        @androidx.annotation.NonNull Proceed,

        @androidx.annotation.NonNull AwaitNextAction,

        @androidx.annotation.NonNull Discontinue,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateActionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DownloadProtocolEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum> {
        @androidx.annotation.NonNull BdxSynchronous,

        @androidx.annotation.NonNull BdxAsynchronous,

        @androidx.annotation.NonNull HTTPS,

        @androidx.annotation.NonNull VendorSpecific,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.StatusEnum> {
        @androidx.annotation.NonNull UpdateAvailable,

        @androidx.annotation.NonNull Busy,

        @androidx.annotation.NonNull NotAvailable,

        @androidx.annotation.NonNull DownloadProtocolNotSupported,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.StatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes { /* compiled code */ }
        }

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.Attributes) { /* compiled code */ }

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.AttributesImpl { /* compiled code */ }
    }

    public object QueryImageCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(vendorId: kotlin.UShort = COMPILED_CODE, productId: kotlin.UShort = COMPILED_CODE, softwareVersion: kotlin.UInt = COMPILED_CODE, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum> = COMPILED_CODE, hardwareVersion: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, location: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, requestorCanConsent: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE, metadataForProvider: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Request { /* compiled code */ }
            }

            public final val vendorId: kotlin.UShort /* compiled code */

            public final val productId: kotlin.UShort /* compiled code */

            public final val softwareVersion: kotlin.UInt /* compiled code */

            public final val protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum> /* compiled code */

            public final val hardwareVersion: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

            public final val location: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val requestorCanConsent: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public final val metadataForProvider: com.google.home.matter.serialization.OptionalValue<kotlin.ByteArray> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Request.CommandFields> {
                @androidx.annotation.NonNull vendorId,

                @androidx.annotation.NonNull productId,

                @androidx.annotation.NonNull softwareVersion,

                @androidx.annotation.NonNull protocolsSupported,

                @androidx.annotation.NonNull hardwareVersion,

                @androidx.annotation.NonNull location,

                @androidx.annotation.NonNull requestorCanConsent,

                @androidx.annotation.NonNull metadataForProvider;

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
            public abstract var hardwareVersion: kotlin.UShort

            public abstract var location: kotlin.String

            public abstract var requestorCanConsent: kotlin.Boolean

            public abstract var metadataForProvider: kotlin.ByteArray
        }

        public final class Response public constructor(status: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.StatusEnum = COMPILED_CODE, delayedActionTime: kotlin.UInt? = COMPILED_CODE, imageUri: kotlin.String? = COMPILED_CODE, softwareVersion: kotlin.UInt? = COMPILED_CODE, softwareVersionString: kotlin.String? = COMPILED_CODE, updateToken: kotlin.ByteArray? = COMPILED_CODE, userConsentNeeded: kotlin.Boolean? = COMPILED_CODE, metadataForRequestor: kotlin.ByteArray? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response { /* compiled code */ }
            }

            public final val status: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.StatusEnum /* compiled code */

            public final val delayedActionTime: kotlin.UInt? /* compiled code */

            public final val imageUri: kotlin.String? /* compiled code */

            public final val softwareVersion: kotlin.UInt? /* compiled code */

            public final val softwareVersionString: kotlin.String? /* compiled code */

            public final val updateToken: kotlin.ByteArray? /* compiled code */

            public final val userConsentNeeded: kotlin.Boolean? /* compiled code */

            public final val metadataForRequestor: kotlin.ByteArray? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response.CommandFields> {
                @androidx.annotation.NonNull status,

                @androidx.annotation.NonNull delayedActionTime,

                @androidx.annotation.NonNull imageUri,

                @androidx.annotation.NonNull softwareVersion,

                @androidx.annotation.NonNull softwareVersionString,

                @androidx.annotation.NonNull updateToken,

                @androidx.annotation.NonNull userConsentNeeded,

                @androidx.annotation.NonNull metadataForRequestor;

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

    public object ApplyUpdateRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(updateToken: kotlin.ByteArray = COMPILED_CODE, newVersion: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Request { /* compiled code */ }
            }

            public final val updateToken: kotlin.ByteArray /* compiled code */

            public final val newVersion: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull updateToken,

                @androidx.annotation.NonNull newVersion;

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

        public final class Response public constructor(action: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateActionEnum = COMPILED_CODE, delayedActionTime: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response { /* compiled code */ }
            }

            public final val action: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateActionEnum /* compiled code */

            public final val delayedActionTime: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull action,

                @androidx.annotation.NonNull delayedActionTime;

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

    public object NotifyUpdateAppliedCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(updateToken: kotlin.ByteArray = COMPILED_CODE, softwareVersion: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.NotifyUpdateAppliedCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.NotifyUpdateAppliedCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.NotifyUpdateAppliedCommand.Request { /* compiled code */ }
            }

            public final val updateToken: kotlin.ByteArray /* compiled code */

            public final val softwareVersion: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.NotifyUpdateAppliedCommand.Request.CommandFields> {
                @androidx.annotation.NonNull updateToken,

                @androidx.annotation.NonNull softwareVersion;

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


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class DeviceTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.DeviceTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.DeviceTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.DeviceTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val Name: kotlin.String?

        public abstract val structureObjectId: kotlin.String?

        public abstract val roomObjectId: kotlin.String?

        public abstract val descriptiveType: kotlin.String?

        public abstract val isSelfDevice: kotlin.Boolean?
    }

    public open class AttributesImpl public constructor(Name: kotlin.String?, structureObjectId: kotlin.String?, roomObjectId: kotlin.String?, descriptiveType: kotlin.String?, isSelfDevice: kotlin.Boolean?) : com.google.home.google.DeviceTrait.Attributes {
        public open val Name: kotlin.String? /* compiled code */

        public open val structureObjectId: kotlin.String? /* compiled code */

        public open val roomObjectId: kotlin.String? /* compiled code */

        public open val descriptiveType: kotlin.String? /* compiled code */

        public open val isSelfDevice: kotlin.Boolean? /* compiled code */
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.DeviceTrait.Attributes) : com.google.home.google.DeviceTrait.AttributesImpl {
        internal final var _Name: kotlin.String? /* compiled code */

        public open val Name: kotlin.String? /* compiled code */
            public open get

        public final fun setName(value: kotlin.String): kotlin.Unit { /* compiled code */ }
    }

    public object DeviceTraitDefaultCommand : com.google.home.CommandDescriptor {
        public open val commandId: kotlin.String /* compiled code */

        public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        public final class DeviceTraitDefaultCommandRequest public constructor() {
            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandRequest.CommandFields> {
                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }

        public final class RequestPayload public constructor() : com.google.home.google.PlatformTraitPayload<com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandRequest> {
            public open val payload: com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandRequest /* compiled code */

            public open val payloadParser: com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }

        public final class DeviceTraitDefaultCommandResponse public constructor() {
            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }
        }

        public final class ResponseParser public constructor() : com.google.home.google.Parser<com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandResponse> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandResponse { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.DeviceTrait.DeviceTraitDefaultCommand.DeviceTraitDefaultCommandResponse): kotlin.ByteArray { /* compiled code */ }
        }
    }
}


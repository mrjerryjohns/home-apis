// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AssistantBroadcastTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.AssistantBroadcastTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AssistantBroadcastTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.AssistantBroadcastTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public final class AttributesImpl public constructor() : com.google.home.google.AssistantBroadcastTrait.Attributes {
    }

    public final class MutableAttributes public constructor() : com.google.home.google.AssistantBroadcastTrait.Attributes {
    }

    public object BroadcastCommand : com.google.home.CommandDescriptor {
        public open val commandId: kotlin.String /* compiled code */

        public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        public final class BroadcastCommandRequest public constructor(msg: kotlin.String?) {
            public final val msg: kotlin.String? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandRequest.CommandFields> {
                @androidx.annotation.NonNull msg;

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }

        public final class RequestPayload public constructor(msg: kotlin.String?) : com.google.home.google.PlatformTraitPayload<com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandRequest> {
            public final val msg: kotlin.String? /* compiled code */

            public open val payload: com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandRequest /* compiled code */

            public open val payloadParser: com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }

        public final class BroadcastCommandResponse public constructor() {
            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }
        }

        public final class ResponseParser public constructor() : com.google.home.google.Parser<com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandResponse> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandResponse { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandResponse): kotlin.ByteArray { /* compiled code */ }
        }
    }
}

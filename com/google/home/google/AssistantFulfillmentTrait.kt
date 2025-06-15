// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AssistantFulfillmentTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.AssistantFulfillmentTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AssistantFulfillmentTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.AssistantFulfillmentTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public object OkGoogleCommand : com.google.home.CommandDescriptor {
        public open val commandId: kotlin.String /* compiled code */

        @kotlin.Deprecated public const final val ID: kotlin.String /* from: com.google.home.google.CommandId */ = COMPILED_CODE /* compiled code */

        public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class OkGoogleRequest public constructor(query: kotlin.String) {
            public final val query: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.OkGoogleRequest.CommandFields> {
                @androidx.annotation.NonNull query;

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }

        public final class RequestPayload public constructor(query: kotlin.String) : com.google.home.google.PlatformTraitPayload<com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.OkGoogleRequest> {
            public final val query: kotlin.String /* compiled code */

            public open val payload: com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.OkGoogleRequest /* compiled code */

            public open val payloadParser: com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.OkGoogleRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.OkGoogleRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.AssistantFulfillmentTrait.OkGoogleCommand.OkGoogleRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }
    }

    public final class AttributesImpl public constructor() : com.google.home.google.AssistantFulfillmentTrait.Attributes {
    }
}


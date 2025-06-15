// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class NotificationTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.NotificationTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.NotificationTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.NotificationTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val structureMembersList: kotlin.collections.List<com.google.home.google.NotificationTrait.User>?
    }

    public final class User public constructor(name: kotlin.String, email: kotlin.String) {
        public final val name: kotlin.String /* compiled code */

        public final val email: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }

    public object SendNotificationsCommand : com.google.home.CommandDescriptor {
        public open val commandId: kotlin.String /* compiled code */

        @kotlin.Deprecated public const final val ID: kotlin.String /* from: com.google.home.google.CommandId */ = COMPILED_CODE /* compiled code */

        public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class SendNotificationsCommandRequest public constructor(title: kotlin.String, body: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, optInMemberEmails: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> = COMPILED_CODE) {
            public final val title: kotlin.String /* compiled code */

            public final val body: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val optInMemberEmails: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NotificationTrait.SendNotificationsCommand.SendNotificationsCommandRequest.CommandFields> {
                @androidx.annotation.NonNull title,

                @androidx.annotation.NonNull body,

                @androidx.annotation.NonNull optInMemberEmails;

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }

        public final class RequestPayload public constructor(title: kotlin.String, body: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, optInMemberEmails: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> = COMPILED_CODE) : com.google.home.google.PlatformTraitPayload<com.google.home.google.NotificationTrait.SendNotificationsCommand.SendNotificationsCommandRequest> {
            public final val title: kotlin.String /* compiled code */

            public final val body: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val optInMemberEmails: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<kotlin.String>> /* compiled code */

            public open val payload: com.google.home.google.NotificationTrait.SendNotificationsCommand.SendNotificationsCommandRequest /* compiled code */

            public open val payloadParser: com.google.home.google.NotificationTrait.SendNotificationsCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.NotificationTrait.SendNotificationsCommand.SendNotificationsCommandRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.NotificationTrait.SendNotificationsCommand.SendNotificationsCommandRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.NotificationTrait.SendNotificationsCommand.SendNotificationsCommandRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }

        public interface OptionalArgs {
            public abstract var body: kotlin.String

            public abstract var optInMemberEmails: kotlin.collections.List<kotlin.String>
        }
    }

    public final class AttributesImpl public constructor(structureMembersList: kotlin.collections.List<com.google.home.google.NotificationTrait.User>?) : com.google.home.google.NotificationTrait.Attributes {
        public open val structureMembersList: kotlin.collections.List<com.google.home.google.NotificationTrait.User>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }
}

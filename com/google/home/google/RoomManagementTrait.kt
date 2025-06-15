// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class RoomManagementTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.RoomManagementTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.RoomManagementTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.RoomManagementTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public object CreateRoomCommand {
        public const final val ID: kotlin.String /* from: com.google.home.google.CommandId */ = COMPILED_CODE /* compiled code */

        public final class CreateRoomRequest public constructor(name: kotlin.String) {
            public final val name: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }
        }

        public final class RequestPayload public constructor(name: kotlin.String) : com.google.home.google.PlatformTraitPayload<com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomRequest> {
            public final val name: kotlin.String /* compiled code */

            public open val payload: com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomRequest /* compiled code */

            public open val payloadParser: com.google.home.google.RoomManagementTrait.CreateRoomCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }

        public final class CreateRoomResponse public constructor(roomId: kotlin.String) {
            public final val roomId: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }
        }

        public final class ResponseParser public constructor() : com.google.home.google.Parser<com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomResponse> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomResponse { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.RoomManagementTrait.CreateRoomCommand.CreateRoomResponse): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public object DeleteRoomCommand {
        public const final val ID: kotlin.String /* from: com.google.home.google.CommandId */ = COMPILED_CODE /* compiled code */

        public final class DeleteRoomRequest public constructor(roomId: kotlin.String) {
            public final val roomId: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }
        }

        public final class RequestPayload public constructor(roomId: kotlin.String) : com.google.home.google.PlatformTraitPayload<com.google.home.google.RoomManagementTrait.DeleteRoomCommand.DeleteRoomRequest> {
            public final val roomId: kotlin.String /* compiled code */

            public open val payload: com.google.home.google.RoomManagementTrait.DeleteRoomCommand.DeleteRoomRequest /* compiled code */

            public open val payloadParser: com.google.home.google.RoomManagementTrait.DeleteRoomCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.RoomManagementTrait.DeleteRoomCommand.DeleteRoomRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.RoomManagementTrait.DeleteRoomCommand.DeleteRoomRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.RoomManagementTrait.DeleteRoomCommand.DeleteRoomRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }
    }

    public final class AttributesImpl public constructor() : com.google.home.google.RoomManagementTrait.Attributes {
    }
}

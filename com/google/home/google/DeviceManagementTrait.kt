// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class DeviceManagementTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.DeviceManagementTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.DeviceManagementTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.DeviceManagementTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public object MoveDevicesToRoomCommand {
        public final val ID: kotlin.String /* from: com.google.home.google.CommandId */ /* compiled code */

        public final class MoveDevicesToRoomRequest public constructor(roomId: kotlin.String, deviceIds: kotlin.collections.List<kotlin.String>) {
            public final val roomId: kotlin.String /* compiled code */

            public final val deviceIds: kotlin.collections.List<kotlin.String> /* compiled code */
        }

        public final class RequestPayload public constructor(roomId: kotlin.String, deviceIds: kotlin.collections.List<kotlin.String>) : com.google.home.google.PlatformTraitPayload<com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomRequest> {
            public final val roomId: kotlin.String /* compiled code */

            public final val deviceIds: kotlin.collections.List<kotlin.String> /* compiled code */

            public open val payload: com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomRequest /* compiled code */

            public open val payloadParser: com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.RequestPayload.PayloadParser /* compiled code */

            public final class PayloadParser public constructor() : com.google.home.google.Parser<com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomRequest> {
                public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomRequest { /* compiled code */ }

                public open fun encode(payload: com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomRequest): kotlin.ByteArray { /* compiled code */ }
            }
        }

        public final class DeviceInRoom public constructor(roomId: kotlin.String, deviceId: kotlin.String) {
            public final val roomId: kotlin.String /* compiled code */

            public final val deviceId: kotlin.String /* compiled code */
        }

        public final class MoveDevicesToRoomResponse public constructor(removedAssignments: kotlin.collections.List<com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.DeviceInRoom>) {
            public final val removedAssignments: kotlin.collections.List<com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.DeviceInRoom> /* compiled code */
        }

        public final class ResponseParser public constructor() : com.google.home.google.Parser<com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomResponse> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomResponse { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.DeviceManagementTrait.MoveDevicesToRoomCommand.MoveDevicesToRoomResponse): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public final class AttributesImpl public constructor() : com.google.home.google.DeviceManagementTrait.Attributes {
    }
}

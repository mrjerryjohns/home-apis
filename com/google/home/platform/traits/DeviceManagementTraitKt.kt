// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object DeviceManagementTraitKt {
    @kotlin.jvm.JvmName public final inline fun moveDevicesToRoom(block: com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoom { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun moveDevicesToRoomResponse(block: com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.DeviceManagementTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.DeviceManagementTrait.Builder): com.google.home.platform.traits.DeviceManagementTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.DeviceManagementTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.DeviceManagementTrait { /* compiled code */ }
    }

    public object MoveDevicesToRoomKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoom.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoom.Builder): com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoom.Builder /* compiled code */

            public final var roomId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final val deviceIds: com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy> /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoom { /* compiled code */ }

            public final fun clearRoomId(): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy>.add(value: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy>.plusAssign(value: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy>.set(index: kotlin.Int, value: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<kotlin.String, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomKt.Dsl.DeviceIdsProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final class DeviceIdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }

    public object MoveDevicesToRoomResponseKt {
        @kotlin.jvm.JvmName public final inline fun deviceInRoom(block: com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.DeviceInRoomKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom { /* compiled code */ }

        public final class Dsl private constructor(_builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.Builder): com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.Builder /* compiled code */

            public final val removedAssignments: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy> /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy>.add(value: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy>.plusAssign(value: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom, com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.Dsl.RemovedAssignmentsProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final class RemovedAssignmentsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }

        public object DeviceInRoomKt {
            public final class Dsl private constructor(_builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom.Builder) {
                public companion object {
                    @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom.Builder): com.google.home.platform.traits.DeviceManagementTraitKt.MoveDevicesToRoomResponseKt.DeviceInRoomKt.Dsl { /* compiled code */ }
                }

                private final val _builder: com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom.Builder /* compiled code */

                public final var roomId: kotlin.String /* compiled code */
                    public final @kotlin.jvm.JvmName get
                    public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

                public final var deviceId: kotlin.String /* compiled code */
                    public final @kotlin.jvm.JvmName get
                    public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.DeviceManagementTrait.MoveDevicesToRoomResponse.DeviceInRoom { /* compiled code */ }

                public final fun clearRoomId(): kotlin.Unit { /* compiled code */ }

                public final fun clearDeviceId(): kotlin.Unit { /* compiled code */ }
            }
        }
    }
}

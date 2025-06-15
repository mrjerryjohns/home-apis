// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object RoomManagementTraitKt {
    @kotlin.jvm.JvmName public final inline fun createRoom(block: com.google.home.platform.traits.RoomManagementTraitKt.CreateRoomKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.RoomManagementTrait.CreateRoom { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun createRoomResponse(block: com.google.home.platform.traits.RoomManagementTraitKt.CreateRoomResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.RoomManagementTrait.CreateRoomResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun deleteRoom(block: com.google.home.platform.traits.RoomManagementTraitKt.DeleteRoomKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.RoomManagementTrait.DeleteRoom { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun deleteRoomResponse(block: com.google.home.platform.traits.RoomManagementTraitKt.DeleteRoomResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.RoomManagementTrait.DeleteRoomResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.RoomManagementTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.RoomManagementTrait.Builder): com.google.home.platform.traits.RoomManagementTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.RoomManagementTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.RoomManagementTrait { /* compiled code */ }
    }

    public object CreateRoomKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.RoomManagementTrait.CreateRoom.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.RoomManagementTrait.CreateRoom.Builder): com.google.home.platform.traits.RoomManagementTraitKt.CreateRoomKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.RoomManagementTrait.CreateRoom.Builder /* compiled code */

            public final var name: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.RoomManagementTrait.CreateRoom { /* compiled code */ }

            public final fun clearName(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object CreateRoomResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.RoomManagementTrait.CreateRoomResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.RoomManagementTrait.CreateRoomResponse.Builder): com.google.home.platform.traits.RoomManagementTraitKt.CreateRoomResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.RoomManagementTrait.CreateRoomResponse.Builder /* compiled code */

            public final var roomId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.RoomManagementTrait.CreateRoomResponse { /* compiled code */ }

            public final fun clearRoomId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object DeleteRoomKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.RoomManagementTrait.DeleteRoom.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.RoomManagementTrait.DeleteRoom.Builder): com.google.home.platform.traits.RoomManagementTraitKt.DeleteRoomKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.RoomManagementTrait.DeleteRoom.Builder /* compiled code */

            public final var roomId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.RoomManagementTrait.DeleteRoom { /* compiled code */ }

            public final fun clearRoomId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object DeleteRoomResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.RoomManagementTrait.DeleteRoomResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.RoomManagementTrait.DeleteRoomResponse.Builder): com.google.home.platform.traits.RoomManagementTraitKt.DeleteRoomResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.RoomManagementTrait.DeleteRoomResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.RoomManagementTrait.DeleteRoomResponse { /* compiled code */ }
        }
    }
}


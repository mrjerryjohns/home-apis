// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object EntityMetadataKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.EntityMetadata.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.EntityMetadata.Builder): com.google.home.platform.traits.EntityMetadataKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.EntityMetadata.Builder /* compiled code */

        public final var structureMetadata: com.google.home.platform.traits.StructureMetadata /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.StructureMetadata) {/* compiled code */ }

        public final var roomMetadata: com.google.home.platform.traits.RoomMetadata /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.RoomMetadata) {/* compiled code */ }

        public final var deviceMetadata: com.google.home.platform.traits.DeviceMetadata /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.DeviceMetadata) {/* compiled code */ }

        public final val metadataCase: com.google.home.platform.traits.EntityMetadata.MetadataCase /* compiled code */
            public final @kotlin.jvm.JvmName get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.EntityMetadata { /* compiled code */ }

        public final fun clearStructureMetadata(): kotlin.Unit { /* compiled code */ }

        public final fun hasStructureMetadata(): kotlin.Boolean { /* compiled code */ }

        public final fun clearRoomMetadata(): kotlin.Unit { /* compiled code */ }

        public final fun hasRoomMetadata(): kotlin.Boolean { /* compiled code */ }

        public final fun clearDeviceMetadata(): kotlin.Unit { /* compiled code */ }

        public final fun hasDeviceMetadata(): kotlin.Boolean { /* compiled code */ }

        public final fun clearMetadata(): kotlin.Unit { /* compiled code */ }
    }
}

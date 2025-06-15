// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object SolarTimeKt {
    public final class Dsl private constructor(_builder: com.google.home.platform.traits.SolarTime.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.SolarTime.Builder): com.google.home.platform.traits.SolarTimeKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.SolarTime.Builder /* compiled code */

        public final var type: com.google.home.platform.traits.SolarTime.SolarTimeType /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.SolarTime.SolarTimeType) {/* compiled code */ }

        public final var typeValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var offset: com.google.protobuf.Duration /* compiled code */
            public final get
            public final set(value: com.google.protobuf.Duration) {/* compiled code */ }

        public final val com.google.home.platform.traits.SolarTimeKt.Dsl.offsetOrNull: com.google.protobuf.Duration? /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.SolarTime { /* compiled code */ }

        public final fun clearType(): kotlin.Unit { /* compiled code */ }

        public final fun clearOffset(): kotlin.Unit { /* compiled code */ }

        public final fun hasOffset(): kotlin.Boolean { /* compiled code */ }
    }
}

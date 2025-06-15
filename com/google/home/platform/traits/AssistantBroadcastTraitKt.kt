// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AssistantBroadcastTraitKt {
    @kotlin.jvm.JvmName public final inline fun broadcastCommand(block: com.google.home.platform.traits.AssistantBroadcastTraitKt.BroadcastCommandKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommand { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun broadcastCommandResponse(block: com.google.home.platform.traits.AssistantBroadcastTraitKt.BroadcastCommandResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommandResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.AssistantBroadcastTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AssistantBroadcastTrait.Builder): com.google.home.platform.traits.AssistantBroadcastTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.AssistantBroadcastTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AssistantBroadcastTrait { /* compiled code */ }
    }

    public object BroadcastCommandKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommand.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommand.Builder): com.google.home.platform.traits.AssistantBroadcastTraitKt.BroadcastCommandKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommand.Builder /* compiled code */

            public final var msg: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommand { /* compiled code */ }

            public final fun clearMsg(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object BroadcastCommandResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommandResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommandResponse.Builder): com.google.home.platform.traits.AssistantBroadcastTraitKt.BroadcastCommandResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommandResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AssistantBroadcastTrait.BroadcastCommandResponse { /* compiled code */ }
        }
    }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AutomationLifecycleTraitKt {
    @kotlin.jvm.JvmName public final inline fun create(block: com.google.home.platform.traits.AutomationLifecycleTraitKt.CreateKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationLifecycleTrait.Create { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun createResponse(block: com.google.home.platform.traits.AutomationLifecycleTraitKt.CreateResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationLifecycleTrait.CreateResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun delete(block: com.google.home.platform.traits.AutomationLifecycleTraitKt.DeleteKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationLifecycleTrait.Delete { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun deleteResponse(block: com.google.home.platform.traits.AutomationLifecycleTraitKt.DeleteResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationLifecycleTrait.DeleteResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationLifecycleTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationLifecycleTrait.Builder): com.google.home.platform.traits.AutomationLifecycleTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.AutomationLifecycleTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationLifecycleTrait { /* compiled code */ }
    }

    public object CreateKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationLifecycleTrait.Create.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationLifecycleTrait.Create.Builder): com.google.home.platform.traits.AutomationLifecycleTraitKt.CreateKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationLifecycleTrait.Create.Builder /* compiled code */

            public final var automation: com.google.home.platform.traits.Automation /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationLifecycleTraitKt.CreateKt.Dsl.automationOrNull: com.google.home.platform.traits.Automation? /* compiled code */
                public final get

            public final var sessionId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationLifecycleTrait.Create { /* compiled code */ }

            public final fun clearAutomation(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomation(): kotlin.Boolean { /* compiled code */ }

            public final fun clearSessionId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object CreateResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationLifecycleTrait.CreateResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationLifecycleTrait.CreateResponse.Builder): com.google.home.platform.traits.AutomationLifecycleTraitKt.CreateResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationLifecycleTrait.CreateResponse.Builder /* compiled code */

            public final var automation: com.google.home.platform.traits.Automation /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationLifecycleTraitKt.CreateResponseKt.Dsl.automationOrNull: com.google.home.platform.traits.Automation? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationLifecycleTrait.CreateResponse { /* compiled code */ }

            public final fun clearAutomation(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomation(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object DeleteKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationLifecycleTrait.Delete.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationLifecycleTrait.Delete.Builder): com.google.home.platform.traits.AutomationLifecycleTraitKt.DeleteKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationLifecycleTrait.Delete.Builder /* compiled code */

            public final var structureObjectId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var automationId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationLifecycleTrait.Delete { /* compiled code */ }

            public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

            public final fun clearAutomationId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object DeleteResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationLifecycleTrait.DeleteResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationLifecycleTrait.DeleteResponse.Builder): com.google.home.platform.traits.AutomationLifecycleTraitKt.DeleteResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationLifecycleTrait.DeleteResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationLifecycleTrait.DeleteResponse { /* compiled code */ }
        }
    }
}


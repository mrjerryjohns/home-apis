// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AutomationManagerTraitKt {
    @kotlin.jvm.JvmName public final inline fun get(block: com.google.home.platform.traits.AutomationManagerTraitKt.GetKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.Get { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun getResponse(block: com.google.home.platform.traits.AutomationManagerTraitKt.GetResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.GetResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun list(block: com.google.home.platform.traits.AutomationManagerTraitKt.ListKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.List { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun listResponse(block: com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.ListResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun update(block: com.google.home.platform.traits.AutomationManagerTraitKt.UpdateKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.Update { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun updateResponse(block: com.google.home.platform.traits.AutomationManagerTraitKt.UpdateResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.UpdateResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun execute(block: com.google.home.platform.traits.AutomationManagerTraitKt.ExecuteKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.Execute { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun executeResponse(block: com.google.home.platform.traits.AutomationManagerTraitKt.ExecuteResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.ExecuteResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun stop(block: com.google.home.platform.traits.AutomationManagerTraitKt.StopKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.Stop { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun stopResponse(block: com.google.home.platform.traits.AutomationManagerTraitKt.StopResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.AutomationManagerTrait.StopResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait { /* compiled code */ }
    }

    public object GetKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.Get.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.Get.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.GetKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.Get.Builder /* compiled code */

            public final var structureObjectId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var automationId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.Get { /* compiled code */ }

            public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

            public final fun clearAutomationId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object GetResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.GetResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.GetResponse.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.GetResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.GetResponse.Builder /* compiled code */

            public final var automation: com.google.home.platform.traits.Automation /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationManagerTraitKt.GetResponseKt.Dsl.automationOrNull: com.google.home.platform.traits.Automation? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.GetResponse { /* compiled code */ }

            public final fun clearAutomation(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomation(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object ListKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.List.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.List.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.ListKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.List.Builder /* compiled code */

            public final var structureObjectId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var pageSize: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            public final var pageToken: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.List { /* compiled code */ }

            public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

            public final fun clearPageSize(): kotlin.Unit { /* compiled code */ }

            public final fun hasPageSize(): kotlin.Boolean { /* compiled code */ }

            public final fun clearPageToken(): kotlin.Unit { /* compiled code */ }

            public final fun hasPageToken(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object ListResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.ListResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.ListResponse.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.ListResponse.Builder /* compiled code */

            public final val automations: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy> /* compiled code */
                public final get

            public final var pageToken: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.ListResponse { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy>.add(value: com.google.home.platform.traits.Automation): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy>.plusAssign(value: com.google.home.platform.traits.Automation): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.Automation>): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.Automation>): kotlin.Unit { /* compiled code */ }

            public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.Automation): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.Automation, com.google.home.platform.traits.AutomationManagerTraitKt.ListResponseKt.Dsl.AutomationsProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final fun clearPageToken(): kotlin.Unit { /* compiled code */ }

            public final fun hasPageToken(): kotlin.Boolean { /* compiled code */ }

            public final class AutomationsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }

    public object UpdateKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.Update.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.Update.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.UpdateKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.Update.Builder /* compiled code */

            public final var automation: com.google.home.platform.traits.Automation /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationManagerTraitKt.UpdateKt.Dsl.automationOrNull: com.google.home.platform.traits.Automation? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.Update { /* compiled code */ }

            public final fun clearAutomation(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomation(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object UpdateResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.UpdateResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.UpdateResponse.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.UpdateResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.UpdateResponse.Builder /* compiled code */

            public final var automation: com.google.home.platform.traits.Automation /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationManagerTraitKt.UpdateResponseKt.Dsl.automationOrNull: com.google.home.platform.traits.Automation? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.UpdateResponse { /* compiled code */ }

            public final fun clearAutomation(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomation(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object ExecuteKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.Execute.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.Execute.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.ExecuteKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.Execute.Builder /* compiled code */

            public final var structureObjectId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var automationId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.Execute { /* compiled code */ }

            public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

            public final fun clearAutomationId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object ExecuteResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.ExecuteResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.ExecuteResponse.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.ExecuteResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.ExecuteResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.ExecuteResponse { /* compiled code */ }
        }
    }

    public object StopKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.Stop.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.Stop.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.StopKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.Stop.Builder /* compiled code */

            public final var structureObjectId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var automationId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.Stop { /* compiled code */ }

            public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

            public final fun clearAutomationId(): kotlin.Unit { /* compiled code */ }
        }
    }

    public object StopResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.AutomationManagerTrait.StopResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.AutomationManagerTrait.StopResponse.Builder): com.google.home.platform.traits.AutomationManagerTraitKt.StopResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.AutomationManagerTrait.StopResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.AutomationManagerTrait.StopResponse { /* compiled code */ }
        }
    }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits.automation

public object AutomationManagementTraitKt {
    @kotlin.jvm.JvmName public final inline fun createAutomationCommand(block: com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommand { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun createAutomationCommandResponse(block: com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommandResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationManagementTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationManagementTrait.Builder): com.google.home.platform.traits.automation.AutomationManagementTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.automation.AutomationManagementTrait.Builder /* compiled code */

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationManagementTrait { /* compiled code */ }
    }

    public object CreateAutomationCommandKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommand.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommand.Builder): com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommand.Builder /* compiled code */

            public final var name: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var description: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var automationGraph: com.google.home.platform.traits.AutomationGraph /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.AutomationGraph) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.automationGraphOrNull: com.google.home.platform.traits.AutomationGraph? /* compiled code */
                public final get

            public final var activateIfValid: kotlin.Boolean /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

            public final val clientMetadata: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.ClientMetadataProxy> /* compiled code */
                public final get

            public final var sessionId: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var clientFeatureGroup: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var maxExecutionCount: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommand { /* compiled code */ }

            public final fun clearName(): kotlin.Unit { /* compiled code */ }

            public final fun clearDescription(): kotlin.Unit { /* compiled code */ }

            public final fun hasDescription(): kotlin.Boolean { /* compiled code */ }

            public final fun clearAutomationGraph(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomationGraph(): kotlin.Boolean { /* compiled code */ }

            public final fun clearActivateIfValid(): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.ClientMetadataProxy>.put(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.ClientMetadataProxy>.set(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.ClientMetadataProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.ClientMetadataProxy>.putAll(map: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandKt.Dsl.ClientMetadataProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final fun clearSessionId(): kotlin.Unit { /* compiled code */ }

            public final fun hasSessionId(): kotlin.Boolean { /* compiled code */ }

            public final fun clearClientFeatureGroup(): kotlin.Unit { /* compiled code */ }

            public final fun hasClientFeatureGroup(): kotlin.Boolean { /* compiled code */ }

            public final fun clearMaxExecutionCount(): kotlin.Unit { /* compiled code */ }

            public final fun hasMaxExecutionCount(): kotlin.Boolean { /* compiled code */ }

            public final class ClientMetadataProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }

    public object CreateAutomationCommandResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommandResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommandResponse.Builder): com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommandResponse.Builder /* compiled code */

            public final var automationEntityTrait: com.google.home.platform.traits.automation.AutomationEntityTrait /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.automation.AutomationEntityTrait) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.automation.AutomationManagementTraitKt.CreateAutomationCommandResponseKt.Dsl.automationEntityTraitOrNull: com.google.home.platform.traits.automation.AutomationEntityTrait? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationManagementTrait.CreateAutomationCommandResponse { /* compiled code */ }

            public final fun clearAutomationEntityTrait(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomationEntityTrait(): kotlin.Boolean { /* compiled code */ }
        }
    }
}


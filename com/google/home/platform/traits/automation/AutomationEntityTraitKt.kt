// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits.automation

public object AutomationEntityTraitKt {
    @kotlin.jvm.JvmName public final inline fun updateAutomationCommand(block: com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommand { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun updateAutomationCommandResponse(block: com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommandResponse { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun deleteAutomationCommand(block: com.google.home.platform.traits.automation.AutomationEntityTraitKt.DeleteAutomationCommandKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommand { /* compiled code */ }

    @kotlin.jvm.JvmName public final inline fun deleteAutomationCommandResponse(block: com.google.home.platform.traits.automation.AutomationEntityTraitKt.DeleteAutomationCommandResponseKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommandResponse { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationEntityTrait.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationEntityTrait.Builder): com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.automation.AutomationEntityTrait.Builder /* compiled code */

        public final var iqsAutomationId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var structureObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var name: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var description: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var automationGraph: com.google.home.platform.traits.AutomationGraph /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.AutomationGraph) {/* compiled code */ }

        public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.automationGraphOrNull: com.google.home.platform.traits.AutomationGraph? /* compiled code */
            public final get

        public final var valid: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final val validationResults: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy> /* compiled code */
            public final get

        public final var active: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final var manuallyExecutable: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final val clientMetadata: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ClientMetadataProxy> /* compiled code */
            public final get

        public final var clientFeatureGroup: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var maxExecutionCount: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationEntityTrait { /* compiled code */ }

        public final fun clearIqsAutomationId(): kotlin.Unit { /* compiled code */ }

        public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun clearName(): kotlin.Unit { /* compiled code */ }

        public final fun clearDescription(): kotlin.Unit { /* compiled code */ }

        public final fun hasDescription(): kotlin.Boolean { /* compiled code */ }

        public final fun clearAutomationGraph(): kotlin.Unit { /* compiled code */ }

        public final fun hasAutomationGraph(): kotlin.Boolean { /* compiled code */ }

        public final fun clearValid(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy>.add(value: com.google.home.platform.traits.ValidationResult): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy>.plusAssign(value: com.google.home.platform.traits.ValidationResult): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.ValidationResult>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.ValidationResult>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.ValidationResult): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ValidationResultsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearActive(): kotlin.Unit { /* compiled code */ }

        public final fun clearManuallyExecutable(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ClientMetadataProxy>.put(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ClientMetadataProxy>.set(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ClientMetadataProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ClientMetadataProxy>.putAll(map: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.Dsl.ClientMetadataProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearClientFeatureGroup(): kotlin.Unit { /* compiled code */ }

        public final fun hasClientFeatureGroup(): kotlin.Boolean { /* compiled code */ }

        public final fun clearMaxExecutionCount(): kotlin.Unit { /* compiled code */ }

        public final fun hasMaxExecutionCount(): kotlin.Boolean { /* compiled code */ }

        public final class ValidationResultsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }

        public final class ClientMetadataProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object UpdateAutomationCommandKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommand.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommand.Builder): com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommand.Builder /* compiled code */

            public final var name: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var description: kotlin.String /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

            public final var automationGraph: com.google.home.platform.traits.AutomationGraph /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.AutomationGraph) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.automationGraphOrNull: com.google.home.platform.traits.AutomationGraph? /* compiled code */
                public final get

            public final var active: kotlin.Boolean /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

            public final val clientMetadata: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.ClientMetadataProxy> /* compiled code */
                public final get

            public final var maxExecutionCount: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommand { /* compiled code */ }

            public final fun clearName(): kotlin.Unit { /* compiled code */ }

            public final fun clearDescription(): kotlin.Unit { /* compiled code */ }

            public final fun hasDescription(): kotlin.Boolean { /* compiled code */ }

            public final fun clearAutomationGraph(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomationGraph(): kotlin.Boolean { /* compiled code */ }

            public final fun clearActive(): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.ClientMetadataProxy>.put(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

            public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.ClientMetadataProxy>.set(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.ClientMetadataProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.ClientMetadataProxy>.putAll(map: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>): kotlin.Unit { /* compiled code */ }

            public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandKt.Dsl.ClientMetadataProxy>.clear(): kotlin.Unit { /* compiled code */ }

            public final fun clearMaxExecutionCount(): kotlin.Unit { /* compiled code */ }

            public final fun hasMaxExecutionCount(): kotlin.Boolean { /* compiled code */ }

            public final class ClientMetadataProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
            }
        }
    }

    public object UpdateAutomationCommandResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommandResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommandResponse.Builder): com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommandResponse.Builder /* compiled code */

            public final var automationEntityTrait: com.google.home.platform.traits.automation.AutomationEntityTrait /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.automation.AutomationEntityTrait) {/* compiled code */ }

            public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.automation.AutomationEntityTraitKt.UpdateAutomationCommandResponseKt.Dsl.automationEntityTraitOrNull: com.google.home.platform.traits.automation.AutomationEntityTrait? /* compiled code */
                public final get

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationEntityTrait.UpdateAutomationCommandResponse { /* compiled code */ }

            public final fun clearAutomationEntityTrait(): kotlin.Unit { /* compiled code */ }

            public final fun hasAutomationEntityTrait(): kotlin.Boolean { /* compiled code */ }
        }
    }

    public object DeleteAutomationCommandKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommand.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommand.Builder): com.google.home.platform.traits.automation.AutomationEntityTraitKt.DeleteAutomationCommandKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommand.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommand { /* compiled code */ }
        }
    }

    public object DeleteAutomationCommandResponseKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommandResponse.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommandResponse.Builder): com.google.home.platform.traits.automation.AutomationEntityTraitKt.DeleteAutomationCommandResponseKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommandResponse.Builder /* compiled code */

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.automation.AutomationEntityTrait.DeleteAutomationCommandResponse { /* compiled code */ }
        }
    }
}

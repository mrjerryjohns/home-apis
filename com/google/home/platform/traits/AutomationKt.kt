// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.platform.traits

public object AutomationKt {
    @kotlin.jvm.JvmName public final inline fun ephemeralAutomationInfo(block: com.google.home.platform.traits.AutomationKt.EphemeralAutomationInfoKt.Dsl.() -> kotlin.Unit): com.google.home.platform.traits.Automation.EphemeralAutomationInfo { /* compiled code */ }

    public final class Dsl private constructor(_builder: com.google.home.platform.traits.Automation.Builder) {
        public companion object {
            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Automation.Builder): com.google.home.platform.traits.AutomationKt.Dsl { /* compiled code */ }
        }

        private final val _builder: com.google.home.platform.traits.Automation.Builder /* compiled code */

        public final var automationId: kotlin.String /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationKt.Dsl.automationGraphOrNull: com.google.home.platform.traits.AutomationGraph? /* compiled code */
            public final get

        public final var validState: com.google.home.platform.traits.Automation.ValidState /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation.ValidState) {/* compiled code */ }

        public final var validStateValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final val validationResults: com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy> /* compiled code */
            public final get

        public final var activeState: com.google.home.platform.traits.Automation.ActiveState /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation.ActiveState) {/* compiled code */ }

        public final var activeStateValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var runningState: com.google.home.platform.traits.Automation.RunningState /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation.RunningState) {/* compiled code */ }

        public final var runningStateValue: kotlin.Int /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

        public final var createApplicationId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final val clientMetadata: com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.AutomationKt.Dsl.ClientMetadataProxy> /* compiled code */
            public final get

        public final var manuallyExecutable: kotlin.Boolean /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.Boolean) {/* compiled code */ }

        public final var automationObjectId: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var clientFeatureGroup: kotlin.String /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: kotlin.String) {/* compiled code */ }

        public final var ephemeralAutomationInfo: com.google.home.platform.traits.Automation.EphemeralAutomationInfo /* compiled code */
            public final @kotlin.jvm.JvmName get
            public final @kotlin.jvm.JvmName set(value: com.google.home.platform.traits.Automation.EphemeralAutomationInfo) {/* compiled code */ }

        public final val @receiver:androidx.annotation.NonNull com.google.home.platform.traits.AutomationKt.Dsl.ephemeralAutomationInfoOrNull: com.google.home.platform.traits.Automation.EphemeralAutomationInfo? /* compiled code */
            public final get

        @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Automation { /* compiled code */ }

        public final fun clearAutomationId(): kotlin.Unit { /* compiled code */ }

        public final fun clearStructureObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun clearName(): kotlin.Unit { /* compiled code */ }

        public final fun clearDescription(): kotlin.Unit { /* compiled code */ }

        public final fun hasDescription(): kotlin.Boolean { /* compiled code */ }

        public final fun clearAutomationGraph(): kotlin.Unit { /* compiled code */ }

        public final fun hasAutomationGraph(): kotlin.Boolean { /* compiled code */ }

        public final fun clearValidState(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy>.add(value: com.google.home.platform.traits.ValidationResult): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy>.plusAssign(value: com.google.home.platform.traits.ValidationResult): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy>.addAll(values: kotlin.collections.Iterable<com.google.home.platform.traits.ValidationResult>): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.home.platform.traits.ValidationResult>): kotlin.Unit { /* compiled code */ }

        public final operator fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy>.set(index: kotlin.Int, value: com.google.home.platform.traits.ValidationResult): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslList<com.google.home.platform.traits.ValidationResult, com.google.home.platform.traits.AutomationKt.Dsl.ValidationResultsProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearActiveState(): kotlin.Unit { /* compiled code */ }

        public final fun clearRunningState(): kotlin.Unit { /* compiled code */ }

        public final fun clearCreateApplicationId(): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.AutomationKt.Dsl.ClientMetadataProxy>.put(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

        public final inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.AutomationKt.Dsl.ClientMetadataProxy>.set(key: kotlin.String, value: com.google.protobuf.ByteString): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.AutomationKt.Dsl.ClientMetadataProxy>.remove(key: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.AutomationKt.Dsl.ClientMetadataProxy>.putAll(map: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>): kotlin.Unit { /* compiled code */ }

        public final fun com.google.protobuf.kotlin.DslMap<kotlin.String, com.google.protobuf.ByteString, com.google.home.platform.traits.AutomationKt.Dsl.ClientMetadataProxy>.clear(): kotlin.Unit { /* compiled code */ }

        public final fun clearManuallyExecutable(): kotlin.Unit { /* compiled code */ }

        public final fun clearAutomationObjectId(): kotlin.Unit { /* compiled code */ }

        public final fun hasAutomationObjectId(): kotlin.Boolean { /* compiled code */ }

        public final fun clearClientFeatureGroup(): kotlin.Unit { /* compiled code */ }

        public final fun hasClientFeatureGroup(): kotlin.Boolean { /* compiled code */ }

        public final fun clearEphemeralAutomationInfo(): kotlin.Unit { /* compiled code */ }

        public final fun hasEphemeralAutomationInfo(): kotlin.Boolean { /* compiled code */ }

        public final class ValidationResultsProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }

        public final class ClientMetadataProxy private constructor() : com.google.protobuf.kotlin.DslProxy {
        }
    }

    public object EphemeralAutomationInfoKt {
        public final class Dsl private constructor(_builder: com.google.home.platform.traits.Automation.EphemeralAutomationInfo.Builder) {
            public companion object {
                @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _create(builder: com.google.home.platform.traits.Automation.EphemeralAutomationInfo.Builder): com.google.home.platform.traits.AutomationKt.EphemeralAutomationInfoKt.Dsl { /* compiled code */ }
            }

            private final val _builder: com.google.home.platform.traits.Automation.EphemeralAutomationInfo.Builder /* compiled code */

            public final var maxExecutionCount: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            public final var executionCount: kotlin.Int /* compiled code */
                public final @kotlin.jvm.JvmName get
                public final @kotlin.jvm.JvmName set(value: kotlin.Int) {/* compiled code */ }

            @kotlin.PublishedApi @androidx.annotation.NonNull internal final fun _build(): com.google.home.platform.traits.Automation.EphemeralAutomationInfo { /* compiled code */ }

            public final fun clearMaxExecutionCount(): kotlin.Unit { /* compiled code */ }

            public final fun clearExecutionCount(): kotlin.Unit { /* compiled code */ }
        }
    }
}

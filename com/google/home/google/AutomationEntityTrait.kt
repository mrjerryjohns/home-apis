// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AutomationEntityTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.AutomationEntityTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.AutomationEntityTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.AutomationEntityTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val iqsAutomationId: kotlin.String

        public abstract val structureObjectId: kotlin.String

        public abstract val name: kotlin.String

        public abstract val description: kotlin.String

        public abstract val automationGraph: kotlin.ByteArray

        public abstract val valid: kotlin.Boolean

        public abstract val validationResults: kotlin.collections.List<kotlin.ByteArray>

        public abstract val active: kotlin.Boolean

        public abstract val manuallyExecutable: kotlin.Boolean

        public abstract val clientFeatureGroup: kotlin.String?

        public abstract val clientMetadata: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>

        public abstract val maxExecutionCount: kotlin.Int?
    }

    public final class AttributesImpl public constructor(iqsAutomationId: kotlin.String, structureObjectId: kotlin.String, name: kotlin.String, description: kotlin.String, automationGraph: kotlin.ByteArray, valid: kotlin.Boolean, validationResults: kotlin.collections.List<kotlin.ByteArray>, active: kotlin.Boolean, manuallyExecutable: kotlin.Boolean, clientMetadata: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString>, clientFeatureGroup: kotlin.String?, maxExecutionCount: kotlin.Int?) : com.google.home.google.AutomationEntityTrait.Attributes {
        public open val iqsAutomationId: kotlin.String /* compiled code */

        public open val structureObjectId: kotlin.String /* compiled code */

        public open val name: kotlin.String /* compiled code */

        public open val description: kotlin.String /* compiled code */

        public open val automationGraph: kotlin.ByteArray /* compiled code */

        public open val valid: kotlin.Boolean /* compiled code */

        public open val validationResults: kotlin.collections.List<kotlin.ByteArray> /* compiled code */

        public open val active: kotlin.Boolean /* compiled code */

        public open val manuallyExecutable: kotlin.Boolean /* compiled code */

        public open val clientMetadata: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString> /* compiled code */

        public open val clientFeatureGroup: kotlin.String? /* compiled code */

        public open val maxExecutionCount: kotlin.Int? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }
}


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AutomationEntity private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.AutomationEntityTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.AutomationEntityTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.AutomationEntity> {
    }

    internal final val attributes: com.google.home.google.AutomationEntityTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.AutomationEntity> /* compiled code */

    public open val active: kotlin.Boolean /* compiled code */

    public open val automationGraph: kotlin.ByteArray /* compiled code */

    public open val clientFeatureGroup: kotlin.String? /* compiled code */

    public open val clientMetadata: kotlin.collections.Map<kotlin.String, com.google.protobuf.ByteString> /* compiled code */

    public open val description: kotlin.String /* compiled code */

    public open val iqsAutomationId: kotlin.String /* compiled code */

    public open val manuallyExecutable: kotlin.Boolean /* compiled code */

    public open val maxExecutionCount: kotlin.Int? /* compiled code */

    public open val name: kotlin.String /* compiled code */

    public open val structureObjectId: kotlin.String /* compiled code */

    public open val valid: kotlin.Boolean /* compiled code */

    public open val validationResults: kotlin.collections.List<kotlin.ByteArray> /* compiled code */
}


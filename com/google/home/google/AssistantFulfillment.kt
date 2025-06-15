// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AssistantFulfillment private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.AssistantFulfillmentTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.AssistantFulfillmentTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.AssistantFulfillment> {
        public final fun okGoogle(query: kotlin.String): com.google.home.automation.Command { /* compiled code */ }
    }

    internal final val attributes: com.google.home.google.AssistantFulfillmentTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.AssistantFulfillment> /* compiled code */

    public final suspend fun okGoogle(query: kotlin.String): kotlin.Unit { /* compiled code */ }
}

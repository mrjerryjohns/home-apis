// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class AssistantBroadcast private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.AssistantBroadcastTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.AssistantBroadcastTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.AssistantBroadcast> {
        public final fun broadcast(msg: kotlin.String?): com.google.home.automation.Command { /* compiled code */ }
    }

    internal final val attributes: com.google.home.google.AssistantBroadcastTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.AssistantBroadcast> /* compiled code */

    public final suspend fun broadcast(msg: kotlin.String?): com.google.home.google.AssistantBroadcastTrait.BroadcastCommand.BroadcastCommandResponse { /* compiled code */ }
}

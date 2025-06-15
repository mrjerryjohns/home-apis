// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public abstract class PlatformTrait public constructor(metadata: com.google.home.Trait.TraitMetadata, traitClient: com.google.home.google.PlatformTraitClient) : com.google.home.Trait {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    public final val traitClient: com.google.home.google.PlatformTraitClient /* compiled code */

    public final suspend fun <T> write(parser: com.google.home.google.Parser<T>, attributes: T, useTimedInteraction: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    protected final suspend fun <REQUEST, RESPONSE> sendCommand(commandId: kotlin.String /* from: com.google.home.google.CommandId */, request: com.google.home.google.PlatformTraitPayload<REQUEST>, responseParser: com.google.home.google.Parser<RESPONSE>): RESPONSE { /* compiled code */ }

    protected final suspend fun <REQUEST> sendCommand(commandId: kotlin.String /* from: com.google.home.google.CommandId */, request: com.google.home.google.PlatformTraitPayload<REQUEST>): kotlin.Unit { /* compiled code */ }

    protected final suspend fun <RESPONSE> sendCommand(commandId: kotlin.String /* from: com.google.home.google.CommandId */, responseParser: com.google.home.google.Parser<RESPONSE>): RESPONSE { /* compiled code */ }

    protected final suspend fun sendCommand(commandId: kotlin.String /* from: com.google.home.google.CommandId */): kotlin.Unit { /* compiled code */ }
}


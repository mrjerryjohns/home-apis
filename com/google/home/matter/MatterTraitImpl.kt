// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter

public abstract class MatterTraitImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient) : com.google.home.matter.MatterTrait, com.google.home.TraitStateInvalidation {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    public final val client: com.google.home.matter.MatterTraitClient /* compiled code */

    public final suspend fun <T> write(adapter: com.google.home.matter.serialization.StructAdapter<T>, attributes: T, useTimedInteraction: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public final suspend fun <REQUEST, RESPONSE> sendCommand(commandId: com.google.home.matter.serialization.ScopedCommandId, request: REQUEST, requestAdapter: com.google.home.matter.serialization.StructAdapter<REQUEST>, responseAdapter: com.google.home.matter.serialization.StructAdapter<RESPONSE>, useTimedCommand: kotlin.Boolean = COMPILED_CODE): RESPONSE { /* compiled code */ }

    public final suspend fun <REQUEST> sendCommand(commandId: com.google.home.matter.serialization.ScopedCommandId, request: REQUEST, requestAdapter: com.google.home.matter.serialization.StructAdapter<REQUEST>, useTimedCommand: kotlin.Boolean = COMPILED_CODE): kotlin.Unit { /* compiled code */ }

    public final fun <REQUEST> createObjectCommand(commandId: com.google.home.matter.serialization.ScopedCommandId, request: REQUEST, requestAdapter: com.google.home.matter.serialization.StructAdapter<REQUEST>, useTimedCommand: kotlin.Boolean = COMPILED_CODE): com.google.nest.platform.mesh.interaction.ObjectCommand { /* compiled code */ }

    public open suspend fun forceRead(): kotlin.Unit { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter

public interface MatterTraitClient : com.google.home.TraitStateInvalidation {
    public abstract suspend fun <REQUEST, RESPONSE> sendCommand(commandId: com.google.home.matter.serialization.ScopedCommandId, requestAdapter: com.google.home.matter.serialization.StructAdapter<REQUEST>, responseAdapter: com.google.home.matter.serialization.StructAdapter<RESPONSE>, request: REQUEST, useTimedCommand: kotlin.Boolean): RESPONSE

    public abstract suspend fun <T> write(adapter: com.google.home.matter.serialization.StructAdapter<T>, attributes: T, useTimedInteraction: kotlin.Boolean = COMPILED_CODE): kotlin.Unit

    public abstract fun <REQUEST> createObjectCommand(commandId: com.google.home.matter.serialization.ScopedCommandId, requestAdapter: com.google.home.matter.serialization.StructAdapter<REQUEST>, request: REQUEST, useTimedCommand: kotlin.Boolean): com.google.nest.platform.mesh.interaction.ObjectCommand

    public abstract fun strictOperationValidation(): kotlin.Boolean
}


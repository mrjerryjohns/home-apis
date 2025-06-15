// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class PlatformTraitFactory<T : com.google.home.google.PlatformTrait, A : kotlin.Any> public constructor(traitId: kotlin.String /* from: com.google.home.google.TraitId */, parser: com.google.home.google.Parser<A>, enumAdapters: kotlin.collections.Map<kotlin.String, com.google.home.google.PlatformEnumAdapter<*>>, creator: (com.google.home.Trait.TraitMetadata, com.google.home.google.PlatformTraitClient, A) -> T, supportedEvents: kotlin.collections.Map<kotlin.String, com.google.home.EventFactory<*>> = COMPILED_CODE, commands: kotlin.collections.Map<kotlin.String, com.google.home.CommandDescriptor> = COMPILED_CODE) : com.google.home.InternalTraitFactory<T> {
    public open val traitId: kotlin.String /* from: com.google.home.google.TraitId */ /* compiled code */

    public final val parser: com.google.home.google.Parser<A> /* compiled code */

    public final val enumAdapters: kotlin.collections.Map<kotlin.String, com.google.home.google.PlatformEnumAdapter<*>> /* compiled code */

    public final val creator: (com.google.home.Trait.TraitMetadata, com.google.home.google.PlatformTraitClient, A) -> T /* compiled code */

    public final val supportedEvents: kotlin.collections.Map<kotlin.String, com.google.home.EventFactory<*>> /* compiled code */

    public final val commands: kotlin.collections.Map<kotlin.String, com.google.home.CommandDescriptor> /* compiled code */

    public final fun createTrait(payload: com.google.nest.platform.mesh.serialization.TraitElementPayload, metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient): T { /* compiled code */ }

    private final fun decodePayloadValueToProtoBytes(payloadValue: kotlin.String): kotlin.ByteArray { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }
}

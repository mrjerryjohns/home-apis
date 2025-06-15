// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter

public final class MatterTraitFactory<T : com.google.home.matter.MatterTrait, A : kotlin.Any> public constructor(clusterId: com.google.home.matter.serialization.ClusterId, adapter: com.google.home.matter.serialization.StructAdapter<A>, enumAdapters: kotlin.collections.Map<kotlin.String, com.google.home.matter.serialization.EnumAdapter<*>>, bitmapAdapters: kotlin.collections.Map<kotlin.String, com.google.home.matter.serialization.BitmapAdapter<*>>, creator: (com.google.home.Trait.TraitMetadata, com.google.home.matter.MatterTraitClient, A) -> T, supportedEvents: kotlin.collections.Map<kotlin.String, com.google.home.EventFactory<*>> = COMPILED_CODE, commands: kotlin.collections.Map<kotlin.String, com.google.home.CommandDescriptor> = COMPILED_CODE) : com.google.home.InternalTraitFactory<T> {
    public final val clusterId: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final val adapter: com.google.home.matter.serialization.StructAdapter<A> /* compiled code */

    public final val enumAdapters: kotlin.collections.Map<kotlin.String, com.google.home.matter.serialization.EnumAdapter<*>> /* compiled code */

    public final val bitmapAdapters: kotlin.collections.Map<kotlin.String, com.google.home.matter.serialization.BitmapAdapter<*>> /* compiled code */

    public final val creator: (com.google.home.Trait.TraitMetadata, com.google.home.matter.MatterTraitClient, A) -> T /* compiled code */

    public final val supportedEvents: kotlin.collections.Map<kotlin.String, com.google.home.EventFactory<*>> /* compiled code */

    public final val commands: kotlin.collections.Map<kotlin.String, com.google.home.CommandDescriptor> /* compiled code */

    public open val traitId: kotlin.String /* compiled code */
        public open get

    public final fun createTrait(payload: com.google.nest.platform.mesh.serialization.TraitElementPayload, metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient): T { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public abstract class DeviceType public constructor(traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents) : com.google.home.HomeObjectType, com.google.home.TraitProvider, com.google.home.HasEvents {
    public companion object {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */
    }

    protected final val traitProvider: com.google.home.TraitProvider /* compiled code */

    private final val eventProvider: com.google.home.HasEvents /* compiled code */

    public abstract val metadata: com.google.home.DeviceType.Metadata

    public abstract val factory: com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun events(): kotlinx.coroutines.flow.Flow<com.google.home.Event> { /* compiled code */ }

    public open fun <T : com.google.home.Trait> events(trait: com.google.home.TraitFactory<T>): kotlinx.coroutines.flow.Flow<com.google.home.Event> { /* compiled code */ }

    public open fun <T : com.google.home.Event> events(event: com.google.home.EventFactory<T>): kotlinx.coroutines.flow.Flow<T> { /* compiled code */ }

    public open fun <T : com.google.home.Trait> trait(traitFactory: com.google.home.TraitFactory<T>): T? { /* compiled code */ }

    public open fun traits(): kotlin.collections.Set<com.google.home.Trait> { /* compiled code */ }

    public final class Metadata public constructor(isPrimaryType: kotlin.Boolean, sourceConnectivity: com.google.home.SourceConnectivity = COMPILED_CODE) {
        public final val isPrimaryType: kotlin.Boolean /* compiled code */

        public final val sourceConnectivity: com.google.home.SourceConnectivity /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}

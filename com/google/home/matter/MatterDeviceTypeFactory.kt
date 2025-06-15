// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter

public abstract class MatterDeviceTypeFactory<T : com.google.home.DeviceType> public constructor(typeId: com.google.home.Id, traits: kotlin.collections.List<com.google.home.TraitFactory<*>> = COMPILED_CODE) : com.google.home.InternalDeviceTypeFactory<T> {
    public open val typeId: com.google.home.Id /* compiled code */

    public open val traits: kotlin.collections.List<com.google.home.TraitFactory<*>> /* compiled code */

    public abstract fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): T

    protected final fun <T : com.google.home.Trait> @receiver:androidx.annotation.NonNull kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>.getAs(key: com.google.home.TraitFactory<T>): T? { /* compiled code */ }

    protected final fun <T : com.google.home.Trait> @receiver:androidx.annotation.NonNull kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>.getRequired(key: com.google.home.TraitFactory<T>): T { /* compiled code */ }

    public final fun toString(): kotlin.String { /* compiled code */ }

    public final operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public final fun hashCode(): kotlin.Int { /* compiled code */ }
}


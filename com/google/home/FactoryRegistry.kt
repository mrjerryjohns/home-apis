// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public final class FactoryRegistry public constructor(traits: kotlin.collections.List<com.google.home.TraitFactory<out com.google.home.Trait>> = COMPILED_CODE, types: kotlin.collections.List<com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>> = COMPILED_CODE) {
    private final val traitRegistry: kotlin.collections.Map<kotlin.String, com.google.home.TraitFactory<out com.google.home.Trait>> /* compiled code */

    private final val typeRegistry: kotlin.collections.Map<kotlin.String, com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>> /* compiled code */

    public final fun getTrait(traitId: kotlin.String): com.google.home.TraitFactory<out com.google.home.Trait> { /* compiled code */ }

    public final fun getTraitOrNull(traitId: kotlin.String): com.google.home.TraitFactory<out com.google.home.Trait>? { /* compiled code */ }

    public final fun getType(typeId: kotlin.String): com.google.home.DeviceTypeFactory<out com.google.home.DeviceType> { /* compiled code */ }

    public final fun getTypeOrNull(typeId: kotlin.String): com.google.home.DeviceTypeFactory<out com.google.home.DeviceType>? { /* compiled code */ }
}

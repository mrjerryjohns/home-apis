// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class UnknownTrait public constructor(id: kotlin.String) : com.google.home.Trait {
    public final val id: kotlin.String /* compiled code */

    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.automation.UnknownTrait> /* compiled code */

    public final class UnknownTraitFactory public constructor(id: kotlin.String) : com.google.home.TraitFactory<com.google.home.automation.UnknownTrait> {
        public final val id: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }

    private final class Factory public constructor(traitId: kotlin.String) : com.google.home.InternalTraitFactory<com.google.home.automation.UnknownTrait> {
        public open val traitId: kotlin.String /* compiled code */
    }
}

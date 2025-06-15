// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface Trait {
    public abstract val metadata: com.google.home.Trait.TraitMetadata

    public abstract val factory: com.google.home.TraitFactory<out com.google.home.Trait>

    public final class TraitMetadata public constructor(sourceConnectivity: com.google.home.SourceConnectivity? = COMPILED_CODE) {
        public final val sourceConnectivity: com.google.home.SourceConnectivity? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }
}


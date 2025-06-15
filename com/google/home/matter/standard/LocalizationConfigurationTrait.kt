// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object LocalizationConfigurationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes { /* compiled code */ }
        }

        public abstract val activeLocale: kotlin.String?

        public abstract val supportedLocales: kotlin.collections.List<kotlin.String>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(activeLocale: kotlin.String? = COMPILED_CODE, supportedLocales: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes, com.google.home.matter.standard.LocalizationConfigurationTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes) { /* compiled code */ }

        public open val activeLocale: kotlin.String? /* compiled code */

        public open val supportedLocales: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.LocalizationConfigurationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(activeLocale: kotlin.String? = COMPILED_CODE, supportedLocales: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.LocalizationConfigurationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.LocalizationConfigurationTrait.Attributes) : com.google.home.matter.standard.LocalizationConfigurationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LocalizationConfigurationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LocalizationConfigurationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LocalizationConfigurationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _activeLocale: kotlin.String? /* compiled code */

        public open val activeLocale: kotlin.String? /* compiled code */
            public open get

        public final fun setActiveLocale(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }
}


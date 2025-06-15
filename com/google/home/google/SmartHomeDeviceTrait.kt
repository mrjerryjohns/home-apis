// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class SmartHomeDeviceTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.SmartHomeDeviceTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.SmartHomeDeviceTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.SmartHomeDeviceTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }

        public abstract val agentId: kotlin.String?
    }

    public open class AttributesImpl public constructor(agentId: kotlin.String?) : com.google.home.google.SmartHomeDeviceTrait.Attributes {
        public open val agentId: kotlin.String? /* compiled code */
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.google.SmartHomeDeviceTrait.Attributes) : com.google.home.google.SmartHomeDeviceTrait.AttributesImpl {
    }
}

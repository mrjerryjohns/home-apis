// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class VoiceStarterTrait public constructor() {
    public companion object {
        public const final val ID: kotlin.String /* from: com.google.home.google.TraitId */ = COMPILED_CODE /* compiled code */
    }

    public interface Attributes {
        public companion object : com.google.home.google.Parser<com.google.home.google.VoiceStarterTrait.Attributes> {
            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.VoiceStarterTrait.Attributes { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.VoiceStarterTrait.Attributes): kotlin.ByteArray { /* compiled code */ }
        }
    }

    public interface OkGoogleEvent {
        public abstract val query: kotlin.String
    }

    public final class OkGoogleEventImpl public constructor(query: kotlin.String) : com.google.home.google.VoiceStarterTrait.OkGoogleEvent {
        public companion object : com.google.home.google.Parser<com.google.home.google.VoiceStarterTrait.OkGoogleEvent> {
            public const final val ID: kotlin.String = COMPILED_CODE /* compiled code */

            public open fun parseFrom(byteArray: kotlin.ByteArray): com.google.home.google.VoiceStarterTrait.OkGoogleEvent { /* compiled code */ }

            public open fun encode(payload: com.google.home.google.VoiceStarterTrait.OkGoogleEvent): kotlin.ByteArray { /* compiled code */ }
        }

        public open val query: kotlin.String /* compiled code */
    }

    public final class AttributesImpl public constructor() : com.google.home.google.VoiceStarterTrait.Attributes {
    }
}

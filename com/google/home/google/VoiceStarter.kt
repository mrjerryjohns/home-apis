// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class VoiceStarter private constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.google.PlatformTraitClient, attributes: com.google.home.google.VoiceStarterTrait.Attributes) : com.google.home.google.PlatformTrait, com.google.home.google.VoiceStarterTrait.Attributes {
    public companion object : com.google.home.TraitFactory<com.google.home.google.VoiceStarter> {
    }

    internal final val attributes: com.google.home.google.VoiceStarterTrait.Attributes /* compiled code */

    public open val factory: com.google.home.TraitFactory<com.google.home.google.VoiceStarter> /* compiled code */

    public final class OkGoogleEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.VoiceStarterTrait.OkGoogleEvent) : com.google.home.Event, com.google.home.google.VoiceStarterTrait.OkGoogleEvent {
        public companion object : com.google.home.EventFactory<com.google.home.google.VoiceStarter.OkGoogleEvent> {
            public final fun query(query: kotlin.String): com.google.home.automation.Parameter { /* compiled code */ }

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getEventFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.VoiceStarterTrait.OkGoogleEvent /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val query: kotlin.String /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.VoiceStarter.OkGoogleEvent.EventFields> {
            @androidx.annotation.NonNull query;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }
}

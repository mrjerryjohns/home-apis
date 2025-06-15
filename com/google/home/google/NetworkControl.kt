// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface NetworkControl : com.google.home.google.NetworkControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.NetworkControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.NetworkControl> {
        public final val networkProfiles: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val networkEnabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val guestNetworkEnabled: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val networkSettings: com.google.home.automation.Attribute<com.google.home.google.NetworkControlTrait.NetworkSettings?> /* compiled code */
            public final get

        public final val networkUsageUnlimited: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val networkUsageLimitMb: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val networkUsageMb: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val networkProfileStates: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>?> /* compiled code */
            public final get

        public final val lastNetworkUploadSpeedTest: com.google.home.automation.Attribute<com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest?> /* compiled code */
            public final get

        public final val networkSpeedTestInProgress: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val guestNetworkSettings: com.google.home.automation.Attribute<com.google.home.google.NetworkControlTrait.GuestNetworkSettings?> /* compiled code */
            public final get

        public final val numConnectedDevices: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val lastNetworkDownloadSpeedTest: com.google.home.automation.Attribute<com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.google.NetworkControlTrait.NetworkControlFeature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkProfiles: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkEnabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.guestNetworkEnabled: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkSettings: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.NetworkSettings?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkUsageUnlimited: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkUsageLimitMb: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkUsageMb: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkProfileStates: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.NetworkControlTrait.NetworkProfileState>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.lastNetworkUploadSpeedTest: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.LastNetworkUploadSpeedTest?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.networkSpeedTestInProgress: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.guestNetworkSettings: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.GuestNetworkSettings?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.numConnectedDevices: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.lastNetworkDownloadSpeedTest: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.LastNetworkDownloadSpeedTest?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.NetworkControlFeature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun enableDisableGuestNetwork(enable: kotlin.Boolean): com.google.home.automation.Command { /* compiled code */ }

        public final fun enableDisableNetworkProfile(enable: kotlin.Boolean, networkProfileName: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun getGuestNetworkPassword(): com.google.home.automation.Command { /* compiled code */ }

        public final fun testNetworkSpeed(testUploadSpeed: kotlin.Boolean, testDownloadSpeed: kotlin.Boolean): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.NetworkControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.NetworkControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.NetworkControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControl.Attribute> {
        @androidx.annotation.NonNull networkProfiles,

        @androidx.annotation.NonNull networkEnabled,

        @androidx.annotation.NonNull guestNetworkEnabled,

        @androidx.annotation.NonNull networkSettings,

        @androidx.annotation.NonNull networkUsageUnlimited,

        @androidx.annotation.NonNull networkUsageLimitMb,

        @androidx.annotation.NonNull networkUsageMb,

        @androidx.annotation.NonNull networkProfileStates,

        @androidx.annotation.NonNull lastNetworkUploadSpeedTest,

        @androidx.annotation.NonNull networkSpeedTestInProgress,

        @androidx.annotation.NonNull guestNetworkSettings,

        @androidx.annotation.NonNull numConnectedDevices,

        @androidx.annotation.NonNull lastNetworkDownloadSpeedTest,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

        public companion object {
            public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
        }

        public open val fieldName: kotlin.String /* compiled code */

        public open val tag: kotlin.UInt /* compiled code */

        public open val typeName: kotlin.String /* compiled code */

        public open val typeEnum: com.google.home.Type /* compiled code */

        public open val descriptor: com.google.home.Descriptor /* compiled code */

        public final val isNullable: kotlin.Boolean /* compiled code */
    }

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.NetworkControl.Command> {
        @androidx.annotation.NonNull EnableDisableGuestNetwork,

        @androidx.annotation.NonNull EnableDisableNetworkProfile,

        @androidx.annotation.NonNull GetGuestNetworkPassword,

        @androidx.annotation.NonNull TestNetworkSpeed;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class TestNetworkSpeedFollowUpEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp) : com.google.home.Event, com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp {
        public companion object : com.google.home.EventFactory<com.google.home.google.NetworkControl.TestNetworkSpeedFollowUpEvent> {
            public final val status: com.google.home.automation.EventField<com.google.home.google.NetworkControlTrait.SpeedTestStatus?> /* compiled code */
                public final get

            public final val networkUploadSpeedMbps: com.google.home.automation.EventField<kotlin.Float?> /* compiled code */
                public final get

            public final val networkDownloadSpeedMbps: com.google.home.automation.EventField<kotlin.Float?> /* compiled code */
                public final get

            public final val errorCode: com.google.home.automation.EventField<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl.TestNetworkSpeedFollowUpEvent?>.status: com.google.home.automation.TypedExpression<com.google.home.google.NetworkControlTrait.SpeedTestStatus?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl.TestNetworkSpeedFollowUpEvent?>.networkUploadSpeedMbps: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl.TestNetworkSpeedFollowUpEvent?>.networkDownloadSpeedMbps: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.NetworkControl.TestNetworkSpeedFollowUpEvent?>.errorCode: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.google.NetworkControlTrait.TestNetworkSpeedFollowUp /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val errorCode: kotlin.String? /* compiled code */

        public open val networkDownloadSpeedMbps: kotlin.Float? /* compiled code */

        public open val networkUploadSpeedMbps: kotlin.Float? /* compiled code */

        public open val status: com.google.home.google.NetworkControlTrait.SpeedTestStatus? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.NetworkControl.TestNetworkSpeedFollowUpEvent.EventFields> {
            @androidx.annotation.NonNull status,

            @androidx.annotation.NonNull networkUploadSpeedMbps,

            @androidx.annotation.NonNull networkDownloadSpeedMbps,

            @androidx.annotation.NonNull errorCode;

            public companion object {
                public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
            }

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }
}

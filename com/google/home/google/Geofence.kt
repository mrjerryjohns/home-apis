// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface Geofence : com.google.home.google.GeofenceTrait.Attributes, com.google.home.matter.MatterTrait {
    public companion object : com.google.home.TraitFactory<com.google.home.google.Geofence> {
        public final val currentGeofenceRadius: com.google.home.automation.Attribute<kotlin.Double?> /* compiled code */
            public final get

        public final val agentId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val structureId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val durationSinceRebootSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val addressId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val supportedGeofenceRadii: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.Double>?> /* compiled code */
            public final get

        public final val agentDeviceId: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val clientEnvironment: com.google.home.automation.Attribute<com.google.home.google.GeofenceTrait.ClientEnvironment?> /* compiled code */
            public final get

        public final val locationState: com.google.home.automation.Attribute<com.google.home.google.GeofenceTrait.LocationState?> /* compiled code */
            public final get

        public final val observedTimestampSeconds: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val localizedEventTime: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val accuracyInMeters: com.google.home.automation.Attribute<kotlin.Double?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.currentGeofenceRadius: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.agentId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.structureId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.durationSinceRebootSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.addressId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.supportedGeofenceRadii: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.Double>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.agentDeviceId: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.clientEnvironment: com.google.home.automation.TypedExpression<com.google.home.google.GeofenceTrait.ClientEnvironment?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.locationState: com.google.home.automation.TypedExpression<com.google.home.google.GeofenceTrait.LocationState?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.observedTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.localizedEventTime: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.accuracyInMeters: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Geofence?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.Geofence> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.Geofence.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Geofence.Attribute> {
        @androidx.annotation.NonNull currentGeofenceRadius,

        @androidx.annotation.NonNull agentId,

        @androidx.annotation.NonNull structureId,

        @androidx.annotation.NonNull durationSinceRebootSeconds,

        @androidx.annotation.NonNull addressId,

        @androidx.annotation.NonNull supportedGeofenceRadii,

        @androidx.annotation.NonNull agentDeviceId,

        @androidx.annotation.NonNull clientEnvironment,

        @androidx.annotation.NonNull locationState,

        @androidx.annotation.NonNull observedTimestampSeconds,

        @androidx.annotation.NonNull localizedEventTime,

        @androidx.annotation.NonNull accuracyInMeters,

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
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class GeofenceImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.GeofenceTrait.Attributes) : com.google.home.google.Geofence, com.google.home.matter.MatterTraitImpl, com.google.home.google.GeofenceTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.GeofenceTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val accuracyInMeters: kotlin.Double? /* compiled code */

    public open val addressId: kotlin.String? /* compiled code */

    public open val agentDeviceId: kotlin.String? /* compiled code */

    public open val agentId: kotlin.String? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clientEnvironment: com.google.home.google.GeofenceTrait.ClientEnvironment? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentGeofenceRadius: kotlin.Double? /* compiled code */

    public open val durationSinceRebootSeconds: kotlin.Long? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val localizedEventTime: kotlin.String? /* compiled code */

    public open val locationState: com.google.home.google.GeofenceTrait.LocationState? /* compiled code */

    public open val observedTimestampSeconds: kotlin.Long? /* compiled code */

    public open val structureId: kotlin.String? /* compiled code */

    public open val supportedGeofenceRadii: kotlin.collections.List<kotlin.Double>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.Geofence.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ParkingLocationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final class CurrentParkingLocation public constructor(locationDescription: kotlin.collections.List<kotlin.String> = COMPILED_CODE, languageCode: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ParkingLocationTrait.CurrentParkingLocation>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ParkingLocationTrait.CurrentParkingLocation?>.locationDescription: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ParkingLocationTrait.CurrentParkingLocation?>.languageCode: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ParkingLocationTrait.CurrentParkingLocation): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ParkingLocationTrait.CurrentParkingLocation { /* compiled code */ }
        }

        public final val locationDescription: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val languageCode: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ParkingLocationTrait.CurrentParkingLocation.StructFields> {
            @androidx.annotation.NonNull locationDescription,

            @androidx.annotation.NonNull languageCode;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ParkingLocationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ParkingLocationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ParkingLocationTrait.Attributes { /* compiled code */ }
        }

        public abstract val currentParkingLocation: kotlin.collections.List<com.google.home.google.ParkingLocationTrait.CurrentParkingLocation>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(currentParkingLocation: kotlin.collections.List<com.google.home.google.ParkingLocationTrait.CurrentParkingLocation>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ParkingLocationTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ParkingLocationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ParkingLocationTrait.Attributes) { /* compiled code */ }

        public open val currentParkingLocation: kotlin.collections.List<com.google.home.google.ParkingLocationTrait.CurrentParkingLocation>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(currentParkingLocation: kotlin.collections.List<com.google.home.google.ParkingLocationTrait.CurrentParkingLocation>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ParkingLocationTrait.AttributesImpl { /* compiled code */ }
    }
}


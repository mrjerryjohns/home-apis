// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedSmokeCoAlarmTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ExtendedEndOfServiceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum> {
        @androidx.annotation.NonNull Standard,

        @androidx.annotation.NonNull ExpiringSoon,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface ExtendedEndOfService {
        public abstract val priority: kotlin.UInt?

        public abstract val current: kotlin.collections.List<com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum>?

        public abstract val expiryDate: kotlin.Long?
    }

    public final class ExtendedEndOfServiceImpl public constructor(priority: kotlin.UInt? = COMPILED_CODE, current: kotlin.collections.List<com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum>? = COMPILED_CODE, expiryDate: kotlin.Long? = COMPILED_CODE) : com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfService {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfService> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfService): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfService { /* compiled code */ }
        }

        public open val priority: kotlin.UInt? /* compiled code */

        public open val current: kotlin.collections.List<com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum>? /* compiled code */

        public open val expiryDate: kotlin.Long? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedSmokeCoAlarmTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedSmokeCoAlarmTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedSmokeCoAlarmTrait.Attributes { /* compiled code */ }
        }

        public abstract val extendedEndOfServiceAlert: com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(extendedEndOfServiceAlert: com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedSmokeCoAlarmTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedSmokeCoAlarmTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedSmokeCoAlarmTrait.Attributes) { /* compiled code */ }

        public open val extendedEndOfServiceAlert: com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(extendedEndOfServiceAlert: com.google.home.google.ExtendedSmokeCoAlarmTrait.ExtendedEndOfServiceEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedSmokeCoAlarmTrait.AttributesImpl { /* compiled code */ }
    }
}


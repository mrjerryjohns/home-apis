// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object BridgedDeviceBasicInformationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ColorEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ColorEnum> {
        @androidx.annotation.NonNull Black,

        @androidx.annotation.NonNull Navy,

        @androidx.annotation.NonNull Green,

        @androidx.annotation.NonNull Teal,

        @androidx.annotation.NonNull Maroon,

        @androidx.annotation.NonNull Purple,

        @androidx.annotation.NonNull Olive,

        @androidx.annotation.NonNull Gray,

        @androidx.annotation.NonNull Blue,

        @androidx.annotation.NonNull Lime,

        @androidx.annotation.NonNull Aqua,

        @androidx.annotation.NonNull Red,

        @androidx.annotation.NonNull Fuchsia,

        @androidx.annotation.NonNull Yellow,

        @androidx.annotation.NonNull White,

        @androidx.annotation.NonNull Nickel,

        @androidx.annotation.NonNull Chrome,

        @androidx.annotation.NonNull Brass,

        @androidx.annotation.NonNull Copper,

        @androidx.annotation.NonNull Silver,

        @androidx.annotation.NonNull Gold,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ColorEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ProductFinishEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductFinishEnum> {
        @androidx.annotation.NonNull Other,

        @androidx.annotation.NonNull Matte,

        @androidx.annotation.NonNull Satin,

        @androidx.annotation.NonNull Polished,

        @androidx.annotation.NonNull Rugged,

        @androidx.annotation.NonNull Fabric,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductFinishEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(bridgedIcdSupport: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature> {
            private const final val BRIDGED_ICD_SUPPORT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature { /* compiled code */ }
        }

        public final val bridgedIcdSupport: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(bridgedIcdSupport: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface StartUp {
        public abstract val softwareVersion: kotlin.UInt?
    }

    public final class StartUpImpl public constructor(softwareVersion: kotlin.UInt? = COMPILED_CODE) : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.StartUp { /* compiled code */ }
        }

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ShutDown {
    }

    public final class ShutDownImpl public constructor() : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ShutDown {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ShutDown> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ShutDownImpl { /* compiled code */ }
        }
    }

    public interface Leave {
    }

    public final class LeaveImpl public constructor() : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Leave {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Leave> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.LeaveImpl { /* compiled code */ }
        }
    }

    public interface ReachableChanged {
        public abstract val reachableNewValue: kotlin.Boolean?
    }

    public final class ReachableChangedImpl public constructor(reachableNewValue: kotlin.Boolean? = COMPILED_CODE) : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ReachableChanged { /* compiled code */ }
        }

        public open val reachableNewValue: kotlin.Boolean? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface ActiveChanged {
        public abstract val promisedActiveDuration: kotlin.UInt?
    }

    public final class ActiveChangedImpl public constructor(promisedActiveDuration: kotlin.UInt? = COMPILED_CODE) : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ActiveChanged { /* compiled code */ }
        }

        public open val promisedActiveDuration: kotlin.UInt? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ProductAppearanceStruct public constructor(finish: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductFinishEnum = COMPILED_CODE, primaryColor: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ColorEnum? = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct?>.finish: com.google.home.automation.TypedExpression<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductFinishEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct?>.primaryColor: com.google.home.automation.TypedExpression<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ColorEnum?> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct { /* compiled code */ }
        }

        public final val finish: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductFinishEnum /* compiled code */

        public final val primaryColor: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ColorEnum? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct.StructFields> {
            @androidx.annotation.NonNull finish,

            @androidx.annotation.NonNull primaryColor;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes { /* compiled code */ }
        }

        public abstract val vendorName: kotlin.String?

        public abstract val vendorId: kotlin.UShort?

        public abstract val productName: kotlin.String?

        public abstract val productId: kotlin.UShort?

        public abstract val nodeLabel: kotlin.String?

        public abstract val hardwareVersion: kotlin.UShort?

        public abstract val hardwareVersionString: kotlin.String?

        public abstract val softwareVersion: kotlin.UInt?

        public abstract val softwareVersionString: kotlin.String?

        public abstract val manufacturingDate: kotlin.String?

        public abstract val partNumber: kotlin.String?

        public abstract val productUrl: kotlin.String?

        public abstract val productLabel: kotlin.String?

        public abstract val serialNumber: kotlin.String?

        public abstract val reachable: kotlin.Boolean?

        public abstract val uniqueId: kotlin.String?

        public abstract val productAppearance: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(vendorName: kotlin.String? = COMPILED_CODE, vendorId: kotlin.UShort? = COMPILED_CODE, productName: kotlin.String? = COMPILED_CODE, productId: kotlin.UShort? = COMPILED_CODE, nodeLabel: kotlin.String? = COMPILED_CODE, hardwareVersion: kotlin.UShort? = COMPILED_CODE, hardwareVersionString: kotlin.String? = COMPILED_CODE, softwareVersion: kotlin.UInt? = COMPILED_CODE, softwareVersionString: kotlin.String? = COMPILED_CODE, manufacturingDate: kotlin.String? = COMPILED_CODE, partNumber: kotlin.String? = COMPILED_CODE, productUrl: kotlin.String? = COMPILED_CODE, productLabel: kotlin.String? = COMPILED_CODE, serialNumber: kotlin.String? = COMPILED_CODE, reachable: kotlin.Boolean? = COMPILED_CODE, uniqueId: kotlin.String? = COMPILED_CODE,
        productAppearance: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes, com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes>
        {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes) { /* compiled code */ }

        public open val vendorName: kotlin.String? /* compiled code */

        public open val vendorId: kotlin.UShort? /* compiled code */

        public open val productName: kotlin.String? /* compiled code */

        public open val productId: kotlin.UShort? /* compiled code */

        public open val nodeLabel: kotlin.String? /* compiled code */

        public open val hardwareVersion: kotlin.UShort? /* compiled code */

        public open val hardwareVersionString: kotlin.String? /* compiled code */

        public open val softwareVersion: kotlin.UInt? /* compiled code */

        public open val softwareVersionString: kotlin.String? /* compiled code */

        public open val manufacturingDate: kotlin.String? /* compiled code */

        public open val partNumber: kotlin.String? /* compiled code */

        public open val productUrl: kotlin.String? /* compiled code */

        public open val productLabel: kotlin.String? /* compiled code */

        public open val serialNumber: kotlin.String? /* compiled code */

        public open val reachable: kotlin.Boolean? /* compiled code */

        public open val uniqueId: kotlin.String? /* compiled code */

        public open val productAppearance: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(vendorName: kotlin.String? = COMPILED_CODE, vendorId: kotlin.UShort? = COMPILED_CODE, productName: kotlin.String? = COMPILED_CODE, productId: kotlin.UShort? = COMPILED_CODE, nodeLabel: kotlin.String? = COMPILED_CODE, hardwareVersion: kotlin.UShort? = COMPILED_CODE, hardwareVersionString: kotlin.String? = COMPILED_CODE, softwareVersion: kotlin.UInt? = COMPILED_CODE, softwareVersionString: kotlin.String? = COMPILED_CODE, manufacturingDate: kotlin.String? = COMPILED_CODE, partNumber: kotlin.String? = COMPILED_CODE, productUrl: kotlin.String? = COMPILED_CODE, productLabel: kotlin.String? = COMPILED_CODE, serialNumber: kotlin.String? = COMPILED_CODE, reachable: kotlin.Boolean? = COMPILED_CODE, uniqueId: kotlin.String? = COMPILED_CODE, productAppearance:
            com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.ProductAppearanceStruct? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.Attributes) : com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _nodeLabel: kotlin.String? /* compiled code */

        public open val nodeLabel: kotlin.String? /* compiled code */
            public open get

        public final fun setNodeLabel(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object KeepActiveCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stayActiveDuration: kotlin.UInt = COMPILED_CODE, timeoutMs: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.KeepActiveCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.KeepActiveCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.KeepActiveCommand.Request { /* compiled code */ }
            }

            public final val stayActiveDuration: kotlin.UInt /* compiled code */

            public final val timeoutMs: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BridgedDeviceBasicInformationTrait.KeepActiveCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stayActiveDuration,

                @androidx.annotation.NonNull timeoutMs;

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
}

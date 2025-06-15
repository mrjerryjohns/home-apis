// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedColorControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedColorControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedColorControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedColorControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val colorLoopEndTimestampSeconds: kotlin.ULong?

        public abstract val currentName: kotlin.String?

        public abstract val currentRed: kotlin.UByte?

        public abstract val currentGreen: kotlin.UByte?

        public abstract val currentBlue: kotlin.UByte?

        public abstract val currentHue: kotlin.Float?

        public abstract val currentSaturation: kotlin.Float?

        public abstract val currentValue: kotlin.Float?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(colorLoopEndTimestampSeconds: kotlin.ULong? = COMPILED_CODE, currentName: kotlin.String? = COMPILED_CODE, currentRed: kotlin.UByte? = COMPILED_CODE, currentGreen: kotlin.UByte? = COMPILED_CODE, currentBlue: kotlin.UByte? = COMPILED_CODE, currentHue: kotlin.Float? = COMPILED_CODE, currentSaturation: kotlin.Float? = COMPILED_CODE, currentValue: kotlin.Float? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedColorControlTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedColorControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedColorControlTrait.Attributes) { /* compiled code */ }

        public open val colorLoopEndTimestampSeconds: kotlin.ULong? /* compiled code */

        public open val currentName: kotlin.String? /* compiled code */

        public open val currentRed: kotlin.UByte? /* compiled code */

        public open val currentGreen: kotlin.UByte? /* compiled code */

        public open val currentBlue: kotlin.UByte? /* compiled code */

        public open val currentHue: kotlin.Float? /* compiled code */

        public open val currentSaturation: kotlin.Float? /* compiled code */

        public open val currentValue: kotlin.Float? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(colorLoopEndTimestampSeconds: kotlin.ULong? = COMPILED_CODE, currentName: kotlin.String? = COMPILED_CODE, currentRed: kotlin.UByte? = COMPILED_CODE, currentGreen: kotlin.UByte? = COMPILED_CODE, currentBlue: kotlin.UByte? = COMPILED_CODE, currentHue: kotlin.Float? = COMPILED_CODE, currentSaturation: kotlin.Float? = COMPILED_CODE, currentValue: kotlin.Float? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedColorControlTrait.AttributesImpl { /* compiled code */ }
    }

    public object MoveToColorNameCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(colorName: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedColorControlTrait.MoveToColorNameCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedColorControlTrait.MoveToColorNameCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedColorControlTrait.MoveToColorNameCommand.Request { /* compiled code */ }
            }

            public final val colorName: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedColorControlTrait.MoveToColorNameCommand.Request.CommandFields> {
                @androidx.annotation.NonNull colorName;

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

    public object MoveToColorRgbCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(red: kotlin.UByte = COMPILED_CODE, green: kotlin.UByte = COMPILED_CODE, blue: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedColorControlTrait.MoveToColorRgbCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedColorControlTrait.MoveToColorRgbCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedColorControlTrait.MoveToColorRgbCommand.Request { /* compiled code */ }
            }

            public final val red: kotlin.UByte /* compiled code */

            public final val green: kotlin.UByte /* compiled code */

            public final val blue: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedColorControlTrait.MoveToColorRgbCommand.Request.CommandFields> {
                @androidx.annotation.NonNull red,

                @androidx.annotation.NonNull green,

                @androidx.annotation.NonNull blue;

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

    public object MoveToColorHsvCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(hue: kotlin.Float = COMPILED_CODE, saturation: kotlin.Float = COMPILED_CODE, value: kotlin.Float = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedColorControlTrait.MoveToColorHsvCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedColorControlTrait.MoveToColorHsvCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedColorControlTrait.MoveToColorHsvCommand.Request { /* compiled code */ }
            }

            public final val hue: kotlin.Float /* compiled code */

            public final val saturation: kotlin.Float /* compiled code */

            public final val value: kotlin.Float /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedColorControlTrait.MoveToColorHsvCommand.Request.CommandFields> {
                @androidx.annotation.NonNull hue,

                @androidx.annotation.NonNull saturation,

                @androidx.annotation.NonNull value;

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


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object DeviceLinksTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DeviceLinksTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DeviceLinksTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DeviceLinksTrait.Attributes { /* compiled code */ }
        }

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.DeviceLinksTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.DeviceLinksTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.DeviceLinksTrait.Attributes) { /* compiled code */ }

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.DeviceLinksTrait.AttributesImpl { /* compiled code */ }
    }

    public object GetDeviceLinksCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Request.CommandFields> {
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

        public final class Response public constructor(deviceLinkManagementAndroid: kotlin.String = COMPILED_CODE, deviceLinkManagementIos: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response { /* compiled code */ }
            }

            public final val deviceLinkManagementAndroid: kotlin.String /* compiled code */

            public final val deviceLinkManagementIos: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DeviceLinksTrait.GetDeviceLinksCommand.Response.CommandFields> {
                @androidx.annotation.NonNull deviceLinkManagementAndroid,

                @androidx.annotation.NonNull deviceLinkManagementIos;

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

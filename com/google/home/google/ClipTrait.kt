// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ClipTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ClipTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ClipTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ClipTrait.Attributes { /* compiled code */ }
        }

        public abstract val canSaveVideoClip: kotlin.Boolean?

        public abstract val canTakeScreenshot: kotlin.Boolean?

        public abstract val supportUserDefinedClipLength: kotlin.Boolean?

        public abstract val maxClipLengthSeconds: kotlin.ULong?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(canSaveVideoClip: kotlin.Boolean? = COMPILED_CODE, canTakeScreenshot: kotlin.Boolean? = COMPILED_CODE, supportUserDefinedClipLength: kotlin.Boolean? = COMPILED_CODE, maxClipLengthSeconds: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ClipTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ClipTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ClipTrait.Attributes) { /* compiled code */ }

        public open val canSaveVideoClip: kotlin.Boolean? /* compiled code */

        public open val canTakeScreenshot: kotlin.Boolean? /* compiled code */

        public open val supportUserDefinedClipLength: kotlin.Boolean? /* compiled code */

        public open val maxClipLengthSeconds: kotlin.ULong? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(canSaveVideoClip: kotlin.Boolean? = COMPILED_CODE, canTakeScreenshot: kotlin.Boolean? = COMPILED_CODE, supportUserDefinedClipLength: kotlin.Boolean? = COMPILED_CODE, maxClipLengthSeconds: kotlin.ULong? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ClipTrait.AttributesImpl { /* compiled code */ }
    }

    public object SaveScreenshotCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ClipTrait.SaveScreenshotCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ClipTrait.SaveScreenshotCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ClipTrait.SaveScreenshotCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ClipTrait.SaveScreenshotCommand.Request.CommandFields> {
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

        public final class Response public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ClipTrait.SaveScreenshotCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ClipTrait.SaveScreenshotCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ClipTrait.SaveScreenshotCommand.Response { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ClipTrait.SaveScreenshotCommand.Response.CommandFields> {
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

    public object SaveVideoClipCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(durationSeconds: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ClipTrait.SaveVideoClipCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ClipTrait.SaveVideoClipCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ClipTrait.SaveVideoClipCommand.Request { /* compiled code */ }
            }

            public final val durationSeconds: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ClipTrait.SaveVideoClipCommand.Request.CommandFields> {
                @androidx.annotation.NonNull durationSeconds;

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

        public final class Response public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ClipTrait.SaveVideoClipCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ClipTrait.SaveVideoClipCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ClipTrait.SaveVideoClipCommand.Response { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ClipTrait.SaveVideoClipCommand.Response.CommandFields> {
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


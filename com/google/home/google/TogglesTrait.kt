// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object TogglesTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final class ToggleSynonyms public constructor(language: kotlin.String = COMPILED_CODE, toggleSynonyms: kotlin.collections.List<kotlin.String> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.TogglesTrait.ToggleSynonyms>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.TogglesTrait.ToggleSynonyms?>.language: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.TogglesTrait.ToggleSynonyms?>.toggleSynonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.TogglesTrait.ToggleSynonyms): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.TogglesTrait.ToggleSynonyms { /* compiled code */ }
        }

        public final val language: kotlin.String /* compiled code */

        public final val toggleSynonyms: kotlin.collections.List<kotlin.String> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.TogglesTrait.ToggleSynonyms.StructFields> {
            @androidx.annotation.NonNull language,

            @androidx.annotation.NonNull toggleSynonyms;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Toggle public constructor(name: kotlin.String = COMPILED_CODE, synonyms: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSynonyms> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.TogglesTrait.Toggle>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.TogglesTrait.Toggle?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.TogglesTrait.Toggle?>.synonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSynonyms>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.TogglesTrait.Toggle): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.TogglesTrait.Toggle { /* compiled code */ }
        }

        public final val name: kotlin.String /* compiled code */

        public final val synonyms: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSynonyms> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.TogglesTrait.Toggle.StructFields> {
            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull synonyms;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ToggleSetting public constructor(toggleName: kotlin.String = COMPILED_CODE, enabled: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.TogglesTrait.ToggleSetting>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.TogglesTrait.ToggleSetting?>.toggleName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.TogglesTrait.ToggleSetting?>.enabled: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.TogglesTrait.ToggleSetting): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.TogglesTrait.ToggleSetting { /* compiled code */ }
        }

        public final val toggleName: kotlin.String /* compiled code */

        public final val enabled: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.TogglesTrait.ToggleSetting.StructFields> {
            @androidx.annotation.NonNull toggleName,

            @androidx.annotation.NonNull enabled;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.TogglesTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.TogglesTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.TogglesTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedToggles: kotlin.collections.List<com.google.home.google.TogglesTrait.Toggle>?

        public abstract val currentToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedToggles: kotlin.collections.List<com.google.home.google.TogglesTrait.Toggle>? = COMPILED_CODE, currentToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.TogglesTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.TogglesTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.TogglesTrait.Attributes) { /* compiled code */ }

        public open val supportedToggles: kotlin.collections.List<com.google.home.google.TogglesTrait.Toggle>? /* compiled code */

        public open val currentToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedToggles: kotlin.collections.List<com.google.home.google.TogglesTrait.Toggle>? = COMPILED_CODE, currentToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.TogglesTrait.AttributesImpl { /* compiled code */ }
    }

    public object ChangeToggleSettingsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.TogglesTrait.ChangeToggleSettingsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.TogglesTrait.ChangeToggleSettingsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.TogglesTrait.ChangeToggleSettingsCommand.Request { /* compiled code */ }
            }

            public final val updatedToggleSettings: kotlin.collections.List<com.google.home.google.TogglesTrait.ToggleSetting> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.TogglesTrait.ChangeToggleSettingsCommand.Request.CommandFields> {
                @androidx.annotation.NonNull updatedToggleSettings;

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


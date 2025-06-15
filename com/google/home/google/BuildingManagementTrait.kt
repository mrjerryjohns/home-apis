// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object BuildingManagementTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final class BuildingNotice public constructor(noticeTitle: kotlin.String = COMPILED_CODE, noticeValue: kotlin.String = COMPILED_CODE, noticeTimeSeconds: kotlin.Long = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.BuildingManagementTrait.BuildingNotice>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.BuildingManagementTrait.BuildingNotice?>.noticeTitle: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.BuildingManagementTrait.BuildingNotice?>.noticeValue: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.BuildingManagementTrait.BuildingNotice?>.noticeTimeSeconds: com.google.home.automation.TypedExpression<kotlin.Long> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.BuildingManagementTrait.BuildingNotice): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.BuildingManagementTrait.BuildingNotice { /* compiled code */ }
        }

        public final val noticeTitle: kotlin.String /* compiled code */

        public final val noticeValue: kotlin.String /* compiled code */

        public final val noticeTimeSeconds: kotlin.Long /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.BuildingManagementTrait.BuildingNotice.StructFields> {
            @androidx.annotation.NonNull noticeTitle,

            @androidx.annotation.NonNull noticeValue,

            @androidx.annotation.NonNull noticeTimeSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ActiveBuildingNotices public constructor(languageCode: kotlin.String = COMPILED_CODE, notices: kotlin.collections.List<com.google.home.google.BuildingManagementTrait.BuildingNotice> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices?>.languageCode: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices?>.notices: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.BuildingManagementTrait.BuildingNotice>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices { /* compiled code */ }
        }

        public final val languageCode: kotlin.String /* compiled code */

        public final val notices: kotlin.collections.List<com.google.home.google.BuildingManagementTrait.BuildingNotice> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices.StructFields> {
            @androidx.annotation.NonNull languageCode,

            @androidx.annotation.NonNull notices;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.BuildingManagementTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.BuildingManagementTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.BuildingManagementTrait.Attributes { /* compiled code */ }
        }

        public abstract val activeBuildingNotices: kotlin.collections.List<com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(activeBuildingNotices: kotlin.collections.List<com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.BuildingManagementTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.BuildingManagementTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.BuildingManagementTrait.Attributes) { /* compiled code */ }

        public open val activeBuildingNotices: kotlin.collections.List<com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(activeBuildingNotices: kotlin.collections.List<com.google.home.google.BuildingManagementTrait.ActiveBuildingNotices>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.BuildingManagementTrait.AttributesImpl { /* compiled code */ }
    }
}


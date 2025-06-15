// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface Descriptor : com.google.home.matter.standard.DescriptorTrait.Attributes, com.google.home.matter.MatterTrait {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.Descriptor> {
        public final val deviceTypeList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>?> /* compiled code */
            public final get

        public final val serverList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>?> /* compiled code */
            public final get

        public final val clientList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>?> /* compiled code */
            public final get

        public final val partsList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UShort>?> /* compiled code */
            public final get

        public final val tagList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.DescriptorTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.deviceTypeList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.DeviceTypeStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.serverList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.clientList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.partsList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UShort>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.tagList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.DescriptorTrait.SemanticTagStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.DescriptorTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.Descriptor?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.Descriptor> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.Descriptor.Attribute): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.Descriptor.Attribute> {
        @androidx.annotation.NonNull deviceTypeList,

        @androidx.annotation.NonNull serverList,

        @androidx.annotation.NonNull clientList,

        @androidx.annotation.NonNull partsList,

        @androidx.annotation.NonNull tagList,

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


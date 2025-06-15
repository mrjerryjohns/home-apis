// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface HepaFilterMonitoring : com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.HepaFilterMonitoring, com.google.home.matter.standard.HepaFilterMonitoringTrait.MutableAttributes>, com.google.home.matter.standard.HepaFilterMonitoringCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.HepaFilterMonitoring> {
        public final val condition: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val degradationDirection: com.google.home.automation.Attribute<com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum?> /* compiled code */
            public final get

        public final val changeIndication: com.google.home.automation.Attribute<com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum?> /* compiled code */
            public final get

        public final val inPlaceIndicator: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val lastChangedTime: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val replacementProductList: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.condition: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.degradationDirection: com.google.home.automation.TypedExpression<com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.changeIndication: com.google.home.automation.TypedExpression<com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.inPlaceIndicator: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.lastChangedTime: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.replacementProductList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoring?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.HepaFilterMonitoring>.setLastChangedTime(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun resetCondition(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.HepaFilterMonitoring> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.HepaFilterMonitoring.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.HepaFilterMonitoring.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoring.Attribute> {
        @androidx.annotation.NonNull condition,

        @androidx.annotation.NonNull degradationDirection,

        @androidx.annotation.NonNull changeIndication,

        @androidx.annotation.NonNull inPlaceIndicator,

        @androidx.annotation.NonNull lastChangedTime,

        @androidx.annotation.NonNull replacementProductList,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoring.Command> {
        @androidx.annotation.NonNull ResetCondition;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


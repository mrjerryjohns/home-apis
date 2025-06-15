// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface Rotation : com.google.home.google.RotationTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.RotationCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.Rotation> {
        public final val rotationDegreesRange: com.google.home.automation.Attribute<com.google.home.google.RotationTrait.RotationDegreesRange?> /* compiled code */
            public final get

        public final val rotationPercent: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val rotationDegrees: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val targetRotationPercent: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.google.RotationTrait.RotationFeature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.rotationDegreesRange: com.google.home.automation.TypedExpression<com.google.home.google.RotationTrait.RotationDegreesRange?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.rotationPercent: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.rotationDegrees: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.targetRotationPercent: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.google.RotationTrait.RotationFeature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Rotation?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun rotateToDegrees(rotationDegrees: kotlin.Float): com.google.home.automation.Command { /* compiled code */ }

        public final fun rotateToPercentage(rotationPercent: kotlin.Float): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.Rotation> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.Rotation.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.Rotation.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Rotation.Attribute> {
        @androidx.annotation.NonNull rotationDegreesRange,

        @androidx.annotation.NonNull rotationPercent,

        @androidx.annotation.NonNull rotationDegrees,

        @androidx.annotation.NonNull targetRotationPercent,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.Rotation.Command> {
        @androidx.annotation.NonNull RotateToDegrees,

        @androidx.annotation.NonNull RotateToPercentage;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


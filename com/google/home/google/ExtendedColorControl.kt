// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedColorControl : com.google.home.google.ExtendedColorControlTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.ExtendedColorControlCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.ExtendedColorControl> {
        public final val colorLoopEndTimestampSeconds: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val currentName: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val currentRed: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val currentGreen: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val currentBlue: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val currentHue: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val currentSaturation: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val currentValue: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.colorLoopEndTimestampSeconds: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentName: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentRed: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentGreen: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentBlue: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentHue: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentSaturation: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.currentValue: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.ExtendedColorControl?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun moveToColorName(colorName: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToColorRgb(red: kotlin.UByte, green: kotlin.UByte, blue: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun moveToColorHsv(hue: kotlin.Float, saturation: kotlin.Float, value: kotlin.Float): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.ExtendedColorControl> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.ExtendedColorControl.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.ExtendedColorControl.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.ExtendedColorControl.Attribute> {
        @androidx.annotation.NonNull colorLoopEndTimestampSeconds,

        @androidx.annotation.NonNull currentName,

        @androidx.annotation.NonNull currentRed,

        @androidx.annotation.NonNull currentGreen,

        @androidx.annotation.NonNull currentBlue,

        @androidx.annotation.NonNull currentHue,

        @androidx.annotation.NonNull currentSaturation,

        @androidx.annotation.NonNull currentValue,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.ExtendedColorControl.Command> {
        @androidx.annotation.NonNull MoveToColorName,

        @androidx.annotation.NonNull MoveToColorRgb,

        @androidx.annotation.NonNull MoveToColorHsv;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

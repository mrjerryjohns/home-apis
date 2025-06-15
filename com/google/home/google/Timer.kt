// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface Timer : com.google.home.google.TimerTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.google.TimerCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.google.Timer> {
        public final val maxTimerLimitSeconds: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val commandOnlyTimer: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val timerPaused: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val timerRemainingSeconds: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.maxTimerLimitSeconds: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.commandOnlyTimer: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.timerPaused: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.timerRemainingSeconds: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.Timer?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun timerStart(timerTimeSeconds: kotlin.Int): com.google.home.automation.Command { /* compiled code */ }

        public final fun timerAdjust(adjustmentTimeSeconds: kotlin.Int): com.google.home.automation.Command { /* compiled code */ }

        public final fun timerPause(): com.google.home.automation.Command { /* compiled code */ }

        public final fun timerResume(): com.google.home.automation.Command { /* compiled code */ }

        public final fun timerCancel(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.google.Timer> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.google.Timer.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.google.Timer.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.Timer.Attribute> {
        @androidx.annotation.NonNull maxTimerLimitSeconds,

        @androidx.annotation.NonNull commandOnlyTimer,

        @androidx.annotation.NonNull timerPaused,

        @androidx.annotation.NonNull timerRemainingSeconds,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.google.Timer.Command> {
        @androidx.annotation.NonNull TimerStart,

        @androidx.annotation.NonNull TimerAdjust,

        @androidx.annotation.NonNull TimerPause,

        @androidx.annotation.NonNull TimerResume,

        @androidx.annotation.NonNull TimerCancel;

        public final val tag: kotlin.UInt /* compiled code */
    }
}


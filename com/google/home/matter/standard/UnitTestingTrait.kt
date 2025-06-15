// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object UnitTestingTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class SimpleEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull ValueA,

        @androidx.annotation.NonNull ValueB,

        @androidx.annotation.NonNull ValueC,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class TestGlobalEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum> {
        @androidx.annotation.NonNull SomeValue,

        @androidx.annotation.NonNull SomeOtherValue,

        @androidx.annotation.NonNull FinalValue,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Bitmap16MaskMap public constructor(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap> {
            private const final val MASK_VAL1_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL3_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL4_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap { /* compiled code */ }
        }

        public final val maskVal1: kotlin.Boolean /* compiled code */

        public final val maskVal2: kotlin.Boolean /* compiled code */

        public final val maskVal3: kotlin.Boolean /* compiled code */

        public final val maskVal4: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Bitmap32MaskMap public constructor(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap> {
            private const final val MASK_VAL1_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL3_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL4_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap { /* compiled code */ }
        }

        public final val maskVal1: kotlin.Boolean /* compiled code */

        public final val maskVal2: kotlin.Boolean /* compiled code */

        public final val maskVal3: kotlin.Boolean /* compiled code */

        public final val maskVal4: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Bitmap64MaskMap public constructor(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap> {
            private const final val MASK_VAL1_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL3_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL4_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap { /* compiled code */ }
        }

        public final val maskVal1: kotlin.Boolean /* compiled code */

        public final val maskVal2: kotlin.Boolean /* compiled code */

        public final val maskVal3: kotlin.Boolean /* compiled code */

        public final val maskVal4: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Bitmap8MaskMap public constructor(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap> {
            private const final val MASK_VAL1_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL2_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL3_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val MASK_VAL4_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap { /* compiled code */ }
        }

        public final val maskVal1: kotlin.Boolean /* compiled code */

        public final val maskVal2: kotlin.Boolean /* compiled code */

        public final val maskVal3: kotlin.Boolean /* compiled code */

        public final val maskVal4: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(maskVal1: kotlin.Boolean = COMPILED_CODE, maskVal2: kotlin.Boolean = COMPILED_CODE, maskVal3: kotlin.Boolean = COMPILED_CODE, maskVal4: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class SimpleBitmap public constructor(valueA: kotlin.Boolean = COMPILED_CODE, valueB: kotlin.Boolean = COMPILED_CODE, valueC: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap> {
            private const final val VALUE_A_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val VALUE_B_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val VALUE_C_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap { /* compiled code */ }
        }

        public final val valueA: kotlin.Boolean /* compiled code */

        public final val valueB: kotlin.Boolean /* compiled code */

        public final val valueC: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(valueA: kotlin.Boolean = COMPILED_CODE, valueB: kotlin.Boolean = COMPILED_CODE, valueC: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class TestGlobalBitmap public constructor(firstBit: kotlin.Boolean = COMPILED_CODE, secondBit: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap> {
            private const final val FIRST_BIT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SECOND_BIT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap { /* compiled code */ }
        }

        public final val firstBit: kotlin.Boolean /* compiled code */

        public final val secondBit: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(firstBit: kotlin.Boolean = COMPILED_CODE, secondBit: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TestEvent {
        public abstract val arg1: kotlin.UByte?

        public abstract val arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?

        public abstract val arg3: kotlin.Boolean?

        public abstract val arg4: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?

        public abstract val arg5: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>?

        public abstract val arg6: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?
    }

    public final class TestEventImpl public constructor(arg1: kotlin.UByte? = COMPILED_CODE, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? = COMPILED_CODE, arg3: kotlin.Boolean? = COMPILED_CODE, arg4: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, arg5: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>? = COMPILED_CODE, arg6: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? = COMPILED_CODE) : com.google.home.matter.standard.UnitTestingTrait.TestEvent {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEvent> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEvent): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEvent { /* compiled code */ }
        }

        public open val arg1: kotlin.UByte? /* compiled code */

        public open val arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

        public open val arg3: kotlin.Boolean? /* compiled code */

        public open val arg4: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        public open val arg5: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>? /* compiled code */

        public open val arg6: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TestFabricScopedEvent {
        public abstract val fabricIndex: kotlin.UByte?
    }

    public final class TestFabricScopedEventImpl public constructor(fabricIndex: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent { /* compiled code */ }
        }

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TestDifferentVendorMeiEvent {
        public abstract val arg1: kotlin.UByte?
    }

    public final class TestDifferentVendorMeiEventImpl public constructor(arg1: kotlin.UByte? = COMPILED_CODE) : com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent { /* compiled code */ }
        }

        public open val arg1: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class SimpleStruct public constructor(a: kotlin.UByte = COMPILED_CODE, b: kotlin.Boolean = COMPILED_CODE, c: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum = COMPILED_CODE, d: kotlin.ByteArray = COMPILED_CODE, e: kotlin.String = COMPILED_CODE, f: com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap = COMPILED_CODE, g: kotlin.Float = COMPILED_CODE, h: kotlin.Double = COMPILED_CODE, i: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.a: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.b: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.c: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.d: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.e: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.f: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.g: com.google.home.automation.TypedExpression<kotlin.Float> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.h: com.google.home.automation.TypedExpression<kotlin.Double> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>.i: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.SimpleStruct { /* compiled code */ }
        }

        public final val a: kotlin.UByte /* compiled code */

        public final val b: kotlin.Boolean /* compiled code */

        public final val c: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum /* compiled code */

        public final val d: kotlin.ByteArray /* compiled code */

        public final val e: kotlin.String /* compiled code */

        public final val f: com.google.home.matter.standard.UnitTestingTrait.SimpleBitmap /* compiled code */

        public final val g: kotlin.Float /* compiled code */

        public final val h: kotlin.Double /* compiled code */

        public final val i: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct.StructFields> {
            @androidx.annotation.NonNull a,

            @androidx.annotation.NonNull b,

            @androidx.annotation.NonNull c,

            @androidx.annotation.NonNull d,

            @androidx.annotation.NonNull e,

            @androidx.annotation.NonNull f,

            @androidx.annotation.NonNull g,

            @androidx.annotation.NonNull h,

            @androidx.annotation.NonNull i;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class TestFabricScoped public constructor(fabricSensitiveInt8u: kotlin.UByte = COMPILED_CODE, optionalFabricSensitiveInt8u: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE, nullableFabricSensitiveInt8u: kotlin.UByte? = COMPILED_CODE, nullableOptionalFabricSensitiveInt8u: com.google.home.matter.serialization.OptionalValue<kotlin.UByte?> = COMPILED_CODE, fabricSensitiveCharString: kotlin.String = COMPILED_CODE, fabricSensitiveStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct = COMPILED_CODE, fabricSensitiveInt8uList: kotlin.collections.List<kotlin.UByte> = COMPILED_CODE, fabricIndex: kotlin.UByte = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.fabricSensitiveInt8u: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.optionalFabricSensitiveInt8u: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UByte>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.nullableFabricSensitiveInt8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.nullableOptionalFabricSensitiveInt8u: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UByte?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.fabricSensitiveCharString: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.fabricSensitiveStruct: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.fabricSensitiveInt8uList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UByte>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped { /* compiled code */ }
        }

        public final val fabricSensitiveInt8u: kotlin.UByte /* compiled code */

        public final val optionalFabricSensitiveInt8u: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

        public final val nullableFabricSensitiveInt8u: kotlin.UByte? /* compiled code */

        public final val nullableOptionalFabricSensitiveInt8u: com.google.home.matter.serialization.OptionalValue<kotlin.UByte?> /* compiled code */

        public final val fabricSensitiveCharString: kotlin.String /* compiled code */

        public final val fabricSensitiveStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct /* compiled code */

        public final val fabricSensitiveInt8uList: kotlin.collections.List<kotlin.UByte> /* compiled code */

        public final val fabricIndex: kotlin.UByte /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped.StructFields> {
            @androidx.annotation.NonNull fabricSensitiveInt8u,

            @androidx.annotation.NonNull optionalFabricSensitiveInt8u,

            @androidx.annotation.NonNull nullableFabricSensitiveInt8u,

            @androidx.annotation.NonNull nullableOptionalFabricSensitiveInt8u,

            @androidx.annotation.NonNull fabricSensitiveCharString,

            @androidx.annotation.NonNull fabricSensitiveStruct,

            @androidx.annotation.NonNull fabricSensitiveInt8uList,

            @androidx.annotation.NonNull fabricIndex;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class NullablesAndOptionalsStruct public constructor(nullableInt: kotlin.UShort? = COMPILED_CODE, optionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, nullableOptionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort?> = COMPILED_CODE, nullableString: kotlin.String? = COMPILED_CODE, optionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, nullableOptionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String?> = COMPILED_CODE, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, optionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> = COMPILED_CODE, nullableOptionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> = COMPILED_CODE, nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? = COMPILED_CODE, optionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>> = COMPILED_CODE, nullableOptionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableInt: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.optionalInt: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableOptionalInt: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.UShort?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.optionalString: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableOptionalString: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.String?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableStruct: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.optionalStruct: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableOptionalStruct: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableList: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.optionalList: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct?>.nullableOptionalList: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct { /* compiled code */ }
        }

        public final val nullableInt: kotlin.UShort? /* compiled code */

        public final val optionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

        public final val nullableOptionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort?> /* compiled code */

        public final val nullableString: kotlin.String? /* compiled code */

        public final val optionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

        public final val nullableOptionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String?> /* compiled code */

        public final val nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        public final val optionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */

        public final val nullableOptionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */

        public final val nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

        public final val optionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>> /* compiled code */

        public final val nullableOptionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct.StructFields> {
            @androidx.annotation.NonNull nullableInt,

            @androidx.annotation.NonNull optionalInt,

            @androidx.annotation.NonNull nullableOptionalInt,

            @androidx.annotation.NonNull nullableString,

            @androidx.annotation.NonNull optionalString,

            @androidx.annotation.NonNull nullableOptionalString,

            @androidx.annotation.NonNull nullableStruct,

            @androidx.annotation.NonNull optionalStruct,

            @androidx.annotation.NonNull nullableOptionalStruct,

            @androidx.annotation.NonNull nullableList,

            @androidx.annotation.NonNull optionalList,

            @androidx.annotation.NonNull nullableOptionalList;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class NestedStruct public constructor(a: kotlin.UByte = COMPILED_CODE, b: kotlin.Boolean = COMPILED_CODE, c: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct = COMPILED_CODE, d: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.NestedStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStruct?>.a: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStruct?>.b: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStruct?>.c: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStruct?>.d: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.NestedStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.NestedStruct { /* compiled code */ }
        }

        public final val a: kotlin.UByte /* compiled code */

        public final val b: kotlin.Boolean /* compiled code */

        public final val c: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct /* compiled code */

        public final val d: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.NestedStruct.StructFields> {
            @androidx.annotation.NonNull a,

            @androidx.annotation.NonNull b,

            @androidx.annotation.NonNull c,

            @androidx.annotation.NonNull d;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class NestedStructList public constructor(a: kotlin.UByte = COMPILED_CODE, b: kotlin.Boolean = COMPILED_CODE, c: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct = COMPILED_CODE, d: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> = COMPILED_CODE, e: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, f: kotlin.collections.List<kotlin.ByteArray> = COMPILED_CODE, g: kotlin.collections.List<kotlin.UByte> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.a: com.google.home.automation.TypedExpression<kotlin.UByte> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.b: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.c: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.d: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.e: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.f: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.NestedStructList?>.g: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UByte>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.NestedStructList): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.NestedStructList { /* compiled code */ }
        }

        public final val a: kotlin.UByte /* compiled code */

        public final val b: kotlin.Boolean /* compiled code */

        public final val c: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct /* compiled code */

        public final val d: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */

        public final val e: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public final val f: kotlin.collections.List<kotlin.ByteArray> /* compiled code */

        public final val g: kotlin.collections.List<kotlin.UByte> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.NestedStructList.StructFields> {
            @androidx.annotation.NonNull a,

            @androidx.annotation.NonNull b,

            @androidx.annotation.NonNull c,

            @androidx.annotation.NonNull d,

            @androidx.annotation.NonNull e,

            @androidx.annotation.NonNull f,

            @androidx.annotation.NonNull g;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class DoubleNestedStructList public constructor(a: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.DoubleNestedStructList>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.DoubleNestedStructList?>.a: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.DoubleNestedStructList): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.DoubleNestedStructList { /* compiled code */ }
        }

        public final val a: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.DoubleNestedStructList.StructFields> {
            @androidx.annotation.NonNull a;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class TestListStructOctet public constructor(member1: kotlin.ULong = COMPILED_CODE, member2: kotlin.ByteArray = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet?>.member1: com.google.home.automation.TypedExpression<kotlin.ULong> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet?>.member2: com.google.home.automation.TypedExpression<kotlin.ByteArray> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet { /* compiled code */ }
        }

        public final val member1: kotlin.ULong /* compiled code */

        public final val member2: kotlin.ByteArray /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet.StructFields> {
            @androidx.annotation.NonNull member1,

            @androidx.annotation.NonNull member2;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class TestGlobalStruct public constructor(name: kotlin.String = COMPILED_CODE, myBitmap: com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap? = COMPILED_CODE, myEnum: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?>.name: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?>.myBitmap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?>.myEnum: com.google.home.automation.TypedExpression<com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct { /* compiled code */ }
        }

        public final val name: kotlin.String /* compiled code */

        public final val myBitmap: com.google.home.matter.standard.UnitTestingTrait.TestGlobalBitmap? /* compiled code */

        public final val myEnum: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct.StructFields> {
            @androidx.annotation.NonNull Name,

            @androidx.annotation.NonNull myBitmap,

            @androidx.annotation.NonNull myEnum;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.Attributes { /* compiled code */ }
        }

        public abstract val boolean: kotlin.Boolean?

        public abstract val bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?

        public abstract val bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?

        public abstract val bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?

        public abstract val bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?

        public abstract val int8u: kotlin.UByte?

        public abstract val int16u: kotlin.UShort?

        public abstract val int24u: kotlin.UInt?

        public abstract val int32u: kotlin.UInt?

        public abstract val int40u: kotlin.ULong?

        public abstract val int48u: kotlin.ULong?

        public abstract val int56u: kotlin.ULong?

        public abstract val int64u: kotlin.ULong?

        public abstract val int8s: kotlin.Byte?

        public abstract val int16s: kotlin.Short?

        public abstract val int24s: kotlin.Int?

        public abstract val int32s: kotlin.Int?

        public abstract val int40s: kotlin.Long?

        public abstract val int48s: kotlin.Long?

        public abstract val int56s: kotlin.Long?

        public abstract val int64s: kotlin.Long?

        public abstract val enum8: kotlin.UByte?

        public abstract val enum16: kotlin.UShort?

        public abstract val floatSingle: kotlin.Float?

        public abstract val floatDouble: kotlin.Double?

        public abstract val octetString: kotlin.ByteArray?

        public abstract val listInt8u: kotlin.collections.List<kotlin.UByte>?

        public abstract val listOctetString: kotlin.collections.List<kotlin.ByteArray>?

        public abstract val listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>?

        public abstract val longOctetString: kotlin.ByteArray?

        public abstract val charString: kotlin.String?

        public abstract val longCharString: kotlin.String?

        public abstract val epochUs: kotlin.ULong?

        public abstract val epochS: kotlin.UInt?

        public abstract val vendorId: kotlin.UShort?

        public abstract val listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>?

        public abstract val enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?

        public abstract val structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?

        public abstract val rangeRestrictedInt8u: kotlin.UByte?

        public abstract val rangeRestrictedInt8s: kotlin.Byte?

        public abstract val rangeRestrictedInt16u: kotlin.UShort?

        public abstract val rangeRestrictedInt16s: kotlin.Short?

        public abstract val listLongOctetString: kotlin.collections.List<kotlin.ByteArray>?

        public abstract val listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>?

        public abstract val timedWriteBoolean: kotlin.Boolean?

        public abstract val generalErrorBoolean: kotlin.Boolean?

        public abstract val clusterErrorBoolean: kotlin.Boolean?

        public abstract val globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?

        public abstract val globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?

        public abstract val unsupported: kotlin.Boolean?

        public abstract val readFailureCode: kotlin.UByte?

        public abstract val failureInt32U: kotlin.UInt?

        public abstract val nullableBoolean: kotlin.Boolean?

        public abstract val nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?

        public abstract val nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?

        public abstract val nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?

        public abstract val nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?

        public abstract val nullableInt8u: kotlin.UByte?

        public abstract val nullableInt16u: kotlin.UShort?

        public abstract val nullableInt24u: kotlin.UInt?

        public abstract val nullableInt32u: kotlin.UInt?

        public abstract val nullableInt40u: kotlin.ULong?

        public abstract val nullableInt48u: kotlin.ULong?

        public abstract val nullableInt56u: kotlin.ULong?

        public abstract val nullableInt64u: kotlin.ULong?

        public abstract val nullableInt8s: kotlin.Byte?

        public abstract val nullableInt16s: kotlin.Short?

        public abstract val nullableInt24s: kotlin.Int?

        public abstract val nullableInt32s: kotlin.Int?

        public abstract val nullableInt40s: kotlin.Long?

        public abstract val nullableInt48s: kotlin.Long?

        public abstract val nullableInt56s: kotlin.Long?

        public abstract val nullableInt64s: kotlin.Long?

        public abstract val nullableEnum8: kotlin.UByte?

        public abstract val nullableEnum16: kotlin.UShort?

        public abstract val nullableFloatSingle: kotlin.Float?

        public abstract val nullableFloatDouble: kotlin.Double?

        public abstract val nullableOctetString: kotlin.ByteArray?

        public abstract val nullableCharString: kotlin.String?

        public abstract val nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?

        public abstract val nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?

        public abstract val nullableRangeRestrictedInt8u: kotlin.UByte?

        public abstract val nullableRangeRestrictedInt8s: kotlin.Byte?

        public abstract val nullableRangeRestrictedInt16u: kotlin.UShort?

        public abstract val nullableRangeRestrictedInt16s: kotlin.Short?

        public abstract val writeOnlyInt8u: kotlin.UByte?

        public abstract val nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?

        public abstract val nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?

        public abstract val meiInt8u: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(boolean: kotlin.Boolean? = COMPILED_CODE, bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? = COMPILED_CODE, bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? = COMPILED_CODE, bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? = COMPILED_CODE, bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? = COMPILED_CODE, int8u: kotlin.UByte? = COMPILED_CODE, int16u: kotlin.UShort? = COMPILED_CODE, int24u: kotlin.UInt? = COMPILED_CODE, int32u: kotlin.UInt? = COMPILED_CODE, int40u: kotlin.ULong? = COMPILED_CODE, int48u: kotlin.ULong? = COMPILED_CODE, int56u: kotlin.ULong? = COMPILED_CODE, int64u: kotlin.ULong? = COMPILED_CODE, int8s: kotlin.Byte? = COMPILED_CODE, int16s: kotlin.Short? = COMPILED_CODE, int24s: kotlin.Int? = COMPILED_CODE, int32s: kotlin.Int? = COMPILED_CODE, int40s: kotlin.Long? = COMPILED_CODE, int48s: kotlin.Long? = COMPILED_CODE, int56s: kotlin.Long? = COMPILED_CODE, int64s: kotlin.Long? = COMPILED_CODE, enum8: kotlin.UByte? = COMPILED_CODE, enum16: kotlin.UShort? = COMPILED_CODE, floatSingle: kotlin.Float? = COMPILED_CODE, floatDouble: kotlin.Double? = COMPILED_CODE, octetString: kotlin.ByteArray? = COMPILED_CODE, listInt8u: kotlin.collections.List<kotlin.UByte>? = COMPILED_CODE, listOctetString: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>? = COMPILED_CODE, longOctetString: kotlin.ByteArray? = COMPILED_CODE, charString: kotlin.String? = COMPILED_CODE, longCharString: kotlin.String? = COMPILED_CODE, epochUs: kotlin.ULong? = COMPILED_CODE, epochS: kotlin.UInt? = COMPILED_CODE, vendorId: kotlin.UShort? = COMPILED_CODE, listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>? = COMPILED_CODE, enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? = COMPILED_CODE, structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, rangeRestrictedInt8u: kotlin.UByte? = COMPILED_CODE, rangeRestrictedInt8s: kotlin.Byte? = COMPILED_CODE, rangeRestrictedInt16u: kotlin.UShort? = COMPILED_CODE, rangeRestrictedInt16s: kotlin.Short? = COMPILED_CODE, listLongOctetString: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>? = COMPILED_CODE, timedWriteBoolean: kotlin.Boolean? = COMPILED_CODE, generalErrorBoolean: kotlin.Boolean? = COMPILED_CODE, clusterErrorBoolean: kotlin.Boolean? = COMPILED_CODE, globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? = COMPILED_CODE, globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? = COMPILED_CODE, unsupported: kotlin.Boolean? = COMPILED_CODE, readFailureCode: kotlin.UByte? = COMPILED_CODE, failureInt32U: kotlin.UInt? = COMPILED_CODE, nullableBoolean: kotlin.Boolean? = COMPILED_CODE, nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? = COMPILED_CODE, nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? = COMPILED_CODE, nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? = COMPILED_CODE, nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? = COMPILED_CODE, nullableInt8u: kotlin.UByte? = COMPILED_CODE, nullableInt16u: kotlin.UShort? = COMPILED_CODE, nullableInt24u: kotlin.UInt? = COMPILED_CODE, nullableInt32u: kotlin.UInt? = COMPILED_CODE, nullableInt40u: kotlin.ULong? = COMPILED_CODE, nullableInt48u: kotlin.ULong? = COMPILED_CODE, nullableInt56u: kotlin.ULong? = COMPILED_CODE, nullableInt64u: kotlin.ULong? = COMPILED_CODE, nullableInt8s: kotlin.Byte? = COMPILED_CODE, nullableInt16s: kotlin.Short? = COMPILED_CODE, nullableInt24s: kotlin.Int? = COMPILED_CODE, nullableInt32s: kotlin.Int? = COMPILED_CODE, nullableInt40s: kotlin.Long? = COMPILED_CODE, nullableInt48s: kotlin.Long? = COMPILED_CODE, nullableInt56s: kotlin.Long? = COMPILED_CODE, nullableInt64s: kotlin.Long? = COMPILED_CODE, nullableEnum8: kotlin.UByte? = COMPILED_CODE, nullableEnum16: kotlin.UShort? = COMPILED_CODE, nullableFloatSingle: kotlin.Float? = COMPILED_CODE, nullableFloatDouble: kotlin.Double? = COMPILED_CODE, nullableOctetString: kotlin.ByteArray? = COMPILED_CODE, nullableCharString: kotlin.String? = COMPILED_CODE, nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? = COMPILED_CODE, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, nullableRangeRestrictedInt8u: kotlin.UByte? = COMPILED_CODE, nullableRangeRestrictedInt8s: kotlin.Byte? = COMPILED_CODE, nullableRangeRestrictedInt16u: kotlin.UShort? = COMPILED_CODE, nullableRangeRestrictedInt16s: kotlin.Short? = COMPILED_CODE, writeOnlyInt8u: kotlin.UByte? = COMPILED_CODE, nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? = COMPILED_CODE, nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? = COMPILED_CODE, meiInt8u: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.UnitTestingTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.UnitTestingTrait.Attributes, com.google.home.matter.standard.UnitTestingTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.UnitTestingTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.UnitTestingTrait.Attributes) { /* compiled code */ }

        public open val boolean: kotlin.Boolean? /* compiled code */

        public open val bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */

        public open val bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */

        public open val bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */

        public open val bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */

        public open val int8u: kotlin.UByte? /* compiled code */

        public open val int16u: kotlin.UShort? /* compiled code */

        public open val int24u: kotlin.UInt? /* compiled code */

        public open val int32u: kotlin.UInt? /* compiled code */

        public open val int40u: kotlin.ULong? /* compiled code */

        public open val int48u: kotlin.ULong? /* compiled code */

        public open val int56u: kotlin.ULong? /* compiled code */

        public open val int64u: kotlin.ULong? /* compiled code */

        public open val int8s: kotlin.Byte? /* compiled code */

        public open val int16s: kotlin.Short? /* compiled code */

        public open val int24s: kotlin.Int? /* compiled code */

        public open val int32s: kotlin.Int? /* compiled code */

        public open val int40s: kotlin.Long? /* compiled code */

        public open val int48s: kotlin.Long? /* compiled code */

        public open val int56s: kotlin.Long? /* compiled code */

        public open val int64s: kotlin.Long? /* compiled code */

        public open val enum8: kotlin.UByte? /* compiled code */

        public open val enum16: kotlin.UShort? /* compiled code */

        public open val floatSingle: kotlin.Float? /* compiled code */

        public open val floatDouble: kotlin.Double? /* compiled code */

        public open val octetString: kotlin.ByteArray? /* compiled code */

        public open val listInt8u: kotlin.collections.List<kotlin.UByte>? /* compiled code */

        public open val listOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>? /* compiled code */

        public open val longOctetString: kotlin.ByteArray? /* compiled code */

        public open val charString: kotlin.String? /* compiled code */

        public open val longCharString: kotlin.String? /* compiled code */

        public open val epochUs: kotlin.ULong? /* compiled code */

        public open val epochS: kotlin.UInt? /* compiled code */

        public open val vendorId: kotlin.UShort? /* compiled code */

        public open val listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>? /* compiled code */

        public open val enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

        public open val structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        public open val rangeRestrictedInt8u: kotlin.UByte? /* compiled code */

        public open val rangeRestrictedInt8s: kotlin.Byte? /* compiled code */

        public open val rangeRestrictedInt16u: kotlin.UShort? /* compiled code */

        public open val rangeRestrictedInt16s: kotlin.Short? /* compiled code */

        public open val listLongOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>? /* compiled code */

        public open val timedWriteBoolean: kotlin.Boolean? /* compiled code */

        public open val generalErrorBoolean: kotlin.Boolean? /* compiled code */

        public open val clusterErrorBoolean: kotlin.Boolean? /* compiled code */

        public open val globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */

        public open val globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */

        public open val unsupported: kotlin.Boolean? /* compiled code */

        public open val readFailureCode: kotlin.UByte? /* compiled code */

        public open val failureInt32U: kotlin.UInt? /* compiled code */

        public open val nullableBoolean: kotlin.Boolean? /* compiled code */

        public open val nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */

        public open val nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */

        public open val nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */

        public open val nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */

        public open val nullableInt8u: kotlin.UByte? /* compiled code */

        public open val nullableInt16u: kotlin.UShort? /* compiled code */

        public open val nullableInt24u: kotlin.UInt? /* compiled code */

        public open val nullableInt32u: kotlin.UInt? /* compiled code */

        public open val nullableInt40u: kotlin.ULong? /* compiled code */

        public open val nullableInt48u: kotlin.ULong? /* compiled code */

        public open val nullableInt56u: kotlin.ULong? /* compiled code */

        public open val nullableInt64u: kotlin.ULong? /* compiled code */

        public open val nullableInt8s: kotlin.Byte? /* compiled code */

        public open val nullableInt16s: kotlin.Short? /* compiled code */

        public open val nullableInt24s: kotlin.Int? /* compiled code */

        public open val nullableInt32s: kotlin.Int? /* compiled code */

        public open val nullableInt40s: kotlin.Long? /* compiled code */

        public open val nullableInt48s: kotlin.Long? /* compiled code */

        public open val nullableInt56s: kotlin.Long? /* compiled code */

        public open val nullableInt64s: kotlin.Long? /* compiled code */

        public open val nullableEnum8: kotlin.UByte? /* compiled code */

        public open val nullableEnum16: kotlin.UShort? /* compiled code */

        public open val nullableFloatSingle: kotlin.Float? /* compiled code */

        public open val nullableFloatDouble: kotlin.Double? /* compiled code */

        public open val nullableOctetString: kotlin.ByteArray? /* compiled code */

        public open val nullableCharString: kotlin.String? /* compiled code */

        public open val nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

        public open val nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        public open val nullableRangeRestrictedInt8u: kotlin.UByte? /* compiled code */

        public open val nullableRangeRestrictedInt8s: kotlin.Byte? /* compiled code */

        public open val nullableRangeRestrictedInt16u: kotlin.UShort? /* compiled code */

        public open val nullableRangeRestrictedInt16s: kotlin.Short? /* compiled code */

        public open val writeOnlyInt8u: kotlin.UByte? /* compiled code */

        public open val nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */

        public open val nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */

        public open val meiInt8u: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.UnitTestingTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.UnitTestingTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(boolean: kotlin.Boolean? = COMPILED_CODE, bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? = COMPILED_CODE, bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? = COMPILED_CODE, bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? = COMPILED_CODE, bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? = COMPILED_CODE, int8u: kotlin.UByte? = COMPILED_CODE, int16u: kotlin.UShort? = COMPILED_CODE, int24u: kotlin.UInt? = COMPILED_CODE, int32u: kotlin.UInt? = COMPILED_CODE, int40u: kotlin.ULong? = COMPILED_CODE, int48u: kotlin.ULong? = COMPILED_CODE, int56u: kotlin.ULong? = COMPILED_CODE, int64u: kotlin.ULong? = COMPILED_CODE, int8s: kotlin.Byte? = COMPILED_CODE, int16s: kotlin.Short? = COMPILED_CODE, int24s: kotlin.Int? = COMPILED_CODE, int32s: kotlin.Int? = COMPILED_CODE, int40s: kotlin.Long? = COMPILED_CODE, int48s: kotlin.Long? = COMPILED_CODE, int56s: kotlin.Long? = COMPILED_CODE, int64s: kotlin.Long? = COMPILED_CODE, enum8: kotlin.UByte? = COMPILED_CODE, enum16: kotlin.UShort? = COMPILED_CODE, floatSingle: kotlin.Float? = COMPILED_CODE, floatDouble: kotlin.Double? = COMPILED_CODE, octetString: kotlin.ByteArray? = COMPILED_CODE, listInt8u: kotlin.collections.List<kotlin.UByte>? = COMPILED_CODE, listOctetString: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>? = COMPILED_CODE, longOctetString: kotlin.ByteArray? = COMPILED_CODE, charString: kotlin.String? = COMPILED_CODE, longCharString: kotlin.String? = COMPILED_CODE, epochUs: kotlin.ULong? = COMPILED_CODE, epochS: kotlin.UInt? = COMPILED_CODE, vendorId: kotlin.UShort? = COMPILED_CODE, listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>? = COMPILED_CODE, enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? = COMPILED_CODE, structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, rangeRestrictedInt8u: kotlin.UByte? = COMPILED_CODE, rangeRestrictedInt8s: kotlin.Byte? = COMPILED_CODE, rangeRestrictedInt16u: kotlin.UShort? = COMPILED_CODE, rangeRestrictedInt16s: kotlin.Short? = COMPILED_CODE, listLongOctetString: kotlin.collections.List<kotlin.ByteArray>? = COMPILED_CODE, listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>? = COMPILED_CODE, timedWriteBoolean: kotlin.Boolean? = COMPILED_CODE, generalErrorBoolean: kotlin.Boolean? = COMPILED_CODE, clusterErrorBoolean: kotlin.Boolean? = COMPILED_CODE, globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? = COMPILED_CODE, globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? = COMPILED_CODE, unsupported: kotlin.Boolean? = COMPILED_CODE, readFailureCode: kotlin.UByte? = COMPILED_CODE, failureInt32U: kotlin.UInt? = COMPILED_CODE, nullableBoolean: kotlin.Boolean? = COMPILED_CODE, nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? = COMPILED_CODE, nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? = COMPILED_CODE, nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? = COMPILED_CODE, nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? = COMPILED_CODE, nullableInt8u: kotlin.UByte? = COMPILED_CODE, nullableInt16u: kotlin.UShort? = COMPILED_CODE, nullableInt24u: kotlin.UInt? = COMPILED_CODE, nullableInt32u: kotlin.UInt? = COMPILED_CODE, nullableInt40u: kotlin.ULong? = COMPILED_CODE, nullableInt48u: kotlin.ULong? = COMPILED_CODE, nullableInt56u: kotlin.ULong? = COMPILED_CODE, nullableInt64u: kotlin.ULong? = COMPILED_CODE, nullableInt8s: kotlin.Byte? = COMPILED_CODE, nullableInt16s: kotlin.Short? = COMPILED_CODE, nullableInt24s: kotlin.Int? = COMPILED_CODE, nullableInt32s: kotlin.Int? = COMPILED_CODE, nullableInt40s: kotlin.Long? = COMPILED_CODE, nullableInt48s: kotlin.Long? = COMPILED_CODE, nullableInt56s: kotlin.Long? = COMPILED_CODE, nullableInt64s: kotlin.Long? = COMPILED_CODE, nullableEnum8: kotlin.UByte? = COMPILED_CODE, nullableEnum16: kotlin.UShort? = COMPILED_CODE, nullableFloatSingle: kotlin.Float? = COMPILED_CODE, nullableFloatDouble: kotlin.Double? = COMPILED_CODE, nullableOctetString: kotlin.ByteArray? = COMPILED_CODE, nullableCharString: kotlin.String? = COMPILED_CODE, nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? = COMPILED_CODE, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, nullableRangeRestrictedInt8u: kotlin.UByte? = COMPILED_CODE, nullableRangeRestrictedInt8s: kotlin.Byte? = COMPILED_CODE, nullableRangeRestrictedInt16u: kotlin.UShort? = COMPILED_CODE, nullableRangeRestrictedInt16s: kotlin.Short? = COMPILED_CODE, writeOnlyInt8u: kotlin.UByte? = COMPILED_CODE, nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? = COMPILED_CODE, nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? = COMPILED_CODE, meiInt8u: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.UnitTestingTrait.Attributes) : com.google.home.matter.standard.UnitTestingTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _boolean: kotlin.Boolean? /* compiled code */

        public open val boolean: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */

        public open val bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */
            public open get

        internal final var _bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */

        public open val bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */
            public open get

        internal final var _bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */

        public open val bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */
            public open get

        internal final var _bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */

        public open val bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */
            public open get

        internal final var _int8u: kotlin.UByte? /* compiled code */

        public open val int8u: kotlin.UByte? /* compiled code */
            public open get

        internal final var _int16u: kotlin.UShort? /* compiled code */

        public open val int16u: kotlin.UShort? /* compiled code */
            public open get

        internal final var _int24u: kotlin.UInt? /* compiled code */

        public open val int24u: kotlin.UInt? /* compiled code */
            public open get

        internal final var _int32u: kotlin.UInt? /* compiled code */

        public open val int32u: kotlin.UInt? /* compiled code */
            public open get

        internal final var _int40u: kotlin.ULong? /* compiled code */

        public open val int40u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _int48u: kotlin.ULong? /* compiled code */

        public open val int48u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _int56u: kotlin.ULong? /* compiled code */

        public open val int56u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _int64u: kotlin.ULong? /* compiled code */

        public open val int64u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _int8s: kotlin.Byte? /* compiled code */

        public open val int8s: kotlin.Byte? /* compiled code */
            public open get

        internal final var _int16s: kotlin.Short? /* compiled code */

        public open val int16s: kotlin.Short? /* compiled code */
            public open get

        internal final var _int24s: kotlin.Int? /* compiled code */

        public open val int24s: kotlin.Int? /* compiled code */
            public open get

        internal final var _int32s: kotlin.Int? /* compiled code */

        public open val int32s: kotlin.Int? /* compiled code */
            public open get

        internal final var _int40s: kotlin.Long? /* compiled code */

        public open val int40s: kotlin.Long? /* compiled code */
            public open get

        internal final var _int48s: kotlin.Long? /* compiled code */

        public open val int48s: kotlin.Long? /* compiled code */
            public open get

        internal final var _int56s: kotlin.Long? /* compiled code */

        public open val int56s: kotlin.Long? /* compiled code */
            public open get

        internal final var _int64s: kotlin.Long? /* compiled code */

        public open val int64s: kotlin.Long? /* compiled code */
            public open get

        internal final var _enum8: kotlin.UByte? /* compiled code */

        public open val enum8: kotlin.UByte? /* compiled code */
            public open get

        internal final var _enum16: kotlin.UShort? /* compiled code */

        public open val enum16: kotlin.UShort? /* compiled code */
            public open get

        internal final var _floatSingle: kotlin.Float? /* compiled code */

        public open val floatSingle: kotlin.Float? /* compiled code */
            public open get

        internal final var _floatDouble: kotlin.Double? /* compiled code */

        public open val floatDouble: kotlin.Double? /* compiled code */
            public open get

        internal final var _octetString: kotlin.ByteArray? /* compiled code */

        public open val octetString: kotlin.ByteArray? /* compiled code */
            public open get

        internal final var _listInt8u: kotlin.collections.List<kotlin.UByte>? /* compiled code */

        public open val listInt8u: kotlin.collections.List<kotlin.UByte>? /* compiled code */
            public open get

        internal final var _listOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val listOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */
            public open get

        internal final var _listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>? /* compiled code */

        public open val listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>? /* compiled code */
            public open get

        internal final var _longOctetString: kotlin.ByteArray? /* compiled code */

        public open val longOctetString: kotlin.ByteArray? /* compiled code */
            public open get

        internal final var _charString: kotlin.String? /* compiled code */

        public open val charString: kotlin.String? /* compiled code */
            public open get

        internal final var _longCharString: kotlin.String? /* compiled code */

        public open val longCharString: kotlin.String? /* compiled code */
            public open get

        internal final var _epochUs: kotlin.ULong? /* compiled code */

        public open val epochUs: kotlin.ULong? /* compiled code */
            public open get

        internal final var _epochS: kotlin.UInt? /* compiled code */

        public open val epochS: kotlin.UInt? /* compiled code */
            public open get

        internal final var _vendorId: kotlin.UShort? /* compiled code */

        public open val vendorId: kotlin.UShort? /* compiled code */
            public open get

        internal final var _listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>? /* compiled code */

        public open val listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>? /* compiled code */
            public open get

        internal final var _enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

        public open val enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */
            public open get

        internal final var _structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        public open val structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */
            public open get

        internal final var _rangeRestrictedInt8u: kotlin.UByte? /* compiled code */

        public open val rangeRestrictedInt8u: kotlin.UByte? /* compiled code */
            public open get

        internal final var _rangeRestrictedInt8s: kotlin.Byte? /* compiled code */

        public open val rangeRestrictedInt8s: kotlin.Byte? /* compiled code */
            public open get

        internal final var _rangeRestrictedInt16u: kotlin.UShort? /* compiled code */

        public open val rangeRestrictedInt16u: kotlin.UShort? /* compiled code */
            public open get

        internal final var _rangeRestrictedInt16s: kotlin.Short? /* compiled code */

        public open val rangeRestrictedInt16s: kotlin.Short? /* compiled code */
            public open get

        internal final var _listLongOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

        public open val listLongOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */
            public open get

        internal final var _listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>? /* compiled code */

        public open val listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>? /* compiled code */
            public open get

        internal final var _timedWriteBoolean: kotlin.Boolean? /* compiled code */

        public open val timedWriteBoolean: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _generalErrorBoolean: kotlin.Boolean? /* compiled code */

        public open val generalErrorBoolean: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _clusterErrorBoolean: kotlin.Boolean? /* compiled code */

        public open val clusterErrorBoolean: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */

        public open val globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */
            public open get

        internal final var _globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */

        public open val globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */
            public open get

        internal final var _unsupported: kotlin.Boolean? /* compiled code */

        public open val unsupported: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _readFailureCode: kotlin.UByte? /* compiled code */

        public open val readFailureCode: kotlin.UByte? /* compiled code */
            public open get

        internal final var _failureInt32U: kotlin.UInt? /* compiled code */

        public open val failureInt32U: kotlin.UInt? /* compiled code */
            public open get

        internal final var _nullableBoolean: kotlin.Boolean? /* compiled code */

        internal final var _isNullableBooleanSet: kotlin.Boolean /* compiled code */

        public open val nullableBoolean: kotlin.Boolean? /* compiled code */
            public open get

        internal final var _nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */

        internal final var _isNullableBitmap8Set: kotlin.Boolean /* compiled code */

        public open val nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */
            public open get

        internal final var _nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */

        internal final var _isNullableBitmap16Set: kotlin.Boolean /* compiled code */

        public open val nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */
            public open get

        internal final var _nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */

        internal final var _isNullableBitmap32Set: kotlin.Boolean /* compiled code */

        public open val nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */
            public open get

        internal final var _nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */

        internal final var _isNullableBitmap64Set: kotlin.Boolean /* compiled code */

        public open val nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */
            public open get

        internal final var _nullableInt8u: kotlin.UByte? /* compiled code */

        internal final var _isNullableInt8uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt8u: kotlin.UByte? /* compiled code */
            public open get

        internal final var _nullableInt16u: kotlin.UShort? /* compiled code */

        internal final var _isNullableInt16uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt16u: kotlin.UShort? /* compiled code */
            public open get

        internal final var _nullableInt24u: kotlin.UInt? /* compiled code */

        internal final var _isNullableInt24uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt24u: kotlin.UInt? /* compiled code */
            public open get

        internal final var _nullableInt32u: kotlin.UInt? /* compiled code */

        internal final var _isNullableInt32uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt32u: kotlin.UInt? /* compiled code */
            public open get

        internal final var _nullableInt40u: kotlin.ULong? /* compiled code */

        internal final var _isNullableInt40uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt40u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _nullableInt48u: kotlin.ULong? /* compiled code */

        internal final var _isNullableInt48uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt48u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _nullableInt56u: kotlin.ULong? /* compiled code */

        internal final var _isNullableInt56uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt56u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _nullableInt64u: kotlin.ULong? /* compiled code */

        internal final var _isNullableInt64uSet: kotlin.Boolean /* compiled code */

        public open val nullableInt64u: kotlin.ULong? /* compiled code */
            public open get

        internal final var _nullableInt8s: kotlin.Byte? /* compiled code */

        internal final var _isNullableInt8sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt8s: kotlin.Byte? /* compiled code */
            public open get

        internal final var _nullableInt16s: kotlin.Short? /* compiled code */

        internal final var _isNullableInt16sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt16s: kotlin.Short? /* compiled code */
            public open get

        internal final var _nullableInt24s: kotlin.Int? /* compiled code */

        internal final var _isNullableInt24sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt24s: kotlin.Int? /* compiled code */
            public open get

        internal final var _nullableInt32s: kotlin.Int? /* compiled code */

        internal final var _isNullableInt32sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt32s: kotlin.Int? /* compiled code */
            public open get

        internal final var _nullableInt40s: kotlin.Long? /* compiled code */

        internal final var _isNullableInt40sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt40s: kotlin.Long? /* compiled code */
            public open get

        internal final var _nullableInt48s: kotlin.Long? /* compiled code */

        internal final var _isNullableInt48sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt48s: kotlin.Long? /* compiled code */
            public open get

        internal final var _nullableInt56s: kotlin.Long? /* compiled code */

        internal final var _isNullableInt56sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt56s: kotlin.Long? /* compiled code */
            public open get

        internal final var _nullableInt64s: kotlin.Long? /* compiled code */

        internal final var _isNullableInt64sSet: kotlin.Boolean /* compiled code */

        public open val nullableInt64s: kotlin.Long? /* compiled code */
            public open get

        internal final var _nullableEnum8: kotlin.UByte? /* compiled code */

        internal final var _isNullableEnum8Set: kotlin.Boolean /* compiled code */

        public open val nullableEnum8: kotlin.UByte? /* compiled code */
            public open get

        internal final var _nullableEnum16: kotlin.UShort? /* compiled code */

        internal final var _isNullableEnum16Set: kotlin.Boolean /* compiled code */

        public open val nullableEnum16: kotlin.UShort? /* compiled code */
            public open get

        internal final var _nullableFloatSingle: kotlin.Float? /* compiled code */

        internal final var _isNullableFloatSingleSet: kotlin.Boolean /* compiled code */

        public open val nullableFloatSingle: kotlin.Float? /* compiled code */
            public open get

        internal final var _nullableFloatDouble: kotlin.Double? /* compiled code */

        internal final var _isNullableFloatDoubleSet: kotlin.Boolean /* compiled code */

        public open val nullableFloatDouble: kotlin.Double? /* compiled code */
            public open get

        internal final var _nullableOctetString: kotlin.ByteArray? /* compiled code */

        internal final var _isNullableOctetStringSet: kotlin.Boolean /* compiled code */

        public open val nullableOctetString: kotlin.ByteArray? /* compiled code */
            public open get

        internal final var _nullableCharString: kotlin.String? /* compiled code */

        internal final var _isNullableCharStringSet: kotlin.Boolean /* compiled code */

        public open val nullableCharString: kotlin.String? /* compiled code */
            public open get

        internal final var _nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

        internal final var _isNullableEnumAttrSet: kotlin.Boolean /* compiled code */

        public open val nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */
            public open get

        internal final var _nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        internal final var _isNullableStructSet: kotlin.Boolean /* compiled code */

        public open val nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */
            public open get

        internal final var _nullableRangeRestrictedInt8u: kotlin.UByte? /* compiled code */

        internal final var _isNullableRangeRestrictedInt8uSet: kotlin.Boolean /* compiled code */

        public open val nullableRangeRestrictedInt8u: kotlin.UByte? /* compiled code */
            public open get

        internal final var _nullableRangeRestrictedInt8s: kotlin.Byte? /* compiled code */

        internal final var _isNullableRangeRestrictedInt8sSet: kotlin.Boolean /* compiled code */

        public open val nullableRangeRestrictedInt8s: kotlin.Byte? /* compiled code */
            public open get

        internal final var _nullableRangeRestrictedInt16u: kotlin.UShort? /* compiled code */

        internal final var _isNullableRangeRestrictedInt16uSet: kotlin.Boolean /* compiled code */

        public open val nullableRangeRestrictedInt16u: kotlin.UShort? /* compiled code */
            public open get

        internal final var _nullableRangeRestrictedInt16s: kotlin.Short? /* compiled code */

        internal final var _isNullableRangeRestrictedInt16sSet: kotlin.Boolean /* compiled code */

        public open val nullableRangeRestrictedInt16s: kotlin.Short? /* compiled code */
            public open get

        internal final var _writeOnlyInt8u: kotlin.UByte? /* compiled code */

        public open val writeOnlyInt8u: kotlin.UByte? /* compiled code */
            public open get

        internal final var _nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */

        internal final var _isNullableGlobalEnumSet: kotlin.Boolean /* compiled code */

        public open val nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */
            public open get

        internal final var _nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */

        internal final var _isNullableGlobalStructSet: kotlin.Boolean /* compiled code */

        public open val nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */
            public open get

        internal final var _meiInt8u: kotlin.UByte? /* compiled code */

        public open val meiInt8u: kotlin.UByte? /* compiled code */
            public open get

        public final fun setBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setBitmap8(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun setBitmap16(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun setBitmap32(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun setBitmap64(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun setInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setInt16u(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setInt24u(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setInt32u(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setInt40u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun setInt48u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun setInt56u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun setInt64u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun setInt8s(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun setInt16s(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setInt24s(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun setInt32s(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun setInt40s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun setInt48s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun setInt56s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun setInt64s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun setEnum8(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setEnum16(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setFloatSingle(value: kotlin.Float): kotlin.Unit { /* compiled code */ }

        public final fun setFloatDouble(value: kotlin.Double): kotlin.Unit { /* compiled code */ }

        public final fun setOctetString(value: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

        public final fun setListInt8u(value: kotlin.collections.List<kotlin.UByte>): kotlin.Unit { /* compiled code */ }

        public final fun setListOctetString(value: kotlin.collections.List<kotlin.ByteArray>): kotlin.Unit { /* compiled code */ }

        public final fun setListStructOctetString(value: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>): kotlin.Unit { /* compiled code */ }

        public final fun setLongOctetString(value: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

        public final fun setCharString(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun setLongCharString(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun setEpochUs(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun setEpochS(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setVendorId(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setListNullablesAndOptionalsStruct(value: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>): kotlin.Unit { /* compiled code */ }

        public final fun setEnumAttr(value: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): kotlin.Unit { /* compiled code */ }

        public final fun setStructAttr(value: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): kotlin.Unit { /* compiled code */ }

        public final fun setRangeRestrictedInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setRangeRestrictedInt8s(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun setRangeRestrictedInt16u(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setRangeRestrictedInt16s(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun setListLongOctetString(value: kotlin.collections.List<kotlin.ByteArray>): kotlin.Unit { /* compiled code */ }

        public final fun setListFabricScoped(value: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>): kotlin.Unit { /* compiled code */ }

        public final fun setTimedWriteBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setGeneralErrorBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setClusterErrorBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setGlobalEnum(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): kotlin.Unit { /* compiled code */ }

        public final fun setGlobalStruct(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct): kotlin.Unit { /* compiled code */ }

        public final fun setUnsupported(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun setReadFailureCode(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setFailureInt32U(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun setNullableBoolean(value: kotlin.Boolean?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableBitmap8(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableBitmap16(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableBitmap32(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableBitmap64(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt8u(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt16u(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt24u(value: kotlin.UInt?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt32u(value: kotlin.UInt?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt40u(value: kotlin.ULong?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt48u(value: kotlin.ULong?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt56u(value: kotlin.ULong?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt64u(value: kotlin.ULong?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt8s(value: kotlin.Byte?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt16s(value: kotlin.Short?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt24s(value: kotlin.Int?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt32s(value: kotlin.Int?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt40s(value: kotlin.Long?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt48s(value: kotlin.Long?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt56s(value: kotlin.Long?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableInt64s(value: kotlin.Long?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableEnum8(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableEnum16(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableFloatSingle(value: kotlin.Float?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableFloatDouble(value: kotlin.Double?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableOctetString(value: kotlin.ByteArray?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableCharString(value: kotlin.String?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableEnumAttr(value: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableStruct(value: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableRangeRestrictedInt8u(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableRangeRestrictedInt8s(value: kotlin.Byte?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableRangeRestrictedInt16u(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableRangeRestrictedInt16s(value: kotlin.Short?): kotlin.Unit { /* compiled code */ }

        public final fun setWriteOnlyInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun setNullableGlobalEnum(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?): kotlin.Unit { /* compiled code */ }

        public final fun setNullableGlobalStruct(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?): kotlin.Unit { /* compiled code */ }

        public final fun setMeiInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object TestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestCommand.Request.CommandFields> {
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

    public object TestNotHandledCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNotHandledCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNotHandledCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNotHandledCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNotHandledCommand.Request.CommandFields> {
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

    public object TestSpecificCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Request.CommandFields> {
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

        public final class Response public constructor(returnValue: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response { /* compiled code */ }
            }

            public final val returnValue: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response.CommandFields> {
                @androidx.annotation.NonNull returnValue;

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

    public object TestUnknownCommandCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestUnknownCommandCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestUnknownCommandCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestUnknownCommandCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestUnknownCommandCommand.Request.CommandFields> {
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

    public object TestAddArgumentsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.UByte = COMPILED_CODE, arg2: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.UByte /* compiled code */

            public final val arg2: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull arg2;

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

        public final class Response public constructor(returnValue: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response { /* compiled code */ }
            }

            public final val returnValue: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response.CommandFields> {
                @androidx.annotation.NonNull returnValue;

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

    public object TestSimpleArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(returnValue: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val returnValue: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull returnValue;

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

    public object TestStructArrayArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> = COMPILED_CODE, arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> = COMPILED_CODE, arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> = COMPILED_CODE, arg4: kotlin.collections.List<kotlin.Boolean> = COMPILED_CODE, arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum = COMPILED_CODE, arg6: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> /* compiled code */

            public final val arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */

            public final val arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> /* compiled code */

            public final val arg4: kotlin.collections.List<kotlin.Boolean> /* compiled code */

            public final val arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum /* compiled code */

            public final val arg6: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull arg2,

                @androidx.annotation.NonNull arg3,

                @androidx.annotation.NonNull arg4,

                @androidx.annotation.NonNull arg5,

                @androidx.annotation.NonNull arg6;

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

        public final class Response public constructor(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> = COMPILED_CODE, arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> = COMPILED_CODE, arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> = COMPILED_CODE, arg4: kotlin.collections.List<kotlin.Boolean> = COMPILED_CODE, arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum = COMPILED_CODE, arg6: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> /* compiled code */

            public final val arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */

            public final val arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum> /* compiled code */

            public final val arg4: kotlin.collections.List<kotlin.Boolean> /* compiled code */

            public final val arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum /* compiled code */

            public final val arg6: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull arg2,

                @androidx.annotation.NonNull arg3,

                @androidx.annotation.NonNull arg4,

                @androidx.annotation.NonNull arg5,

                @androidx.annotation.NonNull arg6;

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

    public object TestStructArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response.CommandFields> {
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

    public object TestNestedStructArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response.CommandFields> {
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

    public object TestListStructArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response.CommandFields> {
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

    public object TestListInt8UArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.collections.List<kotlin.UByte> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<kotlin.UByte> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response.CommandFields> {
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

    public object TestNestedStructListArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStructList = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStructList /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response.CommandFields> {
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

    public object TestListNestedStructListArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response.CommandFields> {
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

    public object TestListInt8UReverseRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.collections.List<kotlin.UByte> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<kotlin.UByte> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(arg1: kotlin.collections.List<kotlin.UByte> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response { /* compiled code */ }
            }

            public final val arg1: kotlin.collections.List<kotlin.UByte> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

    public object TestEnumsRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.UShort = COMPILED_CODE, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.UShort /* compiled code */

            public final val arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull arg2;

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

        public final class Response public constructor(arg1: kotlin.UShort = COMPILED_CODE, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response { /* compiled code */ }
            }

            public final val arg1: kotlin.UShort /* compiled code */

            public final val arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull arg2;

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

    public object TestNullableOptionalRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: com.google.home.matter.serialization.OptionalValue<kotlin.UByte?> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.serialization.OptionalValue<kotlin.UByte?> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public interface OptionalArgs {
            public abstract var arg1: kotlin.UByte?
        }

        public final class Response public constructor(wasPresent: kotlin.Boolean = COMPILED_CODE, wasNull: kotlin.Boolean? = COMPILED_CODE, value: kotlin.UByte? = COMPILED_CODE, originalValue: kotlin.UByte? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response { /* compiled code */ }
            }

            public final val wasPresent: kotlin.Boolean /* compiled code */

            public final val wasNull: kotlin.Boolean? /* compiled code */

            public final val value: kotlin.UByte? /* compiled code */

            public final val originalValue: kotlin.UByte? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull wasPresent,

                @androidx.annotation.NonNull wasNull,

                @androidx.annotation.NonNull value,

                @androidx.annotation.NonNull originalValue;

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

    public object TestComplexNullableOptionalRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(nullableInt: kotlin.UShort? = COMPILED_CODE, optionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> = COMPILED_CODE, nullableOptionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort?> = COMPILED_CODE, nullableString: kotlin.String? = COMPILED_CODE, optionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String> = COMPILED_CODE, nullableOptionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String?> = COMPILED_CODE, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, optionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> = COMPILED_CODE, nullableOptionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> = COMPILED_CODE, nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? = COMPILED_CODE, optionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>> = COMPILED_CODE, nullableOptionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Request { /* compiled code */ }
            }

            public final val nullableInt: kotlin.UShort? /* compiled code */

            public final val optionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort> /* compiled code */

            public final val nullableOptionalInt: com.google.home.matter.serialization.OptionalValue<kotlin.UShort?> /* compiled code */

            public final val nullableString: kotlin.String? /* compiled code */

            public final val optionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String> /* compiled code */

            public final val nullableOptionalString: com.google.home.matter.serialization.OptionalValue<kotlin.String?> /* compiled code */

            public final val nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

            public final val optionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct> /* compiled code */

            public final val nullableOptionalStruct: com.google.home.matter.serialization.OptionalValue<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */

            public final val nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

            public final val optionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>> /* compiled code */

            public final val nullableOptionalList: com.google.home.matter.serialization.OptionalValue<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull nullableInt,

                @androidx.annotation.NonNull optionalInt,

                @androidx.annotation.NonNull nullableOptionalInt,

                @androidx.annotation.NonNull nullableString,

                @androidx.annotation.NonNull optionalString,

                @androidx.annotation.NonNull nullableOptionalString,

                @androidx.annotation.NonNull nullableStruct,

                @androidx.annotation.NonNull optionalStruct,

                @androidx.annotation.NonNull nullableOptionalStruct,

                @androidx.annotation.NonNull nullableList,

                @androidx.annotation.NonNull optionalList,

                @androidx.annotation.NonNull nullableOptionalList;

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

        public interface OptionalArgs {
            public abstract var optionalInt: kotlin.UShort

            public abstract var nullableOptionalInt: kotlin.UShort?

            public abstract var optionalString: kotlin.String

            public abstract var nullableOptionalString: kotlin.String?

            public abstract var optionalStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct

            public abstract var nullableOptionalStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?

            public abstract var optionalList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>

            public abstract var nullableOptionalList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?
        }

        public final class Response public constructor(nullableIntWasNull: kotlin.Boolean = COMPILED_CODE, nullableIntValue: kotlin.UShort? = COMPILED_CODE, optionalIntWasPresent: kotlin.Boolean = COMPILED_CODE, optionalIntValue: kotlin.UShort? = COMPILED_CODE, nullableOptionalIntWasPresent: kotlin.Boolean = COMPILED_CODE, nullableOptionalIntWasNull: kotlin.Boolean? = COMPILED_CODE, nullableOptionalIntValue: kotlin.UShort? = COMPILED_CODE, nullableStringWasNull: kotlin.Boolean = COMPILED_CODE, nullableStringValue: kotlin.String? = COMPILED_CODE, optionalStringWasPresent: kotlin.Boolean = COMPILED_CODE, optionalStringValue: kotlin.String? = COMPILED_CODE, nullableOptionalStringWasPresent: kotlin.Boolean = COMPILED_CODE, nullableOptionalStringWasNull: kotlin.Boolean? = COMPILED_CODE, nullableOptionalStringValue: kotlin.String? = COMPILED_CODE, nullableStructWasNull: kotlin.Boolean = COMPILED_CODE, nullableStructValue: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, optionalStructWasPresent: kotlin.Boolean = COMPILED_CODE, optionalStructValue: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, nullableOptionalStructWasPresent: kotlin.Boolean = COMPILED_CODE, nullableOptionalStructWasNull: kotlin.Boolean? = COMPILED_CODE, nullableOptionalStructValue: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? = COMPILED_CODE, nullableListWasNull: kotlin.Boolean = COMPILED_CODE, nullableListValue: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? = COMPILED_CODE, optionalListWasPresent: kotlin.Boolean = COMPILED_CODE, optionalListValue: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? = COMPILED_CODE, nullableOptionalListWasPresent: kotlin.Boolean = COMPILED_CODE, nullableOptionalListWasNull: kotlin.Boolean? = COMPILED_CODE, nullableOptionalListValue: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response { /* compiled code */ }
            }

            public final val nullableIntWasNull: kotlin.Boolean /* compiled code */

            public final val nullableIntValue: kotlin.UShort? /* compiled code */

            public final val optionalIntWasPresent: kotlin.Boolean /* compiled code */

            public final val optionalIntValue: kotlin.UShort? /* compiled code */

            public final val nullableOptionalIntWasPresent: kotlin.Boolean /* compiled code */

            public final val nullableOptionalIntWasNull: kotlin.Boolean? /* compiled code */

            public final val nullableOptionalIntValue: kotlin.UShort? /* compiled code */

            public final val nullableStringWasNull: kotlin.Boolean /* compiled code */

            public final val nullableStringValue: kotlin.String? /* compiled code */

            public final val optionalStringWasPresent: kotlin.Boolean /* compiled code */

            public final val optionalStringValue: kotlin.String? /* compiled code */

            public final val nullableOptionalStringWasPresent: kotlin.Boolean /* compiled code */

            public final val nullableOptionalStringWasNull: kotlin.Boolean? /* compiled code */

            public final val nullableOptionalStringValue: kotlin.String? /* compiled code */

            public final val nullableStructWasNull: kotlin.Boolean /* compiled code */

            public final val nullableStructValue: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

            public final val optionalStructWasPresent: kotlin.Boolean /* compiled code */

            public final val optionalStructValue: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

            public final val nullableOptionalStructWasPresent: kotlin.Boolean /* compiled code */

            public final val nullableOptionalStructWasNull: kotlin.Boolean? /* compiled code */

            public final val nullableOptionalStructValue: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

            public final val nullableListWasNull: kotlin.Boolean /* compiled code */

            public final val nullableListValue: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

            public final val optionalListWasPresent: kotlin.Boolean /* compiled code */

            public final val optionalListValue: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

            public final val nullableOptionalListWasPresent: kotlin.Boolean /* compiled code */

            public final val nullableOptionalListWasNull: kotlin.Boolean? /* compiled code */

            public final val nullableOptionalListValue: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull nullableIntWasNull,

                @androidx.annotation.NonNull nullableIntValue,

                @androidx.annotation.NonNull optionalIntWasPresent,

                @androidx.annotation.NonNull optionalIntValue,

                @androidx.annotation.NonNull nullableOptionalIntWasPresent,

                @androidx.annotation.NonNull nullableOptionalIntWasNull,

                @androidx.annotation.NonNull nullableOptionalIntValue,

                @androidx.annotation.NonNull nullableStringWasNull,

                @androidx.annotation.NonNull nullableStringValue,

                @androidx.annotation.NonNull optionalStringWasPresent,

                @androidx.annotation.NonNull optionalStringValue,

                @androidx.annotation.NonNull nullableOptionalStringWasPresent,

                @androidx.annotation.NonNull nullableOptionalStringWasNull,

                @androidx.annotation.NonNull nullableOptionalStringValue,

                @androidx.annotation.NonNull nullableStructWasNull,

                @androidx.annotation.NonNull nullableStructValue,

                @androidx.annotation.NonNull optionalStructWasPresent,

                @androidx.annotation.NonNull optionalStructValue,

                @androidx.annotation.NonNull nullableOptionalStructWasPresent,

                @androidx.annotation.NonNull nullableOptionalStructWasNull,

                @androidx.annotation.NonNull nullableOptionalStructValue,

                @androidx.annotation.NonNull nullableListWasNull,

                @androidx.annotation.NonNull nullableListValue,

                @androidx.annotation.NonNull optionalListWasPresent,

                @androidx.annotation.NonNull optionalListValue,

                @androidx.annotation.NonNull nullableOptionalListWasPresent,

                @androidx.annotation.NonNull nullableOptionalListWasNull,

                @androidx.annotation.NonNull nullableOptionalListValue;

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

    public object SimpleStructEchoRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

    public object TimedInvokeRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TimedInvokeRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TimedInvokeRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TimedInvokeRequestCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TimedInvokeRequestCommand.Request.CommandFields> {
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

    public object TestSimpleOptionalArgumentRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public interface OptionalArgs {
            public abstract var arg1: kotlin.Boolean
        }
    }

    public object TestEmitTestEventRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.UByte = COMPILED_CODE, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum = COMPILED_CODE, arg3: kotlin.Boolean = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.UByte /* compiled code */

            public final val arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum /* compiled code */

            public final val arg3: kotlin.Boolean /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull arg2,

                @androidx.annotation.NonNull arg3;

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

        public final class Response public constructor(value: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response.CommandFields> {
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

    public object TestEmitTestFabricScopedEventRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(value: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response { /* compiled code */ }
            }

            public final val value: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response.CommandFields> {
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

    public object TestBatchHelperRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(sleepBeforeResponseTimeMs: kotlin.UShort = COMPILED_CODE, sizeOfResponseBuffer: kotlin.UShort = COMPILED_CODE, fillCharacter: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Request { /* compiled code */ }
            }

            public final val sleepBeforeResponseTimeMs: kotlin.UShort /* compiled code */

            public final val sizeOfResponseBuffer: kotlin.UShort /* compiled code */

            public final val fillCharacter: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull sleepBeforeResponseTimeMs,

                @androidx.annotation.NonNull sizeOfResponseBuffer,

                @androidx.annotation.NonNull fillCharacter;

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

        public final class Response public constructor(buffer: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response { /* compiled code */ }
            }

            public final val buffer: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull buffer;

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

    public object TestSecondBatchHelperRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(sleepBeforeResponseTimeMs: kotlin.UShort = COMPILED_CODE, sizeOfResponseBuffer: kotlin.UShort = COMPILED_CODE, fillCharacter: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Request { /* compiled code */ }
            }

            public final val sleepBeforeResponseTimeMs: kotlin.UShort /* compiled code */

            public final val sizeOfResponseBuffer: kotlin.UShort /* compiled code */

            public final val fillCharacter: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull sleepBeforeResponseTimeMs,

                @androidx.annotation.NonNull sizeOfResponseBuffer,

                @androidx.annotation.NonNull fillCharacter;

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

        public final class Response public constructor(buffer: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response { /* compiled code */ }
            }

            public final val buffer: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull buffer;

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

    public object StringEchoRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(payload: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Request { /* compiled code */ }
            }

            public final val payload: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull payload;

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

        public final class Response public constructor(payload: kotlin.ByteArray = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response { /* compiled code */ }
            }

            public final val payload: kotlin.ByteArray /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull payload;

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

    public object GlobalEchoRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct = COMPILED_CODE, field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Request { /* compiled code */ }
            }

            public final val field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct /* compiled code */

            public final val field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull field1,

                @androidx.annotation.NonNull field2;

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

        public final class Response public constructor(field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct = COMPILED_CODE, field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response { /* compiled code */ }
            }

            public final val field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct /* compiled code */

            public final val field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull field1,

                @androidx.annotation.NonNull field2;

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

    public object TestDifferentVendorMeiRequestCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(arg1: kotlin.UByte = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Request { /* compiled code */ }
            }

            public final val arg1: kotlin.UByte /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Request.CommandFields> {
                @androidx.annotation.NonNull arg1;

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

        public final class Response public constructor(arg1: kotlin.UByte = COMPILED_CODE, eventNumber: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response { /* compiled code */ }
            }

            public final val arg1: kotlin.UByte /* compiled code */

            public final val eventNumber: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response.CommandFields> {
                @androidx.annotation.NonNull arg1,

                @androidx.annotation.NonNull eventNumber;

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


// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface UnitTesting : com.google.home.matter.standard.UnitTestingTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.UnitTesting, com.google.home.matter.standard.UnitTestingTrait.MutableAttributes>, com.google.home.matter.standard.UnitTestingCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.UnitTesting> {
        public final val boolean: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val bitmap8: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?> /* compiled code */
            public final get

        public final val bitmap16: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?> /* compiled code */
            public final get

        public final val bitmap32: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?> /* compiled code */
            public final get

        public final val bitmap64: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?> /* compiled code */
            public final get

        public final val int8u: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val int16u: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val int24u: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val int32u: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val int40u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val int48u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val int56u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val int64u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val int8s: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val int16s: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val int24s: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val int32s: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val int40s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val int48s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val int56s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val int64s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val enum8: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val enum16: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val floatSingle: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val floatDouble: com.google.home.automation.Attribute<kotlin.Double?> /* compiled code */
            public final get

        public final val octetString: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val listInt8u: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UByte>?> /* compiled code */
            public final get

        public final val listOctetString: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val listStructOctetString: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>?> /* compiled code */
            public final get

        public final val longOctetString: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val charString: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val longCharString: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val epochUs: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val epochS: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val vendorId: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val listNullablesAndOptionalsStruct: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>?> /* compiled code */
            public final get

        public final val enumAttr: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?> /* compiled code */
            public final get

        public final val structAttr: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */
            public final get

        public final val rangeRestrictedInt8u: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val rangeRestrictedInt8s: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val rangeRestrictedInt16u: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val rangeRestrictedInt16s: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val listLongOctetString: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val listFabricScoped: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>?> /* compiled code */
            public final get

        public final val timedWriteBoolean: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val generalErrorBoolean: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val clusterErrorBoolean: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val globalEnum: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?> /* compiled code */
            public final get

        public final val globalStruct: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?> /* compiled code */
            public final get

        public final val unsupported: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val readFailureCode: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val failureInt32U: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val nullableBoolean: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val nullableBitmap8: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?> /* compiled code */
            public final get

        public final val nullableBitmap16: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?> /* compiled code */
            public final get

        public final val nullableBitmap32: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?> /* compiled code */
            public final get

        public final val nullableBitmap64: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?> /* compiled code */
            public final get

        public final val nullableInt8u: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val nullableInt16u: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val nullableInt24u: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val nullableInt32u: com.google.home.automation.Attribute<kotlin.UInt?> /* compiled code */
            public final get

        public final val nullableInt40u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val nullableInt48u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val nullableInt56u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val nullableInt64u: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val nullableInt8s: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val nullableInt16s: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val nullableInt24s: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val nullableInt32s: com.google.home.automation.Attribute<kotlin.Int?> /* compiled code */
            public final get

        public final val nullableInt40s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val nullableInt48s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val nullableInt56s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val nullableInt64s: com.google.home.automation.Attribute<kotlin.Long?> /* compiled code */
            public final get

        public final val nullableEnum8: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val nullableEnum16: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val nullableFloatSingle: com.google.home.automation.Attribute<kotlin.Float?> /* compiled code */
            public final get

        public final val nullableFloatDouble: com.google.home.automation.Attribute<kotlin.Double?> /* compiled code */
            public final get

        public final val nullableOctetString: com.google.home.automation.Attribute<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val nullableCharString: com.google.home.automation.Attribute<kotlin.String?> /* compiled code */
            public final get

        public final val nullableEnumAttr: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?> /* compiled code */
            public final get

        public final val nullableStruct: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */
            public final get

        public final val nullableRangeRestrictedInt8u: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val nullableRangeRestrictedInt8s: com.google.home.automation.Attribute<kotlin.Byte?> /* compiled code */
            public final get

        public final val nullableRangeRestrictedInt16u: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val nullableRangeRestrictedInt16s: com.google.home.automation.Attribute<kotlin.Short?> /* compiled code */
            public final get

        public final val writeOnlyInt8u: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val nullableGlobalEnum: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?> /* compiled code */
            public final get

        public final val nullableGlobalStruct: com.google.home.automation.Attribute<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?> /* compiled code */
            public final get

        public final val meiInt8u: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
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

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.boolean: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.bitmap8: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.bitmap16: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.bitmap32: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.bitmap64: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int16u: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int24u: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int32u: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int40u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int48u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int56u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int64u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int8s: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int16s: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int24s: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int32s: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int40s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int48s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int56s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.int64s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.enum8: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.enum16: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.floatSingle: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.floatDouble: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.octetString: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.listInt8u: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UByte>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.listOctetString: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.listStructOctetString: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.longOctetString: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.charString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.longCharString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.epochUs: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.epochS: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.vendorId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.listNullablesAndOptionalsStruct: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.enumAttr: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.structAttr: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.rangeRestrictedInt8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.rangeRestrictedInt8s: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.rangeRestrictedInt16u: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.rangeRestrictedInt16s: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.listLongOctetString: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.listFabricScoped: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.timedWriteBoolean: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.generalErrorBoolean: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.clusterErrorBoolean: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.globalEnum: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.globalStruct: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.unsupported: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.readFailureCode: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.failureInt32U: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableBoolean: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableBitmap8: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableBitmap16: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableBitmap32: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableBitmap64: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt16u: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt24u: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt32u: com.google.home.automation.TypedExpression<kotlin.UInt?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt40u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt48u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt56u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt64u: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt8s: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt16s: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt24s: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt32s: com.google.home.automation.TypedExpression<kotlin.Int?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt40s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt48s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt56s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableInt64s: com.google.home.automation.TypedExpression<kotlin.Long?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableEnum8: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableEnum16: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableFloatSingle: com.google.home.automation.TypedExpression<kotlin.Float?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableFloatDouble: com.google.home.automation.TypedExpression<kotlin.Double?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableOctetString: com.google.home.automation.TypedExpression<kotlin.ByteArray?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableCharString: com.google.home.automation.TypedExpression<kotlin.String?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableEnumAttr: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableStruct: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableRangeRestrictedInt8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableRangeRestrictedInt8s: com.google.home.automation.TypedExpression<kotlin.Byte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableRangeRestrictedInt16u: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableRangeRestrictedInt16s: com.google.home.automation.TypedExpression<kotlin.Short?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.writeOnlyInt8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableGlobalEnum: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.nullableGlobalStruct: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.meiInt8u: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setBitmap8(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setBitmap16(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setBitmap32(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setBitmap64(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt16u(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt24u(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt32u(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt40u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt48u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt56u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt64u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt8s(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt16s(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt24s(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt32s(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt40s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt48s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt56s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setInt64s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setEnum8(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setEnum16(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setFloatSingle(value: kotlin.Float): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setFloatDouble(value: kotlin.Double): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setOctetString(value: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setListInt8u(value: kotlin.collections.List<kotlin.UByte>): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setListOctetString(value: kotlin.collections.List<kotlin.ByteArray>): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setLongOctetString(value: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setCharString(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setLongCharString(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setEpochUs(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setEpochS(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setVendorId(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setEnumAttr(value: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setRangeRestrictedInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setRangeRestrictedInt8s(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setRangeRestrictedInt16u(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setRangeRestrictedInt16s(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setListLongOctetString(value: kotlin.collections.List<kotlin.ByteArray>): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setTimedWriteBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setGeneralErrorBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setClusterErrorBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setGlobalEnum(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setUnsupported(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setReadFailureCode(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setFailureInt32U(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableBoolean(value: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableBitmap8(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableBitmap16(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableBitmap32(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableBitmap64(value: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt16u(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt24u(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt32u(value: kotlin.UInt): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt40u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt48u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt56u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt64u(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt8s(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt16s(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt24s(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt32s(value: kotlin.Int): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt40s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt48s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt56s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableInt64s(value: kotlin.Long): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableEnum8(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableEnum16(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableFloatSingle(value: kotlin.Float): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableFloatDouble(value: kotlin.Double): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableOctetString(value: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableCharString(value: kotlin.String): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableEnumAttr(value: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableRangeRestrictedInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableRangeRestrictedInt8s(value: kotlin.Byte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableRangeRestrictedInt16u(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableRangeRestrictedInt16s(value: kotlin.Short): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setWriteOnlyInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setNullableGlobalEnum(value: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): kotlin.Unit { /* compiled code */ }

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.UnitTesting>.setMeiInt8u(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public final fun test(): com.google.home.automation.Command { /* compiled code */ }

        public final fun testNotHandled(): com.google.home.automation.Command { /* compiled code */ }

        public final fun testSpecific(): com.google.home.automation.Command { /* compiled code */ }

        public final fun testUnknownCommand(): com.google.home.automation.Command { /* compiled code */ }

        public final fun testAddArguments(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun testSimpleArgumentRequest(arg1: kotlin.Boolean): com.google.home.automation.Command { /* compiled code */ }

        public final fun testListInt8UArgumentRequest(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.automation.Command { /* compiled code */ }

        public final fun testListInt8UReverseRequest(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.automation.Command { /* compiled code */ }

        public final fun testEnumsRequest(arg1: kotlin.UShort, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): com.google.home.automation.Command { /* compiled code */ }

        public final fun testNullableOptionalRequest(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun timedInvokeRequest(): com.google.home.automation.Command { /* compiled code */ }

        public final fun testSimpleOptionalArgumentRequest(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun testEmitTestEventRequest(arg1: kotlin.UByte, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg3: kotlin.Boolean): com.google.home.automation.Command { /* compiled code */ }

        public final fun testEmitTestFabricScopedEventRequest(arg1: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun testBatchHelperRequest(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun testSecondBatchHelperRequest(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun stringEchoRequest(payload: kotlin.ByteArray): com.google.home.automation.Command { /* compiled code */ }

        public final fun testDifferentVendorMeiRequest(arg1: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.UnitTesting> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.UnitTesting.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.UnitTesting.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTesting.Attribute> {
        @androidx.annotation.NonNull boolean,

        @androidx.annotation.NonNull bitmap8,

        @androidx.annotation.NonNull bitmap16,

        @androidx.annotation.NonNull bitmap32,

        @androidx.annotation.NonNull bitmap64,

        @androidx.annotation.NonNull int8u,

        @androidx.annotation.NonNull int16u,

        @androidx.annotation.NonNull int24u,

        @androidx.annotation.NonNull int32u,

        @androidx.annotation.NonNull int40u,

        @androidx.annotation.NonNull int48u,

        @androidx.annotation.NonNull int56u,

        @androidx.annotation.NonNull int64u,

        @androidx.annotation.NonNull int8s,

        @androidx.annotation.NonNull int16s,

        @androidx.annotation.NonNull int24s,

        @androidx.annotation.NonNull int32s,

        @androidx.annotation.NonNull int40s,

        @androidx.annotation.NonNull int48s,

        @androidx.annotation.NonNull int56s,

        @androidx.annotation.NonNull int64s,

        @androidx.annotation.NonNull enum8,

        @androidx.annotation.NonNull enum16,

        @androidx.annotation.NonNull floatSingle,

        @androidx.annotation.NonNull floatDouble,

        @androidx.annotation.NonNull octetString,

        @androidx.annotation.NonNull listInt8u,

        @androidx.annotation.NonNull listOctetString,

        @androidx.annotation.NonNull listStructOctetString,

        @androidx.annotation.NonNull longOctetString,

        @androidx.annotation.NonNull charString,

        @androidx.annotation.NonNull longCharString,

        @androidx.annotation.NonNull epochUs,

        @androidx.annotation.NonNull epochS,

        @androidx.annotation.NonNull vendorId,

        @androidx.annotation.NonNull listNullablesAndOptionalsStruct,

        @androidx.annotation.NonNull enumAttr,

        @androidx.annotation.NonNull structAttr,

        @androidx.annotation.NonNull rangeRestrictedInt8u,

        @androidx.annotation.NonNull rangeRestrictedInt8s,

        @androidx.annotation.NonNull rangeRestrictedInt16u,

        @androidx.annotation.NonNull rangeRestrictedInt16s,

        @androidx.annotation.NonNull listLongOctetString,

        @androidx.annotation.NonNull listFabricScoped,

        @androidx.annotation.NonNull timedWriteBoolean,

        @androidx.annotation.NonNull generalErrorBoolean,

        @androidx.annotation.NonNull clusterErrorBoolean,

        @androidx.annotation.NonNull globalEnum,

        @androidx.annotation.NonNull globalStruct,

        @androidx.annotation.NonNull unsupported,

        @androidx.annotation.NonNull readFailureCode,

        @androidx.annotation.NonNull failureInt32U,

        @androidx.annotation.NonNull nullableBoolean,

        @androidx.annotation.NonNull nullableBitmap8,

        @androidx.annotation.NonNull nullableBitmap16,

        @androidx.annotation.NonNull nullableBitmap32,

        @androidx.annotation.NonNull nullableBitmap64,

        @androidx.annotation.NonNull nullableInt8u,

        @androidx.annotation.NonNull nullableInt16u,

        @androidx.annotation.NonNull nullableInt24u,

        @androidx.annotation.NonNull nullableInt32u,

        @androidx.annotation.NonNull nullableInt40u,

        @androidx.annotation.NonNull nullableInt48u,

        @androidx.annotation.NonNull nullableInt56u,

        @androidx.annotation.NonNull nullableInt64u,

        @androidx.annotation.NonNull nullableInt8s,

        @androidx.annotation.NonNull nullableInt16s,

        @androidx.annotation.NonNull nullableInt24s,

        @androidx.annotation.NonNull nullableInt32s,

        @androidx.annotation.NonNull nullableInt40s,

        @androidx.annotation.NonNull nullableInt48s,

        @androidx.annotation.NonNull nullableInt56s,

        @androidx.annotation.NonNull nullableInt64s,

        @androidx.annotation.NonNull nullableEnum8,

        @androidx.annotation.NonNull nullableEnum16,

        @androidx.annotation.NonNull nullableFloatSingle,

        @androidx.annotation.NonNull nullableFloatDouble,

        @androidx.annotation.NonNull nullableOctetString,

        @androidx.annotation.NonNull nullableCharString,

        @androidx.annotation.NonNull nullableEnumAttr,

        @androidx.annotation.NonNull nullableStruct,

        @androidx.annotation.NonNull nullableRangeRestrictedInt8u,

        @androidx.annotation.NonNull nullableRangeRestrictedInt8s,

        @androidx.annotation.NonNull nullableRangeRestrictedInt16u,

        @androidx.annotation.NonNull nullableRangeRestrictedInt16s,

        @androidx.annotation.NonNull writeOnlyInt8u,

        @androidx.annotation.NonNull nullableGlobalEnum,

        @androidx.annotation.NonNull nullableGlobalStruct,

        @androidx.annotation.NonNull meiInt8u,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.UnitTesting.Command> {
        @androidx.annotation.NonNull Test,

        @androidx.annotation.NonNull TestNotHandled,

        @androidx.annotation.NonNull TestSpecific,

        @androidx.annotation.NonNull TestUnknownCommand,

        @androidx.annotation.NonNull TestAddArguments,

        @androidx.annotation.NonNull TestSimpleArgumentRequest,

        @androidx.annotation.NonNull TestStructArrayArgumentRequest,

        @androidx.annotation.NonNull TestStructArgumentRequest,

        @androidx.annotation.NonNull TestNestedStructArgumentRequest,

        @androidx.annotation.NonNull TestListStructArgumentRequest,

        @androidx.annotation.NonNull TestListInt8UArgumentRequest,

        @androidx.annotation.NonNull TestNestedStructListArgumentRequest,

        @androidx.annotation.NonNull TestListNestedStructListArgumentRequest,

        @androidx.annotation.NonNull TestListInt8UReverseRequest,

        @androidx.annotation.NonNull TestEnumsRequest,

        @androidx.annotation.NonNull TestNullableOptionalRequest,

        @androidx.annotation.NonNull TestComplexNullableOptionalRequest,

        @androidx.annotation.NonNull SimpleStructEchoRequest,

        @androidx.annotation.NonNull TimedInvokeRequest,

        @androidx.annotation.NonNull TestSimpleOptionalArgumentRequest,

        @androidx.annotation.NonNull TestEmitTestEventRequest,

        @androidx.annotation.NonNull TestEmitTestFabricScopedEventRequest,

        @androidx.annotation.NonNull TestBatchHelperRequest,

        @androidx.annotation.NonNull TestSecondBatchHelperRequest,

        @androidx.annotation.NonNull StringEchoRequest,

        @androidx.annotation.NonNull GlobalEchoRequest,

        @androidx.annotation.NonNull TestDifferentVendorMeiRequest;

        public final val tag: kotlin.UInt /* compiled code */
    }

    public final class TestEventEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.UnitTestingTrait.TestEvent) : com.google.home.Event, com.google.home.matter.standard.UnitTestingTrait.TestEvent {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.UnitTesting.TestEventEvent> {
            public final val arg1: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val arg2: com.google.home.automation.EventField<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?> /* compiled code */
                public final get

            public final val arg3: com.google.home.automation.EventField<kotlin.Boolean?> /* compiled code */
                public final get

            public final val arg6: com.google.home.automation.EventField<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting.TestEventEvent?>.arg1: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting.TestEventEvent?>.arg2: com.google.home.automation.TypedExpression<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting.TestEventEvent?>.arg3: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting.TestEventEvent?>.arg6: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.UnitTestingTrait.TestEvent /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val arg1: kotlin.UByte? /* compiled code */

        public open val arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

        public open val arg3: kotlin.Boolean? /* compiled code */

        public open val arg4: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

        public open val arg5: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>? /* compiled code */

        public open val arg6: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTesting.TestEventEvent.EventFields> {
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

    public final class TestFabricScopedEventEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent) : com.google.home.Event, com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.UnitTesting.TestFabricScopedEventEvent> {
            public final val fabricIndex: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting.TestFabricScopedEventEvent?>.fabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.UnitTestingTrait.TestFabricScopedEvent /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val fabricIndex: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTesting.TestFabricScopedEventEvent.EventFields> {
            @androidx.annotation.NonNull fabricIndex;

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

    public final class TestDifferentVendorMeiEventEvent private constructor(eventName: kotlin.String = COMPILED_CODE, timestampInMs: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, eventPayload: com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent) : com.google.home.Event, com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent {
        public companion object : com.google.home.EventFactory<com.google.home.matter.standard.UnitTesting.TestDifferentVendorMeiEventEvent> {
            public final val arg1: com.google.home.automation.EventField<kotlin.UByte?> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.UnitTesting.TestDifferentVendorMeiEventEvent?>.arg1: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
                public final get

            public open fun getEventFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }
        }

        public open val eventName: kotlin.String /* compiled code */

        private final val timestampInMs: kotlin.Long /* compiled code */

        public open val eventImportance: com.google.home.EventImportance /* compiled code */

        public open val eventNumber: kotlin.ULong /* compiled code */

        private final val eventPayload: com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiEvent /* compiled code */

        public open val eventId: com.google.home.Id /* compiled code */

        public open val timestamp: java.time.Instant /* compiled code */

        public open val arg1: kotlin.UByte? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public final enum class EventFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.UnitTesting.TestDifferentVendorMeiEventEvent.EventFields> {
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


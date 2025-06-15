// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class UnitTestingImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.UnitTestingTrait.Attributes) : com.google.home.matter.standard.UnitTesting, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.UnitTestingTrait.Attributes, com.google.home.Updatable<com.google.home.matter.standard.UnitTesting, com.google.home.matter.standard.UnitTestingTrait.MutableAttributes> {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.UnitTestingTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val bitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */

    public open val bitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */

    public open val bitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */

    public open val bitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */

    public open val boolean: kotlin.Boolean? /* compiled code */

    public open val charString: kotlin.String? /* compiled code */

    public open val clusterErrorBoolean: kotlin.Boolean? /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val enum16: kotlin.UShort? /* compiled code */

    public open val enum8: kotlin.UByte? /* compiled code */

    public open val enumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

    public open val epochS: kotlin.UInt? /* compiled code */

    public open val epochUs: kotlin.ULong? /* compiled code */

    public open val failureInt32U: kotlin.UInt? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val floatDouble: kotlin.Double? /* compiled code */

    public open val floatSingle: kotlin.Float? /* compiled code */

    public open val generalErrorBoolean: kotlin.Boolean? /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val globalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */

    public open val globalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */

    public open val int16s: kotlin.Short? /* compiled code */

    public open val int16u: kotlin.UShort? /* compiled code */

    public open val int24s: kotlin.Int? /* compiled code */

    public open val int24u: kotlin.UInt? /* compiled code */

    public open val int32s: kotlin.Int? /* compiled code */

    public open val int32u: kotlin.UInt? /* compiled code */

    public open val int40s: kotlin.Long? /* compiled code */

    public open val int40u: kotlin.ULong? /* compiled code */

    public open val int48s: kotlin.Long? /* compiled code */

    public open val int48u: kotlin.ULong? /* compiled code */

    public open val int56s: kotlin.Long? /* compiled code */

    public open val int56u: kotlin.ULong? /* compiled code */

    public open val int64s: kotlin.Long? /* compiled code */

    public open val int64u: kotlin.ULong? /* compiled code */

    public open val int8s: kotlin.Byte? /* compiled code */

    public open val int8u: kotlin.UByte? /* compiled code */

    public open val listFabricScoped: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestFabricScoped>? /* compiled code */

    public open val listInt8u: kotlin.collections.List<kotlin.UByte>? /* compiled code */

    public open val listLongOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

    public open val listNullablesAndOptionalsStruct: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NullablesAndOptionalsStruct>? /* compiled code */

    public open val listOctetString: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

    public open val listStructOctetString: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.TestListStructOctet>? /* compiled code */

    public open val longCharString: kotlin.String? /* compiled code */

    public open val longOctetString: kotlin.ByteArray? /* compiled code */

    public open val meiInt8u: kotlin.UByte? /* compiled code */

    public open val nullableBitmap16: com.google.home.matter.standard.UnitTestingTrait.Bitmap16MaskMap? /* compiled code */

    public open val nullableBitmap32: com.google.home.matter.standard.UnitTestingTrait.Bitmap32MaskMap? /* compiled code */

    public open val nullableBitmap64: com.google.home.matter.standard.UnitTestingTrait.Bitmap64MaskMap? /* compiled code */

    public open val nullableBitmap8: com.google.home.matter.standard.UnitTestingTrait.Bitmap8MaskMap? /* compiled code */

    public open val nullableBoolean: kotlin.Boolean? /* compiled code */

    public open val nullableCharString: kotlin.String? /* compiled code */

    public open val nullableEnum16: kotlin.UShort? /* compiled code */

    public open val nullableEnum8: kotlin.UByte? /* compiled code */

    public open val nullableEnumAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum? /* compiled code */

    public open val nullableFloatDouble: kotlin.Double? /* compiled code */

    public open val nullableFloatSingle: kotlin.Float? /* compiled code */

    public open val nullableGlobalEnum: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum? /* compiled code */

    public open val nullableGlobalStruct: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct? /* compiled code */

    public open val nullableInt16s: kotlin.Short? /* compiled code */

    public open val nullableInt16u: kotlin.UShort? /* compiled code */

    public open val nullableInt24s: kotlin.Int? /* compiled code */

    public open val nullableInt24u: kotlin.UInt? /* compiled code */

    public open val nullableInt32s: kotlin.Int? /* compiled code */

    public open val nullableInt32u: kotlin.UInt? /* compiled code */

    public open val nullableInt40s: kotlin.Long? /* compiled code */

    public open val nullableInt40u: kotlin.ULong? /* compiled code */

    public open val nullableInt48s: kotlin.Long? /* compiled code */

    public open val nullableInt48u: kotlin.ULong? /* compiled code */

    public open val nullableInt56s: kotlin.Long? /* compiled code */

    public open val nullableInt56u: kotlin.ULong? /* compiled code */

    public open val nullableInt64s: kotlin.Long? /* compiled code */

    public open val nullableInt64u: kotlin.ULong? /* compiled code */

    public open val nullableInt8s: kotlin.Byte? /* compiled code */

    public open val nullableInt8u: kotlin.UByte? /* compiled code */

    public open val nullableOctetString: kotlin.ByteArray? /* compiled code */

    public open val nullableRangeRestrictedInt16s: kotlin.Short? /* compiled code */

    public open val nullableRangeRestrictedInt16u: kotlin.UShort? /* compiled code */

    public open val nullableRangeRestrictedInt8s: kotlin.Byte? /* compiled code */

    public open val nullableRangeRestrictedInt8u: kotlin.UByte? /* compiled code */

    public open val nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

    public open val octetString: kotlin.ByteArray? /* compiled code */

    public open val rangeRestrictedInt16s: kotlin.Short? /* compiled code */

    public open val rangeRestrictedInt16u: kotlin.UShort? /* compiled code */

    public open val rangeRestrictedInt8s: kotlin.Byte? /* compiled code */

    public open val rangeRestrictedInt8u: kotlin.UByte? /* compiled code */

    public open val readFailureCode: kotlin.UByte? /* compiled code */

    public open val structAttr: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct? /* compiled code */

    public open val timedWriteBoolean: kotlin.Boolean? /* compiled code */

    public open val unsupported: kotlin.Boolean? /* compiled code */

    public open val vendorId: kotlin.UShort? /* compiled code */

    public open val writeOnlyInt8u: kotlin.UByte? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.UnitTesting.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.UnitTesting.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun test(): kotlin.Unit { /* compiled code */ }

    public open suspend fun testNotHandled(): kotlin.Unit { /* compiled code */ }

    public open suspend fun testSpecific(): com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response { /* compiled code */ }

    public open suspend fun testUnknownCommand(): kotlin.Unit { /* compiled code */ }

    public open suspend fun testAddArguments(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response { /* compiled code */ }

    public open suspend fun testSimpleArgumentRequest(arg1: kotlin.Boolean): com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testStructArrayArgumentRequest(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>, arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>, arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>, arg4: kotlin.collections.List<kotlin.Boolean>, arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg6: kotlin.Boolean): com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testStructArgumentRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testNestedStructArgumentRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStruct): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testListStructArgumentRequest(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>): com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testListInt8UArgumentRequest(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testNestedStructListArgumentRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStructList): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testListNestedStructListArgumentRequest(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>): com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response { /* compiled code */ }

    public open suspend fun testListInt8UReverseRequest(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response { /* compiled code */ }

    public open suspend fun testEnumsRequest(arg1: kotlin.UShort, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response { /* compiled code */ }

    public open suspend fun testNullableOptionalRequest(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response { /* compiled code */ }

    public open suspend fun testComplexNullableOptionalRequest(nullableInt: kotlin.UShort?, nullableString: kotlin.String?, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?, nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?, optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response { /* compiled code */ }

    public open suspend fun simpleStructEchoRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response { /* compiled code */ }

    public open suspend fun timedInvokeRequest(): kotlin.Unit { /* compiled code */ }

    public open suspend fun testSimpleOptionalArgumentRequest(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun testEmitTestEventRequest(arg1: kotlin.UByte, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg3: kotlin.Boolean): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response { /* compiled code */ }

    public open suspend fun testEmitTestFabricScopedEventRequest(arg1: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response { /* compiled code */ }

    public open suspend fun testBatchHelperRequest(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response { /* compiled code */ }

    public open suspend fun testSecondBatchHelperRequest(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response { /* compiled code */ }

    public open suspend fun stringEchoRequest(payload: kotlin.ByteArray): com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response { /* compiled code */ }

    public open suspend fun globalEchoRequest(field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct, field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response { /* compiled code */ }

    public open suspend fun testDifferentVendorMeiRequest(arg1: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response { /* compiled code */ }

    public open suspend fun update(optimisticReturn: (com.google.home.matter.standard.UnitTesting) -> kotlin.Unit, init: com.google.home.matter.standard.UnitTestingTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.UnitTesting { /* compiled code */ }

    public open fun testBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun testNotHandledBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun testSpecificBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response> { /* compiled code */ }

    public open fun testUnknownCommandBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun testAddArgumentsBatchable(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response> { /* compiled code */ }

    public open fun testSimpleArgumentRequestBatchable(arg1: kotlin.Boolean): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testStructArrayArgumentRequestBatchable(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>, arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>, arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>, arg4: kotlin.collections.List<kotlin.Boolean>, arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg6: kotlin.Boolean): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testStructArgumentRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testNestedStructArgumentRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testListStructArgumentRequestBatchable(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testListInt8UArgumentRequestBatchable(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testNestedStructListArgumentRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStructList): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testListNestedStructListArgumentRequestBatchable(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response> { /* compiled code */ }

    public open fun testListInt8UReverseRequestBatchable(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response> { /* compiled code */ }

    public open fun testEnumsRequestBatchable(arg1: kotlin.UShort, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response> { /* compiled code */ }

    public open fun testNullableOptionalRequestBatchable(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response> { /* compiled code */ }

    public open fun testComplexNullableOptionalRequestBatchable(nullableInt: kotlin.UShort?, nullableString: kotlin.String?, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?, nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?, optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response> { /* compiled code */ }

    public open fun simpleStructEchoRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response> { /* compiled code */ }

    public open fun timedInvokeRequestBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun testSimpleOptionalArgumentRequestBatchable(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun testEmitTestEventRequestBatchable(arg1: kotlin.UByte, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg3: kotlin.Boolean): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response> { /* compiled code */ }

    public open fun testEmitTestFabricScopedEventRequestBatchable(arg1: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response> { /* compiled code */ }

    public open fun testBatchHelperRequestBatchable(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response> { /* compiled code */ }

    public open fun testSecondBatchHelperRequestBatchable(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response> { /* compiled code */ }

    public open fun stringEchoRequestBatchable(payload: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response> { /* compiled code */ }

    public open fun globalEchoRequestBatchable(field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct, field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response> { /* compiled code */ }

    public open fun testDifferentVendorMeiRequestBatchable(arg1: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

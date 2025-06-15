// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface UnitTestingCommands {
    public abstract suspend fun test(): kotlin.Unit

    public abstract suspend fun testNotHandled(): kotlin.Unit

    public abstract suspend fun testSpecific(): com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response

    public abstract suspend fun testUnknownCommand(): kotlin.Unit

    public abstract suspend fun testAddArguments(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response

    public abstract suspend fun testSimpleArgumentRequest(arg1: kotlin.Boolean): com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response

    public abstract suspend fun testStructArrayArgumentRequest(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>, arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>, arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>, arg4: kotlin.collections.List<kotlin.Boolean>, arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg6: kotlin.Boolean): com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response

    public abstract suspend fun testStructArgumentRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response

    public abstract suspend fun testNestedStructArgumentRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStruct): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response

    public abstract suspend fun testListStructArgumentRequest(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>): com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response

    public abstract suspend fun testListInt8UArgumentRequest(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response

    public abstract suspend fun testNestedStructListArgumentRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStructList): com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response

    public abstract suspend fun testListNestedStructListArgumentRequest(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>): com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response

    public abstract suspend fun testListInt8UReverseRequest(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response

    public abstract suspend fun testEnumsRequest(arg1: kotlin.UShort, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response

    public abstract suspend fun testNullableOptionalRequest(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response

    public abstract suspend fun testComplexNullableOptionalRequest(nullableInt: kotlin.UShort?, nullableString: kotlin.String?, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?, nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?, optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response

    public abstract suspend fun simpleStructEchoRequest(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response

    public abstract suspend fun timedInvokeRequest(): kotlin.Unit

    public abstract suspend fun testSimpleOptionalArgumentRequest(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun testEmitTestEventRequest(arg1: kotlin.UByte, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg3: kotlin.Boolean): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response

    public abstract suspend fun testEmitTestFabricScopedEventRequest(arg1: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response

    public abstract suspend fun testBatchHelperRequest(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response

    public abstract suspend fun testSecondBatchHelperRequest(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response

    public abstract suspend fun stringEchoRequest(payload: kotlin.ByteArray): com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response

    public abstract suspend fun globalEchoRequest(field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct, field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response

    public abstract suspend fun testDifferentVendorMeiRequest(arg1: kotlin.UByte): com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response

    public abstract fun testBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun testNotHandledBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun testSpecificBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestSpecificCommand.Response>

    public abstract fun testUnknownCommandBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun testAddArgumentsBatchable(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestAddArgumentsCommand.Response>

    public abstract fun testSimpleArgumentRequestBatchable(arg1: kotlin.Boolean): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestSimpleArgumentRequestCommand.Response>

    public abstract fun testStructArrayArgumentRequestBatchable(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>, arg2: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>, arg3: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>, arg4: kotlin.collections.List<kotlin.Boolean>, arg5: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg6: kotlin.Boolean): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestStructArrayArgumentRequestCommand.Response>

    public abstract fun testStructArgumentRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestStructArgumentRequestCommand.Response>

    public abstract fun testNestedStructArgumentRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructArgumentRequestCommand.Response>

    public abstract fun testListStructArgumentRequestBatchable(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleStruct>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListStructArgumentRequestCommand.Response>

    public abstract fun testListInt8UArgumentRequestBatchable(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UArgumentRequestCommand.Response>

    public abstract fun testNestedStructListArgumentRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.NestedStructList): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestNestedStructListArgumentRequestCommand.Response>

    public abstract fun testListNestedStructListArgumentRequestBatchable(arg1: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.NestedStructList>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListNestedStructListArgumentRequestCommand.Response>

    public abstract fun testListInt8UReverseRequestBatchable(arg1: kotlin.collections.List<kotlin.UByte>): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestListInt8UReverseRequestCommand.Response>

    public abstract fun testEnumsRequestBatchable(arg1: kotlin.UShort, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestEnumsRequestCommand.Response>

    public abstract fun testNullableOptionalRequestBatchable(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestNullableOptionalRequestCommand.Response>

    public abstract fun testComplexNullableOptionalRequestBatchable(nullableInt: kotlin.UShort?, nullableString: kotlin.String?, nullableStruct: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct?, nullableList: kotlin.collections.List<com.google.home.matter.standard.UnitTestingTrait.SimpleEnum>?, optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestComplexNullableOptionalRequestCommand.Response>

    public abstract fun simpleStructEchoRequestBatchable(arg1: com.google.home.matter.standard.UnitTestingTrait.SimpleStruct): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.SimpleStructEchoRequestCommand.Response>

    public abstract fun timedInvokeRequestBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun testSimpleOptionalArgumentRequestBatchable(optionalArgs: com.google.home.matter.standard.UnitTestingTrait.TestSimpleOptionalArgumentRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun testEmitTestEventRequestBatchable(arg1: kotlin.UByte, arg2: com.google.home.matter.standard.UnitTestingTrait.SimpleEnum, arg3: kotlin.Boolean): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestEventRequestCommand.Response>

    public abstract fun testEmitTestFabricScopedEventRequestBatchable(arg1: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestEmitTestFabricScopedEventRequestCommand.Response>

    public abstract fun testBatchHelperRequestBatchable(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestBatchHelperRequestCommand.Response>

    public abstract fun testSecondBatchHelperRequestBatchable(sleepBeforeResponseTimeMs: kotlin.UShort, sizeOfResponseBuffer: kotlin.UShort, fillCharacter: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestSecondBatchHelperRequestCommand.Response>

    public abstract fun stringEchoRequestBatchable(payload: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.StringEchoRequestCommand.Response>

    public abstract fun globalEchoRequestBatchable(field1: com.google.home.matter.standard.UnitTestingTrait.TestGlobalStruct, field2: com.google.home.matter.standard.UnitTestingTrait.TestGlobalEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.GlobalEchoRequestCommand.Response>

    public abstract fun testDifferentVendorMeiRequestBatchable(arg1: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.UnitTestingTrait.TestDifferentVendorMeiRequestCommand.Response>
}

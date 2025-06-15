// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface UnitTestingCommandsDefaultImpl : com.google.home.matter.standard.UnitTestingCommands {
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
}


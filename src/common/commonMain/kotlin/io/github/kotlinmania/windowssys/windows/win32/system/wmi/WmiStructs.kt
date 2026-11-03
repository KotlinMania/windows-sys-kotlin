package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class MI_Application(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_ApplicationFT(
    public var Close: Long = 0L,
    public var NewSession: Long = 0L,
    public var NewHostedProvider: Long = 0L,
    public var NewInstance: Long = 0L,
    public var NewDestinationOptions: Long = 0L,
    public var NewOperationOptions: Long = 0L,
    public var NewSubscriptionDeliveryOptions: Long = 0L,
    public var NewSerializer: Long = 0L,
    public var NewDeserializer: Long = 0L,
    public var NewInstanceFromClass: Long = 0L,
    public var NewClass: Long = 0L,
)

public data class MI_Array(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ArrayField(
    public var value: MI_Array = MI_Array(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_BooleanA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_BooleanAField(
    public var value: MI_BooleanA = MI_BooleanA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_BooleanField(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Char16A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Char16AField(
    public var value: MI_Char16A = MI_Char16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Char16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Class(
    public var ft: Long = 0L,
    public var classDecl: Long = 0L,
    public var namespaceName: Long = 0L,
    public var serverName: Long = 0L,
    public var reserved: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MI_Class) return false
        if (this.ft != other.ft) return false
        if (this.classDecl != other.classDecl) return false
        if (this.namespaceName != other.namespaceName) return false
        if (this.serverName != other.serverName) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.classDecl.hashCode()
        result = 31 * result + this.namespaceName.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class MI_ClassDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: Long = 0L,
    public var qualifiers: Long = 0L,
    public var numQualifiers: UInt = 0u,
    public var properties: Long = 0L,
    public var numProperties: UInt = 0u,
    public var size: UInt = 0u,
    public var superClass: Long = 0L,
    public var superClassDecl: Long = 0L,
    public var methods: Long = 0L,
    public var numMethods: UInt = 0u,
    public var schema: Long = 0L,
    public var providerFT: Long = 0L,
    public var owningClass: Long = 0L,
)

public data class MI_ClassFT(
    public var GetClassNameA: Long = 0L,
    public var GetNameSpace: Long = 0L,
    public var GetServerName: Long = 0L,
    public var GetElementCount: Long = 0L,
    public var GetElement: Long = 0L,
    public var GetElementAt: Long = 0L,
    public var GetClassQualifierSet: Long = 0L,
    public var GetMethodCount: Long = 0L,
    public var GetMethodAt: Long = 0L,
    public var GetMethod: Long = 0L,
    public var GetParentClassName: Long = 0L,
    public var GetParentClass: Long = 0L,
    public var Delete: Long = 0L,
    public var Clone: Long = 0L,
)

public data class MI_ClientFT_V1(
    public var applicationFT: Long = 0L,
    public var sessionFT: Long = 0L,
    public var operationFT: Long = 0L,
    public var hostedProviderFT: Long = 0L,
    public var serializerFT: Long = 0L,
    public var deserializerFT: Long = 0L,
    public var subscribeDeliveryOptionsFT: Long = 0L,
    public var destinationOptionsFT: Long = 0L,
    public var operationOptionsFT: Long = 0L,
    public var utilitiesFT: Long = 0L,
)

public data class MI_ConstBooleanA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstBooleanAField(
    public var value: MI_ConstBooleanA = MI_ConstBooleanA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstBooleanField(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstChar16A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstChar16AField(
    public var value: MI_ConstChar16A = MI_ConstChar16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstChar16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstDatetimeA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstDatetimeAField(
    public var value: MI_ConstDatetimeA = MI_ConstDatetimeA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstDatetimeField(
    public var value: MI_Datetime = MI_Datetime(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstInstanceA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstInstanceAField(
    public var value: MI_ConstInstanceA = MI_ConstInstanceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstInstanceField(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstReal32A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstReal32AField(
    public var value: MI_ConstReal32A = MI_ConstReal32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstReal32Field(
    public var value: Float = 0.0f,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstReal64A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstReal64AField(
    public var value: MI_ConstReal64A = MI_ConstReal64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstReal64Field(
    public var value: Double = 0.0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstReferenceA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstReferenceAField(
    public var value: MI_ConstReferenceA = MI_ConstReferenceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstReferenceField(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint16A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstSint16AField(
    public var value: MI_ConstSint16A = MI_ConstSint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint16Field(
    public var value: Short = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint32A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstSint32AField(
    public var value: MI_ConstSint32A = MI_ConstSint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint32Field(
    public var value: Int = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint64A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstSint64AField(
    public var value: MI_ConstSint64A = MI_ConstSint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint64Field(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint8A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstSint8AField(
    public var value: MI_ConstSint8A = MI_ConstSint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstSint8Field(
    public var value: Byte = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstStringA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstStringAField(
    public var value: MI_ConstStringA = MI_ConstStringA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstStringField(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint16A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstUint16AField(
    public var value: MI_ConstUint16A = MI_ConstUint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint32A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstUint32AField(
    public var value: MI_ConstUint32A = MI_ConstUint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint32Field(
    public var value: UInt = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint64A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstUint64AField(
    public var value: MI_ConstUint64A = MI_ConstUint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint64Field(
    public var value: ULong = 0uL,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint8A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ConstUint8AField(
    public var value: MI_ConstUint8A = MI_ConstUint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ConstUint8Field(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Context(public var ft: Long = 0L, public var reserved: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MI_Context) return false
        if (this.ft != other.ft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class MI_ContextFT(
    public var PostResult: Long = 0L,
    public var PostInstance: Long = 0L,
    public var PostIndication: Long = 0L,
    public var ConstructInstance: Long = 0L,
    public var ConstructParameters: Long = 0L,
    public var NewInstance: Long = 0L,
    public var NewDynamicInstance: Long = 0L,
    public var NewParameters: Long = 0L,
    public var Canceled: Long = 0L,
    public var GetLocale: Long = 0L,
    public var RegisterCancel: Long = 0L,
    public var RequestUnload: Long = 0L,
    public var RefuseUnload: Long = 0L,
    public var GetLocalSession: Long = 0L,
    public var SetStringOption: Long = 0L,
    public var GetStringOption: Long = 0L,
    public var GetNumberOption: Long = 0L,
    public var GetCustomOption: Long = 0L,
    public var GetCustomOptionCount: Long = 0L,
    public var GetCustomOptionAt: Long = 0L,
    public var WriteMessage: Long = 0L,
    public var WriteProgress: Long = 0L,
    public var WriteStreamParameter: Long = 0L,
    public var WriteCimError: Long = 0L,
    public var PromptUser: Long = 0L,
    public var ShouldProcess: Long = 0L,
    public var ShouldContinue: Long = 0L,
    public var PostError: Long = 0L,
    public var PostCimError: Long = 0L,
    public var WriteError: Long = 0L,
)

public data class MI_Datetime(public var isTimestamp: UInt = 0u, public var u: MI_Datetime_0 = MI_Datetime_0())

public data class MI_Datetime_0(public var timestamp: MI_Timestamp = MI_Timestamp(), public var interval: MI_Interval = MI_Interval())

public data class MI_DatetimeA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_DatetimeAField(
    public var value: MI_DatetimeA = MI_DatetimeA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_DatetimeField(
    public var value: MI_Datetime = MI_Datetime(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Deserializer(public var reserved1: ULong = 0uL, public var reserved2: Long = 0L)

public data class MI_DeserializerFT(
    public var Close: Long = 0L,
    public var DeserializeClass: Long = 0L,
    public var Class_GetClassName: Long = 0L,
    public var Class_GetParentClassName: Long = 0L,
    public var DeserializeInstance: Long = 0L,
    public var Instance_GetClassName: Long = 0L,
)

public data class MI_DestinationOptions(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_DestinationOptionsFT(
    public var Delete: Long = 0L,
    public var SetString: Long = 0L,
    public var SetNumber: Long = 0L,
    public var AddCredentials: Long = 0L,
    public var GetString: Long = 0L,
    public var GetNumber: Long = 0L,
    public var GetOptionCount: Long = 0L,
    public var GetOptionAt: Long = 0L,
    public var GetOption: Long = 0L,
    public var GetCredentialsCount: Long = 0L,
    public var GetCredentialsAt: Long = 0L,
    public var GetCredentialsPasswordAt: Long = 0L,
    public var Clone: Long = 0L,
    public var SetInterval: Long = 0L,
    public var GetInterval: Long = 0L,
)

public data class MI_FeatureDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: Long = 0L,
    public var qualifiers: Long = 0L,
    public var numQualifiers: UInt = 0u,
)

public data class MI_Filter(public var ft: Long = 0L, public var reserved: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MI_Filter) return false
        if (this.ft != other.ft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class MI_FilterFT(public var Evaluate: Long = 0L, public var GetExpression: Long = 0L)

public data class MI_HostedProvider(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_HostedProviderFT(public var Close: Long = 0L, public var GetApplication: Long = 0L)

public data class MI_Instance(
    public var ft: Long = 0L,
    public var classDecl: Long = 0L,
    public var serverName: Long = 0L,
    public var nameSpace: Long = 0L,
    public var reserved: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MI_Instance) return false
        if (this.ft != other.ft) return false
        if (this.classDecl != other.classDecl) return false
        if (this.serverName != other.serverName) return false
        if (this.nameSpace != other.nameSpace) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.classDecl.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.nameSpace.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class MI_InstanceA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_InstanceAField(
    public var value: MI_InstanceA = MI_InstanceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_InstanceExFT(public var parent: MI_InstanceFT = MI_InstanceFT(), public var Normalize: Long = 0L)

public class MI_InstanceFT(
    public var Clone: Long = 0L,
    public var Destruct: Long = 0L,
    public var Delete: Long = 0L,
    public var IsA: Long = 0L,
    public var GetClassNameA: Long = 0L,
    public var SetNameSpace: Long = 0L,
    public var GetNameSpace: Long = 0L,
    public var GetElementCount: Long = 0L,
    public var AddElement: Long = 0L,
    public var SetElement: Long = 0L,
    public var SetElementAt: Long = 0L,
    public var GetElement: Long = 0L,
    public var GetElementAt: Long = 0L,
    public var ClearElement: Long = 0L,
    public var ClearElementAt: Long = 0L,
    public var GetServerName: Long = 0L,
    public var SetServerName: Long = 0L,
    public var GetClass: Long = 0L,
)

public data class MI_InstanceField(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Interval(
    public var days: UInt = 0u,
    public var hours: UInt = 0u,
    public var minutes: UInt = 0u,
    public var seconds: UInt = 0u,
    public var microseconds: UInt = 0u,
    public var __padding1: UInt = 0u,
    public var __padding2: UInt = 0u,
    public var __padding3: UInt = 0u,
)

public data class MI_MethodDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: Long = 0L,
    public var qualifiers: Long = 0L,
    public var numQualifiers: UInt = 0u,
    public var parameters: Long = 0L,
    public var numParameters: UInt = 0u,
    public var size: UInt = 0u,
    public var returnType: UInt = 0u,
    public var origin: Long = 0L,
    public var propagator: Long = 0L,
    public var schema: Long = 0L,
    public var function: MI_MethodDecl_Invoke = null,
)

public data class MI_Module(
    public var version: UInt = 0u,
    public var generatorVersion: UInt = 0u,
    public var flags: UInt = 0u,
    public var charSize: UInt = 0u,
    public var schemaDecl: Long = 0L,
    public var Load: MI_Module_Load = null,
    public var Unload: MI_Module_Unload = null,
    public var dynamicProviderFT: Long = 0L,
)

public data class MI_ObjectDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: Long = 0L,
    public var qualifiers: Long = 0L,
    public var numQualifiers: UInt = 0u,
    public var properties: Long = 0L,
    public var numProperties: UInt = 0u,
    public var size: UInt = 0u,
)

public data class MI_Operation(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_OperationCallbacks(
    public var callbackContext: Long = 0L,
    public var promptUser: MI_OperationCallback_PromptUser = null,
    public var writeError: MI_OperationCallback_WriteError = null,
    public var writeMessage: MI_OperationCallback_WriteMessage = null,
    public var writeProgress: MI_OperationCallback_WriteProgress = null,
    public var instanceResult: MI_OperationCallback_Instance = null,
    public var indicationResult: MI_OperationCallback_Indication = null,
    public var classResult: MI_OperationCallback_Class = null,
    public var streamedParameterResult: MI_OperationCallback_StreamedParameter = null,
)

public data class MI_OperationFT(
    public var Close: Long = 0L,
    public var Cancel: Long = 0L,
    public var GetSession: Long = 0L,
    public var GetInstance: Long = 0L,
    public var GetIndication: Long = 0L,
    public var GetClass: Long = 0L,
)

public data class MI_OperationOptions(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_OperationOptionsFT(
    public var Delete: Long = 0L,
    public var SetString: Long = 0L,
    public var SetNumber: Long = 0L,
    public var SetCustomOption: Long = 0L,
    public var GetString: Long = 0L,
    public var GetNumber: Long = 0L,
    public var GetOptionCount: Long = 0L,
    public var GetOptionAt: Long = 0L,
    public var GetOption: Long = 0L,
    public var GetEnabledChannels: Long = 0L,
    public var Clone: Long = 0L,
    public var SetInterval: Long = 0L,
    public var GetInterval: Long = 0L,
)

public data class MI_ParameterDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: Long = 0L,
    public var qualifiers: Long = 0L,
    public var numQualifiers: UInt = 0u,
    public var type: UInt = 0u,
    public var className: Long = 0L,
    public var subscript: UInt = 0u,
    public var offset: UInt = 0u,
)

public data class MI_ParameterSet(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_ParameterSetFT(
    public var GetMethodReturnType: Long = 0L,
    public var GetParameterCount: Long = 0L,
    public var GetParameterAt: Long = 0L,
    public var GetParameter: Long = 0L,
)

public data class MI_PropertyDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: Long = 0L,
    public var qualifiers: Long = 0L,
    public var numQualifiers: UInt = 0u,
    public var type: UInt = 0u,
    public var className: Long = 0L,
    public var subscript: UInt = 0u,
    public var offset: UInt = 0u,
    public var origin: Long = 0L,
    public var propagator: Long = 0L,
    public var value: Long = 0L,
)

public data class MI_PropertySet(public var ft: Long = 0L, public var reserved: LongArray = LongArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MI_PropertySet) return false
        if (this.ft != other.ft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class MI_PropertySetFT(
    public var GetElementCount: Long = 0L,
    public var ContainsElement: Long = 0L,
    public var AddElement: Long = 0L,
    public var GetElementAt: Long = 0L,
    public var Clear: Long = 0L,
    public var Destruct: Long = 0L,
    public var Delete: Long = 0L,
    public var Clone: Long = 0L,
)

public data class MI_ProviderFT(
    public var Load: MI_ProviderFT_Load = null,
    public var Unload: MI_ProviderFT_Unload = null,
    public var GetInstance: MI_ProviderFT_GetInstance = null,
    public var EnumerateInstances: MI_ProviderFT_EnumerateInstances = null,
    public var CreateInstance: MI_ProviderFT_CreateInstance = null,
    public var ModifyInstance: MI_ProviderFT_ModifyInstance = null,
    public var DeleteInstance: MI_ProviderFT_DeleteInstance = null,
    public var AssociatorInstances: MI_ProviderFT_AssociatorInstances = null,
    public var ReferenceInstances: MI_ProviderFT_ReferenceInstances = null,
    public var EnableIndications: MI_ProviderFT_EnableIndications = null,
    public var DisableIndications: MI_ProviderFT_DisableIndications = null,
    public var Subscribe: MI_ProviderFT_Subscribe = null,
    public var Unsubscribe: MI_ProviderFT_Unsubscribe = null,
    public var Invoke: MI_ProviderFT_Invoke = null,
)

public data class MI_Qualifier(
    public var name: Long = 0L,
    public var type: UInt = 0u,
    public var flavor: UInt = 0u,
    public var value: Long = 0L,
)

public data class MI_QualifierDecl(
    public var name: Long = 0L,
    public var type: UInt = 0u,
    public var scope: UInt = 0u,
    public var flavor: UInt = 0u,
    public var subscript: UInt = 0u,
    public var value: Long = 0L,
)

public data class MI_QualifierSet(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_QualifierSetFT(
    public var GetQualifierCount: Long = 0L,
    public var GetQualifierAt: Long = 0L,
    public var GetQualifier: Long = 0L,
)

public data class MI_Real32A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Real32AField(
    public var value: MI_Real32A = MI_Real32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Real32Field(
    public var value: Float = 0.0f,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Real64A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Real64AField(
    public var value: MI_Real64A = MI_Real64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Real64Field(
    public var value: Double = 0.0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ReferenceA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_ReferenceAField(
    public var value: MI_ReferenceA = MI_ReferenceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_ReferenceField(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_SchemaDecl(
    public var qualifierDecls: Long = 0L,
    public var numQualifierDecls: UInt = 0u,
    public var classDecls: Long = 0L,
    public var numClassDecls: UInt = 0u,
)

public data class MI_Serializer(public var reserved1: ULong = 0uL, public var reserved2: Long = 0L)

public data class MI_SerializerFT(
    public var Close: Long = 0L,
    public var SerializeClass: Long = 0L,
    public var SerializeInstance: Long = 0L,
)

public data class MI_Server(
    public var serverFT: Long = 0L,
    public var contextFT: Long = 0L,
    public var instanceFT: Long = 0L,
    public var propertySetFT: Long = 0L,
    public var filterFT: Long = 0L,
)

public data class MI_ServerFT(public var GetVersion: Long = 0L, public var GetSystemName: Long = 0L)

public data class MI_Session(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public data class MI_SessionCallbacks(
    public var callbackContext: Long = 0L,
    public var writeMessage: Long = 0L,
    public var writeError: Long = 0L,
)

public data class MI_SessionFT(
    public var Close: Long = 0L,
    public var GetApplication: Long = 0L,
    public var GetInstance: Long = 0L,
    public var ModifyInstance: Long = 0L,
    public var CreateInstance: Long = 0L,
    public var DeleteInstance: Long = 0L,
    public var Invoke: Long = 0L,
    public var EnumerateInstances: Long = 0L,
    public var QueryInstances: Long = 0L,
    public var AssociatorInstances: Long = 0L,
    public var ReferenceInstances: Long = 0L,
    public var Subscribe: Long = 0L,
    public var GetClass: Long = 0L,
    public var EnumerateClasses: Long = 0L,
    public var TestConnection: Long = 0L,
)

public data class MI_Sint16A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Sint16AField(
    public var value: MI_Sint16A = MI_Sint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint16Field(
    public var value: Short = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint32A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Sint32AField(
    public var value: MI_Sint32A = MI_Sint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint32Field(
    public var value: Int = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint64A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Sint64AField(
    public var value: MI_Sint64A = MI_Sint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint64Field(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint8A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Sint8AField(
    public var value: MI_Sint8A = MI_Sint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Sint8Field(
    public var value: Byte = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_StringA(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_StringAField(
    public var value: MI_StringA = MI_StringA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_StringField(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_SubscriptionDeliveryOptions(
    public var reserved1: ULong = 0uL,
    public var reserved2: Long = 0L,
    public var ft: Long = 0L,
)

public class MI_SubscriptionDeliveryOptionsFT(
    public var SetString: Long = 0L,
    public var SetNumber: Long = 0L,
    public var SetDateTime: Long = 0L,
    public var SetInterval: Long = 0L,
    public var AddCredentials: Long = 0L,
    public var Delete: Long = 0L,
    public var GetString: Long = 0L,
    public var GetNumber: Long = 0L,
    public var GetDateTime: Long = 0L,
    public var GetInterval: Long = 0L,
    public var GetOptionCount: Long = 0L,
    public var GetOptionAt: Long = 0L,
    public var GetOption: Long = 0L,
    public var GetCredentialsCount: Long = 0L,
    public var GetCredentialsAt: Long = 0L,
    public var GetCredentialsPasswordAt: Long = 0L,
    public var Clone: Long = 0L,
)

public data class MI_Timestamp(
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var microseconds: UInt = 0u,
    public var utc: Int = 0,
)

public data class MI_Uint16A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Uint16AField(
    public var value: MI_Uint16A = MI_Uint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint32A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Uint32AField(
    public var value: MI_Uint32A = MI_Uint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint32Field(
    public var value: UInt = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint64A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Uint64AField(
    public var value: MI_Uint64A = MI_Uint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint64Field(
    public var value: ULong = 0uL,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint8A(public var data: Long = 0L, public var size: UInt = 0u)

public data class MI_Uint8AField(
    public var value: MI_Uint8A = MI_Uint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_Uint8Field(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MI_UserCredentials(public var authenticationType: Long = 0L, public var credentials: MI_UserCredentials_0 = MI_UserCredentials_0())

public data class MI_UserCredentials_0(public var usernamePassword: MI_UsernamePasswordCreds = MI_UsernamePasswordCreds(), public var certificateThumbprint: Long = 0L)

public data class MI_UsernamePasswordCreds(
    public var domain: Long = 0L,
    public var username: Long = 0L,
    public var password: Long = 0L,
)

public data class MI_UtilitiesFT(public var MapErrorToMiErrorCategory: Long = 0L, public var CimErrorFromErrorCode: Long = 0L)

public class MI_Value(
    public var boolean: UByte = 0u,
    public var uint8: UByte = 0u,
    public var sint8: Byte = 0,
    public var uint16: UShort = 0u,
    public var sint16: Short = 0,
    public var uint32: UInt = 0u,
    public var sint32: Int = 0,
    public var uint64: ULong = 0uL,
    public var sint64: Long = 0L,
    public var real32: Float = 0.0f,
    public var real64: Double = 0.0,
    public var char16: UShort = 0u,
    public var datetime: MI_Datetime = MI_Datetime(),
    public var string: Long = 0L,
    public var instance: Long = 0L,
    public var reference: Long = 0L,
    public var booleana: MI_BooleanA = MI_BooleanA(),
    public var uint8a: MI_Uint8A = MI_Uint8A(),
    public var sint8a: MI_Sint8A = MI_Sint8A(),
    public var uint16a: MI_Uint16A = MI_Uint16A(),
    public var sint16a: MI_Sint16A = MI_Sint16A(),
    public var uint32a: MI_Uint32A = MI_Uint32A(),
    public var sint32a: MI_Sint32A = MI_Sint32A(),
    public var uint64a: MI_Uint64A = MI_Uint64A(),
    public var sint64a: MI_Sint64A = MI_Sint64A(),
    public var real32a: MI_Real32A = MI_Real32A(),
    public var real64a: MI_Real64A = MI_Real64A(),
    public var char16a: MI_Char16A = MI_Char16A(),
    public var datetimea: MI_DatetimeA = MI_DatetimeA(),
    public var stringa: MI_StringA = MI_StringA(),
    public var referencea: MI_ReferenceA = MI_ReferenceA(),
    public var instancea: MI_InstanceA = MI_InstanceA(),
    public var array: MI_Array = MI_Array(),
)

public data class SWbemAnalysisMatrix(
    public var m_uVersion: UInt = 0u,
    public var m_uMatrixType: UInt = 0u,
    public var m_pszProperty: PCWSTR = 0L,
    public var m_uPropertyType: UInt = 0u,
    public var m_uEntries: UInt = 0u,
    public var m_pValues: Long = 0L,
    public var m_pbTruthTable: Long = 0L,
)

public data class SWbemAnalysisMatrixList(
    public var m_uVersion: UInt = 0u,
    public var m_uMatrixType: UInt = 0u,
    public var m_uNumMatrices: UInt = 0u,
    public var m_pMatrices: Long = 0L,
)

public data class SWbemAssocQueryInf(
    public var m_uVersion: UInt = 0u,
    public var m_uAnalysisType: UInt = 0u,
    public var m_uFeatureMask: UInt = 0u,
    public var m_pPath: Long = 0L,
    public var m_pszPath: PWSTR = 0L,
    public var m_pszQueryText: PWSTR = 0L,
    public var m_pszResultClass: PWSTR = 0L,
    public var m_pszAssocClass: PWSTR = 0L,
    public var m_pszRole: PWSTR = 0L,
    public var m_pszResultRole: PWSTR = 0L,
    public var m_pszRequiredQualifier: PWSTR = 0L,
    public var m_pszRequiredAssocQualifier: PWSTR = 0L,
)

public data class SWbemQueryQualifiedName(
    public var m_uVersion: UInt = 0u,
    public var m_uTokenType: UInt = 0u,
    public var m_uNameListSize: UInt = 0u,
    public var m_ppszNameList: Long = 0L,
    public var m_bArraysUsed: BOOL = 0,
    public var m_pbArrayElUsed: Long = 0L,
    public var m_puArrayIndex: Long = 0L,
)

public data class SWbemRpnConst(
    public var m_pszStrVal: PCWSTR = 0L,
    public var m_bBoolVal: BOOL = 0,
    public var m_lLongVal: Int = 0,
    public var m_uLongVal: UInt = 0u,
    public var m_dblVal: Double = 0.0,
    public var m_lVal64: Long = 0L,
    public var m_uVal64: Long = 0L,
)

public class SWbemRpnEncodedQuery(
    public var m_uVersion: UInt = 0u,
    public var m_uTokenType: UInt = 0u,
    public var m_uParsedFeatureMask: ULong = 0uL,
    public var m_uDetectedArraySize: UInt = 0u,
    public var m_puDetectedFeatures: Long = 0L,
    public var m_uSelectListSize: UInt = 0u,
    public var m_ppSelectList: Long = 0L,
    public var m_uFromTargetType: UInt = 0u,
    public var m_pszOptionalFromPath: PCWSTR = 0L,
    public var m_uFromListSize: UInt = 0u,
    public var m_ppszFromList: Long = 0L,
    public var m_uWhereClauseSize: UInt = 0u,
    public var m_ppRpnWhereClause: Long = 0L,
    public var m_dblWithinPolling: Double = 0.0,
    public var m_dblWithinWindow: Double = 0.0,
    public var m_uOrderByListSize: UInt = 0u,
    public var m_ppszOrderByList: Long = 0L,
    public var m_uOrderDirectionEl: Long = 0L,
)

public data class SWbemRpnQueryToken(
    public var m_uVersion: UInt = 0u,
    public var m_uTokenType: UInt = 0u,
    public var m_uSubexpressionShape: UInt = 0u,
    public var m_uOperator: UInt = 0u,
    public var m_pRightIdent: Long = 0L,
    public var m_pLeftIdent: Long = 0L,
    public var m_uConstApparentType: UInt = 0u,
    public var m_Const: SWbemRpnConst = SWbemRpnConst(),
    public var m_uConst2ApparentType: UInt = 0u,
    public var m_Const2: SWbemRpnConst = SWbemRpnConst(),
    public var m_pszRightFunc: PCWSTR = 0L,
    public var m_pszLeftFunc: PCWSTR = 0L,
)

public data class SWbemRpnTokenList(
    public var m_uVersion: UInt = 0u,
    public var m_uTokenType: UInt = 0u,
    public var m_uNumTokens: UInt = 0u,
)

public data class WBEM_COMPILE_STATUS_INFO(
    public var lPhaseError: Int = 0,
    public var hRes: HRESULT = 0,
    public var ObjectNum: Int = 0,
    public var FirstLine: Int = 0,
    public var LastLine: Int = 0,
    public var dwOutFlags: UInt = 0u,
)

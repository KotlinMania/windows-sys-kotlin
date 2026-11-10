package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class MiApplication(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiApplicationFt? = null,
)

public data class MiApplicationFt(
    public var close: Int = 0,
    public var newSession: Int = 0,
    public var newHostedProvider: Int = 0,
    public var newInstance: Int = 0,
    public var newDestinationOptions: Int = 0,
    public var newOperationOptions: Int = 0,
    public var newSubscriptionDeliveryOptions: Int = 0,
    public var newSerializer: Int = 0,
    public var newDeserializer: Int = 0,
    public var newInstanceFromClass: Int = 0,
    public var newClass: Int = 0,
)

public data class MiArray(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiArrayField(
    public var value: MiArray = MiArray(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiBooleanA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiBooleanAfield(
    public var value: MiBooleanA = MiBooleanA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiBooleanField(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiChar16A(public var data: UShort? = null, public var size: UInt = 0u)

public data class MiChar16Afield(
    public var value: MiChar16A = MiChar16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiChar16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiClass(
    public var ft: MiClassFt? = null,
    public var classDecl: MiClassDecl? = null,
    public var namespaceName: UShort? = null,
    public var serverName: UShort? = null,
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiClass) return false
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

public data class MiClassDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: UShort? = null,
    public var qualifiers: COpaquePointer? = null,
    public var numQualifiers: UInt = 0u,
    public var properties: COpaquePointer? = null,
    public var numProperties: UInt = 0u,
    public var size: UInt = 0u,
    public var superClass: UShort? = null,
    public var superClassDecl: MiClassDecl? = null,
    public var methods: COpaquePointer? = null,
    public var numMethods: UInt = 0u,
    public var schema: MiSchemaDecl? = null,
    public var providerFT: MiProviderFt? = null,
    public var owningClass: MiClass? = null,
)

public data class MiClassFt(
    public var getClassNameA: Int = 0,
    public var getNameSpace: Int = 0,
    public var getServerName: Int = 0,
    public var getElementCount: Int = 0,
    public var getElement: Int = 0,
    public var getElementAt: Int = 0,
    public var getClassQualifierSet: Int = 0,
    public var getMethodCount: Int = 0,
    public var getMethodAt: Int = 0,
    public var getMethod: Int = 0,
    public var getParentClassName: Int = 0,
    public var getParentClass: Int = 0,
    public var delete: Int = 0,
    public var clone: Int = 0,
)

public data class MiClientFtV1(
    public var applicationFT: MiApplicationFt? = null,
    public var sessionFT: MiSessionFt? = null,
    public var operationFT: MiOperationFt? = null,
    public var hostedProviderFT: MiHostedProviderFt? = null,
    public var serializerFT: MiSerializerFt? = null,
    public var deserializerFT: MiDeserializerFt? = null,
    public var subscribeDeliveryOptionsFT: MiSubscriptionDeliveryOptionsFt? = null,
    public var destinationOptionsFT: MiDestinationOptionsFt? = null,
    public var operationOptionsFT: MiOperationOptionsFt? = null,
    public var utilitiesFT: MiUtilitiesFt? = null,
)

public data class MiConstBooleanA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiConstBooleanAfield(
    public var value: MiConstBooleanA = MiConstBooleanA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstBooleanField(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstChar16A(public var data: UShort? = null, public var size: UInt = 0u)

public data class MiConstChar16Afield(
    public var value: MiConstChar16A = MiConstChar16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstChar16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstDatetimeA(public var data: MiDatetime? = null, public var size: UInt = 0u)

public data class MiConstDatetimeAfield(
    public var value: MiConstDatetimeA = MiConstDatetimeA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstDatetimeField(
    public var value: MiDatetime = MiDatetime(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstInstanceA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiConstInstanceAfield(
    public var value: MiConstInstanceA = MiConstInstanceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstInstanceField(
    public var value: MiInstance? = null,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstReal32A(public var data: Float? = null, public var size: UInt = 0u)

public data class MiConstReal32Afield(
    public var value: MiConstReal32A = MiConstReal32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstReal32Field(
    public var value: Float = 0.0f,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstReal64A(public var data: Double? = null, public var size: UInt = 0u)

public data class MiConstReal64Afield(
    public var value: MiConstReal64A = MiConstReal64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstReal64Field(
    public var value: Double = 0.0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstReferenceA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiConstReferenceAfield(
    public var value: MiConstReferenceA = MiConstReferenceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstReferenceField(
    public var value: MiInstance? = null,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint16A(public var data: Short? = null, public var size: UInt = 0u)

public data class MiConstSint16Afield(
    public var value: MiConstSint16A = MiConstSint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint16Field(
    public var value: Short = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint32A(public var data: Int? = null, public var size: UInt = 0u)

public data class MiConstSint32Afield(
    public var value: MiConstSint32A = MiConstSint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint32Field(
    public var value: Int = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint64A(public var data: Long? = null, public var size: UInt = 0u)

public data class MiConstSint64Afield(
    public var value: MiConstSint64A = MiConstSint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint64Field(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint8A(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiConstSint8Afield(
    public var value: MiConstSint8A = MiConstSint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstSint8Field(
    public var value: Byte = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstStringA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiConstStringAfield(
    public var value: MiConstStringA = MiConstStringA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstStringField(
    public var value: UShort? = null,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint16A(public var data: UShort? = null, public var size: UInt = 0u)

public data class MiConstUint16Afield(
    public var value: MiConstUint16A = MiConstUint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint32A(public var data: UInt? = null, public var size: UInt = 0u)

public data class MiConstUint32Afield(
    public var value: MiConstUint32A = MiConstUint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint32Field(
    public var value: UInt = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint64A(public var data: ULong? = null, public var size: UInt = 0u)

public data class MiConstUint64Afield(
    public var value: MiConstUint64A = MiConstUint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint64Field(
    public var value: ULong = 0uL,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint8A(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiConstUint8Afield(
    public var value: MiConstUint8A = MiConstUint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiConstUint8Field(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiContext(public var ft: MiContextFt? = null, public var reserved: IntArray = IntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiContext) return false
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

public class MiContextFt(
    public var postResult: Int = 0,
    public var postInstance: Int = 0,
    public var postIndication: Int = 0,
    public var constructInstance: Int = 0,
    public var constructParameters: Int = 0,
    public var newInstance: Int = 0,
    public var newDynamicInstance: Int = 0,
    public var newParameters: Int = 0,
    public var canceled: Int = 0,
    public var getLocale: Int = 0,
    public var registerCancel: Int = 0,
    public var requestUnload: Int = 0,
    public var refuseUnload: Int = 0,
    public var getLocalSession: Int = 0,
    public var setStringOption: Int = 0,
    public var getStringOption: Int = 0,
    public var getNumberOption: Int = 0,
    public var getCustomOption: Int = 0,
    public var getCustomOptionCount: Int = 0,
    public var getCustomOptionAt: Int = 0,
    public var writeMessage: Int = 0,
    public var writeProgress: Int = 0,
    public var writeStreamParameter: Int = 0,
    public var writeCimError: Int = 0,
    public var promptUser: Int = 0,
    public var shouldProcess: Int = 0,
    public var shouldContinue: Int = 0,
    public var postError: Int = 0,
    public var postCimError: Int = 0,
    public var writeError: Int = 0,
)

public data class MiDatetime(public var isTimestamp: UInt = 0u, public var u: MiDatetime0 = MiDatetime0())

public data class MiDatetime0(public var timestamp: MiTimestamp = MiTimestamp(), public var interval: MiInterval = MiInterval())

public data class MiDatetimeA(public var data: MiDatetime? = null, public var size: UInt = 0u)

public data class MiDatetimeAfield(
    public var value: MiDatetimeA = MiDatetimeA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiDatetimeField(
    public var value: MiDatetime = MiDatetime(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiDeserializer(public var reserved1: ULong = 0uL, public var reserved2: Int = 0)

public data class MiDeserializerFt(
    public var close: Int = 0,
    public var deserializeClass: Int = 0,
    public var classGetClassName: Int = 0,
    public var classGetParentClassName: Int = 0,
    public var deserializeInstance: Int = 0,
    public var instanceGetClassName: Int = 0,
)

public data class MiDestinationOptions(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiDestinationOptionsFt? = null,
)

public data class MiDestinationOptionsFt(
    public var delete: Int = 0,
    public var setString: Int = 0,
    public var setNumber: Int = 0,
    public var addCredentials: Int = 0,
    public var getString: Int = 0,
    public var getNumber: Int = 0,
    public var getOptionCount: Int = 0,
    public var getOptionAt: Int = 0,
    public var getOption: Int = 0,
    public var getCredentialsCount: Int = 0,
    public var getCredentialsAt: Int = 0,
    public var getCredentialsPasswordAt: Int = 0,
    public var clone: Int = 0,
    public var setInterval: Int = 0,
    public var getInterval: Int = 0,
)

public data class MiFeatureDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: UShort? = null,
    public var qualifiers: COpaquePointer? = null,
    public var numQualifiers: UInt = 0u,
)

public data class MiFilter(public var ft: MiFilterFt? = null, public var reserved: IntArray = IntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiFilter) return false
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

public data class MiFilterFt(public var evaluate: Int = 0, public var getExpression: Int = 0)

public data class MiHostedProvider(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiHostedProviderFt? = null,
)

public data class MiHostedProviderFt(public var close: Int = 0, public var getApplication: Int = 0)

public data class MiInstance(
    public var ft: MiInstanceFt? = null,
    public var classDecl: MiClassDecl? = null,
    public var serverName: UShort? = null,
    public var nameSpace: UShort? = null,
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiInstance) return false
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

public data class MiInstanceA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiInstanceAfield(
    public var value: MiInstanceA = MiInstanceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiInstanceExFt(public var parent: MiInstanceFt = MiInstanceFt(), public var normalize: Int = 0)

public class MiInstanceFt(
    public var clone: Int = 0,
    public var destruct: Int = 0,
    public var delete: Int = 0,
    public var isA: Int = 0,
    public var getClassNameA: Int = 0,
    public var setNameSpace: Int = 0,
    public var getNameSpace: Int = 0,
    public var getElementCount: Int = 0,
    public var addElement: Int = 0,
    public var setElement: Int = 0,
    public var setElementAt: Int = 0,
    public var getElement: Int = 0,
    public var getElementAt: Int = 0,
    public var clearElement: Int = 0,
    public var clearElementAt: Int = 0,
    public var getServerName: Int = 0,
    public var setServerName: Int = 0,
    public var getClass: Int = 0,
)

public data class MiInstanceField(
    public var value: MiInstance? = null,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiInterval(
    public var days: UInt = 0u,
    public var hours: UInt = 0u,
    public var minutes: UInt = 0u,
    public var seconds: UInt = 0u,
    public var microseconds: UInt = 0u,
    public var padding1: UInt = 0u,
    public var padding2: UInt = 0u,
    public var padding3: UInt = 0u,
)

public data class MiMethodDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: UShort? = null,
    public var qualifiers: COpaquePointer? = null,
    public var numQualifiers: UInt = 0u,
    public var parameters: COpaquePointer? = null,
    public var numParameters: UInt = 0u,
    public var size: UInt = 0u,
    public var returnType: UInt = 0u,
    public var origin: UShort? = null,
    public var propagator: UShort? = null,
    public var schema: MiSchemaDecl? = null,
    public var function: MiMethodDeclInvoke = null,
)

public data class MiModule(
    public var version: UInt = 0u,
    public var generatorVersion: UInt = 0u,
    public var flags: UInt = 0u,
    public var charSize: UInt = 0u,
    public var schemaDecl: MiSchemaDecl? = null,
    public var load: MiModuleLoad = null,
    public var unload: MiModuleUnload = null,
    public var dynamicProviderFT: MiProviderFt? = null,
)

public data class MiObjectDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: UShort? = null,
    public var qualifiers: COpaquePointer? = null,
    public var numQualifiers: UInt = 0u,
    public var properties: COpaquePointer? = null,
    public var numProperties: UInt = 0u,
    public var size: UInt = 0u,
)

public data class MiOperation(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiOperationFt? = null,
)

public data class MiOperationCallbacks(
    public var callbackContext: COpaquePointer? = null,
    public var promptUser: MiOperationCallbackPromptUser = null,
    public var writeError: MiOperationCallbackWriteError = null,
    public var writeMessage: MiOperationCallbackWriteMessage = null,
    public var writeProgress: MiOperationCallbackWriteProgress = null,
    public var instanceResult: MiOperationCallbackInstance = null,
    public var indicationResult: MiOperationCallbackIndication = null,
    public var classResult: MiOperationCallbackClass = null,
    public var streamedParameterResult: MiOperationCallbackStreamedParameter = null,
)

public data class MiOperationFt(
    public var close: Int = 0,
    public var cancel: Int = 0,
    public var getSession: Int = 0,
    public var getInstance: Int = 0,
    public var getIndication: Int = 0,
    public var getClass: Int = 0,
)

public data class MiOperationOptions(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiOperationOptionsFt? = null,
)

public data class MiOperationOptionsFt(
    public var delete: Int = 0,
    public var setString: Int = 0,
    public var setNumber: Int = 0,
    public var setCustomOption: Int = 0,
    public var getString: Int = 0,
    public var getNumber: Int = 0,
    public var getOptionCount: Int = 0,
    public var getOptionAt: Int = 0,
    public var getOption: Int = 0,
    public var getEnabledChannels: Int = 0,
    public var clone: Int = 0,
    public var setInterval: Int = 0,
    public var getInterval: Int = 0,
)

public data class MiParameterDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: UShort? = null,
    public var qualifiers: COpaquePointer? = null,
    public var numQualifiers: UInt = 0u,
    public var type: UInt = 0u,
    public var className: UShort? = null,
    public var subscript: UInt = 0u,
    public var offset: UInt = 0u,
)

public data class MiParameterSet(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiParameterSetFt? = null,
)

public data class MiParameterSetFt(
    public var getMethodReturnType: Int = 0,
    public var getParameterCount: Int = 0,
    public var getParameterAt: Int = 0,
    public var getParameter: Int = 0,
)

public data class MiPropertyDecl(
    public var flags: UInt = 0u,
    public var code: UInt = 0u,
    public var name: UShort? = null,
    public var qualifiers: COpaquePointer? = null,
    public var numQualifiers: UInt = 0u,
    public var type: UInt = 0u,
    public var className: UShort? = null,
    public var subscript: UInt = 0u,
    public var offset: UInt = 0u,
    public var origin: UShort? = null,
    public var propagator: UShort? = null,
    public var value: COpaquePointer? = null,
)

public data class MiPropertySet(public var ft: MiPropertySetFt? = null, public var reserved: IntArray = IntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MiPropertySet) return false
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

public data class MiPropertySetFt(
    public var getElementCount: Int = 0,
    public var containsElement: Int = 0,
    public var addElement: Int = 0,
    public var getElementAt: Int = 0,
    public var clear: Int = 0,
    public var destruct: Int = 0,
    public var delete: Int = 0,
    public var clone: Int = 0,
)

public data class MiProviderFt(
    public var load: MiProviderFtLoad = null,
    public var unload: MiProviderFtUnload = null,
    public var getInstance: MiProviderFtGetInstance = null,
    public var enumerateInstances: MiProviderFtEnumerateInstances = null,
    public var createInstance: MiProviderFtCreateInstance = null,
    public var modifyInstance: MiProviderFtModifyInstance = null,
    public var deleteInstance: MiProviderFtDeleteInstance = null,
    public var associatorInstances: MiProviderFtAssociatorInstances = null,
    public var referenceInstances: MiProviderFtReferenceInstances = null,
    public var enableIndications: MiProviderFtEnableIndications = null,
    public var disableIndications: MiProviderFtDisableIndications = null,
    public var subscribe: MiProviderFtSubscribe = null,
    public var unsubscribe: MiProviderFtUnsubscribe = null,
    public var invoke: MiProviderFtInvoke = null,
)

public data class MiQualifier(
    public var name: UShort? = null,
    public var type: UInt = 0u,
    public var flavor: UInt = 0u,
    public var value: COpaquePointer? = null,
)

public data class MiQualifierDecl(
    public var name: UShort? = null,
    public var type: UInt = 0u,
    public var scope: UInt = 0u,
    public var flavor: UInt = 0u,
    public var subscript: UInt = 0u,
    public var value: COpaquePointer? = null,
)

public data class MiQualifierSet(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiQualifierSetFt? = null,
)

public data class MiQualifierSetFt(
    public var getQualifierCount: Int = 0,
    public var getQualifierAt: Int = 0,
    public var getQualifier: Int = 0,
)

public data class MiReal32A(public var data: Float? = null, public var size: UInt = 0u)

public data class MiReal32Afield(
    public var value: MiReal32A = MiReal32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiReal32Field(
    public var value: Float = 0.0f,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiReal64A(public var data: Double? = null, public var size: UInt = 0u)

public data class MiReal64Afield(
    public var value: MiReal64A = MiReal64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiReal64Field(
    public var value: Double = 0.0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiReferenceA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiReferenceAfield(
    public var value: MiReferenceA = MiReferenceA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiReferenceField(
    public var value: MiInstance? = null,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSchemaDecl(
    public var qualifierDecls: COpaquePointer? = null,
    public var numQualifierDecls: UInt = 0u,
    public var classDecls: COpaquePointer? = null,
    public var numClassDecls: UInt = 0u,
)

public data class MiSerializer(public var reserved1: ULong = 0uL, public var reserved2: Int = 0)

public data class MiSerializerFt(
    public var close: Int = 0,
    public var serializeClass: Int = 0,
    public var serializeInstance: Int = 0,
)

public data class MiServer(
    public var serverFT: MiServerFt? = null,
    public var contextFT: MiContextFt? = null,
    public var instanceFT: MiInstanceFt? = null,
    public var propertySetFT: MiPropertySetFt? = null,
    public var filterFT: MiFilterFt? = null,
)

public data class MiServerFt(public var getVersion: Int = 0, public var getSystemName: Int = 0)

public data class MiSession(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiSessionFt? = null,
)

public data class MiSessionCallbacks(
    public var callbackContext: COpaquePointer? = null,
    public var writeMessage: Int = 0,
    public var writeError: Int = 0,
)

public data class MiSessionFt(
    public var close: Int = 0,
    public var getApplication: Int = 0,
    public var getInstance: Int = 0,
    public var modifyInstance: Int = 0,
    public var createInstance: Int = 0,
    public var deleteInstance: Int = 0,
    public var invoke: Int = 0,
    public var enumerateInstances: Int = 0,
    public var queryInstances: Int = 0,
    public var associatorInstances: Int = 0,
    public var referenceInstances: Int = 0,
    public var subscribe: Int = 0,
    public var getClass: Int = 0,
    public var enumerateClasses: Int = 0,
    public var testConnection: Int = 0,
)

public data class MiSint16A(public var data: Short? = null, public var size: UInt = 0u)

public data class MiSint16Afield(
    public var value: MiSint16A = MiSint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint16Field(
    public var value: Short = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint32A(public var data: Int? = null, public var size: UInt = 0u)

public data class MiSint32Afield(
    public var value: MiSint32A = MiSint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint32Field(
    public var value: Int = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint64A(public var data: Long? = null, public var size: UInt = 0u)

public data class MiSint64Afield(
    public var value: MiSint64A = MiSint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint64Field(
    public var value: Long = 0L,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint8A(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiSint8Afield(
    public var value: MiSint8A = MiSint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSint8Field(
    public var value: Byte = 0,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiStringA(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiStringAfield(
    public var value: MiStringA = MiStringA(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiStringField(
    public var value: UShort? = null,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiSubscriptionDeliveryOptions(
    public var reserved1: ULong = 0uL,
    public var reserved2: Int = 0,
    public var ft: MiSubscriptionDeliveryOptionsFt? = null,
)

public class MiSubscriptionDeliveryOptionsFt(
    public var setString: Int = 0,
    public var setNumber: Int = 0,
    public var setDateTime: Int = 0,
    public var setInterval: Int = 0,
    public var addCredentials: Int = 0,
    public var delete: Int = 0,
    public var getString: Int = 0,
    public var getNumber: Int = 0,
    public var getDateTime: Int = 0,
    public var getInterval: Int = 0,
    public var getOptionCount: Int = 0,
    public var getOptionAt: Int = 0,
    public var getOption: Int = 0,
    public var getCredentialsCount: Int = 0,
    public var getCredentialsAt: Int = 0,
    public var getCredentialsPasswordAt: Int = 0,
    public var clone: Int = 0,
)

public data class MiTimestamp(
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var microseconds: UInt = 0u,
    public var utc: Int = 0,
)

public data class MiUint16A(public var data: UShort? = null, public var size: UInt = 0u)

public data class MiUint16Afield(
    public var value: MiUint16A = MiUint16A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint16Field(
    public var value: UShort = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint32A(public var data: UInt? = null, public var size: UInt = 0u)

public data class MiUint32Afield(
    public var value: MiUint32A = MiUint32A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint32Field(
    public var value: UInt = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint64A(public var data: ULong? = null, public var size: UInt = 0u)

public data class MiUint64Afield(
    public var value: MiUint64A = MiUint64A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint64Field(
    public var value: ULong = 0uL,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint8A(public var data: COpaquePointer? = null, public var size: UInt = 0u)

public data class MiUint8Afield(
    public var value: MiUint8A = MiUint8A(),
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUint8Field(
    public var value: UByte = 0u,
    public var exists: UByte = 0u,
    public var flags: UByte = 0u,
)

public data class MiUserCredentials(public var authenticationType: UShort? = null, public var credentials: MiUserCredentials0 = MiUserCredentials0())

public data class MiUserCredentials0(public var usernamePassword: MiUsernamePasswordCreds = MiUsernamePasswordCreds(), public var certificateThumbprint: UShort? = null)

public data class MiUsernamePasswordCreds(
    public var domain: UShort? = null,
    public var username: UShort? = null,
    public var password: UShort? = null,
)

public data class MiUtilitiesFt(public var mapErrorToMiErrorCategory: Int = 0, public var cimErrorFromErrorCode: Int = 0)

public class MiValue(
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
    public var datetime: MiDatetime = MiDatetime(),
    public var string: UShort? = null,
    public var instance: MiInstance? = null,
    public var reference: MiInstance? = null,
    public var booleana: MiBooleanA = MiBooleanA(),
    public var uint8a: MiUint8A = MiUint8A(),
    public var sint8a: MiSint8A = MiSint8A(),
    public var uint16a: MiUint16A = MiUint16A(),
    public var sint16a: MiSint16A = MiSint16A(),
    public var uint32a: MiUint32A = MiUint32A(),
    public var sint32a: MiSint32A = MiSint32A(),
    public var uint64a: MiUint64A = MiUint64A(),
    public var sint64a: MiSint64A = MiSint64A(),
    public var real32a: MiReal32A = MiReal32A(),
    public var real64a: MiReal64A = MiReal64A(),
    public var char16a: MiChar16A = MiChar16A(),
    public var datetimea: MiDatetimeA = MiDatetimeA(),
    public var stringa: MiStringA = MiStringA(),
    public var referencea: MiReferenceA = MiReferenceA(),
    public var instancea: MiInstanceA = MiInstanceA(),
    public var array: MiArray = MiArray(),
)

public data class SWbemAnalysisMatrix(
    public var mUVersion: UInt = 0u,
    public var mUMatrixType: UInt = 0u,
    public var mPszProperty: Pcwstr = null,
    public var mUPropertyType: UInt = 0u,
    public var mUEntries: UInt = 0u,
    public var mPValues: COpaquePointer? = null,
    public var mPbTruthTable: Bool? = null,
)

public data class SWbemAnalysisMatrixList(
    public var mUVersion: UInt = 0u,
    public var mUMatrixType: UInt = 0u,
    public var mUNumMatrices: UInt = 0u,
    public var mPMatrices: SWbemAnalysisMatrix? = null,
)

public data class SWbemAssocQueryInf(
    public var mUVersion: UInt = 0u,
    public var mUAnalysisType: UInt = 0u,
    public var mUFeatureMask: UInt = 0u,
    public var mPPath: COpaquePointer? = null,
    public var mPszPath: Pwstr = null,
    public var mPszQueryText: Pwstr = null,
    public var mPszResultClass: Pwstr = null,
    public var mPszAssocClass: Pwstr = null,
    public var mPszRole: Pwstr = null,
    public var mPszResultRole: Pwstr = null,
    public var mPszRequiredQualifier: Pwstr = null,
    public var mPszRequiredAssocQualifier: Pwstr = null,
)

public data class SWbemQueryQualifiedName(
    public var mUVersion: UInt = 0u,
    public var mUTokenType: UInt = 0u,
    public var mUNameListSize: UInt = 0u,
    public var mPpszNameList: Pcwstr? = null,
    public var mBArraysUsed: Bool = 0,
    public var mPbArrayElUsed: Bool? = null,
    public var mPuArrayIndex: UInt? = null,
)

public data class SWbemRpnConst(
    public var mPszStrVal: Pcwstr = null,
    public var mBBoolVal: Bool = 0,
    public var mLLongVal: Int = 0,
    public var mULongVal: UInt = 0u,
    public var mDblVal: Double = 0.0,
    public var mLVal64: Long = 0L,
    public var mUVal64: Long = 0L,
)

public class SWbemRpnEncodedQuery(
    public var mUVersion: UInt = 0u,
    public var mUTokenType: UInt = 0u,
    public var mUParsedFeatureMask: ULong = 0uL,
    public var mUDetectedArraySize: UInt = 0u,
    public var mPuDetectedFeatures: UInt? = null,
    public var mUSelectListSize: UInt = 0u,
    public var mPpSelectList: COpaquePointer? = null,
    public var mUFromTargetType: UInt = 0u,
    public var mPszOptionalFromPath: Pcwstr = null,
    public var mUFromListSize: UInt = 0u,
    public var mPpszFromList: Pcwstr? = null,
    public var mUWhereClauseSize: UInt = 0u,
    public var mPpRpnWhereClause: COpaquePointer? = null,
    public var mDblWithinPolling: Double = 0.0,
    public var mDblWithinWindow: Double = 0.0,
    public var mUOrderByListSize: UInt = 0u,
    public var mPpszOrderByList: Pcwstr? = null,
    public var mUOrderDirectionEl: UInt? = null,
)

public data class SWbemRpnQueryToken(
    public var mUVersion: UInt = 0u,
    public var mUTokenType: UInt = 0u,
    public var mUSubexpressionShape: UInt = 0u,
    public var mUOperator: UInt = 0u,
    public var mPRightIdent: SWbemQueryQualifiedName? = null,
    public var mPLeftIdent: SWbemQueryQualifiedName? = null,
    public var mUConstApparentType: UInt = 0u,
    public var mConst: SWbemRpnConst = SWbemRpnConst(),
    public var mUConst2ApparentType: UInt = 0u,
    public var mConst2: SWbemRpnConst = SWbemRpnConst(),
    public var mPszRightFunc: Pcwstr = null,
    public var mPszLeftFunc: Pcwstr = null,
)

public data class SWbemRpnTokenList(
    public var mUVersion: UInt = 0u,
    public var mUTokenType: UInt = 0u,
    public var mUNumTokens: UInt = 0u,
)

public data class WbemCompileStatusInfo(
    public var lPhaseError: Int = 0,
    public var hRes: Hresult = 0,
    public var objectNum: Int = 0,
    public var firstLine: Int = 0,
    public var lastLine: Int = 0,
    public var dwOutFlags: UInt = 0u,
)

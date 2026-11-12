package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias CimtypeEnumeration = Int

public typealias MiCallbackMode = Int

public fun interface MiCancelCallbackFn {
    public operator fun invoke(reason: MiCancellationReason, callbackdata: ConstPtr<CVoid>)
}

public typealias MiCancelCallback = MiCancelCallbackFn?

public typealias MiCancellationReason = Int

public fun interface MiDeserializerClassObjectNeededFn {
    public operator fun invoke(context: ConstPtr<CVoid>, servername: ConstPtr<UShort>, namespacename: ConstPtr<UShort>, classname: ConstPtr<UShort>, requestedclassobject: MutPtr<MutPtr<MiClass>>): MiResult
}

public typealias MiDeserializerClassObjectNeeded = MiDeserializerClassObjectNeededFn?

public typealias MiDestinationOptionsImpersonationType = Int

public typealias MiErrorCategory = Int

public typealias MiLocaleType = Int

public fun interface MiMainFunctionFn {
    public operator fun invoke(server: MutPtr<MiServer>): MutPtr<MiModule>
}

public typealias MiMainFunction = MiMainFunctionFn?

public fun interface MiMethodDeclInvokeFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, methodname: ConstPtr<UShort>, instancename: ConstPtr<MiInstance>, parameters: ConstPtr<MiInstance>)
}

public typealias MiMethodDeclInvoke = MiMethodDeclInvokeFn?

public fun interface MiModuleLoadFn {
    public operator fun invoke(selfRef: MutPtr<MutPtr<MiModuleSelf>>, context: ConstPtr<MiContext>)
}

public typealias MiModuleLoad = MiModuleLoadFn?

public typealias MiModuleSelf = Long

public fun interface MiModuleUnloadFn {
    public operator fun invoke(selfRef: ConstPtr<MiModuleSelf>, context: ConstPtr<MiContext>)
}

public typealias MiModuleUnload = MiModuleUnloadFn?

public fun interface MiOperationCallbackClassFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, classresult: ConstPtr<MiClass>, moreresults: UByte, resultcode: MiResult, errorstring: ConstPtr<UShort>, errordetails: ConstPtr<MiInstance>, resultacknowledgement: Long)
}

public typealias MiOperationCallbackClass = MiOperationCallbackClassFn?

public fun interface MiOperationCallbackIndicationFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, instance: ConstPtr<MiInstance>, bookmark: ConstPtr<UShort>, machineid: ConstPtr<UShort>, moreresults: UByte, resultcode: MiResult, errorstring: ConstPtr<UShort>, errordetails: ConstPtr<MiInstance>, resultacknowledgement: Long)
}

public typealias MiOperationCallbackIndication = MiOperationCallbackIndicationFn?

public fun interface MiOperationCallbackInstanceFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, instance: ConstPtr<MiInstance>, moreresults: UByte, resultcode: MiResult, errorstring: ConstPtr<UShort>, errordetails: ConstPtr<MiInstance>, resultacknowledgement: Long)
}

public typealias MiOperationCallbackInstance = MiOperationCallbackInstanceFn?

public fun interface MiOperationCallbackPromptUserFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, message: ConstPtr<UShort>, prompttype: MiPromptType, promptuserresult: Long)
}

public typealias MiOperationCallbackPromptUser = MiOperationCallbackPromptUserFn?

public typealias MiOperationCallbackResponseType = Int

public fun interface MiOperationCallbackStreamedParameterFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, parametername: ConstPtr<UShort>, resulttype: MiType, result: ConstPtr<MiValue>, resultacknowledgement: Long)
}

public typealias MiOperationCallbackStreamedParameter = MiOperationCallbackStreamedParameterFn?

public fun interface MiOperationCallbackWriteErrorFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, instance: ConstPtr<MiInstance>, writeerrorresult: Long)
}

public typealias MiOperationCallbackWriteError = MiOperationCallbackWriteErrorFn?

public fun interface MiOperationCallbackWriteMessageFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, channel: UInt, message: ConstPtr<UShort>)
}

public typealias MiOperationCallbackWriteMessage = MiOperationCallbackWriteMessageFn?

public fun interface MiOperationCallbackWriteProgressFn {
    public operator fun invoke(operation: ConstPtr<MiOperation>, callbackcontext: ConstPtr<CVoid>, activity: ConstPtr<UShort>, currentoperation: ConstPtr<UShort>, statusdescription: ConstPtr<UShort>, percentagecomplete: UInt, secondsremaining: UInt)
}

public typealias MiOperationCallbackWriteProgress = MiOperationCallbackWriteProgressFn?

public typealias MiPromptType = Int

public typealias MiProviderArchitecture = Int

public fun interface MiProviderFtAssociatorInstancesFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, instancename: ConstPtr<MiInstance>, resultclass: ConstPtr<UShort>, role: ConstPtr<UShort>, resultrole: ConstPtr<UShort>, propertyset: ConstPtr<MiPropertySet>, keysonly: UByte, filter: ConstPtr<MiFilter>)
}

public typealias MiProviderFtAssociatorInstances = MiProviderFtAssociatorInstancesFn?

public fun interface MiProviderFtCreateInstanceFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, newinstance: ConstPtr<MiInstance>)
}

public typealias MiProviderFtCreateInstance = MiProviderFtCreateInstanceFn?

public fun interface MiProviderFtDeleteInstanceFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, instancename: ConstPtr<MiInstance>)
}

public typealias MiProviderFtDeleteInstance = MiProviderFtDeleteInstanceFn?

public fun interface MiProviderFtDisableIndicationsFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, indicationscontext: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>)
}

public typealias MiProviderFtDisableIndications = MiProviderFtDisableIndicationsFn?

public fun interface MiProviderFtEnableIndicationsFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, indicationscontext: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>)
}

public typealias MiProviderFtEnableIndications = MiProviderFtEnableIndicationsFn?

public fun interface MiProviderFtEnumerateInstancesFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, propertyset: ConstPtr<MiPropertySet>, keysonly: UByte, filter: ConstPtr<MiFilter>)
}

public typealias MiProviderFtEnumerateInstances = MiProviderFtEnumerateInstancesFn?

public fun interface MiProviderFtGetInstanceFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, instancename: ConstPtr<MiInstance>, propertyset: ConstPtr<MiPropertySet>)
}

public typealias MiProviderFtGetInstance = MiProviderFtGetInstanceFn?

public fun interface MiProviderFtInvokeFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, methodname: ConstPtr<UShort>, instancename: ConstPtr<MiInstance>, inputparameters: ConstPtr<MiInstance>)
}

public typealias MiProviderFtInvoke = MiProviderFtInvokeFn?

public fun interface MiProviderFtLoadFn {
    public operator fun invoke(selfRef: MutPtr<MutPtr<CVoid>>, selfmodule: ConstPtr<MiModuleSelf>, context: ConstPtr<MiContext>)
}

public typealias MiProviderFtLoad = MiProviderFtLoadFn?

public fun interface MiProviderFtModifyInstanceFn {
    public operator fun invoke(selfRef: MutPtr<CVoid>, context: MutPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, modifiedinstance: ConstPtr<MiInstance>, propertyset: ConstPtr<MiPropertySet>)
}

public typealias MiProviderFtModifyInstance = MiProviderFtModifyInstanceFn?

public fun interface MiProviderFtReferenceInstancesFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, instancename: ConstPtr<MiInstance>, role: ConstPtr<UShort>, propertyset: ConstPtr<MiPropertySet>, keysonly: UByte, filter: ConstPtr<MiFilter>)
}

public typealias MiProviderFtReferenceInstances = MiProviderFtReferenceInstancesFn?

public fun interface MiProviderFtSubscribeFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, filter: ConstPtr<MiFilter>, bookmark: ConstPtr<UShort>, subscriptionid: ULong, subscriptionself: MutPtr<MutPtr<CVoid>>)
}

public typealias MiProviderFtSubscribe = MiProviderFtSubscribeFn?

public fun interface MiProviderFtUnloadFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>)
}

public typealias MiProviderFtUnload = MiProviderFtUnloadFn?

public fun interface MiProviderFtUnsubscribeFn {
    public operator fun invoke(selfRef: ConstPtr<CVoid>, context: ConstPtr<MiContext>, namespace: ConstPtr<UShort>, classname: ConstPtr<UShort>, subscriptionid: ULong, subscriptionself: ConstPtr<CVoid>)
}

public typealias MiProviderFtUnsubscribe = MiProviderFtUnsubscribeFn?

public typealias MiResult = Int

public typealias MiSubscriptionDeliveryType = Int

public typealias MiType = Int

public typealias Wbemstatus = Int

public typealias WbemstatusFormat = Int

public typealias WbemBackupRestoreFlags = Int

public typealias WbemBatchType = Int

public typealias WbemChangeFlagType = Int

public typealias WbemComparisonFlag = Int

public typealias WbemCompilerOptions = Int

public typealias WbemConditionFlagType = Int

public typealias WbemConnectOptions = Int

public typealias WbemExtraReturnCodes = Int

public typealias WbemFlavorType = Int

public typealias WbemGenericFlagType = Int

public typealias WbemGenusType = Int

public typealias WbemGetKeyFlags = Int

public typealias WbemGetTextFlags = Int

public typealias WbemInformationFlagType = Int

public typealias WbemLimitationFlagType = Int

public typealias WbemLimits = Int

public typealias WbemLockingFlagType = Int

public typealias WbemLoginType = Int

public typealias WbemPathCreateFlag = Int

public typealias WbemPathStatusFlag = Int

public typealias WbemProviderFlags = Int

public typealias WbemProviderRequirementsType = Int

public typealias WbemQueryFlagType = Int

public typealias WbemRefresherFlags = Int

public typealias WbemSecurityFlags = Int

public typealias WbemShutdownFlags = Int

public typealias WbemStatusType = Int

public typealias WbemTextFlagType = Int

public typealias WbemUnsecappFlagType = Int

public typealias WmiqAnalysisType = Int

public typealias WmiqAssocqFlags = Int

public typealias WmiqLanguageFeatures = Int

public typealias WmiqRpnfFeature = Int

public typealias WmiqRpnTokenFlags = Int

public typealias WmiObjText = Int

public typealias WbemAuthenticationLevelEnum = Int

public typealias WbemChangeFlagEnum = Int

public typealias WbemCimtypeEnum = Int

public typealias WbemComparisonFlagEnum = Int

public typealias WbemConnectOptionsEnum = Int

public typealias WbemErrorEnum = Int

public typealias WbemFlagEnum = Int

public typealias WbemImpersonationLevelEnum = Int

public typealias WbemObjectTextFormatEnum = Int

public typealias WbemPrivilegeEnum = Int

public typealias WbemQueryFlagEnum = Int

public typealias WbemTextFlagEnum = Int

public typealias WbemTimeout = Int

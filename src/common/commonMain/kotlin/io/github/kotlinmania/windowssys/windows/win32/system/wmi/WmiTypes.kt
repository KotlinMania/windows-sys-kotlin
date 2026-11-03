package io.github.kotlinmania.windowssys.windows.win32.system.wmi

public typealias CIMTYPE_ENUMERATION = Int

public typealias MI_CallbackMode = Int

public fun interface MI_CancelCallbackFn {
    public operator fun invoke(reason: MI_CancellationReason, callbackdata: Long)
}

public typealias MI_CancelCallback = MI_CancelCallbackFn?

public typealias MI_CancellationReason = Int

public fun interface MI_Deserializer_ClassObjectNeededFn {
    public operator fun invoke(context: Long, servername: Long, namespacename: Long, classname: Long, requestedclassobject: Long): MI_Result
}

public typealias MI_Deserializer_ClassObjectNeeded = MI_Deserializer_ClassObjectNeededFn?

public typealias MI_DestinationOptions_ImpersonationType = Int

public typealias MI_ErrorCategory = Int

public typealias MI_LocaleType = Int

public fun interface MI_MainFunctionFn {
    public operator fun invoke(server: Long): Long
}

public typealias MI_MainFunction = MI_MainFunctionFn?

public fun interface MI_MethodDecl_InvokeFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, methodname: Long, instancename: Long, parameters: Long)
}

public typealias MI_MethodDecl_Invoke = MI_MethodDecl_InvokeFn?

public fun interface MI_Module_LoadFn {
    public operator fun invoke(self_: Long, context: Long)
}

public typealias MI_Module_Load = MI_Module_LoadFn?

public typealias MI_Module_Self = Long

public fun interface MI_Module_UnloadFn {
    public operator fun invoke(self_: Long, context: Long)
}

public typealias MI_Module_Unload = MI_Module_UnloadFn?

public fun interface MI_OperationCallback_ClassFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, classresult: Long, moreresults: UByte, resultcode: MI_Result, errorstring: Long, errordetails: Long, resultacknowledgement: Long)
}

public typealias MI_OperationCallback_Class = MI_OperationCallback_ClassFn?

public fun interface MI_OperationCallback_IndicationFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, instance: Long, bookmark: Long, machineid: Long, moreresults: UByte, resultcode: MI_Result, errorstring: Long, errordetails: Long, resultacknowledgement: Long)
}

public typealias MI_OperationCallback_Indication = MI_OperationCallback_IndicationFn?

public fun interface MI_OperationCallback_InstanceFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, instance: Long, moreresults: UByte, resultcode: MI_Result, errorstring: Long, errordetails: Long, resultacknowledgement: Long)
}

public typealias MI_OperationCallback_Instance = MI_OperationCallback_InstanceFn?

public fun interface MI_OperationCallback_PromptUserFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, message: Long, prompttype: MI_PromptType, promptuserresult: Long)
}

public typealias MI_OperationCallback_PromptUser = MI_OperationCallback_PromptUserFn?

public typealias MI_OperationCallback_ResponseType = Int

public fun interface MI_OperationCallback_StreamedParameterFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, parametername: Long, resulttype: MI_Type, result: Long, resultacknowledgement: Long)
}

public typealias MI_OperationCallback_StreamedParameter = MI_OperationCallback_StreamedParameterFn?

public fun interface MI_OperationCallback_WriteErrorFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, instance: Long, writeerrorresult: Long)
}

public typealias MI_OperationCallback_WriteError = MI_OperationCallback_WriteErrorFn?

public fun interface MI_OperationCallback_WriteMessageFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, channel: UInt, message: Long)
}

public typealias MI_OperationCallback_WriteMessage = MI_OperationCallback_WriteMessageFn?

public fun interface MI_OperationCallback_WriteProgressFn {
    public operator fun invoke(operation: Long, callbackcontext: Long, activity: Long, currentoperation: Long, statusdescription: Long, percentagecomplete: UInt, secondsremaining: UInt)
}

public typealias MI_OperationCallback_WriteProgress = MI_OperationCallback_WriteProgressFn?

public typealias MI_PromptType = Int

public typealias MI_ProviderArchitecture = Int

public fun interface MI_ProviderFT_AssociatorInstancesFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, instancename: Long, resultclass: Long, role: Long, resultrole: Long, propertyset: Long, keysonly: UByte, filter: Long)
}

public typealias MI_ProviderFT_AssociatorInstances = MI_ProviderFT_AssociatorInstancesFn?

public fun interface MI_ProviderFT_CreateInstanceFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, newinstance: Long)
}

public typealias MI_ProviderFT_CreateInstance = MI_ProviderFT_CreateInstanceFn?

public fun interface MI_ProviderFT_DeleteInstanceFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, instancename: Long)
}

public typealias MI_ProviderFT_DeleteInstance = MI_ProviderFT_DeleteInstanceFn?

public fun interface MI_ProviderFT_DisableIndicationsFn {
    public operator fun invoke(self_: Long, indicationscontext: Long, namespace: Long, classname: Long)
}

public typealias MI_ProviderFT_DisableIndications = MI_ProviderFT_DisableIndicationsFn?

public fun interface MI_ProviderFT_EnableIndicationsFn {
    public operator fun invoke(self_: Long, indicationscontext: Long, namespace: Long, classname: Long)
}

public typealias MI_ProviderFT_EnableIndications = MI_ProviderFT_EnableIndicationsFn?

public fun interface MI_ProviderFT_EnumerateInstancesFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, propertyset: Long, keysonly: UByte, filter: Long)
}

public typealias MI_ProviderFT_EnumerateInstances = MI_ProviderFT_EnumerateInstancesFn?

public fun interface MI_ProviderFT_GetInstanceFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, instancename: Long, propertyset: Long)
}

public typealias MI_ProviderFT_GetInstance = MI_ProviderFT_GetInstanceFn?

public fun interface MI_ProviderFT_InvokeFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, methodname: Long, instancename: Long, inputparameters: Long)
}

public typealias MI_ProviderFT_Invoke = MI_ProviderFT_InvokeFn?

public fun interface MI_ProviderFT_LoadFn {
    public operator fun invoke(self_: Long, selfmodule: Long, context: Long)
}

public typealias MI_ProviderFT_Load = MI_ProviderFT_LoadFn?

public fun interface MI_ProviderFT_ModifyInstanceFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, modifiedinstance: Long, propertyset: Long)
}

public typealias MI_ProviderFT_ModifyInstance = MI_ProviderFT_ModifyInstanceFn?

public fun interface MI_ProviderFT_ReferenceInstancesFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, instancename: Long, role: Long, propertyset: Long, keysonly: UByte, filter: Long)
}

public typealias MI_ProviderFT_ReferenceInstances = MI_ProviderFT_ReferenceInstancesFn?

public fun interface MI_ProviderFT_SubscribeFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, filter: Long, bookmark: Long, subscriptionid: ULong, subscriptionself: Long)
}

public typealias MI_ProviderFT_Subscribe = MI_ProviderFT_SubscribeFn?

public fun interface MI_ProviderFT_UnloadFn {
    public operator fun invoke(self_: Long, context: Long)
}

public typealias MI_ProviderFT_Unload = MI_ProviderFT_UnloadFn?

public fun interface MI_ProviderFT_UnsubscribeFn {
    public operator fun invoke(self_: Long, context: Long, namespace: Long, classname: Long, subscriptionid: ULong, subscriptionself: Long)
}

public typealias MI_ProviderFT_Unsubscribe = MI_ProviderFT_UnsubscribeFn?

public typealias MI_Result = Int

public typealias MI_SubscriptionDeliveryType = Int

public typealias MI_Type = Int

public typealias WBEMSTATUS = Int

public typealias WBEMSTATUS_FORMAT = Int

public typealias WBEM_BACKUP_RESTORE_FLAGS = Int

public typealias WBEM_BATCH_TYPE = Int

public typealias WBEM_CHANGE_FLAG_TYPE = Int

public typealias WBEM_COMPARISON_FLAG = Int

public typealias WBEM_COMPILER_OPTIONS = Int

public typealias WBEM_CONDITION_FLAG_TYPE = Int

public typealias WBEM_CONNECT_OPTIONS = Int

public typealias WBEM_EXTRA_RETURN_CODES = Int

public typealias WBEM_FLAVOR_TYPE = Int

public typealias WBEM_GENERIC_FLAG_TYPE = Int

public typealias WBEM_GENUS_TYPE = Int

public typealias WBEM_GET_KEY_FLAGS = Int

public typealias WBEM_GET_TEXT_FLAGS = Int

public typealias WBEM_INFORMATION_FLAG_TYPE = Int

public typealias WBEM_LIMITATION_FLAG_TYPE = Int

public typealias WBEM_LIMITS = Int

public typealias WBEM_LOCKING_FLAG_TYPE = Int

public typealias WBEM_LOGIN_TYPE = Int

public typealias WBEM_PATH_CREATE_FLAG = Int

public typealias WBEM_PATH_STATUS_FLAG = Int

public typealias WBEM_PROVIDER_FLAGS = Int

public typealias WBEM_PROVIDER_REQUIREMENTS_TYPE = Int

public typealias WBEM_QUERY_FLAG_TYPE = Int

public typealias WBEM_REFRESHER_FLAGS = Int

public typealias WBEM_SECURITY_FLAGS = Int

public typealias WBEM_SHUTDOWN_FLAGS = Int

public typealias WBEM_STATUS_TYPE = Int

public typealias WBEM_TEXT_FLAG_TYPE = Int

public typealias WBEM_UNSECAPP_FLAG_TYPE = Int

public typealias WMIQ_ANALYSIS_TYPE = Int

public typealias WMIQ_ASSOCQ_FLAGS = Int

public typealias WMIQ_LANGUAGE_FEATURES = Int

public typealias WMIQ_RPNF_FEATURE = Int

public typealias WMIQ_RPN_TOKEN_FLAGS = Int

public typealias WMI_OBJ_TEXT = Int

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

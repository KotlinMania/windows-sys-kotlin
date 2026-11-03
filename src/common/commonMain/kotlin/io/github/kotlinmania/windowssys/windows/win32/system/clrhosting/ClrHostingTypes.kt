package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.HRESULT

public typealias APPDOMAIN_SECURITY_FLAGS = Int

public typealias BucketParameterIndex = Int

public fun interface CLRCreateInstanceFnPtrFn {
    public operator fun invoke(clsid: Long, riid: Long, ppinterface: Long): HRESULT
}

public typealias CLRCreateInstanceFnPtr = CLRCreateInstanceFnPtrFn?

public typealias CLR_DEBUGGING_PROCESS_FLAGS = Int

public typealias CLSID_RESOLUTION_FLAGS = Int

public typealias COR_GC_STAT_TYPES = Int

public typealias COR_GC_THREAD_STATS_TYPES = Int

public fun interface CallbackThreadSetFnPtrFn {
    public operator fun invoke(): HRESULT
}

public typealias CallbackThreadSetFnPtr = CallbackThreadSetFnPtrFn?

public fun interface CallbackThreadUnsetFnPtrFn {
    public operator fun invoke(): HRESULT
}

public typealias CallbackThreadUnsetFnPtr = CallbackThreadUnsetFnPtrFn?

public fun interface CreateInterfaceFnPtrFn {
    public operator fun invoke(clsid: Long, riid: Long, ppinterface: Long): HRESULT
}

public typealias CreateInterfaceFnPtr = CreateInterfaceFnPtrFn?

public typealias EApiCategories = Int

public typealias EBindPolicyLevels = Int

public typealias ECLRAssemblyIdentityFlags = Int

public typealias EClrEvent = Int

public typealias EClrFailure = Int

public typealias EClrOperation = Int

public typealias EClrUnhandledException = Int

public typealias EContextType = Int

public typealias ECustomDumpFlavor = Int

public typealias ECustomDumpItemKind = Int

public typealias EHostApplicationPolicy = Int

public typealias EHostBindingPolicyModifyFlags = Int

public typealias EInitializeNewDomainFlags = Int

public typealias EMemoryAvailable = Int

public typealias EMemoryCriticalLevel = Int

public typealias EPolicyAction = Int

public typealias ESymbolReadingPolicy = Int

public typealias ETaskType = Int

public fun interface FExecuteInAppDomainCallbackFn {
    public operator fun invoke(cookie: Long): HRESULT
}

public typealias FExecuteInAppDomainCallback = FExecuteInAppDomainCallbackFn?

public fun interface FLockClrVersionCallbackFn {
    public operator fun invoke(): HRESULT
}

public typealias FLockClrVersionCallback = FLockClrVersionCallbackFn?

public typealias HOST_TYPE = Int

public typealias MALLOC_TYPE = Int

public typealias METAHOST_CONFIG_FLAGS = Int

public typealias METAHOST_POLICY_FLAGS = Int

public fun interface PTLS_CALLBACK_FUNCTIONFn {
    public operator fun invoke(__midl____midl_itf_mscoree_0000_00040005: Long)
}

public typealias PTLS_CALLBACK_FUNCTION = PTLS_CALLBACK_FUNCTIONFn?

public typealias RUNTIME_INFO_FLAGS = Int

public fun interface RuntimeLoadedCallbackFnPtrFn {
    public operator fun invoke(pruntimeinfo: Long, pfncallbackthreadset: CallbackThreadSetFnPtr, pfncallbackthreadunset: CallbackThreadUnsetFnPtr)
}

public typealias RuntimeLoadedCallbackFnPtr = RuntimeLoadedCallbackFnPtrFn?

public typealias STARTUP_FLAGS = Int

public typealias StackOverflowType = Int

public typealias WAIT_OPTION = Int

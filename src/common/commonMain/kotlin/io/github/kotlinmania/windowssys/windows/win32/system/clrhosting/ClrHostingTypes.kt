package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public typealias AppdomainSecurityFlags = Int

public typealias BucketParameterIndex = Int

public fun interface CLRCreateInstanceFnPtrFn {
    public operator fun invoke(clsid: ConstPtr, riid: ConstPtr, ppinterface: MutPtr): Hresult
}

public typealias CLRCreateInstanceFnPtr = CLRCreateInstanceFnPtrFn?

public typealias ClrDebuggingProcessFlags = Int

public typealias ClsidResolutionFlags = Int

public typealias CorGcStatTypes = Int

public typealias CorGcThreadStatsTypes = Int

public fun interface CallbackThreadSetFnPtrFn {
    public operator fun invoke(): Hresult
}

public typealias CallbackThreadSetFnPtr = CallbackThreadSetFnPtrFn?

public fun interface CallbackThreadUnsetFnPtrFn {
    public operator fun invoke(): Hresult
}

public typealias CallbackThreadUnsetFnPtr = CallbackThreadUnsetFnPtrFn?

public fun interface CreateInterfaceFnPtrFn {
    public operator fun invoke(clsid: ConstPtr, riid: ConstPtr, ppinterface: MutPtr): Hresult
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
    public operator fun invoke(cookie: MutPtr): Hresult
}

public typealias FExecuteInAppDomainCallback = FExecuteInAppDomainCallbackFn?

public fun interface FLockClrVersionCallbackFn {
    public operator fun invoke(): Hresult
}

public typealias FLockClrVersionCallback = FLockClrVersionCallbackFn?

public typealias HostType = Int

public typealias MallocType = Int

public typealias MetahostConfigFlags = Int

public typealias MetahostPolicyFlags = Int

public fun interface PtlsCallbackFunctionFn {
    public operator fun invoke(midlMidlItfMscoree000000040005: MutPtr)
}

public typealias PtlsCallbackFunction = PtlsCallbackFunctionFn?

public typealias RuntimeInfoFlags = Int

public fun interface RuntimeLoadedCallbackFnPtrFn {
    public operator fun invoke(pruntimeinfo: MutPtr, pfncallbackthreadset: CallbackThreadSetFnPtr, pfncallbackthreadunset: CallbackThreadUnsetFnPtr)
}

public typealias RuntimeLoadedCallbackFnPtr = RuntimeLoadedCallbackFnPtrFn?

public typealias StartupFlags = Int

public typealias StackOverflowType = Int

public typealias WaitOption = Int

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias FtpAccess = Int

public typealias FtpProcessStatus = Int

public typealias Hconn = MutPtr<CVoid>

public typealias HttpTraceType = Int

public typealias Metadatatypes = Int

public fun interface PfnGetextensionversionFn {
    public operator fun invoke(pver: MutPtr<HseVersionInfo>): Bool
}

public typealias PfnGetextensionversion = PfnGetextensionversionFn?

public fun interface PfnHseCacheInvalidationCallbackFn {
    public operator fun invoke(pszurl: Pcwstr): Hresult
}

public typealias PfnHseCacheInvalidationCallback = PfnHseCacheInvalidationCallbackFn?

public fun interface PfnHseGetProtocolManagerCustomInterfaceCallbackFn {
    public operator fun invoke(pszprotocolmanagerdll: Pcwstr, pszprotocolmanagerdllinitfunction: Pcwstr, dwcustominterfaceid: UInt, ppcustominterface: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias PfnHseGetProtocolManagerCustomInterfaceCallback = PfnHseGetProtocolManagerCustomInterfaceCallbackFn?

public fun interface PfnHseIoCompletionFn {
    public operator fun invoke(pecb: MutPtr<ExtensionControlBlock>, pcontext: MutPtr<CVoid>, cbio: UInt, dwerror: UInt)
}

public typealias PfnHseIoCompletion = PfnHseIoCompletionFn?

public fun interface PfnHttpextensionprocFn {
    public operator fun invoke(pecb: MutPtr<ExtensionControlBlock>): UInt
}

public typealias PfnHttpextensionproc = PfnHttpextensionprocFn?

public fun interface PfnIisGetservervariableFn {
    public operator fun invoke(param0: Hconn, param1: Pcstr, param2: MutPtr<CVoid>, param3: MutPtr<UInt>): Bool
}

public typealias PfnIisGetservervariable = PfnIisGetservervariableFn?

public fun interface PfnIisReadclientFn {
    public operator fun invoke(param0: Hconn, param1: MutPtr<CVoid>, param2: MutPtr<UInt>): Bool
}

public typealias PfnIisReadclient = PfnIisReadclientFn?

public fun interface PfnIisServersupportfunctionFn {
    public operator fun invoke(param0: Hconn, param1: UInt, param2: MutPtr<CVoid>, param3: MutPtr<UInt>, param4: MutPtr<UInt>): Bool
}

public typealias PfnIisServersupportfunction = PfnIisServersupportfunctionFn?

public fun interface PfnIisWriteclientFn {
    public operator fun invoke(param0: Hconn, param1: MutPtr<CVoid>, param2: MutPtr<UInt>, param3: UInt): Bool
}

public typealias PfnIisWriteclient = PfnIisWriteclientFn?

public fun interface PfnTerminateextensionFn {
    public operator fun invoke(dwflags: UInt): Bool
}

public typealias PfnTerminateextension = PfnTerminateextensionFn?

public fun interface PfnWebCoreActivateFn {
    public operator fun invoke(pszapphostconfigfile: Pcwstr, pszrootwebconfigfile: Pcwstr, pszinstancename: Pcwstr): Hresult
}

public typealias PfnWebCoreActivate = PfnWebCoreActivateFn?

public fun interface PfnWebCoreSetMetadataDllEntryFn {
    public operator fun invoke(pszmetadatatype: Pcwstr, pszvalue: Pcwstr): Hresult
}

public typealias PfnWebCoreSetMetadataDllEntry = PfnWebCoreSetMetadataDllEntryFn?

public fun interface PfnWebCoreShutdownFn {
    public operator fun invoke(fimmediate: UInt): Hresult
}

public typealias PfnWebCoreShutdown = PfnWebCoreShutdownFn?

public typealias SfPropertyIis = Int

public typealias SfReqType = Int

public typealias SfStatusType = Int

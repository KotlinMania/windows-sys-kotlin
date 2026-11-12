package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

public typealias AdvancedFeatureFlags = UShort

public typealias Advf = Int

public typealias Apttype = Int

public typealias Apttypequalifier = Int

public typealias ApplicationType = Int

public typealias Bindinfof = Int

public typealias BindFlags = Int

public typealias Callconv = Int

public typealias Calltype = Int

public typealias Clsctx = UInt

public typealias Coinit = Int

public typealias Coinitbase = Int

public typealias Comsd = Int

public typealias CowaitFlags = Int

public typealias CoDeviceCatalogCookie = MutPtr

public typealias CoMarshalingContextAttributes = Int

public typealias CoMtaUsageCookie = MutPtr

public typealias CwmoFlags = Int

public typealias Datadir = Int

public typealias DcomCallState = Int

public typealias Desckind = Int

public typealias DispatchFlags = UShort

public typealias Dvaspect = UInt

public typealias EoleAuthenticationCapabilities = Int

public typealias Extconn = Int

public typealias Funcflags = UShort

public typealias Funckind = Int

public typealias GlobaloptEhValues = Int

public typealias GlobaloptProperties = Int

public typealias GlobaloptRoFlags = Int

public typealias GlobaloptRpctpValues = Int

public typealias GlobaloptUnmarshalingPolicyValues = Int

public typealias Idlflags = UShort

public typealias Impltypeflags = Int

public typealias Invokekind = Int

public typealias Locktype = Int

public fun interface LpexcepfinoDeferredFillinFn {
    public operator fun invoke(pexcepinfo: MutPtr): Hresult
}

public typealias LpexcepfinoDeferredFillin = LpexcepfinoDeferredFillinFn?

public fun interface LpfncanunloadnowFn {
    public operator fun invoke(): Hresult
}

public typealias Lpfncanunloadnow = LpfncanunloadnowFn?

public fun interface LpfngetclassobjectFn {
    public operator fun invoke(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): Hresult
}

public typealias Lpfngetclassobject = LpfngetclassobjectFn?

public typealias Memctx = Int

public typealias Mkrreduce = Int

public typealias Mksys = Int

public typealias Mshctx = Int

public typealias Mshlflags = Int

public typealias MachineGlobalObjectTableRegistrationToken = MutPtr

public typealias Pendingmsg = Int

public typealias Pendingtype = Int

public fun interface PfncontextcallFn {
    public operator fun invoke(pparam: MutPtr): Hresult
}

public typealias Pfncontextcall = PfncontextcallFn?

public typealias Regcls = Int

public typealias RotFlags = UInt

public typealias RpcoptProperties = Int

public typealias RpcoptServerLocalityValues = Int

public typealias RpcCAuthnLevel = UInt

public typealias RpcCImpLevel = UInt

public typealias Servercall = Int

public typealias Statflag = Int

public typealias Stgc = Int

public typealias Stgm = UInt

public typealias Stgty = Int

public typealias StreamSeek = UInt

public typealias Syskind = Int

public typealias ShutdownType = Int

public typealias Thdtype = Int

public typealias Tymed = Int

public typealias Typekind = Int

public typealias Tyspec = Int

public typealias UriCreateFlags = UInt

public typealias UriProperty = Int

public typealias Varflags = UShort

public typealias Varkind = Int

@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private val windowsWin32SystemDeploymentservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(hclientrequest.rawAddress.toString(), action.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpAppendOption(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, boption: UByte, boptionlen: UByte, pvalue: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(preplypacket.rawAddress.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress.toString(), boption.toInt(), boptionlen.toInt(), pvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>, ubufferlen: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(preplypacket.rawAddress.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress.toString(), ubufferlen.toInt(), pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpGetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), uinstance.toInt(), boption.toInt(), pboptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr<UByte>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), boption.toInt(), uinstance.toInt(), pboptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpInitialize(precvpacket: ConstPtr<CVoid>, urecvpacketlen: UInt, preplypacket: MutPtr<CVoid>, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(precvpacket.rawAddress.toString(), urecvpacketlen.toInt(), preplypacket.rawAddress.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpIsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(ppacket.rawAddress.toString(), upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6AppendOption(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, woptiontype: UShort, cboption: UShort, poption: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(preply.rawAddress.toString(), cbreply.toInt(), pcbreplyused.rawAddress.toString(), woptiontype.toInt(), cboption.toInt(), poption.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6AppendOptionRaw(preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>, cbbuffer: UShort, pbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(preply.rawAddress.toString(), cbreply.toInt(), pcbreplyused.rawAddress.toString(), cbbuffer.toInt(), pbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pinnerpacket: ConstPtr<UByte>, cbinnerpacket: UInt, preplybuffer: MutPtr<CVoid>, cbreplybuffer: UInt, pcbreplybuffer: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(prelaymessages.rawAddress.toString(), nrelaymessages.toInt(), pinnerpacket.rawAddress.toString(), cbinnerpacket.toInt(), preplybuffer.rawAddress.toString(), cbreplybuffer.toInt(), pcbreplybuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), uinstance.toInt(), woption.toInt(), pwoptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr<CVoid>, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr<UShort>, ppoptionvalue: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toInt(), uinstance.toInt(), pwoptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6Initialize(prequest: ConstPtr<CVoid>, cbrequest: UInt, preply: MutPtr<CVoid>, cbreply: UInt, pcbreplyused: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(prequest.rawAddress.toString(), cbrequest.toInt(), preply.rawAddress.toString(), cbreply.toInt(), pcbreplyused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6IsValid(ppacket: ConstPtr<CVoid>, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr<Bool>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(ppacket.rawAddress.toString(), upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr<CVoid>, urelayforwpacketlen: UInt, prelaymessages: MutPtr<PxeDhcpv6NestedRelayMessage>, nrelaymessages: UInt, pnrelaymessages: MutPtr<UInt>, ppinnerpacket: MutPtr<MutPtr<UByte>>, pcbinnerpacket: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(prelayforwpacket.rawAddress.toString(), urelayforwpacketlen.toInt(), prelaymessages.rawAddress.toString(), nrelaymessages.toInt(), pnrelaymessages.rawAddress.toString(), ppinnerpacket.rawAddress.toString(), pcbinnerpacket.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uinfotype.toInt(), pbuffer.rawAddress.toString(), ubufferlen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr<CVoid>, ubufferlen: UInt, pubufferused: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uinfotype.toInt(), pbuffer.rawAddress.toString(), ubufferlen.toInt(), pubufferused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr<CVoid> =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) MutPtr((windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(hprovider.rawAddress.toString(), hclientrequest.rawAddress.toString(), usize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(hprovider.rawAddress.toString(), hclientrequest.rawAddress.toString(), ppacket.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(henum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumFirst(phenum: MutPtr<Handle>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(phenum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr<MutPtr<PxeProvider>>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(henum.rawAddress.toString(), ppprovider.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderFreeInfo(pprovider: ConstPtr<PxeProvider>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(pprovider.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(pszprovidername.rawAddress.toString(), puindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr<Hkey>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(pszprovidername.rawAddress.toString(), pszmodulepath.rawAddress.toString(), index.toInt(), biscritical, phproviderkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr<CVoid>, uparamlen: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(hprovider.rawAddress.toString(), attribute.toInt(), pparameterbuffer.rawAddress.toString(), uparamlen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(pszprovidername.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr<CVoid>, pcontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(hprovider.rawAddress.toString(), callbacktype.toInt(), pcallbackfunction.rawAddress.toString(), pcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr<CVoid>, upacketlen: UInt, paddress: ConstPtr<PxeAddress>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(hclientrequest.rawAddress.toString(), ppacket.rawAddress.toString(), upacketlen.toInt(), paddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeTrace(hprovider.rawAddress.toString(), severity.toInt(), pszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr<Byte>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(hprovider.rawAddress.toString(), severity.toInt(), pszformat.rawAddress.toString(), params.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(hhandle.rawAddress.toString(), uoption.toInt(), uvaluelen.toInt(), pvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(hhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(hhandle.rawAddress.toString(), ubufferlen.toInt(), pbuffer.rawAddress.toString(), pubytes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr<Handle>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(bpackettype.toInt(), phhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpParseInitialize(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(ppacket.rawAddress.toString(), upacketlen.toInt(), pbpackettype.rawAddress.toString(), phhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpParseInitializev6(ppacket: ConstPtr<CVoid>, upacketlen: UInt, pbpackettype: MutPtr<UByte>, phhandle: MutPtr<Handle>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(ppacket.rawAddress.toString(), upacketlen.toInt(), pbpackettype.rawAddress.toString(), phhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr<CVoid>, pubytes: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(hhandle.rawAddress.toString(), uoption.toInt(), uvaluelen.toInt(), pvalue.rawAddress.toString(), pubytes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr<WdsCliCred>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(hsession.rawAddress.toString(), pcred.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(htransfer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliClose(handle: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr<WdsCliCred>, phsession: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(pwszserver.rawAddress.toString(), pcred.rawAddress.toString(), phsession.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(hsession.rawAddress.toString(), phfindhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFreeStringArray(ppwszarray: MutPtr<Pwstr>, ulcount: UInt): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(ppwszarray.rawAddress.toString(), ulcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(pwszwindirpath.rawAddress.toString(), ppwszdriverquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(handle.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr<CpuArchitecture>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(hifh.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr<MutPtr<Pwstr>>, pdwcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(hifh.rawAddress.toString(), pppwszfiles.rawAddress.toString(), pdwcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(findhandle.rawAddress.toString(), phimagehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(htransfer.rawAddress.toString(), phimagehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(hifh.rawAddress.toString(), pdwvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr<MutPtr<MutPtr<Byte>>>, pdwnumvalues: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(hifh.rawAddress.toString(), pppszvalues.rawAddress.toString(), pdwnumvalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr<MutPtr<Systemtime>>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(hifh.rawAddress.toString(), ppsystimevalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr<CVoid>, uresponselen: UInt): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(hifh.rawAddress.toString(), paramtype, presponse.rawAddress.toString(), uresponselen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(hifh.rawAddress.toString(), pullvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr<WdsCliImageType>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(hifh.rawAddress.toString(), pimagetype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(hifh.rawAddress.toString(), pullvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(hsession.rawAddress.toString(), ulclientarchitecture.toInt(), pwszclientid.rawAddress.toString(), pwszclientaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(hsession.rawAddress.toString(), ulloglevel.toInt(), ulmessagecode.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(himage.rawAddress.toString(), ppwszservername.rawAddress.toString(), pppwszdriverpackages.rawAddress.toString(), pulcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr<Pwstr>, pppwszdriverpackages: MutPtr<MutPtr<Pwstr>>, pulcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(hsession.rawAddress.toString(), pwszmachineinfo.rawAddress.toString(), ppwszservername.rawAddress.toString(), pppwszdriverpackages.rawAddress.toString(), pulcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) {
        windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(pwszserver.rawAddress.toString(), pwsznamespace.rawAddress.toString(), pwszremotefilepath.rawAddress.toString(), pwszlocalfilepath.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt(), 0L.toString(), pvuserdata.rawAddress.toString(), phtransfer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr<CVoid>, phtransfer: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(himage.rawAddress.toString(), pwszlocalpath.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt(), 0L.toString(), pvuserdata.rawAddress.toString(), phtransfer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(htransfer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(pvbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(hsessionkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(hsessionkey.rawAddress.toString(), dwerrorcode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(hsessionkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr<ULong>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(hsessionkey.rawAddress.toString(), ulsize.toInt(), pulloffset.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientInitialize(): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr<WdsTransportclientRequest>, pcallerdata: ConstPtr<CVoid>, hsessionkey: MutPtr<Handle>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(psessionrequest.rawAddress.toString(), pcallerdata.rawAddress.toString(), hsessionkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr<UInt>, puerrorcode: MutPtr<UInt>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(hsessionkey.rawAddress.toString(), pustatus.rawAddress.toString(), puerrorcode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(hsessionkey.rawAddress.toString(), callbackid, pfncallback.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(pvbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientShutdown(): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(hsessionkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(hsessionkey.rawAddress.toString(), utimeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr<CVoid> =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) MutPtr((windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(hprovider.rawAddress.toString(), ulbuffersize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr<CVoid>, hreadresult: Hresult): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(hprovider.rawAddress.toString(), ulbytesread.toInt(), pvuserdata.rawAddress.toString(), hreadresult) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(hprovider.rawAddress.toString(), pvbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(hprovider.rawAddress.toString(), callbackid, pfncallback.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(hprovider.rawAddress.toString(), severity.toInt(), pwszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr<Byte>): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAddon != null) (windowsWin32SystemDeploymentservicesNapiAddon.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(hprovider.rawAddress.toString(), severity.toInt(), pwszformat.rawAddress.toString(), params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

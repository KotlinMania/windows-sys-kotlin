@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemDeploymentservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeAsyncRecvDone((hclientrequest?.value ?: 0L).toString(), action.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpAppendOption(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, boption: UByte, boptionlen: UByte, pvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOption((preplypacket?.value ?: 0L).toString(), umaxreplypacketlen.toInt(), (pureplypacketlen?.value ?: 0L).toString(), boption.toInt(), boptionlen.toInt(), (pvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpAppendOptionRaw(preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?, ubufferlen: UShort, pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpAppendOptionRaw((preplypacket?.value ?: 0L).toString(), umaxreplypacketlen.toInt(), (pureplypacketlen?.value ?: 0L).toString(), ubufferlen.toInt(), (pbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpGetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpGetOptionValue((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), uinstance.toInt(), boption.toInt(), (pboptionlen?.value ?: 0L).toString(), (ppoptionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpGetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpGetVendorOptionValue((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), boption.toInt(), uinstance.toInt(), (pboptionlen?.value ?: 0L).toString(), (ppoptionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpInitialize(precvpacket: COpaquePointer?, urecvpacketlen: UInt, preplypacket: COpaquePointer?, umaxreplypacketlen: UInt, pureplypacketlen: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpInitialize((precvpacket?.value ?: 0L).toString(), urecvpacketlen.toInt(), (preplypacket?.value ?: 0L).toString(), umaxreplypacketlen.toInt(), (pureplypacketlen?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpIsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpIsValid((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), brequestpacket, (pbpxeoptionpresent?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6AppendOption(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, woptiontype: UShort, cboption: UShort, poption: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOption((preply?.value ?: 0L).toString(), cbreply.toInt(), (pcbreplyused?.value ?: 0L).toString(), woptiontype.toInt(), cboption.toInt(), (poption?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6AppendOptionRaw(preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?, cbbuffer: UShort, pbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6AppendOptionRaw((preply?.value ?: 0L).toString(), cbreply.toInt(), (pcbreplyused?.value ?: 0L).toString(), cbbuffer.toInt(), (pbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: COpaquePointer?, nrelaymessages: UInt, pinnerpacket: COpaquePointer?, cbinnerpacket: UInt, preplybuffer: COpaquePointer?, cbreplybuffer: UInt, pcbreplybuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6CreateRelayRepl((prelaymessages?.value ?: 0L).toString(), nrelaymessages.toInt(), (pinnerpacket?.value ?: 0L).toString(), cbinnerpacket.toInt(), (preplybuffer?.value ?: 0L).toString(), cbreplybuffer.toInt(), (pcbreplybuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6GetOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetOptionValue((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), uinstance.toInt(), woption.toInt(), (pwoptionlen?.value ?: 0L).toString(), (ppoptionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: COpaquePointer?, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: COpaquePointer?, ppoptionvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6GetVendorOptionValue((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toInt(), uinstance.toInt(), (pwoptionlen?.value ?: 0L).toString(), (ppoptionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6Initialize(prequest: COpaquePointer?, cbrequest: UInt, preply: COpaquePointer?, cbreply: UInt, pcbreplyused: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6Initialize((prequest?.value ?: 0L).toString(), cbrequest.toInt(), (preply?.value ?: 0L).toString(), cbreply.toInt(), (pcbreplyused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6IsValid(ppacket: COpaquePointer?, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6IsValid((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), brequestpacket, (pbpxeoptionpresent?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: COpaquePointer?, urelayforwpacketlen: UInt, prelaymessages: COpaquePointer?, nrelaymessages: UInt, pnrelaymessages: COpaquePointer?, ppinnerpacket: COpaquePointer?, pcbinnerpacket: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeDhcpv6ParseRelayForw((prelayforwpacket?.value ?: 0L).toString(), urelayforwpacketlen.toInt(), (prelaymessages?.value ?: 0L).toString(), nrelaymessages.toInt(), (pnrelaymessages?.value ?: 0L).toString(), (ppinnerpacket?.value ?: 0L).toString(), (pcbinnerpacket?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeGetServerInfo(uinfotype.toInt(), (pbuffer?.value ?: 0L).toString(), ubufferlen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: COpaquePointer?, ubufferlen: UInt, pubufferused: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeGetServerInfoEx(uinfotype.toInt(), (pbuffer?.value ?: 0L).toString(), ubufferlen.toInt(), (pubufferused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): COpaquePointer? =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxePacketAllocate((hprovider?.value ?: 0L).toString(), (hclientrequest?.value ?: 0L).toString(), usize.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxePacketFree((hprovider?.value ?: 0L).toString(), (hclientrequest?.value ?: 0L).toString(), (ppacket?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumClose((henum?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumFirst(phenum: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumFirst((phenum?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderEnumNext((henum?.value ?: 0L).toString(), (ppprovider?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderFreeInfo(pprovider: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderFreeInfo((pprovider?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderQueryIndex((pszprovidername?.value ?: 0L).toString(), (puindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderRegister((pszprovidername?.value ?: 0L).toString(), (pszmodulepath?.value ?: 0L).toString(), index.toInt(), biscritical, (phproviderkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: COpaquePointer?, uparamlen: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderSetAttribute((hprovider?.value ?: 0L).toString(), attribute.toInt(), (pparameterbuffer?.value ?: 0L).toString(), uparamlen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeProviderUnRegister((pszprovidername?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: COpaquePointer?, pcontext: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeRegisterCallback((hprovider?.value ?: 0L).toString(), callbacktype.toInt(), (pcallbackfunction?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: COpaquePointer?, upacketlen: UInt, paddress: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeSendReply((hclientrequest?.value ?: 0L).toString(), (ppacket?.value ?: 0L).toString(), upacketlen.toInt(), (paddress?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeTrace((hprovider?.value ?: 0L).toString(), severity.toInt(), (pszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_pxeTraceV((hprovider?.value ?: 0L).toString(), severity.toInt(), (pszformat?.value ?: 0L).toString(), (params?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpAddOption((hhandle?.value ?: 0L).toString(), uoption.toInt(), uvaluelen.toInt(), (pvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpCloseHandle((hhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpGetOptionBuffer((hhandle?.value ?: 0L).toString(), ubufferlen.toInt(), (pbuffer?.value ?: 0L).toString(), (pubytes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpInitialize(bpackettype.toInt(), (phhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpParseInitialize(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpParseInitialize((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), (pbpackettype?.value ?: 0L).toString(), (phhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpParseInitializev6(ppacket: COpaquePointer?, upacketlen: UInt, pbpackettype: COpaquePointer?, phhandle: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpParseInitializev6((ppacket?.value ?: 0L).toString(), upacketlen.toInt(), (pbpackettype?.value ?: 0L).toString(), (phhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: COpaquePointer?, pubytes: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsBpQueryOption((hhandle?.value ?: 0L).toString(), uoption.toInt(), uvaluelen.toInt(), (pvalue?.value ?: 0L).toString(), (pubytes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliAuthorizeSession((hsession?.value ?: 0L).toString(), (pcred?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliCancelTransfer((htransfer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliClose(handle: Handle): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliClose((handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: COpaquePointer?, phsession: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliCreateSession((pwszserver?.value ?: 0L).toString(), (pcred?.value ?: 0L).toString(), (phsession?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliFindFirstImage((hsession?.value ?: 0L).toString(), (phfindhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliFindNextImage((handle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFreeStringArray(ppwszarray: COpaquePointer?, ulcount: UInt): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliFreeStringArray((ppwszarray?.value ?: 0L).toString(), ulcount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetDriverQueryXml((pwszwindirpath?.value ?: 0L).toString(), (ppwszdriverquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetEnumerationFlags((handle?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageArchitecture((hifh?.value ?: 0L).toString(), (pdwvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageDescription((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: COpaquePointer?, pdwcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageFiles((hifh?.value ?: 0L).toString(), (pppwszfiles?.value ?: 0L).toString(), (pdwcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageGroup((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHalName((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromFindHandle((findhandle?.value ?: 0L).toString(), (phimagehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageHandleFromTransferHandle((htransfer?.value ?: 0L).toString(), (phimagehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageIndex((hifh?.value ?: 0L).toString(), (pdwvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguage((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLanguages((hifh?.value ?: 0L).toString(), (pppszvalues?.value ?: 0L).toString(), (pdwnumvalues?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageLastModifiedTime((hifh?.value ?: 0L).toString(), (ppsystimevalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageName((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageNamespace((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: COpaquePointer?, uresponselen: UInt): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageParameter((hifh?.value ?: 0L).toString(), paramtype, (presponse?.value ?: 0L).toString(), uresponselen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImagePath((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageSize((hifh?.value ?: 0L).toString(), (pullvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageType((hifh?.value ?: 0L).toString(), (pimagetype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetImageVersion((hifh?.value ?: 0L).toString(), (ppwszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliGetTransferSize((hifh?.value ?: 0L).toString(), (pullvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliInitializeLog((hsession?.value ?: 0L).toString(), ulclientarchitecture.toInt(), (pwszclientid?.value ?: 0L).toString(), (pwszclientaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliLog((hsession?.value ?: 0L).toString(), ulloglevel.toInt(), ulmessagecode.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackages((himage?.value ?: 0L).toString(), (ppwszservername?.value ?: 0L).toString(), (pppwszdriverpackages?.value ?: 0L).toString(), (pulcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: COpaquePointer?, pppwszdriverpackages: COpaquePointer?, pulcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliObtainDriverPackagesEx((hsession?.value ?: 0L).toString(), (pwszmachineinfo?.value ?: 0L).toString(), (ppwszservername?.value ?: 0L).toString(), (pppwszdriverpackages?.value ?: 0L).toString(), (pulcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliRegisterTrace(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) {
        _windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliTransferFile((pwszserver?.value ?: 0L).toString(), (pwsznamespace?.value ?: 0L).toString(), (pwszremotefilepath?.value ?: 0L).toString(), (pwszlocalfilepath?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt(), 0L.toString(), (pvuserdata?.value ?: 0L).toString(), (phtransfer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: COpaquePointer?, phtransfer: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliTransferImage((himage?.value ?: 0L).toString(), (pwszlocalpath?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt(), 0L.toString(), (pvuserdata?.value ?: 0L).toString(), (phtransfer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsCliWaitForTransfer((htransfer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientAddRefBuffer((pvbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSession((hsessionkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCancelSessionEx((hsessionkey?.value ?: 0L).toString(), dwerrorcode.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCloseSession((hsessionkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientCompleteReceive((hsessionkey?.value ?: 0L).toString(), ulsize.toInt(), (pulloffset?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientInitialize(): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitialize() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientInitializeSession(psessionrequest: COpaquePointer?, pcallerdata: COpaquePointer?, hsessionkey: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientInitializeSession((psessionrequest?.value ?: 0L).toString(), (pcallerdata?.value ?: 0L).toString(), (hsessionkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: COpaquePointer?, puerrorcode: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientQueryStatus((hsessionkey?.value ?: 0L).toString(), (pustatus?.value ?: 0L).toString(), (puerrorcode?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientRegisterCallback((hsessionkey?.value ?: 0L).toString(), callbackid, (pfncallback?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: COpaquePointer?): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientReleaseBuffer((pvbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientShutdown(): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientShutdown() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientStartSession((hsessionkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportClientWaitForCompletion((hsessionkey?.value ?: 0L).toString(), utimeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): COpaquePointer? =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportServerAllocateBuffer((hprovider?.value ?: 0L).toString(), ulbuffersize.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: COpaquePointer?, hreadresult: Hresult): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportServerCompleteRead((hprovider?.value ?: 0L).toString(), ulbytesread.toInt(), (pvuserdata?.value ?: 0L).toString(), hreadresult) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportServerFreeBuffer((hprovider?.value ?: 0L).toString(), (pvbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportServerRegisterCallback((hprovider?.value ?: 0L).toString(), callbackid, (pfncallback?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportServerTrace((hprovider?.value ?: 0L).toString(), severity.toInt(), (pwszformat?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: COpaquePointer?): Hresult =
    if (_windowsWin32SystemDeploymentservicesNapiAddon != null) (_windowsWin32SystemDeploymentservicesNapiAddon.windowssys_windows_win32_system_deploymentservices_wdsTransportServerTraceV((hprovider?.value ?: 0L).toString(), severity.toInt(), (pwszformat?.value ?: 0L).toString(), (params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

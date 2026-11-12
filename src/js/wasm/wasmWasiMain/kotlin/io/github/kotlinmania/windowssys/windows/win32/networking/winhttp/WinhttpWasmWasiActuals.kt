@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun winHttpAddRequestHeaders(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders")

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform")
private external fun wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform(): Int

public actual fun winHttpCheckPlatform(): Bool =
    wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle")

public actual fun winHttpConnect(hsession: MutPtr, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpConnect")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl")

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr, phresolver: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver")

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl")

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult")

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx")

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings")

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult")

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser")

public actual fun winHttpGetProxyForUrl(hsession: MutPtr, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr, pproxyinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl")

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, pcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx")

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr, pcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2")

public actual fun winHttpGetProxyResult(hresolver: ConstPtr, pproxyresult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult")

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr, pproxyresultex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx")

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr, pcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx")

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr, pproxysettingsex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx")

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr, pdwproxysettingsversion: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpOpen")

public actual fun winHttpOpenRequest(hconnect: MutPtr, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr, dwflags: WinhttpOpenRequestFlags): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest")

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr, lpdwsupportedschemes: MutPtr, lpdwfirstscheme: MutPtr, pdwauthtarget: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes")

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr, pguidconnection: ConstPtr, ullflags: ULong, ppresult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup")

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr, lpdwnumberofbytesavailable: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable")

public actual fun winHttpQueryHeaders(hrequest: MutPtr, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders")

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr, pheadername: ConstPtr, pbuffer: MutPtr, pdwbufferlength: MutPtr, ppheaders: MutPtr, pdwheaderscount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx")

public actual fun winHttpQueryOption(hinternet: MutPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption")

public actual fun winHttpReadData(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReadData")

public actual fun winHttpReadDataEx(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx")

public actual fun winHttpReadProxySettings(hsession: ConstPtr, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr, pfdefaultsettingsarereturned: MutPtr, pwinhttpproxysettings: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings")

public actual fun winHttpReceiveResponse(hrequest: MutPtr, lpreserved: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr, hregistration: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification")

public actual fun winHttpResetAutoProxy(hsession: ConstPtr, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy")

public actual fun winHttpSendRequest(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest")

public actual fun winHttpSetCredentials(hrequest: MutPtr, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration")

public actual fun winHttpSetOption(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser")
private external fun wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser: Int): Int

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser).toUInt()

public actual fun winHttpSetStatusCallback(hinternet: MutPtr, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetStatusCallback")

public actual fun winHttpSetTimeouts(hinternet: MutPtr, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts")

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr, pwsztime: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification")

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr, pcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus")

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pebuffertype: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive")

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend")

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown")

public actual fun winHttpWriteData(hrequest: MutPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData")

public actual fun winHttpWriteProxySettings(hsession: ConstPtr, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings")

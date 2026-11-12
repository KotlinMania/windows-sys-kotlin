@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun winHttpAddRequestHeaders(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders")

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr<CVoid>, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr<WinhttpExtendedHeader>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform")
private external fun wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform(): Int

public actual fun winHttpCheckPlatform(): Bool =
    wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle")

public actual fun winHttpConnect(hsession: MutPtr<CVoid>, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpConnect")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr<UrlComponents>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl")

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr<CVoid>, phresolver: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver")

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr<UrlComponents>, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr<Pwstr>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl")

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr<WinhttpProxyResult>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult")

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr<WinhttpProxyResultEx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx")

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings")

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr<WinhttpQueryConnectionGroupResult>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult")

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr<WinhttpCurrentUserIeProxyConfig>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser")

public actual fun winHttpGetProxyForUrl(hsession: MutPtr<CVoid>, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr<WinhttpAutoproxyOptions>, pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl")

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, pcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx")

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr<UByte>, pcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2")

public actual fun winHttpGetProxyResult(hresolver: ConstPtr<CVoid>, pproxyresult: MutPtr<WinhttpProxyResult>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult")

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr<CVoid>, pproxyresultex: MutPtr<WinhttpProxyResultEx>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx")

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr<CVoid>, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr<WinhttpProxySettingsParam>, pcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx")

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr<CVoid>, pproxysettingsex: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx")

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr<CVoid>, pdwproxysettingsversion: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpOpen")

public actual fun winHttpOpenRequest(hconnect: MutPtr<CVoid>, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr<Pcwstr>, dwflags: WinhttpOpenRequestFlags): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest")

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr<CVoid>, lpdwsupportedschemes: MutPtr<UInt>, lpdwfirstscheme: MutPtr<UInt>, pdwauthtarget: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes")

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr<CVoid>, pguidconnection: ConstPtr<Guid>, ullflags: ULong, ppresult: MutPtr<MutPtr<WinhttpQueryConnectionGroupResult>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup")

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr<CVoid>, lpdwnumberofbytesavailable: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable")

public actual fun winHttpQueryHeaders(hrequest: MutPtr<CVoid>, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders")

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr<UInt>, pheadername: ConstPtr<WinhttpHeaderName>, pbuffer: MutPtr<CVoid>, pdwbufferlength: MutPtr<UInt>, ppheaders: MutPtr<MutPtr<WinhttpExtendedHeader>>, pdwheaderscount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx")

public actual fun winHttpQueryOption(hinternet: MutPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption")

public actual fun winHttpReadData(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReadData")

public actual fun winHttpReadDataEx(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx")

public actual fun winHttpReadProxySettings(hsession: ConstPtr<CVoid>, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr<UInt>, pfdefaultsettingsarereturned: MutPtr<Bool>, pwinhttpproxysettings: MutPtr<WinhttpProxySettings>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings")

public actual fun winHttpReceiveResponse(hrequest: MutPtr<CVoid>, lpreserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr<CVoid>, hregistration: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification")

public actual fun winHttpResetAutoProxy(hsession: ConstPtr<CVoid>, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy")

public actual fun winHttpSendRequest(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest")

public actual fun winHttpSetCredentials(hrequest: MutPtr<CVoid>, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration")

public actual fun winHttpSetOption(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser")
private external fun wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser: Int): Int

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    wasiWindowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser).toUInt()

public actual fun winHttpSetStatusCallback(hinternet: MutPtr<CVoid>, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetStatusCallback")

public actual fun winHttpSetTimeouts(hinternet: MutPtr<CVoid>, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts")

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr<Systemtime>, pwsztime: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr<Systemtime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification")

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr<CVoid>, pcontext: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr<CVoid>, pusstatus: MutPtr<UShort>, pvreason: MutPtr<CVoid>, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus")

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr<CVoid>, pvbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbytesread: MutPtr<UInt>, pebuffertype: MutPtr<WinhttpWebSocketBufferType>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive")

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr<CVoid>, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend")

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown")

public actual fun winHttpWriteData(hrequest: MutPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData")

public actual fun winHttpWriteProxySettings(hsession: ConstPtr<CVoid>, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings")

@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public actual fun winHttpAddRequestHeaders(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpAddRequestHeadersEx(hrequest: COpaquePointer?, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpCheckPlatform(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpCloseHandle(hinternet: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpConnect(hsession: COpaquePointer?, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpCreateProxyResolver(hsession: COpaquePointer?, phresolver: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpCreateUrl(lpurlcomponents: COpaquePointer?, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpFreeProxyResult(pproxyresult: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxyForUrl(hsession: COpaquePointer?, lpcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pproxyinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxyForUrlEx(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pcontext: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxyForUrlEx2(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: COpaquePointer?, pcontext: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxyResult(hresolver: COpaquePointer?, pproxyresult: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxyResultEx(hresolver: COpaquePointer?, pproxyresultex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxySettingsEx(hresolver: COpaquePointer?, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: COpaquePointer?, pcontext: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxySettingsResultEx(hresolver: COpaquePointer?, pproxysettingsex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpGetProxySettingsVersion(hsession: COpaquePointer?, pdwproxysettingsversion: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpOpenRequest(hconnect: COpaquePointer?, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: COpaquePointer?, dwflags: WinhttpOpenRequestFlags): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpQueryAuthSchemes(hrequest: COpaquePointer?, lpdwsupportedschemes: COpaquePointer?, lpdwfirstscheme: COpaquePointer?, pdwauthtarget: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpQueryConnectionGroup(hinternet: COpaquePointer?, pguidconnection: COpaquePointer?, ullflags: ULong, ppresult: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpQueryDataAvailable(hrequest: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpQueryHeaders(hrequest: COpaquePointer?, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpQueryHeadersEx(hrequest: COpaquePointer?, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: COpaquePointer?, pheadername: COpaquePointer?, pbuffer: COpaquePointer?, pdwbufferlength: COpaquePointer?, ppheaders: COpaquePointer?, pdwheaderscount: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpQueryOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpReadData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpReadDataEx(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?, ullflags: ULong, cbproperty: UInt, pvproperty: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpReadProxySettings(hsession: COpaquePointer?, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: COpaquePointer?, pfdefaultsettingsarereturned: COpaquePointer?, pwinhttpproxysettings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpReceiveResponse(hrequest: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: COpaquePointer?, hregistration: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpResetAutoProxy(hsession: COpaquePointer?, dwflags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSendRequest(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSetCredentials(hrequest: COpaquePointer?, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSetOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpSetTimeouts(hinternet: COpaquePointer?, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpTimeFromSystemTime(pst: COpaquePointer?, pwsztime: Pwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, pcontext: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pebuffertype: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWebSocketSend(hwebsocket: COpaquePointer?, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWriteData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun winHttpWriteProxySettings(hsession: COpaquePointer?, fforceupdate: Bool, pwinhttpproxysettings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

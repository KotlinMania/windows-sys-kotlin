@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public actual fun WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: UInt): BOOL =
    0

public actual fun WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: Long): UInt =
    0u

public actual fun WinHttpCheckPlatform(): BOOL =
    0

public actual fun WinHttpCloseHandle(hinternet: Long): BOOL =
    0

public actual fun WinHttpConnect(hsession: Long, pswzservername: PCWSTR, nserverport: UShort, dwreserved: UInt): Long =
    0L

public actual fun WinHttpCrackUrl(pwszurl: PCWSTR, dwurllength: UInt, dwflags: UInt, lpurlcomponents: Long): BOOL =
    0

public actual fun WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): UInt =
    0u

public actual fun WinHttpCreateUrl(lpurlcomponents: Long, dwflags: WIN_HTTP_CREATE_URL_FLAGS, pwszurl: PWSTR, pdwurllength: Long): BOOL =
    0

public actual fun WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: Long): BOOL =
    0

public actual fun WinHttpFreeProxyResult(pproxyresult: Long) {
}

public actual fun WinHttpFreeProxyResultEx(pproxyresultex: Long) {
}

public actual fun WinHttpFreeProxySettings(pwinhttpproxysettings: Long) {
}

public actual fun WinHttpFreeProxySettingsEx(proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsex: Long): UInt =
    0u

public actual fun WinHttpFreeQueryConnectionGroupResult(presult: Long) {
}

public actual fun WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    0

public actual fun WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): BOOL =
    0

public actual fun WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: PCWSTR, pautoproxyoptions: Long, pproxyinfo: Long): BOOL =
    0

public actual fun WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, pcontext: ULong): UInt =
    0u

public actual fun WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: Long, pcontext: ULong): UInt =
    0u

public actual fun WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): UInt =
    0u

public actual fun WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): UInt =
    0u

public actual fun WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsparam: Long, pcontext: ULong): UInt =
    0u

public actual fun WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): UInt =
    0u

public actual fun WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): UInt =
    0u

public actual fun WinHttpOpen(pszagentw: PCWSTR, dwaccesstype: WINHTTP_ACCESS_TYPE, pszproxyw: PCWSTR, pszproxybypassw: PCWSTR, dwflags: UInt): Long =
    0L

public actual fun WinHttpOpenRequest(hconnect: Long, pwszverb: PCWSTR, pwszobjectname: PCWSTR, pwszversion: PCWSTR, pwszreferrer: PCWSTR, ppwszaccepttypes: Long, dwflags: WINHTTP_OPEN_REQUEST_FLAGS): Long =
    0L

public actual fun WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): BOOL =
    0

public actual fun WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: ULong, ppresult: Long): UInt =
    0u

public actual fun WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): BOOL =
    0

public actual fun WinHttpQueryHeaders(hrequest: Long, dwinfolevel: UInt, pwszname: PCWSTR, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    0

public actual fun WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): UInt =
    0u

public actual fun WinHttpQueryOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    0

public actual fun WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    0

public actual fun WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long, ullflags: ULong, cbproperty: UInt, pvproperty: Long): UInt =
    0u

public actual fun WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: PCWSTR, ffallbacktodefaultsettings: BOOL, fsetautodiscoverfordefaultsettings: BOOL, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): UInt =
    0u

public actual fun WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): BOOL =
    0

public actual fun WinHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WINHTTP_PROXY_CHANGE_CALLBACK, pvcontext: Long, hregistration: Long): UInt =
    0u

public actual fun WinHttpResetAutoProxy(hsession: Long, dwflags: UInt): UInt =
    0u

public actual fun WinHttpSendRequest(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): BOOL =
    0

public actual fun WinHttpSetCredentials(hrequest: Long, authtargets: UInt, authscheme: UInt, pwszusername: PCWSTR, pwszpassword: PCWSTR, pauthparams: Long): BOOL =
    0

public actual fun WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    0

public actual fun WinHttpSetOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    0

public actual fun WinHttpSetProxySettingsPerUser(fproxysettingsperuser: BOOL): UInt =
    0u

public actual fun WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: WINHTTP_STATUS_CALLBACK, dwnotificationflags: UInt, dwreserved: ULong): WINHTTP_STATUS_CALLBACK =
    null

public actual fun WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): BOOL =
    0

public actual fun WinHttpTimeFromSystemTime(pst: Long, pwsztime: PWSTR): BOOL =
    0

public actual fun WinHttpTimeToSystemTime(pwsztime: PCWSTR, pst: Long): BOOL =
    0

public actual fun WinHttpUnregisterProxyChangeNotification(hregistration: Long): UInt =
    0u

public actual fun WinHttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    0u

public actual fun WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: ULong): Long =
    0L

public actual fun WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): UInt =
    0u

public actual fun WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pebuffertype: Long): UInt =
    0u

public actual fun WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: WINHTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): UInt =
    0u

public actual fun WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    0u

public actual fun WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    0

public actual fun WinHttpWriteProxySettings(hsession: Long, fforceupdate: BOOL, pwinhttpproxysettings: Long): UInt =
    0u

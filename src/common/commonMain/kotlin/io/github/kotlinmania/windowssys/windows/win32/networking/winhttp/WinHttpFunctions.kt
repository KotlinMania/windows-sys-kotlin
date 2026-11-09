package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public expect fun WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: UInt): BOOL

public expect fun WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: Long): UInt

public expect fun WinHttpCheckPlatform(): BOOL

public expect fun WinHttpCloseHandle(hinternet: Long): BOOL

public expect fun WinHttpConnect(hsession: Long, pswzservername: PCWSTR, nserverport: UShort, dwreserved: UInt): Long

public expect fun WinHttpCrackUrl(pwszurl: PCWSTR, dwurllength: UInt, dwflags: UInt, lpurlcomponents: Long): BOOL

public expect fun WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): UInt

public expect fun WinHttpCreateUrl(lpurlcomponents: Long, dwflags: WIN_HTTP_CREATE_URL_FLAGS, pwszurl: PWSTR, pdwurllength: Long): BOOL

public expect fun WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: Long): BOOL

public expect fun WinHttpFreeProxyResult(pproxyresult: Long)

public expect fun WinHttpFreeProxyResultEx(pproxyresultex: Long)

public expect fun WinHttpFreeProxySettings(pwinhttpproxysettings: Long)

public expect fun WinHttpFreeProxySettingsEx(proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsex: Long): UInt

public expect fun WinHttpFreeQueryConnectionGroupResult(presult: Long)

public expect fun WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): BOOL

public expect fun WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): BOOL

public expect fun WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: PCWSTR, pautoproxyoptions: Long, pproxyinfo: Long): BOOL

public expect fun WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, pcontext: ULong): UInt

public expect fun WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: Long, pcontext: ULong): UInt

public expect fun WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): UInt

public expect fun WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): UInt

public expect fun WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsparam: Long, pcontext: ULong): UInt

public expect fun WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): UInt

public expect fun WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): UInt

public expect fun WinHttpOpen(pszagentw: PCWSTR, dwaccesstype: WINHTTP_ACCESS_TYPE, pszproxyw: PCWSTR, pszproxybypassw: PCWSTR, dwflags: UInt): Long

public expect fun WinHttpOpenRequest(hconnect: Long, pwszverb: PCWSTR, pwszobjectname: PCWSTR, pwszversion: PCWSTR, pwszreferrer: PCWSTR, ppwszaccepttypes: Long, dwflags: WINHTTP_OPEN_REQUEST_FLAGS): Long

public expect fun WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): BOOL

public expect fun WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: ULong, ppresult: Long): UInt

public expect fun WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): BOOL

public expect fun WinHttpQueryHeaders(hrequest: Long, dwinfolevel: UInt, pwszname: PCWSTR, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL

public expect fun WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): UInt

public expect fun WinHttpQueryOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL

public expect fun WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL

public expect fun WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long, ullflags: ULong, cbproperty: UInt, pvproperty: Long): UInt

public expect fun WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: PCWSTR, ffallbacktodefaultsettings: BOOL, fsetautodiscoverfordefaultsettings: BOOL, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): UInt

public expect fun WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): BOOL

public expect fun WinHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WINHTTP_PROXY_CHANGE_CALLBACK, pvcontext: Long, hregistration: Long): UInt

public expect fun WinHttpResetAutoProxy(hsession: Long, dwflags: UInt): UInt

public expect fun WinHttpSendRequest(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): BOOL

public expect fun WinHttpSetCredentials(hrequest: Long, authtargets: UInt, authscheme: UInt, pwszusername: PCWSTR, pwszpassword: PCWSTR, pauthparams: Long): BOOL

public expect fun WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): BOOL

public expect fun WinHttpSetOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL

public expect fun WinHttpSetProxySettingsPerUser(fproxysettingsperuser: BOOL): UInt

public expect fun WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: WINHTTP_STATUS_CALLBACK, dwnotificationflags: UInt, dwreserved: ULong): WINHTTP_STATUS_CALLBACK

public expect fun WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): BOOL

public expect fun WinHttpTimeFromSystemTime(pst: Long, pwsztime: PWSTR): BOOL

public expect fun WinHttpTimeToSystemTime(pwsztime: PCWSTR, pst: Long): BOOL

public expect fun WinHttpUnregisterProxyChangeNotification(hregistration: Long): UInt

public expect fun WinHttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt

public expect fun WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: ULong): Long

public expect fun WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): UInt

public expect fun WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pebuffertype: Long): UInt

public expect fun WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: WINHTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): UInt

public expect fun WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt

public expect fun WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL

public expect fun WinHttpWriteProxySettings(hsession: Long, fforceupdate: BOOL, pwinhttpproxysettings: Long): UInt

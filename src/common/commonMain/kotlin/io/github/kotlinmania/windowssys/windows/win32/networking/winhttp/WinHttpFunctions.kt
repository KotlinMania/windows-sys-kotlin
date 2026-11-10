package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun winHttpAddRequestHeaders(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool

public expect fun winHttpAddRequestHeadersEx(hrequest: COpaquePointer?, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: COpaquePointer?): UInt

public expect fun winHttpCheckPlatform(): Bool

public expect fun winHttpCloseHandle(hinternet: COpaquePointer?): Bool

public expect fun winHttpConnect(hsession: COpaquePointer?, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): COpaquePointer?

public expect fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: COpaquePointer?): Bool

public expect fun winHttpCreateProxyResolver(hsession: COpaquePointer?, phresolver: COpaquePointer?): UInt

public expect fun winHttpCreateUrl(lpurlcomponents: COpaquePointer?, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: COpaquePointer?): Bool

public expect fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: COpaquePointer?): Bool

public expect fun winHttpFreeProxyResult(pproxyresult: COpaquePointer?)

public expect fun winHttpFreeProxyResultEx(pproxyresultex: COpaquePointer?)

public expect fun winHttpFreeProxySettings(pwinhttpproxysettings: COpaquePointer?)

public expect fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: COpaquePointer?): UInt

public expect fun winHttpFreeQueryConnectionGroupResult(presult: COpaquePointer?)

public expect fun winHttpGetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool

public expect fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: COpaquePointer?): Bool

public expect fun winHttpGetProxyForUrl(hsession: COpaquePointer?, lpcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pproxyinfo: COpaquePointer?): Bool

public expect fun winHttpGetProxyForUrlEx(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pcontext: ULong): UInt

public expect fun winHttpGetProxyForUrlEx2(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: COpaquePointer?, pcontext: ULong): UInt

public expect fun winHttpGetProxyResult(hresolver: COpaquePointer?, pproxyresult: COpaquePointer?): UInt

public expect fun winHttpGetProxyResultEx(hresolver: COpaquePointer?, pproxyresultex: COpaquePointer?): UInt

public expect fun winHttpGetProxySettingsEx(hresolver: COpaquePointer?, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: COpaquePointer?, pcontext: ULong): UInt

public expect fun winHttpGetProxySettingsResultEx(hresolver: COpaquePointer?, pproxysettingsex: COpaquePointer?): UInt

public expect fun winHttpGetProxySettingsVersion(hsession: COpaquePointer?, pdwproxysettingsversion: COpaquePointer?): UInt

public expect fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): COpaquePointer?

public expect fun winHttpOpenRequest(hconnect: COpaquePointer?, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: COpaquePointer?, dwflags: WinhttpOpenRequestFlags): COpaquePointer?

public expect fun winHttpQueryAuthSchemes(hrequest: COpaquePointer?, lpdwsupportedschemes: COpaquePointer?, lpdwfirstscheme: COpaquePointer?, pdwauthtarget: COpaquePointer?): Bool

public expect fun winHttpQueryConnectionGroup(hinternet: COpaquePointer?, pguidconnection: COpaquePointer?, ullflags: ULong, ppresult: COpaquePointer?): UInt

public expect fun winHttpQueryDataAvailable(hrequest: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?): Bool

public expect fun winHttpQueryHeaders(hrequest: COpaquePointer?, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool

public expect fun winHttpQueryHeadersEx(hrequest: COpaquePointer?, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: COpaquePointer?, pheadername: COpaquePointer?, pbuffer: COpaquePointer?, pdwbufferlength: COpaquePointer?, ppheaders: COpaquePointer?, pdwheaderscount: COpaquePointer?): UInt

public expect fun winHttpQueryOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool

public expect fun winHttpReadData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool

public expect fun winHttpReadDataEx(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?, ullflags: ULong, cbproperty: UInt, pvproperty: COpaquePointer?): UInt

public expect fun winHttpReadProxySettings(hsession: COpaquePointer?, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: COpaquePointer?, pfdefaultsettingsarereturned: COpaquePointer?, pwinhttpproxysettings: COpaquePointer?): UInt

public expect fun winHttpReceiveResponse(hrequest: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: COpaquePointer?, hregistration: COpaquePointer?): UInt

public expect fun winHttpResetAutoProxy(hsession: COpaquePointer?, dwflags: UInt): UInt

public expect fun winHttpSendRequest(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool

public expect fun winHttpSetCredentials(hrequest: COpaquePointer?, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: COpaquePointer?): Bool

public expect fun winHttpSetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool

public expect fun winHttpSetOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool

public expect fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt

public expect fun winHttpSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback

public expect fun winHttpSetTimeouts(hinternet: COpaquePointer?, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool

public expect fun winHttpTimeFromSystemTime(pst: COpaquePointer?, pwsztime: Pwstr): Bool

public expect fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: COpaquePointer?): Bool

public expect fun winHttpUnregisterProxyChangeNotification(hregistration: COpaquePointer?): UInt

public expect fun winHttpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt

public expect fun winHttpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, pcontext: ULong): COpaquePointer?

public expect fun winHttpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): UInt

public expect fun winHttpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pebuffertype: COpaquePointer?): UInt

public expect fun winHttpWebSocketSend(hwebsocket: COpaquePointer?, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): UInt

public expect fun winHttpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt

public expect fun winHttpWriteData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool

public expect fun winHttpWriteProxySettings(hsession: COpaquePointer?, fforceupdate: Bool, pwinhttpproxysettings: COpaquePointer?): UInt

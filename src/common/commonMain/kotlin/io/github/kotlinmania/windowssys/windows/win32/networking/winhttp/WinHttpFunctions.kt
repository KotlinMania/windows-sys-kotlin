package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun winHttpAddRequestHeaders(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool

public expect fun winHttpAddRequestHeadersEx(hrequest: MutPtr, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr): UInt

public expect fun winHttpCheckPlatform(): Bool

public expect fun winHttpCloseHandle(hinternet: MutPtr): Bool

public expect fun winHttpConnect(hsession: MutPtr, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr

public expect fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr): Bool

public expect fun winHttpCreateProxyResolver(hsession: ConstPtr, phresolver: MutPtr): UInt

public expect fun winHttpCreateUrl(lpurlcomponents: ConstPtr, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr): Bool

public expect fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr): Bool

public expect fun winHttpFreeProxyResult(pproxyresult: MutPtr)

public expect fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr)

public expect fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr)

public expect fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr): UInt

public expect fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr)

public expect fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool

public expect fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr): Bool

public expect fun winHttpGetProxyForUrl(hsession: MutPtr, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr, pproxyinfo: MutPtr): Bool

public expect fun winHttpGetProxyForUrlEx(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, pcontext: ULong): UInt

public expect fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr, pcontext: ULong): UInt

public expect fun winHttpGetProxyResult(hresolver: ConstPtr, pproxyresult: MutPtr): UInt

public expect fun winHttpGetProxyResultEx(hresolver: ConstPtr, pproxyresultex: MutPtr): UInt

public expect fun winHttpGetProxySettingsEx(hresolver: ConstPtr, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr, pcontext: ULong): UInt

public expect fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr, pproxysettingsex: MutPtr): UInt

public expect fun winHttpGetProxySettingsVersion(hsession: ConstPtr, pdwproxysettingsversion: MutPtr): UInt

public expect fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr

public expect fun winHttpOpenRequest(hconnect: MutPtr, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr, dwflags: WinhttpOpenRequestFlags): MutPtr

public expect fun winHttpQueryAuthSchemes(hrequest: MutPtr, lpdwsupportedschemes: MutPtr, lpdwfirstscheme: MutPtr, pdwauthtarget: MutPtr): Bool

public expect fun winHttpQueryConnectionGroup(hinternet: ConstPtr, pguidconnection: ConstPtr, ullflags: ULong, ppresult: MutPtr): UInt

public expect fun winHttpQueryDataAvailable(hrequest: MutPtr, lpdwnumberofbytesavailable: MutPtr): Bool

public expect fun winHttpQueryHeaders(hrequest: MutPtr, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool

public expect fun winHttpQueryHeadersEx(hrequest: ConstPtr, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr, pheadername: ConstPtr, pbuffer: MutPtr, pdwbufferlength: MutPtr, ppheaders: MutPtr, pdwheaderscount: MutPtr): UInt

public expect fun winHttpQueryOption(hinternet: MutPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool

public expect fun winHttpReadData(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool

public expect fun winHttpReadDataEx(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr): UInt

public expect fun winHttpReadProxySettings(hsession: ConstPtr, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr, pfdefaultsettingsarereturned: MutPtr, pwinhttpproxysettings: MutPtr): UInt

public expect fun winHttpReceiveResponse(hrequest: MutPtr, lpreserved: MutPtr): Bool

public expect fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr, hregistration: MutPtr): UInt

public expect fun winHttpResetAutoProxy(hsession: ConstPtr, dwflags: UInt): UInt

public expect fun winHttpSendRequest(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool

public expect fun winHttpSetCredentials(hrequest: MutPtr, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr): Bool

public expect fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool

public expect fun winHttpSetOption(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool

public expect fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt

public expect fun winHttpSetStatusCallback(hinternet: MutPtr, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback

public expect fun winHttpSetTimeouts(hinternet: MutPtr, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool

public expect fun winHttpTimeFromSystemTime(pst: ConstPtr, pwsztime: Pwstr): Bool

public expect fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr): Bool

public expect fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr): UInt

public expect fun winHttpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt

public expect fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr, pcontext: ULong): MutPtr

public expect fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): UInt

public expect fun winHttpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pebuffertype: MutPtr): UInt

public expect fun winHttpWebSocketSend(hwebsocket: ConstPtr, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): UInt

public expect fun winHttpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt

public expect fun winHttpWriteData(hrequest: MutPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool

public expect fun winHttpWriteProxySettings(hsession: ConstPtr, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr): UInt

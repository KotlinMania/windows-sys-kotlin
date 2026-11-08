package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(ullflags: ULong, pvcontext: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(hinternet: Long, dwcontext: ULong, dwinternetstatus: UInt, lpvstatusinformation: Long, dwstatusinformationlength: UInt)
}

public fun WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: UInt): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpAddRequestHeaders", longArrayOf(hrequest, lpszheaders, dwheaderslength.toLong(), dwmodifiers.toLong())).toInt()
}

public fun WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpAddRequestHeadersEx", longArrayOf(hrequest, dwmodifiers.toLong(), ullflags.toLong(), ullextra.toLong(), cheaders.toLong(), pheaders)).toUInt()
}

public fun WinHttpCheckPlatform(): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpCheckPlatform", longArrayOf()).toInt()
}

public fun WinHttpCloseHandle(hinternet: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpCloseHandle", longArrayOf(hinternet)).toInt()
}

public fun WinHttpConnect(hsession: Long, pswzservername: PCWSTR, nserverport: UShort, dwreserved: UInt): Long {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpConnect", longArrayOf(hsession, pswzservername, nserverport.toLong(), dwreserved.toLong()))
}

public fun WinHttpCrackUrl(pwszurl: PCWSTR, dwurllength: UInt, dwflags: UInt, lpurlcomponents: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpCrackUrl", longArrayOf(pwszurl, dwurllength.toLong(), dwflags.toLong(), lpurlcomponents)).toInt()
}

public fun WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpCreateProxyResolver", longArrayOf(hsession, phresolver)).toUInt()
}

public fun WinHttpCreateUrl(lpurlcomponents: Long, dwflags: WIN_HTTP_CREATE_URL_FLAGS, pwszurl: PWSTR, pdwurllength: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpCreateUrl", longArrayOf(lpurlcomponents, dwflags.toLong(), pwszurl, pdwurllength)).toInt()
}

public fun WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpDetectAutoProxyConfigUrl", longArrayOf(dwautodetectflags.toLong(), ppwstrautoconfigurl)).toInt()
}

public fun WinHttpFreeProxyResult(pproxyresult: Long) {
    Win32DynamicFfi.invoke("winhttp.dll", "WinHttpFreeProxyResult", longArrayOf(pproxyresult))
}

public fun WinHttpFreeProxyResultEx(pproxyresultex: Long) {
    Win32DynamicFfi.invoke("winhttp.dll", "WinHttpFreeProxyResultEx", longArrayOf(pproxyresultex))
}

public fun WinHttpFreeProxySettings(pwinhttpproxysettings: Long) {
    Win32DynamicFfi.invoke("winhttp.dll", "WinHttpFreeProxySettings", longArrayOf(pwinhttpproxysettings))
}

public fun WinHttpFreeProxySettingsEx(proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsex: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpFreeProxySettingsEx", longArrayOf(proxysettingstype.toLong(), pproxysettingsex)).toUInt()
}

public fun WinHttpFreeQueryConnectionGroupResult(presult: Long) {
    Win32DynamicFfi.invoke("winhttp.dll", "WinHttpFreeQueryConnectionGroupResult", longArrayOf(presult))
}

public fun WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetDefaultProxyConfiguration", longArrayOf(pproxyinfo)).toInt()
}

public fun WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetIEProxyConfigForCurrentUser", longArrayOf(pproxyconfig)).toInt()
}

public fun WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: PCWSTR, pautoproxyoptions: Long, pproxyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxyForUrl", longArrayOf(hsession, lpcwszurl, pautoproxyoptions, pproxyinfo)).toInt()
}

public fun WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, pcontext: ULong): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxyForUrlEx", longArrayOf(hresolver, pcwszurl, pautoproxyoptions, pcontext.toLong())).toUInt()
}

public fun WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: Long, pcontext: ULong): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxyForUrlEx2", longArrayOf(hresolver, pcwszurl, pautoproxyoptions, cbinterfaceselectioncontext.toLong(), pinterfaceselectioncontext, pcontext.toLong())).toUInt()
}

public fun WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxyResult", longArrayOf(hresolver, pproxyresult)).toUInt()
}

public fun WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxyResultEx", longArrayOf(hresolver, pproxyresultex)).toUInt()
}

public fun WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsparam: Long, pcontext: ULong): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxySettingsEx", longArrayOf(hresolver, proxysettingstype.toLong(), pproxysettingsparam, pcontext.toLong())).toUInt()
}

public fun WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxySettingsResultEx", longArrayOf(hresolver, pproxysettingsex)).toUInt()
}

public fun WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpGetProxySettingsVersion", longArrayOf(hsession, pdwproxysettingsversion)).toUInt()
}

public fun WinHttpOpen(pszagentw: PCWSTR, dwaccesstype: WINHTTP_ACCESS_TYPE, pszproxyw: PCWSTR, pszproxybypassw: PCWSTR, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpOpen", longArrayOf(pszagentw, dwaccesstype.toLong(), pszproxyw, pszproxybypassw, dwflags.toLong()))
}

public fun WinHttpOpenRequest(hconnect: Long, pwszverb: PCWSTR, pwszobjectname: PCWSTR, pwszversion: PCWSTR, pwszreferrer: PCWSTR, ppwszaccepttypes: Long, dwflags: WINHTTP_OPEN_REQUEST_FLAGS): Long {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpOpenRequest", longArrayOf(hconnect, pwszverb, pwszobjectname, pwszversion, pwszreferrer, ppwszaccepttypes, dwflags.toLong()))
}

public fun WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpQueryAuthSchemes", longArrayOf(hrequest, lpdwsupportedschemes, lpdwfirstscheme, pdwauthtarget)).toInt()
}

public fun WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: ULong, ppresult: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpQueryConnectionGroup", longArrayOf(hinternet, pguidconnection, ullflags.toLong(), ppresult)).toUInt()
}

public fun WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpQueryDataAvailable", longArrayOf(hrequest, lpdwnumberofbytesavailable)).toInt()
}

public fun WinHttpQueryHeaders(hrequest: Long, dwinfolevel: UInt, pwszname: PCWSTR, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpQueryHeaders", longArrayOf(hrequest, dwinfolevel.toLong(), pwszname, lpbuffer, lpdwbufferlength, lpdwindex)).toInt()
}

public fun WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpQueryHeadersEx", longArrayOf(hrequest, dwinfolevel.toLong(), ullflags.toLong(), uicodepage.toLong(), pdwindex, pheadername, pbuffer, pdwbufferlength, ppheaders, pdwheaderscount)).toUInt()
}

public fun WinHttpQueryOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpQueryOption", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, lpdwbufferlength)).toInt()
}

public fun WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpReadData", longArrayOf(hrequest, lpbuffer, dwnumberofbytestoread.toLong(), lpdwnumberofbytesread)).toInt()
}

public fun WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long, ullflags: ULong, cbproperty: UInt, pvproperty: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpReadDataEx", longArrayOf(hrequest, lpbuffer, dwnumberofbytestoread.toLong(), lpdwnumberofbytesread, ullflags.toLong(), cbproperty.toLong(), pvproperty)).toUInt()
}

public fun WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: PCWSTR, ffallbacktodefaultsettings: BOOL, fsetautodiscoverfordefaultsettings: BOOL, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpReadProxySettings", longArrayOf(hsession, pcwszconnectionname, ffallbacktodefaultsettings.toLong(), fsetautodiscoverfordefaultsettings.toLong(), pdwsettingsversion, pfdefaultsettingsarereturned, pwinhttpproxysettings)).toUInt()
}

public fun WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpReceiveResponse", longArrayOf(hrequest, lpreserved)).toInt()
}

public fun WinHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WINHTTP_PROXY_CHANGE_CALLBACK, pvcontext: Long, hregistration: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpRegisterProxyChangeNotification", longArrayOf(ullflags.toLong(), Win32DynamicFfi.objectSlot(pfncallback), pvcontext, hregistration)).toUInt()
}

public fun WinHttpResetAutoProxy(hsession: Long, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpResetAutoProxy", longArrayOf(hsession, dwflags.toLong())).toUInt()
}

public fun WinHttpSendRequest(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSendRequest", longArrayOf(hrequest, lpszheaders, dwheaderslength.toLong(), lpoptional, dwoptionallength.toLong(), dwtotallength.toLong(), dwcontext.toLong())).toInt()
}

public fun WinHttpSetCredentials(hrequest: Long, authtargets: UInt, authscheme: UInt, pwszusername: PCWSTR, pwszpassword: PCWSTR, pauthparams: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSetCredentials", longArrayOf(hrequest, authtargets.toLong(), authscheme.toLong(), pwszusername, pwszpassword, pauthparams)).toInt()
}

public fun WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSetDefaultProxyConfiguration", longArrayOf(pproxyinfo)).toInt()
}

public fun WinHttpSetOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSetOption", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, dwbufferlength.toLong())).toInt()
}

public fun WinHttpSetProxySettingsPerUser(fproxysettingsperuser: BOOL): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSetProxySettingsPerUser", longArrayOf(fproxysettingsperuser.toLong())).toUInt()
}

public fun WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: WINHTTP_STATUS_CALLBACK, dwnotificationflags: UInt, dwreserved: ULong): WINHTTP_STATUS_CALLBACK {
    val rawRet = Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSetStatusCallback", longArrayOf(hinternet, Win32DynamicFfi.objectSlot(lpfninternetcallback), dwnotificationflags.toLong(), dwreserved.toLong()))
    return if (rawRet == 0L) null else WINHTTP_STATUS_CALLBACKFn { p0, p1, p2, p3, p4 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1.toLong(), p2.toLong(), p3, p4.toLong())) }
}

public fun WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpSetTimeouts", longArrayOf(hinternet, nresolvetimeout.toLong(), nconnecttimeout.toLong(), nsendtimeout.toLong(), nreceivetimeout.toLong())).toInt()
}

public fun WinHttpTimeFromSystemTime(pst: Long, pwsztime: PWSTR): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpTimeFromSystemTime", longArrayOf(pst, pwsztime)).toInt()
}

public fun WinHttpTimeToSystemTime(pwsztime: PCWSTR, pst: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpTimeToSystemTime", longArrayOf(pwsztime, pst)).toInt()
}

public fun WinHttpUnregisterProxyChangeNotification(hregistration: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpUnregisterProxyChangeNotification", longArrayOf(hregistration)).toUInt()
}

public fun WinHttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWebSocketClose", longArrayOf(hwebsocket, usstatus.toLong(), pvreason, dwreasonlength.toLong())).toUInt()
}

public fun WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: ULong): Long {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWebSocketCompleteUpgrade", longArrayOf(hrequest, pcontext.toLong()))
}

public fun WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWebSocketQueryCloseStatus", longArrayOf(hwebsocket, pusstatus, pvreason, dwreasonlength.toLong(), pdwreasonlengthconsumed)).toUInt()
}

public fun WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pebuffertype: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWebSocketReceive", longArrayOf(hwebsocket, pvbuffer, dwbufferlength.toLong(), pdwbytesread, pebuffertype)).toUInt()
}

public fun WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: WINHTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWebSocketSend", longArrayOf(hwebsocket, ebuffertype.toLong(), pvbuffer, dwbufferlength.toLong())).toUInt()
}

public fun WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWebSocketShutdown", longArrayOf(hwebsocket, usstatus.toLong(), pvreason, dwreasonlength.toLong())).toUInt()
}

public fun WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWriteData", longArrayOf(hrequest, lpbuffer, dwnumberofbytestowrite.toLong(), lpdwnumberofbyteswritten)).toInt()
}

public fun WinHttpWriteProxySettings(hsession: Long, fforceupdate: BOOL, pwinhttpproxysettings: Long): UInt {
    return Win32DynamicFfi.invoke("winhttp.dll", "WinHttpWriteProxySettings", longArrayOf(hsession, fforceupdate.toLong(), pwinhttpproxysettings)).toUInt()
}

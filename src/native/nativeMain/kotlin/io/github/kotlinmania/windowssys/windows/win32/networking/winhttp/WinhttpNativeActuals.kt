@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun WinHttpAddRequestHeaders(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders(hrequest.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun WinHttpAddRequestHeadersEx(hrequest: Long, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx(hrequest.toCPointer<ByteVar>(), dwmodifiers, ullflags, ullextra, cheaders, pheaders.toCPointer<ByteVar>())

public actual fun WinHttpCheckPlatform(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform()

public actual fun WinHttpCloseHandle(hinternet: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle(hinternet.toCPointer<ByteVar>())

public actual fun WinHttpConnect(hsession: Long, pswzservername: PCWSTR, nserverport: UShort, dwreserved: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpConnect(hsession.toCPointer<ByteVar>(), pswzservername.toCPointer<ByteVar>(), nserverport, dwreserved)?.toLong() ?: 0L

public actual fun WinHttpCrackUrl(pwszurl: PCWSTR, dwurllength: UInt, dwflags: UInt, lpurlcomponents: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl(pwszurl.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents.toCPointer<ByteVar>())

public actual fun WinHttpCreateProxyResolver(hsession: Long, phresolver: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver(hsession.toCPointer<ByteVar>(), phresolver.toCPointer<ByteVar>())

public actual fun WinHttpCreateUrl(lpurlcomponents: Long, dwflags: WIN_HTTP_CREATE_URL_FLAGS, pwszurl: PWSTR, pdwurllength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl(lpurlcomponents.toCPointer<ByteVar>(), dwflags, pwszurl.toCPointer<ByteVar>(), pdwurllength.toCPointer<ByteVar>())

public actual fun WinHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl(dwautodetectflags, ppwstrautoconfigurl.toCPointer<ByteVar>())

public actual fun WinHttpFreeProxyResult(pproxyresult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult(pproxyresult.toCPointer<ByteVar>())
}

public actual fun WinHttpFreeProxyResultEx(pproxyresultex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx(pproxyresultex.toCPointer<ByteVar>())
}

public actual fun WinHttpFreeProxySettings(pwinhttpproxysettings: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings(pwinhttpproxysettings.toCPointer<ByteVar>())
}

public actual fun WinHttpFreeProxySettingsEx(proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.toCPointer<ByteVar>())

public actual fun WinHttpFreeQueryConnectionGroupResult(presult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult(presult.toCPointer<ByteVar>())
}

public actual fun WinHttpGetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration(pproxyinfo.toCPointer<ByteVar>())

public actual fun WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.toCPointer<ByteVar>())

public actual fun WinHttpGetProxyForUrl(hsession: Long, lpcwszurl: PCWSTR, pautoproxyoptions: Long, pproxyinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl(hsession.toCPointer<ByteVar>(), lpcwszurl.toCPointer<ByteVar>(), pautoproxyoptions.toCPointer<ByteVar>(), pproxyinfo.toCPointer<ByteVar>())

public actual fun WinHttpGetProxyForUrlEx(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, pcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx(hresolver.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), pautoproxyoptions.toCPointer<ByteVar>(), pcontext)

public actual fun WinHttpGetProxyForUrlEx2(hresolver: Long, pcwszurl: PCWSTR, pautoproxyoptions: Long, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: Long, pcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2(hresolver.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), pautoproxyoptions.toCPointer<ByteVar>(), cbinterfaceselectioncontext, pinterfaceselectioncontext.toCPointer<ByteVar>(), pcontext)

public actual fun WinHttpGetProxyResult(hresolver: Long, pproxyresult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult(hresolver.toCPointer<ByteVar>(), pproxyresult.toCPointer<ByteVar>())

public actual fun WinHttpGetProxyResultEx(hresolver: Long, pproxyresultex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx(hresolver.toCPointer<ByteVar>(), pproxyresultex.toCPointer<ByteVar>())

public actual fun WinHttpGetProxySettingsEx(hresolver: Long, proxysettingstype: WINHTTP_PROXY_SETTINGS_TYPE, pproxysettingsparam: Long, pcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx(hresolver.toCPointer<ByteVar>(), proxysettingstype, pproxysettingsparam.toCPointer<ByteVar>(), pcontext)

public actual fun WinHttpGetProxySettingsResultEx(hresolver: Long, pproxysettingsex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx(hresolver.toCPointer<ByteVar>(), pproxysettingsex.toCPointer<ByteVar>())

public actual fun WinHttpGetProxySettingsVersion(hsession: Long, pdwproxysettingsversion: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion(hsession.toCPointer<ByteVar>(), pdwproxysettingsversion.toCPointer<ByteVar>())

public actual fun WinHttpOpen(pszagentw: PCWSTR, dwaccesstype: WINHTTP_ACCESS_TYPE, pszproxyw: PCWSTR, pszproxybypassw: PCWSTR, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpOpen(pszagentw.toCPointer<ByteVar>(), dwaccesstype, pszproxyw.toCPointer<ByteVar>(), pszproxybypassw.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun WinHttpOpenRequest(hconnect: Long, pwszverb: PCWSTR, pwszobjectname: PCWSTR, pwszversion: PCWSTR, pwszreferrer: PCWSTR, ppwszaccepttypes: Long, dwflags: WINHTTP_OPEN_REQUEST_FLAGS): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest(hconnect.toCPointer<ByteVar>(), pwszverb.toCPointer<ByteVar>(), pwszobjectname.toCPointer<ByteVar>(), pwszversion.toCPointer<ByteVar>(), pwszreferrer.toCPointer<ByteVar>(), ppwszaccepttypes.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun WinHttpQueryAuthSchemes(hrequest: Long, lpdwsupportedschemes: Long, lpdwfirstscheme: Long, pdwauthtarget: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes(hrequest.toCPointer<ByteVar>(), lpdwsupportedschemes.toCPointer<ByteVar>(), lpdwfirstscheme.toCPointer<ByteVar>(), pdwauthtarget.toCPointer<ByteVar>())

public actual fun WinHttpQueryConnectionGroup(hinternet: Long, pguidconnection: Long, ullflags: ULong, ppresult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup(hinternet.toCPointer<ByteVar>(), pguidconnection.toCPointer<ByteVar>(), ullflags, ppresult.toCPointer<ByteVar>())

public actual fun WinHttpQueryDataAvailable(hrequest: Long, lpdwnumberofbytesavailable: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable(hrequest.toCPointer<ByteVar>(), lpdwnumberofbytesavailable.toCPointer<ByteVar>())

public actual fun WinHttpQueryHeaders(hrequest: Long, dwinfolevel: UInt, pwszname: PCWSTR, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders(hrequest.toCPointer<ByteVar>(), dwinfolevel, pwszname.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lpdwindex.toCPointer<ByteVar>())

public actual fun WinHttpQueryHeadersEx(hrequest: Long, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: Long, pheadername: Long, pbuffer: Long, pdwbufferlength: Long, ppheaders: Long, pdwheaderscount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx(hrequest.toCPointer<ByteVar>(), dwinfolevel, ullflags, uicodepage, pdwindex.toCPointer<ByteVar>(), pheadername.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), pdwbufferlength.toCPointer<ByteVar>(), ppheaders.toCPointer<ByteVar>(), pdwheaderscount.toCPointer<ByteVar>())

public actual fun WinHttpQueryOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpQueryOption(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun WinHttpReadData(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpReadData(hrequest.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.toCPointer<ByteVar>())

public actual fun WinHttpReadDataEx(hrequest: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long, ullflags: ULong, cbproperty: UInt, pvproperty: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx(hrequest.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.toCPointer<ByteVar>(), ullflags, cbproperty, pvproperty.toCPointer<ByteVar>())

public actual fun WinHttpReadProxySettings(hsession: Long, pcwszconnectionname: PCWSTR, ffallbacktodefaultsettings: BOOL, fsetautodiscoverfordefaultsettings: BOOL, pdwsettingsversion: Long, pfdefaultsettingsarereturned: Long, pwinhttpproxysettings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings(hsession.toCPointer<ByteVar>(), pcwszconnectionname.toCPointer<ByteVar>(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.toCPointer<ByteVar>(), pfdefaultsettingsarereturned.toCPointer<ByteVar>(), pwinhttpproxysettings.toCPointer<ByteVar>())

public actual fun WinHttpReceiveResponse(hrequest: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse(hrequest.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun WinHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WINHTTP_PROXY_CHANGE_CALLBACK, pvcontext: Long, hregistration: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification(ullflags, pfncallback.toLong().toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), hregistration.toCPointer<ByteVar>())

public actual fun WinHttpResetAutoProxy(hsession: Long, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy(hsession.toCPointer<ByteVar>(), dwflags)

public actual fun WinHttpSendRequest(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSendRequest(hrequest.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, lpoptional.toCPointer<ByteVar>(), dwoptionallength, dwtotallength, dwcontext)

public actual fun WinHttpSetCredentials(hrequest: Long, authtargets: UInt, authscheme: UInt, pwszusername: PCWSTR, pwszpassword: PCWSTR, pauthparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials(hrequest.toCPointer<ByteVar>(), authtargets, authscheme, pwszusername.toCPointer<ByteVar>(), pwszpassword.toCPointer<ByteVar>(), pauthparams.toCPointer<ByteVar>())

public actual fun WinHttpSetDefaultProxyConfiguration(pproxyinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration(pproxyinfo.toCPointer<ByteVar>())

public actual fun WinHttpSetOption(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSetOption(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), dwbufferlength)

public actual fun WinHttpSetProxySettingsPerUser(fproxysettingsperuser: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser(fproxysettingsperuser)

public actual fun WinHttpSetStatusCallback(hinternet: Long, lpfninternetcallback: WINHTTP_STATUS_CALLBACK, dwnotificationflags: UInt, dwreserved: ULong): WINHTTP_STATUS_CALLBACK =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback(hinternet.toCPointer<ByteVar>(), lpfninternetcallback.toLong().toCPointer<ByteVar>(), dwnotificationflags, dwreserved)?.toLong() ?: 0L

public actual fun WinHttpSetTimeouts(hinternet: Long, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts(hinternet.toCPointer<ByteVar>(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun WinHttpTimeFromSystemTime(pst: Long, pwsztime: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime(pst.toCPointer<ByteVar>(), pwsztime.toCPointer<ByteVar>())

public actual fun WinHttpTimeToSystemTime(pwsztime: PCWSTR, pst: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime(pwsztime.toCPointer<ByteVar>(), pst.toCPointer<ByteVar>())

public actual fun WinHttpUnregisterProxyChangeNotification(hregistration: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification(hregistration.toCPointer<ByteVar>())

public actual fun WinHttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose(hwebsocket.toCPointer<ByteVar>(), usstatus, pvreason.toCPointer<ByteVar>(), dwreasonlength)

public actual fun WinHttpWebSocketCompleteUpgrade(hrequest: Long, pcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade(hrequest.toCPointer<ByteVar>(), pcontext)?.toLong() ?: 0L

public actual fun WinHttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus(hwebsocket.toCPointer<ByteVar>(), pusstatus.toCPointer<ByteVar>(), pvreason.toCPointer<ByteVar>(), dwreasonlength, pdwreasonlengthconsumed.toCPointer<ByteVar>())

public actual fun WinHttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pebuffertype: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive(hwebsocket.toCPointer<ByteVar>(), pvbuffer.toCPointer<ByteVar>(), dwbufferlength, pdwbytesread.toCPointer<ByteVar>(), pebuffertype.toCPointer<ByteVar>())

public actual fun WinHttpWebSocketSend(hwebsocket: Long, ebuffertype: WINHTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend(hwebsocket.toCPointer<ByteVar>(), ebuffertype, pvbuffer.toCPointer<ByteVar>(), dwbufferlength)

public actual fun WinHttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown(hwebsocket.toCPointer<ByteVar>(), usstatus, pvreason.toCPointer<ByteVar>(), dwreasonlength)

public actual fun WinHttpWriteData(hrequest: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWriteData(hrequest.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwnumberofbytestowrite, lpdwnumberofbyteswritten.toCPointer<ByteVar>())

public actual fun WinHttpWriteProxySettings(hsession: Long, fforceupdate: BOOL, pwinhttpproxysettings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings(hsession.toCPointer<ByteVar>(), fforceupdate, pwinhttpproxysettings.toCPointer<ByteVar>())

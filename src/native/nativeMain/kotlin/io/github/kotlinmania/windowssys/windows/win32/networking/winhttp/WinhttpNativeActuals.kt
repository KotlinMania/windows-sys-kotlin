@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun winHttpAddRequestHeaders(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeaders(hrequest?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun winHttpAddRequestHeadersEx(hrequest: COpaquePointer?, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeadersEx(hrequest?.value?.toCPointer<ByteVar>(), dwmodifiers, ullflags, ullextra, cheaders, pheaders?.value?.toCPointer<ByteVar>())

public actual fun winHttpCheckPlatform(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpCloseHandle(hinternet?.value?.toCPointer<ByteVar>())

public actual fun winHttpConnect(hsession: COpaquePointer?, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpConnect(hsession?.value?.toCPointer<ByteVar>(), pswzservername?.value?.toCPointer<ByteVar>(), nserverport, dwreserved)?.let { COpaquePointer(it.toLong()) }

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpCrackUrl(pwszurl?.value?.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents?.value?.toCPointer<ByteVar>())

public actual fun winHttpCreateProxyResolver(hsession: COpaquePointer?, phresolver: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpCreateProxyResolver(hsession?.value?.toCPointer<ByteVar>(), phresolver?.value?.toCPointer<ByteVar>())

public actual fun winHttpCreateUrl(lpurlcomponents: COpaquePointer?, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpCreateUrl(lpurlcomponents?.value?.toCPointer<ByteVar>(), dwflags, pwszurl?.value?.toCPointer<ByteVar>(), pdwurllength?.value?.toCPointer<ByteVar>())

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpDetectAutoProxyConfigUrl(dwautodetectflags, ppwstrautoconfigurl?.value?.toCPointer<ByteVar>())

public actual fun winHttpFreeProxyResult(pproxyresult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResult(pproxyresult?.value?.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResultEx(pproxyresultex?.value?.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettings(pwinhttpproxysettings?.value?.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex?.value?.toCPointer<ByteVar>())

public actual fun winHttpFreeQueryConnectionGroupResult(presult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpFreeQueryConnectionGroupResult(presult?.value?.toCPointer<ByteVar>())
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetDefaultProxyConfiguration(pproxyinfo?.value?.toCPointer<ByteVar>())

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetIEProxyConfigForCurrentUser(pproxyconfig?.value?.toCPointer<ByteVar>())

public actual fun winHttpGetProxyForUrl(hsession: COpaquePointer?, lpcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pproxyinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrl(hsession?.value?.toCPointer<ByteVar>(), lpcwszurl?.value?.toCPointer<ByteVar>(), pautoproxyoptions?.value?.toCPointer<ByteVar>(), pproxyinfo?.value?.toCPointer<ByteVar>())

public actual fun winHttpGetProxyForUrlEx(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, pcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx(hresolver?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), pautoproxyoptions?.value?.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxyForUrlEx2(hresolver: COpaquePointer?, pcwszurl: Pcwstr, pautoproxyoptions: COpaquePointer?, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: COpaquePointer?, pcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx2(hresolver?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), pautoproxyoptions?.value?.toCPointer<ByteVar>(), cbinterfaceselectioncontext, pinterfaceselectioncontext?.value?.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxyResult(hresolver: COpaquePointer?, pproxyresult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxyResult(hresolver?.value?.toCPointer<ByteVar>(), pproxyresult?.value?.toCPointer<ByteVar>())

public actual fun winHttpGetProxyResultEx(hresolver: COpaquePointer?, pproxyresultex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxyResultEx(hresolver?.value?.toCPointer<ByteVar>(), pproxyresultex?.value?.toCPointer<ByteVar>())

public actual fun winHttpGetProxySettingsEx(hresolver: COpaquePointer?, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: COpaquePointer?, pcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsEx(hresolver?.value?.toCPointer<ByteVar>(), proxysettingstype, pproxysettingsparam?.value?.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxySettingsResultEx(hresolver: COpaquePointer?, pproxysettingsex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsResultEx(hresolver?.value?.toCPointer<ByteVar>(), pproxysettingsex?.value?.toCPointer<ByteVar>())

public actual fun winHttpGetProxySettingsVersion(hsession: COpaquePointer?, pdwproxysettingsversion: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsVersion(hsession?.value?.toCPointer<ByteVar>(), pdwproxysettingsversion?.value?.toCPointer<ByteVar>())

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpOpen(pszagentw?.value?.toCPointer<ByteVar>(), dwaccesstype, pszproxyw?.value?.toCPointer<ByteVar>(), pszproxybypassw?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun winHttpOpenRequest(hconnect: COpaquePointer?, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: COpaquePointer?, dwflags: WinhttpOpenRequestFlags): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpOpenRequest(hconnect?.value?.toCPointer<ByteVar>(), pwszverb?.value?.toCPointer<ByteVar>(), pwszobjectname?.value?.toCPointer<ByteVar>(), pwszversion?.value?.toCPointer<ByteVar>(), pwszreferrer?.value?.toCPointer<ByteVar>(), ppwszaccepttypes?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun winHttpQueryAuthSchemes(hrequest: COpaquePointer?, lpdwsupportedschemes: COpaquePointer?, lpdwfirstscheme: COpaquePointer?, pdwauthtarget: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpQueryAuthSchemes(hrequest?.value?.toCPointer<ByteVar>(), lpdwsupportedschemes?.value?.toCPointer<ByteVar>(), lpdwfirstscheme?.value?.toCPointer<ByteVar>(), pdwauthtarget?.value?.toCPointer<ByteVar>())

public actual fun winHttpQueryConnectionGroup(hinternet: COpaquePointer?, pguidconnection: COpaquePointer?, ullflags: ULong, ppresult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpQueryConnectionGroup(hinternet?.value?.toCPointer<ByteVar>(), pguidconnection?.value?.toCPointer<ByteVar>(), ullflags, ppresult?.value?.toCPointer<ByteVar>())

public actual fun winHttpQueryDataAvailable(hrequest: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpQueryDataAvailable(hrequest?.value?.toCPointer<ByteVar>(), lpdwnumberofbytesavailable?.value?.toCPointer<ByteVar>())

public actual fun winHttpQueryHeaders(hrequest: COpaquePointer?, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpQueryHeaders(hrequest?.value?.toCPointer<ByteVar>(), dwinfolevel, pwszname?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpdwindex?.value?.toCPointer<ByteVar>())

public actual fun winHttpQueryHeadersEx(hrequest: COpaquePointer?, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: COpaquePointer?, pheadername: COpaquePointer?, pbuffer: COpaquePointer?, pdwbufferlength: COpaquePointer?, ppheaders: COpaquePointer?, pdwheaderscount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpQueryHeadersEx(hrequest?.value?.toCPointer<ByteVar>(), dwinfolevel, ullflags, uicodepage, pdwindex?.value?.toCPointer<ByteVar>(), pheadername?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), pdwbufferlength?.value?.toCPointer<ByteVar>(), ppheaders?.value?.toCPointer<ByteVar>(), pdwheaderscount?.value?.toCPointer<ByteVar>())

public actual fun winHttpQueryOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpQueryOption(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun winHttpReadData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpReadData(hrequest?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread?.value?.toCPointer<ByteVar>())

public actual fun winHttpReadDataEx(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?, ullflags: ULong, cbproperty: UInt, pvproperty: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpReadDataEx(hrequest?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread?.value?.toCPointer<ByteVar>(), ullflags, cbproperty, pvproperty?.value?.toCPointer<ByteVar>())

public actual fun winHttpReadProxySettings(hsession: COpaquePointer?, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: COpaquePointer?, pfdefaultsettingsarereturned: COpaquePointer?, pwinhttpproxysettings: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpReadProxySettings(hsession?.value?.toCPointer<ByteVar>(), pcwszconnectionname?.value?.toCPointer<ByteVar>(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion?.value?.toCPointer<ByteVar>(), pfdefaultsettingsarereturned?.value?.toCPointer<ByteVar>(), pwinhttpproxysettings?.value?.toCPointer<ByteVar>())

public actual fun winHttpReceiveResponse(hrequest: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpReceiveResponse(hrequest?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: COpaquePointer?, hregistration: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpRegisterProxyChangeNotification(ullflags, 0L.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>(), hregistration?.value?.toCPointer<ByteVar>())

public actual fun winHttpResetAutoProxy(hsession: COpaquePointer?, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpResetAutoProxy(hsession?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun winHttpSendRequest(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpSendRequest(hrequest?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, lpoptional?.value?.toCPointer<ByteVar>(), dwoptionallength, dwtotallength, dwcontext)

public actual fun winHttpSetCredentials(hrequest: COpaquePointer?, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpSetCredentials(hrequest?.value?.toCPointer<ByteVar>(), authtargets, authscheme, pwszusername?.value?.toCPointer<ByteVar>(), pwszpassword?.value?.toCPointer<ByteVar>(), pauthparams?.value?.toCPointer<ByteVar>())

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpSetDefaultProxyConfiguration(pproxyinfo?.value?.toCPointer<ByteVar>())

public actual fun winHttpSetOption(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpSetOption(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength)

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpSetProxySettingsPerUser(fproxysettingsperuser)

public actual fun winHttpSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    null

public actual fun winHttpSetTimeouts(hinternet: COpaquePointer?, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpSetTimeouts(hinternet?.value?.toCPointer<ByteVar>(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun winHttpTimeFromSystemTime(pst: COpaquePointer?, pwsztime: Pwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpTimeFromSystemTime(pst?.value?.toCPointer<ByteVar>(), pwsztime?.value?.toCPointer<ByteVar>())

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpTimeToSystemTime(pwsztime?.value?.toCPointer<ByteVar>(), pst?.value?.toCPointer<ByteVar>())

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpUnregisterProxyChangeNotification(hregistration?.value?.toCPointer<ByteVar>())

public actual fun winHttpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWebSocketClose(hwebsocket?.value?.toCPointer<ByteVar>(), usstatus, pvreason?.value?.toCPointer<ByteVar>(), dwreasonlength)

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, pcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWebSocketCompleteUpgrade(hrequest?.value?.toCPointer<ByteVar>(), pcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWebSocketQueryCloseStatus(hwebsocket?.value?.toCPointer<ByteVar>(), pusstatus?.value?.toCPointer<ByteVar>(), pvreason?.value?.toCPointer<ByteVar>(), dwreasonlength, pdwreasonlengthconsumed?.value?.toCPointer<ByteVar>())

public actual fun winHttpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pebuffertype: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWebSocketReceive(hwebsocket?.value?.toCPointer<ByteVar>(), pvbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, pdwbytesread?.value?.toCPointer<ByteVar>(), pebuffertype?.value?.toCPointer<ByteVar>())

public actual fun winHttpWebSocketSend(hwebsocket: COpaquePointer?, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWebSocketSend(hwebsocket?.value?.toCPointer<ByteVar>(), ebuffertype, pvbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength)

public actual fun winHttpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWebSocketShutdown(hwebsocket?.value?.toCPointer<ByteVar>(), usstatus, pvreason?.value?.toCPointer<ByteVar>(), dwreasonlength)

public actual fun winHttpWriteData(hrequest: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWriteData(hrequest?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwnumberofbytestowrite, lpdwnumberofbyteswritten?.value?.toCPointer<ByteVar>())

public actual fun winHttpWriteProxySettings(hsession: COpaquePointer?, fforceupdate: Bool, pwinhttpproxysettings: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssys_windows_win32_networking_winhttp_winHttpWriteProxySettings(hsession?.value?.toCPointer<ByteVar>(), fforceupdate, pwinhttpproxysettings?.value?.toCPointer<ByteVar>())

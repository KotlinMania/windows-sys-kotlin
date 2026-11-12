@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpConnect
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpOpen
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpReadData
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.cinterop.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun winHttpAddRequestHeaders(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest.rawAddress.toCPointer<ByteVar>(), lpszheaders.rawAddress.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest.rawAddress.toCPointer<ByteVar>(), dwmodifiers, ullflags, ullextra, cheaders, pheaders.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpCheckPlatform(): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpConnect(hsession: MutPtr, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession.rawAddress.toCPointer<ByteVar>(), pswzservername.rawAddress.toCPointer<ByteVar>(), nserverport, dwreserved)?.toLong() ?: 0L)

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl.rawAddress.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr, phresolver: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession.rawAddress.toCPointer<ByteVar>(), phresolver.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents.rawAddress.toCPointer<ByteVar>(), dwflags, pwszurl.rawAddress.toCPointer<ByteVar>(), pdwurllength.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags, ppwstrautoconfigurl.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxyForUrl(hsession: MutPtr, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr, pproxyinfo: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession.rawAddress.toCPointer<ByteVar>(), lpcwszurl.rawAddress.toCPointer<ByteVar>(), pautoproxyoptions.rawAddress.toCPointer<ByteVar>(), pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, pcontext: ULong): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver.rawAddress.toCPointer<ByteVar>(), pcwszurl.rawAddress.toCPointer<ByteVar>(), pautoproxyoptions.rawAddress.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr, pcontext: ULong): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver.rawAddress.toCPointer<ByteVar>(), pcwszurl.rawAddress.toCPointer<ByteVar>(), pautoproxyoptions.rawAddress.toCPointer<ByteVar>(), cbinterfaceselectioncontext, pinterfaceselectioncontext.rawAddress.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxyResult(hresolver: ConstPtr, pproxyresult: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver.rawAddress.toCPointer<ByteVar>(), pproxyresult.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr, pproxyresultex: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver.rawAddress.toCPointer<ByteVar>(), pproxyresultex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr, pcontext: ULong): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver.rawAddress.toCPointer<ByteVar>(), proxysettingstype, pproxysettingsparam.rawAddress.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr, pproxysettingsex: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver.rawAddress.toCPointer<ByteVar>(), pproxysettingsex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr, pdwproxysettingsversion: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession.rawAddress.toCPointer<ByteVar>(), pdwproxysettingsversion.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw.rawAddress.toCPointer<ByteVar>(), dwaccesstype, pszproxyw.rawAddress.toCPointer<ByteVar>(), pszproxybypassw.rawAddress.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L)

public actual fun winHttpOpenRequest(hconnect: MutPtr, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr, dwflags: WinhttpOpenRequestFlags): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect.rawAddress.toCPointer<ByteVar>(), pwszverb.rawAddress.toCPointer<ByteVar>(), pwszobjectname.rawAddress.toCPointer<ByteVar>(), pwszversion.rawAddress.toCPointer<ByteVar>(), pwszreferrer.rawAddress.toCPointer<ByteVar>(), ppwszaccepttypes.rawAddress.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L)

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr, lpdwsupportedschemes: MutPtr, lpdwfirstscheme: MutPtr, pdwauthtarget: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest.rawAddress.toCPointer<ByteVar>(), lpdwsupportedschemes.rawAddress.toCPointer<ByteVar>(), lpdwfirstscheme.rawAddress.toCPointer<ByteVar>(), pdwauthtarget.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr, pguidconnection: ConstPtr, ullflags: ULong, ppresult: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet.rawAddress.toCPointer<ByteVar>(), pguidconnection.rawAddress.toCPointer<ByteVar>(), ullflags, ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr, lpdwnumberofbytesavailable: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest.rawAddress.toCPointer<ByteVar>(), lpdwnumberofbytesavailable.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryHeaders(hrequest: MutPtr, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest.rawAddress.toCPointer<ByteVar>(), dwinfolevel, pwszname.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpdwindex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr, pheadername: ConstPtr, pbuffer: MutPtr, pdwbufferlength: MutPtr, ppheaders: MutPtr, pdwheaderscount: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest.rawAddress.toCPointer<ByteVar>(), dwinfolevel, ullflags, uicodepage, pdwindex.rawAddress.toCPointer<ByteVar>(), pheadername.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pdwbufferlength.rawAddress.toCPointer<ByteVar>(), ppheaders.rawAddress.toCPointer<ByteVar>(), pdwheaderscount.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryOption(hinternet: MutPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet.rawAddress.toCPointer<ByteVar>(), dwoption, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReadData(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReadDataEx(hrequest: MutPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.rawAddress.toCPointer<ByteVar>(), ullflags, cbproperty, pvproperty.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReadProxySettings(hsession: ConstPtr, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr, pfdefaultsettingsarereturned: MutPtr, pwinhttpproxysettings: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession.rawAddress.toCPointer<ByteVar>(), pcwszconnectionname.rawAddress.toCPointer<ByteVar>(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.rawAddress.toCPointer<ByteVar>(), pfdefaultsettingsarereturned.rawAddress.toCPointer<ByteVar>(), pwinhttpproxysettings.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReceiveResponse(hrequest: MutPtr, lpreserved: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr, hregistration: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags, 0L.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), hregistration.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpResetAutoProxy(hsession: ConstPtr, dwflags: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun winHttpSendRequest(hrequest: MutPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest.rawAddress.toCPointer<ByteVar>(), lpszheaders.rawAddress.toCPointer<ByteVar>(), dwheaderslength, lpoptional.rawAddress.toCPointer<ByteVar>(), dwoptionallength, dwtotallength, dwcontext)

public actual fun winHttpSetCredentials(hrequest: MutPtr, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest.rawAddress.toCPointer<ByteVar>(), authtargets, authscheme, pwszusername.rawAddress.toCPointer<ByteVar>(), pwszpassword.rawAddress.toCPointer<ByteVar>(), pauthparams.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpSetOption(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet.rawAddress.toCPointer<ByteVar>(), dwoption, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength)

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser)

public actual fun winHttpSetStatusCallback(hinternet: MutPtr, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    null

public actual fun winHttpSetTimeouts(hinternet: MutPtr, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet.rawAddress.toCPointer<ByteVar>(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr, pwsztime: Pwstr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst.rawAddress.toCPointer<ByteVar>(), pwsztime.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime.rawAddress.toCPointer<ByteVar>(), pst.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket.rawAddress.toCPointer<ByteVar>(), usstatus, pvreason.rawAddress.toCPointer<ByteVar>(), dwreasonlength)

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr, pcontext: ULong): MutPtr =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toCPointer<ByteVar>(), pcontext)?.toLong() ?: 0L)

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toCPointer<ByteVar>(), pusstatus.rawAddress.toCPointer<ByteVar>(), pvreason.rawAddress.toCPointer<ByteVar>(), dwreasonlength, pdwreasonlengthconsumed.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pebuffertype: MutPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket.rawAddress.toCPointer<ByteVar>(), pvbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength, pdwbytesread.rawAddress.toCPointer<ByteVar>(), pebuffertype.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket.rawAddress.toCPointer<ByteVar>(), ebuffertype, pvbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength)

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket.rawAddress.toCPointer<ByteVar>(), usstatus, pvreason.rawAddress.toCPointer<ByteVar>(), dwreasonlength)

public actual fun winHttpWriteData(hrequest: MutPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestowrite, lpdwnumberofbyteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWriteProxySettings(hsession: ConstPtr, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession.rawAddress.toCPointer<ByteVar>(), fforceupdate, pwinhttpproxysettings.rawAddress.toCPointer<ByteVar>())

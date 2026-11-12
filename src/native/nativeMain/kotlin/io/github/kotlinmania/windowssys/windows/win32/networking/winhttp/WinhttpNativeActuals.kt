@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
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

public actual fun winHttpAddRequestHeaders(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest.rawAddress.toCPointer<ByteVar>(), lpszheaders.rawAddress.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr<CVoid>, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr<WinhttpExtendedHeader>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest.rawAddress.toCPointer<ByteVar>(), dwmodifiers, ullflags, ullextra, cheaders, pheaders.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpCheckPlatform(): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform()

public actual fun winHttpCloseHandle(hinternet: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpConnect(hsession: MutPtr<CVoid>, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession.rawAddress.toCPointer<ByteVar>(), pswzservername.rawAddress.toCPointer<ByteVar>(), nserverport, dwreserved)?.toLong() ?: 0L)

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr<UrlComponents>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl.rawAddress.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr<CVoid>, phresolver: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession.rawAddress.toCPointer<ByteVar>(), phresolver.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr<UrlComponents>, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents.rawAddress.toCPointer<ByteVar>(), dwflags, pwszurl.rawAddress.toCPointer<ByteVar>(), pdwurllength.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr<Pwstr>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags, ppwstrautoconfigurl.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr<WinhttpProxyResult>) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr<WinhttpProxyResultEx>) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr<WinhttpQueryConnectionGroupResult>) {
    windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult.rawAddress.toCPointer<ByteVar>())
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr<WinhttpCurrentUserIeProxyConfig>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxyForUrl(hsession: MutPtr<CVoid>, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr<WinhttpAutoproxyOptions>, pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession.rawAddress.toCPointer<ByteVar>(), lpcwszurl.rawAddress.toCPointer<ByteVar>(), pautoproxyoptions.rawAddress.toCPointer<ByteVar>(), pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, pcontext: ULong): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver.rawAddress.toCPointer<ByteVar>(), pcwszurl.rawAddress.toCPointer<ByteVar>(), pautoproxyoptions.rawAddress.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr<UByte>, pcontext: ULong): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver.rawAddress.toCPointer<ByteVar>(), pcwszurl.rawAddress.toCPointer<ByteVar>(), pautoproxyoptions.rawAddress.toCPointer<ByteVar>(), cbinterfaceselectioncontext, pinterfaceselectioncontext.rawAddress.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxyResult(hresolver: ConstPtr<CVoid>, pproxyresult: MutPtr<WinhttpProxyResult>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver.rawAddress.toCPointer<ByteVar>(), pproxyresult.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr<CVoid>, pproxyresultex: MutPtr<WinhttpProxyResultEx>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver.rawAddress.toCPointer<ByteVar>(), pproxyresultex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr<CVoid>, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr<WinhttpProxySettingsParam>, pcontext: ULong): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver.rawAddress.toCPointer<ByteVar>(), proxysettingstype, pproxysettingsparam.rawAddress.toCPointer<ByteVar>(), pcontext)

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr<CVoid>, pproxysettingsex: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver.rawAddress.toCPointer<ByteVar>(), pproxysettingsex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr<CVoid>, pdwproxysettingsversion: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession.rawAddress.toCPointer<ByteVar>(), pdwproxysettingsversion.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw.rawAddress.toCPointer<ByteVar>(), dwaccesstype, pszproxyw.rawAddress.toCPointer<ByteVar>(), pszproxybypassw.rawAddress.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L)

public actual fun winHttpOpenRequest(hconnect: MutPtr<CVoid>, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr<Pcwstr>, dwflags: WinhttpOpenRequestFlags): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect.rawAddress.toCPointer<ByteVar>(), pwszverb.rawAddress.toCPointer<ByteVar>(), pwszobjectname.rawAddress.toCPointer<ByteVar>(), pwszversion.rawAddress.toCPointer<ByteVar>(), pwszreferrer.rawAddress.toCPointer<ByteVar>(), ppwszaccepttypes.rawAddress.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L)

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr<CVoid>, lpdwsupportedschemes: MutPtr<UInt>, lpdwfirstscheme: MutPtr<UInt>, pdwauthtarget: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest.rawAddress.toCPointer<ByteVar>(), lpdwsupportedschemes.rawAddress.toCPointer<ByteVar>(), lpdwfirstscheme.rawAddress.toCPointer<ByteVar>(), pdwauthtarget.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr<CVoid>, pguidconnection: ConstPtr<Guid>, ullflags: ULong, ppresult: MutPtr<MutPtr<WinhttpQueryConnectionGroupResult>>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet.rawAddress.toCPointer<ByteVar>(), pguidconnection.rawAddress.toCPointer<ByteVar>(), ullflags, ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr<CVoid>, lpdwnumberofbytesavailable: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest.rawAddress.toCPointer<ByteVar>(), lpdwnumberofbytesavailable.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryHeaders(hrequest: MutPtr<CVoid>, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest.rawAddress.toCPointer<ByteVar>(), dwinfolevel, pwszname.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>(), lpdwindex.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr<UInt>, pheadername: ConstPtr<WinhttpHeaderName>, pbuffer: MutPtr<CVoid>, pdwbufferlength: MutPtr<UInt>, ppheaders: MutPtr<MutPtr<WinhttpExtendedHeader>>, pdwheaderscount: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest.rawAddress.toCPointer<ByteVar>(), dwinfolevel, ullflags, uicodepage, pdwindex.rawAddress.toCPointer<ByteVar>(), pheadername.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pdwbufferlength.rawAddress.toCPointer<ByteVar>(), ppheaders.rawAddress.toCPointer<ByteVar>(), pdwheaderscount.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpQueryOption(hinternet: MutPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet.rawAddress.toCPointer<ByteVar>(), dwoption, lpbuffer.rawAddress.toCPointer<ByteVar>(), lpdwbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReadData(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReadDataEx(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.rawAddress.toCPointer<ByteVar>(), ullflags, cbproperty, pvproperty.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReadProxySettings(hsession: ConstPtr<CVoid>, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr<UInt>, pfdefaultsettingsarereturned: MutPtr<Bool>, pwinhttpproxysettings: MutPtr<WinhttpProxySettings>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession.rawAddress.toCPointer<ByteVar>(), pcwszconnectionname.rawAddress.toCPointer<ByteVar>(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.rawAddress.toCPointer<ByteVar>(), pfdefaultsettingsarereturned.rawAddress.toCPointer<ByteVar>(), pwinhttpproxysettings.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpReceiveResponse(hrequest: MutPtr<CVoid>, lpreserved: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr<CVoid>, hregistration: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags, 0L.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), hregistration.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpResetAutoProxy(hsession: ConstPtr<CVoid>, dwflags: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun winHttpSendRequest(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest.rawAddress.toCPointer<ByteVar>(), lpszheaders.rawAddress.toCPointer<ByteVar>(), dwheaderslength, lpoptional.rawAddress.toCPointer<ByteVar>(), dwoptionallength, dwtotallength, dwcontext)

public actual fun winHttpSetCredentials(hrequest: MutPtr<CVoid>, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest.rawAddress.toCPointer<ByteVar>(), authtargets, authscheme, pwszusername.rawAddress.toCPointer<ByteVar>(), pwszpassword.rawAddress.toCPointer<ByteVar>(), pauthparams.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpSetOption(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet.rawAddress.toCPointer<ByteVar>(), dwoption, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength)

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser)

public actual fun winHttpSetStatusCallback(hinternet: MutPtr<CVoid>, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    null

public actual fun winHttpSetTimeouts(hinternet: MutPtr<CVoid>, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet.rawAddress.toCPointer<ByteVar>(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout)

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr<Systemtime>, pwsztime: Pwstr): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst.rawAddress.toCPointer<ByteVar>(), pwsztime.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr<Systemtime>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime.rawAddress.toCPointer<ByteVar>(), pst.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket.rawAddress.toCPointer<ByteVar>(), usstatus, pvreason.rawAddress.toCPointer<ByteVar>(), dwreasonlength)

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr<CVoid>, pcontext: ULong): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toCPointer<ByteVar>(), pcontext)?.toLong() ?: 0L)

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr<CVoid>, pusstatus: MutPtr<UShort>, pvreason: MutPtr<CVoid>, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toCPointer<ByteVar>(), pusstatus.rawAddress.toCPointer<ByteVar>(), pvreason.rawAddress.toCPointer<ByteVar>(), dwreasonlength, pdwreasonlengthconsumed.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr<CVoid>, pvbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbytesread: MutPtr<UInt>, pebuffertype: MutPtr<WinhttpWebSocketBufferType>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket.rawAddress.toCPointer<ByteVar>(), pvbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength, pdwbytesread.rawAddress.toCPointer<ByteVar>(), pebuffertype.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr<CVoid>, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket.rawAddress.toCPointer<ByteVar>(), ebuffertype, pvbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength)

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket.rawAddress.toCPointer<ByteVar>(), usstatus, pvreason.rawAddress.toCPointer<ByteVar>(), dwreasonlength)

public actual fun winHttpWriteData(hrequest: MutPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr<UInt>): Bool =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), dwnumberofbytestowrite, lpdwnumberofbyteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun winHttpWriteProxySettings(hsession: ConstPtr<CVoid>, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>): UInt =
    windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession.rawAddress.toCPointer<ByteVar>(), fforceupdate, pwinhttpproxysettings.rawAddress.toCPointer<ByteVar>())

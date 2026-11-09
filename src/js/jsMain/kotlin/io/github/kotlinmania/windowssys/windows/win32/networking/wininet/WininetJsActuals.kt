@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.WIN_HTTP_CREATE_URL_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.ALG_ID

private val _windowsWin32NetworkingWininetNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AppCacheCheckManifest(pwszmasterurl: PCWSTR, pwszmanifesturl: PCWSTR, pbmanifestdata: Long, dwmanifestdatasize: UInt, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: UInt, pestate: Long, phnewappcache: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheCheckManifest(pwszmasterurl.toString(), pwszmanifesturl.toString(), pbmanifestdata.toString(), dwmanifestdatasize.toInt(), pbmanifestresponseheaders.toString(), dwmanifestresponseheaderssize.toInt(), pestate.toString(), phnewappcache.toString()) as Int).toUInt() else 0u

public actual fun AppCacheCloseHandle(happcache: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheCloseHandle(happcache.toString())
    }
}

public actual fun AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: PCWSTR, pwszurl: PCWSTR, pbresponseheaders: Long, dwresponseheaderssize: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheCreateAndCommitFile(happcache.toString(), pwszsourcefilepath.toString(), pwszurl.toString(), pbresponseheaders.toString(), dwresponseheaderssize.toInt()) as Int).toUInt() else 0u

public actual fun AppCacheDeleteGroup(pwszmanifesturl: PCWSTR): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheDeleteGroup(pwszmanifesturl.toString()) as Int).toUInt() else 0u

public actual fun AppCacheDeleteIEGroup(pwszmanifesturl: PCWSTR): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheDeleteIEGroup(pwszmanifesturl.toString()) as Int).toUInt() else 0u

public actual fun AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheDuplicateHandle(happcache.toString(), phduplicatedappcache.toString()) as Int).toUInt() else 0u

public actual fun AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: UInt, pestate: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheFinalize(happcache.toString(), pbmanifestdata.toString(), dwmanifestdatasize.toInt(), pestate.toString()) as Int).toUInt() else 0u

public actual fun AppCacheFreeDownloadList(pdownloadlist: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheFreeDownloadList(pdownloadlist.toString())
    }
}

public actual fun AppCacheFreeGroupList(pappcachegrouplist: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheFreeGroupList(pappcachegrouplist.toString())
    }
}

public actual fun AppCacheFreeIESpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheFreeSpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheGetDownloadList(happcache.toString(), pdownloadlist.toString()) as Int).toUInt() else 0u

public actual fun AppCacheGetFallbackUrl(happcache: Long, pwszurl: PCWSTR, ppwszfallbackurl: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheGetFallbackUrl(happcache.toString(), pwszurl.toString(), ppwszfallbackurl.toString()) as Int).toUInt() else 0u

public actual fun AppCacheGetGroupList(pappcachegrouplist: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheGetGroupList(pappcachegrouplist.toString()) as Int).toUInt() else 0u

public actual fun AppCacheGetIEGroupList(pappcachegrouplist: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheGetIEGroupList(pappcachegrouplist.toString()) as Int).toUInt() else 0u

public actual fun AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheGetInfo(happcache.toString(), pappcacheinfo.toString()) as Int).toUInt() else 0u

public actual fun AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheGetManifestUrl(happcache.toString(), ppwszmanifesturl.toString()) as Int).toUInt() else 0u

public actual fun AppCacheLookup(pwszurl: PCWSTR, dwflags: UInt, phappcache: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_AppCacheLookup(pwszurl.toString(), dwflags.toInt(), phappcache.toString()) as Int).toUInt() else 0u

public actual fun CommitUrlCacheEntryA(lpszurlname: PCSTR, lpszlocalfilename: PCSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpheaderinfo: Long, cchheaderinfo: UInt, lpszfileextension: PCSTR, lpszoriginalurl: PCSTR): BOOL =
    0

public actual fun CommitUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: UInt, ftexpiretime: FILETIME, ftmodifiedtime: FILETIME, pbblob: Long, cbblob: UInt): UInt =
    0u

public actual fun CommitUrlCacheEntryW(lpszurlname: PCWSTR, lpszlocalfilename: PCWSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpszheaderinfo: PCWSTR, cchheaderinfo: UInt, lpszfileextension: PCWSTR, lpszoriginalurl: PCWSTR): BOOL =
    0

public actual fun CreateMD5SSOHash(pszchallengeinfo: PCWSTR, pwszrealm: PCWSTR, pwsztarget: PCWSTR, pbhexhash: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateMD5SSOHash(pszchallengeinfo.toString(), pwszrealm.toString(), pwsztarget.toString(), pbhexhash.toString()) as Int) else 0

public actual fun CreateUrlCacheContainerA(name: PCSTR, lpcacheprefix: PCSTR, lpszcachepath: PCSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerA(name.toString(), lpcacheprefix.toString(), lpszcachepath.toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.toString(), cbbuffer.toString()) as Int) else 0

public actual fun CreateUrlCacheContainerW(name: PCWSTR, lpcacheprefix: PCWSTR, lpszcachepath: PCWSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerW(name.toString(), lpcacheprefix.toString(), lpszcachepath.toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.toString(), cbbuffer.toString()) as Int) else 0

public actual fun CreateUrlCacheEntryA(lpszurlname: PCSTR, dwexpectedfilesize: UInt, lpszfileextension: PCSTR, lpszfilename: PSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryA(lpszurlname.toString(), dwexpectedfilesize.toInt(), lpszfileextension.toString(), lpszfilename.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CreateUrlCacheEntryExW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt, fpreserveincomingfilename: BOOL): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryExW(lpszurlname.toString(), dwexpectedfilesize.toInt(), lpszfileextension.toString(), lpszfilename.toString(), dwreserved.toInt(), fpreserveincomingfilename) as Int) else 0

public actual fun CreateUrlCacheEntryW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryW(lpszurlname.toString(), dwexpectedfilesize.toInt(), lpszfileextension.toString(), lpszfilename.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CreateUrlCacheGroup(dwflags: UInt, lpreserved: Long): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_CreateUrlCacheGroup(dwflags.toInt(), lpreserved.toString()) as String).toLong() else 0L

public actual fun DeleteIE3Cache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteIE3Cache(hwnd.toString(), hinst.toString(), lpszcmd.toString(), ncmdshow) as Int).toUInt() else 0u

public actual fun DeleteUrlCacheContainerA(name: PCSTR, dwoptions: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerA(name.toString(), dwoptions.toInt()) as Int) else 0

public actual fun DeleteUrlCacheContainerW(name: PCWSTR, dwoptions: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerW(name.toString(), dwoptions.toInt()) as Int) else 0

public actual fun DeleteUrlCacheEntry(lpszurlname: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntry(lpszurlname.toString()) as Int) else 0

public actual fun DeleteUrlCacheEntryA(lpszurlname: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryA(lpszurlname.toString()) as Int) else 0

public actual fun DeleteUrlCacheEntryW(lpszurlname: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryW(lpszurlname.toString()) as Int) else 0

public actual fun DeleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteUrlCacheGroup(groupid.toString(), dwflags.toInt(), lpreserved.toString()) as Int) else 0

public actual fun DeleteWpadCacheForNetworks(param0: WPAD_CACHE_DELETE): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DeleteWpadCacheForNetworks(param0) as Int) else 0

public actual fun DetectAutoProxyUrl(pszautoproxyurl: PSTR, cchautoproxyurl: UInt, dwdetectflags: PROXY_AUTO_DETECT_TYPE): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DetectAutoProxyUrl(pszautoproxyurl.toString(), cchautoproxyurl.toInt(), dwdetectflags.toInt()) as Int) else 0

public actual fun DoConnectoidsExist(): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_DoConnectoidsExist() as Int) else 0

public actual fun ExportCookieFileA(szfilename: PCSTR, fappend: BOOL): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ExportCookieFileA(szfilename.toString(), fappend) as Int) else 0

public actual fun ExportCookieFileW(szfilename: PCWSTR, fappend: BOOL): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ExportCookieFileW(szfilename.toString(), fappend) as Int) else 0

public actual fun FindCloseUrlCache(henumhandle: HANDLE): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindCloseUrlCache(henumhandle.toString()) as Int) else 0

public actual fun FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerA(pdwmodified.toString(), lpcontainerinfo.toString(), lpcbcontainerinfo.toString(), dwoptions.toInt()) as String).toLong() else 0L

public actual fun FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerW(pdwmodified.toString(), lpcontainerinfo.toString(), lpcbcontainerinfo.toString(), dwoptions.toInt()) as String).toLong() else 0L

public actual fun FindFirstUrlCacheEntryA(lpszurlsearchpattern: PCSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryA(lpszurlsearchpattern.toString(), lpfirstcacheentryinfo.toString(), lpcbcacheentryinfo.toString()) as String).toLong() else 0L

public actual fun FindFirstUrlCacheEntryExA(lpszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExA(lpszurlsearchpattern.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), lpfirstcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), lpgroupattributes.toString(), lpcbgroupattributes.toString(), lpreserved.toString()) as String).toLong() else 0L

public actual fun FindFirstUrlCacheEntryExW(lpszurlsearchpattern: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExW(lpszurlsearchpattern.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), lpfirstcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), lpgroupattributes.toString(), lpcbgroupattributes.toString(), lpreserved.toString()) as String).toLong() else 0L

public actual fun FindFirstUrlCacheEntryW(lpszurlsearchpattern: PCWSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryW(lpszurlsearchpattern.toString(), lpfirstcacheentryinfo.toString(), lpcbcacheentryinfo.toString()) as String).toLong() else 0L

public actual fun FindFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: Long, dwsearchcondition: UInt, lpgroupid: Long, lpreserved: Long): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), lpsearchcondition.toString(), dwsearchcondition.toInt(), lpgroupid.toString(), lpreserved.toString()) as String).toLong() else 0L

public actual fun FindNextUrlCacheContainerA(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerA(henumhandle.toString(), lpcontainerinfo.toString(), lpcbcontainerinfo.toString()) as Int) else 0

public actual fun FindNextUrlCacheContainerW(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerW(henumhandle.toString(), lpcontainerinfo.toString(), lpcbcontainerinfo.toString()) as Int) else 0

public actual fun FindNextUrlCacheEntryA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryA(henumhandle.toString(), lpnextcacheentryinfo.toString(), lpcbcacheentryinfo.toString()) as Int) else 0

public actual fun FindNextUrlCacheEntryExA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExA(henumhandle.toString(), lpnextcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), lpgroupattributes.toString(), lpcbgroupattributes.toString(), lpreserved.toString()) as Int) else 0

public actual fun FindNextUrlCacheEntryExW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExW(henumhandle.toString(), lpnextcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), lpgroupattributes.toString(), lpcbgroupattributes.toString(), lpreserved.toString()) as Int) else 0

public actual fun FindNextUrlCacheEntryW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryW(henumhandle.toString(), lpnextcacheentryinfo.toString(), lpcbcacheentryinfo.toString()) as Int) else 0

public actual fun FindNextUrlCacheGroup(hfind: HANDLE, lpgroupid: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindNextUrlCacheGroup(hfind.toString(), lpgroupid.toString(), lpreserved.toString()) as Int) else 0

public actual fun FindP3PPolicySymbol(pszsymbol: PCSTR): Int =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FindP3PPolicySymbol(pszsymbol.toString()) as Int) else 0

public actual fun FreeUrlCacheSpaceA(lpszcachepath: PCSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceA(lpszcachepath.toString(), dwsize.toInt(), dwfilter.toInt()) as Int) else 0

public actual fun FreeUrlCacheSpaceW(lpszcachepath: PCWSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceW(lpszcachepath.toString(), dwsize.toInt(), dwfilter.toInt()) as Int) else 0

public actual fun FtpCommandA(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpCommandA(hconnect.toString(), fexpectresponse, dwflags.toInt(), lpszcommand.toString(), dwcontext.toString(), phftpcommand.toString()) as Int) else 0

public actual fun FtpCommandW(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCWSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpCommandW(hconnect.toString(), fexpectresponse, dwflags.toInt(), lpszcommand.toString(), dwcontext.toString(), phftpcommand.toString()) as Int) else 0

public actual fun FtpCreateDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpCreateDirectoryA(hconnect.toString(), lpszdirectory.toString()) as Int) else 0

public actual fun FtpCreateDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpCreateDirectoryW(hconnect.toString(), lpszdirectory.toString()) as Int) else 0

public actual fun FtpDeleteFileA(hconnect: Long, lpszfilename: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpDeleteFileA(hconnect.toString(), lpszfilename.toString()) as Int) else 0

public actual fun FtpDeleteFileW(hconnect: Long, lpszfilename: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpDeleteFileW(hconnect.toString(), lpszfilename.toString()) as Int) else 0

public actual fun FtpFindFirstFileA(hconnect: Long, lpszsearchfile: PCSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpFindFirstFileA(hconnect.toString(), lpszsearchfile.toString(), lpfindfiledata.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun FtpFindFirstFileW(hconnect: Long, lpszsearchfile: PCWSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpFindFirstFileW(hconnect.toString(), lpszsearchfile.toString(), lpfindfiledata.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: PSTR, lpdwcurrentdirectory: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryA(hconnect.toString(), lpszcurrentdirectory.toString(), lpdwcurrentdirectory.toString()) as Int) else 0

public actual fun FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: PWSTR, lpdwcurrentdirectory: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryW(hconnect.toString(), lpszcurrentdirectory.toString(), lpdwcurrentdirectory.toString()) as Int) else 0

public actual fun FtpGetFileA(hconnect: Long, lpszremotefile: PCSTR, lpsznewfile: PCSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpGetFileA(hconnect.toString(), lpszremotefile.toString(), lpsznewfile.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun FtpGetFileEx(hftpsession: Long, lpszremotefile: PCSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpGetFileEx(hftpsession.toString(), lpszremotefile.toString(), lpsznewfile.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpGetFileSize(hfile.toString(), lpdwfilesizehigh.toString()) as Int).toUInt() else 0u

public actual fun FtpGetFileW(hconnect: Long, lpszremotefile: PCWSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpGetFileW(hconnect.toString(), lpszremotefile.toString(), lpsznewfile.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun FtpOpenFileA(hconnect: Long, lpszfilename: PCSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpOpenFileA(hconnect.toString(), lpszfilename.toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun FtpOpenFileW(hconnect: Long, lpszfilename: PCWSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpOpenFileW(hconnect.toString(), lpszfilename.toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun FtpPutFileA(hconnect: Long, lpszlocalfile: PCSTR, lpsznewremotefile: PCSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpPutFileA(hconnect.toString(), lpszlocalfile.toString(), lpsznewremotefile.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun FtpPutFileEx(hftpsession: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCSTR, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpPutFileEx(hftpsession.toString(), lpszlocalfile.toString(), lpsznewremotefile.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun FtpPutFileW(hconnect: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCWSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpPutFileW(hconnect.toString(), lpszlocalfile.toString(), lpsznewremotefile.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryA(hconnect.toString(), lpszdirectory.toString()) as Int) else 0

public actual fun FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryW(hconnect.toString(), lpszdirectory.toString()) as Int) else 0

public actual fun FtpRenameFileA(hconnect: Long, lpszexisting: PCSTR, lpsznew: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpRenameFileA(hconnect.toString(), lpszexisting.toString(), lpsznew.toString()) as Int) else 0

public actual fun FtpRenameFileW(hconnect: Long, lpszexisting: PCWSTR, lpsznew: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpRenameFileW(hconnect.toString(), lpszexisting.toString(), lpsznew.toString()) as Int) else 0

public actual fun FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryA(hconnect.toString(), lpszdirectory.toString()) as Int) else 0

public actual fun FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryW(hconnect.toString(), lpszdirectory.toString()) as Int) else 0

public actual fun GetDiskInfoA(pszpath: PCSTR, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetDiskInfoA(pszpath.toString(), pdwclustersize.toString(), pdlavail.toString(), pdltotal.toString()) as Int) else 0

public actual fun GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoA(lpcacheconfiginfo.toString(), lpcbcacheconfiginfo.toString(), dwfieldcontrol.toInt()) as Int) else 0

public actual fun GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoW(lpcacheconfiginfo.toString(), lpcbcacheconfiginfo.toString(), dwfieldcontrol.toInt()) as Int) else 0

public actual fun GetUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryBinaryBlob(pwszurlname.toString(), dwtype.toString(), pftexpiretime.toString(), pftaccesstime.toString(), pftmodifiedtime.toString(), ppbblob.toString(), pcbblob.toString()) as Int).toUInt() else 0u

public actual fun GetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoA(lpszurlname.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString()) as Int) else 0

public actual fun GetUrlCacheEntryInfoExA(lpszurl: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExA(lpszurl.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), lpszredirecturl.toString(), lpcbredirecturl.toString(), lpreserved.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetUrlCacheEntryInfoExW(lpszurl: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCWSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExW(lpszurl.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), lpszredirecturl.toString(), lpcbredirecturl.toString(), lpreserved.toString(), dwflags.toInt()) as Int) else 0

public actual fun GetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoW(lpszurlname.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString()) as Int) else 0

public actual fun GetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.toString(), lpcbgroupinfo.toString(), lpreserved.toString()) as Int) else 0

public actual fun GetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.toString(), lpcbgroupinfo.toString(), lpreserved.toString()) as Int) else 0

public actual fun GetUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GetUrlCacheHeaderData(nidx.toInt(), lpdwdata.toString()) as Int) else 0

public actual fun GopherCreateLocatorA(lpszhost: PCSTR, nserverport: UShort, lpszdisplaystring: PCSTR, lpszselectorstring: PCSTR, dwgophertype: UInt, lpszlocator: PSTR, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherCreateLocatorA(lpszhost.toString(), nserverport.toInt(), lpszdisplaystring.toString(), lpszselectorstring.toString(), dwgophertype.toInt(), lpszlocator.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun GopherCreateLocatorW(lpszhost: PCWSTR, nserverport: UShort, lpszdisplaystring: PCWSTR, lpszselectorstring: PCWSTR, dwgophertype: UInt, lpszlocator: PWSTR, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherCreateLocatorW(lpszhost.toString(), nserverport.toInt(), lpszdisplaystring.toString(), lpszselectorstring.toString(), dwgophertype.toInt(), lpszlocator.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun GopherFindFirstFileA(hconnect: Long, lpszlocator: PCSTR, lpszsearchstring: PCSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherFindFirstFileA(hconnect.toString(), lpszlocator.toString(), lpszsearchstring.toString(), lpfinddata.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun GopherFindFirstFileW(hconnect: Long, lpszlocator: PCWSTR, lpszsearchstring: PCWSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherFindFirstFileW(hconnect.toString(), lpszlocator.toString(), lpszsearchstring.toString(), lpfinddata.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun GopherGetAttributeA(hconnect: Long, lpszlocator: PCSTR, lpszattributename: PCSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherGetAttributeA(hconnect.toString(), lpszlocator.toString(), lpszattributename.toString(), lpbuffer.toString(), dwbufferlength.toInt(), lpdwcharactersreturned.toString(), lpfnenumerator.toLong().toString(), dwcontext.toString()) as Int) else 0

public actual fun GopherGetAttributeW(hconnect: Long, lpszlocator: PCWSTR, lpszattributename: PCWSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherGetAttributeW(hconnect.toString(), lpszlocator.toString(), lpszattributename.toString(), lpbuffer.toString(), dwbufferlength.toInt(), lpdwcharactersreturned.toString(), lpfnenumerator.toLong().toString(), dwcontext.toString()) as Int) else 0

public actual fun GopherGetLocatorTypeA(lpszlocator: PCSTR, lpdwgophertype: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeA(lpszlocator.toString(), lpdwgophertype.toString()) as Int) else 0

public actual fun GopherGetLocatorTypeW(lpszlocator: PCWSTR, lpdwgophertype: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeW(lpszlocator.toString(), lpdwgophertype.toString()) as Int) else 0

public actual fun GopherOpenFileA(hconnect: Long, lpszlocator: PCSTR, lpszview: PCSTR, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherOpenFileA(hconnect.toString(), lpszlocator.toString(), lpszview.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun GopherOpenFileW(hconnect: Long, lpszlocator: PCWSTR, lpszview: PCWSTR, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_GopherOpenFileW(hconnect.toString(), lpszlocator.toString(), lpszview.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun HttpAddRequestHeadersA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersA(hrequest.toString(), lpszheaders.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else 0

public actual fun HttpAddRequestHeadersW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersW(hrequest.toString(), lpszheaders.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else 0

public actual fun HttpCheckDavComplianceA(lpszurl: PCSTR, lpszcompliancetoken: PCSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceA(lpszurl.toString(), lpszcompliancetoken.toString(), lpffound.toString(), hwnd.toString(), lpvreserved.toString()) as Int) else 0

public actual fun HttpCheckDavComplianceW(lpszurl: PCWSTR, lpszcompliancetoken: PCWSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceW(lpszurl.toString(), lpszcompliancetoken.toString(), lpffound.toString(), hwnd.toString(), lpvreserved.toString()) as Int) else 0

public actual fun HttpCloseDependencyHandle(hdependencyhandle: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpCloseDependencyHandle(hdependencyhandle.toString())
    }
}

public actual fun HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpDuplicateDependencyHandle(hdependencyhandle.toString(), phduplicateddependencyhandle.toString()) as Int).toUInt() else 0u

public actual fun HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpEndRequestA(hrequest.toString(), lpbuffersout.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpEndRequestW(hrequest.toString(), lpbuffersout.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun HttpGetServerCredentials(pwszurl: PCWSTR, ppwszusername: Long, ppwszpassword: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpGetServerCredentials(pwszurl.toString(), ppwszusername.toString(), ppwszpassword.toString()) as Int).toUInt() else 0u

public actual fun HttpIndicatePageLoadComplete(hdependencyhandle: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpIndicatePageLoadComplete(hdependencyhandle.toString()) as Int).toUInt() else 0u

public actual fun HttpIsHostHstsEnabled(pcwszurl: PCWSTR, pfishsts: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpIsHostHstsEnabled(pcwszurl.toString(), pfishsts.toString()) as Int).toUInt() else 0u

public actual fun HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: BOOL, phdependencyhandle: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpOpenDependencyHandle(hrequesthandle.toString(), fbackground, phdependencyhandle.toString()) as Int).toUInt() else 0u

public actual fun HttpOpenRequestA(hconnect: Long, lpszverb: PCSTR, lpszobjectname: PCSTR, lpszversion: PCSTR, lpszreferrer: PCSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpOpenRequestA(hconnect.toString(), lpszverb.toString(), lpszobjectname.toString(), lpszversion.toString(), lpszreferrer.toString(), lplpszaccepttypes.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun HttpOpenRequestW(hconnect: Long, lpszverb: PCWSTR, lpszobjectname: PCWSTR, lpszversion: PCWSTR, lpszreferrer: PCWSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpOpenRequestW(hconnect.toString(), lpszverb.toString(), lpszobjectname.toString(), lpszversion.toString(), lpszreferrer.toString(), lplpszaccepttypes.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun HttpPushClose(hwait: HTTP_PUSH_WAIT_HANDLE) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpPushClose(hwait.toString())
    }
}

public actual fun HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpPushEnable(hrequest.toString(), ptransportsetting.toString(), phwait.toString()) as Int).toUInt() else 0u

public actual fun HttpPushWait(hwait: HTTP_PUSH_WAIT_HANDLE, etype: HTTP_PUSH_WAIT_TYPE, pnotificationstatus: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpPushWait(hwait.toString(), etype, pnotificationstatus.toString()) as Int).toUInt() else 0u

public actual fun HttpQueryInfoA(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpQueryInfoA(hrequest.toString(), dwinfolevel.toInt(), lpbuffer.toString(), lpdwbufferlength.toString(), lpdwindex.toString()) as Int) else 0

public actual fun HttpQueryInfoW(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpQueryInfoW(hrequest.toString(), dwinfolevel.toInt(), lpbuffer.toString(), lpdwbufferlength.toString(), lpdwindex.toString()) as Int) else 0

public actual fun HttpSendRequestA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpSendRequestA(hrequest.toString(), lpszheaders.toString(), dwheaderslength.toInt(), lpoptional.toString(), dwoptionallength.toInt()) as Int) else 0

public actual fun HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpSendRequestExA(hrequest.toString(), lpbuffersin.toString(), lpbuffersout.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpSendRequestExW(hrequest.toString(), lpbuffersin.toString(), lpbuffersout.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun HttpSendRequestW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpSendRequestW(hrequest.toString(), lpszheaders.toString(), dwheaderslength.toInt(), lpoptional.toString(), dwoptionallength.toInt()) as Int) else 0

public actual fun HttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpWebSocketClose(hwebsocket.toString(), usstatus.toInt(), pvreason.toString(), dwreasonlength.toInt()) as Int) else 0

public actual fun HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpWebSocketCompleteUpgrade(hrequest.toString(), dwcontext.toString()) as String).toLong() else 0L

public actual fun HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpWebSocketQueryCloseStatus(hwebsocket.toString(), pusstatus.toString(), pvreason.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.toString()) as Int) else 0

public actual fun HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pbuffertype: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpWebSocketReceive(hwebsocket.toString(), pvbuffer.toString(), dwbufferlength.toInt(), pdwbytesread.toString(), pbuffertype.toString()) as Int) else 0

public actual fun HttpWebSocketSend(hwebsocket: Long, buffertype: HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpWebSocketSend(hwebsocket.toString(), buffertype, pvbuffer.toString(), dwbufferlength.toInt()) as Int) else 0

public actual fun HttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_HttpWebSocketShutdown(hwebsocket.toString(), usstatus.toInt(), pvreason.toString(), dwreasonlength.toInt()) as Int) else 0

public actual fun ImportCookieFileA(szfilename: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ImportCookieFileA(szfilename.toString()) as Int) else 0

public actual fun ImportCookieFileW(szfilename: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ImportCookieFileW(szfilename.toString()) as Int) else 0

public actual fun IncrementUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IncrementUrlCacheHeaderData(nidx.toInt(), lpdwdata.toString()) as Int) else 0

public actual fun InternalInternetGetCookie(lpszurl: PCSTR, lpszcookiedata: PSTR, lpdwdatasize: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternalInternetGetCookie(lpszurl.toString(), lpszcookiedata.toString(), lpdwdatasize.toString()) as Int).toUInt() else 0u

public actual fun InternetAlgIdToStringA(ai: ALG_ID, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetAlgIdToStringA(ai.toInt(), lpstr.toString(), lpdwstrlength.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetAlgIdToStringW(ai: ALG_ID, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetAlgIdToStringW(ai.toInt(), lpstr.toString(), lpdwstrlength.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetAttemptConnect(dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetAttemptConnect(dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun InternetAutodial(dwflags: INTERNET_AUTODIAL, hwndparent: HWND): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetAutodial(dwflags.toInt(), hwndparent.toString()) as Int) else 0

public actual fun InternetAutodialHangup(dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetAutodialHangup(dwreserved.toInt()) as Int) else 0

public actual fun InternetCanonicalizeUrlA(lpszurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlA(lpszurl.toString(), lpszbuffer.toString(), lpdwbufferlength.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetCanonicalizeUrlW(lpszurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlW(lpszurl.toString(), lpszbuffer.toString(), lpdwbufferlength.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetCheckConnectionA(lpszurl: PCSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCheckConnectionA(lpszurl.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetCheckConnectionW(lpszurl: PCWSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCheckConnectionW(lpszurl.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetClearAllPerSiteCookieDecisions(): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetClearAllPerSiteCookieDecisions() as Int) else 0

public actual fun InternetCloseHandle(hinternet: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCloseHandle(hinternet.toString()) as Int) else 0

public actual fun InternetCombineUrlA(lpszbaseurl: PCSTR, lpszrelativeurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCombineUrlA(lpszbaseurl.toString(), lpszrelativeurl.toString(), lpszbuffer.toString(), lpdwbufferlength.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetCombineUrlW(lpszbaseurl: PCWSTR, lpszrelativeurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCombineUrlW(lpszbaseurl.toString(), lpszrelativeurl.toString(), lpszbuffer.toString(), lpdwbufferlength.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetConfirmZoneCrossing(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossing(hwnd.toString(), szurlprev.toString(), szurlnew.toString(), bpost) as Int).toUInt() else 0u

public actual fun InternetConfirmZoneCrossingA(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingA(hwnd.toString(), szurlprev.toString(), szurlnew.toString(), bpost) as Int).toUInt() else 0u

public actual fun InternetConfirmZoneCrossingW(hwnd: HWND, szurlprev: PCWSTR, szurlnew: PCWSTR, bpost: BOOL): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingW(hwnd.toString(), szurlprev.toString(), szurlnew.toString(), bpost) as Int).toUInt() else 0u

public actual fun InternetConnectA(hinternet: Long, lpszservername: PCSTR, nserverport: UShort, lpszusername: PCSTR, lpszpassword: PCSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetConnectA(hinternet.toString(), lpszservername.toString(), nserverport.toInt(), lpszusername.toString(), lpszpassword.toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun InternetConnectW(hinternet: Long, lpszservername: PCWSTR, nserverport: UShort, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetConnectW(hinternet.toString(), lpszservername.toString(), nserverport.toInt(), lpszusername.toString(), lpszpassword.toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun InternetConvertUrlFromWireToWideChar(pcszurl: PCSTR, cchurl: UInt, pcwszbaseurl: PCWSTR, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: BOOL, dwcodepageextra: UInt, ppwszconvertedurl: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetConvertUrlFromWireToWideChar(pcszurl.toString(), cchurl.toInt(), pcwszbaseurl.toString(), dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), ppwszconvertedurl.toString()) as Int).toUInt() else 0u

public actual fun InternetCrackUrlA(lpszurl: PCSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCrackUrlA(lpszurl.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.toString()) as Int) else 0

public actual fun InternetCrackUrlW(lpszurl: PCWSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCrackUrlW(lpszurl.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.toString()) as Int) else 0

public actual fun InternetCreateUrlA(lpurlcomponents: Long, dwflags: UInt, lpszurl: PSTR, lpdwurllength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCreateUrlA(lpurlcomponents.toString(), dwflags.toInt(), lpszurl.toString(), lpdwurllength.toString()) as Int) else 0

public actual fun InternetCreateUrlW(lpurlcomponents: Long, dwflags: UInt, lpszurl: PWSTR, lpdwurllength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetCreateUrlW(lpurlcomponents.toString(), dwflags.toInt(), lpszurl.toString(), lpdwurllength.toString()) as Int) else 0

public actual fun InternetDial(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetDial(hwndparent.toString(), lpszconnectoid.toString(), dwflags.toInt(), lpdwconnection.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun InternetDialA(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetDialA(hwndparent.toString(), lpszconnectoid.toString(), dwflags.toInt(), lpdwconnection.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun InternetDialW(hwndparent: HWND, lpszconnectoid: PCWSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetDialW(hwndparent.toString(), lpszconnectoid.toString(), dwflags.toInt(), lpdwconnection.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun InternetEnumPerSiteCookieDecisionA(pszsitename: PSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionA(pszsitename.toString(), pcsitenamesize.toString(), pdwdecision.toString(), dwindex.toInt()) as Int) else 0

public actual fun InternetEnumPerSiteCookieDecisionW(pszsitename: PWSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionW(pszsitename.toString(), pcsitenamesize.toString(), pdwdecision.toString(), dwindex.toInt()) as Int) else 0

public actual fun InternetErrorDlg(hwnd: HWND, hrequest: Long, dwerror: UInt, dwflags: UInt, lppvdata: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetErrorDlg(hwnd.toString(), hrequest.toString(), dwerror.toInt(), dwflags.toInt(), lppvdata.toString()) as Int).toUInt() else 0u

public actual fun InternetFindNextFileA(hfind: Long, lpvfinddata: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetFindNextFileA(hfind.toString(), lpvfinddata.toString()) as Int) else 0

public actual fun InternetFindNextFileW(hfind: Long, lpvfinddata: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetFindNextFileW(hfind.toString(), lpvfinddata.toString()) as Int) else 0

public actual fun InternetFortezzaCommand(dwcommand: UInt, hwnd: HWND, dwreserved: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetFortezzaCommand(dwcommand.toInt(), hwnd.toString(), dwreserved.toString()) as Int) else 0

public actual fun InternetFreeCookies(pcookies: Long, dwcookiecount: UInt) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetFreeCookies(pcookies.toString(), dwcookiecount.toInt())
    }
}

public actual fun InternetFreeProxyInfoList(pproxyinfolist: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetFreeProxyInfoList(pproxyinfolist.toString())
    }
}

public actual fun InternetGetConnectedState(lpdwflags: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetConnectedState(lpdwflags.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: PSTR, dwnamelen: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateEx(lpdwflags.toString(), lpszconnectionname.toString(), dwnamelen.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: PSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExA(lpdwflags.toString(), lpszconnectionname.toString(), cchnamelen.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: PWSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExW(lpdwflags.toString(), lpszconnectionname.toString(), cchnamelen.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetGetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PSTR, lpdwsize: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetCookieA(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), lpdwsize.toString()) as Int) else 0

public actual fun InternetGetCookieEx2(pcwszurl: PCWSTR, pcwszcookiename: PCWSTR, dwflags: UInt, ppcookies: Long, pdwcookiecount: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetCookieEx2(pcwszurl.toString(), pcwszcookiename.toString(), dwflags.toInt(), ppcookies.toString(), pdwcookiecount.toString()) as Int).toUInt() else 0u

public actual fun InternetGetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetCookieExA(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), lpdwsize.toString(), dwflags.toInt(), lpreserved.toString()) as Int) else 0

public actual fun InternetGetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetCookieExW(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), lpdwsize.toString(), dwflags.toInt(), lpreserved.toString()) as Int) else 0

public actual fun InternetGetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, lpdwsize: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetCookieW(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), lpdwsize.toString()) as Int) else 0

public actual fun InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: PSTR, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoA(lpdwerror.toString(), lpszbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: PWSTR, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoW(lpdwerror.toString(), lpszbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun InternetGetPerSiteCookieDecisionA(pchhostname: PCSTR, presult: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionA(pchhostname.toString(), presult.toString()) as Int) else 0

public actual fun InternetGetPerSiteCookieDecisionW(pchhostname: PCWSTR, presult: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionW(pchhostname.toString(), presult.toString()) as Int) else 0

public actual fun InternetGetProxyForUrl(hinternet: Long, pcwszurl: PCWSTR, pproxyinfolist: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetProxyForUrl(hinternet.toString(), pcwszurl.toString(), pproxyinfolist.toString()) as Int).toUInt() else 0u

public actual fun InternetGetSecurityInfoByURL(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURL(lpszurl.toString(), ppcertchain.toString(), pdwsecureflags.toString()) as Int) else 0

public actual fun InternetGetSecurityInfoByURLA(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLA(lpszurl.toString(), ppcertchain.toString(), pdwsecureflags.toString()) as Int) else 0

public actual fun InternetGetSecurityInfoByURLW(lpszurl: PCWSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLW(lpszurl.toString(), ppcertchain.toString(), pdwsecureflags.toString()) as Int) else 0

public actual fun InternetGoOnline(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGoOnline(lpszurl.toString(), hwndparent.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetGoOnlineA(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGoOnlineA(lpszurl.toString(), hwndparent.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetGoOnlineW(lpszurl: PCWSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetGoOnlineW(lpszurl.toString(), hwndparent.toString(), dwflags.toInt()) as Int) else 0

public actual fun InternetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetHangUp(dwconnection.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun InternetInitializeAutoProxyDll(dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetInitializeAutoProxyDll(dwreserved.toInt()) as Int) else 0

public actual fun InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetLockRequestFile(hinternet.toString(), lphlockrequestinfo.toString()) as Int) else 0

public actual fun InternetOpenA(lpszagent: PCSTR, dwaccesstype: UInt, lpszproxy: PCSTR, lpszproxybypass: PCSTR, dwflags: UInt): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetOpenA(lpszagent.toString(), dwaccesstype.toInt(), lpszproxy.toString(), lpszproxybypass.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun InternetOpenUrlA(hinternet: Long, lpszurl: PCSTR, lpszheaders: PCSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetOpenUrlA(hinternet.toString(), lpszurl.toString(), lpszheaders.toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun InternetOpenUrlW(hinternet: Long, lpszurl: PCWSTR, lpszheaders: PCWSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetOpenUrlW(hinternet.toString(), lpszurl.toString(), lpszheaders.toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong() else 0L

public actual fun InternetOpenW(lpszagent: PCWSTR, dwaccesstype: UInt, lpszproxy: PCWSTR, lpszproxybypass: PCWSTR, dwflags: UInt): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetOpenW(lpszagent.toString(), dwaccesstype.toInt(), lpszproxy.toString(), lpszproxybypass.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetQueryDataAvailable(hfile.toString(), lpdwnumberofbytesavailable.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetQueryFortezzaStatus(pdwstatus.toString(), dwreserved.toString()) as Int) else 0

public actual fun InternetQueryOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetQueryOptionA(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun InternetQueryOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetQueryOptionW(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), lpdwbufferlength.toString()) as Int) else 0

public actual fun InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetReadFile(hfile.toString(), lpbuffer.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.toString()) as Int) else 0

public actual fun InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetReadFileExA(hfile.toString(), lpbuffersout.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetReadFileExW(hfile.toString(), lpbuffersout.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun InternetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringA(dwprotocol.toInt(), lpstr.toString(), lpdwstrlength.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringW(dwprotocol.toInt(), lpstr.toString(), lpdwstrlength.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetSetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetCookieA(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString()) as Int) else 0

public actual fun InternetSetCookieEx2(pcwszurl: PCWSTR, pcookie: Long, pcwszp3ppolicy: PCWSTR, dwflags: UInt, pdwcookiestate: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetCookieEx2(pcwszurl.toString(), pcookie.toString(), pcwszp3ppolicy.toString(), dwflags.toInt(), pdwcookiestate.toString()) as Int).toUInt() else 0u

public actual fun InternetSetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, dwflags: UInt, dwreserved: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetCookieExA(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), dwflags.toInt(), dwreserved.toString()) as Int).toUInt() else 0u

public actual fun InternetSetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt, dwreserved: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetCookieExW(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString(), dwflags.toInt(), dwreserved.toString()) as Int).toUInt() else 0u

public actual fun InternetSetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetCookieW(lpszurl.toString(), lpszcookiename.toString(), lpszcookiedata.toString()) as Int) else 0

public actual fun InternetSetDialState(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetDialState(lpszconnectoid.toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetSetDialStateA(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetDialStateA(lpszconnectoid.toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetSetDialStateW(lpszconnectoid: PCWSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetDialStateW(lpszconnectoid.toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: UInt, dwcontext: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetFilePointer(hfile.toString(), ldistancetomove, lpdistancetomovehigh.toString(), dwmovemethod.toInt(), dwcontext.toString()) as Int).toUInt() else 0u

public actual fun InternetSetOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetOptionA(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), dwbufferlength.toInt()) as Int) else 0

public actual fun InternetSetOptionExA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetOptionExA(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), dwbufferlength.toInt(), dwflags.toInt()) as Int) else 0

public actual fun InternetSetOptionExW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetOptionExW(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), dwbufferlength.toInt(), dwflags.toInt()) as Int) else 0

public actual fun InternetSetOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetOptionW(hinternet.toString(), dwoption.toInt(), lpbuffer.toString(), dwbufferlength.toInt()) as Int) else 0

public actual fun InternetSetPerSiteCookieDecisionA(pchhostname: PCSTR, dwdecision: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionA(pchhostname.toString(), dwdecision.toInt()) as Int) else 0

public actual fun InternetSetPerSiteCookieDecisionW(pchhostname: PCWSTR, dwdecision: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionW(pchhostname.toString(), dwdecision.toInt()) as Int) else 0

public actual fun InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetStatusCallback(hinternet.toString(), lpfninternetcallback.toLong().toString()) as String).toLong() else null

public actual fun InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackA(hinternet.toString(), lpfninternetcallback.toLong().toString()) as String).toLong() else null

public actual fun InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackW(hinternet.toString(), lpfninternetcallback.toLong().toString()) as String).toLong() else null

public actual fun InternetShowSecurityInfoByURL(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURL(lpszurl.toString(), hwndparent.toString()) as Int) else 0

public actual fun InternetShowSecurityInfoByURLA(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLA(lpszurl.toString(), hwndparent.toString()) as Int) else 0

public actual fun InternetShowSecurityInfoByURLW(lpszurl: PCWSTR, hwndparent: HWND): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLW(lpszurl.toString(), hwndparent.toString()) as Int) else 0

public actual fun InternetTimeFromSystemTime(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTime(pst.toString(), dwrfc.toInt(), lpsztime.toString(), cbtime.toInt()) as Int) else 0

public actual fun InternetTimeFromSystemTimeA(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeA(pst.toString(), dwrfc.toInt(), lpsztime.toString(), cbtime.toInt()) as Int) else 0

public actual fun InternetTimeFromSystemTimeW(pst: Long, dwrfc: UInt, lpsztime: PWSTR, cbtime: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeW(pst.toString(), dwrfc.toInt(), lpsztime.toString(), cbtime.toInt()) as Int) else 0

public actual fun InternetTimeToSystemTime(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTime(lpsztime.toString(), pst.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetTimeToSystemTimeA(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeA(lpsztime.toString(), pst.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetTimeToSystemTimeW(lpsztime: PCWSTR, pst: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeW(lpsztime.toString(), pst.toString(), dwreserved.toInt()) as Int) else 0

public actual fun InternetUnlockRequestFile(hlockrequestinfo: HANDLE): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetUnlockRequestFile(hlockrequestinfo.toString()) as Int) else 0

public actual fun InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetWriteFile(hfile.toString(), lpbuffer.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.toString()) as Int) else 0

public actual fun InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetWriteFileExA(hfile.toString(), lpbuffersin.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_InternetWriteFileExW(hfile.toString(), lpbuffersin.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else 0

public actual fun IsDomainLegalCookieDomainA(pchdomain: PCSTR, pchfulldomain: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainA(pchdomain.toString(), pchfulldomain.toString()) as Int) else 0

public actual fun IsDomainLegalCookieDomainW(pchdomain: PCWSTR, pchfulldomain: PCWSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainW(pchdomain.toString(), pchfulldomain.toString()) as Int) else 0

public actual fun IsHostInProxyBypassList(tscheme: INTERNET_SCHEME, lpszhost: PCSTR, cchhost: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IsHostInProxyBypassList(tscheme, lpszhost.toString(), cchhost.toInt()) as Int) else 0

public actual fun IsProfilesEnabled(): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IsProfilesEnabled() as Int) else 0

public actual fun IsUrlCacheEntryExpiredA(lpszurlname: PCSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredA(lpszurlname.toString(), dwflags.toInt(), pftlastmodified.toString()) as Int) else 0

public actual fun IsUrlCacheEntryExpiredW(lpszurlname: PCWSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredW(lpszurlname.toString(), dwflags.toInt(), pftlastmodified.toString()) as Int) else 0

public actual fun LoadUrlCacheContent(): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_LoadUrlCacheContent() as Int) else 0

public actual fun ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: UInt, lpszlistboxentry: PSTR, lpdwlistboxentry: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ParseX509EncodedCertificateForListBoxEntry(lpcert.toString(), cbcert.toInt(), lpszlistboxentry.toString(), lpdwlistboxentry.toString()) as Int).toUInt() else 0u

public actual fun PerformOperationOverUrlCacheA(pszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: CACHE_OPERATOR, poperatordata: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_PerformOperationOverUrlCacheA(pszurlsearchpattern.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), preserved1.toString(), pdwreserved2.toString(), preserved3.toString(), op.toLong().toString(), poperatordata.toString()) as Int) else 0

public actual fun PrivacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: Long, pszbuffer: PWSTR, pdwbufferlength: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_PrivacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), pdwtemplate.toString(), pszbuffer.toString(), pdwbufferlength.toString()) as Int).toUInt() else 0u

public actual fun PrivacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: PCWSTR): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_PrivacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), pszpreference.toString()) as Int).toUInt() else 0u

public actual fun ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ReadGuidsForConnectedNetworks(pcnetworks.toString(), pppwsznetworkguids.toString(), pppbstrnetworknames.toString(), pppwszgwmacs.toString(), pcgatewaymacs.toString(), pdwflags.toString()) as Int) else 0

public actual fun ReadUrlCacheEntryStream(hurlcachestream: HANDLE, dwlocation: UInt, lpbuffer: Long, lpdwlen: Long, reserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStream(hurlcachestream.toString(), dwlocation.toInt(), lpbuffer.toString(), lpdwlen.toString(), reserved.toInt()) as Int) else 0

public actual fun ReadUrlCacheEntryStreamEx(hurlcachestream: HANDLE, qwlocation: ULong, lpbuffer: Long, lpdwlen: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStreamEx(hurlcachestream.toString(), qwlocation.toString(), lpbuffer.toString(), lpdwlen.toString()) as Int) else 0

public actual fun RegisterUrlCacheNotification(hwnd: HWND, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_RegisterUrlCacheNotification(hwnd.toString(), umsg.toInt(), gid.toString(), dwopsfilter.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun ResumeSuspendedDownload(hrequest: Long, dwresultcode: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ResumeSuspendedDownload(hrequest.toString(), dwresultcode.toInt()) as Int) else 0

public actual fun RetrieveUrlCacheEntryFileA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileA(lpszurlname.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), dwreserved.toInt()) as Int) else 0

public actual fun RetrieveUrlCacheEntryFileW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileW(lpszurlname.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), dwreserved.toInt()) as Int) else 0

public actual fun RetrieveUrlCacheEntryStreamA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamA(lpszurlname.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), frandomread, dwreserved.toInt()) as String).toLong() else 0L

public actual fun RetrieveUrlCacheEntryStreamW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamW(lpszurlname.toString(), lpcacheentryinfo.toString(), lpcbcacheentryinfo.toString(), frandomread, dwreserved.toInt()) as String).toLong() else 0L

public actual fun RunOnceUrlCache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_RunOnceUrlCache(hwnd.toString(), hinst.toString(), lpszcmd.toString(), ncmdshow) as Int).toUInt() else 0u

public actual fun SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoA(lpcacheconfiginfo.toString(), dwfieldcontrol.toInt()) as Int) else 0

public actual fun SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoW(lpcacheconfiginfo.toString(), dwfieldcontrol.toInt()) as Int) else 0

public actual fun SetUrlCacheEntryGroup(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroup(lpszurlname.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.toString(), cbgroupattributes.toInt(), lpreserved.toString()) as Int) else 0

public actual fun SetUrlCacheEntryGroupA(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupA(lpszurlname.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.toString(), cbgroupattributes.toInt(), lpreserved.toString()) as Int) else 0

public actual fun SetUrlCacheEntryGroupW(lpszurlname: PCWSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupW(lpszurlname.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.toString(), cbgroupattributes.toInt(), lpreserved.toString()) as Int) else 0

public actual fun SetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoA(lpszurlname.toString(), lpcacheentryinfo.toString(), dwfieldcontrol.toInt()) as Int) else 0

public actual fun SetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoW(lpszurlname.toString(), lpcacheentryinfo.toString(), dwfieldcontrol.toInt()) as Int) else 0

public actual fun SetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.toString(), lpreserved.toString()) as Int) else 0

public actual fun SetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.toString(), lpreserved.toString()) as Int) else 0

public actual fun SetUrlCacheHeaderData(nidx: UInt, dwdata: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_SetUrlCacheHeaderData(nidx.toInt(), dwdata.toInt()) as Int) else 0

public actual fun ShowClientAuthCerts(hwndparent: HWND): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ShowClientAuthCerts(hwndparent.toString()) as Int).toUInt() else 0u

public actual fun ShowSecurityInfo(hwndparent: HWND, psecurityinfo: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ShowSecurityInfo(hwndparent.toString(), psecurityinfo.toString()) as Int).toUInt() else 0u

public actual fun ShowX509EncodedCertificate(hwndparent: HWND, lpcert: Long, cbcert: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ShowX509EncodedCertificate(hwndparent.toString(), lpcert.toString(), cbcert.toInt()) as Int).toUInt() else 0u

public actual fun UnlockUrlCacheEntryFile(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFile(lpszurlname.toString(), dwreserved.toInt()) as Int) else 0

public actual fun UnlockUrlCacheEntryFileA(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileA(lpszurlname.toString(), dwreserved.toInt()) as Int) else 0

public actual fun UnlockUrlCacheEntryFileW(lpszurlname: PCWSTR, dwreserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileW(lpszurlname.toString(), dwreserved.toInt()) as Int) else 0

public actual fun UnlockUrlCacheEntryStream(hurlcachestream: HANDLE, reserved: UInt): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryStream(hurlcachestream.toString(), reserved.toInt()) as Int) else 0

public actual fun UpdateUrlCacheContentPath(sznewpath: PCSTR): BOOL =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UpdateUrlCacheContentPath(sznewpath.toString()) as Int) else 0

public actual fun UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: UInt, rgfexist: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheCheckEntriesExist(rgpwszurls.toString(), centries.toInt(), rgfexist.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheCloseEntryHandle(hentryfile: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheCloseEntryHandle(hentryfile.toString())
    }
}

public actual fun UrlCacheContainerSetEntryMaximumAge(pwszprefix: PCWSTR, dwentrymaxage: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheContainerSetEntryMaximumAge(pwszprefix.toString(), dwentrymaxage.toInt()) as Int).toUInt() else 0u

public actual fun UrlCacheCreateContainer(pwszname: PCWSTR, pwszprefix: PCWSTR, pwszdirectory: PCWSTR, ulllimit: ULong, dwoptions: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheCreateContainer(pwszname.toString(), pwszprefix.toString(), pwszdirectory.toString(), ulllimit.toString(), dwoptions.toInt()) as Int).toUInt() else 0u

public actual fun UrlCacheFindFirstEntry(pwszprefix: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: Long, phfind: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheFindFirstEntry(pwszprefix.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), pcacheentryinfo.toString(), phfind.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheFindNextEntry(hfind: HANDLE, pcacheentryinfo: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheFindNextEntry(hfind.toString(), pcacheentryinfo.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheFreeEntryInfo(pcacheentryinfo: Long) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheFreeEntryInfo(pcacheentryinfo.toString())
    }
}

public actual fun UrlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheFreeGlobalSpace(ulltargetsize.toString(), dwfilter.toInt()) as Int).toUInt() else 0u

public actual fun UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheGetContentPaths(pppwszdirectories.toString(), pcdirectories.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheGetEntryInfo(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheGetEntryInfo(happcache.toString(), pcwszurl.toString(), pcacheentryinfo.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: Long, pulllimit: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalCacheSize(dwfilter.toInt(), pullsize.toString(), pulllimit.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheGetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, pulllimit: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalLimit(limittype, pulllimit.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: ULong, pbuffer: Long, dwbufferlen: UInt, pdwbufferlen: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheReadEntryStream(hurlcachestream.toString(), ulllocation.toString(), pbuffer.toString(), dwbufferlen.toInt(), pdwbufferlen.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheReloadSettings(): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheReloadSettings() as Int).toUInt() else 0u

public actual fun UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long, phentryfile: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryFile(happcache.toString(), pcwszurl.toString(), pcacheentryinfo.toString(), phentryfile.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: PCWSTR, frandomread: BOOL, pcacheentryinfo: Long, phentrystream: Long): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryStream(happcache.toString(), pcwszurl.toString(), frandomread, pcacheentryinfo.toString(), phentrystream.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheServer(): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheServer() as Int).toUInt() else 0u

public actual fun UrlCacheSetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, ulllimit: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheSetGlobalLimit(limittype, ulllimit.toString()) as Int).toUInt() else 0u

public actual fun UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: PCWSTR, pbextradata: Long, cbextradata: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_UrlCacheUpdateEntryExtraData(happcache.toString(), pcwszurl.toString(), pbextradata.toString(), cbextradata.toInt()) as Int).toUInt() else 0u

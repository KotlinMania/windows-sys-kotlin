@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.WinHttpCreateUrlFlags
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pbmanifestresponseheaders: COpaquePointer?, dwmanifestresponseheaderssize: UInt, pestate: COpaquePointer?, phnewappcache: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheCheckManifest(pwszmasterurl?.value?.toCPointer<ByteVar>(), pwszmanifesturl?.value?.toCPointer<ByteVar>(), pbmanifestdata?.value?.toCPointer<ByteVar>(), dwmanifestdatasize, pbmanifestresponseheaders?.value?.toCPointer<ByteVar>(), dwmanifestresponseheaderssize, pestate?.value?.toCPointer<ByteVar>(), phnewappcache?.value?.toCPointer<ByteVar>())

public actual fun appCacheCloseHandle(happcache: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheCloseHandle(happcache?.value?.toCPointer<ByteVar>())
}

public actual fun appCacheCreateAndCommitFile(happcache: COpaquePointer?, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: COpaquePointer?, dwresponseheaderssize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheCreateAndCommitFile(happcache?.value?.toCPointer<ByteVar>(), pwszsourcefilepath?.value?.toCPointer<ByteVar>(), pwszurl?.value?.toCPointer<ByteVar>(), pbresponseheaders?.value?.toCPointer<ByteVar>(), dwresponseheaderssize)

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheDeleteGroup(pwszmanifesturl?.value?.toCPointer<ByteVar>())

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheDeleteIEGroup(pwszmanifesturl?.value?.toCPointer<ByteVar>())

public actual fun appCacheDuplicateHandle(happcache: COpaquePointer?, phduplicatedappcache: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheDuplicateHandle(happcache?.value?.toCPointer<ByteVar>(), phduplicatedappcache?.value?.toCPointer<ByteVar>())

public actual fun appCacheFinalize(happcache: COpaquePointer?, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pestate: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheFinalize(happcache?.value?.toCPointer<ByteVar>(), pbmanifestdata?.value?.toCPointer<ByteVar>(), dwmanifestdatasize, pestate?.value?.toCPointer<ByteVar>())

public actual fun appCacheFreeDownloadList(pdownloadlist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheFreeDownloadList(pdownloadlist?.value?.toCPointer<ByteVar>())
}

public actual fun appCacheFreeGroupList(pappcachegrouplist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheFreeGroupList(pappcachegrouplist?.value?.toCPointer<ByteVar>())
}

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    0u

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    0u

public actual fun appCacheGetDownloadList(happcache: COpaquePointer?, pdownloadlist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheGetDownloadList(happcache?.value?.toCPointer<ByteVar>(), pdownloadlist?.value?.toCPointer<ByteVar>())

public actual fun appCacheGetFallbackUrl(happcache: COpaquePointer?, pwszurl: Pcwstr, ppwszfallbackurl: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheGetFallbackUrl(happcache?.value?.toCPointer<ByteVar>(), pwszurl?.value?.toCPointer<ByteVar>(), ppwszfallbackurl?.value?.toCPointer<ByteVar>())

public actual fun appCacheGetGroupList(pappcachegrouplist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheGetGroupList(pappcachegrouplist?.value?.toCPointer<ByteVar>())

public actual fun appCacheGetIEGroupList(pappcachegrouplist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheGetIEGroupList(pappcachegrouplist?.value?.toCPointer<ByteVar>())

public actual fun appCacheGetInfo(happcache: COpaquePointer?, pappcacheinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheGetInfo(happcache?.value?.toCPointer<ByteVar>(), pappcacheinfo?.value?.toCPointer<ByteVar>())

public actual fun appCacheGetManifestUrl(happcache: COpaquePointer?, ppwszmanifesturl: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheGetManifestUrl(happcache?.value?.toCPointer<ByteVar>(), ppwszmanifesturl?.value?.toCPointer<ByteVar>())

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_appCacheLookup(pwszurl?.value?.toCPointer<ByteVar>(), dwflags, phappcache?.value?.toCPointer<ByteVar>())

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: COpaquePointer?, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    0

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: COpaquePointer?, cbblob: UInt): UInt =
    0u

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    0

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createMD5SSOHash(pszchallengeinfo?.value?.toCPointer<ByteVar>(), pwszrealm?.value?.toCPointer<ByteVar>(), pwsztarget?.value?.toCPointer<ByteVar>(), pbhexhash?.value?.toCPointer<ByteVar>())

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createUrlCacheContainerA(name?.value?.toCPointer<ByteVar>(), lpcacheprefix?.value?.toCPointer<ByteVar>(), lpszcachepath?.value?.toCPointer<ByteVar>(), kbcachelimit, dwcontainertype, dwoptions, pvbuffer?.value?.toCPointer<ByteVar>(), cbbuffer?.value?.toCPointer<ByteVar>())

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createUrlCacheContainerW(name?.value?.toCPointer<ByteVar>(), lpcacheprefix?.value?.toCPointer<ByteVar>(), lpszcachepath?.value?.toCPointer<ByteVar>(), kbcachelimit, dwcontainertype, dwoptions, pvbuffer?.value?.toCPointer<ByteVar>(), cbbuffer?.value?.toCPointer<ByteVar>())

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createUrlCacheEntryA(lpszurlname?.value?.toCPointer<ByteVar>(), dwexpectedfilesize, lpszfileextension?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createUrlCacheEntryExW(lpszurlname?.value?.toCPointer<ByteVar>(), dwexpectedfilesize, lpszfileextension?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), dwreserved, fpreserveincomingfilename)

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createUrlCacheEntryW(lpszurlname?.value?.toCPointer<ByteVar>(), dwexpectedfilesize, lpszfileextension?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: COpaquePointer?): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_createUrlCacheGroup(dwflags, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteIE3Cache(hwnd?.value?.toCPointer<ByteVar>(), hinst?.value?.toCPointer<ByteVar>(), lpszcmd?.value?.toCPointer<ByteVar>(), ncmdshow)

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerA(name?.value?.toCPointer<ByteVar>(), dwoptions)

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerW(name?.value?.toCPointer<ByteVar>(), dwoptions)

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntry(lpszurlname?.value?.toCPointer<ByteVar>())

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryA(lpszurlname?.value?.toCPointer<ByteVar>())

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryW(lpszurlname?.value?.toCPointer<ByteVar>())

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteUrlCacheGroup(groupid, dwflags, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_deleteWpadCacheForNetworks(param0)

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_detectAutoProxyUrl(pszautoproxyurl?.value?.toCPointer<ByteVar>(), cchautoproxyurl, dwdetectflags)

public actual fun doConnectoidsExist(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_doConnectoidsExist()

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_exportCookieFileA(szfilename?.value?.toCPointer<ByteVar>(), fappend)

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_exportCookieFileW(szfilename?.value?.toCPointer<ByteVar>(), fappend)

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findCloseUrlCache(henumhandle?.value?.toCPointer<ByteVar>())

public actual fun findFirstUrlCacheContainerA(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerA(pdwmodified?.value?.toCPointer<ByteVar>(), lpcontainerinfo?.value?.toCPointer<ByteVar>(), lpcbcontainerinfo?.value?.toCPointer<ByteVar>(), dwoptions)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstUrlCacheContainerW(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerW(pdwmodified?.value?.toCPointer<ByteVar>(), lpcontainerinfo?.value?.toCPointer<ByteVar>(), lpcbcontainerinfo?.value?.toCPointer<ByteVar>(), dwoptions)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryA(lpszurlsearchpattern?.value?.toCPointer<ByteVar>(), lpfirstcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExA(lpszurlsearchpattern?.value?.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, lpfirstcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), lpgroupattributes?.value?.toCPointer<ByteVar>(), lpcbgroupattributes?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExW(lpszurlsearchpattern?.value?.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, lpfirstcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), lpgroupattributes?.value?.toCPointer<ByteVar>(), lpcbgroupattributes?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryW(lpszurlsearchpattern?.value?.toCPointer<ByteVar>(), lpfirstcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: COpaquePointer?, dwsearchcondition: UInt, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findFirstUrlCacheGroup(dwflags, dwfilter, lpsearchcondition?.value?.toCPointer<ByteVar>(), dwsearchcondition, lpgroupid?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerA(henumhandle?.value?.toCPointer<ByteVar>(), lpcontainerinfo?.value?.toCPointer<ByteVar>(), lpcbcontainerinfo?.value?.toCPointer<ByteVar>())

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerW(henumhandle?.value?.toCPointer<ByteVar>(), lpcontainerinfo?.value?.toCPointer<ByteVar>(), lpcbcontainerinfo?.value?.toCPointer<ByteVar>())

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryA(henumhandle?.value?.toCPointer<ByteVar>(), lpnextcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>())

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExA(henumhandle?.value?.toCPointer<ByteVar>(), lpnextcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), lpgroupattributes?.value?.toCPointer<ByteVar>(), lpcbgroupattributes?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExW(henumhandle?.value?.toCPointer<ByteVar>(), lpnextcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), lpgroupattributes?.value?.toCPointer<ByteVar>(), lpcbgroupattributes?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryW(henumhandle?.value?.toCPointer<ByteVar>(), lpnextcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>())

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findNextUrlCacheGroup(hfind?.value?.toCPointer<ByteVar>(), lpgroupid?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_findP3PPolicySymbol(pszsymbol?.value?.toCPointer<ByteVar>())

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceA(lpszcachepath?.value?.toCPointer<ByteVar>(), dwsize, dwfilter)

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceW(lpszcachepath?.value?.toCPointer<ByteVar>(), dwsize, dwfilter)

public actual fun ftpCommandA(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpCommandA(hconnect?.value?.toCPointer<ByteVar>(), fexpectresponse, dwflags, lpszcommand?.value?.toCPointer<ByteVar>(), dwcontext, phftpcommand?.value?.toCPointer<ByteVar>())

public actual fun ftpCommandW(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpCommandW(hconnect?.value?.toCPointer<ByteVar>(), fexpectresponse, dwflags, lpszcommand?.value?.toCPointer<ByteVar>(), dwcontext, phftpcommand?.value?.toCPointer<ByteVar>())

public actual fun ftpCreateDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpCreateDirectoryA(hconnect?.value?.toCPointer<ByteVar>(), lpszdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpCreateDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpCreateDirectoryW(hconnect?.value?.toCPointer<ByteVar>(), lpszdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpDeleteFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpDeleteFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>())

public actual fun ftpDeleteFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpDeleteFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>())

public actual fun ftpFindFirstFileA(hconnect: COpaquePointer?, lpszsearchfile: Pcstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpFindFirstFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszsearchfile?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun ftpFindFirstFileW(hconnect: COpaquePointer?, lpszsearchfile: Pcwstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpFindFirstFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszsearchfile?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun ftpGetCurrentDirectoryA(hconnect: COpaquePointer?, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryA(hconnect?.value?.toCPointer<ByteVar>(), lpszcurrentdirectory?.value?.toCPointer<ByteVar>(), lpdwcurrentdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpGetCurrentDirectoryW(hconnect: COpaquePointer?, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryW(hconnect?.value?.toCPointer<ByteVar>(), lpszcurrentdirectory?.value?.toCPointer<ByteVar>(), lpdwcurrentdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpGetFileA(hconnect: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpGetFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszremotefile?.value?.toCPointer<ByteVar>(), lpsznewfile?.value?.toCPointer<ByteVar>(), ffailifexists, dwflagsandattributes, dwflags, dwcontext)

public actual fun ftpGetFileEx(hftpsession: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpGetFileEx(hftpsession?.value?.toCPointer<ByteVar>(), lpszremotefile?.value?.toCPointer<ByteVar>(), lpsznewfile?.value?.toCPointer<ByteVar>(), ffailifexists, dwflagsandattributes, dwflags, dwcontext)

public actual fun ftpGetFileSize(hfile: COpaquePointer?, lpdwfilesizehigh: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpGetFileSize(hfile?.value?.toCPointer<ByteVar>(), lpdwfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun ftpGetFileW(hconnect: COpaquePointer?, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpGetFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszremotefile?.value?.toCPointer<ByteVar>(), lpsznewfile?.value?.toCPointer<ByteVar>(), ffailifexists, dwflagsandattributes, dwflags, dwcontext)

public actual fun ftpOpenFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpOpenFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), dwaccess, dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun ftpOpenFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpOpenFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), dwaccess, dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun ftpPutFileA(hconnect: COpaquePointer?, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpPutFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszlocalfile?.value?.toCPointer<ByteVar>(), lpsznewremotefile?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun ftpPutFileEx(hftpsession: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpPutFileEx(hftpsession?.value?.toCPointer<ByteVar>(), lpszlocalfile?.value?.toCPointer<ByteVar>(), lpsznewremotefile?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun ftpPutFileW(hconnect: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpPutFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszlocalfile?.value?.toCPointer<ByteVar>(), lpsznewremotefile?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun ftpRemoveDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryA(hconnect?.value?.toCPointer<ByteVar>(), lpszdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpRemoveDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryW(hconnect?.value?.toCPointer<ByteVar>(), lpszdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpRenameFileA(hconnect: COpaquePointer?, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpRenameFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszexisting?.value?.toCPointer<ByteVar>(), lpsznew?.value?.toCPointer<ByteVar>())

public actual fun ftpRenameFileW(hconnect: COpaquePointer?, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpRenameFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszexisting?.value?.toCPointer<ByteVar>(), lpsznew?.value?.toCPointer<ByteVar>())

public actual fun ftpSetCurrentDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryA(hconnect?.value?.toCPointer<ByteVar>(), lpszdirectory?.value?.toCPointer<ByteVar>())

public actual fun ftpSetCurrentDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryW(hconnect?.value?.toCPointer<ByteVar>(), lpszdirectory?.value?.toCPointer<ByteVar>())

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: COpaquePointer?, pdlavail: COpaquePointer?, pdltotal: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getDiskInfoA(pszpath?.value?.toCPointer<ByteVar>(), pdwclustersize?.value?.toCPointer<ByteVar>(), pdlavail?.value?.toCPointer<ByteVar>(), pdltotal?.value?.toCPointer<ByteVar>())

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoA(lpcacheconfiginfo?.value?.toCPointer<ByteVar>(), lpcbcacheconfiginfo?.value?.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoW(lpcacheconfiginfo?.value?.toCPointer<ByteVar>(), lpcbcacheconfiginfo?.value?.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: COpaquePointer?, pftexpiretime: COpaquePointer?, pftaccesstime: COpaquePointer?, pftmodifiedtime: COpaquePointer?, ppbblob: COpaquePointer?, pcbblob: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheEntryBinaryBlob(pwszurlname?.value?.toCPointer<ByteVar>(), dwtype?.value?.toCPointer<ByteVar>(), pftexpiretime?.value?.toCPointer<ByteVar>(), pftaccesstime?.value?.toCPointer<ByteVar>(), pftmodifiedtime?.value?.toCPointer<ByteVar>(), ppbblob?.value?.toCPointer<ByteVar>(), pcbblob?.value?.toCPointer<ByteVar>())

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoA(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>())

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExA(lpszurl?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), lpszredirecturl?.value?.toCPointer<ByteVar>(), lpcbredirecturl?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcwstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExW(lpszurl?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), lpszredirecturl?.value?.toCPointer<ByteVar>(), lpcbredirecturl?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoW(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>())

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeA(gid, dwflags, dwattributes, lpgroupinfo?.value?.toCPointer<ByteVar>(), lpcbgroupinfo?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeW(gid, dwflags, dwattributes, lpgroupinfo?.value?.toCPointer<ByteVar>(), lpcbgroupinfo?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_getUrlCacheHeaderData(nidx, lpdwdata?.value?.toCPointer<ByteVar>())

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherCreateLocatorA(lpszhost?.value?.toCPointer<ByteVar>(), nserverport, lpszdisplaystring?.value?.toCPointer<ByteVar>(), lpszselectorstring?.value?.toCPointer<ByteVar>(), dwgophertype, lpszlocator?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherCreateLocatorW(lpszhost?.value?.toCPointer<ByteVar>(), nserverport, lpszdisplaystring?.value?.toCPointer<ByteVar>(), lpszselectorstring?.value?.toCPointer<ByteVar>(), dwgophertype, lpszlocator?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun gopherFindFirstFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherFindFirstFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszlocator?.value?.toCPointer<ByteVar>(), lpszsearchstring?.value?.toCPointer<ByteVar>(), lpfinddata?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun gopherFindFirstFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherFindFirstFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszlocator?.value?.toCPointer<ByteVar>(), lpszsearchstring?.value?.toCPointer<ByteVar>(), lpfinddata?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun gopherGetAttributeA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherGetAttributeA(hconnect?.value?.toCPointer<ByteVar>(), lpszlocator?.value?.toCPointer<ByteVar>(), lpszattributename?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, lpdwcharactersreturned?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwcontext)

public actual fun gopherGetAttributeW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherGetAttributeW(hconnect?.value?.toCPointer<ByteVar>(), lpszlocator?.value?.toCPointer<ByteVar>(), lpszattributename?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, lpdwcharactersreturned?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwcontext)

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeA(lpszlocator?.value?.toCPointer<ByteVar>(), lpdwgophertype?.value?.toCPointer<ByteVar>())

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeW(lpszlocator?.value?.toCPointer<ByteVar>(), lpdwgophertype?.value?.toCPointer<ByteVar>())

public actual fun gopherOpenFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherOpenFileA(hconnect?.value?.toCPointer<ByteVar>(), lpszlocator?.value?.toCPointer<ByteVar>(), lpszview?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun gopherOpenFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_gopherOpenFileW(hconnect?.value?.toCPointer<ByteVar>(), lpszlocator?.value?.toCPointer<ByteVar>(), lpszview?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun httpAddRequestHeadersA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpAddRequestHeadersA(hrequest?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun httpAddRequestHeadersW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpAddRequestHeadersW(hrequest?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpCheckDavComplianceA(lpszurl?.value?.toCPointer<ByteVar>(), lpszcompliancetoken?.value?.toCPointer<ByteVar>(), lpffound?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>())

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpCheckDavComplianceW(lpszurl?.value?.toCPointer<ByteVar>(), lpszcompliancetoken?.value?.toCPointer<ByteVar>(), lpffound?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>())

public actual fun httpCloseDependencyHandle(hdependencyhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpCloseDependencyHandle(hdependencyhandle?.value?.toCPointer<ByteVar>())
}

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: COpaquePointer?, phduplicateddependencyhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpDuplicateDependencyHandle(hdependencyhandle?.value?.toCPointer<ByteVar>(), phduplicateddependencyhandle?.value?.toCPointer<ByteVar>())

public actual fun httpEndRequestA(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpEndRequestA(hrequest?.value?.toCPointer<ByteVar>(), lpbuffersout?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun httpEndRequestW(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpEndRequestW(hrequest?.value?.toCPointer<ByteVar>(), lpbuffersout?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: COpaquePointer?, ppwszpassword: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpGetServerCredentials(pwszurl?.value?.toCPointer<ByteVar>(), ppwszusername?.value?.toCPointer<ByteVar>(), ppwszpassword?.value?.toCPointer<ByteVar>())

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpIndicatePageLoadComplete(hdependencyhandle?.value?.toCPointer<ByteVar>())

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpIsHostHstsEnabled(pcwszurl?.value?.toCPointer<ByteVar>(), pfishsts?.value?.toCPointer<ByteVar>())

public actual fun httpOpenDependencyHandle(hrequesthandle: COpaquePointer?, fbackground: Bool, phdependencyhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpOpenDependencyHandle(hrequesthandle?.value?.toCPointer<ByteVar>(), fbackground, phdependencyhandle?.value?.toCPointer<ByteVar>())

public actual fun httpOpenRequestA(hconnect: COpaquePointer?, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpOpenRequestA(hconnect?.value?.toCPointer<ByteVar>(), lpszverb?.value?.toCPointer<ByteVar>(), lpszobjectname?.value?.toCPointer<ByteVar>(), lpszversion?.value?.toCPointer<ByteVar>(), lpszreferrer?.value?.toCPointer<ByteVar>(), lplpszaccepttypes?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun httpOpenRequestW(hconnect: COpaquePointer?, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpOpenRequestW(hconnect?.value?.toCPointer<ByteVar>(), lpszverb?.value?.toCPointer<ByteVar>(), lpszobjectname?.value?.toCPointer<ByteVar>(), lpszversion?.value?.toCPointer<ByteVar>(), lpszreferrer?.value?.toCPointer<ByteVar>(), lplpszaccepttypes?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun httpPushClose(hwait: HttpPushWaitHandle) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpPushClose(hwait?.value?.toCPointer<ByteVar>())
}

public actual fun httpPushEnable(hrequest: COpaquePointer?, ptransportsetting: COpaquePointer?, phwait: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpPushEnable(hrequest?.value?.toCPointer<ByteVar>(), ptransportsetting?.value?.toCPointer<ByteVar>(), phwait?.value?.toCPointer<ByteVar>())

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpPushWait(hwait?.value?.toCPointer<ByteVar>(), etype, pnotificationstatus?.value?.toCPointer<ByteVar>())

public actual fun httpQueryInfoA(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpQueryInfoA(hrequest?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpdwindex?.value?.toCPointer<ByteVar>())

public actual fun httpQueryInfoW(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpQueryInfoW(hrequest?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), lpdwindex?.value?.toCPointer<ByteVar>())

public actual fun httpSendRequestA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpSendRequestA(hrequest?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, lpoptional?.value?.toCPointer<ByteVar>(), dwoptionallength)

public actual fun httpSendRequestExA(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpSendRequestExA(hrequest?.value?.toCPointer<ByteVar>(), lpbuffersin?.value?.toCPointer<ByteVar>(), lpbuffersout?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun httpSendRequestExW(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpSendRequestExW(hrequest?.value?.toCPointer<ByteVar>(), lpbuffersin?.value?.toCPointer<ByteVar>(), lpbuffersout?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun httpSendRequestW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpSendRequestW(hrequest?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, lpoptional?.value?.toCPointer<ByteVar>(), dwoptionallength)

public actual fun httpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpWebSocketClose(hwebsocket?.value?.toCPointer<ByteVar>(), usstatus, pvreason?.value?.toCPointer<ByteVar>(), dwreasonlength)

public actual fun httpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpWebSocketCompleteUpgrade(hrequest?.value?.toCPointer<ByteVar>(), dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpWebSocketQueryCloseStatus(hwebsocket?.value?.toCPointer<ByteVar>(), pusstatus?.value?.toCPointer<ByteVar>(), pvreason?.value?.toCPointer<ByteVar>(), dwreasonlength, pdwreasonlengthconsumed?.value?.toCPointer<ByteVar>())

public actual fun httpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pbuffertype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpWebSocketReceive(hwebsocket?.value?.toCPointer<ByteVar>(), pvbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, pdwbytesread?.value?.toCPointer<ByteVar>(), pbuffertype?.value?.toCPointer<ByteVar>())

public actual fun httpWebSocketSend(hwebsocket: COpaquePointer?, buffertype: HttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpWebSocketSend(hwebsocket?.value?.toCPointer<ByteVar>(), buffertype, pvbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength)

public actual fun httpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_httpWebSocketShutdown(hwebsocket?.value?.toCPointer<ByteVar>(), usstatus, pvreason?.value?.toCPointer<ByteVar>(), dwreasonlength)

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_importCookieFileA(szfilename?.value?.toCPointer<ByteVar>())

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_importCookieFileW(szfilename?.value?.toCPointer<ByteVar>())

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_incrementUrlCacheHeaderData(nidx, lpdwdata?.value?.toCPointer<ByteVar>())

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internalInternetGetCookie(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), lpdwdatasize?.value?.toCPointer<ByteVar>())

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetAlgIdToStringA(ai, lpstr?.value?.toCPointer<ByteVar>(), lpdwstrlength?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetAlgIdToStringW(ai, lpstr?.value?.toCPointer<ByteVar>(), lpdwstrlength?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetAttemptConnect(dwreserved)

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetAutodial(dwflags, hwndparent?.value?.toCPointer<ByteVar>())

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetAutodialHangup(dwreserved)

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlA(lpszurl?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlW(lpszurl?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCheckConnectionA(lpszurl?.value?.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCheckConnectionW(lpszurl?.value?.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetClearAllPerSiteCookieDecisions()

public actual fun internetCloseHandle(hinternet: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCloseHandle(hinternet?.value?.toCPointer<ByteVar>())

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCombineUrlA(lpszbaseurl?.value?.toCPointer<ByteVar>(), lpszrelativeurl?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCombineUrlW(lpszbaseurl?.value?.toCPointer<ByteVar>(), lpszrelativeurl?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossing(hwnd?.value?.toCPointer<ByteVar>(), szurlprev?.value?.toCPointer<ByteVar>(), szurlnew?.value?.toCPointer<ByteVar>(), bpost)

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingA(hwnd?.value?.toCPointer<ByteVar>(), szurlprev?.value?.toCPointer<ByteVar>(), szurlnew?.value?.toCPointer<ByteVar>(), bpost)

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingW(hwnd?.value?.toCPointer<ByteVar>(), szurlprev?.value?.toCPointer<ByteVar>(), szurlnew?.value?.toCPointer<ByteVar>(), bpost)

public actual fun internetConnectA(hinternet: COpaquePointer?, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetConnectA(hinternet?.value?.toCPointer<ByteVar>(), lpszservername?.value?.toCPointer<ByteVar>(), nserverport, lpszusername?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwservice, dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun internetConnectW(hinternet: COpaquePointer?, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetConnectW(hinternet?.value?.toCPointer<ByteVar>(), lpszservername?.value?.toCPointer<ByteVar>(), nserverport, lpszusername?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwservice, dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetConvertUrlFromWireToWideChar(pcszurl?.value?.toCPointer<ByteVar>(), cchurl, pcwszbaseurl?.value?.toCPointer<ByteVar>(), dwcodepagehost, dwcodepagepath, fencodepathextra, dwcodepageextra, ppwszconvertedurl?.value?.toCPointer<ByteVar>())

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCrackUrlA(lpszurl?.value?.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents?.value?.toCPointer<ByteVar>())

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCrackUrlW(lpszurl?.value?.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents?.value?.toCPointer<ByteVar>())

public actual fun internetCreateUrlA(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pstr, lpdwurllength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCreateUrlA(lpurlcomponents?.value?.toCPointer<ByteVar>(), dwflags, lpszurl?.value?.toCPointer<ByteVar>(), lpdwurllength?.value?.toCPointer<ByteVar>())

public actual fun internetCreateUrlW(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetCreateUrlW(lpurlcomponents?.value?.toCPointer<ByteVar>(), dwflags, lpszurl?.value?.toCPointer<ByteVar>(), lpdwurllength?.value?.toCPointer<ByteVar>())

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetDial(hwndparent?.value?.toCPointer<ByteVar>(), lpszconnectoid?.value?.toCPointer<ByteVar>(), dwflags, lpdwconnection?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetDialA(hwndparent?.value?.toCPointer<ByteVar>(), lpszconnectoid?.value?.toCPointer<ByteVar>(), dwflags, lpdwconnection?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetDialW(hwndparent?.value?.toCPointer<ByteVar>(), lpszconnectoid?.value?.toCPointer<ByteVar>(), dwflags, lpdwconnection?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionA(pszsitename?.value?.toCPointer<ByteVar>(), pcsitenamesize?.value?.toCPointer<ByteVar>(), pdwdecision?.value?.toCPointer<ByteVar>(), dwindex)

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionW(pszsitename?.value?.toCPointer<ByteVar>(), pcsitenamesize?.value?.toCPointer<ByteVar>(), pdwdecision?.value?.toCPointer<ByteVar>(), dwindex)

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: COpaquePointer?, dwerror: UInt, dwflags: UInt, lppvdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetErrorDlg(hwnd?.value?.toCPointer<ByteVar>(), hrequest?.value?.toCPointer<ByteVar>(), dwerror, dwflags, lppvdata?.value?.toCPointer<ByteVar>())

public actual fun internetFindNextFileA(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetFindNextFileA(hfind?.value?.toCPointer<ByteVar>(), lpvfinddata?.value?.toCPointer<ByteVar>())

public actual fun internetFindNextFileW(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetFindNextFileW(hfind?.value?.toCPointer<ByteVar>(), lpvfinddata?.value?.toCPointer<ByteVar>())

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetFortezzaCommand(dwcommand, hwnd?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetFreeCookies(pcookies: COpaquePointer?, dwcookiecount: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetFreeCookies(pcookies?.value?.toCPointer<ByteVar>(), dwcookiecount)
}

public actual fun internetFreeProxyInfoList(pproxyinfolist: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetFreeProxyInfoList(pproxyinfolist?.value?.toCPointer<ByteVar>())
}

public actual fun internetGetConnectedState(lpdwflags: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetConnectedState(lpdwflags?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetGetConnectedStateEx(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetConnectedStateEx(lpdwflags?.value?.toCPointer<ByteVar>(), lpszconnectionname?.value?.toCPointer<ByteVar>(), dwnamelen, dwreserved)

public actual fun internetGetConnectedStateExA(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetConnectedStateExA(lpdwflags?.value?.toCPointer<ByteVar>(), lpszconnectionname?.value?.toCPointer<ByteVar>(), cchnamelen, dwreserved)

public actual fun internetGetConnectedStateExW(lpdwflags: COpaquePointer?, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetConnectedStateExW(lpdwflags?.value?.toCPointer<ByteVar>(), lpszconnectionname?.value?.toCPointer<ByteVar>(), cchnamelen, dwreserved)

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetCookieA(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: COpaquePointer?, pdwcookiecount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetCookieEx2(pcwszurl?.value?.toCPointer<ByteVar>(), pcwszcookiename?.value?.toCPointer<ByteVar>(), dwflags, ppcookies?.value?.toCPointer<ByteVar>(), pdwcookiecount?.value?.toCPointer<ByteVar>())

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetCookieExA(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>(), dwflags, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetCookieExW(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>(), dwflags, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetCookieW(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), lpdwsize?.value?.toCPointer<ByteVar>())

public actual fun internetGetLastResponseInfoA(lpdwerror: COpaquePointer?, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoA(lpdwerror?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun internetGetLastResponseInfoW(lpdwerror: COpaquePointer?, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoW(lpdwerror?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionA(pchhostname?.value?.toCPointer<ByteVar>(), presult?.value?.toCPointer<ByteVar>())

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionW(pchhostname?.value?.toCPointer<ByteVar>(), presult?.value?.toCPointer<ByteVar>())

public actual fun internetGetProxyForUrl(hinternet: COpaquePointer?, pcwszurl: Pcwstr, pproxyinfolist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetProxyForUrl(hinternet?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), pproxyinfolist?.value?.toCPointer<ByteVar>())

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURL(lpszurl?.value?.toCPointer<ByteVar>(), ppcertchain?.value?.toCPointer<ByteVar>(), pdwsecureflags?.value?.toCPointer<ByteVar>())

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLA(lpszurl?.value?.toCPointer<ByteVar>(), ppcertchain?.value?.toCPointer<ByteVar>(), pdwsecureflags?.value?.toCPointer<ByteVar>())

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLW(lpszurl?.value?.toCPointer<ByteVar>(), ppcertchain?.value?.toCPointer<ByteVar>(), pdwsecureflags?.value?.toCPointer<ByteVar>())

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGoOnline(lpszurl?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGoOnlineA(lpszurl?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetGoOnlineW(lpszurl?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetHangUp(dwconnection, dwreserved)

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetInitializeAutoProxyDll(dwreserved)

public actual fun internetLockRequestFile(hinternet: COpaquePointer?, lphlockrequestinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetLockRequestFile(hinternet?.value?.toCPointer<ByteVar>(), lphlockrequestinfo?.value?.toCPointer<ByteVar>())

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetOpenA(lpszagent?.value?.toCPointer<ByteVar>(), dwaccesstype, lpszproxy?.value?.toCPointer<ByteVar>(), lpszproxybypass?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun internetOpenUrlA(hinternet: COpaquePointer?, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetOpenUrlA(hinternet?.value?.toCPointer<ByteVar>(), lpszurl?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun internetOpenUrlW(hinternet: COpaquePointer?, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetOpenUrlW(hinternet?.value?.toCPointer<ByteVar>(), lpszurl?.value?.toCPointer<ByteVar>(), lpszheaders?.value?.toCPointer<ByteVar>(), dwheaderslength, dwflags, dwcontext)?.let { COpaquePointer(it.toLong()) }

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetOpenW(lpszagent?.value?.toCPointer<ByteVar>(), dwaccesstype, lpszproxy?.value?.toCPointer<ByteVar>(), lpszproxybypass?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun internetQueryDataAvailable(hfile: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetQueryDataAvailable(hfile?.value?.toCPointer<ByteVar>(), lpdwnumberofbytesavailable?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun internetQueryFortezzaStatus(pdwstatus: COpaquePointer?, dwreserved: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetQueryFortezzaStatus(pdwstatus?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetQueryOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetQueryOptionA(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun internetQueryOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetQueryOptionW(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun internetReadFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetReadFile(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread?.value?.toCPointer<ByteVar>())

public actual fun internetReadFileExA(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetReadFileExA(hfile?.value?.toCPointer<ByteVar>(), lpbuffersout?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun internetReadFileExW(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetReadFileExW(hfile?.value?.toCPointer<ByteVar>(), lpbuffersout?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringA(dwprotocol, lpstr?.value?.toCPointer<ByteVar>(), lpdwstrlength?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringW(dwprotocol, lpstr?.value?.toCPointer<ByteVar>(), lpdwstrlength?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetCookieA(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>())

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: COpaquePointer?, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetCookieEx2(pcwszurl?.value?.toCPointer<ByteVar>(), pcookie?.value?.toCPointer<ByteVar>(), pcwszp3ppolicy?.value?.toCPointer<ByteVar>(), dwflags, pdwcookiestate?.value?.toCPointer<ByteVar>())

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetCookieExA(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetCookieExW(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetCookieW(lpszurl?.value?.toCPointer<ByteVar>(), lpszcookiename?.value?.toCPointer<ByteVar>(), lpszcookiedata?.value?.toCPointer<ByteVar>())

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetDialState(lpszconnectoid?.value?.toCPointer<ByteVar>(), dwstate, dwreserved)

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetDialStateA(lpszconnectoid?.value?.toCPointer<ByteVar>(), dwstate, dwreserved)

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetDialStateW(lpszconnectoid?.value?.toCPointer<ByteVar>(), dwstate, dwreserved)

public actual fun internetSetFilePointer(hfile: COpaquePointer?, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: UInt, dwcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetFilePointer(hfile?.value?.toCPointer<ByteVar>(), ldistancetomove, lpdistancetomovehigh?.value?.toCPointer<ByteVar>(), dwmovemethod, dwcontext)

public actual fun internetSetOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetOptionA(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength)

public actual fun internetSetOptionExA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetOptionExA(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, dwflags)

public actual fun internetSetOptionExW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetOptionExW(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, dwflags)

public actual fun internetSetOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetOptionW(hinternet?.value?.toCPointer<ByteVar>(), dwoption, lpbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength)

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionA(pchhostname?.value?.toCPointer<ByteVar>(), dwdecision)

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionW(pchhostname?.value?.toCPointer<ByteVar>(), dwdecision)

public actual fun internetSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetSetStatusCallbackA(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetSetStatusCallbackW(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    null

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURL(lpszurl?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>())

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLA(lpszurl?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>())

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLW(lpszurl?.value?.toCPointer<ByteVar>(), hwndparent?.value?.toCPointer<ByteVar>())

public actual fun internetTimeFromSystemTime(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTime(pst?.value?.toCPointer<ByteVar>(), dwrfc, lpsztime?.value?.toCPointer<ByteVar>(), cbtime)

public actual fun internetTimeFromSystemTimeA(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeA(pst?.value?.toCPointer<ByteVar>(), dwrfc, lpsztime?.value?.toCPointer<ByteVar>(), cbtime)

public actual fun internetTimeFromSystemTimeW(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeW(pst?.value?.toCPointer<ByteVar>(), dwrfc, lpsztime?.value?.toCPointer<ByteVar>(), cbtime)

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetTimeToSystemTime(lpsztime?.value?.toCPointer<ByteVar>(), pst?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeA(lpsztime?.value?.toCPointer<ByteVar>(), pst?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeW(lpsztime?.value?.toCPointer<ByteVar>(), pst?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetUnlockRequestFile(hlockrequestinfo?.value?.toCPointer<ByteVar>())

public actual fun internetWriteFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetWriteFile(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), dwnumberofbytestowrite, lpdwnumberofbyteswritten?.value?.toCPointer<ByteVar>())

public actual fun internetWriteFileExA(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetWriteFileExA(hfile?.value?.toCPointer<ByteVar>(), lpbuffersin?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun internetWriteFileExW(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_internetWriteFileExW(hfile?.value?.toCPointer<ByteVar>(), lpbuffersin?.value?.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainA(pchdomain?.value?.toCPointer<ByteVar>(), pchfulldomain?.value?.toCPointer<ByteVar>())

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainW(pchdomain?.value?.toCPointer<ByteVar>(), pchfulldomain?.value?.toCPointer<ByteVar>())

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_isHostInProxyBypassList(tscheme, lpszhost?.value?.toCPointer<ByteVar>(), cchhost)

public actual fun isProfilesEnabled(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_isProfilesEnabled()

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredA(lpszurlname?.value?.toCPointer<ByteVar>(), dwflags, pftlastmodified?.value?.toCPointer<ByteVar>())

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredW(lpszurlname?.value?.toCPointer<ByteVar>(), dwflags, pftlastmodified?.value?.toCPointer<ByteVar>())

public actual fun loadUrlCacheContent(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_loadUrlCacheContent()

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: COpaquePointer?, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_parseX509EncodedCertificateForListBoxEntry(lpcert?.value?.toCPointer<ByteVar>(), cbcert, lpszlistboxentry?.value?.toCPointer<ByteVar>(), lpdwlistboxentry?.value?.toCPointer<ByteVar>())

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: COpaquePointer?, pdwreserved2: COpaquePointer?, preserved3: COpaquePointer?, op: CacheOperator, poperatordata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_performOperationOverUrlCacheA(pszurlsearchpattern?.value?.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, preserved1?.value?.toCPointer<ByteVar>(), pdwreserved2?.value?.toCPointer<ByteVar>(), preserved3?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), poperatordata?.value?.toCPointer<ByteVar>())

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: COpaquePointer?, pszbuffer: Pwstr, pdwbufferlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_privacyGetZonePreferenceW(dwzone, dwtype, pdwtemplate?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), pdwbufferlength?.value?.toCPointer<ByteVar>())

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_privacySetZonePreferenceW(dwzone, dwtype, dwtemplate, pszpreference?.value?.toCPointer<ByteVar>())

public actual fun readGuidsForConnectedNetworks(pcnetworks: COpaquePointer?, pppwsznetworkguids: COpaquePointer?, pppbstrnetworknames: COpaquePointer?, pppwszgwmacs: COpaquePointer?, pcgatewaymacs: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_readGuidsForConnectedNetworks(pcnetworks?.value?.toCPointer<ByteVar>(), pppwsznetworkguids?.value?.toCPointer<ByteVar>(), pppbstrnetworknames?.value?.toCPointer<ByteVar>(), pppwszgwmacs?.value?.toCPointer<ByteVar>(), pcgatewaymacs?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?, reserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_readUrlCacheEntryStream(hurlcachestream?.value?.toCPointer<ByteVar>(), dwlocation, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwlen?.value?.toCPointer<ByteVar>(), reserved)

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_readUrlCacheEntryStreamEx(hurlcachestream?.value?.toCPointer<ByteVar>(), qwlocation, lpbuffer?.value?.toCPointer<ByteVar>(), lpdwlen?.value?.toCPointer<ByteVar>())

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_registerUrlCacheNotification(hwnd?.value?.toCPointer<ByteVar>(), umsg, gid, dwopsfilter, dwreserved)

public actual fun resumeSuspendedDownload(hrequest: COpaquePointer?, dwresultcode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_resumeSuspendedDownload(hrequest?.value?.toCPointer<ByteVar>(), dwresultcode)

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileA(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileW(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamA(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), frandomread, dwreserved)?.let { COpaquePointer(it.toLong()) }

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamW(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), lpcbcacheentryinfo?.value?.toCPointer<ByteVar>(), frandomread, dwreserved)?.let { COpaquePointer(it.toLong()) }

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_runOnceUrlCache(hwnd?.value?.toCPointer<ByteVar>(), hinst?.value?.toCPointer<ByteVar>(), lpszcmd?.value?.toCPointer<ByteVar>(), ncmdshow)

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoA(lpcacheconfiginfo?.value?.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoW(lpcacheconfiginfo?.value?.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroup(lpszurlname?.value?.toCPointer<ByteVar>(), dwflags, groupid, pbgroupattributes?.value?.toCPointer<ByteVar>(), cbgroupattributes, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupA(lpszurlname?.value?.toCPointer<ByteVar>(), dwflags, groupid, pbgroupattributes?.value?.toCPointer<ByteVar>(), cbgroupattributes, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupW(lpszurlname?.value?.toCPointer<ByteVar>(), dwflags, groupid, pbgroupattributes?.value?.toCPointer<ByteVar>(), cbgroupattributes, lpreserved?.value?.toCPointer<ByteVar>())

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoA(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoW(lpszurlname?.value?.toCPointer<ByteVar>(), lpcacheentryinfo?.value?.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeA(gid, dwflags, dwattributes, lpgroupinfo?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeW(gid, dwflags, dwattributes, lpgroupinfo?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_setUrlCacheHeaderData(nidx, dwdata)

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_showClientAuthCerts(hwndparent?.value?.toCPointer<ByteVar>())

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_showSecurityInfo(hwndparent?.value?.toCPointer<ByteVar>(), psecurityinfo?.value?.toCPointer<ByteVar>())

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: COpaquePointer?, cbcert: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_showX509EncodedCertificate(hwndparent?.value?.toCPointer<ByteVar>(), lpcert?.value?.toCPointer<ByteVar>(), cbcert)

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFile(lpszurlname?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileA(lpszurlname?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileW(lpszurlname?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryStream(hurlcachestream?.value?.toCPointer<ByteVar>(), reserved)

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_updateUrlCacheContentPath(sznewpath?.value?.toCPointer<ByteVar>())

public actual fun urlCacheCheckEntriesExist(rgpwszurls: COpaquePointer?, centries: UInt, rgfexist: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheCheckEntriesExist(rgpwszurls?.value?.toCPointer<ByteVar>(), centries, rgfexist?.value?.toCPointer<ByteVar>())

public actual fun urlCacheCloseEntryHandle(hentryfile: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheCloseEntryHandle(hentryfile?.value?.toCPointer<ByteVar>())
}

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheContainerSetEntryMaximumAge(pwszprefix?.value?.toCPointer<ByteVar>(), dwentrymaxage)

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheCreateContainer(pwszname?.value?.toCPointer<ByteVar>(), pwszprefix?.value?.toCPointer<ByteVar>(), pwszdirectory?.value?.toCPointer<ByteVar>(), ulllimit, dwoptions)

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: COpaquePointer?, phfind: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheFindFirstEntry(pwszprefix?.value?.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, pcacheentryinfo?.value?.toCPointer<ByteVar>(), phfind?.value?.toCPointer<ByteVar>())

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheFindNextEntry(hfind?.value?.toCPointer<ByteVar>(), pcacheentryinfo?.value?.toCPointer<ByteVar>())

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheFreeEntryInfo(pcacheentryinfo?.value?.toCPointer<ByteVar>())
}

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheFreeGlobalSpace(ulltargetsize, dwfilter)

public actual fun urlCacheGetContentPaths(pppwszdirectories: COpaquePointer?, pcdirectories: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheGetContentPaths(pppwszdirectories?.value?.toCPointer<ByteVar>(), pcdirectories?.value?.toCPointer<ByteVar>())

public actual fun urlCacheGetEntryInfo(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheGetEntryInfo(happcache?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), pcacheentryinfo?.value?.toCPointer<ByteVar>())

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: COpaquePointer?, pulllimit: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheGetGlobalCacheSize(dwfilter, pullsize?.value?.toCPointer<ByteVar>(), pulllimit?.value?.toCPointer<ByteVar>())

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheGetGlobalLimit(limittype, pulllimit?.value?.toCPointer<ByteVar>())

public actual fun urlCacheReadEntryStream(hurlcachestream: COpaquePointer?, ulllocation: ULong, pbuffer: COpaquePointer?, dwbufferlen: UInt, pdwbufferlen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheReadEntryStream(hurlcachestream?.value?.toCPointer<ByteVar>(), ulllocation, pbuffer?.value?.toCPointer<ByteVar>(), dwbufferlen, pdwbufferlen?.value?.toCPointer<ByteVar>())

public actual fun urlCacheReloadSettings(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheReloadSettings()

public actual fun urlCacheRetrieveEntryFile(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?, phentryfile: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryFile(happcache?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), pcacheentryinfo?.value?.toCPointer<ByteVar>(), phentryfile?.value?.toCPointer<ByteVar>())

public actual fun urlCacheRetrieveEntryStream(happcache: COpaquePointer?, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: COpaquePointer?, phentrystream: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryStream(happcache?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), frandomread, pcacheentryinfo?.value?.toCPointer<ByteVar>(), phentrystream?.value?.toCPointer<ByteVar>())

public actual fun urlCacheServer(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheServer()

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheSetGlobalLimit(limittype, ulllimit)

public actual fun urlCacheUpdateEntryExtraData(happcache: COpaquePointer?, pcwszurl: Pcwstr, pbextradata: COpaquePointer?, cbextradata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_urlCacheUpdateEntryExtraData(happcache?.value?.toCPointer<ByteVar>(), pcwszurl?.value?.toCPointer<ByteVar>(), pbextradata?.value?.toCPointer<ByteVar>(), cbextradata)

@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AppCacheCheckManifest(pwszmasterurl: PCWSTR, pwszmanifesturl: PCWSTR, pbmanifestdata: Long, dwmanifestdatasize: UInt, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: UInt, pestate: Long, phnewappcache: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheCheckManifest(pwszmasterurl.toCPointer<ByteVar>(), pwszmanifesturl.toCPointer<ByteVar>(), pbmanifestdata.toCPointer<ByteVar>(), dwmanifestdatasize, pbmanifestresponseheaders.toCPointer<ByteVar>(), dwmanifestresponseheaderssize, pestate.toCPointer<ByteVar>(), phnewappcache.toCPointer<ByteVar>())

public actual fun AppCacheCloseHandle(happcache: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheCloseHandle(happcache.toCPointer<ByteVar>())
}

public actual fun AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: PCWSTR, pwszurl: PCWSTR, pbresponseheaders: Long, dwresponseheaderssize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheCreateAndCommitFile(happcache.toCPointer<ByteVar>(), pwszsourcefilepath.toCPointer<ByteVar>(), pwszurl.toCPointer<ByteVar>(), pbresponseheaders.toCPointer<ByteVar>(), dwresponseheaderssize)

public actual fun AppCacheDeleteGroup(pwszmanifesturl: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheDeleteGroup(pwszmanifesturl.toCPointer<ByteVar>())

public actual fun AppCacheDeleteIEGroup(pwszmanifesturl: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheDeleteIEGroup(pwszmanifesturl.toCPointer<ByteVar>())

public actual fun AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheDuplicateHandle(happcache.toCPointer<ByteVar>(), phduplicatedappcache.toCPointer<ByteVar>())

public actual fun AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: UInt, pestate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheFinalize(happcache.toCPointer<ByteVar>(), pbmanifestdata.toCPointer<ByteVar>(), dwmanifestdatasize, pestate.toCPointer<ByteVar>())

public actual fun AppCacheFreeDownloadList(pdownloadlist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheFreeDownloadList(pdownloadlist.toCPointer<ByteVar>())
}

public actual fun AppCacheFreeGroupList(pappcachegrouplist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheFreeGroupList(pappcachegrouplist.toCPointer<ByteVar>())
}

public actual fun AppCacheFreeIESpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheFreeSpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheGetDownloadList(happcache.toCPointer<ByteVar>(), pdownloadlist.toCPointer<ByteVar>())

public actual fun AppCacheGetFallbackUrl(happcache: Long, pwszurl: PCWSTR, ppwszfallbackurl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheGetFallbackUrl(happcache.toCPointer<ByteVar>(), pwszurl.toCPointer<ByteVar>(), ppwszfallbackurl.toCPointer<ByteVar>())

public actual fun AppCacheGetGroupList(pappcachegrouplist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheGetGroupList(pappcachegrouplist.toCPointer<ByteVar>())

public actual fun AppCacheGetIEGroupList(pappcachegrouplist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheGetIEGroupList(pappcachegrouplist.toCPointer<ByteVar>())

public actual fun AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheGetInfo(happcache.toCPointer<ByteVar>(), pappcacheinfo.toCPointer<ByteVar>())

public actual fun AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheGetManifestUrl(happcache.toCPointer<ByteVar>(), ppwszmanifesturl.toCPointer<ByteVar>())

public actual fun AppCacheLookup(pwszurl: PCWSTR, dwflags: UInt, phappcache: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_AppCacheLookup(pwszurl.toCPointer<ByteVar>(), dwflags, phappcache.toCPointer<ByteVar>())

public actual fun CommitUrlCacheEntryA(lpszurlname: PCSTR, lpszlocalfilename: PCSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpheaderinfo: Long, cchheaderinfo: UInt, lpszfileextension: PCSTR, lpszoriginalurl: PCSTR): BOOL =
    0

public actual fun CommitUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: UInt, ftexpiretime: FILETIME, ftmodifiedtime: FILETIME, pbblob: Long, cbblob: UInt): UInt =
    0u

public actual fun CommitUrlCacheEntryW(lpszurlname: PCWSTR, lpszlocalfilename: PCWSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpszheaderinfo: PCWSTR, cchheaderinfo: UInt, lpszfileextension: PCWSTR, lpszoriginalurl: PCWSTR): BOOL =
    0

public actual fun CreateMD5SSOHash(pszchallengeinfo: PCWSTR, pwszrealm: PCWSTR, pwsztarget: PCWSTR, pbhexhash: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateMD5SSOHash(pszchallengeinfo.toCPointer<ByteVar>(), pwszrealm.toCPointer<ByteVar>(), pwsztarget.toCPointer<ByteVar>(), pbhexhash.toCPointer<ByteVar>())

public actual fun CreateUrlCacheContainerA(name: PCSTR, lpcacheprefix: PCSTR, lpszcachepath: PCSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerA(name.toCPointer<ByteVar>(), lpcacheprefix.toCPointer<ByteVar>(), lpszcachepath.toCPointer<ByteVar>(), kbcachelimit, dwcontainertype, dwoptions, pvbuffer.toCPointer<ByteVar>(), cbbuffer.toCPointer<ByteVar>())

public actual fun CreateUrlCacheContainerW(name: PCWSTR, lpcacheprefix: PCWSTR, lpszcachepath: PCWSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateUrlCacheContainerW(name.toCPointer<ByteVar>(), lpcacheprefix.toCPointer<ByteVar>(), lpszcachepath.toCPointer<ByteVar>(), kbcachelimit, dwcontainertype, dwoptions, pvbuffer.toCPointer<ByteVar>(), cbbuffer.toCPointer<ByteVar>())

public actual fun CreateUrlCacheEntryA(lpszurlname: PCSTR, dwexpectedfilesize: UInt, lpszfileextension: PCSTR, lpszfilename: PSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryA(lpszurlname.toCPointer<ByteVar>(), dwexpectedfilesize, lpszfileextension.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), dwreserved)

public actual fun CreateUrlCacheEntryExW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt, fpreserveincomingfilename: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryExW(lpszurlname.toCPointer<ByteVar>(), dwexpectedfilesize, lpszfileextension.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), dwreserved, fpreserveincomingfilename)

public actual fun CreateUrlCacheEntryW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateUrlCacheEntryW(lpszurlname.toCPointer<ByteVar>(), dwexpectedfilesize, lpszfileextension.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), dwreserved)

public actual fun CreateUrlCacheGroup(dwflags: UInt, lpreserved: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_CreateUrlCacheGroup(dwflags, lpreserved.toCPointer<ByteVar>())

public actual fun DeleteIE3Cache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteIE3Cache(hwnd.toCPointer<ByteVar>(), hinst.toCPointer<ByteVar>(), lpszcmd.toCPointer<ByteVar>(), ncmdshow)

public actual fun DeleteUrlCacheContainerA(name: PCSTR, dwoptions: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerA(name.toCPointer<ByteVar>(), dwoptions)

public actual fun DeleteUrlCacheContainerW(name: PCWSTR, dwoptions: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteUrlCacheContainerW(name.toCPointer<ByteVar>(), dwoptions)

public actual fun DeleteUrlCacheEntry(lpszurlname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntry(lpszurlname.toCPointer<ByteVar>())

public actual fun DeleteUrlCacheEntryA(lpszurlname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryA(lpszurlname.toCPointer<ByteVar>())

public actual fun DeleteUrlCacheEntryW(lpszurlname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteUrlCacheEntryW(lpszurlname.toCPointer<ByteVar>())

public actual fun DeleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteUrlCacheGroup(groupid, dwflags, lpreserved.toCPointer<ByteVar>())

public actual fun DeleteWpadCacheForNetworks(param0: WPAD_CACHE_DELETE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DeleteWpadCacheForNetworks(param0)

public actual fun DetectAutoProxyUrl(pszautoproxyurl: PSTR, cchautoproxyurl: UInt, dwdetectflags: PROXY_AUTO_DETECT_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DetectAutoProxyUrl(pszautoproxyurl.toCPointer<ByteVar>(), cchautoproxyurl, dwdetectflags)

public actual fun DoConnectoidsExist(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_DoConnectoidsExist()

public actual fun ExportCookieFileA(szfilename: PCSTR, fappend: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ExportCookieFileA(szfilename.toCPointer<ByteVar>(), fappend)

public actual fun ExportCookieFileW(szfilename: PCWSTR, fappend: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ExportCookieFileW(szfilename.toCPointer<ByteVar>(), fappend)

public actual fun FindCloseUrlCache(henumhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindCloseUrlCache(henumhandle.toCPointer<ByteVar>())

public actual fun FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerA(pdwmodified.toCPointer<ByteVar>(), lpcontainerinfo.toCPointer<ByteVar>(), lpcbcontainerinfo.toCPointer<ByteVar>(), dwoptions)?.toLong() ?: 0L

public actual fun FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheContainerW(pdwmodified.toCPointer<ByteVar>(), lpcontainerinfo.toCPointer<ByteVar>(), lpcbcontainerinfo.toCPointer<ByteVar>(), dwoptions)?.toLong() ?: 0L

public actual fun FindFirstUrlCacheEntryA(lpszurlsearchpattern: PCSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryA(lpszurlsearchpattern.toCPointer<ByteVar>(), lpfirstcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstUrlCacheEntryExA(lpszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExA(lpszurlsearchpattern.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, lpfirstcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), lpgroupattributes.toCPointer<ByteVar>(), lpcbgroupattributes.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstUrlCacheEntryExW(lpszurlsearchpattern: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryExW(lpszurlsearchpattern.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, lpfirstcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), lpgroupattributes.toCPointer<ByteVar>(), lpcbgroupattributes.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstUrlCacheEntryW(lpszurlsearchpattern: PCWSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheEntryW(lpszurlsearchpattern.toCPointer<ByteVar>(), lpfirstcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: Long, dwsearchcondition: UInt, lpgroupid: Long, lpreserved: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindFirstUrlCacheGroup(dwflags, dwfilter, lpsearchcondition.toCPointer<ByteVar>(), dwsearchcondition, lpgroupid.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindNextUrlCacheContainerA(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerA(henumhandle.toCPointer<ByteVar>(), lpcontainerinfo.toCPointer<ByteVar>(), lpcbcontainerinfo.toCPointer<ByteVar>())

public actual fun FindNextUrlCacheContainerW(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheContainerW(henumhandle.toCPointer<ByteVar>(), lpcontainerinfo.toCPointer<ByteVar>(), lpcbcontainerinfo.toCPointer<ByteVar>())

public actual fun FindNextUrlCacheEntryA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryA(henumhandle.toCPointer<ByteVar>(), lpnextcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>())

public actual fun FindNextUrlCacheEntryExA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExA(henumhandle.toCPointer<ByteVar>(), lpnextcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), lpgroupattributes.toCPointer<ByteVar>(), lpcbgroupattributes.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun FindNextUrlCacheEntryExW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryExW(henumhandle.toCPointer<ByteVar>(), lpnextcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), lpgroupattributes.toCPointer<ByteVar>(), lpcbgroupattributes.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun FindNextUrlCacheEntryW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheEntryW(henumhandle.toCPointer<ByteVar>(), lpnextcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>())

public actual fun FindNextUrlCacheGroup(hfind: HANDLE, lpgroupid: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindNextUrlCacheGroup(hfind.toCPointer<ByteVar>(), lpgroupid.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun FindP3PPolicySymbol(pszsymbol: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FindP3PPolicySymbol(pszsymbol.toCPointer<ByteVar>())

public actual fun FreeUrlCacheSpaceA(lpszcachepath: PCSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceA(lpszcachepath.toCPointer<ByteVar>(), dwsize, dwfilter)

public actual fun FreeUrlCacheSpaceW(lpszcachepath: PCWSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FreeUrlCacheSpaceW(lpszcachepath.toCPointer<ByteVar>(), dwsize, dwfilter)

public actual fun FtpCommandA(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpCommandA(hconnect.toCPointer<ByteVar>(), fexpectresponse, dwflags, lpszcommand.toCPointer<ByteVar>(), dwcontext, phftpcommand.toCPointer<ByteVar>())

public actual fun FtpCommandW(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCWSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpCommandW(hconnect.toCPointer<ByteVar>(), fexpectresponse, dwflags, lpszcommand.toCPointer<ByteVar>(), dwcontext, phftpcommand.toCPointer<ByteVar>())

public actual fun FtpCreateDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpCreateDirectoryA(hconnect.toCPointer<ByteVar>(), lpszdirectory.toCPointer<ByteVar>())

public actual fun FtpCreateDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpCreateDirectoryW(hconnect.toCPointer<ByteVar>(), lpszdirectory.toCPointer<ByteVar>())

public actual fun FtpDeleteFileA(hconnect: Long, lpszfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpDeleteFileA(hconnect.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>())

public actual fun FtpDeleteFileW(hconnect: Long, lpszfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpDeleteFileW(hconnect.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>())

public actual fun FtpFindFirstFileA(hconnect: Long, lpszsearchfile: PCSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpFindFirstFileA(hconnect.toCPointer<ByteVar>(), lpszsearchfile.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun FtpFindFirstFileW(hconnect: Long, lpszsearchfile: PCWSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpFindFirstFileW(hconnect.toCPointer<ByteVar>(), lpszsearchfile.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: PSTR, lpdwcurrentdirectory: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryA(hconnect.toCPointer<ByteVar>(), lpszcurrentdirectory.toCPointer<ByteVar>(), lpdwcurrentdirectory.toCPointer<ByteVar>())

public actual fun FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: PWSTR, lpdwcurrentdirectory: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpGetCurrentDirectoryW(hconnect.toCPointer<ByteVar>(), lpszcurrentdirectory.toCPointer<ByteVar>(), lpdwcurrentdirectory.toCPointer<ByteVar>())

public actual fun FtpGetFileA(hconnect: Long, lpszremotefile: PCSTR, lpsznewfile: PCSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpGetFileA(hconnect.toCPointer<ByteVar>(), lpszremotefile.toCPointer<ByteVar>(), lpsznewfile.toCPointer<ByteVar>(), ffailifexists, dwflagsandattributes, dwflags, dwcontext)

public actual fun FtpGetFileEx(hftpsession: Long, lpszremotefile: PCSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpGetFileEx(hftpsession.toCPointer<ByteVar>(), lpszremotefile.toCPointer<ByteVar>(), lpsznewfile.toCPointer<ByteVar>(), ffailifexists, dwflagsandattributes, dwflags, dwcontext)

public actual fun FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpGetFileSize(hfile.toCPointer<ByteVar>(), lpdwfilesizehigh.toCPointer<ByteVar>())

public actual fun FtpGetFileW(hconnect: Long, lpszremotefile: PCWSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpGetFileW(hconnect.toCPointer<ByteVar>(), lpszremotefile.toCPointer<ByteVar>(), lpsznewfile.toCPointer<ByteVar>(), ffailifexists, dwflagsandattributes, dwflags, dwcontext)

public actual fun FtpOpenFileA(hconnect: Long, lpszfilename: PCSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpOpenFileA(hconnect.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), dwaccess, dwflags, dwcontext)?.toLong() ?: 0L

public actual fun FtpOpenFileW(hconnect: Long, lpszfilename: PCWSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpOpenFileW(hconnect.toCPointer<ByteVar>(), lpszfilename.toCPointer<ByteVar>(), dwaccess, dwflags, dwcontext)?.toLong() ?: 0L

public actual fun FtpPutFileA(hconnect: Long, lpszlocalfile: PCSTR, lpsznewremotefile: PCSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpPutFileA(hconnect.toCPointer<ByteVar>(), lpszlocalfile.toCPointer<ByteVar>(), lpsznewremotefile.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun FtpPutFileEx(hftpsession: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCSTR, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpPutFileEx(hftpsession.toCPointer<ByteVar>(), lpszlocalfile.toCPointer<ByteVar>(), lpsznewremotefile.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun FtpPutFileW(hconnect: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCWSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpPutFileW(hconnect.toCPointer<ByteVar>(), lpszlocalfile.toCPointer<ByteVar>(), lpsznewremotefile.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryA(hconnect.toCPointer<ByteVar>(), lpszdirectory.toCPointer<ByteVar>())

public actual fun FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpRemoveDirectoryW(hconnect.toCPointer<ByteVar>(), lpszdirectory.toCPointer<ByteVar>())

public actual fun FtpRenameFileA(hconnect: Long, lpszexisting: PCSTR, lpsznew: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpRenameFileA(hconnect.toCPointer<ByteVar>(), lpszexisting.toCPointer<ByteVar>(), lpsznew.toCPointer<ByteVar>())

public actual fun FtpRenameFileW(hconnect: Long, lpszexisting: PCWSTR, lpsznew: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpRenameFileW(hconnect.toCPointer<ByteVar>(), lpszexisting.toCPointer<ByteVar>(), lpsznew.toCPointer<ByteVar>())

public actual fun FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryA(hconnect.toCPointer<ByteVar>(), lpszdirectory.toCPointer<ByteVar>())

public actual fun FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_FtpSetCurrentDirectoryW(hconnect.toCPointer<ByteVar>(), lpszdirectory.toCPointer<ByteVar>())

public actual fun GetDiskInfoA(pszpath: PCSTR, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetDiskInfoA(pszpath.toCPointer<ByteVar>(), pdwclustersize.toCPointer<ByteVar>(), pdlavail.toCPointer<ByteVar>(), pdltotal.toCPointer<ByteVar>())

public actual fun GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoA(lpcacheconfiginfo.toCPointer<ByteVar>(), lpcbcacheconfiginfo.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheConfigInfoW(lpcacheconfiginfo.toCPointer<ByteVar>(), lpcbcacheconfiginfo.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun GetUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryBinaryBlob(pwszurlname.toCPointer<ByteVar>(), dwtype.toCPointer<ByteVar>(), pftexpiretime.toCPointer<ByteVar>(), pftaccesstime.toCPointer<ByteVar>(), pftmodifiedtime.toCPointer<ByteVar>(), ppbblob.toCPointer<ByteVar>(), pcbblob.toCPointer<ByteVar>())

public actual fun GetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoA(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>())

public actual fun GetUrlCacheEntryInfoExA(lpszurl: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExA(lpszurl.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), lpszredirecturl.toCPointer<ByteVar>(), lpcbredirecturl.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), dwflags)

public actual fun GetUrlCacheEntryInfoExW(lpszurl: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCWSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoExW(lpszurl.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), lpszredirecturl.toCPointer<ByteVar>(), lpcbredirecturl.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), dwflags)

public actual fun GetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheEntryInfoW(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>())

public actual fun GetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeA(gid, dwflags, dwattributes, lpgroupinfo.toCPointer<ByteVar>(), lpcbgroupinfo.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun GetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheGroupAttributeW(gid, dwflags, dwattributes, lpgroupinfo.toCPointer<ByteVar>(), lpcbgroupinfo.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun GetUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GetUrlCacheHeaderData(nidx, lpdwdata.toCPointer<ByteVar>())

public actual fun GopherCreateLocatorA(lpszhost: PCSTR, nserverport: UShort, lpszdisplaystring: PCSTR, lpszselectorstring: PCSTR, dwgophertype: UInt, lpszlocator: PSTR, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherCreateLocatorA(lpszhost.toCPointer<ByteVar>(), nserverport, lpszdisplaystring.toCPointer<ByteVar>(), lpszselectorstring.toCPointer<ByteVar>(), dwgophertype, lpszlocator.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun GopherCreateLocatorW(lpszhost: PCWSTR, nserverport: UShort, lpszdisplaystring: PCWSTR, lpszselectorstring: PCWSTR, dwgophertype: UInt, lpszlocator: PWSTR, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherCreateLocatorW(lpszhost.toCPointer<ByteVar>(), nserverport, lpszdisplaystring.toCPointer<ByteVar>(), lpszselectorstring.toCPointer<ByteVar>(), dwgophertype, lpszlocator.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun GopherFindFirstFileA(hconnect: Long, lpszlocator: PCSTR, lpszsearchstring: PCSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherFindFirstFileA(hconnect.toCPointer<ByteVar>(), lpszlocator.toCPointer<ByteVar>(), lpszsearchstring.toCPointer<ByteVar>(), lpfinddata.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun GopherFindFirstFileW(hconnect: Long, lpszlocator: PCWSTR, lpszsearchstring: PCWSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherFindFirstFileW(hconnect.toCPointer<ByteVar>(), lpszlocator.toCPointer<ByteVar>(), lpszsearchstring.toCPointer<ByteVar>(), lpfinddata.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun GopherGetAttributeA(hconnect: Long, lpszlocator: PCSTR, lpszattributename: PCSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherGetAttributeA(hconnect.toCPointer<ByteVar>(), lpszlocator.toCPointer<ByteVar>(), lpszattributename.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwbufferlength, lpdwcharactersreturned.toCPointer<ByteVar>(), lpfnenumerator.toLong().toCPointer<ByteVar>(), dwcontext)

public actual fun GopherGetAttributeW(hconnect: Long, lpszlocator: PCWSTR, lpszattributename: PCWSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherGetAttributeW(hconnect.toCPointer<ByteVar>(), lpszlocator.toCPointer<ByteVar>(), lpszattributename.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwbufferlength, lpdwcharactersreturned.toCPointer<ByteVar>(), lpfnenumerator.toLong().toCPointer<ByteVar>(), dwcontext)

public actual fun GopherGetLocatorTypeA(lpszlocator: PCSTR, lpdwgophertype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeA(lpszlocator.toCPointer<ByteVar>(), lpdwgophertype.toCPointer<ByteVar>())

public actual fun GopherGetLocatorTypeW(lpszlocator: PCWSTR, lpdwgophertype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherGetLocatorTypeW(lpszlocator.toCPointer<ByteVar>(), lpdwgophertype.toCPointer<ByteVar>())

public actual fun GopherOpenFileA(hconnect: Long, lpszlocator: PCSTR, lpszview: PCSTR, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherOpenFileA(hconnect.toCPointer<ByteVar>(), lpszlocator.toCPointer<ByteVar>(), lpszview.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun GopherOpenFileW(hconnect: Long, lpszlocator: PCWSTR, lpszview: PCWSTR, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_GopherOpenFileW(hconnect.toCPointer<ByteVar>(), lpszlocator.toCPointer<ByteVar>(), lpszview.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun HttpAddRequestHeadersA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersA(hrequest.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun HttpAddRequestHeadersW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpAddRequestHeadersW(hrequest.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, dwmodifiers)

public actual fun HttpCheckDavComplianceA(lpszurl: PCSTR, lpszcompliancetoken: PCSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceA(lpszurl.toCPointer<ByteVar>(), lpszcompliancetoken.toCPointer<ByteVar>(), lpffound.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>())

public actual fun HttpCheckDavComplianceW(lpszurl: PCWSTR, lpszcompliancetoken: PCWSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpCheckDavComplianceW(lpszurl.toCPointer<ByteVar>(), lpszcompliancetoken.toCPointer<ByteVar>(), lpffound.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>())

public actual fun HttpCloseDependencyHandle(hdependencyhandle: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpCloseDependencyHandle(hdependencyhandle.toCPointer<ByteVar>())
}

public actual fun HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpDuplicateDependencyHandle(hdependencyhandle.toCPointer<ByteVar>(), phduplicateddependencyhandle.toCPointer<ByteVar>())

public actual fun HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpEndRequestA(hrequest.toCPointer<ByteVar>(), lpbuffersout.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpEndRequestW(hrequest.toCPointer<ByteVar>(), lpbuffersout.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun HttpGetServerCredentials(pwszurl: PCWSTR, ppwszusername: Long, ppwszpassword: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpGetServerCredentials(pwszurl.toCPointer<ByteVar>(), ppwszusername.toCPointer<ByteVar>(), ppwszpassword.toCPointer<ByteVar>())

public actual fun HttpIndicatePageLoadComplete(hdependencyhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpIndicatePageLoadComplete(hdependencyhandle.toCPointer<ByteVar>())

public actual fun HttpIsHostHstsEnabled(pcwszurl: PCWSTR, pfishsts: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpIsHostHstsEnabled(pcwszurl.toCPointer<ByteVar>(), pfishsts.toCPointer<ByteVar>())

public actual fun HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: BOOL, phdependencyhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpOpenDependencyHandle(hrequesthandle.toCPointer<ByteVar>(), fbackground, phdependencyhandle.toCPointer<ByteVar>())

public actual fun HttpOpenRequestA(hconnect: Long, lpszverb: PCSTR, lpszobjectname: PCSTR, lpszversion: PCSTR, lpszreferrer: PCSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpOpenRequestA(hconnect.toCPointer<ByteVar>(), lpszverb.toCPointer<ByteVar>(), lpszobjectname.toCPointer<ByteVar>(), lpszversion.toCPointer<ByteVar>(), lpszreferrer.toCPointer<ByteVar>(), lplpszaccepttypes.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun HttpOpenRequestW(hconnect: Long, lpszverb: PCWSTR, lpszobjectname: PCWSTR, lpszversion: PCWSTR, lpszreferrer: PCWSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpOpenRequestW(hconnect.toCPointer<ByteVar>(), lpszverb.toCPointer<ByteVar>(), lpszobjectname.toCPointer<ByteVar>(), lpszversion.toCPointer<ByteVar>(), lpszreferrer.toCPointer<ByteVar>(), lplpszaccepttypes.toCPointer<ByteVar>(), dwflags, dwcontext)?.toLong() ?: 0L

public actual fun HttpPushClose(hwait: HTTP_PUSH_WAIT_HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpPushClose(hwait.toCPointer<ByteVar>())
}

public actual fun HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpPushEnable(hrequest.toCPointer<ByteVar>(), ptransportsetting.toCPointer<ByteVar>(), phwait.toCPointer<ByteVar>())

public actual fun HttpPushWait(hwait: HTTP_PUSH_WAIT_HANDLE, etype: HTTP_PUSH_WAIT_TYPE, pnotificationstatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpPushWait(hwait.toCPointer<ByteVar>(), etype, pnotificationstatus.toCPointer<ByteVar>())

public actual fun HttpQueryInfoA(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpQueryInfoA(hrequest.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lpdwindex.toCPointer<ByteVar>())

public actual fun HttpQueryInfoW(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpQueryInfoW(hrequest.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), lpdwindex.toCPointer<ByteVar>())

public actual fun HttpSendRequestA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpSendRequestA(hrequest.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, lpoptional.toCPointer<ByteVar>(), dwoptionallength)

public actual fun HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpSendRequestExA(hrequest.toCPointer<ByteVar>(), lpbuffersin.toCPointer<ByteVar>(), lpbuffersout.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpSendRequestExW(hrequest.toCPointer<ByteVar>(), lpbuffersin.toCPointer<ByteVar>(), lpbuffersout.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun HttpSendRequestW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpSendRequestW(hrequest.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, lpoptional.toCPointer<ByteVar>(), dwoptionallength)

public actual fun HttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpWebSocketClose(hwebsocket.toCPointer<ByteVar>(), usstatus, pvreason.toCPointer<ByteVar>(), dwreasonlength)

public actual fun HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpWebSocketCompleteUpgrade(hrequest.toCPointer<ByteVar>(), dwcontext)?.toLong() ?: 0L

public actual fun HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpWebSocketQueryCloseStatus(hwebsocket.toCPointer<ByteVar>(), pusstatus.toCPointer<ByteVar>(), pvreason.toCPointer<ByteVar>(), dwreasonlength, pdwreasonlengthconsumed.toCPointer<ByteVar>())

public actual fun HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pbuffertype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpWebSocketReceive(hwebsocket.toCPointer<ByteVar>(), pvbuffer.toCPointer<ByteVar>(), dwbufferlength, pdwbytesread.toCPointer<ByteVar>(), pbuffertype.toCPointer<ByteVar>())

public actual fun HttpWebSocketSend(hwebsocket: Long, buffertype: HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpWebSocketSend(hwebsocket.toCPointer<ByteVar>(), buffertype, pvbuffer.toCPointer<ByteVar>(), dwbufferlength)

public actual fun HttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_HttpWebSocketShutdown(hwebsocket.toCPointer<ByteVar>(), usstatus, pvreason.toCPointer<ByteVar>(), dwreasonlength)

public actual fun ImportCookieFileA(szfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ImportCookieFileA(szfilename.toCPointer<ByteVar>())

public actual fun ImportCookieFileW(szfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ImportCookieFileW(szfilename.toCPointer<ByteVar>())

public actual fun IncrementUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IncrementUrlCacheHeaderData(nidx, lpdwdata.toCPointer<ByteVar>())

public actual fun InternalInternetGetCookie(lpszurl: PCSTR, lpszcookiedata: PSTR, lpdwdatasize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternalInternetGetCookie(lpszurl.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), lpdwdatasize.toCPointer<ByteVar>())

public actual fun InternetAlgIdToStringA(ai: ALG_ID, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetAlgIdToStringA(ai, lpstr.toCPointer<ByteVar>(), lpdwstrlength.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetAlgIdToStringW(ai: ALG_ID, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetAlgIdToStringW(ai, lpstr.toCPointer<ByteVar>(), lpdwstrlength.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetAttemptConnect(dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetAttemptConnect(dwreserved)

public actual fun InternetAutodial(dwflags: INTERNET_AUTODIAL, hwndparent: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetAutodial(dwflags, hwndparent.toCPointer<ByteVar>())

public actual fun InternetAutodialHangup(dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetAutodialHangup(dwreserved)

public actual fun InternetCanonicalizeUrlA(lpszurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlA(lpszurl.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), dwflags)

public actual fun InternetCanonicalizeUrlW(lpszurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCanonicalizeUrlW(lpszurl.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), dwflags)

public actual fun InternetCheckConnectionA(lpszurl: PCSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCheckConnectionA(lpszurl.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun InternetCheckConnectionW(lpszurl: PCWSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCheckConnectionW(lpszurl.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun InternetClearAllPerSiteCookieDecisions(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetClearAllPerSiteCookieDecisions()

public actual fun InternetCloseHandle(hinternet: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCloseHandle(hinternet.toCPointer<ByteVar>())

public actual fun InternetCombineUrlA(lpszbaseurl: PCSTR, lpszrelativeurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCombineUrlA(lpszbaseurl.toCPointer<ByteVar>(), lpszrelativeurl.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), dwflags)

public actual fun InternetCombineUrlW(lpszbaseurl: PCWSTR, lpszrelativeurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCombineUrlW(lpszbaseurl.toCPointer<ByteVar>(), lpszrelativeurl.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>(), dwflags)

public actual fun InternetConfirmZoneCrossing(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossing(hwnd.toCPointer<ByteVar>(), szurlprev.toCPointer<ByteVar>(), szurlnew.toCPointer<ByteVar>(), bpost)

public actual fun InternetConfirmZoneCrossingA(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingA(hwnd.toCPointer<ByteVar>(), szurlprev.toCPointer<ByteVar>(), szurlnew.toCPointer<ByteVar>(), bpost)

public actual fun InternetConfirmZoneCrossingW(hwnd: HWND, szurlprev: PCWSTR, szurlnew: PCWSTR, bpost: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetConfirmZoneCrossingW(hwnd.toCPointer<ByteVar>(), szurlprev.toCPointer<ByteVar>(), szurlnew.toCPointer<ByteVar>(), bpost)

public actual fun InternetConnectA(hinternet: Long, lpszservername: PCSTR, nserverport: UShort, lpszusername: PCSTR, lpszpassword: PCSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetConnectA(hinternet.toCPointer<ByteVar>(), lpszservername.toCPointer<ByteVar>(), nserverport, lpszusername.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwservice, dwflags, dwcontext)?.toLong() ?: 0L

public actual fun InternetConnectW(hinternet: Long, lpszservername: PCWSTR, nserverport: UShort, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetConnectW(hinternet.toCPointer<ByteVar>(), lpszservername.toCPointer<ByteVar>(), nserverport, lpszusername.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwservice, dwflags, dwcontext)?.toLong() ?: 0L

public actual fun InternetConvertUrlFromWireToWideChar(pcszurl: PCSTR, cchurl: UInt, pcwszbaseurl: PCWSTR, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: BOOL, dwcodepageextra: UInt, ppwszconvertedurl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetConvertUrlFromWireToWideChar(pcszurl.toCPointer<ByteVar>(), cchurl, pcwszbaseurl.toCPointer<ByteVar>(), dwcodepagehost, dwcodepagepath, fencodepathextra, dwcodepageextra, ppwszconvertedurl.toCPointer<ByteVar>())

public actual fun InternetCrackUrlA(lpszurl: PCSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCrackUrlA(lpszurl.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents.toCPointer<ByteVar>())

public actual fun InternetCrackUrlW(lpszurl: PCWSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCrackUrlW(lpszurl.toCPointer<ByteVar>(), dwurllength, dwflags, lpurlcomponents.toCPointer<ByteVar>())

public actual fun InternetCreateUrlA(lpurlcomponents: Long, dwflags: UInt, lpszurl: PSTR, lpdwurllength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCreateUrlA(lpurlcomponents.toCPointer<ByteVar>(), dwflags, lpszurl.toCPointer<ByteVar>(), lpdwurllength.toCPointer<ByteVar>())

public actual fun InternetCreateUrlW(lpurlcomponents: Long, dwflags: UInt, lpszurl: PWSTR, lpdwurllength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetCreateUrlW(lpurlcomponents.toCPointer<ByteVar>(), dwflags, lpszurl.toCPointer<ByteVar>(), lpdwurllength.toCPointer<ByteVar>())

public actual fun InternetDial(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetDial(hwndparent.toCPointer<ByteVar>(), lpszconnectoid.toCPointer<ByteVar>(), dwflags, lpdwconnection.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetDialA(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetDialA(hwndparent.toCPointer<ByteVar>(), lpszconnectoid.toCPointer<ByteVar>(), dwflags, lpdwconnection.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetDialW(hwndparent: HWND, lpszconnectoid: PCWSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetDialW(hwndparent.toCPointer<ByteVar>(), lpszconnectoid.toCPointer<ByteVar>(), dwflags, lpdwconnection.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetEnumPerSiteCookieDecisionA(pszsitename: PSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionA(pszsitename.toCPointer<ByteVar>(), pcsitenamesize.toCPointer<ByteVar>(), pdwdecision.toCPointer<ByteVar>(), dwindex)

public actual fun InternetEnumPerSiteCookieDecisionW(pszsitename: PWSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetEnumPerSiteCookieDecisionW(pszsitename.toCPointer<ByteVar>(), pcsitenamesize.toCPointer<ByteVar>(), pdwdecision.toCPointer<ByteVar>(), dwindex)

public actual fun InternetErrorDlg(hwnd: HWND, hrequest: Long, dwerror: UInt, dwflags: UInt, lppvdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetErrorDlg(hwnd.toCPointer<ByteVar>(), hrequest.toCPointer<ByteVar>(), dwerror, dwflags, lppvdata.toCPointer<ByteVar>())

public actual fun InternetFindNextFileA(hfind: Long, lpvfinddata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetFindNextFileA(hfind.toCPointer<ByteVar>(), lpvfinddata.toCPointer<ByteVar>())

public actual fun InternetFindNextFileW(hfind: Long, lpvfinddata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetFindNextFileW(hfind.toCPointer<ByteVar>(), lpvfinddata.toCPointer<ByteVar>())

public actual fun InternetFortezzaCommand(dwcommand: UInt, hwnd: HWND, dwreserved: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetFortezzaCommand(dwcommand, hwnd.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetFreeCookies(pcookies: Long, dwcookiecount: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetFreeCookies(pcookies.toCPointer<ByteVar>(), dwcookiecount)
}

public actual fun InternetFreeProxyInfoList(pproxyinfolist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetFreeProxyInfoList(pproxyinfolist.toCPointer<ByteVar>())
}

public actual fun InternetGetConnectedState(lpdwflags: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetConnectedState(lpdwflags.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: PSTR, dwnamelen: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateEx(lpdwflags.toCPointer<ByteVar>(), lpszconnectionname.toCPointer<ByteVar>(), dwnamelen, dwreserved)

public actual fun InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: PSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExA(lpdwflags.toCPointer<ByteVar>(), lpszconnectionname.toCPointer<ByteVar>(), cchnamelen, dwreserved)

public actual fun InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: PWSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetConnectedStateExW(lpdwflags.toCPointer<ByteVar>(), lpszconnectionname.toCPointer<ByteVar>(), cchnamelen, dwreserved)

public actual fun InternetGetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PSTR, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetCookieA(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun InternetGetCookieEx2(pcwszurl: PCWSTR, pcwszcookiename: PCWSTR, dwflags: UInt, ppcookies: Long, pdwcookiecount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetCookieEx2(pcwszurl.toCPointer<ByteVar>(), pcwszcookiename.toCPointer<ByteVar>(), dwflags, ppcookies.toCPointer<ByteVar>(), pdwcookiecount.toCPointer<ByteVar>())

public actual fun InternetGetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetCookieExA(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>(), dwflags, lpreserved.toCPointer<ByteVar>())

public actual fun InternetGetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetCookieExW(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>(), dwflags, lpreserved.toCPointer<ByteVar>())

public actual fun InternetGetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, lpdwsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetCookieW(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), lpdwsize.toCPointer<ByteVar>())

public actual fun InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: PSTR, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoA(lpdwerror.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: PWSTR, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetLastResponseInfoW(lpdwerror.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun InternetGetPerSiteCookieDecisionA(pchhostname: PCSTR, presult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionA(pchhostname.toCPointer<ByteVar>(), presult.toCPointer<ByteVar>())

public actual fun InternetGetPerSiteCookieDecisionW(pchhostname: PCWSTR, presult: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetPerSiteCookieDecisionW(pchhostname.toCPointer<ByteVar>(), presult.toCPointer<ByteVar>())

public actual fun InternetGetProxyForUrl(hinternet: Long, pcwszurl: PCWSTR, pproxyinfolist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetProxyForUrl(hinternet.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), pproxyinfolist.toCPointer<ByteVar>())

public actual fun InternetGetSecurityInfoByURL(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURL(lpszurl.toCPointer<ByteVar>(), ppcertchain.toCPointer<ByteVar>(), pdwsecureflags.toCPointer<ByteVar>())

public actual fun InternetGetSecurityInfoByURLA(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLA(lpszurl.toCPointer<ByteVar>(), ppcertchain.toCPointer<ByteVar>(), pdwsecureflags.toCPointer<ByteVar>())

public actual fun InternetGetSecurityInfoByURLW(lpszurl: PCWSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGetSecurityInfoByURLW(lpszurl.toCPointer<ByteVar>(), ppcertchain.toCPointer<ByteVar>(), pdwsecureflags.toCPointer<ByteVar>())

public actual fun InternetGoOnline(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGoOnline(lpszurl.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), dwflags)

public actual fun InternetGoOnlineA(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGoOnlineA(lpszurl.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), dwflags)

public actual fun InternetGoOnlineW(lpszurl: PCWSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetGoOnlineW(lpszurl.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>(), dwflags)

public actual fun InternetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetHangUp(dwconnection, dwreserved)

public actual fun InternetInitializeAutoProxyDll(dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetInitializeAutoProxyDll(dwreserved)

public actual fun InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetLockRequestFile(hinternet.toCPointer<ByteVar>(), lphlockrequestinfo.toCPointer<ByteVar>())

public actual fun InternetOpenA(lpszagent: PCSTR, dwaccesstype: UInt, lpszproxy: PCSTR, lpszproxybypass: PCSTR, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetOpenA(lpszagent.toCPointer<ByteVar>(), dwaccesstype, lpszproxy.toCPointer<ByteVar>(), lpszproxybypass.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun InternetOpenUrlA(hinternet: Long, lpszurl: PCSTR, lpszheaders: PCSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetOpenUrlA(hinternet.toCPointer<ByteVar>(), lpszurl.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, dwflags, dwcontext)?.toLong() ?: 0L

public actual fun InternetOpenUrlW(hinternet: Long, lpszurl: PCWSTR, lpszheaders: PCWSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetOpenUrlW(hinternet.toCPointer<ByteVar>(), lpszurl.toCPointer<ByteVar>(), lpszheaders.toCPointer<ByteVar>(), dwheaderslength, dwflags, dwcontext)?.toLong() ?: 0L

public actual fun InternetOpenW(lpszagent: PCWSTR, dwaccesstype: UInt, lpszproxy: PCWSTR, lpszproxybypass: PCWSTR, dwflags: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetOpenW(lpszagent.toCPointer<ByteVar>(), dwaccesstype, lpszproxy.toCPointer<ByteVar>(), lpszproxybypass.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetQueryDataAvailable(hfile.toCPointer<ByteVar>(), lpdwnumberofbytesavailable.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetQueryFortezzaStatus(pdwstatus.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetQueryOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetQueryOptionA(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun InternetQueryOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetQueryOptionW(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), lpdwbufferlength.toCPointer<ByteVar>())

public actual fun InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetReadFile(hfile.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwnumberofbytestoread, lpdwnumberofbytesread.toCPointer<ByteVar>())

public actual fun InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetReadFileExA(hfile.toCPointer<ByteVar>(), lpbuffersout.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetReadFileExW(hfile.toCPointer<ByteVar>(), lpbuffersout.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun InternetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringA(dwprotocol, lpstr.toCPointer<ByteVar>(), lpdwstrlength.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSecurityProtocolToStringW(dwprotocol, lpstr.toCPointer<ByteVar>(), lpdwstrlength.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetSetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetCookieA(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>())

public actual fun InternetSetCookieEx2(pcwszurl: PCWSTR, pcookie: Long, pcwszp3ppolicy: PCWSTR, dwflags: UInt, pdwcookiestate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetCookieEx2(pcwszurl.toCPointer<ByteVar>(), pcookie.toCPointer<ByteVar>(), pcwszp3ppolicy.toCPointer<ByteVar>(), dwflags, pdwcookiestate.toCPointer<ByteVar>())

public actual fun InternetSetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, dwflags: UInt, dwreserved: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetCookieExA(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun InternetSetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt, dwreserved: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetCookieExW(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>(), dwflags, dwreserved)

public actual fun InternetSetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetCookieW(lpszurl.toCPointer<ByteVar>(), lpszcookiename.toCPointer<ByteVar>(), lpszcookiedata.toCPointer<ByteVar>())

public actual fun InternetSetDialState(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetDialState(lpszconnectoid.toCPointer<ByteVar>(), dwstate, dwreserved)

public actual fun InternetSetDialStateA(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetDialStateA(lpszconnectoid.toCPointer<ByteVar>(), dwstate, dwreserved)

public actual fun InternetSetDialStateW(lpszconnectoid: PCWSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetDialStateW(lpszconnectoid.toCPointer<ByteVar>(), dwstate, dwreserved)

public actual fun InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: UInt, dwcontext: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetFilePointer(hfile.toCPointer<ByteVar>(), ldistancetomove, lpdistancetomovehigh.toCPointer<ByteVar>(), dwmovemethod, dwcontext)

public actual fun InternetSetOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetOptionA(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), dwbufferlength)

public actual fun InternetSetOptionExA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetOptionExA(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), dwbufferlength, dwflags)

public actual fun InternetSetOptionExW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetOptionExW(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), dwbufferlength, dwflags)

public actual fun InternetSetOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetOptionW(hinternet.toCPointer<ByteVar>(), dwoption, lpbuffer.toCPointer<ByteVar>(), dwbufferlength)

public actual fun InternetSetPerSiteCookieDecisionA(pchhostname: PCSTR, dwdecision: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionA(pchhostname.toCPointer<ByteVar>(), dwdecision)

public actual fun InternetSetPerSiteCookieDecisionW(pchhostname: PCWSTR, dwdecision: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetPerSiteCookieDecisionW(pchhostname.toCPointer<ByteVar>(), dwdecision)

public actual fun InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetStatusCallback(hinternet.toCPointer<ByteVar>(), lpfninternetcallback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackA(hinternet.toCPointer<ByteVar>(), lpfninternetcallback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetSetStatusCallbackW(hinternet.toCPointer<ByteVar>(), lpfninternetcallback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun InternetShowSecurityInfoByURL(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURL(lpszurl.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>())

public actual fun InternetShowSecurityInfoByURLA(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLA(lpszurl.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>())

public actual fun InternetShowSecurityInfoByURLW(lpszurl: PCWSTR, hwndparent: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetShowSecurityInfoByURLW(lpszurl.toCPointer<ByteVar>(), hwndparent.toCPointer<ByteVar>())

public actual fun InternetTimeFromSystemTime(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTime(pst.toCPointer<ByteVar>(), dwrfc, lpsztime.toCPointer<ByteVar>(), cbtime)

public actual fun InternetTimeFromSystemTimeA(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeA(pst.toCPointer<ByteVar>(), dwrfc, lpsztime.toCPointer<ByteVar>(), cbtime)

public actual fun InternetTimeFromSystemTimeW(pst: Long, dwrfc: UInt, lpsztime: PWSTR, cbtime: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetTimeFromSystemTimeW(pst.toCPointer<ByteVar>(), dwrfc, lpsztime.toCPointer<ByteVar>(), cbtime)

public actual fun InternetTimeToSystemTime(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTime(lpsztime.toCPointer<ByteVar>(), pst.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetTimeToSystemTimeA(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeA(lpsztime.toCPointer<ByteVar>(), pst.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetTimeToSystemTimeW(lpsztime: PCWSTR, pst: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetTimeToSystemTimeW(lpsztime.toCPointer<ByteVar>(), pst.toCPointer<ByteVar>(), dwreserved)

public actual fun InternetUnlockRequestFile(hlockrequestinfo: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetUnlockRequestFile(hlockrequestinfo.toCPointer<ByteVar>())

public actual fun InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetWriteFile(hfile.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), dwnumberofbytestowrite, lpdwnumberofbyteswritten.toCPointer<ByteVar>())

public actual fun InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetWriteFileExA(hfile.toCPointer<ByteVar>(), lpbuffersin.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_InternetWriteFileExW(hfile.toCPointer<ByteVar>(), lpbuffersin.toCPointer<ByteVar>(), dwflags, dwcontext)

public actual fun IsDomainLegalCookieDomainA(pchdomain: PCSTR, pchfulldomain: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainA(pchdomain.toCPointer<ByteVar>(), pchfulldomain.toCPointer<ByteVar>())

public actual fun IsDomainLegalCookieDomainW(pchdomain: PCWSTR, pchfulldomain: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IsDomainLegalCookieDomainW(pchdomain.toCPointer<ByteVar>(), pchfulldomain.toCPointer<ByteVar>())

public actual fun IsHostInProxyBypassList(tscheme: INTERNET_SCHEME, lpszhost: PCSTR, cchhost: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IsHostInProxyBypassList(tscheme, lpszhost.toCPointer<ByteVar>(), cchhost)

public actual fun IsProfilesEnabled(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IsProfilesEnabled()

public actual fun IsUrlCacheEntryExpiredA(lpszurlname: PCSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredA(lpszurlname.toCPointer<ByteVar>(), dwflags, pftlastmodified.toCPointer<ByteVar>())

public actual fun IsUrlCacheEntryExpiredW(lpszurlname: PCWSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_IsUrlCacheEntryExpiredW(lpszurlname.toCPointer<ByteVar>(), dwflags, pftlastmodified.toCPointer<ByteVar>())

public actual fun LoadUrlCacheContent(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_LoadUrlCacheContent()

public actual fun ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: UInt, lpszlistboxentry: PSTR, lpdwlistboxentry: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ParseX509EncodedCertificateForListBoxEntry(lpcert.toCPointer<ByteVar>(), cbcert, lpszlistboxentry.toCPointer<ByteVar>(), lpdwlistboxentry.toCPointer<ByteVar>())

public actual fun PerformOperationOverUrlCacheA(pszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: CACHE_OPERATOR, poperatordata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_PerformOperationOverUrlCacheA(pszurlsearchpattern.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, preserved1.toCPointer<ByteVar>(), pdwreserved2.toCPointer<ByteVar>(), preserved3.toCPointer<ByteVar>(), op.toLong().toCPointer<ByteVar>(), poperatordata.toCPointer<ByteVar>())

public actual fun PrivacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: Long, pszbuffer: PWSTR, pdwbufferlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_PrivacyGetZonePreferenceW(dwzone, dwtype, pdwtemplate.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), pdwbufferlength.toCPointer<ByteVar>())

public actual fun PrivacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_PrivacySetZonePreferenceW(dwzone, dwtype, dwtemplate, pszpreference.toCPointer<ByteVar>())

public actual fun ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ReadGuidsForConnectedNetworks(pcnetworks.toCPointer<ByteVar>(), pppwsznetworkguids.toCPointer<ByteVar>(), pppbstrnetworknames.toCPointer<ByteVar>(), pppwszgwmacs.toCPointer<ByteVar>(), pcgatewaymacs.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun ReadUrlCacheEntryStream(hurlcachestream: HANDLE, dwlocation: UInt, lpbuffer: Long, lpdwlen: Long, reserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStream(hurlcachestream.toCPointer<ByteVar>(), dwlocation, lpbuffer.toCPointer<ByteVar>(), lpdwlen.toCPointer<ByteVar>(), reserved)

public actual fun ReadUrlCacheEntryStreamEx(hurlcachestream: HANDLE, qwlocation: ULong, lpbuffer: Long, lpdwlen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ReadUrlCacheEntryStreamEx(hurlcachestream.toCPointer<ByteVar>(), qwlocation, lpbuffer.toCPointer<ByteVar>(), lpdwlen.toCPointer<ByteVar>())

public actual fun RegisterUrlCacheNotification(hwnd: HWND, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_RegisterUrlCacheNotification(hwnd.toCPointer<ByteVar>(), umsg, gid, dwopsfilter, dwreserved)

public actual fun ResumeSuspendedDownload(hrequest: Long, dwresultcode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ResumeSuspendedDownload(hrequest.toCPointer<ByteVar>(), dwresultcode)

public actual fun RetrieveUrlCacheEntryFileA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileA(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), dwreserved)

public actual fun RetrieveUrlCacheEntryFileW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryFileW(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), dwreserved)

public actual fun RetrieveUrlCacheEntryStreamA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamA(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), frandomread, dwreserved)?.toLong() ?: 0L

public actual fun RetrieveUrlCacheEntryStreamW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_RetrieveUrlCacheEntryStreamW(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), lpcbcacheentryinfo.toCPointer<ByteVar>(), frandomread, dwreserved)?.toLong() ?: 0L

public actual fun RunOnceUrlCache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_RunOnceUrlCache(hwnd.toCPointer<ByteVar>(), hinst.toCPointer<ByteVar>(), lpszcmd.toCPointer<ByteVar>(), ncmdshow)

public actual fun SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoA(lpcacheconfiginfo.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheConfigInfoW(lpcacheconfiginfo.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun SetUrlCacheEntryGroup(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroup(lpszurlname.toCPointer<ByteVar>(), dwflags, groupid, pbgroupattributes.toCPointer<ByteVar>(), cbgroupattributes, lpreserved.toCPointer<ByteVar>())

public actual fun SetUrlCacheEntryGroupA(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupA(lpszurlname.toCPointer<ByteVar>(), dwflags, groupid, pbgroupattributes.toCPointer<ByteVar>(), cbgroupattributes, lpreserved.toCPointer<ByteVar>())

public actual fun SetUrlCacheEntryGroupW(lpszurlname: PCWSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryGroupW(lpszurlname.toCPointer<ByteVar>(), dwflags, groupid, pbgroupattributes.toCPointer<ByteVar>(), cbgroupattributes, lpreserved.toCPointer<ByteVar>())

public actual fun SetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoA(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun SetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheEntryInfoW(lpszurlname.toCPointer<ByteVar>(), lpcacheentryinfo.toCPointer<ByteVar>(), dwfieldcontrol)

public actual fun SetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeA(gid, dwflags, dwattributes, lpgroupinfo.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheGroupAttributeW(gid, dwflags, dwattributes, lpgroupinfo.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun SetUrlCacheHeaderData(nidx: UInt, dwdata: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_SetUrlCacheHeaderData(nidx, dwdata)

public actual fun ShowClientAuthCerts(hwndparent: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ShowClientAuthCerts(hwndparent.toCPointer<ByteVar>())

public actual fun ShowSecurityInfo(hwndparent: HWND, psecurityinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ShowSecurityInfo(hwndparent.toCPointer<ByteVar>(), psecurityinfo.toCPointer<ByteVar>())

public actual fun ShowX509EncodedCertificate(hwndparent: HWND, lpcert: Long, cbcert: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_ShowX509EncodedCertificate(hwndparent.toCPointer<ByteVar>(), lpcert.toCPointer<ByteVar>(), cbcert)

public actual fun UnlockUrlCacheEntryFile(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFile(lpszurlname.toCPointer<ByteVar>(), dwreserved)

public actual fun UnlockUrlCacheEntryFileA(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileA(lpszurlname.toCPointer<ByteVar>(), dwreserved)

public actual fun UnlockUrlCacheEntryFileW(lpszurlname: PCWSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryFileW(lpszurlname.toCPointer<ByteVar>(), dwreserved)

public actual fun UnlockUrlCacheEntryStream(hurlcachestream: HANDLE, reserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UnlockUrlCacheEntryStream(hurlcachestream.toCPointer<ByteVar>(), reserved)

public actual fun UpdateUrlCacheContentPath(sznewpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UpdateUrlCacheContentPath(sznewpath.toCPointer<ByteVar>())

public actual fun UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: UInt, rgfexist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheCheckEntriesExist(rgpwszurls.toCPointer<ByteVar>(), centries, rgfexist.toCPointer<ByteVar>())

public actual fun UrlCacheCloseEntryHandle(hentryfile: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheCloseEntryHandle(hentryfile.toCPointer<ByteVar>())
}

public actual fun UrlCacheContainerSetEntryMaximumAge(pwszprefix: PCWSTR, dwentrymaxage: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheContainerSetEntryMaximumAge(pwszprefix.toCPointer<ByteVar>(), dwentrymaxage)

public actual fun UrlCacheCreateContainer(pwszname: PCWSTR, pwszprefix: PCWSTR, pwszdirectory: PCWSTR, ulllimit: ULong, dwoptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheCreateContainer(pwszname.toCPointer<ByteVar>(), pwszprefix.toCPointer<ByteVar>(), pwszdirectory.toCPointer<ByteVar>(), ulllimit, dwoptions)

public actual fun UrlCacheFindFirstEntry(pwszprefix: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: Long, phfind: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheFindFirstEntry(pwszprefix.toCPointer<ByteVar>(), dwflags, dwfilter, groupid, pcacheentryinfo.toCPointer<ByteVar>(), phfind.toCPointer<ByteVar>())

public actual fun UrlCacheFindNextEntry(hfind: HANDLE, pcacheentryinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheFindNextEntry(hfind.toCPointer<ByteVar>(), pcacheentryinfo.toCPointer<ByteVar>())

public actual fun UrlCacheFreeEntryInfo(pcacheentryinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheFreeEntryInfo(pcacheentryinfo.toCPointer<ByteVar>())
}

public actual fun UrlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheFreeGlobalSpace(ulltargetsize, dwfilter)

public actual fun UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheGetContentPaths(pppwszdirectories.toCPointer<ByteVar>(), pcdirectories.toCPointer<ByteVar>())

public actual fun UrlCacheGetEntryInfo(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheGetEntryInfo(happcache.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), pcacheentryinfo.toCPointer<ByteVar>())

public actual fun UrlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: Long, pulllimit: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalCacheSize(dwfilter, pullsize.toCPointer<ByteVar>(), pulllimit.toCPointer<ByteVar>())

public actual fun UrlCacheGetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, pulllimit: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheGetGlobalLimit(limittype, pulllimit.toCPointer<ByteVar>())

public actual fun UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: ULong, pbuffer: Long, dwbufferlen: UInt, pdwbufferlen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheReadEntryStream(hurlcachestream.toCPointer<ByteVar>(), ulllocation, pbuffer.toCPointer<ByteVar>(), dwbufferlen, pdwbufferlen.toCPointer<ByteVar>())

public actual fun UrlCacheReloadSettings(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheReloadSettings()

public actual fun UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long, phentryfile: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryFile(happcache.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), pcacheentryinfo.toCPointer<ByteVar>(), phentryfile.toCPointer<ByteVar>())

public actual fun UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: PCWSTR, frandomread: BOOL, pcacheentryinfo: Long, phentrystream: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheRetrieveEntryStream(happcache.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), frandomread, pcacheentryinfo.toCPointer<ByteVar>(), phentrystream.toCPointer<ByteVar>())

public actual fun UrlCacheServer(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheServer()

public actual fun UrlCacheSetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, ulllimit: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheSetGlobalLimit(limittype, ulllimit)

public actual fun UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: PCWSTR, pbextradata: Long, cbextradata: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.wininet.cinterop.windowssys_windows_win32_networking_wininet_UrlCacheUpdateEntryExtraData(happcache.toCPointer<ByteVar>(), pcwszurl.toCPointer<ByteVar>(), pbextradata.toCPointer<ByteVar>(), cbextradata)

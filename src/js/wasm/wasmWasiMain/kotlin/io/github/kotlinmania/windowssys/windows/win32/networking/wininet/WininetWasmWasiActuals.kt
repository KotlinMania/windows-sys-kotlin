@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pbmanifestresponseheaders: ConstPtr, dwmanifestresponseheaderssize: UInt, pestate: MutPtr, phnewappcache: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest")

public actual fun appCacheCloseHandle(happcache: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle")

public actual fun appCacheCreateAndCommitFile(happcache: ConstPtr, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: ConstPtr, dwresponseheaderssize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile")

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup")

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup")

public actual fun appCacheDuplicateHandle(happcache: ConstPtr, phduplicatedappcache: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle")

public actual fun appCacheFinalize(happcache: ConstPtr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pestate: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheFinalize")

public actual fun appCacheFreeDownloadList(pdownloadlist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList")

public actual fun appCacheFreeGroupList(pappcachegrouplist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList")

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheFreeIESpace")

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheFreeSpace")

public actual fun appCacheGetDownloadList(happcache: ConstPtr, pdownloadlist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList")

public actual fun appCacheGetFallbackUrl(happcache: ConstPtr, pwszurl: Pcwstr, ppwszfallbackurl: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl")

public actual fun appCacheGetGroupList(pappcachegrouplist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList")

public actual fun appCacheGetIEGroupList(pappcachegrouplist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList")

public actual fun appCacheGetInfo(happcache: ConstPtr, pappcacheinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheGetInfo")

public actual fun appCacheGetManifestUrl(happcache: ConstPtr, ppwszmanifesturl: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl")

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetAppCacheLookup")

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: ConstPtr, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCommitUrlCacheEntryA")

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: ConstPtr, cbblob: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCommitUrlCacheEntryBinaryBlob")

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCommitUrlCacheEntryW")

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash")

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA")

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW")

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA")

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW")

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW")

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: ConstPtr): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup")

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteIE3Cache")

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA")

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW")

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry")

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA")

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW")

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks")
private external fun wasiWindowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(param0: Int): Int

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(param0)

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetDoConnectoidsExist")
private external fun wasiWindowssysWindowsWin32NetworkingWininetDoConnectoidsExist(): Int

public actual fun doConnectoidsExist(): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetDoConnectoidsExist()

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetExportCookieFileA")

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetExportCookieFileW")

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindCloseUrlCache")

public actual fun findFirstUrlCacheContainerA(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA")

public actual fun findFirstUrlCacheContainerW(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW")

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA")

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA")

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW")

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW")

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: ConstPtr, dwsearchcondition: UInt, lpgroupid: MutPtr, lpreserved: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup")

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA")

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW")

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA")

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA")

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW")

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW")

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: MutPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup")

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol")

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA")

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW")

public actual fun ftpCommandA(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpCommandA")

public actual fun ftpCommandW(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpCommandW")

public actual fun ftpCreateDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA")

public actual fun ftpCreateDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW")

public actual fun ftpDeleteFileA(hconnect: ConstPtr, lpszfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpDeleteFileA")

public actual fun ftpDeleteFileW(hconnect: ConstPtr, lpszfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpDeleteFileW")

public actual fun ftpFindFirstFileA(hconnect: ConstPtr, lpszsearchfile: Pcstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA")

public actual fun ftpFindFirstFileW(hconnect: ConstPtr, lpszsearchfile: Pcwstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW")

public actual fun ftpGetCurrentDirectoryA(hconnect: ConstPtr, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA")

public actual fun ftpGetCurrentDirectoryW(hconnect: ConstPtr, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW")

public actual fun ftpGetFileA(hconnect: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpGetFileA")

public actual fun ftpGetFileEx(hftpsession: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpGetFileEx")

public actual fun ftpGetFileSize(hfile: ConstPtr, lpdwfilesizehigh: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpGetFileSize")

public actual fun ftpGetFileW(hconnect: ConstPtr, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpGetFileW")

public actual fun ftpOpenFileA(hconnect: ConstPtr, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpOpenFileA")

public actual fun ftpOpenFileW(hconnect: ConstPtr, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpOpenFileW")

public actual fun ftpPutFileA(hconnect: ConstPtr, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpPutFileA")

public actual fun ftpPutFileEx(hftpsession: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpPutFileEx")

public actual fun ftpPutFileW(hconnect: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpPutFileW")

public actual fun ftpRemoveDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA")

public actual fun ftpRemoveDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW")

public actual fun ftpRenameFileA(hconnect: ConstPtr, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpRenameFileA")

public actual fun ftpRenameFileW(hconnect: ConstPtr, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpRenameFileW")

public actual fun ftpSetCurrentDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA")

public actual fun ftpSetCurrentDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW")

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: MutPtr, pdlavail: MutPtr, pdltotal: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetDiskInfoA")

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA")

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW")

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: MutPtr, pftexpiretime: MutPtr, pftaccesstime: MutPtr, pftmodifiedtime: MutPtr, ppbblob: MutPtr, pcbblob: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob")

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA")

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA")

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcwstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW")

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW")

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA")

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW")

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData")

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA")

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW")

public actual fun gopherFindFirstFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA")

public actual fun gopherFindFirstFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW")

public actual fun gopherGetAttributeA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherGetAttributeA")

public actual fun gopherGetAttributeW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherGetAttributeW")

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA")

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW")

public actual fun gopherOpenFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherOpenFileA")

public actual fun gopherOpenFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetGopherOpenFileW")

public actual fun httpAddRequestHeadersA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA")

public actual fun httpAddRequestHeadersW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW")

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA")

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW")

public actual fun httpCloseDependencyHandle(hdependencyhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle")

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: ConstPtr, phduplicateddependencyhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle")

public actual fun httpEndRequestA(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpEndRequestA")

public actual fun httpEndRequestW(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpEndRequestW")

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: MutPtr, ppwszpassword: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials")

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete")

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled")

public actual fun httpOpenDependencyHandle(hrequesthandle: ConstPtr, fbackground: Bool, phdependencyhandle: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle")

public actual fun httpOpenRequestA(hconnect: ConstPtr, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpOpenRequestA")

public actual fun httpOpenRequestW(hconnect: ConstPtr, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpOpenRequestW")

public actual fun httpPushClose(hwait: HttpPushWaitHandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpPushClose")

public actual fun httpPushEnable(hrequest: ConstPtr, ptransportsetting: ConstPtr, phwait: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpPushEnable")

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpPushWait")

public actual fun httpQueryInfoA(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpQueryInfoA")

public actual fun httpQueryInfoW(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpQueryInfoW")

public actual fun httpSendRequestA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpSendRequestA")

public actual fun httpSendRequestExA(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpSendRequestExA")

public actual fun httpSendRequestExW(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpSendRequestExW")

public actual fun httpSendRequestW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpSendRequestW")

public actual fun httpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpWebSocketClose")

public actual fun httpWebSocketCompleteUpgrade(hrequest: ConstPtr, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade")

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus")

public actual fun httpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pbuffertype: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive")

public actual fun httpWebSocketSend(hwebsocket: ConstPtr, buffertype: HttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpWebSocketSend")

public actual fun httpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown")

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetImportCookieFileA")

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetImportCookieFileW")

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData")

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie")

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA")

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetInternetAttemptConnect")
private external fun wasiWindowssysWindowsWin32NetworkingWininetInternetAttemptConnect(dwreserved: Int): Int

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingWininetInternetAttemptConnect(dwreserved.toInt()).toUInt()

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetAutodial")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetInternetAutodialHangup")
private external fun wasiWindowssysWindowsWin32NetworkingWininetInternetAutodialHangup(dwreserved: Int): Int

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetInternetAutodialHangup(dwreserved.toInt())

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA")

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW")

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA")

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions")
private external fun wasiWindowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions(): Int

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions()

public actual fun internetCloseHandle(hinternet: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCloseHandle")

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCombineUrlA")

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCombineUrlW")

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing")

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA")

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW")

public actual fun internetConnectA(hinternet: ConstPtr, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetConnectA")

public actual fun internetConnectW(hinternet: ConstPtr, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetConnectW")

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar")

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCrackUrlA")

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCrackUrlW")

public actual fun internetCreateUrlA(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pstr, lpdwurllength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCreateUrlA")

public actual fun internetCreateUrlW(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetCreateUrlW")

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetDial")

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetDialA")

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetDialW")

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA")

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW")

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: MutPtr, dwerror: UInt, dwflags: UInt, lppvdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetErrorDlg")

public actual fun internetFindNextFileA(hfind: ConstPtr, lpvfinddata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetFindNextFileA")

public actual fun internetFindNextFileW(hfind: ConstPtr, lpvfinddata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetFindNextFileW")

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand")

public actual fun internetFreeCookies(pcookies: MutPtr, dwcookiecount: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetFreeCookies")

public actual fun internetFreeProxyInfoList(pproxyinfolist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList")

public actual fun internetGetConnectedState(lpdwflags: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetConnectedState")

public actual fun internetGetConnectedStateEx(lpdwflags: MutPtr, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx")

public actual fun internetGetConnectedStateExA(lpdwflags: MutPtr, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA")

public actual fun internetGetConnectedStateExW(lpdwflags: MutPtr, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW")

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetCookieA")

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: MutPtr, pdwcookiecount: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2")

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetCookieExA")

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetCookieExW")

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetCookieW")

public actual fun internetGetLastResponseInfoA(lpdwerror: MutPtr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA")

public actual fun internetGetLastResponseInfoW(lpdwerror: MutPtr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW")

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA")

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW")

public actual fun internetGetProxyForUrl(hinternet: ConstPtr, pcwszurl: Pcwstr, pproxyinfolist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl")

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL")

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA")

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW")

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGoOnline")

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGoOnlineA")

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetGoOnlineW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetInternetHangUp")
private external fun wasiWindowssysWindowsWin32NetworkingWininetInternetHangUp(dwconnection: Long, dwreserved: Int): Int

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingWininetInternetHangUp(dwconnection.toLong(), dwreserved.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll")
private external fun wasiWindowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(dwreserved: Int): Int

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(dwreserved.toInt())

public actual fun internetLockRequestFile(hinternet: ConstPtr, lphlockrequestinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetLockRequestFile")

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetOpenA")

public actual fun internetOpenUrlA(hinternet: ConstPtr, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetOpenUrlA")

public actual fun internetOpenUrlW(hinternet: ConstPtr, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetOpenUrlW")

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetOpenW")

public actual fun internetQueryDataAvailable(hfile: ConstPtr, lpdwnumberofbytesavailable: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable")

public actual fun internetQueryFortezzaStatus(pdwstatus: MutPtr, dwreserved: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus")

public actual fun internetQueryOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetQueryOptionA")

public actual fun internetQueryOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetQueryOptionW")

public actual fun internetReadFile(hfile: ConstPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetReadFile")

public actual fun internetReadFileExA(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetReadFileExA")

public actual fun internetReadFileExW(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetReadFileExW")

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA")

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW")

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetCookieA")

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: ConstPtr, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2")

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetCookieExA")

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetCookieExW")

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetCookieW")

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetDialState")

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetDialStateA")

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetDialStateW")

public actual fun internetSetFilePointer(hfile: ConstPtr, ldistancetomove: Int, lpdistancetomovehigh: MutPtr, dwmovemethod: UInt, dwcontext: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetFilePointer")

public actual fun internetSetOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetOptionA")

public actual fun internetSetOptionExA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetOptionExA")

public actual fun internetSetOptionExW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetOptionExW")

public actual fun internetSetOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetOptionW")

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA")

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW")

public actual fun internetSetStatusCallback(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetStatusCallback")

public actual fun internetSetStatusCallbackA(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackA")

public actual fun internetSetStatusCallbackW(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackW")

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL")

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA")

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW")

public actual fun internetTimeFromSystemTime(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime")

public actual fun internetTimeFromSystemTimeA(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA")

public actual fun internetTimeFromSystemTimeW(pst: ConstPtr, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW")

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime")

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA")

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW")

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile")

public actual fun internetWriteFile(hfile: ConstPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetWriteFile")

public actual fun internetWriteFileExA(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetWriteFileExA")

public actual fun internetWriteFileExW(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetInternetWriteFileExW")

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA")

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW")

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetIsProfilesEnabled")
private external fun wasiWindowssysWindowsWin32NetworkingWininetIsProfilesEnabled(): Int

public actual fun isProfilesEnabled(): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetIsProfilesEnabled()

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA")

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent")
private external fun wasiWindowssysWindowsWin32NetworkingWininetLoadUrlCacheContent(): Int

public actual fun loadUrlCacheContent(): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetLoadUrlCacheContent()

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: ConstPtr, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry")

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: ConstPtr, pdwreserved2: ConstPtr, preserved3: ConstPtr, op: CacheOperator, poperatordata: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA")

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: MutPtr, pszbuffer: Pwstr, pdwbufferlength: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW")

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW")

public actual fun readGuidsForConnectedNetworks(pcnetworks: MutPtr, pppwsznetworkguids: MutPtr, pppbstrnetworknames: MutPtr, pppwszgwmacs: MutPtr, pcgatewaymacs: MutPtr, pdwflags: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks")

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: MutPtr, lpdwlen: MutPtr, reserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream")

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: MutPtr, lpdwlen: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx")

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification")

public actual fun resumeSuspendedDownload(hrequest: ConstPtr, dwresultcode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload")

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA")

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW")

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA")

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW")

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetRunOnceUrlCache")

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA")

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW")

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup")

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA")

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW")

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA")

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW")

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA")

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData")
private external fun wasiWindowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(nidx: Int, dwdata: Int): Int

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    wasiWindowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(nidx.toInt(), dwdata.toInt())

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetShowClientAuthCerts")

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetShowSecurityInfo")

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: ConstPtr, cbcert: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate")

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile")

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA")

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW")

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream")

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath")

public actual fun urlCacheCheckEntriesExist(rgpwszurls: ConstPtr, centries: UInt, rgfexist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist")

public actual fun urlCacheCloseEntryHandle(hentryfile: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle")

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge")

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer")

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: MutPtr, phfind: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry")

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry")

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace")
private external fun wasiWindowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(ulltargetsize: Long, dwfilter: Int): Int

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(ulltargetsize.toLong(), dwfilter.toInt()).toUInt()

public actual fun urlCacheGetContentPaths(pppwszdirectories: MutPtr, pcdirectories: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths")

public actual fun urlCacheGetEntryInfo(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo")

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: MutPtr, pulllimit: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize")

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit")

public actual fun urlCacheReadEntryStream(hurlcachestream: ConstPtr, ulllocation: ULong, pbuffer: MutPtr, dwbufferlen: UInt, pdwbufferlen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings")
private external fun wasiWindowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings(): Int

public actual fun urlCacheReloadSettings(): UInt =
    wasiWindowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings().toUInt()

public actual fun urlCacheRetrieveEntryFile(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr, phentryfile: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile")

public actual fun urlCacheRetrieveEntryStream(happcache: ConstPtr, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: MutPtr, phentrystream: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetUrlCacheServer")
private external fun wasiWindowssysWindowsWin32NetworkingWininetUrlCacheServer(): Int

public actual fun urlCacheServer(): UInt =
    wasiWindowssysWindowsWin32NetworkingWininetUrlCacheServer().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit")
private external fun wasiWindowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(limittype: Int, ulllimit: Long): Int

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    wasiWindowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(limittype, ulllimit.toLong()).toUInt()

public actual fun urlCacheUpdateEntryExtraData(happcache: ConstPtr, pcwszurl: Pcwstr, pbextradata: ConstPtr, cbextradata: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData")

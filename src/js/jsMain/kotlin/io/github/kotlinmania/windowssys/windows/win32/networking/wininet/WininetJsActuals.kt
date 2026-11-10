@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32NetworkingWininetNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pbmanifestresponseheaders: COpaquePointer?, dwmanifestresponseheaderssize: UInt, pestate: COpaquePointer?, phnewappcache: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheCheckManifest((pwszmasterurl?.value ?: 0L).toString(), (pwszmanifesturl?.value ?: 0L).toString(), (pbmanifestdata?.value ?: 0L).toString(), dwmanifestdatasize.toInt(), (pbmanifestresponseheaders?.value ?: 0L).toString(), dwmanifestresponseheaderssize.toInt(), (pestate?.value ?: 0L).toString(), (phnewappcache?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheCloseHandle(happcache: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheCloseHandle((happcache?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheCreateAndCommitFile(happcache: COpaquePointer?, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: COpaquePointer?, dwresponseheaderssize: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheCreateAndCommitFile((happcache?.value ?: 0L).toString(), (pwszsourcefilepath?.value ?: 0L).toString(), (pwszurl?.value ?: 0L).toString(), (pbresponseheaders?.value ?: 0L).toString(), dwresponseheaderssize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheDeleteGroup((pwszmanifesturl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheDeleteIEGroup((pwszmanifesturl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDuplicateHandle(happcache: COpaquePointer?, phduplicatedappcache: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheDuplicateHandle((happcache?.value ?: 0L).toString(), (phduplicatedappcache?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFinalize(happcache: COpaquePointer?, pbmanifestdata: COpaquePointer?, dwmanifestdatasize: UInt, pestate: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheFinalize((happcache?.value ?: 0L).toString(), (pbmanifestdata?.value ?: 0L).toString(), dwmanifestdatasize.toInt(), (pestate?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFreeDownloadList(pdownloadlist: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheFreeDownloadList((pdownloadlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheFreeGroupList(pappcachegrouplist: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheFreeGroupList((pappcachegrouplist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetDownloadList(happcache: COpaquePointer?, pdownloadlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheGetDownloadList((happcache?.value ?: 0L).toString(), (pdownloadlist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetFallbackUrl(happcache: COpaquePointer?, pwszurl: Pcwstr, ppwszfallbackurl: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheGetFallbackUrl((happcache?.value ?: 0L).toString(), (pwszurl?.value ?: 0L).toString(), (ppwszfallbackurl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetGroupList(pappcachegrouplist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheGetGroupList((pappcachegrouplist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetIEGroupList(pappcachegrouplist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheGetIEGroupList((pappcachegrouplist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetInfo(happcache: COpaquePointer?, pappcacheinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheGetInfo((happcache?.value ?: 0L).toString(), (pappcacheinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetManifestUrl(happcache: COpaquePointer?, ppwszmanifesturl: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheGetManifestUrl((happcache?.value ?: 0L).toString(), (ppwszmanifesturl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_appCacheLookup((pwszurl?.value ?: 0L).toString(), dwflags.toInt(), (phappcache?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: COpaquePointer?, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: COpaquePointer?, cbblob: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createMD5SSOHash((pszchallengeinfo?.value ?: 0L).toString(), (pwszrealm?.value ?: 0L).toString(), (pwsztarget?.value ?: 0L).toString(), (pbhexhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createUrlCacheContainerA((name?.value ?: 0L).toString(), (lpcacheprefix?.value ?: 0L).toString(), (lpszcachepath?.value ?: 0L).toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), (pvbuffer?.value ?: 0L).toString(), (cbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createUrlCacheContainerW((name?.value ?: 0L).toString(), (lpcacheprefix?.value ?: 0L).toString(), (lpszcachepath?.value ?: 0L).toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), (pvbuffer?.value ?: 0L).toString(), (cbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createUrlCacheEntryA((lpszurlname?.value ?: 0L).toString(), dwexpectedfilesize.toInt(), (lpszfileextension?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createUrlCacheEntryExW((lpszurlname?.value ?: 0L).toString(), dwexpectedfilesize.toInt(), (lpszfileextension?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), dwreserved.toInt(), fpreserveincomingfilename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createUrlCacheEntryW((lpszurlname?.value ?: 0L).toString(), dwexpectedfilesize.toInt(), (lpszfileextension?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: COpaquePointer?): Long =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_createUrlCacheGroup(dwflags.toInt(), (lpreserved?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteIE3Cache((hwnd?.value ?: 0L).toString(), (hinst?.value ?: 0L).toString(), (lpszcmd?.value ?: 0L).toString(), ncmdshow) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerA((name?.value ?: 0L).toString(), dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteUrlCacheContainerW((name?.value ?: 0L).toString(), dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntry((lpszurlname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryA((lpszurlname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteUrlCacheEntryW((lpszurlname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteUrlCacheGroup(groupid.toString(), dwflags.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_deleteWpadCacheForNetworks(param0) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_detectAutoProxyUrl((pszautoproxyurl?.value ?: 0L).toString(), cchautoproxyurl.toInt(), dwdetectflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doConnectoidsExist(): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_doConnectoidsExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_exportCookieFileA((szfilename?.value ?: 0L).toString(), fappend) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_exportCookieFileW((szfilename?.value ?: 0L).toString(), fappend) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findCloseUrlCache((henumhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheContainerA(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerA((pdwmodified?.value ?: 0L).toString(), (lpcontainerinfo?.value ?: 0L).toString(), (lpcbcontainerinfo?.value ?: 0L).toString(), dwoptions.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheContainerW(pdwmodified: COpaquePointer?, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?, dwoptions: UInt): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheContainerW((pdwmodified?.value ?: 0L).toString(), (lpcontainerinfo?.value ?: 0L).toString(), (lpcbcontainerinfo?.value ?: 0L).toString(), dwoptions.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryA((lpszurlsearchpattern?.value ?: 0L).toString(), (lpfirstcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExA((lpszurlsearchpattern?.value ?: 0L).toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), (lpfirstcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), (lpgroupattributes?.value ?: 0L).toString(), (lpcbgroupattributes?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryExW((lpszurlsearchpattern?.value ?: 0L).toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), (lpfirstcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), (lpgroupattributes?.value ?: 0L).toString(), (lpcbgroupattributes?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheEntryW((lpszurlsearchpattern?.value ?: 0L).toString(), (lpfirstcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: COpaquePointer?, dwsearchcondition: UInt, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), (lpsearchcondition?.value ?: 0L).toString(), dwsearchcondition.toInt(), (lpgroupid?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerA((henumhandle?.value ?: 0L).toString(), (lpcontainerinfo?.value ?: 0L).toString(), (lpcbcontainerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: COpaquePointer?, lpcbcontainerinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheContainerW((henumhandle?.value ?: 0L).toString(), (lpcontainerinfo?.value ?: 0L).toString(), (lpcbcontainerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryA((henumhandle?.value ?: 0L).toString(), (lpnextcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExA((henumhandle?.value ?: 0L).toString(), (lpnextcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), (lpgroupattributes?.value ?: 0L).toString(), (lpcbgroupattributes?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpgroupattributes: COpaquePointer?, lpcbgroupattributes: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryExW((henumhandle?.value ?: 0L).toString(), (lpnextcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), (lpgroupattributes?.value ?: 0L).toString(), (lpcbgroupattributes?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheEntryW((henumhandle?.value ?: 0L).toString(), (lpnextcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findNextUrlCacheGroup((hfind?.value ?: 0L).toString(), (lpgroupid?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_findP3PPolicySymbol((pszsymbol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceA((lpszcachepath?.value ?: 0L).toString(), dwsize.toInt(), dwfilter.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_freeUrlCacheSpaceW((lpszcachepath?.value ?: 0L).toString(), dwsize.toInt(), dwfilter.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCommandA(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpCommandA((hconnect?.value ?: 0L).toString(), fexpectresponse, dwflags.toInt(), (lpszcommand?.value ?: 0L).toString(), dwcontext.toString(), (phftpcommand?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCommandW(hconnect: COpaquePointer?, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpCommandW((hconnect?.value ?: 0L).toString(), fexpectresponse, dwflags.toInt(), (lpszcommand?.value ?: 0L).toString(), dwcontext.toString(), (phftpcommand?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCreateDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpCreateDirectoryA((hconnect?.value ?: 0L).toString(), (lpszdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCreateDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpCreateDirectoryW((hconnect?.value ?: 0L).toString(), (lpszdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpDeleteFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpDeleteFileA((hconnect?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpDeleteFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpDeleteFileW((hconnect?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpFindFirstFileA(hconnect: COpaquePointer?, lpszsearchfile: Pcstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpFindFirstFileA((hconnect?.value ?: 0L).toString(), (lpszsearchfile?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpFindFirstFileW(hconnect: COpaquePointer?, lpszsearchfile: Pcwstr, lpfindfiledata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpFindFirstFileW((hconnect?.value ?: 0L).toString(), (lpszsearchfile?.value ?: 0L).toString(), (lpfindfiledata?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetCurrentDirectoryA(hconnect: COpaquePointer?, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryA((hconnect?.value ?: 0L).toString(), (lpszcurrentdirectory?.value ?: 0L).toString(), (lpdwcurrentdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetCurrentDirectoryW(hconnect: COpaquePointer?, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpGetCurrentDirectoryW((hconnect?.value ?: 0L).toString(), (lpszcurrentdirectory?.value ?: 0L).toString(), (lpdwcurrentdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileA(hconnect: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpGetFileA((hconnect?.value ?: 0L).toString(), (lpszremotefile?.value ?: 0L).toString(), (lpsznewfile?.value ?: 0L).toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileEx(hftpsession: COpaquePointer?, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpGetFileEx((hftpsession?.value ?: 0L).toString(), (lpszremotefile?.value ?: 0L).toString(), (lpsznewfile?.value ?: 0L).toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileSize(hfile: COpaquePointer?, lpdwfilesizehigh: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpGetFileSize((hfile?.value ?: 0L).toString(), (lpdwfilesizehigh?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileW(hconnect: COpaquePointer?, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpGetFileW((hconnect?.value ?: 0L).toString(), (lpszremotefile?.value ?: 0L).toString(), (lpsznewfile?.value ?: 0L).toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpOpenFileA(hconnect: COpaquePointer?, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpOpenFileA((hconnect?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpOpenFileW(hconnect: COpaquePointer?, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpOpenFileW((hconnect?.value ?: 0L).toString(), (lpszfilename?.value ?: 0L).toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileA(hconnect: COpaquePointer?, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpPutFileA((hconnect?.value ?: 0L).toString(), (lpszlocalfile?.value ?: 0L).toString(), (lpsznewremotefile?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileEx(hftpsession: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpPutFileEx((hftpsession?.value ?: 0L).toString(), (lpszlocalfile?.value ?: 0L).toString(), (lpsznewremotefile?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileW(hconnect: COpaquePointer?, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpPutFileW((hconnect?.value ?: 0L).toString(), (lpszlocalfile?.value ?: 0L).toString(), (lpsznewremotefile?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRemoveDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryA((hconnect?.value ?: 0L).toString(), (lpszdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRemoveDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpRemoveDirectoryW((hconnect?.value ?: 0L).toString(), (lpszdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRenameFileA(hconnect: COpaquePointer?, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpRenameFileA((hconnect?.value ?: 0L).toString(), (lpszexisting?.value ?: 0L).toString(), (lpsznew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRenameFileW(hconnect: COpaquePointer?, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpRenameFileW((hconnect?.value ?: 0L).toString(), (lpszexisting?.value ?: 0L).toString(), (lpsznew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpSetCurrentDirectoryA(hconnect: COpaquePointer?, lpszdirectory: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryA((hconnect?.value ?: 0L).toString(), (lpszdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpSetCurrentDirectoryW(hconnect: COpaquePointer?, lpszdirectory: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_ftpSetCurrentDirectoryW((hconnect?.value ?: 0L).toString(), (lpszdirectory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: COpaquePointer?, pdlavail: COpaquePointer?, pdltotal: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getDiskInfoA((pszpath?.value ?: 0L).toString(), (pdwclustersize?.value ?: 0L).toString(), (pdlavail?.value ?: 0L).toString(), (pdltotal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoA((lpcacheconfiginfo?.value ?: 0L).toString(), (lpcbcacheconfiginfo?.value ?: 0L).toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, lpcbcacheconfiginfo: COpaquePointer?, dwfieldcontrol: CacheConfig): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheConfigInfoW((lpcacheconfiginfo?.value ?: 0L).toString(), (lpcbcacheconfiginfo?.value ?: 0L).toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: COpaquePointer?, pftexpiretime: COpaquePointer?, pftaccesstime: COpaquePointer?, pftmodifiedtime: COpaquePointer?, ppbblob: COpaquePointer?, pcbblob: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheEntryBinaryBlob((pwszurlname?.value ?: 0L).toString(), (dwtype?.value ?: 0L).toString(), (pftexpiretime?.value ?: 0L).toString(), (pftaccesstime?.value ?: 0L).toString(), (pftmodifiedtime?.value ?: 0L).toString(), (ppbblob?.value ?: 0L).toString(), (pcbblob?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoA((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExA((lpszurl?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), (lpszredirecturl?.value ?: 0L).toString(), (lpcbredirecturl?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, lpszredirecturl: Pcwstr, lpcbredirecturl: COpaquePointer?, lpreserved: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoExW((lpszurl?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), (lpszredirecturl?.value ?: 0L).toString(), (lpcbredirecturl?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheEntryInfoW((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L).toString(), (lpcbgroupinfo?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpcbgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L).toString(), (lpcbgroupinfo?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_getUrlCacheHeaderData(nidx.toInt(), (lpdwdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherCreateLocatorA((lpszhost?.value ?: 0L).toString(), nserverport.toInt(), (lpszdisplaystring?.value ?: 0L).toString(), (lpszselectorstring?.value ?: 0L).toString(), dwgophertype.toInt(), (lpszlocator?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherCreateLocatorW((lpszhost?.value ?: 0L).toString(), nserverport.toInt(), (lpszdisplaystring?.value ?: 0L).toString(), (lpszselectorstring?.value ?: 0L).toString(), dwgophertype.toInt(), (lpszlocator?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherFindFirstFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherFindFirstFileA((hconnect?.value ?: 0L).toString(), (lpszlocator?.value ?: 0L).toString(), (lpszsearchstring?.value ?: 0L).toString(), (lpfinddata?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherFindFirstFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherFindFirstFileW((hconnect?.value ?: 0L).toString(), (lpszlocator?.value ?: 0L).toString(), (lpszsearchstring?.value ?: 0L).toString(), (lpfinddata?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetAttributeA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherGetAttributeA((hconnect?.value ?: 0L).toString(), (lpszlocator?.value ?: 0L).toString(), (lpszattributename?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), (lpdwcharactersreturned?.value ?: 0L).toString(), 0L.toString(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetAttributeW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: COpaquePointer?, dwbufferlength: UInt, lpdwcharactersreturned: COpaquePointer?, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherGetAttributeW((hconnect?.value ?: 0L).toString(), (lpszlocator?.value ?: 0L).toString(), (lpszattributename?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), (lpdwcharactersreturned?.value ?: 0L).toString(), 0L.toString(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeA((lpszlocator?.value ?: 0L).toString(), (lpdwgophertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherGetLocatorTypeW((lpszlocator?.value ?: 0L).toString(), (lpdwgophertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherOpenFileA(hconnect: COpaquePointer?, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherOpenFileA((hconnect?.value ?: 0L).toString(), (lpszlocator?.value ?: 0L).toString(), (lpszview?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherOpenFileW(hconnect: COpaquePointer?, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_gopherOpenFileW((hconnect?.value ?: 0L).toString(), (lpszlocator?.value ?: 0L).toString(), (lpszview?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddRequestHeadersA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpAddRequestHeadersA((hrequest?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddRequestHeadersW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpAddRequestHeadersW((hrequest?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpCheckDavComplianceA((lpszurl?.value ?: 0L).toString(), (lpszcompliancetoken?.value ?: 0L).toString(), (lpffound?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (lpvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: COpaquePointer?, hwnd: Hwnd, lpvreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpCheckDavComplianceW((lpszurl?.value ?: 0L).toString(), (lpszcompliancetoken?.value ?: 0L).toString(), (lpffound?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (lpvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseDependencyHandle(hdependencyhandle: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpCloseDependencyHandle((hdependencyhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: COpaquePointer?, phduplicateddependencyhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpDuplicateDependencyHandle((hdependencyhandle?.value ?: 0L).toString(), (phduplicateddependencyhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpEndRequestA(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpEndRequestA((hrequest?.value ?: 0L).toString(), (lpbuffersout?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpEndRequestW(hrequest: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpEndRequestW((hrequest?.value ?: 0L).toString(), (lpbuffersout?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: COpaquePointer?, ppwszpassword: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpGetServerCredentials((pwszurl?.value ?: 0L).toString(), (ppwszusername?.value ?: 0L).toString(), (ppwszpassword?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpIndicatePageLoadComplete((hdependencyhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpIsHostHstsEnabled((pcwszurl?.value ?: 0L).toString(), (pfishsts?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenDependencyHandle(hrequesthandle: COpaquePointer?, fbackground: Bool, phdependencyhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpOpenDependencyHandle((hrequesthandle?.value ?: 0L).toString(), fbackground, (phdependencyhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenRequestA(hconnect: COpaquePointer?, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpOpenRequestA((hconnect?.value ?: 0L).toString(), (lpszverb?.value ?: 0L).toString(), (lpszobjectname?.value ?: 0L).toString(), (lpszversion?.value ?: 0L).toString(), (lpszreferrer?.value ?: 0L).toString(), (lplpszaccepttypes?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenRequestW(hconnect: COpaquePointer?, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: COpaquePointer?, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpOpenRequestW((hconnect?.value ?: 0L).toString(), (lpszverb?.value ?: 0L).toString(), (lpszobjectname?.value ?: 0L).toString(), (lpszversion?.value ?: 0L).toString(), (lpszreferrer?.value ?: 0L).toString(), (lplpszaccepttypes?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPushClose(hwait: HttpPushWaitHandle) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpPushClose((hwait?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun httpPushEnable(hrequest: COpaquePointer?, ptransportsetting: COpaquePointer?, phwait: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpPushEnable((hrequest?.value ?: 0L).toString(), (ptransportsetting?.value ?: 0L).toString(), (phwait?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpPushWait((hwait?.value ?: 0L).toString(), etype, (pnotificationstatus?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryInfoA(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpQueryInfoA((hrequest?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lpdwindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryInfoW(hrequest: COpaquePointer?, dwinfolevel: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?, lpdwindex: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpQueryInfoW((hrequest?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), (lpdwindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestA(hrequest: COpaquePointer?, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpSendRequestA((hrequest?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), (lpoptional?.value ?: 0L).toString(), dwoptionallength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestExA(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpSendRequestExA((hrequest?.value ?: 0L).toString(), (lpbuffersin?.value ?: 0L).toString(), (lpbuffersout?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestExW(hrequest: COpaquePointer?, lpbuffersin: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpSendRequestExW((hrequest?.value ?: 0L).toString(), (lpbuffersin?.value ?: 0L).toString(), (lpbuffersout?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestW(hrequest: COpaquePointer?, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: COpaquePointer?, dwoptionallength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpSendRequestW((hrequest?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), (lpoptional?.value ?: 0L).toString(), dwoptionallength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketClose(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpWebSocketClose((hwebsocket?.value ?: 0L).toString(), usstatus.toInt(), (pvreason?.value ?: 0L).toString(), dwreasonlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketCompleteUpgrade(hrequest: COpaquePointer?, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpWebSocketCompleteUpgrade((hrequest?.value ?: 0L).toString(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: COpaquePointer?, pusstatus: COpaquePointer?, pvreason: COpaquePointer?, dwreasonlength: UInt, pdwreasonlengthconsumed: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpWebSocketQueryCloseStatus((hwebsocket?.value ?: 0L).toString(), (pusstatus?.value ?: 0L).toString(), (pvreason?.value ?: 0L).toString(), dwreasonlength.toInt(), (pdwreasonlengthconsumed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketReceive(hwebsocket: COpaquePointer?, pvbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbytesread: COpaquePointer?, pbuffertype: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpWebSocketReceive((hwebsocket?.value ?: 0L).toString(), (pvbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), (pdwbytesread?.value ?: 0L).toString(), (pbuffertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketSend(hwebsocket: COpaquePointer?, buffertype: HttpWebSocketBufferType, pvbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpWebSocketSend((hwebsocket?.value ?: 0L).toString(), buffertype, (pvbuffer?.value ?: 0L).toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketShutdown(hwebsocket: COpaquePointer?, usstatus: UShort, pvreason: COpaquePointer?, dwreasonlength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_httpWebSocketShutdown((hwebsocket?.value ?: 0L).toString(), usstatus.toInt(), (pvreason?.value ?: 0L).toString(), dwreasonlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_importCookieFileA((szfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_importCookieFileW((szfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_incrementUrlCacheHeaderData(nidx.toInt(), (lpdwdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internalInternetGetCookie((lpszurl?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (lpdwdatasize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetAlgIdToStringA(ai.toInt(), (lpstr?.value ?: 0L).toString(), (lpdwstrlength?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetAlgIdToStringW(ai.toInt(), (lpstr?.value ?: 0L).toString(), (lpdwstrlength?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetAttemptConnect(dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetAutodial(dwflags.toInt(), (hwndparent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetAutodialHangup(dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlA((lpszurl?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCanonicalizeUrlW((lpszurl?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCheckConnectionA((lpszurl?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCheckConnectionW((lpszurl?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetClearAllPerSiteCookieDecisions() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCloseHandle(hinternet: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCloseHandle((hinternet?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCombineUrlA((lpszbaseurl?.value ?: 0L).toString(), (lpszrelativeurl?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCombineUrlW((lpszbaseurl?.value ?: 0L).toString(), (lpszrelativeurl?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossing((hwnd?.value ?: 0L).toString(), (szurlprev?.value ?: 0L).toString(), (szurlnew?.value ?: 0L).toString(), bpost) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingA((hwnd?.value ?: 0L).toString(), (szurlprev?.value ?: 0L).toString(), (szurlnew?.value ?: 0L).toString(), bpost) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetConfirmZoneCrossingW((hwnd?.value ?: 0L).toString(), (szurlprev?.value ?: 0L).toString(), (szurlnew?.value ?: 0L).toString(), bpost) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConnectA(hinternet: COpaquePointer?, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetConnectA((hinternet?.value ?: 0L).toString(), (lpszservername?.value ?: 0L).toString(), nserverport.toInt(), (lpszusername?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConnectW(hinternet: COpaquePointer?, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetConnectW((hinternet?.value ?: 0L).toString(), (lpszservername?.value ?: 0L).toString(), nserverport.toInt(), (lpszusername?.value ?: 0L).toString(), (lpszpassword?.value ?: 0L).toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetConvertUrlFromWireToWideChar((pcszurl?.value ?: 0L).toString(), cchurl.toInt(), (pcwszbaseurl?.value ?: 0L).toString(), dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), (ppwszconvertedurl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCrackUrlA((lpszurl?.value ?: 0L).toString(), dwurllength.toInt(), dwflags.toInt(), (lpurlcomponents?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCrackUrlW((lpszurl?.value ?: 0L).toString(), dwurllength.toInt(), dwflags.toInt(), (lpurlcomponents?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCreateUrlA(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pstr, lpdwurllength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCreateUrlA((lpurlcomponents?.value ?: 0L).toString(), dwflags.toInt(), (lpszurl?.value ?: 0L).toString(), (lpdwurllength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCreateUrlW(lpurlcomponents: COpaquePointer?, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetCreateUrlW((lpurlcomponents?.value ?: 0L).toString(), dwflags.toInt(), (lpszurl?.value ?: 0L).toString(), (lpdwurllength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetDial((hwndparent?.value ?: 0L).toString(), (lpszconnectoid?.value ?: 0L).toString(), dwflags.toInt(), (lpdwconnection?.value ?: 0L).toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetDialA((hwndparent?.value ?: 0L).toString(), (lpszconnectoid?.value ?: 0L).toString(), dwflags.toInt(), (lpdwconnection?.value ?: 0L).toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: COpaquePointer?, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetDialW((hwndparent?.value ?: 0L).toString(), (lpszconnectoid?.value ?: 0L).toString(), dwflags.toInt(), (lpdwconnection?.value ?: 0L).toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionA((pszsitename?.value ?: 0L).toString(), (pcsitenamesize?.value ?: 0L).toString(), (pdwdecision?.value ?: 0L).toString(), dwindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: COpaquePointer?, pdwdecision: COpaquePointer?, dwindex: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetEnumPerSiteCookieDecisionW((pszsitename?.value ?: 0L).toString(), (pcsitenamesize?.value ?: 0L).toString(), (pdwdecision?.value ?: 0L).toString(), dwindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: COpaquePointer?, dwerror: UInt, dwflags: UInt, lppvdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetErrorDlg((hwnd?.value ?: 0L).toString(), (hrequest?.value ?: 0L).toString(), dwerror.toInt(), dwflags.toInt(), (lppvdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFindNextFileA(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetFindNextFileA((hfind?.value ?: 0L).toString(), (lpvfinddata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFindNextFileW(hfind: COpaquePointer?, lpvfinddata: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetFindNextFileW((hfind?.value ?: 0L).toString(), (lpvfinddata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetFortezzaCommand(dwcommand.toInt(), (hwnd?.value ?: 0L).toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFreeCookies(pcookies: COpaquePointer?, dwcookiecount: UInt) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetFreeCookies((pcookies?.value ?: 0L).toString(), dwcookiecount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun internetFreeProxyInfoList(pproxyinfolist: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetFreeProxyInfoList((pproxyinfolist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun internetGetConnectedState(lpdwflags: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetConnectedState((lpdwflags?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateEx(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetConnectedStateEx((lpdwflags?.value ?: 0L).toString(), (lpszconnectionname?.value ?: 0L).toString(), dwnamelen.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateExA(lpdwflags: COpaquePointer?, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetConnectedStateExA((lpdwflags?.value ?: 0L).toString(), (lpszconnectionname?.value ?: 0L).toString(), cchnamelen.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateExW(lpdwflags: COpaquePointer?, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetConnectedStateExW((lpdwflags?.value ?: 0L).toString(), (lpszconnectionname?.value ?: 0L).toString(), cchnamelen.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetCookieA((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: COpaquePointer?, pdwcookiecount: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetCookieEx2((pcwszurl?.value ?: 0L).toString(), (pcwszcookiename?.value ?: 0L).toString(), dwflags.toInt(), (ppcookies?.value ?: 0L).toString(), (pdwcookiecount?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetCookieExA((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString(), dwflags.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: COpaquePointer?, dwflags: InternetCookieFlags, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetCookieExW((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString(), dwflags.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetCookieW((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), (lpdwsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetLastResponseInfoA(lpdwerror: COpaquePointer?, lpszbuffer: Pstr, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoA((lpdwerror?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetLastResponseInfoW(lpdwerror: COpaquePointer?, lpszbuffer: Pwstr, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetLastResponseInfoW((lpdwerror?.value ?: 0L).toString(), (lpszbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionA((pchhostname?.value ?: 0L).toString(), (presult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetPerSiteCookieDecisionW((pchhostname?.value ?: 0L).toString(), (presult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetProxyForUrl(hinternet: COpaquePointer?, pcwszurl: Pcwstr, pproxyinfolist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetProxyForUrl((hinternet?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), (pproxyinfolist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURL((lpszurl?.value ?: 0L).toString(), (ppcertchain?.value ?: 0L).toString(), (pdwsecureflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLA((lpszurl?.value ?: 0L).toString(), (ppcertchain?.value ?: 0L).toString(), (pdwsecureflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: COpaquePointer?, pdwsecureflags: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGetSecurityInfoByURLW((lpszurl?.value ?: 0L).toString(), (ppcertchain?.value ?: 0L).toString(), (pdwsecureflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGoOnline((lpszurl?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGoOnlineA((lpszurl?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetGoOnlineW((lpszurl?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetHangUp(dwconnection.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetInitializeAutoProxyDll(dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetLockRequestFile(hinternet: COpaquePointer?, lphlockrequestinfo: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetLockRequestFile((hinternet?.value ?: 0L).toString(), (lphlockrequestinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetOpenA((lpszagent?.value ?: 0L).toString(), dwaccesstype.toInt(), (lpszproxy?.value ?: 0L).toString(), (lpszproxybypass?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenUrlA(hinternet: COpaquePointer?, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetOpenUrlA((hinternet?.value ?: 0L).toString(), (lpszurl?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenUrlW(hinternet: COpaquePointer?, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetOpenUrlW((hinternet?.value ?: 0L).toString(), (lpszurl?.value ?: 0L).toString(), (lpszheaders?.value ?: 0L).toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetOpenW((lpszagent?.value ?: 0L).toString(), dwaccesstype.toInt(), (lpszproxy?.value ?: 0L).toString(), (lpszproxybypass?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryDataAvailable(hfile: COpaquePointer?, lpdwnumberofbytesavailable: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetQueryDataAvailable((hfile?.value ?: 0L).toString(), (lpdwnumberofbytesavailable?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryFortezzaStatus(pdwstatus: COpaquePointer?, dwreserved: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetQueryFortezzaStatus((pdwstatus?.value ?: 0L).toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetQueryOptionA((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, lpdwbufferlength: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetQueryOptionW((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwbufferlength?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetReadFile((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwnumberofbytestoread.toInt(), (lpdwnumberofbytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFileExA(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetReadFileExA((hfile?.value ?: 0L).toString(), (lpbuffersout?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFileExW(hfile: COpaquePointer?, lpbuffersout: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetReadFileExW((hfile?.value ?: 0L).toString(), (lpbuffersout?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringA(dwprotocol.toInt(), (lpstr?.value ?: 0L).toString(), (lpdwstrlength?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSecurityProtocolToStringW(dwprotocol.toInt(), (lpstr?.value ?: 0L).toString(), (lpdwstrlength?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetCookieA((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: COpaquePointer?, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetCookieEx2((pcwszurl?.value ?: 0L).toString(), (pcookie?.value ?: 0L).toString(), (pcwszp3ppolicy?.value ?: 0L).toString(), dwflags.toInt(), (pdwcookiestate?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetCookieExA((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetCookieExW((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetCookieW((lpszurl?.value ?: 0L).toString(), (lpszcookiename?.value ?: 0L).toString(), (lpszcookiedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetDialState((lpszconnectoid?.value ?: 0L).toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetDialStateA((lpszconnectoid?.value ?: 0L).toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetDialStateW((lpszconnectoid?.value ?: 0L).toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetFilePointer(hfile: COpaquePointer?, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: UInt, dwcontext: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetFilePointer((hfile?.value ?: 0L).toString(), ldistancetomove, (lpdistancetomovehigh?.value ?: 0L).toString(), dwmovemethod.toInt(), dwcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetOptionA((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionExA(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetOptionExA((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionExW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt, dwflags: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetOptionExW((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionW(hinternet: COpaquePointer?, dwoption: UInt, lpbuffer: COpaquePointer?, dwbufferlength: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetOptionW((hinternet?.value ?: 0L).toString(), dwoption.toInt(), (lpbuffer?.value ?: 0L).toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionA((pchhostname?.value ?: 0L).toString(), dwdecision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetSetPerSiteCookieDecisionW((pchhostname?.value ?: 0L).toString(), dwdecision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallback(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (_windowsWin32NetworkingWininetNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallbackA(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (_windowsWin32NetworkingWininetNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallbackW(hinternet: COpaquePointer?, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (_windowsWin32NetworkingWininetNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURL((lpszurl?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLA((lpszurl?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetShowSecurityInfoByURLW((lpszurl?.value ?: 0L).toString(), (hwndparent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTime(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTime((pst?.value ?: 0L).toString(), dwrfc.toInt(), (lpsztime?.value ?: 0L).toString(), cbtime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTimeA(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeA((pst?.value ?: 0L).toString(), dwrfc.toInt(), (lpsztime?.value ?: 0L).toString(), cbtime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTimeW(pst: COpaquePointer?, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetTimeFromSystemTimeW((pst?.value ?: 0L).toString(), dwrfc.toInt(), (lpsztime?.value ?: 0L).toString(), cbtime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetTimeToSystemTime((lpsztime?.value ?: 0L).toString(), (pst?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeA((lpsztime?.value ?: 0L).toString(), (pst?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetTimeToSystemTimeW((lpsztime?.value ?: 0L).toString(), (pst?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetUnlockRequestFile((hlockrequestinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFile(hfile: COpaquePointer?, lpbuffer: COpaquePointer?, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetWriteFile((hfile?.value ?: 0L).toString(), (lpbuffer?.value ?: 0L).toString(), dwnumberofbytestowrite.toInt(), (lpdwnumberofbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFileExA(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetWriteFileExA((hfile?.value ?: 0L).toString(), (lpbuffersin?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFileExW(hfile: COpaquePointer?, lpbuffersin: COpaquePointer?, dwflags: UInt, dwcontext: ULong): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_internetWriteFileExW((hfile?.value ?: 0L).toString(), (lpbuffersin?.value ?: 0L).toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainA((pchdomain?.value ?: 0L).toString(), (pchfulldomain?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_isDomainLegalCookieDomainW((pchdomain?.value ?: 0L).toString(), (pchfulldomain?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_isHostInProxyBypassList(tscheme, (lpszhost?.value ?: 0L).toString(), cchhost.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProfilesEnabled(): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_isProfilesEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredA((lpszurlname?.value ?: 0L).toString(), dwflags.toInt(), (pftlastmodified?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_isUrlCacheEntryExpiredW((lpszurlname?.value ?: 0L).toString(), dwflags.toInt(), (pftlastmodified?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUrlCacheContent(): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_loadUrlCacheContent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: COpaquePointer?, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_parseX509EncodedCertificateForListBoxEntry((lpcert?.value ?: 0L).toString(), cbcert.toInt(), (lpszlistboxentry?.value ?: 0L).toString(), (lpdwlistboxentry?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: COpaquePointer?, pdwreserved2: COpaquePointer?, preserved3: COpaquePointer?, op: CacheOperator, poperatordata: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_performOperationOverUrlCacheA((pszurlsearchpattern?.value ?: 0L).toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), (preserved1?.value ?: 0L).toString(), (pdwreserved2?.value ?: 0L).toString(), (preserved3?.value ?: 0L).toString(), 0L.toString(), (poperatordata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: COpaquePointer?, pszbuffer: Pwstr, pdwbufferlength: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_privacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), (pdwtemplate?.value ?: 0L).toString(), (pszbuffer?.value ?: 0L).toString(), (pdwbufferlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_privacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), (pszpreference?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuidsForConnectedNetworks(pcnetworks: COpaquePointer?, pppwsznetworkguids: COpaquePointer?, pppbstrnetworknames: COpaquePointer?, pppwszgwmacs: COpaquePointer?, pcgatewaymacs: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_readGuidsForConnectedNetworks((pcnetworks?.value ?: 0L).toString(), (pppwsznetworkguids?.value ?: 0L).toString(), (pppbstrnetworknames?.value ?: 0L).toString(), (pppwszgwmacs?.value ?: 0L).toString(), (pcgatewaymacs?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?, reserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_readUrlCacheEntryStream((hurlcachestream?.value ?: 0L).toString(), dwlocation.toInt(), (lpbuffer?.value ?: 0L).toString(), (lpdwlen?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: COpaquePointer?, lpdwlen: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_readUrlCacheEntryStreamEx((hurlcachestream?.value ?: 0L).toString(), qwlocation.toString(), (lpbuffer?.value ?: 0L).toString(), (lpdwlen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_registerUrlCacheNotification((hwnd?.value ?: 0L).toString(), umsg.toInt(), gid.toString(), dwopsfilter.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeSuspendedDownload(hrequest: COpaquePointer?, dwresultcode: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_resumeSuspendedDownload((hrequest?.value ?: 0L).toString(), dwresultcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileA((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryFileW((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamA((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), frandomread, dwreserved.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, lpcbcacheentryinfo: COpaquePointer?, frandomread: Bool, dwreserved: UInt): Handle =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_retrieveUrlCacheEntryStreamW((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), (lpcbcacheentryinfo?.value ?: 0L).toString(), frandomread, dwreserved.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_runOnceUrlCache((hwnd?.value ?: 0L).toString(), (hinst?.value ?: 0L).toString(), (lpszcmd?.value ?: 0L).toString(), ncmdshow) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoA((lpcacheconfiginfo?.value ?: 0L).toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheConfigInfoW((lpcacheconfiginfo?.value ?: 0L).toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroup((lpszurlname?.value ?: 0L).toString(), dwflags.toInt(), groupid.toString(), (pbgroupattributes?.value ?: 0L).toString(), cbgroupattributes.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupA((lpszurlname?.value ?: 0L).toString(), dwflags.toInt(), groupid.toString(), (pbgroupattributes?.value ?: 0L).toString(), cbgroupattributes.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: COpaquePointer?, cbgroupattributes: UInt, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheEntryGroupW((lpszurlname?.value ?: 0L).toString(), dwflags.toInt(), groupid.toString(), (pbgroupattributes?.value ?: 0L).toString(), cbgroupattributes.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoA((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: COpaquePointer?, dwfieldcontrol: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheEntryInfoW((lpszurlname?.value ?: 0L).toString(), (lpcacheentryinfo?.value ?: 0L).toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), (lpgroupinfo?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_setUrlCacheHeaderData(nidx.toInt(), dwdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_showClientAuthCerts((hwndparent?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_showSecurityInfo((hwndparent?.value ?: 0L).toString(), (psecurityinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: COpaquePointer?, cbcert: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_showX509EncodedCertificate((hwndparent?.value ?: 0L).toString(), (lpcert?.value ?: 0L).toString(), cbcert.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFile((lpszurlname?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileA((lpszurlname?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryFileW((lpszurlname?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_unlockUrlCacheEntryStream((hurlcachestream?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_updateUrlCacheContentPath((sznewpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCheckEntriesExist(rgpwszurls: COpaquePointer?, centries: UInt, rgfexist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheCheckEntriesExist((rgpwszurls?.value ?: 0L).toString(), centries.toInt(), (rgfexist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCloseEntryHandle(hentryfile: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheCloseEntryHandle((hentryfile?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheContainerSetEntryMaximumAge((pwszprefix?.value ?: 0L).toString(), dwentrymaxage.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheCreateContainer((pwszname?.value ?: 0L).toString(), (pwszprefix?.value ?: 0L).toString(), (pwszdirectory?.value ?: 0L).toString(), ulllimit.toString(), dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: COpaquePointer?, phfind: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheFindFirstEntry((pwszprefix?.value ?: 0L).toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), (pcacheentryinfo?.value ?: 0L).toString(), (phfind?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheFindNextEntry((hfind?.value ?: 0L).toString(), (pcacheentryinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: COpaquePointer?) {
    if (_windowsWin32NetworkingWininetNapiAddon != null) {
        _windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheFreeEntryInfo((pcacheentryinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheFreeGlobalSpace(ulltargetsize.toString(), dwfilter.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetContentPaths(pppwszdirectories: COpaquePointer?, pcdirectories: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheGetContentPaths((pppwszdirectories?.value ?: 0L).toString(), (pcdirectories?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetEntryInfo(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheGetEntryInfo((happcache?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), (pcacheentryinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: COpaquePointer?, pulllimit: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheGetGlobalCacheSize(dwfilter.toInt(), (pullsize?.value ?: 0L).toString(), (pulllimit?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheGetGlobalLimit(limittype, (pulllimit?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheReadEntryStream(hurlcachestream: COpaquePointer?, ulllocation: ULong, pbuffer: COpaquePointer?, dwbufferlen: UInt, pdwbufferlen: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheReadEntryStream((hurlcachestream?.value ?: 0L).toString(), ulllocation.toString(), (pbuffer?.value ?: 0L).toString(), dwbufferlen.toInt(), (pdwbufferlen?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheReloadSettings(): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheReloadSettings() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheRetrieveEntryFile(happcache: COpaquePointer?, pcwszurl: Pcwstr, pcacheentryinfo: COpaquePointer?, phentryfile: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryFile((happcache?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), (pcacheentryinfo?.value ?: 0L).toString(), (phentryfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheRetrieveEntryStream(happcache: COpaquePointer?, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: COpaquePointer?, phentrystream: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheRetrieveEntryStream((happcache?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), frandomread, (pcacheentryinfo?.value ?: 0L).toString(), (phentrystream?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheServer(): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheServer() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheSetGlobalLimit(limittype, ulllimit.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheUpdateEntryExtraData(happcache: COpaquePointer?, pcwszurl: Pcwstr, pbextradata: COpaquePointer?, cbextradata: UInt): UInt =
    if (_windowsWin32NetworkingWininetNapiAddon != null) (_windowsWin32NetworkingWininetNapiAddon.windowssys_windows_win32_networking_wininet_urlCacheUpdateEntryExtraData((happcache?.value ?: 0L).toString(), (pcwszurl?.value ?: 0L).toString(), (pbextradata?.value ?: 0L).toString(), cbextradata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32NetworkingWininetNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pbmanifestresponseheaders: ConstPtr, dwmanifestresponseheaderssize: UInt, pestate: MutPtr, phnewappcache: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(pwszmasterurl.rawAddress.toString(), pwszmanifesturl.rawAddress.toString(), pbmanifestdata.rawAddress.toString(), dwmanifestdatasize.toInt(), pbmanifestresponseheaders.rawAddress.toString(), dwmanifestresponseheaderssize.toInt(), pestate.rawAddress.toString(), phnewappcache.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheCloseHandle(happcache: ConstPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(happcache.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheCreateAndCommitFile(happcache: ConstPtr, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: ConstPtr, dwresponseheaderssize: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(happcache.rawAddress.toString(), pwszsourcefilepath.rawAddress.toString(), pwszurl.rawAddress.toString(), pbresponseheaders.rawAddress.toString(), dwresponseheaderssize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(pwszmanifesturl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(pwszmanifesturl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDuplicateHandle(happcache: ConstPtr, phduplicatedappcache: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(happcache.rawAddress.toString(), phduplicatedappcache.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFinalize(happcache: ConstPtr, pbmanifestdata: ConstPtr, dwmanifestdatasize: UInt, pestate: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheFinalize(happcache.rawAddress.toString(), pbmanifestdata.rawAddress.toString(), dwmanifestdatasize.toInt(), pestate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFreeDownloadList(pdownloadlist: MutPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(pdownloadlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheFreeGroupList(pappcachegrouplist: MutPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(pappcachegrouplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetDownloadList(happcache: ConstPtr, pdownloadlist: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(happcache.rawAddress.toString(), pdownloadlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetFallbackUrl(happcache: ConstPtr, pwszurl: Pcwstr, ppwszfallbackurl: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(happcache.rawAddress.toString(), pwszurl.rawAddress.toString(), ppwszfallbackurl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetGroupList(pappcachegrouplist: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(pappcachegrouplist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetIEGroupList(pappcachegrouplist: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(pappcachegrouplist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetInfo(happcache: ConstPtr, pappcacheinfo: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheGetInfo(happcache.rawAddress.toString(), pappcacheinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetManifestUrl(happcache: ConstPtr, ppwszmanifesturl: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(happcache.rawAddress.toString(), ppwszmanifesturl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetAppCacheLookup(pwszurl.rawAddress.toString(), dwflags.toInt(), phappcache.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: ConstPtr, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: ConstPtr, cbblob: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(pszchallengeinfo.rawAddress.toString(), pwszrealm.rawAddress.toString(), pwsztarget.rawAddress.toString(), pbhexhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(name.rawAddress.toString(), lpcacheprefix.rawAddress.toString(), lpszcachepath.rawAddress.toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr, cbbuffer: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(name.rawAddress.toString(), lpcacheprefix.rawAddress.toString(), lpszcachepath.rawAddress.toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(lpszurlname.rawAddress.toString(), dwexpectedfilesize.toInt(), lpszfileextension.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(lpszurlname.rawAddress.toString(), dwexpectedfilesize.toInt(), lpszfileextension.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwreserved.toInt(), fpreserveincomingfilename) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(lpszurlname.rawAddress.toString(), dwexpectedfilesize.toInt(), lpszfileextension.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: ConstPtr): Long =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(dwflags.toInt(), lpreserved.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteIE3Cache(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), lpszcmd.rawAddress.toString(), ncmdshow) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(name.rawAddress.toString(), dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(name.rawAddress.toString(), dwoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(lpszurlname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(lpszurlname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(lpszurlname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(groupid.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(param0) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(pszautoproxyurl.rawAddress.toString(), cchautoproxyurl.toInt(), dwdetectflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doConnectoidsExist(): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetDoConnectoidsExist() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetExportCookieFileA(szfilename.rawAddress.toString(), fappend) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetExportCookieFileW(szfilename.rawAddress.toString(), fappend) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindCloseUrlCache(henumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheContainerA(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(pdwmodified.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString(), dwoptions.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheContainerW(pdwmodified: MutPtr, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr, dwoptions: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(pdwmodified.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString(), dwoptions.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(lpszurlsearchpattern.rawAddress.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(lpszurlsearchpattern.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(lpszurlsearchpattern.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(lpszurlsearchpattern.rawAddress.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: ConstPtr, dwsearchcondition: UInt, lpgroupid: MutPtr, lpreserved: ConstPtr): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), lpsearchcondition.rawAddress.toString(), dwsearchcondition.toInt(), lpgroupid.rawAddress.toString(), lpreserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(henumhandle.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: MutPtr, lpcbcontainerinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(henumhandle.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpgroupattributes: ConstPtr, lpcbgroupattributes: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: MutPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(hfind.rawAddress.toString(), lpgroupid.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(pszsymbol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(lpszcachepath.rawAddress.toString(), dwsize.toInt(), dwfilter.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(lpszcachepath.rawAddress.toString(), dwsize.toInt(), dwfilter.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCommandA(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpCommandA(hconnect.rawAddress.toString(), fexpectresponse, dwflags.toInt(), lpszcommand.rawAddress.toString(), dwcontext.toString(), phftpcommand.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCommandW(hconnect: ConstPtr, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpCommandW(hconnect.rawAddress.toString(), fexpectresponse, dwflags.toInt(), lpszcommand.rawAddress.toString(), dwcontext.toString(), phftpcommand.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCreateDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCreateDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpDeleteFileA(hconnect: ConstPtr, lpszfilename: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpDeleteFileA(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpDeleteFileW(hconnect: ConstPtr, lpszfilename: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpDeleteFileW(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpFindFirstFileA(hconnect: ConstPtr, lpszsearchfile: Pcstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(hconnect.rawAddress.toString(), lpszsearchfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpFindFirstFileW(hconnect: ConstPtr, lpszsearchfile: Pcwstr, lpfindfiledata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(hconnect.rawAddress.toString(), lpszsearchfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetCurrentDirectoryA(hconnect: ConstPtr, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(hconnect.rawAddress.toString(), lpszcurrentdirectory.rawAddress.toString(), lpdwcurrentdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetCurrentDirectoryW(hconnect: ConstPtr, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(hconnect.rawAddress.toString(), lpszcurrentdirectory.rawAddress.toString(), lpdwcurrentdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileA(hconnect: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpGetFileA(hconnect.rawAddress.toString(), lpszremotefile.rawAddress.toString(), lpsznewfile.rawAddress.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileEx(hftpsession: ConstPtr, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpGetFileEx(hftpsession.rawAddress.toString(), lpszremotefile.rawAddress.toString(), lpsznewfile.rawAddress.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileSize(hfile: ConstPtr, lpdwfilesizehigh: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpGetFileSize(hfile.rawAddress.toString(), lpdwfilesizehigh.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileW(hconnect: ConstPtr, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpGetFileW(hconnect.rawAddress.toString(), lpszremotefile.rawAddress.toString(), lpsznewfile.rawAddress.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpOpenFileA(hconnect: ConstPtr, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpOpenFileA(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpOpenFileW(hconnect: ConstPtr, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpOpenFileW(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileA(hconnect: ConstPtr, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpPutFileA(hconnect.rawAddress.toString(), lpszlocalfile.rawAddress.toString(), lpsznewremotefile.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileEx(hftpsession: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpPutFileEx(hftpsession.rawAddress.toString(), lpszlocalfile.rawAddress.toString(), lpsznewremotefile.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileW(hconnect: ConstPtr, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpPutFileW(hconnect.rawAddress.toString(), lpszlocalfile.rawAddress.toString(), lpsznewremotefile.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRemoveDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRemoveDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRenameFileA(hconnect: ConstPtr, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpRenameFileA(hconnect.rawAddress.toString(), lpszexisting.rawAddress.toString(), lpsznew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRenameFileW(hconnect: ConstPtr, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpRenameFileW(hconnect.rawAddress.toString(), lpszexisting.rawAddress.toString(), lpsznew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpSetCurrentDirectoryA(hconnect: ConstPtr, lpszdirectory: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpSetCurrentDirectoryW(hconnect: ConstPtr, lpszdirectory: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: MutPtr, pdlavail: MutPtr, pdltotal: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetDiskInfoA(pszpath.rawAddress.toString(), pdwclustersize.rawAddress.toString(), pdlavail.rawAddress.toString(), pdltotal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(lpcacheconfiginfo.rawAddress.toString(), lpcbcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: MutPtr, lpcbcacheconfiginfo: ConstPtr, dwfieldcontrol: CacheConfig): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(lpcacheconfiginfo.rawAddress.toString(), lpcbcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: MutPtr, pftexpiretime: MutPtr, pftaccesstime: MutPtr, pftmodifiedtime: MutPtr, ppbblob: MutPtr, pcbblob: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(pwszurlname.rawAddress.toString(), dwtype.rawAddress.toString(), pftexpiretime.rawAddress.toString(), pftaccesstime.rawAddress.toString(), pftmodifiedtime.rawAddress.toString(), ppbblob.rawAddress.toString(), pcbblob.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(lpszurl.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpszredirecturl.rawAddress.toString(), lpcbredirecturl.rawAddress.toString(), lpreserved.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, lpszredirecturl: Pcwstr, lpcbredirecturl: ConstPtr, lpreserved: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(lpszurl.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpszredirecturl.rawAddress.toString(), lpcbredirecturl.rawAddress.toString(), lpreserved.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpcbgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr, lpcbgroupinfo: MutPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpcbgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(nidx.toInt(), lpdwdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(lpszhost.rawAddress.toString(), nserverport.toInt(), lpszdisplaystring.rawAddress.toString(), lpszselectorstring.rawAddress.toString(), dwgophertype.toInt(), lpszlocator.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(lpszhost.rawAddress.toString(), nserverport.toInt(), lpszdisplaystring.rawAddress.toString(), lpszselectorstring.rawAddress.toString(), dwgophertype.toInt(), lpszlocator.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherFindFirstFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszsearchstring.rawAddress.toString(), lpfinddata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherFindFirstFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: MutPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszsearchstring.rawAddress.toString(), lpfinddata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetAttributeA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherGetAttributeA(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszattributename.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), lpdwcharactersreturned.rawAddress.toString(), 0L.toString(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetAttributeW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: MutPtr, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherGetAttributeW(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszattributename.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), lpdwcharactersreturned.rawAddress.toString(), 0L.toString(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(lpszlocator.rawAddress.toString(), lpdwgophertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(lpszlocator.rawAddress.toString(), lpdwgophertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherOpenFileA(hconnect: ConstPtr, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherOpenFileA(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszview.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherOpenFileW(hconnect: ConstPtr, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetGopherOpenFileW(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszview.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddRequestHeadersA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddRequestHeadersW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(lpszurl.rawAddress.toString(), lpszcompliancetoken.rawAddress.toString(), lpffound.rawAddress.toString(), hwnd.rawAddress.toString(), lpvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: MutPtr, hwnd: Hwnd, lpvreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(lpszurl.rawAddress.toString(), lpszcompliancetoken.rawAddress.toString(), lpffound.rawAddress.toString(), hwnd.rawAddress.toString(), lpvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseDependencyHandle(hdependencyhandle: ConstPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(hdependencyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: ConstPtr, phduplicateddependencyhandle: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(hdependencyhandle.rawAddress.toString(), phduplicateddependencyhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpEndRequestA(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpEndRequestA(hrequest.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpEndRequestW(hrequest: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpEndRequestW(hrequest.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: MutPtr, ppwszpassword: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(pwszurl.rawAddress.toString(), ppwszusername.rawAddress.toString(), ppwszpassword.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: ConstPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(hdependencyhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(pcwszurl.rawAddress.toString(), pfishsts.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenDependencyHandle(hrequesthandle: ConstPtr, fbackground: Bool, phdependencyhandle: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(hrequesthandle.rawAddress.toString(), fbackground, phdependencyhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenRequestA(hconnect: ConstPtr, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpOpenRequestA(hconnect.rawAddress.toString(), lpszverb.rawAddress.toString(), lpszobjectname.rawAddress.toString(), lpszversion.rawAddress.toString(), lpszreferrer.rawAddress.toString(), lplpszaccepttypes.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenRequestW(hconnect: ConstPtr, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: ConstPtr, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpOpenRequestW(hconnect.rawAddress.toString(), lpszverb.rawAddress.toString(), lpszobjectname.rawAddress.toString(), lpszversion.rawAddress.toString(), lpszreferrer.rawAddress.toString(), lplpszaccepttypes.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPushClose(hwait: HttpPushWaitHandle) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpPushClose(hwait.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun httpPushEnable(hrequest: ConstPtr, ptransportsetting: ConstPtr, phwait: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpPushEnable(hrequest.rawAddress.toString(), ptransportsetting.rawAddress.toString(), phwait.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpPushWait(hwait.rawAddress.toString(), etype, pnotificationstatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryInfoA(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpQueryInfoA(hrequest.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryInfoW(hrequest: ConstPtr, dwinfolevel: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr, lpdwindex: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpQueryInfoW(hrequest.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestA(hrequest: ConstPtr, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpSendRequestA(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestExA(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpSendRequestExA(hrequest.rawAddress.toString(), lpbuffersin.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestExW(hrequest: ConstPtr, lpbuffersin: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpSendRequestExW(hrequest.rawAddress.toString(), lpbuffersin.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestW(hrequest: ConstPtr, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr, dwoptionallength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpSendRequestW(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketClose(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpWebSocketClose(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketCompleteUpgrade(hrequest: ConstPtr, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toString(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: ConstPtr, pusstatus: MutPtr, pvreason: MutPtr, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toString(), pusstatus.rawAddress.toString(), pvreason.rawAddress.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketReceive(hwebsocket: ConstPtr, pvbuffer: MutPtr, dwbufferlength: UInt, pdwbytesread: MutPtr, pbuffertype: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(hwebsocket.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbytesread.rawAddress.toString(), pbuffertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketSend(hwebsocket: ConstPtr, buffertype: HttpWebSocketBufferType, pvbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpWebSocketSend(hwebsocket.rawAddress.toString(), buffertype, pvbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketShutdown(hwebsocket: ConstPtr, usstatus: UShort, pvreason: ConstPtr, dwreasonlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetImportCookieFileA(szfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetImportCookieFileW(szfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(nidx.toInt(), lpdwdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(lpszurl.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwdatasize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(ai.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(ai.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetAttemptConnect(dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetAutodial(dwflags.toInt(), hwndparent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetAutodialHangup(dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(lpszurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(lpszurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(lpszurl.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(lpszurl.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCloseHandle(hinternet: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCloseHandle(hinternet.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCombineUrlA(lpszbaseurl.rawAddress.toString(), lpszrelativeurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCombineUrlW(lpszbaseurl.rawAddress.toString(), lpszrelativeurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(hwnd.rawAddress.toString(), szurlprev.rawAddress.toString(), szurlnew.rawAddress.toString(), bpost) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(hwnd.rawAddress.toString(), szurlprev.rawAddress.toString(), szurlnew.rawAddress.toString(), bpost) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(hwnd.rawAddress.toString(), szurlprev.rawAddress.toString(), szurlnew.rawAddress.toString(), bpost) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConnectA(hinternet: ConstPtr, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetConnectA(hinternet.rawAddress.toString(), lpszservername.rawAddress.toString(), nserverport.toInt(), lpszusername.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConnectW(hinternet: ConstPtr, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetConnectW(hinternet.rawAddress.toString(), lpszservername.rawAddress.toString(), nserverport.toInt(), lpszusername.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(pcszurl.rawAddress.toString(), cchurl.toInt(), pcwszbaseurl.rawAddress.toString(), dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), ppwszconvertedurl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCrackUrlA(lpszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCrackUrlW(lpszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCreateUrlA(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pstr, lpdwurllength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCreateUrlA(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), lpszurl.rawAddress.toString(), lpdwurllength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCreateUrlW(lpurlcomponents: ConstPtr, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetCreateUrlW(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), lpszurl.rawAddress.toString(), lpdwurllength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetDial(hwndparent.rawAddress.toString(), lpszconnectoid.rawAddress.toString(), dwflags.toInt(), lpdwconnection.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetDialA(hwndparent.rawAddress.toString(), lpszconnectoid.rawAddress.toString(), dwflags.toInt(), lpdwconnection.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: MutPtr, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetDialW(hwndparent.rawAddress.toString(), lpszconnectoid.rawAddress.toString(), dwflags.toInt(), lpdwconnection.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(pszsitename.rawAddress.toString(), pcsitenamesize.rawAddress.toString(), pdwdecision.rawAddress.toString(), dwindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: MutPtr, pdwdecision: MutPtr, dwindex: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(pszsitename.rawAddress.toString(), pcsitenamesize.rawAddress.toString(), pdwdecision.rawAddress.toString(), dwindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: MutPtr, dwerror: UInt, dwflags: UInt, lppvdata: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetErrorDlg(hwnd.rawAddress.toString(), hrequest.rawAddress.toString(), dwerror.toInt(), dwflags.toInt(), lppvdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFindNextFileA(hfind: ConstPtr, lpvfinddata: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetFindNextFileA(hfind.rawAddress.toString(), lpvfinddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFindNextFileW(hfind: ConstPtr, lpvfinddata: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetFindNextFileW(hfind.rawAddress.toString(), lpvfinddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(dwcommand.toInt(), hwnd.rawAddress.toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFreeCookies(pcookies: MutPtr, dwcookiecount: UInt) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetFreeCookies(pcookies.rawAddress.toString(), dwcookiecount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun internetFreeProxyInfoList(pproxyinfolist: MutPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(pproxyinfolist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun internetGetConnectedState(lpdwflags: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetConnectedState(lpdwflags.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateEx(lpdwflags: MutPtr, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(lpdwflags.rawAddress.toString(), lpszconnectionname.rawAddress.toString(), dwnamelen.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateExA(lpdwflags: MutPtr, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(lpdwflags.rawAddress.toString(), lpszconnectionname.rawAddress.toString(), cchnamelen.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateExW(lpdwflags: MutPtr, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(lpdwflags.rawAddress.toString(), lpszconnectionname.rawAddress.toString(), cchnamelen.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetCookieA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: MutPtr, pdwcookiecount: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(pcwszurl.rawAddress.toString(), pcwszcookiename.rawAddress.toString(), dwflags.toInt(), ppcookies.rawAddress.toString(), pdwcookiecount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetCookieExA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: MutPtr, dwflags: InternetCookieFlags, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetCookieExW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetCookieW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetLastResponseInfoA(lpdwerror: MutPtr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(lpdwerror.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetLastResponseInfoW(lpdwerror: MutPtr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(lpdwerror.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(pchhostname.rawAddress.toString(), presult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(pchhostname.rawAddress.toString(), presult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetProxyForUrl(hinternet: ConstPtr, pcwszurl: Pcwstr, pproxyinfolist: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(hinternet.rawAddress.toString(), pcwszurl.rawAddress.toString(), pproxyinfolist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(lpszurl.rawAddress.toString(), ppcertchain.rawAddress.toString(), pdwsecureflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(lpszurl.rawAddress.toString(), ppcertchain.rawAddress.toString(), pdwsecureflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: MutPtr, pdwsecureflags: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(lpszurl.rawAddress.toString(), ppcertchain.rawAddress.toString(), pdwsecureflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGoOnline(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGoOnlineA(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetGoOnlineW(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetHangUp(dwconnection.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetLockRequestFile(hinternet: ConstPtr, lphlockrequestinfo: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetLockRequestFile(hinternet.rawAddress.toString(), lphlockrequestinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetOpenA(lpszagent.rawAddress.toString(), dwaccesstype.toInt(), lpszproxy.rawAddress.toString(), lpszproxybypass.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenUrlA(hinternet: ConstPtr, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetOpenUrlA(hinternet.rawAddress.toString(), lpszurl.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenUrlW(hinternet: ConstPtr, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetOpenUrlW(hinternet.rawAddress.toString(), lpszurl.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): MutPtr =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetOpenW(lpszagent.rawAddress.toString(), dwaccesstype.toInt(), lpszproxy.rawAddress.toString(), lpszproxybypass.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryDataAvailable(hfile: ConstPtr, lpdwnumberofbytesavailable: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(hfile.rawAddress.toString(), lpdwnumberofbytesavailable.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryFortezzaStatus(pdwstatus: MutPtr, dwreserved: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(pdwstatus.rawAddress.toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetQueryOptionA(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: MutPtr, lpdwbufferlength: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetQueryOptionW(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFile(hfile: ConstPtr, lpbuffer: MutPtr, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetReadFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFileExA(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetReadFileExA(hfile.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFileExW(hfile: ConstPtr, lpbuffersout: MutPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetReadFileExW(hfile.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(dwprotocol.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(dwprotocol.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetCookieA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: ConstPtr, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(pcwszurl.rawAddress.toString(), pcookie.rawAddress.toString(), pcwszp3ppolicy.rawAddress.toString(), dwflags.toInt(), pdwcookiestate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetCookieExA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), dwflags.toInt(), dwreserved.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetCookieExW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), dwflags.toInt(), dwreserved.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetCookieW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetDialState(lpszconnectoid.rawAddress.toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetDialStateA(lpszconnectoid.rawAddress.toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetDialStateW(lpszconnectoid.rawAddress.toString(), dwstate.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetFilePointer(hfile: ConstPtr, ldistancetomove: Int, lpdistancetomovehigh: MutPtr, dwmovemethod: UInt, dwcontext: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetFilePointer(hfile.rawAddress.toString(), ldistancetomove, lpdistancetomovehigh.rawAddress.toString(), dwmovemethod.toInt(), dwcontext.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetOptionA(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionExA(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetOptionExA(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionExW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetOptionExW(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionW(hinternet: ConstPtr, dwoption: UInt, lpbuffer: ConstPtr, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetOptionW(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(pchhostname.rawAddress.toString(), dwdecision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(pchhostname.rawAddress.toString(), dwdecision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallback(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (windowsWin32NetworkingWininetNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallbackA(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (windowsWin32NetworkingWininetNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallbackW(hinternet: ConstPtr, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (windowsWin32NetworkingWininetNapiAddon != null) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTime(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(pst.rawAddress.toString(), dwrfc.toInt(), lpsztime.rawAddress.toString(), cbtime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTimeA(pst: ConstPtr, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(pst.rawAddress.toString(), dwrfc.toInt(), lpsztime.rawAddress.toString(), cbtime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTimeW(pst: ConstPtr, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(pst.rawAddress.toString(), dwrfc.toInt(), lpsztime.rawAddress.toString(), cbtime.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(lpsztime.rawAddress.toString(), pst.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(lpsztime.rawAddress.toString(), pst.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(lpsztime.rawAddress.toString(), pst.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(hlockrequestinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFile(hfile: ConstPtr, lpbuffer: ConstPtr, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetWriteFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFileExA(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetWriteFileExA(hfile.rawAddress.toString(), lpbuffersin.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFileExW(hfile: ConstPtr, lpbuffersin: ConstPtr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetInternetWriteFileExW(hfile.rawAddress.toString(), lpbuffersin.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(pchdomain.rawAddress.toString(), pchfulldomain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(pchdomain.rawAddress.toString(), pchfulldomain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(tscheme, lpszhost.rawAddress.toString(), cchhost.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProfilesEnabled(): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIsProfilesEnabled() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(lpszurlname.rawAddress.toString(), dwflags.toInt(), pftlastmodified.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(lpszurlname.rawAddress.toString(), dwflags.toInt(), pftlastmodified.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUrlCacheContent(): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: ConstPtr, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(lpcert.rawAddress.toString(), cbcert.toInt(), lpszlistboxentry.rawAddress.toString(), lpdwlistboxentry.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: ConstPtr, pdwreserved2: ConstPtr, preserved3: ConstPtr, op: CacheOperator, poperatordata: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(pszurlsearchpattern.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), preserved1.rawAddress.toString(), pdwreserved2.rawAddress.toString(), preserved3.rawAddress.toString(), 0L.toString(), poperatordata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: MutPtr, pszbuffer: Pwstr, pdwbufferlength: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), pdwtemplate.rawAddress.toString(), pszbuffer.rawAddress.toString(), pdwbufferlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), pszpreference.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuidsForConnectedNetworks(pcnetworks: MutPtr, pppwsznetworkguids: MutPtr, pppbstrnetworknames: MutPtr, pppwszgwmacs: MutPtr, pcgatewaymacs: MutPtr, pdwflags: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(pcnetworks.rawAddress.toString(), pppwsznetworkguids.rawAddress.toString(), pppbstrnetworknames.rawAddress.toString(), pppwszgwmacs.rawAddress.toString(), pcgatewaymacs.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: MutPtr, lpdwlen: MutPtr, reserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(hurlcachestream.rawAddress.toString(), dwlocation.toInt(), lpbuffer.rawAddress.toString(), lpdwlen.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: MutPtr, lpdwlen: MutPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(hurlcachestream.rawAddress.toString(), qwlocation.toString(), lpbuffer.rawAddress.toString(), lpdwlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(hwnd.rawAddress.toString(), umsg.toInt(), gid.toString(), dwopsfilter.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeSuspendedDownload(hrequest: ConstPtr, dwresultcode: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(hrequest.rawAddress.toString(), dwresultcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), frandomread, dwreserved.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr, lpcbcacheentryinfo: MutPtr, frandomread: Bool, dwreserved: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAddon != null) MutPtr((windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), frandomread, dwreserved.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetRunOnceUrlCache(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), lpszcmd.rawAddress.toString(), ncmdshow) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(lpcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(lpcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(lpszurlname.rawAddress.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.rawAddress.toString(), cbgroupattributes.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(lpszurlname.rawAddress.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.rawAddress.toString(), cbgroupattributes.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr, cbgroupattributes: UInt, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(lpszurlname.rawAddress.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.rawAddress.toString(), cbgroupattributes.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: ConstPtr, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), dwfieldcontrol.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr, lpreserved: ConstPtr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(nidx.toInt(), dwdata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetShowClientAuthCerts(hwndparent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: ConstPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetShowSecurityInfo(hwndparent.rawAddress.toString(), psecurityinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: ConstPtr, cbcert: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(hwndparent.rawAddress.toString(), lpcert.rawAddress.toString(), cbcert.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(lpszurlname.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(lpszurlname.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(lpszurlname.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(hurlcachestream.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(sznewpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCheckEntriesExist(rgpwszurls: ConstPtr, centries: UInt, rgfexist: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(rgpwszurls.rawAddress.toString(), centries.toInt(), rgfexist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCloseEntryHandle(hentryfile: ConstPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(hentryfile.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(pwszprefix.rawAddress.toString(), dwentrymaxage.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(pwszname.rawAddress.toString(), pwszprefix.rawAddress.toString(), pwszdirectory.rawAddress.toString(), ulllimit.toString(), dwoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: MutPtr, phfind: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(pwszprefix.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), pcacheentryinfo.rawAddress.toString(), phfind.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(hfind.rawAddress.toString(), pcacheentryinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: MutPtr) {
    if (windowsWin32NetworkingWininetNapiAddon != null) {
        windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(pcacheentryinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(ulltargetsize.toString(), dwfilter.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetContentPaths(pppwszdirectories: MutPtr, pcdirectories: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(pppwszdirectories.rawAddress.toString(), pcdirectories.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetEntryInfo(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), pcacheentryinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: MutPtr, pulllimit: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(dwfilter.toInt(), pullsize.rawAddress.toString(), pulllimit.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(limittype, pulllimit.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheReadEntryStream(hurlcachestream: ConstPtr, ulllocation: ULong, pbuffer: MutPtr, dwbufferlen: UInt, pdwbufferlen: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(hurlcachestream.rawAddress.toString(), ulllocation.toString(), pbuffer.rawAddress.toString(), dwbufferlen.toInt(), pdwbufferlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheReloadSettings(): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheRetrieveEntryFile(happcache: ConstPtr, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr, phentryfile: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), pcacheentryinfo.rawAddress.toString(), phentryfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheRetrieveEntryStream(happcache: ConstPtr, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: MutPtr, phentrystream: MutPtr): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), frandomread, pcacheentryinfo.rawAddress.toString(), phentrystream.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheServer(): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheServer() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(limittype, ulllimit.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheUpdateEntryExtraData(happcache: ConstPtr, pcwszurl: Pcwstr, pbextradata: ConstPtr, cbextradata: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAddon != null) (windowsWin32NetworkingWininetNapiAddon.windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), pbextradata.rawAddress.toString(), cbextradata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

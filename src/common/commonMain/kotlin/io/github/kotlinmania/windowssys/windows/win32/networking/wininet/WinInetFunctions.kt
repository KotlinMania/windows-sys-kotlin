package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(lpattributeinfo: Long, dwerror: UInt): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(hinternet: Long, dwcontext: ULong, dwinternetstatus: UInt, lpvstatusinformation: Long, dwstatusinformationlength: UInt)
}

public fun interface FnCallback2 {
    public operator fun invoke(pcei: Long, pcbcei: Long, popdata: Long): BOOL
}

public fun AppCacheCheckManifest(pwszmasterurl: PCWSTR, pwszmanifesturl: PCWSTR, pbmanifestdata: Long, dwmanifestdatasize: UInt, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: UInt, pestate: Long, phnewappcache: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheCheckManifest", longArrayOf(pwszmasterurl, pwszmanifesturl, pbmanifestdata, dwmanifestdatasize.toLong(), pbmanifestresponseheaders, dwmanifestresponseheaderssize.toLong(), pestate, phnewappcache)).toUInt()
}

public fun AppCacheCloseHandle(happcache: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "AppCacheCloseHandle", longArrayOf(happcache))
}

public fun AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: PCWSTR, pwszurl: PCWSTR, pbresponseheaders: Long, dwresponseheaderssize: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheCreateAndCommitFile", longArrayOf(happcache, pwszsourcefilepath, pwszurl, pbresponseheaders, dwresponseheaderssize.toLong())).toUInt()
}

public fun AppCacheDeleteGroup(pwszmanifesturl: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheDeleteGroup", longArrayOf(pwszmanifesturl)).toUInt()
}

public fun AppCacheDeleteIEGroup(pwszmanifesturl: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheDeleteIEGroup", longArrayOf(pwszmanifesturl)).toUInt()
}

public fun AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheDuplicateHandle", longArrayOf(happcache, phduplicatedappcache)).toUInt()
}

public fun AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: UInt, pestate: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheFinalize", longArrayOf(happcache, pbmanifestdata, dwmanifestdatasize.toLong(), pestate)).toUInt()
}

public fun AppCacheFreeDownloadList(pdownloadlist: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "AppCacheFreeDownloadList", longArrayOf(pdownloadlist))
}

public fun AppCacheFreeGroupList(pappcachegrouplist: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "AppCacheFreeGroupList", longArrayOf(pappcachegrouplist))
}

public fun AppCacheFreeIESpace(ftcutoff: FILETIME): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheFreeIESpace", longArrayOf(((ftcutoff.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftcutoff.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)))).toUInt()
}

public fun AppCacheFreeSpace(ftcutoff: FILETIME): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheFreeSpace", longArrayOf(((ftcutoff.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftcutoff.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)))).toUInt()
}

public fun AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheGetDownloadList", longArrayOf(happcache, pdownloadlist)).toUInt()
}

public fun AppCacheGetFallbackUrl(happcache: Long, pwszurl: PCWSTR, ppwszfallbackurl: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheGetFallbackUrl", longArrayOf(happcache, pwszurl, ppwszfallbackurl)).toUInt()
}

public fun AppCacheGetGroupList(pappcachegrouplist: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheGetGroupList", longArrayOf(pappcachegrouplist)).toUInt()
}

public fun AppCacheGetIEGroupList(pappcachegrouplist: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheGetIEGroupList", longArrayOf(pappcachegrouplist)).toUInt()
}

public fun AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheGetInfo", longArrayOf(happcache, pappcacheinfo)).toUInt()
}

public fun AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheGetManifestUrl", longArrayOf(happcache, ppwszmanifesturl)).toUInt()
}

public fun AppCacheLookup(pwszurl: PCWSTR, dwflags: UInt, phappcache: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "AppCacheLookup", longArrayOf(pwszurl, dwflags.toLong(), phappcache)).toUInt()
}

public fun CommitUrlCacheEntryA(lpszurlname: PCSTR, lpszlocalfilename: PCSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpheaderinfo: Long, cchheaderinfo: UInt, lpszfileextension: PCSTR, lpszoriginalurl: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CommitUrlCacheEntryA", longArrayOf(lpszurlname, lpszlocalfilename, ((expiretime.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((expiretime.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), ((lastmodifiedtime.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((lastmodifiedtime.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), cacheentrytype.toLong(), lpheaderinfo, cchheaderinfo.toLong(), lpszfileextension, lpszoriginalurl)).toInt()
}

public fun CommitUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: UInt, ftexpiretime: FILETIME, ftmodifiedtime: FILETIME, pbblob: Long, cbblob: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "CommitUrlCacheEntryBinaryBlob", longArrayOf(pwszurlname, dwtype.toLong(), ((ftexpiretime.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftexpiretime.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), ((ftmodifiedtime.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((ftmodifiedtime.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), pbblob, cbblob.toLong())).toUInt()
}

public fun CommitUrlCacheEntryW(lpszurlname: PCWSTR, lpszlocalfilename: PCWSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpszheaderinfo: PCWSTR, cchheaderinfo: UInt, lpszfileextension: PCWSTR, lpszoriginalurl: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CommitUrlCacheEntryW", longArrayOf(lpszurlname, lpszlocalfilename, ((expiretime.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((expiretime.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), ((lastmodifiedtime.dwLowDateTime.toLong() and 0xFFFF_FFFFL) or ((lastmodifiedtime.dwHighDateTime.toLong() and 0xFFFF_FFFFL) shl 32)), cacheentrytype.toLong(), lpszheaderinfo, cchheaderinfo.toLong(), lpszfileextension, lpszoriginalurl)).toInt()
}

public fun CreateMD5SSOHash(pszchallengeinfo: PCWSTR, pwszrealm: PCWSTR, pwsztarget: PCWSTR, pbhexhash: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateMD5SSOHash", longArrayOf(pszchallengeinfo, pwszrealm, pwsztarget, pbhexhash)).toInt()
}

public fun CreateUrlCacheContainerA(name: PCSTR, lpcacheprefix: PCSTR, lpszcachepath: PCSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateUrlCacheContainerA", longArrayOf(name, lpcacheprefix, lpszcachepath, kbcachelimit.toLong(), dwcontainertype.toLong(), dwoptions.toLong(), pvbuffer, cbbuffer)).toInt()
}

public fun CreateUrlCacheContainerW(name: PCWSTR, lpcacheprefix: PCWSTR, lpszcachepath: PCWSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateUrlCacheContainerW", longArrayOf(name, lpcacheprefix, lpszcachepath, kbcachelimit.toLong(), dwcontainertype.toLong(), dwoptions.toLong(), pvbuffer, cbbuffer)).toInt()
}

public fun CreateUrlCacheEntryA(lpszurlname: PCSTR, dwexpectedfilesize: UInt, lpszfileextension: PCSTR, lpszfilename: PSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateUrlCacheEntryA", longArrayOf(lpszurlname, dwexpectedfilesize.toLong(), lpszfileextension, lpszfilename, dwreserved.toLong())).toInt()
}

public fun CreateUrlCacheEntryExW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt, fpreserveincomingfilename: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateUrlCacheEntryExW", longArrayOf(lpszurlname, dwexpectedfilesize.toLong(), lpszfileextension, lpszfilename, dwreserved.toLong(), fpreserveincomingfilename.toLong())).toInt()
}

public fun CreateUrlCacheEntryW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateUrlCacheEntryW", longArrayOf(lpszurlname, dwexpectedfilesize.toLong(), lpszfileextension, lpszfilename, dwreserved.toLong())).toInt()
}

public fun CreateUrlCacheGroup(dwflags: UInt, lpreserved: Long): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "CreateUrlCacheGroup", longArrayOf(dwflags.toLong(), lpreserved))
}

public fun DeleteIE3Cache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteIE3Cache", longArrayOf(hwnd, hinst, lpszcmd, ncmdshow.toLong())).toUInt()
}

public fun DeleteUrlCacheContainerA(name: PCSTR, dwoptions: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteUrlCacheContainerA", longArrayOf(name, dwoptions.toLong())).toInt()
}

public fun DeleteUrlCacheContainerW(name: PCWSTR, dwoptions: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteUrlCacheContainerW", longArrayOf(name, dwoptions.toLong())).toInt()
}

public fun DeleteUrlCacheEntry(lpszurlname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteUrlCacheEntry", longArrayOf(lpszurlname)).toInt()
}

public fun DeleteUrlCacheEntryA(lpszurlname: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteUrlCacheEntryA", longArrayOf(lpszurlname)).toInt()
}

public fun DeleteUrlCacheEntryW(lpszurlname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteUrlCacheEntryW", longArrayOf(lpszurlname)).toInt()
}

public fun DeleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteUrlCacheGroup", longArrayOf(groupid, dwflags.toLong(), lpreserved)).toInt()
}

public fun DeleteWpadCacheForNetworks(param0: WPAD_CACHE_DELETE): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DeleteWpadCacheForNetworks", longArrayOf(param0.toLong())).toInt()
}

public fun DetectAutoProxyUrl(pszautoproxyurl: PSTR, cchautoproxyurl: UInt, dwdetectflags: PROXY_AUTO_DETECT_TYPE): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DetectAutoProxyUrl", longArrayOf(pszautoproxyurl, cchautoproxyurl.toLong(), dwdetectflags.toLong())).toInt()
}

public fun DoConnectoidsExist(): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "DoConnectoidsExist", longArrayOf()).toInt()
}

public fun ExportCookieFileA(szfilename: PCSTR, fappend: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ExportCookieFileA", longArrayOf(szfilename, fappend.toLong())).toInt()
}

public fun ExportCookieFileW(szfilename: PCWSTR, fappend: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ExportCookieFileW", longArrayOf(szfilename, fappend.toLong())).toInt()
}

public fun FindCloseUrlCache(henumhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindCloseUrlCache", longArrayOf(henumhandle)).toInt()
}

public fun FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheContainerA", longArrayOf(pdwmodified, lpcontainerinfo, lpcbcontainerinfo, dwoptions.toLong()))
}

public fun FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheContainerW", longArrayOf(pdwmodified, lpcontainerinfo, lpcbcontainerinfo, dwoptions.toLong()))
}

public fun FindFirstUrlCacheEntryA(lpszurlsearchpattern: PCSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheEntryA", longArrayOf(lpszurlsearchpattern, lpfirstcacheentryinfo, lpcbcacheentryinfo))
}

public fun FindFirstUrlCacheEntryExA(lpszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheEntryExA", longArrayOf(lpszurlsearchpattern, dwflags.toLong(), dwfilter.toLong(), groupid, lpfirstcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved))
}

public fun FindFirstUrlCacheEntryExW(lpszurlsearchpattern: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheEntryExW", longArrayOf(lpszurlsearchpattern, dwflags.toLong(), dwfilter.toLong(), groupid, lpfirstcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved))
}

public fun FindFirstUrlCacheEntryW(lpszurlsearchpattern: PCWSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheEntryW", longArrayOf(lpszurlsearchpattern, lpfirstcacheentryinfo, lpcbcacheentryinfo))
}

public fun FindFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: Long, dwsearchcondition: UInt, lpgroupid: Long, lpreserved: Long): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "FindFirstUrlCacheGroup", longArrayOf(dwflags.toLong(), dwfilter.toLong(), lpsearchcondition, dwsearchcondition.toLong(), lpgroupid, lpreserved))
}

public fun FindNextUrlCacheContainerA(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheContainerA", longArrayOf(henumhandle, lpcontainerinfo, lpcbcontainerinfo)).toInt()
}

public fun FindNextUrlCacheContainerW(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheContainerW", longArrayOf(henumhandle, lpcontainerinfo, lpcbcontainerinfo)).toInt()
}

public fun FindNextUrlCacheEntryA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheEntryA", longArrayOf(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo)).toInt()
}

public fun FindNextUrlCacheEntryExA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheEntryExA", longArrayOf(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved)).toInt()
}

public fun FindNextUrlCacheEntryExW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheEntryExW", longArrayOf(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved)).toInt()
}

public fun FindNextUrlCacheEntryW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheEntryW", longArrayOf(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo)).toInt()
}

public fun FindNextUrlCacheGroup(hfind: HANDLE, lpgroupid: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FindNextUrlCacheGroup", longArrayOf(hfind, lpgroupid, lpreserved)).toInt()
}

public fun FindP3PPolicySymbol(pszsymbol: PCSTR): Int {
    return Win32DynamicFfi.invoke("wininet.dll", "FindP3PPolicySymbol", longArrayOf(pszsymbol)).toInt()
}

public fun FreeUrlCacheSpaceA(lpszcachepath: PCSTR, dwsize: UInt, dwfilter: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FreeUrlCacheSpaceA", longArrayOf(lpszcachepath, dwsize.toLong(), dwfilter.toLong())).toInt()
}

public fun FreeUrlCacheSpaceW(lpszcachepath: PCWSTR, dwsize: UInt, dwfilter: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FreeUrlCacheSpaceW", longArrayOf(lpszcachepath, dwsize.toLong(), dwfilter.toLong())).toInt()
}

public fun FtpCommandA(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCSTR, dwcontext: ULong, phftpcommand: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpCommandA", longArrayOf(hconnect, fexpectresponse.toLong(), dwflags.toLong(), lpszcommand, dwcontext.toLong(), phftpcommand)).toInt()
}

public fun FtpCommandW(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCWSTR, dwcontext: ULong, phftpcommand: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpCommandW", longArrayOf(hconnect, fexpectresponse.toLong(), dwflags.toLong(), lpszcommand, dwcontext.toLong(), phftpcommand)).toInt()
}

public fun FtpCreateDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpCreateDirectoryA", longArrayOf(hconnect, lpszdirectory)).toInt()
}

public fun FtpCreateDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpCreateDirectoryW", longArrayOf(hconnect, lpszdirectory)).toInt()
}

public fun FtpDeleteFileA(hconnect: Long, lpszfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpDeleteFileA", longArrayOf(hconnect, lpszfilename)).toInt()
}

public fun FtpDeleteFileW(hconnect: Long, lpszfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpDeleteFileW", longArrayOf(hconnect, lpszfilename)).toInt()
}

public fun FtpFindFirstFileA(hconnect: Long, lpszsearchfile: PCSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpFindFirstFileA", longArrayOf(hconnect, lpszsearchfile, lpfindfiledata, dwflags.toLong(), dwcontext.toLong()))
}

public fun FtpFindFirstFileW(hconnect: Long, lpszsearchfile: PCWSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpFindFirstFileW", longArrayOf(hconnect, lpszsearchfile, lpfindfiledata, dwflags.toLong(), dwcontext.toLong()))
}

public fun FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: PSTR, lpdwcurrentdirectory: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpGetCurrentDirectoryA", longArrayOf(hconnect, lpszcurrentdirectory, lpdwcurrentdirectory)).toInt()
}

public fun FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: PWSTR, lpdwcurrentdirectory: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpGetCurrentDirectoryW", longArrayOf(hconnect, lpszcurrentdirectory, lpdwcurrentdirectory)).toInt()
}

public fun FtpGetFileA(hconnect: Long, lpszremotefile: PCSTR, lpsznewfile: PCSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpGetFileA", longArrayOf(hconnect, lpszremotefile, lpsznewfile, ffailifexists.toLong(), dwflagsandattributes.toLong(), dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun FtpGetFileEx(hftpsession: Long, lpszremotefile: PCSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpGetFileEx", longArrayOf(hftpsession, lpszremotefile, lpsznewfile, ffailifexists.toLong(), dwflagsandattributes.toLong(), dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpGetFileSize", longArrayOf(hfile, lpdwfilesizehigh)).toUInt()
}

public fun FtpGetFileW(hconnect: Long, lpszremotefile: PCWSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpGetFileW", longArrayOf(hconnect, lpszremotefile, lpsznewfile, ffailifexists.toLong(), dwflagsandattributes.toLong(), dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun FtpOpenFileA(hconnect: Long, lpszfilename: PCSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpOpenFileA", longArrayOf(hconnect, lpszfilename, dwaccess.toLong(), dwflags.toLong(), dwcontext.toLong()))
}

public fun FtpOpenFileW(hconnect: Long, lpszfilename: PCWSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpOpenFileW", longArrayOf(hconnect, lpszfilename, dwaccess.toLong(), dwflags.toLong(), dwcontext.toLong()))
}

public fun FtpPutFileA(hconnect: Long, lpszlocalfile: PCSTR, lpsznewremotefile: PCSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpPutFileA", longArrayOf(hconnect, lpszlocalfile, lpsznewremotefile, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun FtpPutFileEx(hftpsession: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCSTR, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpPutFileEx", longArrayOf(hftpsession, lpszlocalfile, lpsznewremotefile, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun FtpPutFileW(hconnect: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCWSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpPutFileW", longArrayOf(hconnect, lpszlocalfile, lpsznewremotefile, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpRemoveDirectoryA", longArrayOf(hconnect, lpszdirectory)).toInt()
}

public fun FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpRemoveDirectoryW", longArrayOf(hconnect, lpszdirectory)).toInt()
}

public fun FtpRenameFileA(hconnect: Long, lpszexisting: PCSTR, lpsznew: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpRenameFileA", longArrayOf(hconnect, lpszexisting, lpsznew)).toInt()
}

public fun FtpRenameFileW(hconnect: Long, lpszexisting: PCWSTR, lpsznew: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpRenameFileW", longArrayOf(hconnect, lpszexisting, lpsznew)).toInt()
}

public fun FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpSetCurrentDirectoryA", longArrayOf(hconnect, lpszdirectory)).toInt()
}

public fun FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "FtpSetCurrentDirectoryW", longArrayOf(hconnect, lpszdirectory)).toInt()
}

public fun GetDiskInfoA(pszpath: PCSTR, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetDiskInfoA", longArrayOf(pszpath, pdwclustersize, pdlavail, pdltotal)).toInt()
}

public fun GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheConfigInfoA", longArrayOf(lpcacheconfiginfo, lpcbcacheconfiginfo, dwfieldcontrol.toLong())).toInt()
}

public fun GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheConfigInfoW", longArrayOf(lpcacheconfiginfo, lpcbcacheconfiginfo, dwfieldcontrol.toLong())).toInt()
}

public fun GetUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheEntryBinaryBlob", longArrayOf(pwszurlname, dwtype, pftexpiretime, pftaccesstime, pftmodifiedtime, ppbblob, pcbblob)).toUInt()
}

public fun GetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheEntryInfoA", longArrayOf(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo)).toInt()
}

public fun GetUrlCacheEntryInfoExA(lpszurl: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheEntryInfoExA", longArrayOf(lpszurl, lpcacheentryinfo, lpcbcacheentryinfo, lpszredirecturl, lpcbredirecturl, lpreserved, dwflags.toLong())).toInt()
}

public fun GetUrlCacheEntryInfoExW(lpszurl: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCWSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheEntryInfoExW", longArrayOf(lpszurl, lpcacheentryinfo, lpcbcacheentryinfo, lpszredirecturl, lpcbredirecturl, lpreserved, dwflags.toLong())).toInt()
}

public fun GetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheEntryInfoW", longArrayOf(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo)).toInt()
}

public fun GetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheGroupAttributeA", longArrayOf(gid, dwflags.toLong(), dwattributes.toLong(), lpgroupinfo, lpcbgroupinfo, lpreserved)).toInt()
}

public fun GetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheGroupAttributeW", longArrayOf(gid, dwflags.toLong(), dwattributes.toLong(), lpgroupinfo, lpcbgroupinfo, lpreserved)).toInt()
}

public fun GetUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GetUrlCacheHeaderData", longArrayOf(nidx.toLong(), lpdwdata)).toInt()
}

public fun GopherCreateLocatorA(lpszhost: PCSTR, nserverport: UShort, lpszdisplaystring: PCSTR, lpszselectorstring: PCSTR, dwgophertype: UInt, lpszlocator: PSTR, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherCreateLocatorA", longArrayOf(lpszhost, nserverport.toLong(), lpszdisplaystring, lpszselectorstring, dwgophertype.toLong(), lpszlocator, lpdwbufferlength)).toInt()
}

public fun GopherCreateLocatorW(lpszhost: PCWSTR, nserverport: UShort, lpszdisplaystring: PCWSTR, lpszselectorstring: PCWSTR, dwgophertype: UInt, lpszlocator: PWSTR, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherCreateLocatorW", longArrayOf(lpszhost, nserverport.toLong(), lpszdisplaystring, lpszselectorstring, dwgophertype.toLong(), lpszlocator, lpdwbufferlength)).toInt()
}

public fun GopherFindFirstFileA(hconnect: Long, lpszlocator: PCSTR, lpszsearchstring: PCSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherFindFirstFileA", longArrayOf(hconnect, lpszlocator, lpszsearchstring, lpfinddata, dwflags.toLong(), dwcontext.toLong()))
}

public fun GopherFindFirstFileW(hconnect: Long, lpszlocator: PCWSTR, lpszsearchstring: PCWSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherFindFirstFileW", longArrayOf(hconnect, lpszlocator, lpszsearchstring, lpfinddata, dwflags.toLong(), dwcontext.toLong()))
}

public fun GopherGetAttributeA(hconnect: Long, lpszlocator: PCSTR, lpszattributename: PCSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherGetAttributeA", longArrayOf(hconnect, lpszlocator, lpszattributename, lpbuffer, dwbufferlength.toLong(), lpdwcharactersreturned, Win32DynamicFfi.objectSlot(lpfnenumerator), dwcontext.toLong())).toInt()
}

public fun GopherGetAttributeW(hconnect: Long, lpszlocator: PCWSTR, lpszattributename: PCWSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherGetAttributeW", longArrayOf(hconnect, lpszlocator, lpszattributename, lpbuffer, dwbufferlength.toLong(), lpdwcharactersreturned, Win32DynamicFfi.objectSlot(lpfnenumerator), dwcontext.toLong())).toInt()
}

public fun GopherGetLocatorTypeA(lpszlocator: PCSTR, lpdwgophertype: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherGetLocatorTypeA", longArrayOf(lpszlocator, lpdwgophertype)).toInt()
}

public fun GopherGetLocatorTypeW(lpszlocator: PCWSTR, lpdwgophertype: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherGetLocatorTypeW", longArrayOf(lpszlocator, lpdwgophertype)).toInt()
}

public fun GopherOpenFileA(hconnect: Long, lpszlocator: PCSTR, lpszview: PCSTR, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherOpenFileA", longArrayOf(hconnect, lpszlocator, lpszview, dwflags.toLong(), dwcontext.toLong()))
}

public fun GopherOpenFileW(hconnect: Long, lpszlocator: PCWSTR, lpszview: PCWSTR, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "GopherOpenFileW", longArrayOf(hconnect, lpszlocator, lpszview, dwflags.toLong(), dwcontext.toLong()))
}

public fun HttpAddRequestHeadersA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpAddRequestHeadersA", longArrayOf(hrequest, lpszheaders, dwheaderslength.toLong(), dwmodifiers.toLong())).toInt()
}

public fun HttpAddRequestHeadersW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpAddRequestHeadersW", longArrayOf(hrequest, lpszheaders, dwheaderslength.toLong(), dwmodifiers.toLong())).toInt()
}

public fun HttpCheckDavComplianceA(lpszurl: PCSTR, lpszcompliancetoken: PCSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpCheckDavComplianceA", longArrayOf(lpszurl, lpszcompliancetoken, lpffound, hwnd, lpvreserved)).toInt()
}

public fun HttpCheckDavComplianceW(lpszurl: PCWSTR, lpszcompliancetoken: PCWSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpCheckDavComplianceW", longArrayOf(lpszurl, lpszcompliancetoken, lpffound, hwnd, lpvreserved)).toInt()
}

public fun HttpCloseDependencyHandle(hdependencyhandle: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "HttpCloseDependencyHandle", longArrayOf(hdependencyhandle))
}

public fun HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpDuplicateDependencyHandle", longArrayOf(hdependencyhandle, phduplicateddependencyhandle)).toUInt()
}

public fun HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpEndRequestA", longArrayOf(hrequest, lpbuffersout, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpEndRequestW", longArrayOf(hrequest, lpbuffersout, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun HttpGetServerCredentials(pwszurl: PCWSTR, ppwszusername: Long, ppwszpassword: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpGetServerCredentials", longArrayOf(pwszurl, ppwszusername, ppwszpassword)).toUInt()
}

public fun HttpIndicatePageLoadComplete(hdependencyhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpIndicatePageLoadComplete", longArrayOf(hdependencyhandle)).toUInt()
}

public fun HttpIsHostHstsEnabled(pcwszurl: PCWSTR, pfishsts: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpIsHostHstsEnabled", longArrayOf(pcwszurl, pfishsts)).toUInt()
}

public fun HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: BOOL, phdependencyhandle: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpOpenDependencyHandle", longArrayOf(hrequesthandle, fbackground.toLong(), phdependencyhandle)).toUInt()
}

public fun HttpOpenRequestA(hconnect: Long, lpszverb: PCSTR, lpszobjectname: PCSTR, lpszversion: PCSTR, lpszreferrer: PCSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpOpenRequestA", longArrayOf(hconnect, lpszverb, lpszobjectname, lpszversion, lpszreferrer, lplpszaccepttypes, dwflags.toLong(), dwcontext.toLong()))
}

public fun HttpOpenRequestW(hconnect: Long, lpszverb: PCWSTR, lpszobjectname: PCWSTR, lpszversion: PCWSTR, lpszreferrer: PCWSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpOpenRequestW", longArrayOf(hconnect, lpszverb, lpszobjectname, lpszversion, lpszreferrer, lplpszaccepttypes, dwflags.toLong(), dwcontext.toLong()))
}

public fun HttpPushClose(hwait: HTTP_PUSH_WAIT_HANDLE) {
    Win32DynamicFfi.invoke("wininet.dll", "HttpPushClose", longArrayOf(hwait))
}

public fun HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpPushEnable", longArrayOf(hrequest, ptransportsetting, phwait)).toUInt()
}

public fun HttpPushWait(hwait: HTTP_PUSH_WAIT_HANDLE, etype: HTTP_PUSH_WAIT_TYPE, pnotificationstatus: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpPushWait", longArrayOf(hwait, etype.toLong(), pnotificationstatus)).toUInt()
}

public fun HttpQueryInfoA(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpQueryInfoA", longArrayOf(hrequest, dwinfolevel.toLong(), lpbuffer, lpdwbufferlength, lpdwindex)).toInt()
}

public fun HttpQueryInfoW(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpQueryInfoW", longArrayOf(hrequest, dwinfolevel.toLong(), lpbuffer, lpdwbufferlength, lpdwindex)).toInt()
}

public fun HttpSendRequestA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpSendRequestA", longArrayOf(hrequest, lpszheaders, dwheaderslength.toLong(), lpoptional, dwoptionallength.toLong())).toInt()
}

public fun HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpSendRequestExA", longArrayOf(hrequest, lpbuffersin, lpbuffersout, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpSendRequestExW", longArrayOf(hrequest, lpbuffersin, lpbuffersout, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun HttpSendRequestW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpSendRequestW", longArrayOf(hrequest, lpszheaders, dwheaderslength.toLong(), lpoptional, dwoptionallength.toLong())).toInt()
}

public fun HttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpWebSocketClose", longArrayOf(hwebsocket, usstatus.toLong(), pvreason, dwreasonlength.toLong())).toInt()
}

public fun HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpWebSocketCompleteUpgrade", longArrayOf(hrequest, dwcontext.toLong()))
}

public fun HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpWebSocketQueryCloseStatus", longArrayOf(hwebsocket, pusstatus, pvreason, dwreasonlength.toLong(), pdwreasonlengthconsumed)).toInt()
}

public fun HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pbuffertype: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpWebSocketReceive", longArrayOf(hwebsocket, pvbuffer, dwbufferlength.toLong(), pdwbytesread, pbuffertype)).toInt()
}

public fun HttpWebSocketSend(hwebsocket: Long, buffertype: HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpWebSocketSend", longArrayOf(hwebsocket, buffertype.toLong(), pvbuffer, dwbufferlength.toLong())).toInt()
}

public fun HttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "HttpWebSocketShutdown", longArrayOf(hwebsocket, usstatus.toLong(), pvreason, dwreasonlength.toLong())).toInt()
}

public fun ImportCookieFileA(szfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ImportCookieFileA", longArrayOf(szfilename)).toInt()
}

public fun ImportCookieFileW(szfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ImportCookieFileW", longArrayOf(szfilename)).toInt()
}

public fun IncrementUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IncrementUrlCacheHeaderData", longArrayOf(nidx.toLong(), lpdwdata)).toInt()
}

public fun InternalInternetGetCookie(lpszurl: PCSTR, lpszcookiedata: PSTR, lpdwdatasize: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternalInternetGetCookie", longArrayOf(lpszurl, lpszcookiedata, lpdwdatasize)).toUInt()
}

public fun InternetAlgIdToStringA(ai: ALG_ID, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetAlgIdToStringA", longArrayOf(ai.toLong(), lpstr, lpdwstrlength, dwreserved.toLong())).toInt()
}

public fun InternetAlgIdToStringW(ai: ALG_ID, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetAlgIdToStringW", longArrayOf(ai.toLong(), lpstr, lpdwstrlength, dwreserved.toLong())).toInt()
}

public fun InternetAttemptConnect(dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetAttemptConnect", longArrayOf(dwreserved.toLong())).toUInt()
}

public fun InternetAutodial(dwflags: INTERNET_AUTODIAL, hwndparent: HWND): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetAutodial", longArrayOf(dwflags.toLong(), hwndparent)).toInt()
}

public fun InternetAutodialHangup(dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetAutodialHangup", longArrayOf(dwreserved.toLong())).toInt()
}

public fun InternetCanonicalizeUrlA(lpszurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCanonicalizeUrlA", longArrayOf(lpszurl, lpszbuffer, lpdwbufferlength, dwflags.toLong())).toInt()
}

public fun InternetCanonicalizeUrlW(lpszurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCanonicalizeUrlW", longArrayOf(lpszurl, lpszbuffer, lpdwbufferlength, dwflags.toLong())).toInt()
}

public fun InternetCheckConnectionA(lpszurl: PCSTR, dwflags: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCheckConnectionA", longArrayOf(lpszurl, dwflags.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetCheckConnectionW(lpszurl: PCWSTR, dwflags: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCheckConnectionW", longArrayOf(lpszurl, dwflags.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetClearAllPerSiteCookieDecisions(): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetClearAllPerSiteCookieDecisions", longArrayOf()).toInt()
}

public fun InternetCloseHandle(hinternet: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCloseHandle", longArrayOf(hinternet)).toInt()
}

public fun InternetCombineUrlA(lpszbaseurl: PCSTR, lpszrelativeurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCombineUrlA", longArrayOf(lpszbaseurl, lpszrelativeurl, lpszbuffer, lpdwbufferlength, dwflags.toLong())).toInt()
}

public fun InternetCombineUrlW(lpszbaseurl: PCWSTR, lpszrelativeurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCombineUrlW", longArrayOf(lpszbaseurl, lpszrelativeurl, lpszbuffer, lpdwbufferlength, dwflags.toLong())).toInt()
}

public fun InternetConfirmZoneCrossing(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetConfirmZoneCrossing", longArrayOf(hwnd, szurlprev, szurlnew, bpost.toLong())).toUInt()
}

public fun InternetConfirmZoneCrossingA(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetConfirmZoneCrossingA", longArrayOf(hwnd, szurlprev, szurlnew, bpost.toLong())).toUInt()
}

public fun InternetConfirmZoneCrossingW(hwnd: HWND, szurlprev: PCWSTR, szurlnew: PCWSTR, bpost: BOOL): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetConfirmZoneCrossingW", longArrayOf(hwnd, szurlprev, szurlnew, bpost.toLong())).toUInt()
}

public fun InternetConnectA(hinternet: Long, lpszservername: PCSTR, nserverport: UShort, lpszusername: PCSTR, lpszpassword: PCSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetConnectA", longArrayOf(hinternet, lpszservername, nserverport.toLong(), lpszusername, lpszpassword, dwservice.toLong(), dwflags.toLong(), dwcontext.toLong()))
}

public fun InternetConnectW(hinternet: Long, lpszservername: PCWSTR, nserverport: UShort, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetConnectW", longArrayOf(hinternet, lpszservername, nserverport.toLong(), lpszusername, lpszpassword, dwservice.toLong(), dwflags.toLong(), dwcontext.toLong()))
}

public fun InternetConvertUrlFromWireToWideChar(pcszurl: PCSTR, cchurl: UInt, pcwszbaseurl: PCWSTR, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: BOOL, dwcodepageextra: UInt, ppwszconvertedurl: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetConvertUrlFromWireToWideChar", longArrayOf(pcszurl, cchurl.toLong(), pcwszbaseurl, dwcodepagehost.toLong(), dwcodepagepath.toLong(), fencodepathextra.toLong(), dwcodepageextra.toLong(), ppwszconvertedurl)).toUInt()
}

public fun InternetCrackUrlA(lpszurl: PCSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCrackUrlA", longArrayOf(lpszurl, dwurllength.toLong(), dwflags.toLong(), lpurlcomponents)).toInt()
}

public fun InternetCrackUrlW(lpszurl: PCWSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCrackUrlW", longArrayOf(lpszurl, dwurllength.toLong(), dwflags.toLong(), lpurlcomponents)).toInt()
}

public fun InternetCreateUrlA(lpurlcomponents: Long, dwflags: UInt, lpszurl: PSTR, lpdwurllength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCreateUrlA", longArrayOf(lpurlcomponents, dwflags.toLong(), lpszurl, lpdwurllength)).toInt()
}

public fun InternetCreateUrlW(lpurlcomponents: Long, dwflags: UInt, lpszurl: PWSTR, lpdwurllength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetCreateUrlW", longArrayOf(lpurlcomponents, dwflags.toLong(), lpszurl, lpdwurllength)).toInt()
}

public fun InternetDial(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetDial", longArrayOf(hwndparent, lpszconnectoid, dwflags.toLong(), lpdwconnection, dwreserved.toLong())).toUInt()
}

public fun InternetDialA(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetDialA", longArrayOf(hwndparent, lpszconnectoid, dwflags.toLong(), lpdwconnection, dwreserved.toLong())).toUInt()
}

public fun InternetDialW(hwndparent: HWND, lpszconnectoid: PCWSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetDialW", longArrayOf(hwndparent, lpszconnectoid, dwflags.toLong(), lpdwconnection, dwreserved.toLong())).toUInt()
}

public fun InternetEnumPerSiteCookieDecisionA(pszsitename: PSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetEnumPerSiteCookieDecisionA", longArrayOf(pszsitename, pcsitenamesize, pdwdecision, dwindex.toLong())).toInt()
}

public fun InternetEnumPerSiteCookieDecisionW(pszsitename: PWSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetEnumPerSiteCookieDecisionW", longArrayOf(pszsitename, pcsitenamesize, pdwdecision, dwindex.toLong())).toInt()
}

public fun InternetErrorDlg(hwnd: HWND, hrequest: Long, dwerror: UInt, dwflags: UInt, lppvdata: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetErrorDlg", longArrayOf(hwnd, hrequest, dwerror.toLong(), dwflags.toLong(), lppvdata)).toUInt()
}

public fun InternetFindNextFileA(hfind: Long, lpvfinddata: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetFindNextFileA", longArrayOf(hfind, lpvfinddata)).toInt()
}

public fun InternetFindNextFileW(hfind: Long, lpvfinddata: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetFindNextFileW", longArrayOf(hfind, lpvfinddata)).toInt()
}

public fun InternetFortezzaCommand(dwcommand: UInt, hwnd: HWND, dwreserved: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetFortezzaCommand", longArrayOf(dwcommand.toLong(), hwnd, dwreserved.toLong())).toInt()
}

public fun InternetFreeCookies(pcookies: Long, dwcookiecount: UInt) {
    Win32DynamicFfi.invoke("wininet.dll", "InternetFreeCookies", longArrayOf(pcookies, dwcookiecount.toLong()))
}

public fun InternetFreeProxyInfoList(pproxyinfolist: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "InternetFreeProxyInfoList", longArrayOf(pproxyinfolist))
}

public fun InternetGetConnectedState(lpdwflags: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetConnectedState", longArrayOf(lpdwflags, dwreserved.toLong())).toInt()
}

public fun InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: PSTR, dwnamelen: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetConnectedStateEx", longArrayOf(lpdwflags, lpszconnectionname, dwnamelen.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: PSTR, cchnamelen: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetConnectedStateExA", longArrayOf(lpdwflags, lpszconnectionname, cchnamelen.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: PWSTR, cchnamelen: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetConnectedStateExW", longArrayOf(lpdwflags, lpszconnectionname, cchnamelen.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetGetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PSTR, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetCookieA", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize)).toInt()
}

public fun InternetGetCookieEx2(pcwszurl: PCWSTR, pcwszcookiename: PCWSTR, dwflags: UInt, ppcookies: Long, pdwcookiecount: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetCookieEx2", longArrayOf(pcwszurl, pcwszcookiename, dwflags.toLong(), ppcookies, pdwcookiecount)).toUInt()
}

public fun InternetGetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetCookieExA", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize, dwflags.toLong(), lpreserved)).toInt()
}

public fun InternetGetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetCookieExW", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize, dwflags.toLong(), lpreserved)).toInt()
}

public fun InternetGetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, lpdwsize: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetCookieW", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize)).toInt()
}

public fun InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: PSTR, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetLastResponseInfoA", longArrayOf(lpdwerror, lpszbuffer, lpdwbufferlength)).toInt()
}

public fun InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: PWSTR, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetLastResponseInfoW", longArrayOf(lpdwerror, lpszbuffer, lpdwbufferlength)).toInt()
}

public fun InternetGetPerSiteCookieDecisionA(pchhostname: PCSTR, presult: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetPerSiteCookieDecisionA", longArrayOf(pchhostname, presult)).toInt()
}

public fun InternetGetPerSiteCookieDecisionW(pchhostname: PCWSTR, presult: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetPerSiteCookieDecisionW", longArrayOf(pchhostname, presult)).toInt()
}

public fun InternetGetProxyForUrl(hinternet: Long, pcwszurl: PCWSTR, pproxyinfolist: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetProxyForUrl", longArrayOf(hinternet, pcwszurl, pproxyinfolist)).toUInt()
}

public fun InternetGetSecurityInfoByURL(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetSecurityInfoByURL", longArrayOf(lpszurl, ppcertchain, pdwsecureflags)).toInt()
}

public fun InternetGetSecurityInfoByURLA(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetSecurityInfoByURLA", longArrayOf(lpszurl, ppcertchain, pdwsecureflags)).toInt()
}

public fun InternetGetSecurityInfoByURLW(lpszurl: PCWSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGetSecurityInfoByURLW", longArrayOf(lpszurl, ppcertchain, pdwsecureflags)).toInt()
}

public fun InternetGoOnline(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGoOnline", longArrayOf(lpszurl, hwndparent, dwflags.toLong())).toInt()
}

public fun InternetGoOnlineA(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGoOnlineA", longArrayOf(lpszurl, hwndparent, dwflags.toLong())).toInt()
}

public fun InternetGoOnlineW(lpszurl: PCWSTR, hwndparent: HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetGoOnlineW", longArrayOf(lpszurl, hwndparent, dwflags.toLong())).toInt()
}

public fun InternetHangUp(dwconnection: ULong, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetHangUp", longArrayOf(dwconnection.toLong(), dwreserved.toLong())).toUInt()
}

public fun InternetInitializeAutoProxyDll(dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetInitializeAutoProxyDll", longArrayOf(dwreserved.toLong())).toInt()
}

public fun InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetLockRequestFile", longArrayOf(hinternet, lphlockrequestinfo)).toInt()
}

public fun InternetOpenA(lpszagent: PCSTR, dwaccesstype: UInt, lpszproxy: PCSTR, lpszproxybypass: PCSTR, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetOpenA", longArrayOf(lpszagent, dwaccesstype.toLong(), lpszproxy, lpszproxybypass, dwflags.toLong()))
}

public fun InternetOpenUrlA(hinternet: Long, lpszurl: PCSTR, lpszheaders: PCSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetOpenUrlA", longArrayOf(hinternet, lpszurl, lpszheaders, dwheaderslength.toLong(), dwflags.toLong(), dwcontext.toLong()))
}

public fun InternetOpenUrlW(hinternet: Long, lpszurl: PCWSTR, lpszheaders: PCWSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetOpenUrlW", longArrayOf(hinternet, lpszurl, lpszheaders, dwheaderslength.toLong(), dwflags.toLong(), dwcontext.toLong()))
}

public fun InternetOpenW(lpszagent: PCWSTR, dwaccesstype: UInt, lpszproxy: PCWSTR, lpszproxybypass: PCWSTR, dwflags: UInt): Long {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetOpenW", longArrayOf(lpszagent, dwaccesstype.toLong(), lpszproxy, lpszproxybypass, dwflags.toLong()))
}

public fun InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetQueryDataAvailable", longArrayOf(hfile, lpdwnumberofbytesavailable, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetQueryFortezzaStatus", longArrayOf(pdwstatus, dwreserved.toLong())).toInt()
}

public fun InternetQueryOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetQueryOptionA", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, lpdwbufferlength)).toInt()
}

public fun InternetQueryOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetQueryOptionW", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, lpdwbufferlength)).toInt()
}

public fun InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetReadFile", longArrayOf(hfile, lpbuffer, dwnumberofbytestoread.toLong(), lpdwnumberofbytesread)).toInt()
}

public fun InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetReadFileExA", longArrayOf(hfile, lpbuffersout, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetReadFileExW", longArrayOf(hfile, lpbuffersout, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun InternetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSecurityProtocolToStringA", longArrayOf(dwprotocol.toLong(), lpstr, lpdwstrlength, dwreserved.toLong())).toInt()
}

public fun InternetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSecurityProtocolToStringW", longArrayOf(dwprotocol.toLong(), lpstr, lpdwstrlength, dwreserved.toLong())).toInt()
}

public fun InternetSetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetCookieA", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata)).toInt()
}

public fun InternetSetCookieEx2(pcwszurl: PCWSTR, pcookie: Long, pcwszp3ppolicy: PCWSTR, dwflags: UInt, pdwcookiestate: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetCookieEx2", longArrayOf(pcwszurl, pcookie, pcwszp3ppolicy, dwflags.toLong(), pdwcookiestate)).toUInt()
}

public fun InternetSetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, dwflags: UInt, dwreserved: ULong): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetCookieExA", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, dwflags.toLong(), dwreserved.toLong())).toUInt()
}

public fun InternetSetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt, dwreserved: ULong): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetCookieExW", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata, dwflags.toLong(), dwreserved.toLong())).toUInt()
}

public fun InternetSetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetCookieW", longArrayOf(lpszurl, lpszcookiename, lpszcookiedata)).toInt()
}

public fun InternetSetDialState(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetDialState", longArrayOf(lpszconnectoid, dwstate.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetSetDialStateA(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetDialStateA", longArrayOf(lpszconnectoid, dwstate.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetSetDialStateW(lpszconnectoid: PCWSTR, dwstate: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetDialStateW", longArrayOf(lpszconnectoid, dwstate.toLong(), dwreserved.toLong())).toInt()
}

public fun InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: UInt, dwcontext: ULong): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetFilePointer", longArrayOf(hfile, ldistancetomove.toLong(), lpdistancetomovehigh, dwmovemethod.toLong(), dwcontext.toLong())).toUInt()
}

public fun InternetSetOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetOptionA", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, dwbufferlength.toLong())).toInt()
}

public fun InternetSetOptionExA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetOptionExA", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, dwbufferlength.toLong(), dwflags.toLong())).toInt()
}

public fun InternetSetOptionExW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetOptionExW", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, dwbufferlength.toLong(), dwflags.toLong())).toInt()
}

public fun InternetSetOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetOptionW", longArrayOf(hinternet, dwoption.toLong(), lpbuffer, dwbufferlength.toLong())).toInt()
}

public fun InternetSetPerSiteCookieDecisionA(pchhostname: PCSTR, dwdecision: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetPerSiteCookieDecisionA", longArrayOf(pchhostname, dwdecision.toLong())).toInt()
}

public fun InternetSetPerSiteCookieDecisionW(pchhostname: PCWSTR, dwdecision: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetSetPerSiteCookieDecisionW", longArrayOf(pchhostname, dwdecision.toLong())).toInt()
}

public fun InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK {
    val rawRet = Win32DynamicFfi.invoke("wininet.dll", "InternetSetStatusCallback", longArrayOf(hinternet, Win32DynamicFfi.objectSlot(lpfninternetcallback)))
    return if (rawRet == 0L) null else LPINTERNET_STATUS_CALLBACKFn { p0, p1, p2, p3, p4 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1.toLong(), p2.toLong(), p3, p4.toLong())) }
}

public fun InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK {
    val rawRet = Win32DynamicFfi.invoke("wininet.dll", "InternetSetStatusCallbackA", longArrayOf(hinternet, Win32DynamicFfi.objectSlot(lpfninternetcallback)))
    return if (rawRet == 0L) null else LPINTERNET_STATUS_CALLBACKFn { p0, p1, p2, p3, p4 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1.toLong(), p2.toLong(), p3, p4.toLong())) }
}

public fun InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK {
    val rawRet = Win32DynamicFfi.invoke("wininet.dll", "InternetSetStatusCallbackW", longArrayOf(hinternet, Win32DynamicFfi.objectSlot(lpfninternetcallback)))
    return if (rawRet == 0L) null else LPINTERNET_STATUS_CALLBACKFn { p0, p1, p2, p3, p4 -> Win32DynamicFfi.invokePtr(rawRet, longArrayOf(p0, p1.toLong(), p2.toLong(), p3, p4.toLong())) }
}

public fun InternetShowSecurityInfoByURL(lpszurl: PCSTR, hwndparent: HWND): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetShowSecurityInfoByURL", longArrayOf(lpszurl, hwndparent)).toInt()
}

public fun InternetShowSecurityInfoByURLA(lpszurl: PCSTR, hwndparent: HWND): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetShowSecurityInfoByURLA", longArrayOf(lpszurl, hwndparent)).toInt()
}

public fun InternetShowSecurityInfoByURLW(lpszurl: PCWSTR, hwndparent: HWND): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetShowSecurityInfoByURLW", longArrayOf(lpszurl, hwndparent)).toInt()
}

public fun InternetTimeFromSystemTime(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetTimeFromSystemTime", longArrayOf(pst, dwrfc.toLong(), lpsztime, cbtime.toLong())).toInt()
}

public fun InternetTimeFromSystemTimeA(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetTimeFromSystemTimeA", longArrayOf(pst, dwrfc.toLong(), lpsztime, cbtime.toLong())).toInt()
}

public fun InternetTimeFromSystemTimeW(pst: Long, dwrfc: UInt, lpsztime: PWSTR, cbtime: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetTimeFromSystemTimeW", longArrayOf(pst, dwrfc.toLong(), lpsztime, cbtime.toLong())).toInt()
}

public fun InternetTimeToSystemTime(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetTimeToSystemTime", longArrayOf(lpsztime, pst, dwreserved.toLong())).toInt()
}

public fun InternetTimeToSystemTimeA(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetTimeToSystemTimeA", longArrayOf(lpsztime, pst, dwreserved.toLong())).toInt()
}

public fun InternetTimeToSystemTimeW(lpsztime: PCWSTR, pst: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetTimeToSystemTimeW", longArrayOf(lpsztime, pst, dwreserved.toLong())).toInt()
}

public fun InternetUnlockRequestFile(hlockrequestinfo: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetUnlockRequestFile", longArrayOf(hlockrequestinfo)).toInt()
}

public fun InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetWriteFile", longArrayOf(hfile, lpbuffer, dwnumberofbytestowrite.toLong(), lpdwnumberofbyteswritten)).toInt()
}

public fun InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetWriteFileExA", longArrayOf(hfile, lpbuffersin, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "InternetWriteFileExW", longArrayOf(hfile, lpbuffersin, dwflags.toLong(), dwcontext.toLong())).toInt()
}

public fun IsDomainLegalCookieDomainA(pchdomain: PCSTR, pchfulldomain: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IsDomainLegalCookieDomainA", longArrayOf(pchdomain, pchfulldomain)).toInt()
}

public fun IsDomainLegalCookieDomainW(pchdomain: PCWSTR, pchfulldomain: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IsDomainLegalCookieDomainW", longArrayOf(pchdomain, pchfulldomain)).toInt()
}

public fun IsHostInProxyBypassList(tscheme: INTERNET_SCHEME, lpszhost: PCSTR, cchhost: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IsHostInProxyBypassList", longArrayOf(tscheme.toLong(), lpszhost, cchhost.toLong())).toInt()
}

public fun IsProfilesEnabled(): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IsProfilesEnabled", longArrayOf()).toInt()
}

public fun IsUrlCacheEntryExpiredA(lpszurlname: PCSTR, dwflags: UInt, pftlastmodified: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IsUrlCacheEntryExpiredA", longArrayOf(lpszurlname, dwflags.toLong(), pftlastmodified)).toInt()
}

public fun IsUrlCacheEntryExpiredW(lpszurlname: PCWSTR, dwflags: UInt, pftlastmodified: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "IsUrlCacheEntryExpiredW", longArrayOf(lpszurlname, dwflags.toLong(), pftlastmodified)).toInt()
}

public fun LoadUrlCacheContent(): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "LoadUrlCacheContent", longArrayOf()).toInt()
}

public fun ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: UInt, lpszlistboxentry: PSTR, lpdwlistboxentry: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "ParseX509EncodedCertificateForListBoxEntry", longArrayOf(lpcert, cbcert.toLong(), lpszlistboxentry, lpdwlistboxentry)).toUInt()
}

public fun PerformOperationOverUrlCacheA(pszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: CACHE_OPERATOR, poperatordata: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "PerformOperationOverUrlCacheA", longArrayOf(pszurlsearchpattern, dwflags.toLong(), dwfilter.toLong(), groupid, preserved1, pdwreserved2, preserved3, Win32DynamicFfi.objectSlot(op), poperatordata)).toInt()
}

public fun PrivacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: Long, pszbuffer: PWSTR, pdwbufferlength: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "PrivacyGetZonePreferenceW", longArrayOf(dwzone.toLong(), dwtype.toLong(), pdwtemplate, pszbuffer, pdwbufferlength)).toUInt()
}

public fun PrivacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "PrivacySetZonePreferenceW", longArrayOf(dwzone.toLong(), dwtype.toLong(), dwtemplate.toLong(), pszpreference)).toUInt()
}

public fun ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ReadGuidsForConnectedNetworks", longArrayOf(pcnetworks, pppwsznetworkguids, pppbstrnetworknames, pppwszgwmacs, pcgatewaymacs, pdwflags)).toInt()
}

public fun ReadUrlCacheEntryStream(hurlcachestream: HANDLE, dwlocation: UInt, lpbuffer: Long, lpdwlen: Long, reserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ReadUrlCacheEntryStream", longArrayOf(hurlcachestream, dwlocation.toLong(), lpbuffer, lpdwlen, reserved.toLong())).toInt()
}

public fun ReadUrlCacheEntryStreamEx(hurlcachestream: HANDLE, qwlocation: ULong, lpbuffer: Long, lpdwlen: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ReadUrlCacheEntryStreamEx", longArrayOf(hurlcachestream, qwlocation.toLong(), lpbuffer, lpdwlen)).toInt()
}

public fun RegisterUrlCacheNotification(hwnd: HWND, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "RegisterUrlCacheNotification", longArrayOf(hwnd, umsg.toLong(), gid, dwopsfilter.toLong(), dwreserved.toLong())).toInt()
}

public fun ResumeSuspendedDownload(hrequest: Long, dwresultcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "ResumeSuspendedDownload", longArrayOf(hrequest, dwresultcode.toLong())).toInt()
}

public fun RetrieveUrlCacheEntryFileA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "RetrieveUrlCacheEntryFileA", longArrayOf(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, dwreserved.toLong())).toInt()
}

public fun RetrieveUrlCacheEntryFileW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "RetrieveUrlCacheEntryFileW", longArrayOf(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, dwreserved.toLong())).toInt()
}

public fun RetrieveUrlCacheEntryStreamA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "RetrieveUrlCacheEntryStreamA", longArrayOf(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, frandomread.toLong(), dwreserved.toLong()))
}

public fun RetrieveUrlCacheEntryStreamW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE {
    return Win32DynamicFfi.invoke("wininet.dll", "RetrieveUrlCacheEntryStreamW", longArrayOf(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, frandomread.toLong(), dwreserved.toLong()))
}

public fun RunOnceUrlCache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "RunOnceUrlCache", longArrayOf(hwnd, hinst, lpszcmd, ncmdshow.toLong())).toUInt()
}

public fun SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheConfigInfoA", longArrayOf(lpcacheconfiginfo, dwfieldcontrol.toLong())).toInt()
}

public fun SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheConfigInfoW", longArrayOf(lpcacheconfiginfo, dwfieldcontrol.toLong())).toInt()
}

public fun SetUrlCacheEntryGroup(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheEntryGroup", longArrayOf(lpszurlname, dwflags.toLong(), groupid, pbgroupattributes, cbgroupattributes.toLong(), lpreserved)).toInt()
}

public fun SetUrlCacheEntryGroupA(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheEntryGroupA", longArrayOf(lpszurlname, dwflags.toLong(), groupid, pbgroupattributes, cbgroupattributes.toLong(), lpreserved)).toInt()
}

public fun SetUrlCacheEntryGroupW(lpszurlname: PCWSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheEntryGroupW", longArrayOf(lpszurlname, dwflags.toLong(), groupid, pbgroupattributes, cbgroupattributes.toLong(), lpreserved)).toInt()
}

public fun SetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheEntryInfoA", longArrayOf(lpszurlname, lpcacheentryinfo, dwfieldcontrol.toLong())).toInt()
}

public fun SetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheEntryInfoW", longArrayOf(lpszurlname, lpcacheentryinfo, dwfieldcontrol.toLong())).toInt()
}

public fun SetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheGroupAttributeA", longArrayOf(gid, dwflags.toLong(), dwattributes.toLong(), lpgroupinfo, lpreserved)).toInt()
}

public fun SetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheGroupAttributeW", longArrayOf(gid, dwflags.toLong(), dwattributes.toLong(), lpgroupinfo, lpreserved)).toInt()
}

public fun SetUrlCacheHeaderData(nidx: UInt, dwdata: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "SetUrlCacheHeaderData", longArrayOf(nidx.toLong(), dwdata.toLong())).toInt()
}

public fun ShowClientAuthCerts(hwndparent: HWND): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "ShowClientAuthCerts", longArrayOf(hwndparent)).toUInt()
}

public fun ShowSecurityInfo(hwndparent: HWND, psecurityinfo: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "ShowSecurityInfo", longArrayOf(hwndparent, psecurityinfo)).toUInt()
}

public fun ShowX509EncodedCertificate(hwndparent: HWND, lpcert: Long, cbcert: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "ShowX509EncodedCertificate", longArrayOf(hwndparent, lpcert, cbcert.toLong())).toUInt()
}

public fun UnlockUrlCacheEntryFile(lpszurlname: PCSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "UnlockUrlCacheEntryFile", longArrayOf(lpszurlname, dwreserved.toLong())).toInt()
}

public fun UnlockUrlCacheEntryFileA(lpszurlname: PCSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "UnlockUrlCacheEntryFileA", longArrayOf(lpszurlname, dwreserved.toLong())).toInt()
}

public fun UnlockUrlCacheEntryFileW(lpszurlname: PCWSTR, dwreserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "UnlockUrlCacheEntryFileW", longArrayOf(lpszurlname, dwreserved.toLong())).toInt()
}

public fun UnlockUrlCacheEntryStream(hurlcachestream: HANDLE, reserved: UInt): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "UnlockUrlCacheEntryStream", longArrayOf(hurlcachestream, reserved.toLong())).toInt()
}

public fun UpdateUrlCacheContentPath(sznewpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("wininet.dll", "UpdateUrlCacheContentPath", longArrayOf(sznewpath)).toInt()
}

public fun UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: UInt, rgfexist: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheCheckEntriesExist", longArrayOf(rgpwszurls, centries.toLong(), rgfexist)).toUInt()
}

public fun UrlCacheCloseEntryHandle(hentryfile: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "UrlCacheCloseEntryHandle", longArrayOf(hentryfile))
}

public fun UrlCacheContainerSetEntryMaximumAge(pwszprefix: PCWSTR, dwentrymaxage: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheContainerSetEntryMaximumAge", longArrayOf(pwszprefix, dwentrymaxage.toLong())).toUInt()
}

public fun UrlCacheCreateContainer(pwszname: PCWSTR, pwszprefix: PCWSTR, pwszdirectory: PCWSTR, ulllimit: ULong, dwoptions: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheCreateContainer", longArrayOf(pwszname, pwszprefix, pwszdirectory, ulllimit.toLong(), dwoptions.toLong())).toUInt()
}

public fun UrlCacheFindFirstEntry(pwszprefix: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: Long, phfind: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheFindFirstEntry", longArrayOf(pwszprefix, dwflags.toLong(), dwfilter.toLong(), groupid, pcacheentryinfo, phfind)).toUInt()
}

public fun UrlCacheFindNextEntry(hfind: HANDLE, pcacheentryinfo: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheFindNextEntry", longArrayOf(hfind, pcacheentryinfo)).toUInt()
}

public fun UrlCacheFreeEntryInfo(pcacheentryinfo: Long) {
    Win32DynamicFfi.invoke("wininet.dll", "UrlCacheFreeEntryInfo", longArrayOf(pcacheentryinfo))
}

public fun UrlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheFreeGlobalSpace", longArrayOf(ulltargetsize.toLong(), dwfilter.toLong())).toUInt()
}

public fun UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheGetContentPaths", longArrayOf(pppwszdirectories, pcdirectories)).toUInt()
}

public fun UrlCacheGetEntryInfo(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheGetEntryInfo", longArrayOf(happcache, pcwszurl, pcacheentryinfo)).toUInt()
}

public fun UrlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: Long, pulllimit: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheGetGlobalCacheSize", longArrayOf(dwfilter.toLong(), pullsize, pulllimit)).toUInt()
}

public fun UrlCacheGetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, pulllimit: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheGetGlobalLimit", longArrayOf(limittype.toLong(), pulllimit)).toUInt()
}

public fun UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: ULong, pbuffer: Long, dwbufferlen: UInt, pdwbufferlen: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheReadEntryStream", longArrayOf(hurlcachestream, ulllocation.toLong(), pbuffer, dwbufferlen.toLong(), pdwbufferlen)).toUInt()
}

public fun UrlCacheReloadSettings(): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheReloadSettings", longArrayOf()).toUInt()
}

public fun UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long, phentryfile: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheRetrieveEntryFile", longArrayOf(happcache, pcwszurl, pcacheentryinfo, phentryfile)).toUInt()
}

public fun UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: PCWSTR, frandomread: BOOL, pcacheentryinfo: Long, phentrystream: Long): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheRetrieveEntryStream", longArrayOf(happcache, pcwszurl, frandomread.toLong(), pcacheentryinfo, phentrystream)).toUInt()
}

public fun UrlCacheServer(): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheServer", longArrayOf()).toUInt()
}

public fun UrlCacheSetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, ulllimit: ULong): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheSetGlobalLimit", longArrayOf(limittype.toLong(), ulllimit.toLong())).toUInt()
}

public fun UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: PCWSTR, pbextradata: Long, cbextradata: UInt): UInt {
    return Win32DynamicFfi.invoke("wininet.dll", "UrlCacheUpdateEntryExtraData", longArrayOf(happcache, pcwszurl, pbextradata, cbextradata.toLong())).toUInt()
}

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

public actual fun AppCacheCheckManifest(pwszmasterurl: PCWSTR, pwszmanifesturl: PCWSTR, pbmanifestdata: Long, dwmanifestdatasize: UInt, pbmanifestresponseheaders: Long, dwmanifestresponseheaderssize: UInt, pestate: Long, phnewappcache: Long): UInt =
    0u

public actual fun AppCacheCloseHandle(happcache: Long) {
}

public actual fun AppCacheCreateAndCommitFile(happcache: Long, pwszsourcefilepath: PCWSTR, pwszurl: PCWSTR, pbresponseheaders: Long, dwresponseheaderssize: UInt): UInt =
    0u

public actual fun AppCacheDeleteGroup(pwszmanifesturl: PCWSTR): UInt =
    0u

public actual fun AppCacheDeleteIEGroup(pwszmanifesturl: PCWSTR): UInt =
    0u

public actual fun AppCacheDuplicateHandle(happcache: Long, phduplicatedappcache: Long): UInt =
    0u

public actual fun AppCacheFinalize(happcache: Long, pbmanifestdata: Long, dwmanifestdatasize: UInt, pestate: Long): UInt =
    0u

public actual fun AppCacheFreeDownloadList(pdownloadlist: Long) {
}

public actual fun AppCacheFreeGroupList(pappcachegrouplist: Long) {
}

public actual fun AppCacheFreeIESpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheFreeSpace(ftcutoff: FILETIME): UInt =
    0u

public actual fun AppCacheGetDownloadList(happcache: Long, pdownloadlist: Long): UInt =
    0u

public actual fun AppCacheGetFallbackUrl(happcache: Long, pwszurl: PCWSTR, ppwszfallbackurl: Long): UInt =
    0u

public actual fun AppCacheGetGroupList(pappcachegrouplist: Long): UInt =
    0u

public actual fun AppCacheGetIEGroupList(pappcachegrouplist: Long): UInt =
    0u

public actual fun AppCacheGetInfo(happcache: Long, pappcacheinfo: Long): UInt =
    0u

public actual fun AppCacheGetManifestUrl(happcache: Long, ppwszmanifesturl: Long): UInt =
    0u

public actual fun AppCacheLookup(pwszurl: PCWSTR, dwflags: UInt, phappcache: Long): UInt =
    0u

public actual fun CommitUrlCacheEntryA(lpszurlname: PCSTR, lpszlocalfilename: PCSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpheaderinfo: Long, cchheaderinfo: UInt, lpszfileextension: PCSTR, lpszoriginalurl: PCSTR): BOOL =
    0

public actual fun CommitUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: UInt, ftexpiretime: FILETIME, ftmodifiedtime: FILETIME, pbblob: Long, cbblob: UInt): UInt =
    0u

public actual fun CommitUrlCacheEntryW(lpszurlname: PCWSTR, lpszlocalfilename: PCWSTR, expiretime: FILETIME, lastmodifiedtime: FILETIME, cacheentrytype: UInt, lpszheaderinfo: PCWSTR, cchheaderinfo: UInt, lpszfileextension: PCWSTR, lpszoriginalurl: PCWSTR): BOOL =
    0

public actual fun CreateMD5SSOHash(pszchallengeinfo: PCWSTR, pwszrealm: PCWSTR, pwsztarget: PCWSTR, pbhexhash: Long): BOOL =
    0

public actual fun CreateUrlCacheContainerA(name: PCSTR, lpcacheprefix: PCSTR, lpszcachepath: PCSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    0

public actual fun CreateUrlCacheContainerW(name: PCWSTR, lpcacheprefix: PCWSTR, lpszcachepath: PCWSTR, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: Long, cbbuffer: Long): BOOL =
    0

public actual fun CreateUrlCacheEntryA(lpszurlname: PCSTR, dwexpectedfilesize: UInt, lpszfileextension: PCSTR, lpszfilename: PSTR, dwreserved: UInt): BOOL =
    0

public actual fun CreateUrlCacheEntryExW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt, fpreserveincomingfilename: BOOL): BOOL =
    0

public actual fun CreateUrlCacheEntryW(lpszurlname: PCWSTR, dwexpectedfilesize: UInt, lpszfileextension: PCWSTR, lpszfilename: PWSTR, dwreserved: UInt): BOOL =
    0

public actual fun CreateUrlCacheGroup(dwflags: UInt, lpreserved: Long): Long =
    0L

public actual fun DeleteIE3Cache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    0u

public actual fun DeleteUrlCacheContainerA(name: PCSTR, dwoptions: UInt): BOOL =
    0

public actual fun DeleteUrlCacheContainerW(name: PCWSTR, dwoptions: UInt): BOOL =
    0

public actual fun DeleteUrlCacheEntry(lpszurlname: PCSTR): BOOL =
    0

public actual fun DeleteUrlCacheEntryA(lpszurlname: PCSTR): BOOL =
    0

public actual fun DeleteUrlCacheEntryW(lpszurlname: PCWSTR): BOOL =
    0

public actual fun DeleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: Long): BOOL =
    0

public actual fun DeleteWpadCacheForNetworks(param0: WPAD_CACHE_DELETE): BOOL =
    0

public actual fun DetectAutoProxyUrl(pszautoproxyurl: PSTR, cchautoproxyurl: UInt, dwdetectflags: PROXY_AUTO_DETECT_TYPE): BOOL =
    0

public actual fun DoConnectoidsExist(): BOOL =
    0

public actual fun ExportCookieFileA(szfilename: PCSTR, fappend: BOOL): BOOL =
    0

public actual fun ExportCookieFileW(szfilename: PCWSTR, fappend: BOOL): BOOL =
    0

public actual fun FindCloseUrlCache(henumhandle: HANDLE): BOOL =
    0

public actual fun FindFirstUrlCacheContainerA(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    0L

public actual fun FindFirstUrlCacheContainerW(pdwmodified: Long, lpcontainerinfo: Long, lpcbcontainerinfo: Long, dwoptions: UInt): HANDLE =
    0L

public actual fun FindFirstUrlCacheEntryA(lpszurlsearchpattern: PCSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    0L

public actual fun FindFirstUrlCacheEntryExA(lpszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    0L

public actual fun FindFirstUrlCacheEntryExW(lpszurlsearchpattern: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): HANDLE =
    0L

public actual fun FindFirstUrlCacheEntryW(lpszurlsearchpattern: PCWSTR, lpfirstcacheentryinfo: Long, lpcbcacheentryinfo: Long): HANDLE =
    0L

public actual fun FindFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: Long, dwsearchcondition: UInt, lpgroupid: Long, lpreserved: Long): HANDLE =
    0L

public actual fun FindNextUrlCacheContainerA(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    0

public actual fun FindNextUrlCacheContainerW(henumhandle: HANDLE, lpcontainerinfo: Long, lpcbcontainerinfo: Long): BOOL =
    0

public actual fun FindNextUrlCacheEntryA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    0

public actual fun FindNextUrlCacheEntryExA(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    0

public actual fun FindNextUrlCacheEntryExW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpgroupattributes: Long, lpcbgroupattributes: Long, lpreserved: Long): BOOL =
    0

public actual fun FindNextUrlCacheEntryW(henumhandle: HANDLE, lpnextcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    0

public actual fun FindNextUrlCacheGroup(hfind: HANDLE, lpgroupid: Long, lpreserved: Long): BOOL =
    0

public actual fun FindP3PPolicySymbol(pszsymbol: PCSTR): Int =
    0

public actual fun FreeUrlCacheSpaceA(lpszcachepath: PCSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    0

public actual fun FreeUrlCacheSpaceW(lpszcachepath: PCWSTR, dwsize: UInt, dwfilter: UInt): BOOL =
    0

public actual fun FtpCommandA(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    0

public actual fun FtpCommandW(hconnect: Long, fexpectresponse: BOOL, dwflags: FTP_FLAGS, lpszcommand: PCWSTR, dwcontext: ULong, phftpcommand: Long): BOOL =
    0

public actual fun FtpCreateDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    0

public actual fun FtpCreateDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    0

public actual fun FtpDeleteFileA(hconnect: Long, lpszfilename: PCSTR): BOOL =
    0

public actual fun FtpDeleteFileW(hconnect: Long, lpszfilename: PCWSTR): BOOL =
    0

public actual fun FtpFindFirstFileA(hconnect: Long, lpszsearchfile: PCSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun FtpFindFirstFileW(hconnect: Long, lpszsearchfile: PCWSTR, lpfindfiledata: Long, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun FtpGetCurrentDirectoryA(hconnect: Long, lpszcurrentdirectory: PSTR, lpdwcurrentdirectory: Long): BOOL =
    0

public actual fun FtpGetCurrentDirectoryW(hconnect: Long, lpszcurrentdirectory: PWSTR, lpdwcurrentdirectory: Long): BOOL =
    0

public actual fun FtpGetFileA(hconnect: Long, lpszremotefile: PCSTR, lpsznewfile: PCSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun FtpGetFileEx(hftpsession: Long, lpszremotefile: PCSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun FtpGetFileSize(hfile: Long, lpdwfilesizehigh: Long): UInt =
    0u

public actual fun FtpGetFileW(hconnect: Long, lpszremotefile: PCWSTR, lpsznewfile: PCWSTR, ffailifexists: BOOL, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun FtpOpenFileA(hconnect: Long, lpszfilename: PCSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    0L

public actual fun FtpOpenFileW(hconnect: Long, lpszfilename: PCWSTR, dwaccess: UInt, dwflags: FTP_FLAGS, dwcontext: ULong): Long =
    0L

public actual fun FtpPutFileA(hconnect: Long, lpszlocalfile: PCSTR, lpsznewremotefile: PCSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    0

public actual fun FtpPutFileEx(hftpsession: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCSTR, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun FtpPutFileW(hconnect: Long, lpszlocalfile: PCWSTR, lpsznewremotefile: PCWSTR, dwflags: FTP_FLAGS, dwcontext: ULong): BOOL =
    0

public actual fun FtpRemoveDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    0

public actual fun FtpRemoveDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    0

public actual fun FtpRenameFileA(hconnect: Long, lpszexisting: PCSTR, lpsznew: PCSTR): BOOL =
    0

public actual fun FtpRenameFileW(hconnect: Long, lpszexisting: PCWSTR, lpsznew: PCWSTR): BOOL =
    0

public actual fun FtpSetCurrentDirectoryA(hconnect: Long, lpszdirectory: PCSTR): BOOL =
    0

public actual fun FtpSetCurrentDirectoryW(hconnect: Long, lpszdirectory: PCWSTR): BOOL =
    0

public actual fun GetDiskInfoA(pszpath: PCSTR, pdwclustersize: Long, pdlavail: Long, pdltotal: Long): BOOL =
    0

public actual fun GetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    0

public actual fun GetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, lpcbcacheconfiginfo: Long, dwfieldcontrol: CACHE_CONFIG): BOOL =
    0

public actual fun GetUrlCacheEntryBinaryBlob(pwszurlname: PCWSTR, dwtype: Long, pftexpiretime: Long, pftaccesstime: Long, pftmodifiedtime: Long, ppbblob: Long, pcbblob: Long): UInt =
    0u

public actual fun GetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    0

public actual fun GetUrlCacheEntryInfoExA(lpszurl: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    0

public actual fun GetUrlCacheEntryInfoExW(lpszurl: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, lpszredirecturl: PCWSTR, lpcbredirecturl: Long, lpreserved: Long, dwflags: UInt): BOOL =
    0

public actual fun GetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long): BOOL =
    0

public actual fun GetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    0

public actual fun GetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpcbgroupinfo: Long, lpreserved: Long): BOOL =
    0

public actual fun GetUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    0

public actual fun GopherCreateLocatorA(lpszhost: PCSTR, nserverport: UShort, lpszdisplaystring: PCSTR, lpszselectorstring: PCSTR, dwgophertype: UInt, lpszlocator: PSTR, lpdwbufferlength: Long): BOOL =
    0

public actual fun GopherCreateLocatorW(lpszhost: PCWSTR, nserverport: UShort, lpszdisplaystring: PCWSTR, lpszselectorstring: PCWSTR, dwgophertype: UInt, lpszlocator: PWSTR, lpdwbufferlength: Long): BOOL =
    0

public actual fun GopherFindFirstFileA(hconnect: Long, lpszlocator: PCSTR, lpszsearchstring: PCSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun GopherFindFirstFileW(hconnect: Long, lpszlocator: PCWSTR, lpszsearchstring: PCWSTR, lpfinddata: Long, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun GopherGetAttributeA(hconnect: Long, lpszlocator: PCSTR, lpszattributename: PCSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    0

public actual fun GopherGetAttributeW(hconnect: Long, lpszlocator: PCWSTR, lpszattributename: PCWSTR, lpbuffer: Long, dwbufferlength: UInt, lpdwcharactersreturned: Long, lpfnenumerator: GOPHER_ATTRIBUTE_ENUMERATOR, dwcontext: ULong): BOOL =
    0

public actual fun GopherGetLocatorTypeA(lpszlocator: PCSTR, lpdwgophertype: Long): BOOL =
    0

public actual fun GopherGetLocatorTypeW(lpszlocator: PCWSTR, lpdwgophertype: Long): BOOL =
    0

public actual fun GopherOpenFileA(hconnect: Long, lpszlocator: PCSTR, lpszview: PCSTR, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun GopherOpenFileW(hconnect: Long, lpszlocator: PCWSTR, lpszview: PCWSTR, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun HttpAddRequestHeadersA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    0

public actual fun HttpAddRequestHeadersW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, dwmodifiers: HTTP_ADDREQ_FLAG): BOOL =
    0

public actual fun HttpCheckDavComplianceA(lpszurl: PCSTR, lpszcompliancetoken: PCSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    0

public actual fun HttpCheckDavComplianceW(lpszurl: PCWSTR, lpszcompliancetoken: PCWSTR, lpffound: Long, hwnd: HWND, lpvreserved: Long): BOOL =
    0

public actual fun HttpCloseDependencyHandle(hdependencyhandle: Long) {
}

public actual fun HttpDuplicateDependencyHandle(hdependencyhandle: Long, phduplicateddependencyhandle: Long): UInt =
    0u

public actual fun HttpEndRequestA(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun HttpEndRequestW(hrequest: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun HttpGetServerCredentials(pwszurl: PCWSTR, ppwszusername: Long, ppwszpassword: Long): UInt =
    0u

public actual fun HttpIndicatePageLoadComplete(hdependencyhandle: Long): UInt =
    0u

public actual fun HttpIsHostHstsEnabled(pcwszurl: PCWSTR, pfishsts: Long): UInt =
    0u

public actual fun HttpOpenDependencyHandle(hrequesthandle: Long, fbackground: BOOL, phdependencyhandle: Long): UInt =
    0u

public actual fun HttpOpenRequestA(hconnect: Long, lpszverb: PCSTR, lpszobjectname: PCSTR, lpszversion: PCSTR, lpszreferrer: PCSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun HttpOpenRequestW(hconnect: Long, lpszverb: PCWSTR, lpszobjectname: PCWSTR, lpszversion: PCWSTR, lpszreferrer: PCWSTR, lplpszaccepttypes: Long, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun HttpPushClose(hwait: HTTP_PUSH_WAIT_HANDLE) {
}

public actual fun HttpPushEnable(hrequest: Long, ptransportsetting: Long, phwait: Long): UInt =
    0u

public actual fun HttpPushWait(hwait: HTTP_PUSH_WAIT_HANDLE, etype: HTTP_PUSH_WAIT_TYPE, pnotificationstatus: Long): UInt =
    0u

public actual fun HttpQueryInfoA(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    0

public actual fun HttpQueryInfoW(hrequest: Long, dwinfolevel: UInt, lpbuffer: Long, lpdwbufferlength: Long, lpdwindex: Long): BOOL =
    0

public actual fun HttpSendRequestA(hrequest: Long, lpszheaders: PCSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    0

public actual fun HttpSendRequestExA(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun HttpSendRequestExW(hrequest: Long, lpbuffersin: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun HttpSendRequestW(hrequest: Long, lpszheaders: PCWSTR, dwheaderslength: UInt, lpoptional: Long, dwoptionallength: UInt): BOOL =
    0

public actual fun HttpWebSocketClose(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    0

public actual fun HttpWebSocketCompleteUpgrade(hrequest: Long, dwcontext: ULong): Long =
    0L

public actual fun HttpWebSocketQueryCloseStatus(hwebsocket: Long, pusstatus: Long, pvreason: Long, dwreasonlength: UInt, pdwreasonlengthconsumed: Long): BOOL =
    0

public actual fun HttpWebSocketReceive(hwebsocket: Long, pvbuffer: Long, dwbufferlength: UInt, pdwbytesread: Long, pbuffertype: Long): BOOL =
    0

public actual fun HttpWebSocketSend(hwebsocket: Long, buffertype: HTTP_WEB_SOCKET_BUFFER_TYPE, pvbuffer: Long, dwbufferlength: UInt): BOOL =
    0

public actual fun HttpWebSocketShutdown(hwebsocket: Long, usstatus: UShort, pvreason: Long, dwreasonlength: UInt): BOOL =
    0

public actual fun ImportCookieFileA(szfilename: PCSTR): BOOL =
    0

public actual fun ImportCookieFileW(szfilename: PCWSTR): BOOL =
    0

public actual fun IncrementUrlCacheHeaderData(nidx: UInt, lpdwdata: Long): BOOL =
    0

public actual fun InternalInternetGetCookie(lpszurl: PCSTR, lpszcookiedata: PSTR, lpdwdatasize: Long): UInt =
    0u

public actual fun InternetAlgIdToStringA(ai: ALG_ID, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetAlgIdToStringW(ai: ALG_ID, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetAttemptConnect(dwreserved: UInt): UInt =
    0u

public actual fun InternetAutodial(dwflags: INTERNET_AUTODIAL, hwndparent: HWND): BOOL =
    0

public actual fun InternetAutodialHangup(dwreserved: UInt): BOOL =
    0

public actual fun InternetCanonicalizeUrlA(lpszurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    0

public actual fun InternetCanonicalizeUrlW(lpszurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    0

public actual fun InternetCheckConnectionA(lpszurl: PCSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetCheckConnectionW(lpszurl: PCWSTR, dwflags: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetClearAllPerSiteCookieDecisions(): BOOL =
    0

public actual fun InternetCloseHandle(hinternet: Long): BOOL =
    0

public actual fun InternetCombineUrlA(lpszbaseurl: PCSTR, lpszrelativeurl: PCSTR, lpszbuffer: PSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    0

public actual fun InternetCombineUrlW(lpszbaseurl: PCWSTR, lpszrelativeurl: PCWSTR, lpszbuffer: PWSTR, lpdwbufferlength: Long, dwflags: UInt): BOOL =
    0

public actual fun InternetConfirmZoneCrossing(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    0u

public actual fun InternetConfirmZoneCrossingA(hwnd: HWND, szurlprev: PCSTR, szurlnew: PCSTR, bpost: BOOL): UInt =
    0u

public actual fun InternetConfirmZoneCrossingW(hwnd: HWND, szurlprev: PCWSTR, szurlnew: PCWSTR, bpost: BOOL): UInt =
    0u

public actual fun InternetConnectA(hinternet: Long, lpszservername: PCSTR, nserverport: UShort, lpszusername: PCSTR, lpszpassword: PCSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun InternetConnectW(hinternet: Long, lpszservername: PCWSTR, nserverport: UShort, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwservice: UInt, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun InternetConvertUrlFromWireToWideChar(pcszurl: PCSTR, cchurl: UInt, pcwszbaseurl: PCWSTR, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: BOOL, dwcodepageextra: UInt, ppwszconvertedurl: Long): UInt =
    0u

public actual fun InternetCrackUrlA(lpszurl: PCSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    0

public actual fun InternetCrackUrlW(lpszurl: PCWSTR, dwurllength: UInt, dwflags: WIN_HTTP_CREATE_URL_FLAGS, lpurlcomponents: Long): BOOL =
    0

public actual fun InternetCreateUrlA(lpurlcomponents: Long, dwflags: UInt, lpszurl: PSTR, lpdwurllength: Long): BOOL =
    0

public actual fun InternetCreateUrlW(lpurlcomponents: Long, dwflags: UInt, lpszurl: PWSTR, lpdwurllength: Long): BOOL =
    0

public actual fun InternetDial(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    0u

public actual fun InternetDialA(hwndparent: HWND, lpszconnectoid: PCSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    0u

public actual fun InternetDialW(hwndparent: HWND, lpszconnectoid: PCWSTR, dwflags: UInt, lpdwconnection: Long, dwreserved: UInt): UInt =
    0u

public actual fun InternetEnumPerSiteCookieDecisionA(pszsitename: PSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    0

public actual fun InternetEnumPerSiteCookieDecisionW(pszsitename: PWSTR, pcsitenamesize: Long, pdwdecision: Long, dwindex: UInt): BOOL =
    0

public actual fun InternetErrorDlg(hwnd: HWND, hrequest: Long, dwerror: UInt, dwflags: UInt, lppvdata: Long): UInt =
    0u

public actual fun InternetFindNextFileA(hfind: Long, lpvfinddata: Long): BOOL =
    0

public actual fun InternetFindNextFileW(hfind: Long, lpvfinddata: Long): BOOL =
    0

public actual fun InternetFortezzaCommand(dwcommand: UInt, hwnd: HWND, dwreserved: ULong): BOOL =
    0

public actual fun InternetFreeCookies(pcookies: Long, dwcookiecount: UInt) {
}

public actual fun InternetFreeProxyInfoList(pproxyinfolist: Long) {
}

public actual fun InternetGetConnectedState(lpdwflags: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetGetConnectedStateEx(lpdwflags: Long, lpszconnectionname: PSTR, dwnamelen: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetGetConnectedStateExA(lpdwflags: Long, lpszconnectionname: PSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetGetConnectedStateExW(lpdwflags: Long, lpszconnectionname: PWSTR, cchnamelen: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetGetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PSTR, lpdwsize: Long): BOOL =
    0

public actual fun InternetGetCookieEx2(pcwszurl: PCWSTR, pcwszcookiename: PCWSTR, dwflags: UInt, ppcookies: Long, pdwcookiecount: Long): UInt =
    0u

public actual fun InternetGetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    0

public actual fun InternetGetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, lpdwsize: Long, dwflags: INTERNET_COOKIE_FLAGS, lpreserved: Long): BOOL =
    0

public actual fun InternetGetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PWSTR, lpdwsize: Long): BOOL =
    0

public actual fun InternetGetLastResponseInfoA(lpdwerror: Long, lpszbuffer: PSTR, lpdwbufferlength: Long): BOOL =
    0

public actual fun InternetGetLastResponseInfoW(lpdwerror: Long, lpszbuffer: PWSTR, lpdwbufferlength: Long): BOOL =
    0

public actual fun InternetGetPerSiteCookieDecisionA(pchhostname: PCSTR, presult: Long): BOOL =
    0

public actual fun InternetGetPerSiteCookieDecisionW(pchhostname: PCWSTR, presult: Long): BOOL =
    0

public actual fun InternetGetProxyForUrl(hinternet: Long, pcwszurl: PCWSTR, pproxyinfolist: Long): UInt =
    0u

public actual fun InternetGetSecurityInfoByURL(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    0

public actual fun InternetGetSecurityInfoByURLA(lpszurl: PCSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    0

public actual fun InternetGetSecurityInfoByURLW(lpszurl: PCWSTR, ppcertchain: Long, pdwsecureflags: Long): BOOL =
    0

public actual fun InternetGoOnline(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    0

public actual fun InternetGoOnlineA(lpszurl: PCSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    0

public actual fun InternetGoOnlineW(lpszurl: PCWSTR, hwndparent: HWND, dwflags: UInt): BOOL =
    0

public actual fun InternetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    0u

public actual fun InternetInitializeAutoProxyDll(dwreserved: UInt): BOOL =
    0

public actual fun InternetLockRequestFile(hinternet: Long, lphlockrequestinfo: Long): BOOL =
    0

public actual fun InternetOpenA(lpszagent: PCSTR, dwaccesstype: UInt, lpszproxy: PCSTR, lpszproxybypass: PCSTR, dwflags: UInt): Long =
    0L

public actual fun InternetOpenUrlA(hinternet: Long, lpszurl: PCSTR, lpszheaders: PCSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun InternetOpenUrlW(hinternet: Long, lpszurl: PCWSTR, lpszheaders: PCWSTR, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): Long =
    0L

public actual fun InternetOpenW(lpszagent: PCWSTR, dwaccesstype: UInt, lpszproxy: PCWSTR, lpszproxybypass: PCWSTR, dwflags: UInt): Long =
    0L

public actual fun InternetQueryDataAvailable(hfile: Long, lpdwnumberofbytesavailable: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun InternetQueryFortezzaStatus(pdwstatus: Long, dwreserved: ULong): BOOL =
    0

public actual fun InternetQueryOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    0

public actual fun InternetQueryOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, lpdwbufferlength: Long): BOOL =
    0

public actual fun InternetReadFile(hfile: Long, lpbuffer: Long, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: Long): BOOL =
    0

public actual fun InternetReadFileExA(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun InternetReadFileExW(hfile: Long, lpbuffersout: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun InternetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: PSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: PWSTR, lpdwstrlength: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetSetCookieA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR): BOOL =
    0

public actual fun InternetSetCookieEx2(pcwszurl: PCWSTR, pcookie: Long, pcwszp3ppolicy: PCWSTR, dwflags: UInt, pdwcookiestate: Long): UInt =
    0u

public actual fun InternetSetCookieExA(lpszurl: PCSTR, lpszcookiename: PCSTR, lpszcookiedata: PCSTR, dwflags: UInt, dwreserved: ULong): UInt =
    0u

public actual fun InternetSetCookieExW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR, dwflags: UInt, dwreserved: ULong): UInt =
    0u

public actual fun InternetSetCookieW(lpszurl: PCWSTR, lpszcookiename: PCWSTR, lpszcookiedata: PCWSTR): BOOL =
    0

public actual fun InternetSetDialState(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetSetDialStateA(lpszconnectoid: PCSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetSetDialStateW(lpszconnectoid: PCWSTR, dwstate: UInt, dwreserved: UInt): BOOL =
    0

public actual fun InternetSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: UInt, dwcontext: ULong): UInt =
    0u

public actual fun InternetSetOptionA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    0

public actual fun InternetSetOptionExA(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    0

public actual fun InternetSetOptionExW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt, dwflags: UInt): BOOL =
    0

public actual fun InternetSetOptionW(hinternet: Long, dwoption: UInt, lpbuffer: Long, dwbufferlength: UInt): BOOL =
    0

public actual fun InternetSetPerSiteCookieDecisionA(pchhostname: PCSTR, dwdecision: UInt): BOOL =
    0

public actual fun InternetSetPerSiteCookieDecisionW(pchhostname: PCWSTR, dwdecision: UInt): BOOL =
    0

public actual fun InternetSetStatusCallback(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    null

public actual fun InternetSetStatusCallbackA(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    null

public actual fun InternetSetStatusCallbackW(hinternet: Long, lpfninternetcallback: LPINTERNET_STATUS_CALLBACK): LPINTERNET_STATUS_CALLBACK =
    null

public actual fun InternetShowSecurityInfoByURL(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    0

public actual fun InternetShowSecurityInfoByURLA(lpszurl: PCSTR, hwndparent: HWND): BOOL =
    0

public actual fun InternetShowSecurityInfoByURLW(lpszurl: PCWSTR, hwndparent: HWND): BOOL =
    0

public actual fun InternetTimeFromSystemTime(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    0

public actual fun InternetTimeFromSystemTimeA(pst: Long, dwrfc: UInt, lpsztime: PSTR, cbtime: UInt): BOOL =
    0

public actual fun InternetTimeFromSystemTimeW(pst: Long, dwrfc: UInt, lpsztime: PWSTR, cbtime: UInt): BOOL =
    0

public actual fun InternetTimeToSystemTime(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetTimeToSystemTimeA(lpsztime: PCSTR, pst: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetTimeToSystemTimeW(lpsztime: PCWSTR, pst: Long, dwreserved: UInt): BOOL =
    0

public actual fun InternetUnlockRequestFile(hlockrequestinfo: HANDLE): BOOL =
    0

public actual fun InternetWriteFile(hfile: Long, lpbuffer: Long, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: Long): BOOL =
    0

public actual fun InternetWriteFileExA(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun InternetWriteFileExW(hfile: Long, lpbuffersin: Long, dwflags: UInt, dwcontext: ULong): BOOL =
    0

public actual fun IsDomainLegalCookieDomainA(pchdomain: PCSTR, pchfulldomain: PCSTR): BOOL =
    0

public actual fun IsDomainLegalCookieDomainW(pchdomain: PCWSTR, pchfulldomain: PCWSTR): BOOL =
    0

public actual fun IsHostInProxyBypassList(tscheme: INTERNET_SCHEME, lpszhost: PCSTR, cchhost: UInt): BOOL =
    0

public actual fun IsProfilesEnabled(): BOOL =
    0

public actual fun IsUrlCacheEntryExpiredA(lpszurlname: PCSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    0

public actual fun IsUrlCacheEntryExpiredW(lpszurlname: PCWSTR, dwflags: UInt, pftlastmodified: Long): BOOL =
    0

public actual fun LoadUrlCacheContent(): BOOL =
    0

public actual fun ParseX509EncodedCertificateForListBoxEntry(lpcert: Long, cbcert: UInt, lpszlistboxentry: PSTR, lpdwlistboxentry: Long): UInt =
    0u

public actual fun PerformOperationOverUrlCacheA(pszurlsearchpattern: PCSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: Long, pdwreserved2: Long, preserved3: Long, op: CACHE_OPERATOR, poperatordata: Long): BOOL =
    0

public actual fun PrivacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: Long, pszbuffer: PWSTR, pdwbufferlength: Long): UInt =
    0u

public actual fun PrivacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: PCWSTR): UInt =
    0u

public actual fun ReadGuidsForConnectedNetworks(pcnetworks: Long, pppwsznetworkguids: Long, pppbstrnetworknames: Long, pppwszgwmacs: Long, pcgatewaymacs: Long, pdwflags: Long): BOOL =
    0

public actual fun ReadUrlCacheEntryStream(hurlcachestream: HANDLE, dwlocation: UInt, lpbuffer: Long, lpdwlen: Long, reserved: UInt): BOOL =
    0

public actual fun ReadUrlCacheEntryStreamEx(hurlcachestream: HANDLE, qwlocation: ULong, lpbuffer: Long, lpdwlen: Long): BOOL =
    0

public actual fun RegisterUrlCacheNotification(hwnd: HWND, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): BOOL =
    0

public actual fun ResumeSuspendedDownload(hrequest: Long, dwresultcode: UInt): BOOL =
    0

public actual fun RetrieveUrlCacheEntryFileA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    0

public actual fun RetrieveUrlCacheEntryFileW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, dwreserved: UInt): BOOL =
    0

public actual fun RetrieveUrlCacheEntryStreamA(lpszurlname: PCSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    0L

public actual fun RetrieveUrlCacheEntryStreamW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, lpcbcacheentryinfo: Long, frandomread: BOOL, dwreserved: UInt): HANDLE =
    0L

public actual fun RunOnceUrlCache(hwnd: HWND, hinst: HINSTANCE, lpszcmd: PCSTR, ncmdshow: Int): UInt =
    0u

public actual fun SetUrlCacheConfigInfoA(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    0

public actual fun SetUrlCacheConfigInfoW(lpcacheconfiginfo: Long, dwfieldcontrol: UInt): BOOL =
    0

public actual fun SetUrlCacheEntryGroup(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    0

public actual fun SetUrlCacheEntryGroupA(lpszurlname: PCSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    0

public actual fun SetUrlCacheEntryGroupW(lpszurlname: PCWSTR, dwflags: UInt, groupid: Long, pbgroupattributes: Long, cbgroupattributes: UInt, lpreserved: Long): BOOL =
    0

public actual fun SetUrlCacheEntryInfoA(lpszurlname: PCSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    0

public actual fun SetUrlCacheEntryInfoW(lpszurlname: PCWSTR, lpcacheentryinfo: Long, dwfieldcontrol: UInt): BOOL =
    0

public actual fun SetUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    0

public actual fun SetUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: Long, lpreserved: Long): BOOL =
    0

public actual fun SetUrlCacheHeaderData(nidx: UInt, dwdata: UInt): BOOL =
    0

public actual fun ShowClientAuthCerts(hwndparent: HWND): UInt =
    0u

public actual fun ShowSecurityInfo(hwndparent: HWND, psecurityinfo: Long): UInt =
    0u

public actual fun ShowX509EncodedCertificate(hwndparent: HWND, lpcert: Long, cbcert: UInt): UInt =
    0u

public actual fun UnlockUrlCacheEntryFile(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    0

public actual fun UnlockUrlCacheEntryFileA(lpszurlname: PCSTR, dwreserved: UInt): BOOL =
    0

public actual fun UnlockUrlCacheEntryFileW(lpszurlname: PCWSTR, dwreserved: UInt): BOOL =
    0

public actual fun UnlockUrlCacheEntryStream(hurlcachestream: HANDLE, reserved: UInt): BOOL =
    0

public actual fun UpdateUrlCacheContentPath(sznewpath: PCSTR): BOOL =
    0

public actual fun UrlCacheCheckEntriesExist(rgpwszurls: Long, centries: UInt, rgfexist: Long): UInt =
    0u

public actual fun UrlCacheCloseEntryHandle(hentryfile: Long) {
}

public actual fun UrlCacheContainerSetEntryMaximumAge(pwszprefix: PCWSTR, dwentrymaxage: UInt): UInt =
    0u

public actual fun UrlCacheCreateContainer(pwszname: PCWSTR, pwszprefix: PCWSTR, pwszdirectory: PCWSTR, ulllimit: ULong, dwoptions: UInt): UInt =
    0u

public actual fun UrlCacheFindFirstEntry(pwszprefix: PCWSTR, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: Long, phfind: Long): UInt =
    0u

public actual fun UrlCacheFindNextEntry(hfind: HANDLE, pcacheentryinfo: Long): UInt =
    0u

public actual fun UrlCacheFreeEntryInfo(pcacheentryinfo: Long) {
}

public actual fun UrlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    0u

public actual fun UrlCacheGetContentPaths(pppwszdirectories: Long, pcdirectories: Long): UInt =
    0u

public actual fun UrlCacheGetEntryInfo(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long): UInt =
    0u

public actual fun UrlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: Long, pulllimit: Long): UInt =
    0u

public actual fun UrlCacheGetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, pulllimit: Long): UInt =
    0u

public actual fun UrlCacheReadEntryStream(hurlcachestream: Long, ulllocation: ULong, pbuffer: Long, dwbufferlen: UInt, pdwbufferlen: Long): UInt =
    0u

public actual fun UrlCacheReloadSettings(): UInt =
    0u

public actual fun UrlCacheRetrieveEntryFile(happcache: Long, pcwszurl: PCWSTR, pcacheentryinfo: Long, phentryfile: Long): UInt =
    0u

public actual fun UrlCacheRetrieveEntryStream(happcache: Long, pcwszurl: PCWSTR, frandomread: BOOL, pcacheentryinfo: Long, phentrystream: Long): UInt =
    0u

public actual fun UrlCacheServer(): UInt =
    0u

public actual fun UrlCacheSetGlobalLimit(limittype: URL_CACHE_LIMIT_TYPE, ulllimit: ULong): UInt =
    0u

public actual fun UrlCacheUpdateEntryExtraData(happcache: Long, pcwszurl: PCWSTR, pbextradata: Long, cbextradata: UInt): UInt =
    0u
